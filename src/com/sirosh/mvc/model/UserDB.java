package com.sirosh.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Illya on 19.01.17.
 */
public class UserDB {

    private static List<User> users;

    private UserDB(){
        users = new ArrayList<User>();
        users.add(User.user);
    }

    private static class pUserDB{

        static UserDB instance = new UserDB();

    }



    public static UserDB getInstance(){
        return pUserDB.instance;
    }

    public boolean isCorrect(String login, String password){

        for(User x:users)
            if(x.identify(login,password))
                return true;

        return false;
    }

    public User getUser(String login, String password){


        for(User x:users)
            if(x.identify(login,password))
                return x;

        return null;
    }
}