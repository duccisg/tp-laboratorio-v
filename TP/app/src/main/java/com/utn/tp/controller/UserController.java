package com.utn.tp.controller;

import com.utn.tp.model.User;

/**
 * Created by sebastian.g.ducci on 10/16/2016.
 */
public class UserController {

    private static UserController instance;

    private UserController(){
    }


    public static UserController getUserController(){

        if(instance == null){
            instance = new UserController();
        }

        return instance;

    }
}
