package mx.essentialab.ycinterviewpracticator.fragment;

import mx.essentialab.ycinterviewpracticator.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PracticeFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View surface = inflater.inflate(R.layout.fragment_practice, container,
				false);
		return surface;
	}
}
