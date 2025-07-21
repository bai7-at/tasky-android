package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory implements ba2 {
    private final p76 sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(p76 p76Var) {
        this.sdkSettingsProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(p76Var);
    }

    public static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(Object obj) {
        return (SdkSettingsProviderInternal) g16.c(ZendeskProvidersModule.provideSdkSettingsProviderInternal((ZendeskSettingsProvider) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SdkSettingsProviderInternal get() {
        return provideSdkSettingsProviderInternal(this.sdkSettingsProvider.get());
    }
}
