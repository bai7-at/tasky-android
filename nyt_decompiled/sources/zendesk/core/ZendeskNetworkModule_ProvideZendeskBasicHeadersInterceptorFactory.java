package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory implements ba2 {
    private final p76 configurationProvider;
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var) {
        this.module = zendeskNetworkModule;
        this.configurationProvider = p76Var;
    }

    public static ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule, p76 p76Var) {
        return new ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory(zendeskNetworkModule, p76Var);
    }

    public static ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ZendeskNetworkModule zendeskNetworkModule, ApplicationConfiguration applicationConfiguration) {
        return (ZendeskOauthIdHeaderInterceptor) g16.c(zendeskNetworkModule.provideZendeskBasicHeadersInterceptor(applicationConfiguration), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskOauthIdHeaderInterceptor get() {
        return provideZendeskBasicHeadersInterceptor(this.module, (ApplicationConfiguration) this.configurationProvider.get());
    }
}
