package defpackage;

import android.app.Application;
import com.nytimes.android.ad.BaseAdParamKey;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes2.dex */
public final class a80 {
    private final Application a;
    private final AppPreferences b;

    public a80(Application application, AppPreferences appPreferences) {
        zq3.h(application, "application");
        zq3.h(appPreferences, "appPreferences");
        this.a = application;
        this.b = appPreferences;
    }

    public BaseAdParamKey a() {
        return BaseAdParamKey.AD_KEYWORD;
    }

    public String b() {
        AppPreferences appPreferences = this.b;
        String string = this.a.getString(xl6.com_nytimes_android_phoenix_beta_AD_KEYWORD);
        zq3.g(string, "getString(...)");
        return appPreferences.l(string, "");
    }
}
