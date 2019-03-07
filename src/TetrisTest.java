import static org.junit.Assert.*;

import org.junit.Test;

public class TetrisTest {
	
	/**
	 * let the test square be Sq and the pivot Pi
	 * the coordinates (col, row) for Sq is (1, 1)
	 * the coordinates for Pi is (1, 2)
	 * <br> <br> <br> <br>
	 * <br>  Sq  <br> <br>
	 * <br>  Pi  <br> <br>
	 * <br> <br> <br> <br>
	 */
	@Test
	public void rotationTest() {
		int SqCol = 1;
		int SqRow = 1;
		int PiCol = 1;
		int PiRow = 2;
		
		int yDistance = SqRow - PiRow;
		int xDistance = SqCol - PiCol;
		int rotatedRow = PiRow + xDistance;
		int rotatedCol = PiCol- yDistance;
		
		// the coordinates of the rotated square should be (2, 2)
		assertTrue(rotatedRow == 2 && rotatedCol == 2);
	}
	
	/**
	 * let the test square be Sq and the pivot Pi
	 * the coordinates (col, row) for Sq is (3, 1)
	 * the coordinates for Pi is (3, 2)
	 * <br> <br> <br> <br>
	 * <br> <br> <br>  Sq  
	 * <br> <br> <br>  Pi
	 * <br> <br> <br> <br>
	 */
	@Test
	public void canRotateOutOfBoundary() {
		int SqCol = 3;
		int SqRow = 1;
		int PiCol = 3;
		int PiRow = 2;
		
		int yDistance = SqRow - PiRow;
		int xDistance = SqCol - PiCol;
		int rotatedRow = PiRow + xDistance;
		int rotatedCol = PiCol- yDistance;
		
		// the coordinates of the rotated square should be (4, 2)
		boolean rotate = true;
		if (rotatedCol < 0 || rotatedRow >= 4 || rotatedRow < 0 || rotatedCol >= 4)
            rotate = false;

		assertTrue(rotate == false);
	}
	
	/**
	 * let the test square be Sq and the pivot Pi
	 * the coordinates (col, row) for Sq is (3, 1)
	 * the coordinates for Pi is (3, 2)
	 * <br> <br> <br> <br>
	 * <br>  Sq  <br> <br>
	 * <br>  Pi	  Bl  <br>
	 * <br> <br> <br> <br>
	 */
	@Test
	public void canRotateWhenBlocked() {
		int SqCol = 3;
		int SqRow = 1;
		int PiCol = 3;
		int PiRow = 2;
		
		int yDistance = SqRow - PiRow;
		int xDistance = SqCol - PiCol;
		int rotatedRow = PiRow + xDistance;
		int rotatedCol = PiCol- yDistance;
		
		// the coordinates of the rotated square should be (2, 2)
		boolean rotate = true;
		if (rotatedCol < 0 || rotatedRow >= 3 || rotatedRow < 0 || rotatedCol >= 3)
            rotate = false;
		else {
			if (rotatedCol == 2 && rotatedRow == 2)
				rotate = false;
			}

		assertTrue(rotate == false);
	}

}
