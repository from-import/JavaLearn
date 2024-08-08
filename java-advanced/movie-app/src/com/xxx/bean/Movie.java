package com.xxx.bean;

import java.util.Date;

public class Movie {
    private String name;
    private String actor;
    private double score;
    private double time;
    private int number;
    private double price;
    private Date startTime;

    public Movie() {
    }

    public Movie(String name, String actor, double score, double time, int number, double price, Date startTime) {
        this.name = name;
        this.actor = actor;
        this.score = score;
        this.time = time;
        this.number = number;
        this.price = price;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", score=" + score +
                ", time=" + time +
                ", number=" + number +
                ", price=" + price +
                ", startTime=" + startTime +
                '}';
    }
}
