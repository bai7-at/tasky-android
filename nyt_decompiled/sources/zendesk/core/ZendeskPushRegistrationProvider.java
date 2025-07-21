package zendesk.core;

import com.zendesk.logger.Logger;
import defpackage.e17;
import defpackage.r48;
import defpackage.r74;
import defpackage.tm9;
import defpackage.z22;
import java.io.IOException;
import java.util.Locale;
import retrofit2.Response;

/* loaded from: classes5.dex */
class ZendeskPushRegistrationProvider implements PushRegistrationProvider, PushRegistrationProviderInternal {
    private static final String LOG_TAG = "PushRegistrationProvider";
    private static final e17.b PUSH_RESPONSE_EXTRACTOR = new e17.b() { // from class: zendesk.core.ZendeskPushRegistrationProvider.4
        @Override // e17.b
        public String extract(PushRegistrationResponseWrapper pushRegistrationResponseWrapper) {
            return (pushRegistrationResponseWrapper == null || pushRegistrationResponseWrapper.getRegistrationResponse() == null || !r48.b(pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier())) ? "" : pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier();
        }
    };
    private final BlipsCoreProvider blipsProvider;
    private final IdentityManager identityManager;
    private final Locale locale;
    private final PushDeviceIdStorage pushIdStorage;
    private final PushRegistrationService pushService;
    private final SettingsProvider settingsProvider;

    enum TokenType {
        Identifier(null),
        UrbanAirshipChannelId("urban_airship_channel_id");

        final String name;

        TokenType(String str) {
            this.name = str;
        }

        String getName() {
            return this.name;
        }
    }

    ZendeskPushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Locale locale) {
        this.pushService = pushRegistrationService;
        this.identityManager = identityManager;
        this.settingsProvider = settingsProvider;
        this.blipsProvider = blipsCoreProvider;
        this.pushIdStorage = pushDeviceIdStorage;
        this.locale = locale;
    }

    private boolean checkForStoredPushRegistration(String str, tm9 tm9Var) {
        if (!r48.b(str)) {
            if (tm9Var != null) {
                tm9Var.onError(new z22("Invalid identifier provided."));
            }
            Logger.i(LOG_TAG, "Invalid identifier provided.", new Object[0]);
            return true;
        }
        if (this.pushIdStorage.hasRegisteredDeviceId() && str.equals(this.pushIdStorage.getRegisteredDeviceId())) {
            if (tm9Var != null) {
                tm9Var.onSuccess(str);
            }
            Logger.b(LOG_TAG, "Skipping registration because device is already registered with this ID.", new Object[0]);
            return true;
        }
        if (this.pushIdStorage.hasRegisteredDeviceId()) {
            this.pushIdStorage.removeRegisteredDeviceId();
            Logger.b(LOG_TAG, "Removing stored push registration response because a new one has been provided.", new Object[0]);
        }
        return false;
    }

    private void getAuthTypeAndRequest(final String str, final TokenType tokenType, final tm9 tm9Var) {
        if (checkForStoredPushRegistration(str, tm9Var)) {
            return;
        }
        this.settingsProvider.getCoreSettings(new PassThroughErrorZendeskCallback<CoreSettings>(tm9Var) { // from class: zendesk.core.ZendeskPushRegistrationProvider.1
            @Override // zendesk.core.PassThroughErrorZendeskCallback, defpackage.tm9
            public void onSuccess(CoreSettings coreSettings) {
                AuthenticationType authentication = coreSettings.getAuthentication();
                if (authentication == null) {
                    tm9 tm9Var2 = tm9Var;
                    if (tm9Var2 != null) {
                        tm9Var2.onError(new z22("Authentication type is null."));
                        return;
                    }
                    return;
                }
                ZendeskPushRegistrationProvider zendeskPushRegistrationProvider = ZendeskPushRegistrationProvider.this;
                PushRegistrationRequest pushRegistrationRequest = zendeskPushRegistrationProvider.getPushRegistrationRequest(str, zendeskPushRegistrationProvider.locale, authentication, tokenType);
                if (ZendeskPushRegistrationProvider.this.hasNoStoredAccessToken()) {
                    ZendeskPushRegistrationProvider.this.storePendingPushRegistrationRequest(pushRegistrationRequest, tm9Var);
                } else {
                    ZendeskPushRegistrationProvider.this.sendPushRegistrationRequest(pushRegistrationRequest, tm9Var);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PushRegistrationRequest getPushRegistrationRequest(String str, Locale locale, AuthenticationType authenticationType, TokenType tokenType) {
        PushRegistrationRequest pushRegistrationRequest = new PushRegistrationRequest();
        pushRegistrationRequest.setIdentifier(str);
        pushRegistrationRequest.setLocale(r74.a(locale));
        if (tokenType == TokenType.UrbanAirshipChannelId) {
            pushRegistrationRequest.setTokenType(tokenType.name);
        }
        if (AuthenticationType.ANONYMOUS == authenticationType) {
            pushRegistrationRequest.setSdkGuid(this.identityManager.getSdkGuid());
        }
        return pushRegistrationRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasNoStoredAccessToken() {
        return this.identityManager.getStoredAccessTokenAsBearerToken() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccessfulRegistration(String str) {
        this.pushIdStorage.storeRegisteredDeviceId(str);
        this.pushIdStorage.removePushRegistrationRequest();
        this.blipsProvider.corePushEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, final tm9 tm9Var) {
        this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).enqueue(new e17(new PassThroughErrorZendeskCallback<String>(tm9Var) { // from class: zendesk.core.ZendeskPushRegistrationProvider.3
            @Override // zendesk.core.PassThroughErrorZendeskCallback, defpackage.tm9
            public void onSuccess(String str) {
                ZendeskPushRegistrationProvider.this.onSuccessfulRegistration(str);
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(str);
                }
            }
        }, PUSH_RESPONSE_EXTRACTOR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storePendingPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, tm9 tm9Var) {
        this.pushIdStorage.storePushRegistrationRequest(pushRegistrationRequest);
        if (tm9Var != null) {
            tm9Var.onSuccess(pushRegistrationRequest.getIdentifier());
        }
    }

    @Override // zendesk.core.PushRegistrationProvider
    public boolean isRegisteredForPush() {
        return this.pushIdStorage.hasRegisteredDeviceId();
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void registerWithDeviceIdentifier(String str, tm9 tm9Var) {
        getAuthTypeAndRequest(str, TokenType.Identifier, tm9Var);
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void registerWithUAChannelId(String str, tm9 tm9Var) {
        getAuthTypeAndRequest(str, TokenType.UrbanAirshipChannelId, tm9Var);
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void unregisterDevice(final tm9 tm9Var) {
        String registeredDeviceId = this.pushIdStorage.getRegisteredDeviceId();
        final Long userId = this.identityManager.getUserId();
        if (registeredDeviceId != null) {
            this.pushService.unregisterDevice(registeredDeviceId).enqueue(new e17(new PassThroughErrorZendeskCallback<Void>(tm9Var) { // from class: zendesk.core.ZendeskPushRegistrationProvider.2
                @Override // zendesk.core.PassThroughErrorZendeskCallback, defpackage.tm9
                public void onSuccess(Void r3) {
                    ZendeskPushRegistrationProvider.this.pushIdStorage.removeRegisteredDeviceId();
                    ZendeskPushRegistrationProvider.this.blipsProvider.corePushDisabled(userId);
                    tm9 tm9Var2 = tm9Var;
                    if (tm9Var2 != null) {
                        tm9Var2.onSuccess(r3);
                    }
                }
            }));
        }
    }

    @Override // zendesk.core.PushRegistrationProviderInternal
    public String sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest) {
        try {
            Response<PushRegistrationResponseWrapper> execute = this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).execute();
            if (execute.body() == null || execute.body().getRegistrationResponse() == null) {
                return "";
            }
            String identifier = execute.body().getRegistrationResponse().getIdentifier();
            onSuccessfulRegistration(identifier);
            return identifier;
        } catch (IOException e) {
            Logger.c(LOG_TAG, "Push registration request failed.", e, new Object[0]);
            return "";
        }
    }
}
