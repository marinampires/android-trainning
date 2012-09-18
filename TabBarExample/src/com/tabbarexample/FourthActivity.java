package com.tabbarexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_test);

		TextView txtView = (TextView) findViewById(R.id.txtDisplayedTab);
		txtView.setText("fourth Tab is Selected");
	}
}