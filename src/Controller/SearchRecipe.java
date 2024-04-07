
package Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import model.FoodRecipe;


public class SearchRecipe {
    public ArrayList<FoodRecipe> list = new ArrayList<>();
    public void ReadFile(String fileName){
        list.clear();
        FileReader reader = null;
        try{
            reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            FoodRecipe currentRecipe = null;
            while(br.ready()==true){
                String name = br.readLine();
                String ingredients= br.readLine();
                String instruction = br.readLine();
                String timeCooking = br.readLine();
                currentRecipe = new FoodRecipe(name,ingredients,instruction,timeCooking);
                list.add(currentRecipe);
            }
            reader.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(SearchRecipe.class.getName()).log(Level.SEVERE, null, ex);
        }catch( IOException ex){
            Logger.getLogger(SearchRecipe.class.getName()).log(Level.SEVERE, null, ex);
            
        } 
        
    }
    public void Search(ArrayList<FoodRecipe> currentList, DefaultTableModel model,
            String fileName, String keyWord, boolean searchByName, boolean searchByKeyWord, JDialog dialog){
        ReadFile(fileName);
        currentList. addAll(list);
        boolean check = false;
        for(int i=0; i<list.size(); i++){
            if(searchByName && CompareName(keyWord,list.get(i).getName())){
                check = true;
                
            }
            if(searchByName && CompareName(keyWord,list.get(i).getIngredients())
                    || CompareName(keyWord,list.get(i).getCookingTime())){
                check = true;
                
            }
        }
    }
    public boolean CompareName(String s1, String s2){
        String tmp1 = s1.toLowerCase();
        String tmp2 = s2.toLowerCase();
        return tmp1.equals(tmp2);
    }
    
    public boolean CompareKeyWord(String s1, String s2){
        String tmp1 = s1.toLowerCase();
        String tmp2 = s2.toLowerCase();
        return tmp2.contains(tmp1);
    }
}
