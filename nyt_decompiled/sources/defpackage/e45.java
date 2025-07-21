package defpackage;

import com.nytimes.android.dimodules.OkHttpClientFactory;
import com.nytimes.android.network.NetworkModule;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public abstract class e45 implements ba2 {
    public static OkHttpClient a(OkHttpClientFactory okHttpClientFactory) {
        return (OkHttpClient) g16.e(NetworkModule.a.h(okHttpClientFactory));
    }
}
