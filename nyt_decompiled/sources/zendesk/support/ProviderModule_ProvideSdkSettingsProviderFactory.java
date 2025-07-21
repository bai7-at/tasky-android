package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.util.Locale;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes5.dex */
public final class ProviderModule_ProvideSdkSettingsProviderFactory implements ba2 {
    private final p76 helpCenterLocaleConverterProvider;
    private final p76 localeProvider;
    private final ProviderModule module;
    private final p76 sdkSettingsProvider;

    public ProviderModule_ProvideSdkSettingsProviderFactory(ProviderModule providerModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.module = providerModule;
        this.sdkSettingsProvider = p76Var;
        this.localeProvider = p76Var2;
        this.helpCenterLocaleConverterProvider = p76Var3;
    }

    public static ProviderModule_ProvideSdkSettingsProviderFactory create(ProviderModule providerModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new ProviderModule_ProvideSdkSettingsProviderFactory(providerModule, p76Var, p76Var2, p76Var3);
    }

    public static SupportSettingsProvider provideSdkSettingsProvider(ProviderModule providerModule, SettingsProvider settingsProvider, Locale locale, ZendeskLocaleConverter zendeskLocaleConverter) {
        return (SupportSettingsProvider) g16.c(providerModule.provideSdkSettingsProvider(settingsProvider, locale, zendeskLocaleConverter), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SupportSettingsProvider get() {
        return provideSdkSettingsProvider(this.module, (SettingsProvider) this.sdkSettingsProvider.get(), (Locale) this.localeProvider.get(), (ZendeskLocaleConverter) this.helpCenterLocaleConverterProvider.get());
    }
}
