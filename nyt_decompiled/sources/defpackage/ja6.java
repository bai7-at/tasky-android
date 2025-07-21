package defpackage;

import android.app.Application;
import com.nytimes.android.internal.pushmessaging.PushMessaging;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public abstract class ja6 implements ba2 {
    public static OkHttpClient a(ga6 ga6Var, Application application, PushMessaging.c cVar, String str) {
        return (OkHttpClient) g16.e(ga6Var.e(application, cVar, str));
    }
}
