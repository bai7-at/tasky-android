package defpackage;

import com.nytimes.android.ads.network.api.AlsApi;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public abstract class xb implements ba2 {
    public static AlsApi a(Retrofit retrofit) {
        return (AlsApi) g16.e(ub.a.c(retrofit));
    }
}
