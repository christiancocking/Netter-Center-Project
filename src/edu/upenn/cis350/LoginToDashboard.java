package edu.upenn.cis350;

import android.app.Activity;
import android.os.Bundle;

public class LoginToDashboard extends Activity {
	
		public void onCreate (Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView (R.layout.dashboard);
			setResult (RESULT_OK);
		}

}
