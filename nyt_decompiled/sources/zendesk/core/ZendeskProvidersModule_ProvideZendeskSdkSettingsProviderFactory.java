package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory implements ba2 {
    private final p76 actionHandlerRegistryProvider;
    private final p76 configurationProvider;
    private final p76 contextProvider;
    private final p76 coreSettingsStorageProvider;
    private final p76 sdkSettingsServiceProvider;
    private final p76 serializerProvider;
    private final p76 settingsStorageProvider;
    private final p76 zendeskLocaleConverterProvider;

    public ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8) {
        this.sdkSettingsServiceProvider = p76Var;
        this.settingsStorageProvider = p76Var2;
        this.coreSettingsStorageProvider = p76Var3;
        this.actionHandlerRegistryProvider = p76Var4;
        this.serializerProvider = p76Var5;
        this.zendeskLocaleConverterProvider = p76Var6;
        this.configurationProvider = p76Var7;
        this.contextProvider = p76Var8;
    }

    public static ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8) {
        return new ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7, p76Var8);
    }

    public static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(Object obj, Object obj2, Object obj3, ActionHandlerRegistry actionHandlerRegistry, Object obj4, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        return (ZendeskSettingsProvider) g16.c(ZendeskProvidersModule.provideZendeskSdkSettingsProvider((SdkSettingsService) obj, (SettingsStorage) obj2, (CoreSettingsStorage) obj3, actionHandlerRegistry, (Serializer) obj4, zendeskLocaleConverter, applicationConfiguration, context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskSettingsProvider get() {
        return provideZendeskSdkSettingsProvider(this.sdkSettingsServiceProvider.get(), this.settingsStorageProvider.get(), this.coreSettingsStorageProvider.get(), (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get(), this.serializerProvider.get(), (ZendeskLocaleConverter) this.zendeskLocaleConverterProvider.get(), (ApplicationConfiguration) this.configurationProvider.get(), (Context) this.contextProvider.get());
    }
}
