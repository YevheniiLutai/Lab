import lab1.Pair;
import lab1.QuadraticEquation;
import org.junit.Test;
import org.junit.Assert;

public class TestQuadraticEquation {
    @Test
    public void testSearchRoots() throws IllegalArgumentException {
        QuadraticEquation example = new QuadraticEquation();
        Pair pair = example.searchRoots(-4.0, -20.0, 416.0);
        Assert.assertEquals(-13.0, pair.x1, 0.0000001);
        Assert.assertEquals(8.0, pair.x2, 0.0000001);
    }

    @Test
    public void testSearchRoots2() throws IllegalArgumentException {
        QuadraticEquation example = new QuadraticEquation();
        Pair pair = example.searchRoots(-3.0, -24.0, 315.0);
        Assert.assertEquals(-15.0, pair.x1, 0.0000001);
        Assert.assertEquals(7.0, pair.x2, 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSearchRoots3() throws IllegalArgumentException {
        QuadraticEquation example = new QuadraticEquation();
        Pair pair = example.searchRoots(4.0, -20.0, 416.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSearchRoots4() throws IllegalArgumentException {
        QuadraticEquation example = new QuadraticEquation();
        Pair pair = example.searchRoots(4.0, 0.0, 416.0);
    }

    @Test
    public void testSearchRoots5() throws IllegalArgumentException {
        QuadraticEquation example = new QuadraticEquation();
        Pair pair = example.searchRoots(-3.0, 0.0, 315.0);
        Assert.assertEquals(-10.246950765959598, pair.x1, 0.0000001);
        Assert.assertEquals(10.246950765959598, pair.x2, 0.0000001);
    }


}
