package mx.essentialab.ycinterviewpracticator;

import android.app.Application;

public class YCInterviewApplication extends Application {

	private static YCInterviewApplication context;

	@Override
	public void onCreate() {
		super.onCreate();
		context = this;
	}

	public static YCInterviewApplication getContext() {
		return context;
	}

	public void setContext(YCInterviewApplication context) {
		this.context = context;
	}

}
