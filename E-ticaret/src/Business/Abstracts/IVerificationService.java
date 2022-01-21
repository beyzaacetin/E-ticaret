package Business.Abstracts;

import Entities.Concretes.User;

public interface IVerificationService {
    void sendToVerifyMail(String email);
    void verifyMail(String email);
    boolean checkVerifyAccount(String email);

}
