package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory implements ba2 {
    private final p76 identityManagerProvider;

    public ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(p76 p76Var) {
        this.identityManagerProvider = p76Var;
    }

    public static ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory create(p76 p76Var) {
        return new ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(p76Var);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(Object obj) {
        return (ZendeskAuthHeaderInterceptor) g16.c(ZendeskNetworkModule.provideAuthHeaderInterceptor((IdentityManager) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskAuthHeaderInterceptor get() {
        return provideAuthHeaderInterceptor(this.identityManagerProvider.get());
    }
}
