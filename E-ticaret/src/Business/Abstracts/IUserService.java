package Business.Abstracts;

import Entities.Concretes.User;

public interface IUserService {
    void register(User user);
    void login(User user,String email, String password);
}
