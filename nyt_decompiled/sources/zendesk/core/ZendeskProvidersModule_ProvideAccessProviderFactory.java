package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideAccessProviderFactory implements ba2 {
    private final p76 accessServiceProvider;
    private final p76 identityManagerProvider;

    public ZendeskProvidersModule_ProvideAccessProviderFactory(p76 p76Var, p76 p76Var2) {
        this.identityManagerProvider = p76Var;
        this.accessServiceProvider = p76Var2;
    }

    public static ZendeskProvidersModule_ProvideAccessProviderFactory create(p76 p76Var, p76 p76Var2) {
        return new ZendeskProvidersModule_ProvideAccessProviderFactory(p76Var, p76Var2);
    }

    public static AccessProvider provideAccessProvider(Object obj, Object obj2) {
        return (AccessProvider) g16.c(ZendeskProvidersModule.provideAccessProvider((IdentityManager) obj, (AccessService) obj2), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public AccessProvider get() {
        return provideAccessProvider(this.identityManagerProvider.get(), this.accessServiceProvider.get());
    }
}
