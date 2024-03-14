package com.xxx.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        Scanner sc = new Scanner(System.in);
        accounts.add(new Account("123","123",123,"123",123));
        accounts.add(new Account("1234","1234",1234,"1234",1234));

        while (true) {
            System.out.println("\n-------------ATM System--------------");
            System.out.println("1.Register 2.Login 3.Quit\nYour choice:");
            int choice = sc.nextInt();

            if (choice == 1) {
                // Register
                System.out.print("Name:");
                String name = sc.next();
                System.out.print("Password:");
                String password = sc.next();
                System.out.print("quota:");
                double quota = sc.nextDouble();

                String realNumber = RegisterMethod.register(accounts, password, name, quota);
                System.out.println("Success");
                ReadAccount.readAccount(accounts, realNumber);
            } else if (choice == 2) {
                // Login
                System.out.print("Number:");
                String number = sc.next();
                System.out.print("Password:");
                String password = sc.next();
                Account account = Login.login(accounts, number, password);
                if(account == null){break;}

                while(true){
                    System.out.println("\n------User System------\n");
                    System.out.println("User" + account.getNumber() + ", Your money is:" + account.getMoney() +"\n");
                    System.out.println("1.Put money in\n2.Get money out\n3.Transfer money\n4.Change password\n5.Delete account\n6.Log out");
                    System.out.print("Your Choice:");
                    choice = sc.nextInt();
                        if(choice == 1){
                            // Put money in
                            System.out.print("Money your want to put in:");
                            double money = sc.nextDouble();
                            account.setMoney(account.getMoney() + money);
                            System.out.println("Your Money now is " + account.getMoney());
                        }
                        if(choice == 2) {
                            // Get money out
                            System.out.print("Money your want to get out:");
                            double money = sc.nextDouble();
                            double resMoney = account.getMoney() - money;

                            if(money > account.getQuotaMoney()){
                                System.out.println("out of moneyQuota");
                            }
                            else if (resMoney > 0) {
                                account.setMoney(resMoney);
                            } else {
                                System.out.println("You don't have so much!");
                            }
                        }
                        if(choice == 3){
                            boolean found = false;
                            System.out.print("Who you want to transfer to:");
                            String transNumber = sc.next();
                            System.out.print("How much you want to transfer to:");
                            Double transMoney = sc.nextDouble();
                            if (transMoney > account.getMoney() || transMoney > account.getQuotaMoney()){
                                System.out.println("You can't transfer so much");
                            }

                            for(Account transAccount : accounts){
                                if (transAccount.getNumber().equals(transNumber)) {
                                    transAccount.setMoney(transAccount.getMoney() + transMoney);
                                    account.setMoney(account.getMoney() - transMoney);
                                    System.out.print("Transfer Successfully, ");
                                    System.out.println("Account" + transNumber + "is " + transAccount.getMoney());
                                    found = true;
                                    break;
                                }
                                }
                            if(!found){
                                System.out.println("No account was found");
                            }
                            // Transfer money
                    }
                        if(choice == 4){
                            // Change password
                            System.out.print("The old password:");
                            String oldPassword = sc.next();
                            if(oldPassword.equals(account.getPassword())){
                            System.out.println("The new password");
                            String newPassword = sc.next();
                            account.setPassword(newPassword);}
                            else{
                                System.out.println("Error password");
                            }

                        }
                        if(choice == 5){
                            // Delete account
                            accounts.remove(account);
                            break;
                        }

                        if(choice == 6){
                            // Log out
                            break;
                        }
                        }

            } else {
                break;
            }
        }
    }
}