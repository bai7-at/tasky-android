package defpackage;

import android.app.Application;
import com.nytimes.android.entitlements.di.SubauthBridgeModule;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import java.util.Set;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public abstract class r58 implements ba2 {
    public static Subauth a(Application application, r35 r35Var, OkHttpClient okHttpClient, h98 h98Var, boolean z, Set set) {
        return (Subauth) g16.e(SubauthBridgeModule.a.d(application, r35Var, okHttpClient, h98Var, z, set));
    }
}
