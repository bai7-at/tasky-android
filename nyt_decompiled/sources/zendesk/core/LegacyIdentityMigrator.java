package zendesk.core;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.zendesk.logger.Logger;
import defpackage.r48;
import zendesk.core.AnonymousIdentity;

/* loaded from: classes5.dex */
class LegacyIdentityMigrator {
    private static final String ANONYMOUS_EMAIL_KEY = "email";
    private static final String ANONYMOUS_NAME_KEY = "name";
    private static final String JWT_TOKEN_KEY = "token";
    private static final String LEGACY_ACCESS_TOKEN_KEY = "access_token";
    private static final String LEGACY_ACCESS_TOKEN_USER_ID_KEY = "user_id";
    private static final String LEGACY_IDENTITY_KEY = "zendesk-identity";
    private static final String LEGACY_IDENTITY_TYPE_KEY = "zendesk-identity-type";
    private static final String LEGACY_PUSH_DEVICE_ID_KEY = "identifier";
    private static final String LEGACY_PUSH_RESPONSE_KEY = "pushRegResponseIdentifier";
    private static final String LEGACY_SDK_GUID_KEY = "uuid";
    private static final String LEGACY_STORED_TOKEN_KEY = "stored_token";
    private static final String LEGACY_USER_ID_KEY = "user_id";
    private static final String LOG_TAG = "LegacyIdentityStorage";
    private IdentityManager identityManager;
    private IdentityStorage identityStorage;
    private SharedPreferencesStorage legacyIdentityStorage;
    private SharedPreferencesStorage legacyPushStorage;
    private PushDeviceIdStorage pushDeviceIdStorage;

