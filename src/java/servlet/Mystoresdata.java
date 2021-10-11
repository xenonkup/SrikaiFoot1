/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.util.HashMap;
import java.util.Map;
import models.Mystores;

public class Mystoresdata {

    final private Map<String, Mystores> mystores = new HashMap<>();
    final private static Mystoresdata instance = new Mystoresdata();

    Mystoresdata() {
        mystores.put("name", new Mystores("name", "ชื่อ", "Mr.Kim", "Fon", "Me", "you", "He"));
        mystores.put("shirt", new Mystores("shirt", "เสื้อ", "Nike", "addidas", "address", "Nike", "address"));
        mystores.put("price", new Mystores("price", "ราคา", "50", "100", "150", "200", "300"));
    }

    public static Mystoresdata getInstance() {
        return instance;
    }

    public Mystores getMystore(String name) {
        return mystores.get(name);
    }

}
