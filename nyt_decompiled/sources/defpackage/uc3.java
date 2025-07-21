package defpackage;

import android.app.Application;
import java.util.Set;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public abstract class uc3 implements ba2 {
    public static OkHttpClient a(lc3 lc3Var, OkHttpClient okHttpClient, Set set, Application application, ec3 ec3Var) {
        return (OkHttpClient) g16.e(lc3Var.i(okHttpClient, set, application, ec3Var));
    }
}