    /* renamed from: zendesk.core.LegacyIdentityMigrator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$AuthenticationType;

        static {
            int[] iArr = new int[AuthenticationType.values().length];
            $SwitchMap$zendesk$core$AuthenticationType = iArr;
            try {
                iArr[AuthenticationType.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$AuthenticationType[AuthenticationType.JWT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    LegacyIdentityMigrator(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage, IdentityManager identityManager, PushDeviceIdStorage pushDeviceIdStorage) {
        this.legacyIdentityStorage = sharedPreferencesStorage;
        this.legacyPushStorage = sharedPreferencesStorage2;
        this.identityStorage = identityStorage;
        this.identityManager = identityManager;
        this.pushDeviceIdStorage = pushDeviceIdStorage;
    }

    private void clear() {
        this.legacyIdentityStorage.remove(LEGACY_IDENTITY_TYPE_KEY);
        this.legacyIdentityStorage.remove(LEGACY_IDENTITY_KEY);
        this.legacyIdentityStorage.remove(LEGACY_STORED_TOKEN_KEY);
        this.legacyIdentityStorage.remove(LEGACY_SDK_GUID_KEY);
        this.legacyIdentityStorage.remove(com.facebook.AccessToken.USER_ID_KEY);
        this.legacyPushStorage.remove(LEGACY_PUSH_RESPONSE_KEY);
    }

    private AccessToken getLegacyAccessToken() {
        String str = this.legacyIdentityStorage.get(LEGACY_STORED_TOKEN_KEY);
        if (r48.d(str)) {
            return null;
        }
        try {
            JsonElement parse = new JsonParser().parse(str);
            if (parse != null && parse.isJsonObject()) {
                JsonObject asJsonObject = parse.getAsJsonObject();
                JsonElement jsonElement = asJsonObject.get("access_token");
                JsonElement jsonElement2 = asJsonObject.get(com.facebook.AccessToken.USER_ID_KEY);
                if (jsonElement != null && jsonElement2 != null) {
                    return new AccessToken(jsonElement.getAsString(), jsonElement2.getAsString());
                }
            }
            return null;
        } catch (JsonSyntaxException e) {
            Logger.h(LOG_TAG, "Unable to read legacy AccessToken.", e, new Object[0]);
            return null;
        }
    }

    private Identity getLegacyIdentity() {
        AuthenticationType legacyIdentityType = getLegacyIdentityType();
        if (legacyIdentityType == null) {
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$zendesk$core$AuthenticationType[legacyIdentityType.ordinal()];
        if (i == 1) {
            return readLegacyAnonymousIdentity();
        }
        if (i != 2) {
            return null;
        }
        return readLegacyJwtIdentity();
    }

    private AuthenticationType getLegacyIdentityType() {
        return AuthenticationType.getAuthType(this.legacyIdentityStorage.get(LEGACY_IDENTITY_TYPE_KEY));
    }

    private String getLegacyPushId() {
        JsonElement jsonElement;
        String str = this.legacyPushStorage.get(LEGACY_PUSH_RESPONSE_KEY);
        if (r48.b(str)) {
            try {
                JsonElement parse = new JsonParser().parse(str);
                if (parse != null && parse.isJsonObject() && (jsonElement = parse.getAsJsonObject().get(LEGACY_PUSH_DEVICE_ID_KEY)) != null) {
                    return jsonElement.getAsString();
                }
            } catch (JsonSyntaxException e) {
                Logger.h(LOG_TAG, "Unable to read legacy push device ID.", e, new Object[0]);
            }
        }
        return null;
    }

    private String getLegacySdkGuid() {
        return this.legacyIdentityStorage.get(LEGACY_SDK_GUID_KEY);
    }

    private long getLegacyUserId() {
        return this.legacyIdentityStorage.getLong(com.facebook.AccessToken.USER_ID_KEY);
    }

    private AnonymousIdentity readLegacyAnonymousIdentity() {
        String str = this.legacyIdentityStorage.get(LEGACY_IDENTITY_KEY);
        if (r48.d(str)) {
            return null;
        }
        try {
            JsonElement parse = new JsonParser().parse(str);
            if (parse != null && parse.isJsonObject()) {
                JsonObject asJsonObject = parse.getAsJsonObject();
                AnonymousIdentity.Builder builder = new AnonymousIdentity.Builder();
                JsonElement jsonElement = asJsonObject.get("email");
                if (jsonElement != null) {
                    builder.withEmailIdentifier(jsonElement.getAsString());
                }
                JsonElement jsonElement2 = asJsonObject.get("name");
                if (jsonElement2 != null) {
                    builder.withNameIdentifier(jsonElement2.getAsString());
                }
                return (AnonymousIdentity) builder.build();
            }
            return null;
        } catch (JsonSyntaxException e) {
            Logger.h(LOG_TAG, "Unable to read legacy AnonymousIdentity.", e, new Object[0]);
            return null;
        }
    }

    private JwtIdentity readLegacyJwtIdentity() {
        JsonObject asJsonObject;
        JsonElement jsonElement;
        String str = this.legacyIdentityStorage.get(LEGACY_IDENTITY_KEY);
        if (r48.d(str)) {
            return null;
        }
        try {
            JsonElement parse = new JsonParser().parse(str);
            if (parse == null || (asJsonObject = parse.getAsJsonObject()) == null || (jsonElement = asJsonObject.get(JWT_TOKEN_KEY)) == null) {
                return null;
            }
            return new JwtIdentity(jsonElement.getAsString());
        } catch (JsonSyntaxException e) {
            Logger.h(LOG_TAG, "Unable to read legacy JwtIdentity.", e, new Object[0]);
            return null;
        }
    }

    void checkAndMigrateIdentity() {
        Identity legacyIdentity = getLegacyIdentity();
        if (legacyIdentity == null) {
            return;
        }
        this.identityStorage.storeIdentity(legacyIdentity);
        long legacyUserId = getLegacyUserId();
        if (legacyUserId != 0) {
            this.identityStorage.storeUserId(Long.valueOf(legacyUserId));
        }
        AccessToken legacyAccessToken = getLegacyAccessToken();
        if (legacyAccessToken != null) {
            this.identityManager.storeAccessToken(legacyAccessToken);
        }
        if (getLegacyIdentityType() == AuthenticationType.ANONYMOUS) {
            String legacySdkGuid = getLegacySdkGuid();
            if (r48.b(legacySdkGuid)) {
                this.identityStorage.storeSdkGuid(legacySdkGuid);
            }
        }
        String legacyPushId = getLegacyPushId();
        if (r48.b(legacyPushId)) {
            this.pushDeviceIdStorage.storeRegisteredDeviceId(legacyPushId);
        }
        clear();
    }
}
