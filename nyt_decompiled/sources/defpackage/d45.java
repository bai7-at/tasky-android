package defpackage;

import android.content.res.Resources;
import com.nytimes.android.network.NetworkModule;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class d45 implements ba2 {
    public static Retrofit.Builder a(b04 b04Var, c05 c05Var, Resources resources) {
        return (Retrofit.Builder) g16.e(NetworkModule.a.f(b04Var, c05Var, resources));
    }
}
