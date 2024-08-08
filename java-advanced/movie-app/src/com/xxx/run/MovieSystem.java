package com.xxx.run;

import com.xxx.bean.Business;
import com.xxx.bean.Customer;
import com.xxx.bean.Movie;
import com.xxx.bean.User;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {

    // 0. 基本初始化
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    // 1. 存储用户
    public static List<User> allUser = new ArrayList<>();

    // 2. 存储商家(排片)信息
    public static Map<Business, List<Movie>> allBusiness = new HashMap<>();

    // 3. 创建测试数据
    static {
        // public User(String loginName, String trueName, String sex, String account, String password, String phone, double money) {
        Customer c1 = new Customer("ha", "Wang", "Male", "ha", "123456", "183123456", 10.0);
        Customer c2 = new Customer("pi", "Song", "Male", "pi66", "123456", "666666", 1000.0);

        allUser.add(c1);
        allUser.add(c2);

        Business b1 = new Business("pi", "Song", "Male", "pi", "123456", "2857278", 10000.0, "Cho", "巧克力大街");
        List<Movie> movie1 = new ArrayList<>();

        Business b2 = new Business("pi222", "Wang", "Male", "pi222", "123456", "7585757", 100000.0, "feeffefe", "whereis");
        List<Movie> movie2 = new ArrayList<>();


        allUser.add(b1);
        allUser.add(b2);

        allBusiness.put(b1, movie1);
        allBusiness.put(b2, movie2);

        System.out.println("System is ready"); // Logger

    }


    public static void main(String[] args) {
        showMain(); // 首页展示

    }

    public static final Scanner scanner = new Scanner(System.in);

    private static void showMain() {
        System.out.println("------Movies------");
        System.out.println("1. login");
        System.out.println("2. Customer register");
        System.out.println("3. Business register");
        System.out.println("4. quit");

        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    private static void login() {
        System.out.println("account:");
        String account = scanner.nextLine();
        System.out.println("password:");
        String password = scanner.nextLine();

        User user = getUserByAccount(account);
        if (user == null) {
            System.out.println("account not found");
        } else {
            if (password.equals(user.getPassword())) {
                if (user instanceof Customer) {
                    System.out.println("Customer login Successful");
                    showCustomerMain(user);
                } else {
                    System.out.println("Business login Successful");
                    showBusinessMain(user);

                }
            } else {
                System.out.println("password incorrect");
            }
        }


    }

    public static User getUserByAccount(String account) {
        for (User user : allUser) {
            if (user.getAccount().equals(account)) {
                return user;
            }
        }
        return null;
    }

    public static void showCustomerMain(User customer) {
        while (true) {
            System.out.println("--------Customer--------");
            System.out.println("1. show all movie");
            System.out.println("2. show movie details");
            System.out.println("3. set movie score");
            System.out.println("4. buy movie ticket");
            System.out.println("5. quit");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    allBusiness.forEach((k, v) -> {
                        System.out.println(k.getShopName());
                        for(Movie movie : v){
                            System.out.println(movie.getName());
                        }
                    });
                case "2":
                    allBusiness.forEach((k, v) -> {
                        for(Movie movie : v){
                            if(movie.getName().equals("chose movie")){
                                System.out.println(movie.getStartTime());
                            }
                        }
                    });
                case "3":
                case "4":
                case "5":

            }

        }

    }

    public static void showBusinessMain(User business) {
        while (true) {
            System.out.println("--------Business--------");
            System.out.println("welcome " + business.getTrueName());
            System.out.println("1. show details");
            System.out.println("2. upload movie");
            System.out.println("3. download movie");
            System.out.println("4. config movie");
            System.out.println("5. quit");
            String command = scanner.nextLine();
            List<Movie> movies = allBusiness.get(business);
            switch (command) {
                case "1":
                    // allBusiness.put(b1, movie1);
                    // allBusiness.forEach((k, v) -> {System.out.println(k + " " + v);});

                    if (movies.size() >0){
                        for (Movie movie : movies) {
                            System.out.println(movie.getName() + sdf.format(movie.getStartTime()));
                        }
                    }
                    else{
                        System.out.println("no movies found");
                    }
                    break;
                case "2":
                    Movie movie = new Movie();
                    movies.add(movie);
                    System.out.println("movie added");
                    break;


                case "3":
                    for(Movie m : movies){
                        if (m.getName().equals("delete movie")){
                            movies.remove(m);
                        }
                    }
                    break;

                case "4":
                    System.out.println("no");
                    break;

                case "5":
                    return;

            }

        }
    }
}
