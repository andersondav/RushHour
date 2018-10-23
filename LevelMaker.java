
public class LevelMaker extends RushHourBoard{
	
	private int[][] trafficjam;
	
	public LevelMaker(){
		trafficjam = new int[6][6];
		level1();
	}
	
	public void level1(){
		Level l = getlevelsfromarray(0);
		TwoHorzCar th1 = new TwoHorzCar(1,1,1,trafficjam,l);
		l.getLevel().repaint();
		l.setlevelvisible(false);
	}
	
	
	
	
	
	
	
	
	
	

}
