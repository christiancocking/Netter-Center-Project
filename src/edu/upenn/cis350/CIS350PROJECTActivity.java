package edu.upenn.cis350;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CIS350PROJECTActivity extends Activity {
    /** Called when the activity is first created. */
    
    public static final int ACTIVITY_LoginToDashboard = 1;
    
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
 public void onLoginClick (View v) {
	 
	 Intent i = new Intent (this, LoginToDashboard.class);
	 
	 startActivityForResult (i, CIS350PROJECTActivity.ACTIVITY_LoginToDashboard);
	 
 }
}