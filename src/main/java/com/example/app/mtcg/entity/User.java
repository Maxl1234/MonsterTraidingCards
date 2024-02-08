package com.example.app.mtcg.entity;

import org.mindrot.jbcrypt.BCrypt;

import java.util.Vector;

public class User {
    private int id;
    private int currency = 20;
    private String un;
    private String pw;
    private String authToken;
    private Vector<Card> userCards;
    private Deck userDeck;

// getter und setter !!!



    public User(String un, String pw) {
        String salt = BCrypt.gensalt();
        this.un = un;
        this.pw = BCrypt.hashpw(pw,salt);
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
