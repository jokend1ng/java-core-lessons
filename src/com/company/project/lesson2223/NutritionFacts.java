package com.company.project.lesson22;

public class NutritionFacts {
         private  int calories;
        private  int servings;
        private  int fat;
        private int proteins;
        private int carbs;

    public NutritionFacts() {
        this.calories = 0;
        this.servings = 0;
        this.fat = 0;
        this.proteins = 0;
        this.carbs = 0;
    }

    public static class Builder {
          NutritionFacts nutritionFacts= new NutritionFacts();
          public Builder(int calories) {
           nutritionFacts.calories = calories;

          }
          public Builder servings(int x){
              nutritionFacts.servings=x;
              return this;
          }
          public Builder fat(int x){
              nutritionFacts.fat = x;
              return this;
          }
          public Builder protein(int x){
              nutritionFacts.proteins = x;
              return this;
          }
          public Builder carbs(int x){
             nutritionFacts.carbs=x;
             return this;
        }
        public NutritionFacts build(){
              return nutritionFacts;
        }

    }
    }

