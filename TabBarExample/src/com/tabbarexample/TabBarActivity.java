package com.tabbarexample;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

@SuppressWarnings("deprecation")
public class TabBarActivity extends TabActivity  implements OnTabChangeListener{
	TabHost tabHost;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, FirstActivity.class);
        spec = tabHost.newTabSpec("First").setIndicator("First").setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, SecondActivity.class);
        spec = tabHost.newTabSpec("Second").setIndicator("Second").setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, ThirdActivity.class);
        spec = tabHost.newTabSpec("Third").setIndicator("Third").setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, FourthActivity.class);
        spec = tabHost.newTabSpec("Fourth").setIndicator("Fourth").setContent(intent);
        tabHost.addTab(spec);
        
        
        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++){
        	tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#8A4117"));
		}
        tabHost.getTabWidget().setCurrentTab(1);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#C35817"));
    }
    
    
	@Override
	public void onTabChanged(String tabId) {
		System.out.println("entrou no on tab change. " + tabId);
	    for(int i=0;i<tabHost.getTabWidget().getChildCount();i++){
	    	System.out.println("entrou no for");
			tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#8A4117"));
		}
	    System.out.println("Current tab: " + tabHost.getCurrentTab());
		tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#C35817"));
	}
}