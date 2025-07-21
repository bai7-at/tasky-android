package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.network.NetworkModule;

/* loaded from: classes4.dex */
public abstract class f45 implements ba2 {
    public static Resources a(Application application) {
        return (Resources) g16.e(NetworkModule.a.i(application));
    }
}
