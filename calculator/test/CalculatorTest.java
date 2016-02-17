package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import lib.*;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    lib.Calculator calculator = new lib.Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}