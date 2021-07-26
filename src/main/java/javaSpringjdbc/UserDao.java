package javaSpringjdbc;

import java.util.List;

import javaSpringjdbc.Entity.User;

public interface UserDao {
       public int insert(User user);
       public int update(User user);
       public int delete(User user);
       public User getUser(int userId);
       public List<User> listUser();
}
