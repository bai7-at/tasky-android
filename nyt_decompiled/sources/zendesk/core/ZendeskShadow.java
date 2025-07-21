package zendesk.core;

import com.zendesk.logger.Logger;
import defpackage.r48;

/* loaded from: classes5.dex */
final class ZendeskShadow {
    private static final String LOG_TAG = "ZendeskShadow";
    private final BlipsCoreProvider blipsCoreProvider;
    private final CoreModule coreModule;
    private final IdentityManager identityManager;
    private final LegacyIdentityMigrator legacyIdentityMigrator;
    private final ProviderStore providerStore;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final Storage storage;

    ZendeskShadow(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        this.storage = storage;
        this.legacyIdentityMigrator = legacyIdentityMigrator;
        this.identityManager = identityManager;
        this.blipsCoreProvider = blipsCoreProvider;
        this.pushRegistrationProvider = pushRegistrationProvider;
        this.coreModule = coreModule;
        this.providerStore = providerStore;
    }

    private static boolean checkIdentityValid(Identity identity) {
        if (identity == null) {
            Logger.i(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        }
        if (!(identity instanceof AnonymousIdentity) && !(identity instanceof JwtIdentity)) {
            Logger.i(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        }
        if (!(identity instanceof JwtIdentity) || !r48.d(((JwtIdentity) identity).getJwtUserIdentifier())) {
            return true;
        }
        Logger.i(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
        return false;
    }

    void cleanupIfNewConfig(ApplicationConfiguration applicationConfiguration) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            this.pushRegistrationProvider.unregisterDevice(null);
        }
    }

    public CoreModule coreModule() {
        return this.coreModule;
    }

    public Identity getIdentity() {
        return this.identityManager.getIdentity();
    }

    void init(ApplicationConfiguration applicationConfiguration, boolean z) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            Logger.b(LOG_TAG, "SDK app config details have changed, cleaning up old config storage.", new Object[0]);
            this.storage.clear();
            this.storage.storeSdkHash(applicationConfiguration);
        } else if (z) {
            Logger.e(LOG_TAG, "Zendesk is already initialized with these details, skipping.", new Object[0]);
            return;
        }
        this.blipsCoreProvider.coreInitialized();
    }

    public ProviderStore providers() {
        return this.providerStore;
    }

    void reset() {
        this.pushRegistrationProvider.unregisterDevice(null);
        this.storage.getSessionStorage().clear();
        this.storage.clear();
    }

    public void setIdentity(Identity identity) {
        if (checkIdentityValid(identity)) {
            this.legacyIdentityMigrator.checkAndMigrateIdentity();
            if (!this.identityManager.identityIsDifferent(identity)) {
                Logger.e(LOG_TAG, "Zendesk is already initialized with this identity, skipping.", new Object[0]);
                return;
            }
            this.pushRegistrationProvider.unregisterDevice(null);
            this.storage.getSessionStorage().clear();
            this.identityManager.updateAndPersistIdentity(identity);
        }
    }
}
