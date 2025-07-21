package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.util.Locale;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideSettingsProviderFactory implements ba2 {
    private final p76 localeConverterProvider;
    private final p76 localeProvider;
    private final GuideProviderModule module;
    private final p76 sdkSettingsProvider;

    public GuideProviderModule_ProvideSettingsProviderFactory(GuideProviderModule guideProviderModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.module = guideProviderModule;
        this.sdkSettingsProvider = p76Var;
        this.localeConverterProvider = p76Var2;
        this.localeProvider = p76Var3;
    }

    public static GuideProviderModule_ProvideSettingsProviderFactory create(GuideProviderModule guideProviderModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new GuideProviderModule_ProvideSettingsProviderFactory(guideProviderModule, p76Var, p76Var2, p76Var3);
    }

    public static HelpCenterSettingsProvider provideSettingsProvider(GuideProviderModule guideProviderModule, SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        return (HelpCenterSettingsProvider) g16.c(guideProviderModule.provideSettingsProvider(settingsProvider, zendeskLocaleConverter, locale), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HelpCenterSettingsProvider get() {
        return provideSettingsProvider(this.module, (SettingsProvider) this.sdkSettingsProvider.get(), (ZendeskLocaleConverter) this.localeConverterProvider.get(), (Locale) this.localeProvider.get());
    }
}
