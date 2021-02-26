package com.example.dao;

import com.example.models.Employees;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Component
public class EmployeeDAO {
    private static int PEOPLE_COUNT;

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Employees> index() {
        List<Employees> people = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(SQL);

            while(resultSet.next()) {
                Employees em = new Employees();

                em.setId(resultSet.getInt("id"));
                em.setName(resultSet.getString("name"));
                em.setEmail(resultSet.getString("email"));
                em.setAge(resultSet.getInt("age"));

                people.add(em);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return people;
    }


    public void save(Employees person) {
        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO Person VALUES(" + 1 + ",'" + person.getName() +
                    "'," + person.getAge() + ",'" + person.getEmail() + "')";

            statement.executeUpdate(SQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private ApplicationEventPublisher eventPublisher;

    public void create(Employees employees) {

        System.out.println("employess = " + employees);

        //TODO create user in db

        this.eventPublisher.publishEvent(new EmployesCreateEvent(this, employees));
    }

    public void update(Long id, Employees employees) {
        System.out.println("UserDao.update");
    }

    public void delete(Long id) {
        System.out.println("UserDao.delete id: " + id);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
}
