package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProviderBlipsProviderFactory implements ba2 {
    private final p76 zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsProviderFactory(p76 p76Var) {
        this.zendeskBlipsProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProviderBlipsProviderFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProviderBlipsProviderFactory(p76Var);
    }

    public static BlipsProvider providerBlipsProvider(Object obj) {
        return (BlipsProvider) g16.c(ZendeskProvidersModule.providerBlipsProvider((ZendeskBlipsProvider) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public BlipsProvider get() {
        return providerBlipsProvider(this.zendeskBlipsProvider.get());
    }
}
