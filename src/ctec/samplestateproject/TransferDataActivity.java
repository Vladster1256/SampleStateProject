package ctec.samplestateproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Application;

public class TransferDataActivity extends Application
{
	private String name; 
	private String age;
	private String powerLevel;
	private String stuffs;
	
	public void onCreate()
	{
		super.onCreate();
		
		name = "";
		age = "";
		powerLevel = "";
		stuffs = "";
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(TransferDataActivity name)
	{
		this.name = name;
	}
}
