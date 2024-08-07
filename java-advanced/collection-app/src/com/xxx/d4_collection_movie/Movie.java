package com.xxx.d4_collection_movie;

import java.util.List;

public class Movie {
    private String name;
    private double score;
    private List<String> actors;

    public Movie(String name, double score, List<String> actors) {
        this.name = name;
        this.score = score;
        this.actors = actors;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actors=" + actors +
                '}';
    }
}
