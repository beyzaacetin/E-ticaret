package DataAccess.Abstract;

import Entities.Concretes.User;

public interface IUserDao {
    void  add(User user);
    void update(User user);
    void  delete(User user);
    boolean getEmail(String email);
    boolean getPassword(String password);
}
