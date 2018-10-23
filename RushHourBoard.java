import java.awt.Color;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;


public class RushHourBoard extends InternetJButtonColor{
	
	/**
	 * An array for the 10 levels in the game
	 */
	private Level[] levels;
	
	/**
	 * The start screen of the game
	 */
	private StartScreen start;
	
	/**
	 * 
	 */
	private ArrayList<int[][]> jams;
	private TwoHorzCar[] objcars;
	private WinScreen youwin;
	
	/**
	 * Constructor that sets up the RushHour game with a start screen and 10 levels.
	 * Also sets up MouseListeners so that the Play Now and Return Home JButtons work properly.
	 */
	public RushHourBoard(){
		youwin = new WinScreen();
		objcars = new TwoHorzCar[10];
		jams = new ArrayList<int[][]>();
		start = new StartScreen();	
		levels = new Level[10];
		for(int i = 0; i < 10; i ++){
			levels[i] = new Level();
			int i2 = i;
			levels[i].getreturnhome().addMouseListener(
					new MouseListener(){
						public void mouseClicked(MouseEvent arg0) {
						}
						public void mouseEntered(MouseEvent arg0) {
						}
						public void mouseExited(MouseEvent arg0) {
						}
						public void mousePressed(MouseEvent arg0) {
							start.setstartvisibility(true);
							levels[i2].setlevelvisible(false);
							
						}
						public void mouseReleased(MouseEvent arg0) {
							
						}
					}
			);
			
		}
		
		
		start.getPlayNow().addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				start.setstartvisibility(false);
				while(true){
					int i = (int) (Math.random() * 10);
					if(levels[i].hasWon() == false){
					levels[i].setlevelvisible(true);
					break;
					}
				}
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		level0();
		level1();
		level2();
		level3();
		level4();
		level5();
		level6();
		level7();
		level8();
		level9();
		
		for (int i = 0; i < 10; i ++){
			levels[i].createBackground();
		}
		youwin.winbutton().addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//System.exit(0);
				youwin.setVisible(false);
				start.setstartvisibility(true);
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		for(int i = 0; i < 10; i ++){
			checkWin();
		}
		
		
		
	}
	
	
	/**
	 * Sets up the background for all 10 levels
	 * @param a The game that the background is set for
	 */
	public void createBackground(RushHourBoard a){
		for (int i = 0; i < 10; i ++){
			createBackground(levels[i]);
		}
	}
	
	/**
	 * Creates the background for a specific level
	 * @param level The level that the background is set for
	 */
	public void createBackground(Level level){
		
		for(int side1=0;side1<=5;side1++){
			for(int side2=0;side2<=5;side2++){		
				MyButton b=new MyButton("");
				
				setColorWheel(b);
				
				b.setBounds(150*side1, 150*side2, 150, 150);
				
				b.setBorder(BorderFactory.createLoweredBevelBorder());

				b.setBackground(Color.lightGray);
				
				level.getLevel().add(b);
				
			}
		}
		level.getLevel().repaint();
	}
	
	/**
	 * Getter for a level at index i in the levels array
	 * @param i
	 * @return
	 */
	public Level getlevelsfromarray(int i){
		return levels[i];
	}	
	
	public void level0(){
		Level l = getlevelsfromarray(0);
		int[][] a = new int[6][6];
		jams.add(a);
		l.obj(new ObjectiveCar(2, 1, 1, jams.get(0), l));
		TwoHorzCar car1 = new TwoHorzCar(0, 0, 2, jams.get(0), l);
		TwoHorzCar car2 = new TwoHorzCar(4, 4, 3, jams.get(0), l);
		TwoVertCar car3 = new TwoVertCar(4, 0, 4, jams.get(0), l);
		ThreeVertCar car4 = new ThreeVertCar(1, 0, 5, jams.get(0), l);
		ThreeVertCar car5 = new ThreeVertCar(0, 5, 6, jams.get(0), l);
		ThreeVertCar car6 = new ThreeVertCar(1, 3, 7, jams.get(0), l);
		ThreeHorzCar car7 = new ThreeHorzCar(5, 2, 8, jams.get(0), l);
			}
	
	public void level1(){
		Level l = getlevelsfromarray(1);
		int[][] a = new int[6][6];
		jams.add(a);
		l.obj(new ObjectiveCar(2, 0, 1, jams.get(1), l));		
		TwoVertCar car1 = new TwoVertCar(0, 0, 2, jams.get(1), l);
		TwoVertCar car2 = new TwoVertCar(1, 3, 3, jams.get(1), l);
		TwoVertCar car3 = new TwoVertCar(2, 4, 4, jams.get(1), l);
		TwoHorzCar car4 = new TwoHorzCar(5, 0, 5, jams.get(1), l);
		TwoVertCar car5 = new TwoVertCar(4, 2, 6, jams.get(1), l);
		TwoHorzCar car6 = new TwoHorzCar(5, 3, 7, jams.get(1), l);
		TwoHorzCar car7 = new TwoHorzCar(4, 4, 8, jams.get(1), l);
		ThreeHorzCar car8 = new ThreeHorzCar(0, 3, 9, jams.get(1), l);
		ThreeHorzCar car9 = new ThreeHorzCar(3, 0, 10, jams.get(1), l);
		ThreeVertCar car10 = new ThreeVertCar(1, 5, 11, jams.get(1), l);
	}
	
