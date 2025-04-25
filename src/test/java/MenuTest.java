import models.*;
import services.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MenuTest {

    @Test
    public void testMenuContainsCupcakesOfTheDay() {
        CupcakeFactory factory = new CupcakeFactory();
        Menu menu = factory.getMenu();

        assertFalse(menu.getCupcakesOfTheDay().isEmpty());
    }

    @Test
    public void testMenuContainsIngredients() {
        CupcakeFactory factory = new CupcakeFactory();
        Menu menu = factory.getMenu();

        assertFalse(menu.getAvailableIngredients().isEmpty());
    }

    @Test
    public void testIngredientRemovedWhenStockIsExhausted() {
        Ingredient ingredient = new Ingredient("Test", Ingredient.Type.BASE, 1.0, 1);
        ingredient.reduceStock();
        assertFalse(ingredient.isAvailable());
    }
}
