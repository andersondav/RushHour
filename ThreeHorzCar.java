import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
/**
 * A horizontal car that is three buttons in length
 * @author Anderson
 *
 */
public class ThreeHorzCar extends HorzCar{

	//differences, movement has an extra step and now there is a third button
	/**
	 * A JButton representing the car's middle button
	 */
	private JButton middleButton;
	
	/**
	 * Constructor setting up the car's position and buttons in a level
	 * @param row The car's row in the integer array
	 * @param column The car's column in the integer array
	 * @param code The car's code that represents its color
	 * @param trafficJam Integer array that represents the cars' positions
	 * @param level The level that the car will be added to
	 */
	public ThreeHorzCar(int row, int column, int code, int[][] trafficJam, Level level){
		if(row>=6 || column>=4){
			System.out.println("Inputted ThreeHorzCar is not in bounds of 6x6");
		}else{
		this.row=row;
		this.column=column;
		this.carCode=code;
		leftButtonRow=row*BUTTON_SIZE;
		leftButtonColumn=column*BUTTON_SIZE;
		trafficJam[row][column]=code;
		trafficJam[row][column+1]=code;
		trafficJam[row][column+2]=code;
		
		
		leftButton = createButton(leftButtonColumn, leftButtonRow, BUTTON_SIZE, "move left", code);
		level.getLevel().add(leftButton);
		
		moveLeftPress(trafficJam,leftButton);
		
		middleButton = createButton(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE,"stay put", code);
		level.getLevel().add(middleButton);
		
		//no press action for middle
		
		rightButton = createButton(leftButtonColumn+BUTTON_SIZE+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, "move right", code);
		level.getLevel().add(rightButton);
		
		moveRightPress(trafficJam,rightButton);
		
		}
		
	}
	
	/**
	 * Method that moves the car's button to the left
	 * @param trafficJam Integer array that determines if a move left is legal
	 */
	public void moveLeft(int[][] trafficJam){
		if(column-1>=0 && column+2<6 && trafficJam[row][column-1]==0){
			trafficJam[row][column+2]=0;
			column=column-1;
			trafficJam[row][column]=carCode;
			leftButtonColumn=leftButtonColumn-BUTTON_SIZE;
			leftButton.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			middleButton.setBounds(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			rightButton.setBounds(leftButtonColumn+BUTTON_SIZE+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		}else{
			System.out.println("moveleft failed");
		}
	}
	
	/**
	 * Method that moves the car's button to the right
	 * @param trafficJam Integer array that determines if a move right is legal
	 */
	public void moveRight(int[][] trafficJam){
		if(column+3<6 && trafficJam[row][column+3]==0){
			trafficJam[row][column]=0;
			column=column+1;
			trafficJam[row][column+2]=carCode;
			leftButtonColumn=leftButtonColumn+BUTTON_SIZE;
			
			leftButton.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			middleButton.setBounds(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			rightButton.setBounds(leftButtonColumn+BUTTON_SIZE+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			
		}else{
			System.out.println("moveright failed");
		}
	}
	
	/**
	 * Method that adds a mouse listener to the move left button
	 * @param trafficJam The integer array that determines if a move left is legal
	 * @param b The button that the mouse listener will be added to
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
	 * Method that adds a mouse listener to the move right button
	 * @param trafficJam The integer array that determines if a move right is legal
	 * @param b The button that the mouse listener will be added to
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
	
	
	
}
