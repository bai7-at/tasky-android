package defpackage;

import android.app.Application;
import com.nytimes.android.internal.cms.CmsEnvironment;
import com.nytimes.android.network.NetworkModule;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class h45 implements ba2 {
    public static s77 a(Application application, Retrofit.Builder builder, b04 b04Var, CmsEnvironment cmsEnvironment, so1 so1Var) {
        return (s77) g16.e(NetworkModule.a.l(application, builder, b04Var, cmsEnvironment, so1Var));
    }
}
