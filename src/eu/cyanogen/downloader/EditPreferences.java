package eu.cyanogen.downloader;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class EditPreferences extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
	}
}
