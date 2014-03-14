package mx.essentialab.ycinterviewpracticator;

import mx.essentialab.ycinterviewpracticator.fragment.StartFragment;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupFragmentManager();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

	
	private void fragmentSwitcher(Fragment which) {
		if (getSupportFragmentManager().findFragmentByTag("CURRENT_FRAGMENT")
				.equals(which)) {
			Toast.makeText(this, "Same fragment", Toast.LENGTH_SHORT).show();
		} else {
			FragmentManager fragmentManager = getSupportFragmentManager();
			fragmentManager.beginTransaction()
					.replace(R.id.mainView, which, "CURRENT_FRAGMENT")
					.commit();
		}
	}
	
	private void setupFragmentManager() {
		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.mainView);

		if (fragment == null) {
			FragmentTransaction ft = fm.beginTransaction();
			ft.add(R.id.mainView, new StartFragment(), "CURRENT_FRAGMENT");
			ft.commit();
		}
	}

}
