package it.org.rundog;
import java.awt.*;	//Robot,AWTException
public class MouseMove{
	public static void main(String[] args){
		Robot r;
		try{ r =new Robot(); }
		catch(AWTException e){
			e.printStackTrace();
			return;
		}
		for(int i=1;i<480;){
			try{Thread.sleep(70000);}	//wait
			catch(InterruptedException e){return;}

			PointerInfo pinf=MouseInfo.getPointerInfo();
			Point mp=pinf.getLocation();

			r.mouseMove(mp.x+1,mp.y);	//move cursor
		}
	}
}