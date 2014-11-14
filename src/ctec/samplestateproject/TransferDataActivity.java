package ctec.samplestateproject;

import ctec.model.samplestateproject.AndroidAppState;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.app.Application;
import android.content.Intent;

public class TransferDataActivity extends Application
{
	private AndroidAppState appState;
	private TextView comboText;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(Bunde savedInstances);
		setContentView(R.layout.activity_transfer_data);
		
		appState = (AndroidAppState) getApplication();
		comboText = (TextView) findViewById(R.id.);
				
		comboText.setText(appState.getName() + " is " +
		appState.getAge() + " and has power level of " + appState.getPowerLevel() + " and says " + appState.getStuffs()
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		homeButton.setOnClickListener(new View.onClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
			}
		});
	}
}
