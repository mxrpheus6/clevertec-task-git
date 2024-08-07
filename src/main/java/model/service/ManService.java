package model.service;

import model.Cat;
import model.Man;

public class ManService {
    public void work(Man man) {
        System.out.println("Working...");
    }

    public void rest(Man man) {
        System.out.println("Rest : )");
    }

    public void eat(Man man) {
        System.out.println("Eating : )))))))");
    }

    public void petCat(Man man, Cat cat) {
        System.out.println(" - Hello little friend!\n - Meow!");
    }
}
