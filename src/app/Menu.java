package app;

import product.Fruit;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
    ArrayList<Fruit> fruits;

    Iterator<Fruit> iterator;

    public Menu(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }


    public void printMenu() {
            System.out.println("[🔻] 메뉴");
            System.out.println("-".repeat(60));

            iterator = fruits.iterator();
            while (iterator.hasNext()){
                Fruit fruit = iterator.next();
                System.out.printf(
                        "   (%d) %s %s %5d원\n",
                        fruit.getId(), fruit.getName(), fruit.getColor(), fruit.getPrice());

            }
            System.out.println();

            System.out.println("🧺 (0) 장바구니");
            System.out.println("📦 (+) 주문하기");
            System.out.println("-".repeat(60));
            System.out.print("[📣] 메뉴를 선택해주세요 : ");
    }


    }


