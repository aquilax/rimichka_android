package com.avtobiografia.rimichka;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.avtobiografia.rimichka.json_client.JsonClient;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

public class RimichkaActivity extends Activity {
    
	private JsonClient jsonClient;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jsonClient = new JsonClient();
        setContentView(R.layout.main);
    }
    
    public void searchClick(View view) {
    	EditText word = (EditText) findViewById(R.id.word);
    	search(view , word.getText().toString());
    }
    
    public void search(View view, String word) {
    	try {
	    	//showBusyCursor(true);
	    	JSONArray jsonArr = JsonClient.search(word);
	    	for (int i = 0; i < jsonArr.length(); ++i) {
	    	    JSONObject rec = jsonArr.getJSONObject(i);
	    	    int id = rec.getInt("pri");
	    	    String wrd = rec.getString("wrd");
	    	}
    	} catch (JSONException e) {

    		// TODO Auto-generated catch block

    		e.printStackTrace();

    		//showBusyCursor(false);

    	}//end try
    }    	
    }
}