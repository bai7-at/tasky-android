package defpackage;

import android.app.Application;
import com.appsflyer.AppsFlyerConversionListener;
import com.nytimes.android.firebase.FirebaseModule;

/* loaded from: classes4.dex */
public abstract class ri2 implements ba2 {
    public static AppsFlyerConversionListener a(FirebaseModule firebaseModule, Application application) {
        return (AppsFlyerConversionListener) g16.e(firebaseModule.b(application));
    }
}
