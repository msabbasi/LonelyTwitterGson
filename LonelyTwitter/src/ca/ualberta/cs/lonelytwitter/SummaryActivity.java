package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class SummaryActivity extends LonelyTwitterActivity
{
	private TextView summaryList;
	
	private ArrayAdapter<Statistics> summaryAdapter;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {         

       super.onCreate(savedInstanceState);    
       setContentView(R.layout.summary);
       
       summaryList = (TextView) findViewById(R.id.summary);
       //rest of the code
   }
    
	protected void onStart() {
		super.onStart();

		
		summaryAdapter = new ArrayAdapter<Statistics>(this, R.layout.list_item, summaryStats);
	}
    
    
}
