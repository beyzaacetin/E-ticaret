package Business.Concretes;

import Business.Abstracts.IUserCheckService;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckManager implements IUserCheckService {

    List<String> listOfEmail = new ArrayList<>();

    @Override
    public boolean checkFirstName(User user) {
        if(user.getFirstName().isEmpty()){
            System.out.println("İsim alanı boş olamaz!");
        }
        else {
            if (user.getFirstName().length() < 2){
                System.out.println("İsim 3 harften az olamaz! ");
            }
            return false;
        }
        return true;
    }

    @Override
    public boolean checkLastName(User user) {
        if (user.getLastName().isEmpty()) {
            System.out.println("Soyisim alanı boş olamaz!");
            return false;
        } else {
            if (user.getLastName().length() < 2) {
                System.out.println("Soyisim 3 harften az olamaz ");
            }
            return true;

        }
    }

    @Override
    public boolean checkEmail(User user) {
        Pattern regexEmail = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        Matcher matcher = regexEmail.matcher(user.geteMail());

        if (matcher.matches()){
            System.out.println("Email formatında giriş yapıldı.");
            return true;
        }
        else {
            System.out.println("Email uygun değildir.");
            return false;
        }

    }

    @Override
    public boolean checkPassword(User user) {
        if (user.getPassword().length() > 6){
            System.out.println("Şifre : UYGUN");
            return  true;
        }
        else {
            System.out.println("Şifre en az 7 karakterden oluşmalı");
        }
        return false;
    }

    @Override
    public boolean uniqueMail(User user) {
        return false;
    }

    @Override
    public boolean isValid(User user) {
        return false;
    }
}
