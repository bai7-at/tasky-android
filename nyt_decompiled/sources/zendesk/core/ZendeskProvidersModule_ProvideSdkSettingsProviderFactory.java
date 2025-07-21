package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsProviderFactory implements ba2 {
    private final p76 sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(p76 p76Var) {
        this.sdkSettingsProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(p76Var);
    }

    public static SettingsProvider provideSdkSettingsProvider(Object obj) {
        return (SettingsProvider) g16.c(ZendeskProvidersModule.provideSdkSettingsProvider((ZendeskSettingsProvider) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SettingsProvider get() {
        return provideSdkSettingsProvider(this.sdkSettingsProvider.get());
    }
}
