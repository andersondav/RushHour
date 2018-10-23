import java.awt.Color;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
//this potentially should become a class and then the two and three should
//become interfaces??? not really

public class HorzCar{

	protected int row;
	protected int column;
	protected int carCode;
	protected JButton leftButton;
	protected JButton rightButton;
	protected int leftButtonRow;
	protected int leftButtonColumn;
	protected final int BUTTON_SIZE=150;
	protected int lengthCode;
				
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
	
	public JButton createButton(int leftButtonColumn, int leftButtonRow, int BUTTON_SIZE, String str, int code){
		JButton b=new JButton();
		b.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		b.setText(str);
		b.setFont(new Font("Arial", Font.PLAIN, 20));
		b.setBorder(BorderFactory.createRaisedBevelBorder());
		createColor(b, code);
		return b;
	}
	
	//getters
	public int getRow(){
		return row;
	}
	public int getColumn(){
		return column;
	}
	public int getCarCode(){
		return carCode;
	}
	public int getLeftButtonRow(){
		return leftButtonRow;
	}
	public int getLeftButtonColumn(){
		return leftButtonColumn;
	}
	
}
