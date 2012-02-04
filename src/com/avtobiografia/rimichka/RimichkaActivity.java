package com.avtobiografia.rimichka;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RimichkaActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void search_button_click(View view) {
    	EditText search_field = (EditText) findViewById(R.id.search_field);
    	String text = search_field.getText().toString();
    	this.search(view, text);
    }

	private void search(View view, String text) {
		
	}
    
   
    
}