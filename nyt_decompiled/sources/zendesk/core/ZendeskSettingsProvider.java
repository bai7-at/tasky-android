package zendesk.core;

import android.content.Context;
import com.google.gson.JsonElement;
import com.zendesk.logger.Logger;
import defpackage.e17;
import defpackage.tm9;
import defpackage.y22;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import retrofit2.Response;

/* loaded from: classes5.dex */
class ZendeskSettingsProvider implements SettingsProvider, SdkSettingsProviderInternal {
    private static final String LOG_TAG = "ZendeskSdkSettingsProvi";
    static final int SDK_SETTINGS_MAX_AGE_HOURS = 1;
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final String applicationId;
    private final Context context;
    private final CoreSettingsStorage coreSettingsStorage;
    private final Serializer serializer;
    private final SdkSettingsService settingsService;
    private final SettingsStorage settingsStorage;
    private final ZendeskLocaleConverter zendeskLocaleConverter;

    ZendeskSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, ActionHandlerRegistry actionHandlerRegistry, Serializer serializer, ZendeskLocaleConverter zendeskLocaleConverter, String str, Context context) {
        this.settingsService = sdkSettingsService;
        this.settingsStorage = settingsStorage;
        this.coreSettingsStorage = coreSettingsStorage;
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.serializer = serializer;
        this.zendeskLocaleConverter = zendeskLocaleConverter;
        this.applicationId = str;
        this.context = context;
    }

    private void getSettingsInternal(Locale locale, tm9 tm9Var) {
        this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).enqueue(new e17(tm9Var));
    }

    CoreSettings extractCoreSettings(Map<String, JsonElement> map) {
        CoreSettings coreSettings = (CoreSettings) this.serializer.deserialize(map == null ? null : map.get("core"), CoreSettings.class);
        return coreSettings != null ? coreSettings : ZendeskCoreSettingsStorage.DEFAULT_CORE_SETTINGS;
    }

    @Override // zendesk.core.SdkSettingsProviderInternal
    public BlipsSettings getBlipsSettings() {
        return this.coreSettingsStorage.getBlipsSettings();
    }

    @Override // zendesk.core.SettingsProvider
    public void getCoreSettings(final tm9 tm9Var) {
        if (!this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new tm9() { // from class: zendesk.core.ZendeskSettingsProvider.1
                @Override // defpackage.tm9
                public void onError(y22 y22Var) {
                    tm9 tm9Var2 = tm9Var;
                    if (tm9Var2 != null) {
                        tm9Var2.onSuccess(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings());
                    }
                }

                @Override // defpackage.tm9
                public void onSuccess(Map<String, JsonElement> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (tm9Var != null) {
                        tm9Var.onSuccess(ZendeskSettingsProvider.this.extractCoreSettings(map));
                    }
                }
            });
        } else if (tm9Var != null) {
            tm9Var.onSuccess(this.coreSettingsStorage.getCoreSettings());
        }
    }

    @Override // zendesk.core.SettingsProvider
    public <E extends Settings> void getSettingsForSdk(final String str, final Class<E> cls, final tm9 tm9Var) {
        if (!this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new tm9() { // from class: zendesk.core.ZendeskSettingsProvider.2
                @Override // defpackage.tm9
                public void onError(y22 y22Var) {
                    if (tm9Var == null) {
                        return;
                    }
                    if (!ZendeskSettingsProvider.this.settingsStorage.hasStoredSettings()) {
                        tm9Var.onError(y22Var);
                    } else {
                        tm9Var.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings(), (Settings) ZendeskSettingsProvider.this.settingsStorage.getSettings(str, cls)));
                    }
                }

                @Override // defpackage.tm9
                public void onSuccess(Map<String, JsonElement> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (tm9Var != null) {
                        tm9Var.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.extractCoreSettings(map), (Settings) ZendeskSettingsProvider.this.serializer.deserialize(map.get(str), cls)));
                    }
                }
            });
        } else if (tm9Var != null) {
            tm9Var.onSuccess(new SettingsPack(this.coreSettingsStorage.getCoreSettings(), (Settings) this.settingsStorage.getSettings(str, cls)));
            this.actionHandlerRegistry.updateSettings(this.settingsStorage.getRawSettings());
        }
    }

    @Override // zendesk.core.SdkSettingsProviderInternal
    public CoreSettings getCoreSettings() {
        if (this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            return this.coreSettingsStorage.getCoreSettings();
        }
        Map<String, JsonElement> settingsInternal = getSettingsInternal(DeviceInfo.getCurrentLocale(this.context));
        if (settingsInternal.isEmpty()) {
            return new CoreSettings(new Date(0L), null);
        }
        this.actionHandlerRegistry.updateSettings(settingsInternal);
        this.settingsStorage.storeRawSettings(settingsInternal);
        return extractCoreSettings(settingsInternal);
    }

    private Map<String, JsonElement> getSettingsInternal(Locale locale) {
        try {
            Response<Map<String, JsonElement>> execute = this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).execute();
            if (execute.body() != null) {
                return new HashMap(execute.body());
            }
            return new HashMap(0);
        } catch (IOException unused) {
            Logger.d(LOG_TAG, "Settings retrieval failed, returning empty map.", new Object[0]);
            return new HashMap(0);
        }
    }
}
