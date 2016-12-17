package easyLockJava2;

import java.awt.*;
import java.awt.TrayIcon.MessageType;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;



public class main extends Thread{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					//window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();

		//Moving mouse...
		mouseMove thread1 = new mouseMove();
		thread1.start();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		try {
			SystemTray tray = SystemTray.getSystemTray();

	        Image image = ImageIO.read(new File("trayicon.png"));
	        PopupMenu menu = new PopupMenu("EasyLockJava");
	        //menu.add(new MenuItem("Exit"));

	        // 終了メニュー
	        MenuItem exitItem = new MenuItem("Exit");
	        exitItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });
	        menu.add(exitItem);



	        TrayIcon icon = new TrayIcon(image, "EasyLockJava", menu);
	        // イベント登録
	        icon.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                //System.exit(0);
	            }
	        });

	        tray.add(icon);


		}catch(Exception ex){

		} //*/




	}




}
