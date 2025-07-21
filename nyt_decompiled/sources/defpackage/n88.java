package defpackage;

import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public abstract class n88 implements ba2 {
    public static OkHttpClient a(SubauthNetworkModule subauthNetworkModule, t68 t68Var) {
        return (OkHttpClient) g16.e(subauthNetworkModule.h(t68Var));
    }
}
