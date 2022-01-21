package Business.Concretes;

import Business.Abstracts.IVerificationService;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class EmailVerify implements IVerificationService {

    List<String> verificatedEmail = new ArrayList<>();

    @Override
    public void sendToVerifyMail(String email) {
        System.out.println(email + " kullanıcısına doğrulama maili gönderildi.");
    }

    @Override
    public void verifyMail(String email) {
        verificatedEmail.add(email);
        System.out.println(email + " başarıyla doğruladnı");
    }

    @Override
    public boolean checkVerifyAccount(String email) {
        if (verificatedEmail.contains(email)){
            return true;
        }
        return false;
    }
}
