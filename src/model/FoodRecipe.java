
package model;
import javax.swing.JTable;

public class FoodRecipe {
    public FoodRecipe(String name,String ingredients,String instructions,String cookingTime){
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.cookingTime = cookingTime;
    }
    private String name;
    private String ingredients;
    private String instructions;
    private String cookingTime;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setIngredients(String ingredients){
        this.ingredients = ingredients;
    }
    public String getIngredients() {
        return ingredients;
    }
    public void setInstructions(String instructions){
        this.instructions = instructions;
    }
    public String getInstructions() {
        return instructions;
    }
    public void setCookingTime(String cookingTime){
        this.cookingTime = cookingTime;
    }
    public String getCookingTime() {
        return cookingTime;
    }
}
