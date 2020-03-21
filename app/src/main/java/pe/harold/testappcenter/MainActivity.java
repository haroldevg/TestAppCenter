package pe.harold.testappcenter;

import androidx.appcompat.app.AppCompatActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCenter.start(getApplication(), BuildConfig.APP_CENTER_SECRET, Analytics.class, Crashes.class);
        setContentView(R.layout.activity_main);
    }
}
