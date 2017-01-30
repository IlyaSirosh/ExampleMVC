package com.sirosh.mvc.model;

/**
 * Created by Illya on 30.01.17.
 */
public class User {

    private static final String login = "login";
    private static final String password = "pass";

    public static User user = new User();

    public static boolean identify(String login, String password){
        return User.login.equals(login) && User.password.equals(password);
    }


    public static String getLogin(){
        return login;
    }

}
