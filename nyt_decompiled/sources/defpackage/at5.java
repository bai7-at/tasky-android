package defpackage;

import android.app.Application;
import androidx.preference.g;
import com.nytimes.android.ad.DFPEnvironmentProvider;

/* loaded from: classes2.dex */
public class at5 implements DFPEnvironmentProvider {
    private final Application a;

    public at5(Application application) {
        zq3.h(application, "application");
        this.a = application;
    }

    @Override // com.nytimes.android.ad.DFPEnvironmentProvider
    public DFPEnvironmentProvider.Environment a() {
        String string = g.b(this.a).getString(this.a.getString(xl6.com_nytimes_android_phoenix_beta_AD_ENV), this.a.getString(ck6.PRODUCTION));
        return zq3.c(string, this.a.getString(ck6.STAGING)) ? DFPEnvironmentProvider.Environment.STAGING : zq3.c(string, this.a.getString(ck6.GOOGLE)) ? DFPEnvironmentProvider.Environment.GOOGLE : DFPEnvironmentProvider.Environment.PROD;
    }
}
