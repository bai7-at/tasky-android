package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideBaseOkHttpClientFactory implements ba2 {
    private final p76 executorServiceProvider;
    private final p76 loggingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final p76 oauthIdHeaderInterceptorProvider;
    private final p76 userAgentAndClientHeadersInterceptorProvider;

    public ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.module = zendeskNetworkModule;
        this.loggingInterceptorProvider = p76Var;
        this.oauthIdHeaderInterceptorProvider = p76Var2;
        this.userAgentAndClientHeadersInterceptorProvider = p76Var3;
        this.executorServiceProvider = p76Var4;
    }

    public static ZendeskNetworkModule_ProvideBaseOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(zendeskNetworkModule, p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static OkHttpClient provideBaseOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, HttpLoggingInterceptor httpLoggingInterceptor, Object obj, Object obj2, ExecutorService executorService) {
        return (OkHttpClient) g16.c(zendeskNetworkModule.provideBaseOkHttpClient(httpLoggingInterceptor, (ZendeskOauthIdHeaderInterceptor) obj, (UserAgentAndClientHeadersInterceptor) obj2, executorService), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public OkHttpClient get() {
        return provideBaseOkHttpClient(this.module, (HttpLoggingInterceptor) this.loggingInterceptorProvider.get(), this.oauthIdHeaderInterceptorProvider.get(), this.userAgentAndClientHeadersInterceptorProvider.get(), (ExecutorService) this.executorServiceProvider.get());
    }
}
