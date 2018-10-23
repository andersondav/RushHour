import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * Sets up a vertical car that is three buttons long
 * @author Anderson
 *
 */
public class ThreeVertCar extends VertCar{

	/**
	 * A JButton for the car's middle button
	 */
	private JButton middleButton;
	
	/**
	 * Constructor that sets up the car's position in the array and its buttons
	 * @param row Row of car in integer array
	 * @param column Column of car in integer array
	 * @param code Code corresponding to car's color
	 * @param trafficJam Integer array that represents car positions
	 * @param level The level the car will be added to
	 */
	public ThreeVertCar(int row, int column, int code, int[][] trafficJam, Level level){
		//top side is primary side
		if(row>3 || column>5 || trafficJam[row][column] != 0 || trafficJam[row+1][column] != 0 || trafficJam[row+2][column] !=0){
			System.out.println("failed to add ThreeVertCar");
		}else{
			System.out.println("what is going on");
		this.row=row;
		this.column=column;
		this.carCode=code;
		upButtonRow=row*BUTTON_SIZE;
		upButtonColumn=column*BUTTON_SIZE;
		trafficJam[row][column]=code;
		trafficJam[row+1][column]=code;
		trafficJam[row+2][column] = code;
		
		downButton = createButton(upButtonColumn,upButtonRow+2*BUTTON_SIZE, BUTTON_SIZE, "move down", carCode);
		level.getLevel().add(downButton);
		moveDownPress(trafficJam,downButton);
		
		upButton = createButton(upButtonColumn, upButtonRow, BUTTON_SIZE, "move up", carCode);
		level.getLevel().add(upButton);
		moveUpPress(trafficJam,upButton);
		
		middleButton = createButton(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, "stay put", carCode);
		level.getLevel().add(middleButton);
		
		
		}	
		
	}
	
	/**
	 * Method that moves the car's buttons down one space
	 * @param trafficJam The integer array that determines if the move is legal
	 */
	public void moveDown(int[][] trafficJam){
		if(row <=3  && trafficJam[row+3][column] == 0){
			System.out.println(upButtonRow);
			trafficJam[row][column]=0;
			trafficJam[row+1][column] = 0;
			trafficJam[row+2][column] = 0;
			row=row + 1;
			trafficJam[row][column]=carCode;
			trafficJam[row+1][column] = carCode;
			trafficJam[row+2][column] = carCode;
			upButtonRow = upButtonRow + BUTTON_SIZE;
			System.out.println(upButtonRow);
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			middleButton.setBounds(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			downButton.setBounds(upButtonColumn,upButtonRow+BUTTON_SIZE+BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
		}else{
			System.out.println("movedown failed");
		}
	}
	
	/**
	 * Method that moves the car's buttons up one space
	 * @param trafficJam The integer array that determines if the move is legal
	 */
	public void moveUp(int[][] trafficJam){
		if(row>0 && trafficJam[row-1][column]==0){
			trafficJam[row][column]=0;
			trafficJam[row+1][column] = 0;
			trafficJam[row+2][column] = 0;
			row=row-1;
			trafficJam[row][column]=carCode;
			trafficJam[row+1][column] = carCode;
			trafficJam[row+2][column] = carCode;
			upButtonRow=upButtonRow-BUTTON_SIZE;
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			downButton.setBounds(upButtonColumn,upButtonRow+(2*BUTTON_SIZE), BUTTON_SIZE, BUTTON_SIZE);
			middleButton.setBounds(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
		}else{
			System.out.println("moveup failed");
		}
	}
	
	/**
	 * Adds a mouse listener to the move down button
	 * @param trafficJam The integer array that determines if a move down is legal
	 * @param b The button the mouse listener will be added to
	 */
	public void moveDownPress(int[][] trafficJam, JButton b){
		b.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						moveDown(trafficJam);
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
	}

	/**
	 * Adds a mouse listener to the move up button
	 * @param trafficJam The integer array that determines if a move up is legal
	 * @param b The button the mouse listener will be added to
	 */
	public void moveUpPress(int[][] trafficJam,JButton b){
		b.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						moveUp(trafficJam);
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {	
					}
				}
		);
	}
	

	//getters
	/**
	 * Getter for the row of the car
	 * @return Row of the car's top button
	 */
	public int getRow(){
		return row;
	}
	
	/**
	 * Getter for the column of the car
	 * @return Column of the car
	 */
	public int getColumn(){
		return column;
	}
	
	/**
	 * Getter for the car's integer code
	 * @return Integer code of the car
	 */
	public int getCarCode(){
		return carCode;
	}
	
}
