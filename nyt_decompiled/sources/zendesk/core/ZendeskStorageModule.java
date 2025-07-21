package zendesk.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.io.File;
import java.util.Locale;
import okhttp3.Cache;

/* loaded from: classes5.dex */
class ZendeskStorageModule {
    private static final String BASE_STORAGE_ADDITIONAL_SDK = "base_storage_additional_sdk";
    static final String BASE_STORAGE_DISK_LRU = "base_storage_disk_lru";
    private static final String BASE_STORAGE_IDENTITY = "base_storage_identity";
    private static final String BASE_STORAGE_LEGACY_IDENTITY = "base_storage_legacy_identity";
    private static final String BASE_STORAGE_LEGACY_PUSH = "base_storage_legacy_push";
    private static final String BASE_STORAGE_SDK = "base_storage_sdk";
    private static final String BASE_STORAGE_SETTINGS = "base_storage_settings";
    private static final String BELVEDERE_DIR = "belvedere_dir";
    private static final String CACHE_DIR = "cache_dir";
    private static final String DATA_DIR = "data_dir";
    static final String GSON_SERIALIZER = "gson_serializer";
    private static final String LEGACY_IDENTITY_STORAGE_FILE_NAME = "zendesk-token";
    private static final String LEGACY_PUSH_ID_STORAGE_FILE_NAME = "zendesk-push-token";
    private static final int MAX_CACHE_SIZE = 20971520;
    private static final String STORAGE_BELVEDERE_CACHE;
    private static final String STORAGE_NAME_ADDITIONAL_SDK = "additional_sdk";
    private static final String STORAGE_NAME_CORE_SDK = "sdk";
    private static final String STORAGE_NAME_IDENTITY = "identity";
    private static final String STORAGE_NAME_MEDIA_CACHE = "media_cache";
    private static final String STORAGE_NAME_RESPONSE_CACHE = "response_cache";
    private static final String STORAGE_NAME_SETTINGS = "settings";
    private static final String ZENDESK_DIR_NAME = "zendesk";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("belvedere-data-v2");
        String str = File.separator;
        sb.append(str);
        sb.append("user");
        sb.append(str);
        sb.append(ZENDESK_DIR_NAME);
        STORAGE_BELVEDERE_CACHE = sb.toString();
    }

    ZendeskStorageModule() {
    }

    private static SharedPreferences getSharedPrefs(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    static BaseStorage provideAdditionalSdkBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName(STORAGE_NAME_ADDITIONAL_SDK)), serializer);
    }

    static AuthenticationProvider provideAuthProvider(IdentityManager identityManager) {
        return new ZendeskAuthenticationProvider(identityManager);
    }

    static Cache provideCache(File file) {
        return new Cache(new File(file, storageName(STORAGE_NAME_RESPONSE_CACHE)), 20971520L);
    }

    static CoreSettingsStorage provideCoreSettingsStorage(SettingsStorage settingsStorage) {
        return new ZendeskCoreSettingsStorage(settingsStorage);
    }

    static BaseStorage provideIdentityBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName(STORAGE_NAME_IDENTITY)), serializer);
    }

    static IdentityManager provideIdentityManager(IdentityStorage identityStorage) {
        return new ZendeskIdentityManager(identityStorage);
    }

    static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        return new ZendeskIdentityStorage(baseStorage);
    }

    static SharedPreferencesStorage provideLegacyIdentityBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, LEGACY_IDENTITY_STORAGE_FILE_NAME), serializer);
    }

    static LegacyIdentityMigrator provideLegacyIdentityStorage(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage, IdentityManager identityManager, PushDeviceIdStorage pushDeviceIdStorage) {
        return new LegacyIdentityMigrator(sharedPreferencesStorage, sharedPreferencesStorage2, identityStorage, identityManager, pushDeviceIdStorage);
    }

    static SharedPreferencesStorage provideLegacyPushBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, LEGACY_PUSH_ID_STORAGE_FILE_NAME), serializer);
    }

    static MemoryCache provideMemoryCache() {
        return new ZendeskLruMemoryCache();
    }

    static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        return new ZendeskPushDeviceIdStorage(baseStorage);
    }

    static BaseStorage provideSdkBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName(STORAGE_NAME_CORE_SDK)), serializer);
    }

    static Storage provideSdkStorage(SettingsStorage settingsStorage, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        return new ZendeskStorage(sessionStorage, settingsStorage, baseStorage, memoryCache);
    }

    static Serializer provideSerializer(Gson gson) {
        return new GsonSerializer(gson);
    }

    static SessionStorage provideSessionStorage(IdentityStorage identityStorage, BaseStorage baseStorage, BaseStorage baseStorage2, Cache cache, File file, File file2, File file3) {
        return new ZendeskSessionStorage(identityStorage, baseStorage, cache, baseStorage2, file, file2, file3);
    }

    static BaseStorage provideSettingsBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName(STORAGE_NAME_SETTINGS)), serializer);
    }

    static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        return new ZendeskSettingsStorage(baseStorage);
    }

    static File providesBelvedereDir(Context context) {
        return new File(context.getCacheDir(), STORAGE_BELVEDERE_CACHE);
    }

    static File providesCacheDir(Context context) {
        return new File(context.getCacheDir(), ZENDESK_DIR_NAME);
    }

    static File providesDataDir(Context context) {
        return new File(context.getFilesDir(), ZENDESK_DIR_NAME);
    }

    static BaseStorage providesDiskLruStorage(File file, Serializer serializer) {
        return new ZendeskDiskLruCache(new File(file, storageName(STORAGE_NAME_MEDIA_CACHE)), serializer, MAX_CACHE_SIZE);
    }

    private static String storageName(String str) {
        return String.format(Locale.US, "zendesk_%s", str);
    }
}
