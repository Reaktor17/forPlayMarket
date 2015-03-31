package drg.app.forplaymarket;

import android.app.Application;

/**
 * Created by Aleksey.Stepanov
 * 25.03.2015.
 */
public class App extends Application {

	private static App sInstance;

	@Override
	public void onCreate() {

		sInstance = this;
	}

	public static String getRef() {
		return sInstance.getSharedPreferences("prefs", MODE_PRIVATE).getString("ref", "no ref :(");
	}

	public static void setRef(String ref) {
		sInstance.getSharedPreferences("prefs", MODE_PRIVATE).edit().putString("ref", ref).apply();
	}
}
