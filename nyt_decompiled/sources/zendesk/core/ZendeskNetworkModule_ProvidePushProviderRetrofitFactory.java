package zendesk.core;

import com.google.gson.Gson;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvidePushProviderRetrofitFactory implements ba2 {
    private final p76 authHeaderInterceptorProvider;
    private final p76 configurationProvider;
    private final p76 gsonProvider;
    private final p76 okHttpClientProvider;

    public ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.configurationProvider = p76Var;
        this.gsonProvider = p76Var2;
        this.okHttpClientProvider = p76Var3;
        this.authHeaderInterceptorProvider = p76Var4;
    }

    public static ZendeskNetworkModule_ProvidePushProviderRetrofitFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static Retrofit providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient, Object obj) {
        return (Retrofit) g16.c(ZendeskNetworkModule.providePushProviderRetrofit(applicationConfiguration, gson, okHttpClient, (ZendeskAuthHeaderInterceptor) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Retrofit get() {
        return providePushProviderRetrofit((ApplicationConfiguration) this.configurationProvider.get(), (Gson) this.gsonProvider.get(), (OkHttpClient) this.okHttpClientProvider.get(), this.authHeaderInterceptorProvider.get());
    }
}
