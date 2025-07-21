package zendesk.core;

import defpackage.mq1;
import java.util.Locale;

/* loaded from: classes5.dex */
class ZendeskStorage implements Storage {
    private static final String SDK_HASH_FORMAT = "%s_%s_%s";
    private static final String SDK_HASH_KEY = "sdk_hash";
    private final MemoryCache memoryCache;
    private final BaseStorage sdkDetailsStorage;
    private final SessionStorage sessionStorage;
    private final SettingsStorage settingsStorage;

    ZendeskStorage(SessionStorage sessionStorage, SettingsStorage settingsStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        this.sessionStorage = sessionStorage;
        this.settingsStorage = settingsStorage;
        this.sdkDetailsStorage = baseStorage;
        this.memoryCache = memoryCache;
    }

    private String generateSdkHash(ApplicationConfiguration applicationConfiguration) {
        Locale locale = Locale.US;
        return mq1.c(String.format(locale, SDK_HASH_FORMAT, applicationConfiguration.getZendeskUrl().toLowerCase(locale), applicationConfiguration.getApplicationId().toLowerCase(locale), applicationConfiguration.getOauthClientId().toLowerCase(locale)));
    }

    @Override // zendesk.core.Storage
    public void clear() {
        this.sessionStorage.clear();
        this.settingsStorage.clear();
        this.memoryCache.clear();
    }

    @Override // zendesk.core.Storage
    public SessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    @Override // zendesk.core.Storage
    public boolean hasSdkConfigChanged(ApplicationConfiguration applicationConfiguration) {
        return !generateSdkHash(applicationConfiguration).equals(this.sdkDetailsStorage.get(SDK_HASH_KEY));
    }

    @Override // zendesk.core.Storage
    public void storeSdkHash(ApplicationConfiguration applicationConfiguration) {
        this.sdkDetailsStorage.put(SDK_HASH_KEY, generateSdkHash(applicationConfiguration));
    }
}
