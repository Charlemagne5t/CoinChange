import org.example.SolutionTopDown;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTopDownTest {
    @Test
    public void coinChangeTest1(){
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = 3;
        Assert.assertEquals(result, new SolutionTopDown().coinChange(coins, amount));
    }

    @Test
    public void coinChangeTest2(){
        int[] coins = {2};
        int amount = 3;
        int result = -1;
        Assert.assertEquals(result, new SolutionTopDown().coinChange(coins, amount));
    }

    @Test
    public void coinChangeTest3(){
        int[] coins = {1};
        int amount = 0;
        int result = 0;
        Assert.assertEquals(result, new SolutionTopDown().coinChange(coins, amount));
    }
}
