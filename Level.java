import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Level extends InternetJButtonColor {

	/**
	 * A JFrame that shows the level
	 */
	private JFrame level;

	/**
	 * A Button that returns the user to the start screen
	 */
	private JButton returnhome;
	
	/**
	 * An integer defining the size of each button on the grid
	 */
	protected final int BUTTON_SIZE=150;
	
	private ObjectiveCar obj;
	
	private boolean hasWon;

	/**
	 * Constructor sets up the level with its background and a return home
	 * button
	 */
	public Level() {
		hasWon = false;
		level = new JFrame();
		level.setSize(1300, 1000);
		level.setBackground(Color.WHITE);
		level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		returnhome = new JButton("Return to Menu");
		returnhome.setBounds(1050, 600, 200, 100);
		returnhome.setOpaque(true);
		returnhome.setBackground(Color.BLACK);
		level.add(returnhome);

		level.repaint();
		level.setVisible(false);
	}

	/**
	 * creates the background of gray squares for each level JFrame
	 */
	public void createBackground() {
		for (int side1 = 0; side1 <= 5; side1++) {
			for (int side2 = 0; side2 <= 5; side2++) {
				MyButton b = new MyButton("");
				setColorWheel(b);
				b.setBounds(BUTTON_SIZE * side1, BUTTON_SIZE * side2, BUTTON_SIZE, BUTTON_SIZE);
				b.setBorder(BorderFactory.createLoweredBevelBorder());
				b.setBackground(Color.lightGray);
				level.add(b);
			}
		}
		MyButton b = new MyButton("");
		setColorWheel(b);
		b.setBounds(BUTTON_SIZE * 5, BUTTON_SIZE * 5, BUTTON_SIZE, BUTTON_SIZE);
		b.setBorder(BorderFactory.createLoweredBevelBorder());
		b.setBackground(Color.lightGray);
		level.add(b);
		level.repaint();
	}

	/**
	 * Getter for the level
	 * 
	 * @return JFrame corresponding to the level
	 */
	
	private void test(int side1, int side2){
			
	}
	
	public JFrame getLevel() {
		return this.level;
	}

	/**
	 * Getter for the return home button
	 * 
	 * @return JButton for the return home on that level
	 */
	public JButton getreturnhome() {
		return returnhome;
	}

	/**
	 * Setter for visibility of the JFrame of the level
	 * 
	 * @param a
	 *            If a is set to false, JFrame will be set to not visible. If a
	 *            is set to true, JFrame will be set to visible
	 * 
	 */
	public void setlevelvisible(boolean a) {
		this.level.setVisible(a);
	}
	
	public void obj(ObjectiveCar a){
		this.obj = a;
	}
	
	public ObjectiveCar getobj(){
		return this.obj;
	}
	
	public boolean hasWon(){
		return this.hasWon;
	}
	
	public void sethasWon(boolean a){
		this.hasWon = a;
	}

}
