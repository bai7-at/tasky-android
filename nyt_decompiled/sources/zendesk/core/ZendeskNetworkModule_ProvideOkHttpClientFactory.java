package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideOkHttpClientFactory implements ba2 {
    private final p76 acceptHeaderInterceptorProvider;
    private final p76 accessInterceptorProvider;
    private final p76 authHeaderInterceptorProvider;
    private final p76 cacheProvider;
    private final ZendeskNetworkModule module;
    private final p76 okHttpClientProvider;
    private final p76 pushInterceptorProvider;
    private final p76 settingsInterceptorProvider;
    private final p76 unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = p76Var;
        this.accessInterceptorProvider = p76Var2;
        this.unauthorizedInterceptorProvider = p76Var3;
        this.authHeaderInterceptorProvider = p76Var4;
        this.settingsInterceptorProvider = p76Var5;
        this.acceptHeaderInterceptorProvider = p76Var6;
        this.pushInterceptorProvider = p76Var7;
        this.cacheProvider = p76Var8;
    }

    public static ZendeskNetworkModule_ProvideOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8) {
        return new ZendeskNetworkModule_ProvideOkHttpClientFactory(zendeskNetworkModule, p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7, p76Var8);
    }

    public static OkHttpClient provideOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Cache cache) {
        return (OkHttpClient) g16.c(zendeskNetworkModule.provideOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskUnauthorizedInterceptor) obj2, (ZendeskAuthHeaderInterceptor) obj3, (ZendeskSettingsInterceptor) obj4, (AcceptHeaderInterceptor) obj5, (ZendeskPushInterceptor) obj6, cache), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public OkHttpClient get() {
        return provideOkHttpClient(this.module, (OkHttpClient) this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get(), this.pushInterceptorProvider.get(), (Cache) this.cacheProvider.get());
    }
}
