package Business.Abstracts;

import Entities.Concretes.User;

public interface IUserCheckService {
    boolean checkFirstName(User user);
    boolean checkLastName(User user);
    boolean checkEmail(User user);
    boolean checkPassword(User user);
    boolean uniqueMail(User user);
    boolean isValid(User user);
}
