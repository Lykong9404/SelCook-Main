package com.example.myapplication;

public class Food {

    String name;
    String description;
    int imageID;

    public static final Food [] foods = {
            new Food("김치찌개","Thin crust pizza with extra cheese", R.drawable.pizza),
            new Food("된장찌개","Veg burger with aloo patty", R.drawable.burger),
            new Food("비빔밥", "Whole wheat sandwich", R.drawable.sandwich)
    };
    public Food(String name, String description, int imageID)
    {
        this.name= name;
        this.description=description;
        this.imageID=imageID;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public String getDescription() {
        return description;
    }

    public String toString()
    {
        return this.name;
    }
}