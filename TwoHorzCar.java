import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * Sets up a horizontal car of 2 buttons
 * @author Anderson
 *
 */
public class TwoHorzCar extends HorzCar{
	
	/**
	 * Constructor that sets up a horizontal car of two buttons
	 * @param row the row of the car in the integer array
	 * @param column the column of the car's move left button in the integer array
	 * @param code integer that determines the car's color
	 * @param trafficJam integer array representing positions of cars
	 * @param level the level that the car will be added to
	 */
	public TwoHorzCar(int row, int column, int code, int[][] trafficJam, Level level){
		//Left side is primary side
		if(row>=6 || column>=5){
			System.out.println("Inputted TwoHorzCar is not in bounds of 6x6");
		}else{
		this.row=row;
		this.column=column;
		this.carCode=code;
		leftButtonRow=row*BUTTON_SIZE;
		leftButtonColumn=column*BUTTON_SIZE;
		trafficJam[row][column]=code;
		trafficJam[row][column+1]=code;
			
		//according to row column make buttons
		leftButton = createButton(leftButtonColumn, leftButtonRow, BUTTON_SIZE, "move left", code);
		level.getLevel().add(leftButton);
		
		moveLeftPress(trafficJam,leftButton);
		
		rightButton = createButton(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, "move right", code);
		level.getLevel().add(rightButton);
		
		moveRightPress(trafficJam,rightButton);
		}
	}
	
	/**
	 * Moves the car's buttons one space to the left
	 * @param trafficJam integer array that determines if the move left is legal
	 */
	public void moveLeft(int[][] trafficJam){
		if(column-1>=0 && column+1<6 && trafficJam[row][column-1]==0){
			trafficJam[row][column+1]=0;
			column=column-1;
			trafficJam[row][column]=carCode;
			leftButtonColumn=leftButtonColumn-BUTTON_SIZE;
			leftButton.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			rightButton.setBounds(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			//just some debugging
			System.out.println(getRow());
			System.out.println(getColumn());
			System.out.println(getLeftButtonColumn());
		}else{
			System.out.println("moveleft failed");
		}
	}
	
	/**
	 * Moves the car's buttons one space to the right
	 * @param trafficJam integer array that determines if the move right is legal
	 */
	public void moveRight(int[][] trafficJam){
		if(column+2<6 && trafficJam[row][column+2]==0){
			trafficJam[row][column]=0;
			column=column+1;
			trafficJam[row][column+1]=carCode;
			leftButtonColumn=leftButtonColumn+BUTTON_SIZE;
			leftButton.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			rightButton.setBounds(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			//just some debugging
			System.out.println(getRow());
			System.out.println(getColumn());
			System.out.println(getLeftButtonColumn());
			//board.addRoad(trafficJam);
		}else{
			System.out.println("moveright failed");
		}
	}
	
	/**
	 * Adds a mouseListener to the move left button
	 * @param trafficJam integer array showing car positions
	 * @param b the button the mouse listener will be added to
	 */
	public void moveLeftPress(int[][] trafficJam, JButton b){
		b.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						moveLeft(trafficJam);
						//you have just pressed to the right...
						//move buttons and images to the right...
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
	}
	
	/**
	 * Adds a mouseListener to the move right button
	 * @param trafficJam integer array showing car positions
	 * @param b the button the mouse listener will be added to
	 */
	public void moveRightPress(int[][] trafficJam,JButton b){
		b.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						//if statement for each of the carCodes...
						moveRight(trafficJam);
						//you have just pressed to the right...
						//move buttons and images to the right...
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {	
					}
				}
		);
	}
	
	/**
	 * getter for the column of the car's left button
	 * @return column of car's left button
	 */
	public int getCol(){
		return this.column;
	}
	
}
