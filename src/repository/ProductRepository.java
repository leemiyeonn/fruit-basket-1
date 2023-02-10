package repository;

import product.Apple;
import product.Fruit;
import product.Grape;
import product.Mango;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductRepository {

    ArrayList<Fruit> fruits = new ArrayList<>(
            Arrays.asList(
                    new Apple(1, "apple","red",1000),
                    new Grape(2, "grape","purple",2000),
                    new Mango(3, "mango","yellow",3000)
            )
    );

    public Fruit findbyId (int productId){

        for (Fruit fruit : fruits) {
            if (fruit.getId() == productId) return fruit;
        }

        return null;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }
}
