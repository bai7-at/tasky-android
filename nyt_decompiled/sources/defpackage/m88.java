package defpackage;

import com.nytimes.android.subauth.core.auth.network.NYTTargetingAPI;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class m88 implements ba2 {
    public static NYTTargetingAPI a(SubauthNetworkModule subauthNetworkModule, Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        return (NYTTargetingAPI) g16.e(subauthNetworkModule.g(builder, subauthEnvironment));
    }
}
