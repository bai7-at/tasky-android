package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideCoreOkHttpClientFactory implements ba2 {
    private final p76 acceptHeaderInterceptorProvider;
    private final p76 acceptLanguageHeaderInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final p76 okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = p76Var;
        this.acceptLanguageHeaderInterceptorProvider = p76Var2;
        this.acceptHeaderInterceptorProvider = p76Var3;
    }

    public static ZendeskNetworkModule_ProvideCoreOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(zendeskNetworkModule, p76Var, p76Var2, p76Var3);
    }

    public static OkHttpClient provideCoreOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2) {
        return (OkHttpClient) g16.c(zendeskNetworkModule.provideCoreOkHttpClient(okHttpClient, (AcceptLanguageHeaderInterceptor) obj, (AcceptHeaderInterceptor) obj2), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public OkHttpClient get() {
        return provideCoreOkHttpClient(this.module, (OkHttpClient) this.okHttpClientProvider.get(), this.acceptLanguageHeaderInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get());
    }
}
