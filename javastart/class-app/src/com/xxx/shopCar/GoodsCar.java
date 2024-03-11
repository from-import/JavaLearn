package com.xxx.shopCar;

public class GoodsCar {
    public static void main(String[] args) {
        Goods[] GoodsCar = new Goods[100];
        addGoods(GoodsCar, "apple", 5, 1); // 添加苹果
        addGoods(GoodsCar, "banana", 5, 1); // 添加香蕉

        query(GoodsCar); // 查询购物车

        changeGoods(GoodsCar, "apple", 3); // 修改购物车中苹果的数量

        query(GoodsCar); // 再次查询购物车

        pay(GoodsCar); // 结算购物车
    }

    // 添加商品到购物车
    public static void addGoods(Goods[] targetGoodsCar, String name, double price, int number) {
        int currentQuantity = targetGoodsCar.length;
        if (targetGoodsCar[99] != null) { // 如果购物车已满
            System.out.println("\n购物车已满。");
        } else {
            int placeNumber = 0;
            // 查找购物车中的第一个空位
            for (int i = 0; i < currentQuantity; i++) {
                if (targetGoodsCar[i] == null) {
                    placeNumber = i;
                    break; // 找到第一个空位后立即退出循环
                }
            }

            // 创建新的商品对象
            Goods newGoods = new Goods();
            newGoods.name = name;
            newGoods.price = price;
            newGoods.buyNumber = number;
            // 将新商品放入购物车
            targetGoodsCar[placeNumber] = newGoods;
            System.out.println(name + " 已添加");
        }
    }

    // 查询购物车中的商品
    public static void query(Goods[] targetGoodsCar) {
        for (Goods good : targetGoodsCar) {
            if (good != null) {
                System.out.print(good.name + " x " + good.buyNumber + "，");
            } else {
                System.out.println(" ");
                break;
            }
        }
    }

    // 修改购物车中商品的数量
    public static void changeGoods(Goods[] targetGoodsCar, String name, int number) {
        // 遍历购物车
        for (int i = 0; i < targetGoodsCar.length; i++) {
            // 如果找到目标商品
            if (targetGoodsCar[i] != null && targetGoodsCar[i].name.equals(name)) {
                targetGoodsCar[i].buyNumber += number; // 增加商品数量
                break; // 找到第一个目标商品后立即退出循环
            }
        }
        System.out.println("成功添加");
    }

    // 结算购物车
    public static void pay(Goods[] targetGoodsCar) {
        int sumPayment = 0;
        // 遍历购物车
        for (Goods good : targetGoodsCar) {
            if (good != null) {
                sumPayment += good.buyNumber * good.price; // 计算总付款金额
            } else {
                System.out.println("总付款金额为 " + sumPayment);
                break;
            }
        }
    }
}
