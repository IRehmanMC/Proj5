import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoDimRaggedArrayUtilityTestStudent {
	  private double[][] dataSet1 = {{1.1, 2.2, 3.3, 4.4}, {5.5, 6.6, 7.7}, {8.8, 9.9}};

	  @Test
	  public void testGetTotal() {
	    assertEquals(49.5,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	  }

	  public void testGetAverage() {
	    assertEquals(5.5,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	  }

	  @Test
	  public void testGetRowTotal() {
	    assertEquals(19.8,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	    assertEquals(18.7,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,2),.001);
	  }

	  @Test
	  public void testGetColumnTotal() {
	    assertEquals(15.4,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
	  }

	  @Test
	  public void testGetHighestInRow() {
	    assertEquals(4.4,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,0),.001);
	  }

	  @Test
	  public void testGetHighestInRowIndex() {
	    assertEquals(3,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,0));
	  }

	  @Test
	  public void testGetLowestInColumn() {
	    assertEquals(1.1,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,0),.001);
	  }

	  @Test
	  public void testGetLowestInColumnIndex() {
	    assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,1));
	  }

	  @Test
	  public void testGetLowestInArray() {
	    assertEquals(1.1,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
	  }
	}
