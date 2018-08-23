import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void addNumberToListGetSum () {
    Sum newNumber = new Sum();
    newNumber.addNumber(15);
    newNumber.addNumber(16);
    Assert.assertEquals(31, newNumber.sumOfTheList());
  }

}