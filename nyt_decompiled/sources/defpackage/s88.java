package defpackage;

import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class s88 implements ba2 {
    public static e98 a(SubauthNetworkModule subauthNetworkModule, Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        return (e98) g16.e(subauthNetworkModule.n(builder, subauthEnvironment));
    }
}
