package com.company.project.lesson22;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        NutritionFacts meat =new NutritionFacts.Builder(300)
                .servings(200)
                .fat(80)
                .carbs(10)
                .protein(210)
                .build();
        System.out.println(meat.toString());
    }

}