	public void level2(){
		Level l = getlevelsfromarray(2);
		int[][] a = new int[6][6];
		jams.add(a);
		l.obj(new ObjectiveCar(2, 1, 1, jams.get(2), l));
		TwoHorzCar car1 = new TwoHorzCar(3, 1, 2, jams.get(2), l);
		TwoVertCar car2 = new TwoVertCar(4, 1, 3, jams.get(2), l);
		TwoHorzCar car3 = new TwoHorzCar(5, 2, 4, jams.get(2), l);
		ThreeVertCar car4 = new ThreeVertCar(2, 3, 5, jams.get(2), l);
		ThreeVertCar car5 = new ThreeVertCar(3, 5, 6, jams.get(2), l);
	}
	
	public void level3(){
		Level l = getlevelsfromarray(3);
		int[][] a = new int[6][6];
		jams.add(a);
		
		l.obj(new ObjectiveCar(2, 1, 1, jams.get(3), l));
		TwoVertCar car1 = new TwoVertCar(3, 2, 2, jams.get(3), l);
		TwoVertCar car2 = new TwoVertCar(4, 5, 3, jams.get(3), l);
		ThreeVertCar car3 = new ThreeVertCar(0, 0, 4, jams.get(3), l);
		ThreeVertCar car4 = new ThreeVertCar(0, 3, 5, jams.get(3), l);
		ThreeHorzCar car5 = new ThreeHorzCar(3, 3, 6, jams.get(3), l);
		ThreeHorzCar car6 = new ThreeHorzCar(5, 2, 7, jams.get(3), l);
	}
	
	public void level4(){
		Level l = getlevelsfromarray(4);
		int[][] a = new int[6][6];
		jams.add(a);
		
		l.obj(new ObjectiveCar(2, 1, 1, jams.get(4), l));
		TwoHorzCar car1 = new TwoHorzCar(0, 0, 2, jams.get(4), l);
		TwoVertCar car2 = new TwoVertCar(4, 0, 3, jams.get(4), l);
		TwoVertCar car3 = new TwoVertCar(0, 5, 4, jams.get(4), l);
		TwoVertCar car4 = new TwoVertCar(2, 5, 5, jams.get(4), l);
		TwoHorzCar car5 = new TwoHorzCar(4, 4, 6, jams.get(4), l);
		TwoHorzCar car6 = new TwoHorzCar(5, 4, 7, jams.get(4), l);
		ThreeVertCar car7 = new ThreeVertCar(1, 0, 8, jams.get(4), l);
		ThreeHorzCar car8 = new ThreeHorzCar(3, 1, 9, jams.get(4), l);
		ThreeVertCar car9 = new ThreeVertCar(0, 3, 10, jams.get(4), l);
		ThreeVertCar car10 = new ThreeVertCar(1, 4, 11, jams.get(4), l);
		
	}
	
	public void level5(){
		Level l = getlevelsfromarray(5);
		int[][] a = new int[6][6];
		jams.add(a);
		
		l.obj(new ObjectiveCar(2, 1, 1, jams.get(5), l));
		TwoHorzCar car1 = new TwoHorzCar(0, 0, 2, jams.get(5), l);
		TwoHorzCar car2 = new TwoHorzCar(1, 0, 3, jams.get(5), l);
		TwoHorzCar car3 = new TwoHorzCar(3, 0, 4, jams.get(5), l);
		TwoVertCar car4 = new TwoVertCar(3, 2, 5, jams.get(5), l);
		TwoVertCar car5 = new TwoVertCar(0, 3, 6, jams.get(5), l);
		TwoVertCar car6 = new TwoVertCar(4, 0, 7, jams.get(5), l);
		ThreeVertCar car7 = new ThreeVertCar(2, 3, 8, jams.get(5), l);
		ThreeVertCar car8 = new ThreeVertCar(1, 4, 9, jams.get(5), l);
		ThreeVertCar car9 = new ThreeVertCar(1, 5, 10, jams.get(5), l);
		ThreeHorzCar car10 = new ThreeHorzCar(5, 3, 11, jams.get(5), l);
	}
	
	public void level6(){
		Level l = getlevelsfromarray(6);
		int[][] a = new int[6][6];
		jams.add(a);
		
		l.obj(new ObjectiveCar(2, 1, 1, jams.get(6), l));
		TwoHorzCar car1 = new TwoHorzCar(0, 2, 2, jams.get(6), l);
		TwoHorzCar car2 = new TwoHorzCar(3, 2, 3, jams.get(6), l);
		TwoVertCar car3 = new TwoVertCar(0, 1, 4, jams.get(6), l);
		TwoVertCar car4 = new TwoVertCar(0, 4, 5, jams.get(6), l);
		TwoVertCar car5 = new TwoVertCar(0, 5, 6, jams.get(6), l);
		TwoVertCar car6 = new TwoVertCar(1, 3, 7, jams.get(6), l);
		TwoVertCar car7 = new TwoVertCar(2, 5, 8, jams.get(6), l);
		TwoVertCar car8 = new TwoVertCar(4, 3, 9, jams.get(6), l);
	}
	
