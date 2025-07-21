package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory implements ba2 {
    private final p76 sessionStorageProvider;

    public ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory(p76 p76Var) {
        this.sessionStorageProvider = p76Var;
    }

    public static ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory create(p76 p76Var) {
        return new ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory(p76Var);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage) {
        return (ZendeskUnauthorizedInterceptor) g16.c(ZendeskNetworkModule.provideZendeskUnauthorizedInterceptor(sessionStorage), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskUnauthorizedInterceptor get() {
        return provideZendeskUnauthorizedInterceptor((SessionStorage) this.sessionStorageProvider.get());
    }
}
