package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class SummaryActivity extends LonelyTwitterActivity
{
	private ListView summaryList;
	
	private ArrayAdapter<Statistics> summaryAdapter;
	
	private ArrayList<Statistics> statList;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {         

       super.onCreate(savedInstanceState);    
       setContentView(R.layout.summary);
       
       //summaryList = (ListView) findViewById(R.id.summary);
       
       //statList = new ArrayList<Statistics>();
       
       //statList.add(summaryStats);
       
       //summaryAdapter = new ArrayAdapter<Statistics>(this, R.layout.list_item, statList);
       
       //summaryList.setAdapter(summaryAdapter);
       //rest of the code
       Intent i = getIntent();
       
   }
    
	protected void onStart() {
		
		//summaryAdapter = new ArrayAdapter<Statistics>(this, R.layout.list_item, statList);
	}
    
	public void back(View v) {
   		finish();
   	}
    
}
