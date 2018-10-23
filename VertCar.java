import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
/**
 * Parent class for all vertical cars
 * @author Anderson
 *
 */
public class VertCar{

	/**
	 * row in array of the top button for a vertical car
	 */
	protected int row;
	
	/**
	 * column in array of the top button for a vertical car
	 */
	protected int column;
	
	/**
	 * An integer that is used to show car's spot in array and its color
	 */
	protected int carCode;
	
	/**
	 * A JButton corresponding to the top button that allows the user to move up
	 */
	protected JButton upButton;
	
	/**
	 * A JButton corresponding to the bottom button that allows the user to move down
	 */
	protected JButton downButton;
	
	/**
	 * row position in JFrame that the button has
	 */
	protected int upButtonRow;
	
	/**
	 * column position in JFrame that the button has
	 */
	protected int upButtonColumn;
	
	/**
	 * Size of car buttons
	 */
	protected final int BUTTON_SIZE=150;
	
	/**
	 * Sets up color of the car based on its code
	 * @param b the button that is to be colored
	 * @param code the integer that determines the car's color
	 */
	public void createColor(JButton b, int code){
		if(code==1){
			b.setBackground(Color.WHITE);
		}else if(code==2){
			b.setBackground(Color.orange);
		}else if(code==3){
			b.setBackground(Color.yellow);
		}else if(code==4){
			b.setBackground(Color.green);
		}else if(code==5){
			b.setBackground(Color.blue);
		}else if(code==6){
			b.setBackground(Color.magenta);
		}else if(code==7){
			b.setBackground(Color.cyan);
		}else if(code==8){
			b.setBackground(Color.pink);
		}else if(code==9){
			b.setBackground(Color.black);
		}else if(code==10){
			b.setBackground(Color.red);
		}
	}
	
	/**
	 * Creates a new button for a car object
	 * @param upButtonColumn position of car's top button column in array
	 * @param upButtonRow position of car's top button row in array
	 * @param BUTTON_SIZE size of the button to be made
	 * @param str what the button will do (move left, move up, etc.)
	 * @param code corresponds to the car's color
	 * @return
	 */
	public JButton createButton(int upButtonColumn, int upButtonRow, int BUTTON_SIZE, String str, int code){
		JButton b=new JButton();
		b.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		b.setText(str);
		b.setFont(new Font("Arial", Font.PLAIN, 20));
		b.setBorder(BorderFactory.createRaisedBevelBorder());
		createColor(b, code);
		return b;
	}
	
	
	
}
