package com.example.team.service;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/16 20:50
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -1;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
