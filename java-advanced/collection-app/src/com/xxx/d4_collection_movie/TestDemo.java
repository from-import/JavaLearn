package com.xxx.d4_collection_movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("movie1", 6.5, Arrays.asList("actor1", "actor2")));
        movies.add(new Movie("movie2", 8.0, Arrays.asList("actor3", "actor4")));
        movies.add(new Movie("movie3", 9.5, Arrays.asList("actor5", "actor6")));

        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }

        // 使用 Lambda 表达式修改评分
        movies.forEach(movie -> movie.setScore(movie.getScore() + 1));

        // 打印更新后的电影信息
        movies.forEach(movie -> System.out.println(movie));
    }
}

