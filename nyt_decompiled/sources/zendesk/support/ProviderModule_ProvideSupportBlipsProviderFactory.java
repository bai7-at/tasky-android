package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.BlipsProvider;

/* loaded from: classes5.dex */
public final class ProviderModule_ProvideSupportBlipsProviderFactory implements ba2 {
    private final p76 blipsProvider;
    private final ProviderModule module;

    public ProviderModule_ProvideSupportBlipsProviderFactory(ProviderModule providerModule, p76 p76Var) {
        this.module = providerModule;
        this.blipsProvider = p76Var;
    }

    public static ProviderModule_ProvideSupportBlipsProviderFactory create(ProviderModule providerModule, p76 p76Var) {
        return new ProviderModule_ProvideSupportBlipsProviderFactory(providerModule, p76Var);
    }

    public static SupportBlipsProvider provideSupportBlipsProvider(ProviderModule providerModule, BlipsProvider blipsProvider) {
        return (SupportBlipsProvider) g16.c(providerModule.provideSupportBlipsProvider(blipsProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SupportBlipsProvider get() {
        return provideSupportBlipsProvider(this.module, (BlipsProvider) this.blipsProvider.get());
    }
}
