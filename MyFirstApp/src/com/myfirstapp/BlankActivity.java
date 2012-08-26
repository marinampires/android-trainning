package com.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class BlankActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TextView textView = new TextView(this);
        setContentView(R.layout.main);
    }

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
    
	public void sendMessage(View view) {
	    
	}
    
}