package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideMediaOkHttpClientFactory implements ba2 {
    private final p76 accessInterceptorProvider;
    private final p76 authHeaderInterceptorProvider;
    private final p76 cachingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final p76 okHttpClientProvider;
    private final p76 settingsInterceptorProvider;
    private final p76 unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = p76Var;
        this.accessInterceptorProvider = p76Var2;
        this.authHeaderInterceptorProvider = p76Var3;
        this.settingsInterceptorProvider = p76Var4;
        this.cachingInterceptorProvider = p76Var5;
        this.unauthorizedInterceptorProvider = p76Var6;
    }

    public static ZendeskNetworkModule_ProvideMediaOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6) {
        return new ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(zendeskNetworkModule, p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6);
    }

    public static OkHttpClient provideMediaOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (OkHttpClient) g16.c(zendeskNetworkModule.provideMediaOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskAuthHeaderInterceptor) obj2, (ZendeskSettingsInterceptor) obj3, (CachingInterceptor) obj4, (ZendeskUnauthorizedInterceptor) obj5), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public OkHttpClient get() {
        return provideMediaOkHttpClient(this.module, (OkHttpClient) this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.cachingInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get());
    }
}
