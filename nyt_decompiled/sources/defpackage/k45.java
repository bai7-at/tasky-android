package defpackage;

import android.content.res.Resources;
import com.nytimes.android.network.NetworkModule;
import com.nytimes.android.network.urlexpander.UrlExpanderApi;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class k45 implements ba2 {
    public static UrlExpanderApi a(Retrofit.Builder builder, Resources resources) {
        return (UrlExpanderApi) g16.e(NetworkModule.a.o(builder, resources));
    }
}
