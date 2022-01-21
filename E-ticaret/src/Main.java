import Business.Abstracts.IUserCheckService;
import Business.Concretes.EmailVerify;
import Business.Concretes.UserCheckManager;
import Business.Concretes.UserManager;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;

public class Main {
    public static void main(String[] args){
        User user1 = new User("Beyza","Çetin","beyzahm@gmail.com","123456");

        UserManager userManager = new UserManager(new UserCheckManager(),new EmailVerify(), new HibernateUserDao());

        userManager.register(user1);


    }
}
