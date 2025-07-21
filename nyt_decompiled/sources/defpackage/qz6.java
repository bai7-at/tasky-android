package defpackage;

import com.nytimes.android.io.network.raw.CachedNetworkSource;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public abstract class qz6 implements ba2 {
    public static CachedNetworkSource a(OkHttpClient okHttpClient) {
        return (CachedNetworkSource) g16.e(lz6.a.e(okHttpClient));
    }
}
