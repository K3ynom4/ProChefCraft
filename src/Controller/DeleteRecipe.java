package Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import model.FoodRecipe;

public class DeleteRecipe {
    public void DeleteRecipe(int i, ArrayList<FoodRecipe> list, String fileName) throws IOException{
        FoodRecipe deleteRecipe = list.get(i);
        list.remove(deleteRecipe);
        FileWriter wr = null;
        try{
            wr = new FileWriter(fileName);
            for( FoodRecipe recipe : list){
                wr.write(recipe.getName()+"\n" + recipe.getIngredients()+ "\n"+
                        recipe.getInstructions()+"\n"+recipe.getCookingTime()+"\n");
            }
            wr.close();
        }catch(IOException ex){
            Logger.getLogger(DeleteRecipe.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
