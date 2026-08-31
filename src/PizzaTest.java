import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTest {
    Pizza pizza;

    @BeforeEach
    public void setUp(){
        //Arrange
        pizza = new Pizza();
        pizza.adicionarIngredientes(4);
    }
    @Test
    public void adicionaIngredientesCorretamente(){
        //Act
        int quantos = pizza.adicionarIngredientes(1);

        //Assert
        assertEquals(5, quantos);
    }
    
    @Test
    public void naoAdicionaIngredientesNegativos(){
        //Act
        int quantos = pizza.adicionarIngredientes(-5);

        //Assert
        assertEquals(4, quantos);
    }

    @Test
    public void naoAcumulaIngredientesEmExcesso(){
        //Act
        int quantos = pizza.adicionarIngredientes(5);

        //Assert
        assertEquals(4, quantos);
    }
}