	public void level7(){
		Level l = getlevelsfromarray(7);
		int[][] a = new int[6][6];
		jams.add(a);
		
		l.obj(new ObjectiveCar(2, 0, 1, jams.get(7), l));
		TwoHorzCar car1 = new TwoHorzCar(3, 0, 2, jams.get(7), l);
		TwoHorzCar car2 = new TwoHorzCar(4, 0, 3, jams.get(7), l);
		TwoHorzCar car3 = new TwoHorzCar(5, 0, 4, jams.get(7), l);
		TwoHorzCar car4 = new TwoHorzCar(1, 2, 5, jams.get(7), l);
		TwoHorzCar car5 = new TwoHorzCar(0, 3, 6, jams.get(7), l);
		TwoHorzCar car6 = new TwoHorzCar(3, 4, 7, jams.get(7), l);
		TwoVertCar car7 = new TwoVertCar(2, 2, 8, jams.get(7), l);
		TwoVertCar car8 = new TwoVertCar(2, 3, 9, jams.get(7), l);
		TwoVertCar car9 = new TwoVertCar(1, 4, 10, jams.get(7), l);
		TwoVertCar car10 = new TwoVertCar(4, 2, 11, jams.get(7), l);
		ThreeVertCar car11 = new ThreeVertCar(0, 5, 2, jams.get(7), l);
		ThreeHorzCar car12 = new ThreeHorzCar(4, 3, 3, jams.get(7), l);
		ThreeHorzCar car13 = new ThreeHorzCar(5, 3, 4, jams.get(7), l);
	}
	
	public void level8(){
		Level l = getlevelsfromarray(8);
		int[][] a = new int[6][6];
		jams.add(a);
		
		l.obj(new ObjectiveCar(2, 0, 1, jams.get(8), l));
		TwoHorzCar car1 = new TwoHorzCar(0, 2, 2, jams.get(8), l);
		TwoHorzCar car2 = new TwoHorzCar(0, 4, 3, jams.get(8), l);
		TwoHorzCar car3 = new TwoHorzCar(1, 4, 4, jams.get(8), l);
		TwoVertCar car4 = new TwoVertCar(4, 2, 5, jams.get(8), l);
		TwoVertCar car5 = new TwoVertCar(1, 3, 6, jams.get(8), l);
		TwoVertCar car6 = new TwoVertCar(2, 5, 7, jams.get(8), l);
		TwoVertCar car7 = new TwoVertCar(4, 5, 8, jams.get(8), l);
		ThreeHorzCar car8 = new ThreeHorzCar(3, 1, 9, jams.get(8), l);
		ThreeVertCar car9 = new ThreeVertCar(3, 0, 10, jams.get(8), l);
		ThreeVertCar car10 = new ThreeVertCar(2, 4, 11, jams.get(8), l);
	}
	
	public void level9(){
		Level l = getlevelsfromarray(9);
		int[][] a = new int[6][6];
		jams.add(a);
		
		l.obj(new ObjectiveCar(2, 1, 1, jams.get(9), l));
		TwoHorzCar car1 = new TwoHorzCar(0, 0, 2, jams.get(9), l);
		TwoHorzCar car2 = new TwoHorzCar(1, 0, 3, jams.get(9), l);
		TwoVertCar car3 = new TwoVertCar(0, 2, 4, jams.get(9), l);
		TwoHorzCar car4 = new TwoHorzCar(0, 4, 5, jams.get(9), l);
		TwoHorzCar car5 = new TwoHorzCar(5, 0, 6, jams.get(9), l);
		TwoVertCar car6 = new TwoVertCar(4, 3, 7, jams.get(9), l);
		TwoHorzCar car7 = new TwoHorzCar(4, 4, 8, jams.get(9), l);
		TwoHorzCar car8 = new TwoHorzCar(5, 4, 9, jams.get(9), l);
		ThreeVertCar car9 = new ThreeVertCar(2, 0, 10, jams.get(9), l);
		ThreeVertCar car10 = new ThreeVertCar(1, 5, 11, jams.get(9), l);
		ThreeHorzCar car11 = new ThreeHorzCar(3, 1, 2, jams.get(9), l);
	}
	
	public void checkWin(){
		
		while (true){
			for (int i = 0; i < levels.length; i ++){
				if(levels[i].hasWon() == false){
				if (levels[i].getobj().getCol() == 4){
					levels[i].sethasWon(true);
					youwin.setVisible(true);
					levels[i].setlevelvisible(false);
					return;
				}
				}
			}
		}
	}
}
