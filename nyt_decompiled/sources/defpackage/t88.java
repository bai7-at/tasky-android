package defpackage;

import com.nytimes.android.subauth.core.auth.network.UserAPI;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class t88 implements ba2 {
    public static UserAPI a(SubauthNetworkModule subauthNetworkModule, Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        return (UserAPI) g16.e(subauthNetworkModule.o(builder, subauthEnvironment));
    }
}
