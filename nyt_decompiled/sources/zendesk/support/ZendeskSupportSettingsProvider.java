package zendesk.support;

import com.zendesk.logger.Logger;
import defpackage.tm9;
import defpackage.y22;
import java.util.Locale;
import zendesk.core.AuthenticationType;
import zendesk.core.SettingsPack;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes5.dex */
class ZendeskSupportSettingsProvider implements SupportSettingsProvider {
    private final Locale deviceLocale;
    private final ZendeskLocaleConverter localeConverter;
    private final SettingsProvider sdkSettingsProvider;

    class LoadSupportSettings extends tm9 {
        private final tm9 callback;

        class LoadHelpCenterSettings extends tm9 {
            private final tm9 callback;
            private final SettingsPack<SupportSettings> supportSettingsPack;

            LoadHelpCenterSettings(tm9 tm9Var, SettingsPack<SupportSettings> settingsPack) {
                this.callback = tm9Var;
                this.supportSettingsPack = settingsPack;
            }

            @Override // defpackage.tm9
            public void onError(y22 y22Var) {
                if (this.callback != null) {
                    Logger.b("ZendeskSettingsProvider", "Returning default Help Center Settings.", new Object[0]);
                    this.callback.onSuccess(new SupportSdkSettings(this.supportSettingsPack.getSettings(), HelpCenterSettings.defaultSettings(), this.supportSettingsPack.getCoreSettings().getAuthentication()));
                }
            }

            @Override // defpackage.tm9
            public void onSuccess(SettingsPack<HelpCenterSettings> settingsPack) {
                HelpCenterSettings settings = settingsPack.getSettings();
                AuthenticationType authentication = settingsPack.getCoreSettings().getAuthentication();
                LoadSupportSettings.this.logIfLocaleNotAvailable(settings);
                Logger.b("ZendeskSettingsProvider", "Successfully retrieved Settings", new Object[0]);
                tm9 tm9Var = this.callback;
                if (tm9Var != null) {
                    tm9Var.onSuccess(new SupportSdkSettings(this.supportSettingsPack.getSettings(), settings, authentication));
                }
            }
        }

        LoadSupportSettings(tm9 tm9Var) {
            this.callback = tm9Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void logIfLocaleNotAvailable(HelpCenterSettings helpCenterSettings) {
            if (helpCenterSettings == null || helpCenterSettings.getLocale() == null) {
                return;
            }
            String locale = helpCenterSettings.getLocale();
            String helpCenterLocaleString = ZendeskSupportSettingsProvider.this.localeConverter.toHelpCenterLocaleString(ZendeskSupportSettingsProvider.this.deviceLocale);
            if (helpCenterLocaleString.equals(locale)) {
                return;
            }
            Logger.i("ZendeskSettingsProvider", "No support for %s, Help Center is %s in your application settings", helpCenterLocaleString, Boolean.valueOf(helpCenterSettings.isEnabled()));
        }

        @Override // defpackage.tm9
        public void onError(y22 y22Var) {
            if (this.callback != null) {
                Logger.b("ZendeskSettingsProvider", "Returning default Support Settings.", new Object[0]);
                this.callback.onSuccess(new SupportSdkSettings(SupportSettings.defaultSettings(), HelpCenterSettings.defaultSettings(), null));
            }
        }

        @Override // defpackage.tm9
        public void onSuccess(SettingsPack<SupportSettings> settingsPack) {
            ZendeskSupportSettingsProvider.this.sdkSettingsProvider.getSettingsForSdk("help_center", HelpCenterSettings.class, new LoadHelpCenterSettings(this.callback, settingsPack));
        }
    }

    ZendeskSupportSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        this.sdkSettingsProvider = settingsProvider;
        this.localeConverter = zendeskLocaleConverter;
        this.deviceLocale = locale;
    }

    @Override // zendesk.support.SupportSettingsProvider
    public void getSettings(tm9 tm9Var) {
        this.sdkSettingsProvider.getSettingsForSdk("support", SupportSettings.class, new LoadSupportSettings(tm9Var));
    }
}
