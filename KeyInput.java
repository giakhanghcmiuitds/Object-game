package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
 			
			if(tempObject.getId() == ID.Player) {
				//key events for Player 1
				if(key == KeyEvent.VK_UP) tempObject.setVelY(-3);
				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(3);
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(-3);
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(3);
			}
		}
	}
	
	
	
	public void KeyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				//key events for Player 1
				if(key == KeyEvent.VK_UP) tempObject.setVelY(0);
				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(0);
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(0);
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(0);
			}
		}
	}
}


