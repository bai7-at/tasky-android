package defpackage;

import android.content.res.Resources;
import com.google.gson.Gson;
import com.nytimes.android.network.NetworkModule;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class g45 implements ba2 {
    public static Retrofit.Builder a(b04 b04Var, Resources resources, Gson gson) {
        return (Retrofit.Builder) g16.e(NetworkModule.a.j(b04Var, resources, gson));
    }
}
