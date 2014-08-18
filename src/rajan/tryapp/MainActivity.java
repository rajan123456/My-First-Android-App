package rajan.tryapp;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	MediaPlayer song;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		song = MediaPlayer.create(this, R.raw.practiceisperfect);
		
	}

	@Override
	protected void onPause() {
		song.pause();
		super.onPause();
	}
	
	@Override
	protected void onResume() {
		song.start();
		super.onResume();
	}
	
	public void stopMusic(View V)
	{
		song.stop();
		song.prepareAsync();
	}
	
	public void openIn(View V)
	{
		String url = "http://in.linkedin.com/pub/rajan-gupta/84/64/95/";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void openFB(View V)
	{
		String url = "http://facebook.com/rajan123456/";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
