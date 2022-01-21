package DataAccess.Concretes;

import DataAccess.Abstract.IUserDao;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements IUserDao {

    List<User> users = new ArrayList<User>();

    @Override
    public void add(User user) {
        System.out.println("Hibernate tarafından eklendi : " + user.getFirstName() + user.getLastName());
    }


    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public boolean getEmail(String email) {
        for (User user : users){
            if (user.geteMail() == email){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getPassword(String password) {
        for (User user : users){
            if (user.getPassword() == password){
                return true;
            }
        }
        return false;
    }
}
