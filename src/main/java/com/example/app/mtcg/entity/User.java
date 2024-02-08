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



    public User(String un, String pw) {
        String salt = BCrypt.gensalt();
        this.un = un;
        this.pw = BCrypt.hashpw(pw,salt);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public Vector<Card> getUserCards() {
        return userCards;
    }

    public void setUserCards(Vector<Card> userCards) {
        this.userCards = userCards;
    }

    public Deck getUserDeck() {
        return userDeck;
    }

    public void setUserDeck(Deck userDeck) {
        this.userDeck = userDeck;
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
