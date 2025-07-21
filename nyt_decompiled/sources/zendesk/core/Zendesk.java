package zendesk.core;

import android.content.Context;
import com.zendesk.logger.Logger;
import defpackage.r48;

/* loaded from: classes5.dex */
public enum Zendesk {
    INSTANCE;

    private static final String LOG_TAG = "Zendesk";
    private ActionHandlerRegistry actionHandlerRegistry = new ZendeskActionHandlerRegistry();
    private ZendeskShadow zendeskShadow;

    Zendesk() {
    }

    static boolean checkConfig(Context context, String str, String str2, String str3) {
        if (context != null && r48.c(str, str2, str3)) {
            return true;
        }
        Logger.d(LOG_TAG, String.format("Invalid zendesk configuration provided | Context: %b | Url: %b | Application Id: %b | OauthClientId: %b", context, Boolean.valueOf(r48.b(str)), Boolean.valueOf(r48.b(str2)), Boolean.valueOf(r48.b(str3))), new Object[0]);
        return false;
    }

    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    public CoreModule coreModule() {
        if (isInitialized()) {
            return this.zendeskShadow.coreModule();
        }
        Logger.d(LOG_TAG, "Cannot get CoreModule before SDK has been initialized. init() must be called before coreModule().", new Object[0]);
        return null;
    }

    public Identity getIdentity() {
        if (isInitialized()) {
            return this.zendeskShadow.getIdentity();
        }
        return null;
    }

    public void init(Context context, String str, String str2, String str3) {
        checkConfig(context, str, str2, str3);
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration(str2, str, str3);
        init(DaggerZendeskApplicationComponent.builder().zendeskApplicationModule(new ZendeskApplicationModule(context, applicationConfiguration)).build(), applicationConfiguration);
    }

    public boolean isInitialized() {
        return this.zendeskShadow != null;
    }

    public ProviderStore provider() {
        if (!isInitialized()) {
            Logger.d(LOG_TAG, "Cannot get ProviderStore before SDK has been initialized. init() must be called before provider().", new Object[0]);
            return null;
        }
        if (getIdentity() != null) {
            return this.zendeskShadow.providers();
        }
        Logger.d(LOG_TAG, "Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider().", new Object[0]);
        return null;
    }

    void reset() {
        if (!isInitialized()) {
            Logger.e(LOG_TAG, "Cant reset, Zendesk is uninitialized", new Object[0]);
            return;
        }
        this.zendeskShadow.reset();
        this.zendeskShadow = null;
        Logger.e(LOG_TAG, "Tearing down Zendesk", new Object[0]);
    }

    public void setIdentity(Identity identity) {
        if (isInitialized()) {
            this.zendeskShadow.setIdentity(identity);
        } else {
            Logger.d(LOG_TAG, "Cannot get set identity before SDK has been initialized. init() must be called before setIdentity(...).", new Object[0]);
        }
    }

    void init(ZendeskApplicationComponent zendeskApplicationComponent, ApplicationConfiguration applicationConfiguration) {
        ZendeskShadow zendeskShadow = this.zendeskShadow;
        boolean z = zendeskShadow != null;
        if (z) {
            zendeskShadow.cleanupIfNewConfig(applicationConfiguration);
        }
        ZendeskShadow zendeskShadow2 = zendeskApplicationComponent.zendeskShadow();
        zendeskShadow2.init(applicationConfiguration, z);
        this.zendeskShadow = zendeskShadow2;
    }
}
