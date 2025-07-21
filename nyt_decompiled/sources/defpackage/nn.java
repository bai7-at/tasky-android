package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AppsFlyerConversionListener;
import com.nytimes.android.IntentFilterActivity;
import com.nytimes.android.logging.NYTLogger;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nn implements AppsFlyerConversionListener {
    private final Application a;

    public nn(Application application) {
        zq3.h(application, "application");
        this.a = application;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map map) {
        NYTLogger.d("onAppOpenAttribution", new Object[0]);
        if (map != null) {
            if (!zq3.c(map.get("is_first_launch"), "true")) {
                map = null;
            }
            if (map != null) {
                NYTLogger.d("First launch with non-organic install", new Object[0]);
                String str = (String) map.get("af_dp");
                if (str != null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(32768);
                    String className = intent.resolveActivity(this.a.getPackageManager()).getClassName();
                    zq3.g(className, "getClassName(...)");
                    if (zq3.c(className, IntentFilterActivity.class.getCanonicalName())) {
                        this.a.startActivity(intent);
                    }
                }
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        NYTLogger.d("onAppOpenAttribution", new Object[0]);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        NYTLogger.d("onConversionDataFail", new Object[0]);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map map) {
        NYTLogger.d("onConversionDataSuccess", new Object[0]);
    }
}
