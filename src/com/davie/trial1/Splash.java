package com.davie.trial1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity{
MediaPlayer splashSong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.splash);
		 splashSong= MediaPlayer.create(Splash.this, R.raw.holyshit);
		splashSong.start();
		Thread mythread=new Thread()
		{
			
				public void run() {
					 
					try {
						sleep(2000);
						
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					finally{
						Intent mainAppStart= new Intent("com.davie.trial1.DASHBOARD");
						startActivity(mainAppStart);
					}
					
				}
			
			
		};
		mythread.start();
		
		
	}
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		splashSong.release();
		finish();
	}
	
	

}
