package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideRestServiceProviderFactory implements ba2 {
    private final p76 coreOkHttpClientProvider;
    private final p76 mediaOkHttpClientProvider;
    private final ZendeskNetworkModule module;
    private final p76 retrofitProvider;
    private final p76 standardOkHttpClientProvider;

    public ZendeskNetworkModule_ProvideRestServiceProviderFactory(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.module = zendeskNetworkModule;
        this.retrofitProvider = p76Var;
        this.mediaOkHttpClientProvider = p76Var2;
        this.standardOkHttpClientProvider = p76Var3;
        this.coreOkHttpClientProvider = p76Var4;
    }

    public static ZendeskNetworkModule_ProvideRestServiceProviderFactory create(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new ZendeskNetworkModule_ProvideRestServiceProviderFactory(zendeskNetworkModule, p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static RestServiceProvider provideRestServiceProvider(ZendeskNetworkModule zendeskNetworkModule, Retrofit retrofit, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        return (RestServiceProvider) g16.c(zendeskNetworkModule.provideRestServiceProvider(retrofit, okHttpClient, okHttpClient2, okHttpClient3), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public RestServiceProvider get() {
        return provideRestServiceProvider(this.module, (Retrofit) this.retrofitProvider.get(), (OkHttpClient) this.mediaOkHttpClientProvider.get(), (OkHttpClient) this.standardOkHttpClientProvider.get(), (OkHttpClient) this.coreOkHttpClientProvider.get());
    }
}
