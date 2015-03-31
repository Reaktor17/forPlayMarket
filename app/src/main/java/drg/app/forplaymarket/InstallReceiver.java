package drg.app.forplaymarket;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Aleksey.Stepanov
 * 25.03.2015.
 */
public class InstallReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(getClass().getSimpleName(), "onReceive");
		String referrer = intent.getStringExtra("referrer");
		if (!TextUtils.isEmpty(referrer)) {
			Log.d(getClass().getSimpleName(), referrer);
			App.setRef(referrer);
		}
	}
}
