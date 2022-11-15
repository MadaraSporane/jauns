package lekcijaSesiTest.majasdarbs;


import lekcijaSesi.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcalculator{
    Calculator calculator = new Calculator();
@Test
public void testadd()
{
    int gaiditais= 8;
    int rezultats = calculator.add(3,5);
    Assert.assertEquals(gaiditais,rezultats);
}
@Test
public void testetsubstract()
{
    int gaiditais=6;
    int rezultats= calculator.substract(2,3);
    Assert.assertEquals(gaiditais,rezultats);
}
@Test
    public void testetmultiply()
{
    int gaiditais=9;
    int rezultats= calculator.multiply(3,3);

}
}





