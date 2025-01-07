package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {
    //private final Connection connection = Util.getConnection();
    /*private final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS user" +
            "(id INT AUTO_INCREMENT PRIMARY KEY, " +
            "name VARCHAR(15), " +
            "last_name VARCHAR(15), " +
            "age INT)";
    private final String DROP_TABLE = "DROP TABLE IF EXISTS user";
    private final String SAVE_USER = "INSERT user(name, last_name, age) VALUES(?, ?, ?)";
    private final String REMOVE_USER_BY_ID = "DELETE FROM user WHERE id = ?";
    private final String GET_ALL_USERS = "SELECT * FROM user";
    private final String CLEAN_USERS_TABLE = "TRUNCATE TABLE user";




    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_QUERY);
            connection.commit();
            System.out.println("Таблица успешно создана");

        } catch (SQLException e) {
            System.out.println("Таблица не создана");
            throw new RuntimeException(e);
        }
    }

    public void dropUsersTable() {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(DROP_TABLE);
            connection.commit();
            System.out.println("Таблица успешно удалена");

        } catch (SQLException e) {
            System.out.println("Таблица не удалена!" + e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public void saveUser(String name, String lastName, byte age) {
        try (PreparedStatement statement = connection.prepareStatement(SAVE_USER)) {
            statement.setString(1, name);
            statement.setString(2, lastName);
            statement.setByte(3, age);

            statement.executeUpdate();
            connection.commit();

            System.out.println("User с именем - " + name + " добавлен в базу данных");

        } catch (SQLException e) {
            System.out.println("Method saveUser Error");
            throw new RuntimeException(e);
        }
    }

    public void removeUserById(long id) {
        try (PreparedStatement statement = connection.prepareStatement(REMOVE_USER_BY_ID)) {
            statement.setLong(1, id);
            statement.executeUpdate();
            connection.commit();
            System.out.println("User DELETE");

        } catch (SQLException e) {
            System.out.println("EXCEPTION" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ALL_USERS);
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setAge(resultSet.getByte("age"));
                userList.add(user);
                connection.commit();
            }
        } catch (SQLException e) {
            System.out.println("Метод getAllUsers выбросил ошибку");
            throw new RuntimeException(e);
        }
        return userList;
    }

    public void cleanUsersTable() {
        try (PreparedStatement statement = connection.prepareStatement(CLEAN_USERS_TABLE)) {
            statement.executeUpdate();
            connection.commit();
            System.out.println("Таблица успешно очищена");

        } catch (SQLException e) {
            System.out.println("NOT CLEAN");
            throw new RuntimeException(e);
        }
    }*/
//}
