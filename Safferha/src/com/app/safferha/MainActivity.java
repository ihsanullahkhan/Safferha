package com.app.safferha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	Intent intent;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Toast.makeText(this, "this is supposed to be splash screen", 2500);
        
       
    }

    Thread thread = new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			try
			{
				Thread.sleep(5000);
				
				
			}catch(Exception ex){}
		}
	});
   
    
}
