package easyLockJava2;

import java.awt.*;	//Robot,AWTException
import java.awt.event.KeyEvent;

public class mouseMove extends Thread{

	// Moving mouse...
	public void run(){
		Robot r;
		try{ r =new Robot(); }
		catch(AWTException e){
			e.printStackTrace();
			return;
		}
		for(int i=1;i<480;){
			try{Thread.sleep(60000);}	//wait
			catch(InterruptedException e){return;}


			PointerInfo pinf=MouseInfo.getPointerInfo();
			Point mp=pinf.getLocation();

			//r.mouseMove(mp.x+100,mp.y+100);	//move cursor

			r.keyPress(KeyEvent.VK_PAUSE);

			try{Thread.sleep(100);}	//wait
			catch(InterruptedException e){return;}

			r.keyRelease(KeyEvent.VK_PAUSE);
		}
	}
}