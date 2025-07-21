package defpackage;

import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.squareup.moshi.i;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class p88 implements ba2 {
    public static Retrofit.Builder a(SubauthNetworkModule subauthNetworkModule, OkHttpClient okHttpClient, i iVar) {
        return (Retrofit.Builder) g16.e(subauthNetworkModule.j(okHttpClient, iVar));
    }
}
