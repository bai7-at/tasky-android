package defpackage;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public abstract class wb implements ba2 {
    public static Retrofit a(OkHttpClient okHttpClient) {
        return (Retrofit) g16.e(ub.a.b(okHttpClient));
    }
}
