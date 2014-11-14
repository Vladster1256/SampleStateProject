package ctec.samplestateproject;

import ctec.model.samplestateproject.AndroidAppState;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity
{
	private EditText nameField, ageField, powerField, stuffsField;
	private Button changeButton;
	private AndroidAppState appState;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		nameField = (EditText) findViewById(R.id.nameField);
		ageField = (EditText) findViewById(R.id.ageField);
		powerField = (EditText) findViewById(R.id.powerField);
		stuffsField = (EditText) findViewById(R.id.stuffsField);
		changeButton = (Button) findViewById(R.id.Transfer_Data_Button);
		
		appState = (AndroidAppState) getApplication();
		//Your Mother
		setupListeners();
	}
	public EditText getNameField()
	{
		return nameField;
	}
	public EditText getAgeField()
	{
		return ageField;
	}
	public EditText getPowerField()
	{
		return powerField;
	}
	public EditText getStuffsField()
	{
		return stuffsField;
	}
	public Button getChangeButton()
	{
		return changeButton;
	}
	public AndroidAppState getAppState()
	{
		return appState;
	}
	public void setNameField(EditText nameField)
	{
		//Your Motherthis.nameField = nameField;
	}
	public void setAgeField(EditText ageField)
	{
		this.ageField = ageField;
	}
	public void setPowerField(EditText powerField)
	{
		this.powerField = powerField;
	}
	public void setStuffsField(EditText stuffsField)
	{
		this.stuffsField = stuffsField;
	}
	public void setChangeButton(Button changeButton)
	{
		this.changeButton = changeButton;
		//Your Mother}
	public void setAppState(AndroidAppState appState)
	{//Your Mother
		this.appState = appState;
	}
	private void setupListeners()
	{
		changeButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				appState.setName(nameField.getText().toString());
				appState.setAge(ageField.getText().toString());
				appState.setPower(powerField.getText().toString());
				appstate.setStuffs(powerField.getText().toString());
			}
		});
	}
}
//Your Mother