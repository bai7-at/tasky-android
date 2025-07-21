package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationProviderFactory implements ba2 {
    private final p76 blipsProvider;
    private final p76 contextProvider;
    private final p76 identityManagerProvider;
    private final p76 pushDeviceIdStorageProvider;
    private final p76 pushRegistrationServiceProvider;
    private final p76 settingsProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6) {
        this.pushRegistrationServiceProvider = p76Var;
        this.identityManagerProvider = p76Var2;
        this.settingsProvider = p76Var3;
        this.blipsProvider = p76Var4;
        this.pushDeviceIdStorageProvider = p76Var5;
        this.contextProvider = p76Var6;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationProviderFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6);
    }

    public static PushRegistrationProvider providePushRegistrationProvider(Object obj, Object obj2, SettingsProvider settingsProvider, Object obj3, Object obj4, Context context) {
        return (PushRegistrationProvider) g16.c(ZendeskProvidersModule.providePushRegistrationProvider((PushRegistrationService) obj, (IdentityManager) obj2, settingsProvider, (BlipsCoreProvider) obj3, (PushDeviceIdStorage) obj4, context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public PushRegistrationProvider get() {
        return providePushRegistrationProvider(this.pushRegistrationServiceProvider.get(), this.identityManagerProvider.get(), (SettingsProvider) this.settingsProvider.get(), this.blipsProvider.get(), this.pushDeviceIdStorageProvider.get(), (Context) this.contextProvider.get());
    }
}
