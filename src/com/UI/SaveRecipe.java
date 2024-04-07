
package com.UI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SaveRecipe {
    private String name;
    private String ingredients;
    private String instructions;
    private String cookingTime;
    public void setRecipe(String name) throws IOException{
        this.name = name;
        BufferedReader br = new BufferedReader(new FileReader("data/" + name + ".txt"));
        ingredients = br.readLine();
        instructions = br.readLine();
        cookingTime = br.readLine();
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getCookingTime() {
        return cookingTime;
    }
}
