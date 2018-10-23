import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;

//convert everything here into a vertical car

/**
 * Sets up a vertical car of size 2
 * @author Anderson
 *
 */
public class TwoVertCar extends VertCar{


	
	
	/**
	 * Constructor that sets up the car's position, buttons, and which level it goes in
	 * @param row the row of the car's top button in the array
	 * @param column the column of the car's top button in the array
	 * @param code the number corresponding to the car's color
	 * @param trafficJam the integer array that represents the cars' positions
	 * @param level the desired level that this car will be in
	 */
	public TwoVertCar(int row, int column, int code, int[][] trafficJam, Level level){
		//Bottom side is primary side
		if(row>=5 || column>5){
			System.out.println("Inputted TwoHorzCar is not in bounds of 6x6");
		}else{
		this.row=row;
		this.column=column;
		this.carCode=code;
		upButtonRow=row*BUTTON_SIZE;
		upButtonColumn=column*BUTTON_SIZE;
		trafficJam[row][column]=code;
		trafficJam[row+1][column]=code;
		}
		
		//make the buttons
		upButton = createButton(upButtonColumn, upButtonRow, BUTTON_SIZE, "move up", code);
		downButton = createButton(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, "move down", code);
		level.getLevel().add(upButton);
		
		level.getLevel().add(downButton);
		
		moveUpPress(trafficJam, upButton);
		moveDownPress(trafficJam, downButton);
		
		System.out.println("Two vert car successfully instantiated");
		
		
	}
	
	/**
	 * Moves the car's buttons down one space and updates the integer array
	 * @param trafficJam the integer array representing cars to see if a move is valid or not
	 */
	public void moveDown(int[][] trafficJam){
		if(row<4 && trafficJam[row+2][column]==0){
			trafficJam[row][column]=0;
			trafficJam[row+1][column] = 0;
			row=row+1;
			trafficJam[row][column] = carCode;
			trafficJam[row+1][column]=carCode;
			upButtonRow=row*BUTTON_SIZE;
			downButton.setBounds(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		}else{
			System.out.println("movedown failed");
		}
	}
	
	/**
	 * Moves the car's buttons up one space and updates the integer array
	 * @param trafficJam the integer array representing cars to see if a move is valid or not
	 */
	public void moveUp(int[][] trafficJam){
		if(row>0 && trafficJam[row-1][column]==0){
			trafficJam[row][column]=0; 
			trafficJam[row+1][column]=0; 
			row=row-1;
			trafficJam[row][column]=carCode;
			trafficJam[row+1][column] = carCode;
			upButtonRow=row*BUTTON_SIZE;
			//downButtonRow = downButtonRow + BUTTON_SIZE;
			downButton.setBounds(upButtonColumn, upButtonRow+BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		}else{
			System.out.println("moveup failed");
		}
	}
	
	/**
	 * Adds a mouseListener to the move down button
	 * @param trafficJam the integer array that represents car positions
	 * @param b the down button that the mouse listener will be added to
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
						//you have just pressed to go down...
						//move buttons and images down...
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
	}
	
	/**
	 * Adds a mouseListener to the move up button
	 * @param trafficJam the integer array that represents car positions
	 * @param b the up button that the mouse listener will be added to
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
						//if statement for each of the carCodes...
						moveUp(trafficJam);
						//you have just pressed to the right...
						//move buttons and images to the right...
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {	
					}
				}
		);
	}
	

	//getters
	/**
	 * A getter for the row of the car in the integer array
	 * @return row of the car
	 */
	public int getRow(){
		return row;
	}
	
	/**
	 * A getter for the column of the car in the integer array
	 * @return column of the car
	 */
	public int getColumn(){
		return column;
	}
	
	/**
	 * A getter for the code of the car 
	 * @return code of the car
	 */
	public int getCarCode(){
		return carCode;
	}
	
	/**
	 * A getter for the row position of the car's top button in the JFrame
	 * @return button row of the car
	 */
	public int getupButtonRow(){
		return upButtonRow;
	}
	
	/**
	 * A getter for the column position of the car's top button in the JFrame
	 * @return button column of the car
	 */
	public int getupButtonColumn(){
		return upButtonColumn;
	}
	
	
}
