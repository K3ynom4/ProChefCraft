
package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.FoodRecipe;


public class controller implements DAO{

    @Override
    public List<FoodRecipe> readDataFromFile(String fileName) {
        List<FoodRecipe> recipe = new ArrayList<>();
        File file = new File(fileName);
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String name = sc.nextLine();
                String ingredient = sc.nextLine();
                String instruction = sc.nextLine();
                String timecook = sc.nextLine();
                FoodRecipe f = new FoodRecipe(name, ingredient, instruction, timecook);
                recipe.add(f);
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        return recipe;
    }

    @Override
    public boolean writeDataToFile(List<FoodRecipe> recipe, String fileName) {
        return false;
    }
    
}
