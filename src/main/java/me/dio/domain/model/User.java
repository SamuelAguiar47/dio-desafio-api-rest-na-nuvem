package me.dio.domain.model;

import java.util.List;

public class User {
    //Atributos
    private Long id;
    private String name;
    private Account account;
    private List<Feature> features;
    private Card card;
    private List<News> news;
    
    //Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Feature[] getFeatures() {
        return features;
    }
    public void setFeatures(Feature[] features) {
        this.features = features;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public News[] getNews() {
        return news;
    }
    public void setNews(News[] news) {
        this.news = news;
    }   
}
