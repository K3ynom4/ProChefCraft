package Controller;
import java.util.List;
import model.FoodRecipe;

public interface DAO {
    List<FoodRecipe> readDataFromFile(String fileName);
    boolean writeDataToFile(List<FoodRecipe> recipe, String fileName);
}
