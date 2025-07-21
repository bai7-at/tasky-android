package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideZendeskFactory implements ba2 {
    private final p76 blipsCoreProvider;
    private final p76 coreModuleProvider;
    private final p76 identityManagerProvider;
    private final p76 legacyIdentityMigratorProvider;
    private final p76 providerStoreProvider;
    private final p76 pushRegistrationProvider;
    private final p76 storageProvider;

    public ZendeskApplicationModule_ProvideZendeskFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7) {
        this.storageProvider = p76Var;
        this.legacyIdentityMigratorProvider = p76Var2;
        this.identityManagerProvider = p76Var3;
        this.blipsCoreProvider = p76Var4;
        this.pushRegistrationProvider = p76Var5;
        this.coreModuleProvider = p76Var6;
        this.providerStoreProvider = p76Var7;
    }

    public static ZendeskApplicationModule_ProvideZendeskFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7) {
        return new ZendeskApplicationModule_ProvideZendeskFactory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7);
    }

    public static ZendeskShadow provideZendesk(Object obj, Object obj2, Object obj3, Object obj4, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        return (ZendeskShadow) g16.c(ZendeskApplicationModule.provideZendesk((Storage) obj, (LegacyIdentityMigrator) obj2, (IdentityManager) obj3, (BlipsCoreProvider) obj4, pushRegistrationProvider, coreModule, providerStore), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskShadow get() {
        return provideZendesk(this.storageProvider.get(), this.legacyIdentityMigratorProvider.get(), this.identityManagerProvider.get(), this.blipsCoreProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get(), (CoreModule) this.coreModuleProvider.get(), (ProviderStore) this.providerStoreProvider.get());
    }
}
