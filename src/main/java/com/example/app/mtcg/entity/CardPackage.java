package com.example.app.mtcg.entity;

import java.util.ArrayList;

public class CardPackage {
    private final ArrayList<Card> cardPack = new ArrayList<>(5);
    private int id;

    public CardPackage() {

    }

    public void addCards(ArrayList<Card> addCards){
        for(Card c:addCards){
            if(cardPack.size() < 5){
                cardPack.add(c);
            }
            else{
                System.err.println("Card Pack full");
            }
        }

    }

    public ArrayList<Card> getCardPack() {
        return cardPack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
