package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideLegacyIdentityStorageFactory implements ba2 {
    private final p76 identityManagerProvider;
    private final p76 identityStorageProvider;
    private final p76 legacyIdentityBaseStorageProvider;
    private final p76 legacyPushBaseStorageProvider;
    private final p76 pushDeviceIdStorageProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        this.legacyIdentityBaseStorageProvider = p76Var;
        this.legacyPushBaseStorageProvider = p76Var2;
        this.identityStorageProvider = p76Var3;
        this.identityManagerProvider = p76Var4;
        this.pushDeviceIdStorageProvider = p76Var5;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityStorageFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        return new ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5);
    }

    public static LegacyIdentityMigrator provideLegacyIdentityStorage(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (LegacyIdentityMigrator) g16.c(ZendeskStorageModule.provideLegacyIdentityStorage((SharedPreferencesStorage) obj, (SharedPreferencesStorage) obj2, (IdentityStorage) obj3, (IdentityManager) obj4, (PushDeviceIdStorage) obj5), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public LegacyIdentityMigrator get() {
        return provideLegacyIdentityStorage(this.legacyIdentityBaseStorageProvider.get(), this.legacyPushBaseStorageProvider.get(), this.identityStorageProvider.get(), this.identityManagerProvider.get(), this.pushDeviceIdStorageProvider.get());
    }
}
