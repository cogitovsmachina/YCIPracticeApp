package mx.essentialab.ycinterviewpracticator.util;

import mx.essentialab.ycinterviewpracticator.R;
import mx.essentialab.ycinterviewpracticator.YCInterviewApplication;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;

public class FragmentUtils {

	public static void fragmentSwitcher(Fragment which, FragmentManager fm) {
		if (fm.findFragmentByTag("CURRENT_FRAGMENT").equals(which)) {
			Toast.makeText(YCInterviewApplication.getContext(),
					"Same fragment", Toast.LENGTH_SHORT).show();
		} else {
			FragmentManager fragmentManager = fm;
			fragmentManager.beginTransaction()
					.replace(R.id.mainView, which, "CURRENT_FRAGMENT").commit();
		}
	}
}
