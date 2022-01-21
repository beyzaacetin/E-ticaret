package Business.Concretes;

import Business.Abstracts.IUserCheckService;
import Business.Abstracts.IUserService;
import Business.Abstracts.IVerificationService;
import DataAccess.Abstract.IUserDao;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements IUserService {

    private IUserCheckService userCheckService;
    private IVerificationService verificationService;
    private IUserDao userDao;
    List<User> userList = new ArrayList<>();

    public UserManager(IUserCheckService userCheckService, IVerificationService verificationService, IUserDao userDao) {
        this.userCheckService = userCheckService;
        this.verificationService = verificationService;
        this.userDao = userDao;

    }

    @Override
    public void register(User user) {
        if(userCheckService.isValid(user)){
            verificationService.sendToVerifyMail(user.geteMail());
            userDao.add(user);
            System.out.println(user.getFirstName() + " kullanıcısı başarı ile eklendi!");
            userList.add(user);
            verificationService.verifyMail(user.geteMail());

        }


    }


    @Override
    public void login(User user, String email, String password) {
        if (user.geteMail() == email && user.getPassword() == password){
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Giriş başarısız");
        }
    }


}
