package mx.essentialab.ycinterviewpracticator.fragment;

import mx.essentialab.ycinterviewpracticator.R;
import mx.essentialab.ycinterviewpracticator.util.FragmentUtils;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class StartFragment extends Fragment implements OnClickListener {

	private TextView description;
	private Button startPracticeButton;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View surface = inflater.inflate(R.layout.fragment_start, container,
				false);
		description = (TextView) surface.findViewById(R.id.description);
		startPracticeButton = (Button) surface
				.findViewById(R.id.startPracticeButton);
		startPracticeButton.setOnClickListener(this);
		return surface;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.startPracticeButton:
			FragmentUtils.fragmentSwitcher(new PracticeFragment(),
					getFragmentManager());
			break;
		default:
			break;
		}
	}

}
