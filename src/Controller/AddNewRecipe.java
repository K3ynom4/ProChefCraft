package Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import model.FoodRecipe;

public class AddNewRecipe {
    public void AddNewRecipe(FoodRecipe recipe, String fileName){
        FileWriter wr = null;
        try{
            wr = new FileWriter(fileName, true);
            wr.write(recipe.getName()+"\n");
            wr.write(recipe.getIngredients()+"\n");
            wr.write(recipe.getInstructions()+"\n");
            wr.write(recipe.getCookingTime()+"\n");
            wr.close();
        }catch( IOException ex){
            Logger.getLogger(AddNewRecipe.class.getName()).log(Level.SEVERE, null, ex);
            
        }          
    }
}
