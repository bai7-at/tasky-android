package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ProviderModule_ProvideProviderStoreFactory implements ba2 {
    private final p76 helpCenterProvider;
    private final ProviderModule module;
    private final p76 requestProvider;
    private final p76 uploadProvider;

    public ProviderModule_ProvideProviderStoreFactory(ProviderModule providerModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.module = providerModule;
        this.helpCenterProvider = p76Var;
        this.requestProvider = p76Var2;
        this.uploadProvider = p76Var3;
    }

    public static ProviderModule_ProvideProviderStoreFactory create(ProviderModule providerModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new ProviderModule_ProvideProviderStoreFactory(providerModule, p76Var, p76Var2, p76Var3);
    }

    public static ProviderStore provideProviderStore(ProviderModule providerModule, HelpCenterProvider helpCenterProvider, RequestProvider requestProvider, UploadProvider uploadProvider) {
        return (ProviderStore) g16.c(providerModule.provideProviderStore(helpCenterProvider, requestProvider, uploadProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ProviderStore get() {
        return provideProviderStore(this.module, (HelpCenterProvider) this.helpCenterProvider.get(), (RequestProvider) this.requestProvider.get(), (UploadProvider) this.uploadProvider.get());
    }
}
