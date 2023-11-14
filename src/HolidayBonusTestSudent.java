import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestSudent {
  // create several (more than 2) data sets for testing. These data sets must be different
  // then the data sets in HolidayBonusTest
  private double[][] dataSet1 = {{1.1, 2.2, 3.3, 4.4}, {5.5, 6.6, 7.7}, {8.8, 9.9}};
  private double[][] dataSet2 = {{-1, -2, -3, -4}, {-5}, {-6, -7, -8}, {-9, -10, -11, -12}};
  private double[][] dataSet3 = {{10.1, -20.1, 30.1, -40.1}, {50.1, -60.1}, {-70.1, 80.1, -90.1},{-100.1, 110.1, -120.1, 130.1}};

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}


  @Test
  public void testCalculateHolidayBonus() {
	  
    try {
      double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
      assertEquals(8000.0, result[0], .001);
      assertEquals(9000.0, result[1], .001);
      assertEquals(10000.0, result[2], .001);

      result = HolidayBonus.calculateHolidayBonus(dataSet2);
      assertEquals(0.0, result[0], .001);
      assertEquals(0.0, result[1], .001);
      assertEquals(0.0, result[2], .001);
      assertEquals(0.0, result[3], .001);

      result = HolidayBonus.calculateHolidayBonus(dataSet3);
      assertEquals(7000.0, result[0], .001);
      assertEquals(5000.0, result[1], .001);
      assertEquals(2000.0, result[2], .001);
      assertEquals(10000.0, result[3], .001);
    } catch (Exception e) {
    	fail("This should not have caused an Exception");
    }
  }

  @Test
  public void testCalculateTotalHolidayBonus() {
    assertEquals(27000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1),.001);
    assertEquals(0.0, HolidayBonus.calculateTotalHolidayBonus(dataSet2),.001);
    assertEquals(24000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet3),.001);
  }
}
