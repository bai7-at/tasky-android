package defpackage;

import android.app.Application;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public abstract class rz6 implements ba2 {
    public static OkHttpClient a(Application application, OkHttpClient okHttpClient) {
        return (OkHttpClient) g16.e(lz6.a.f(application, okHttpClient));
    }
}
