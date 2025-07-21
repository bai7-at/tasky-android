package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideProviderStoreFactory implements ba2 {
    private final p76 pushRegistrationProvider;
    private final p76 userProvider;

    public ZendeskProvidersModule_ProvideProviderStoreFactory(p76 p76Var, p76 p76Var2) {
        this.userProvider = p76Var;
        this.pushRegistrationProvider = p76Var2;
    }

    public static ZendeskProvidersModule_ProvideProviderStoreFactory create(p76 p76Var, p76 p76Var2) {
        return new ZendeskProvidersModule_ProvideProviderStoreFactory(p76Var, p76Var2);
    }

    public static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        return (ProviderStore) g16.c(ZendeskProvidersModule.provideProviderStore(userProvider, pushRegistrationProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ProviderStore get() {
        return provideProviderStore((UserProvider) this.userProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get());
    }
}
