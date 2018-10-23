import javax.swing.JFrame;

public class ObjectiveCar extends TwoHorzCar{

	public ObjectiveCar(int row, int column, int code, int[][] trafficJam, Level level){
		super(row, column, code, trafficJam, level);
		
	}
	
	public boolean finished(int[][] trafficJam, ObjectiveCar obj){
		while(true){
			if(obj.getColumn()>=4){
				System.out.println("you won!");
				
				return true;
			}else{
				//do nothing
				return false;
			}
		}
	}
}
