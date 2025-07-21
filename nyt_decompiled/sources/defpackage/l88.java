package defpackage;

import com.nytimes.android.subauth.core.auth.network.NYTSubauthPollAPI;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class l88 implements ba2 {
    public static NYTSubauthPollAPI a(SubauthNetworkModule subauthNetworkModule, Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        return (NYTSubauthPollAPI) g16.e(subauthNetworkModule.f(builder, subauthEnvironment));
    }
}
