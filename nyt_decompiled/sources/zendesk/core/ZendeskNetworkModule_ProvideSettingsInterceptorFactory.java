package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideSettingsInterceptorFactory implements ba2 {
    private final p76 sdkSettingsProvider;
    private final p76 settingsStorageProvider;

    public ZendeskNetworkModule_ProvideSettingsInterceptorFactory(p76 p76Var, p76 p76Var2) {
        this.sdkSettingsProvider = p76Var;
        this.settingsStorageProvider = p76Var2;
    }

    public static ZendeskNetworkModule_ProvideSettingsInterceptorFactory create(p76 p76Var, p76 p76Var2) {
        return new ZendeskNetworkModule_ProvideSettingsInterceptorFactory(p76Var, p76Var2);
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(Object obj, Object obj2) {
        return (ZendeskSettingsInterceptor) g16.c(ZendeskNetworkModule.provideSettingsInterceptor((SdkSettingsProviderInternal) obj, (SettingsStorage) obj2), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskSettingsInterceptor get() {
        return provideSettingsInterceptor(this.sdkSettingsProvider.get(), this.settingsStorageProvider.get());
    }
}
