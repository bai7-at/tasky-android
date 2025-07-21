package defpackage;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class vc3 implements ba2 {
    public static Retrofit a(lc3 lc3Var, OkHttpClient okHttpClient, SharedPreferences sharedPreferences) {
        return (Retrofit) g16.e(lc3Var.l(okHttpClient, sharedPreferences));
    }
}
