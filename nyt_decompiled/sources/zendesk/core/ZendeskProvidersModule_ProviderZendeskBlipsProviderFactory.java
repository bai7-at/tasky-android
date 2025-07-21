package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory implements ba2 {
    private final p76 applicationConfigurationProvider;
    private final p76 blipsServiceProvider;
    private final p76 coreSettingsStorageProvider;
    private final p76 deviceInfoProvider;
    private final p76 executorProvider;
    private final p76 identityManagerProvider;
    private final p76 serializerProvider;

    public ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7) {
        this.blipsServiceProvider = p76Var;
        this.deviceInfoProvider = p76Var2;
        this.serializerProvider = p76Var3;
        this.identityManagerProvider = p76Var4;
        this.applicationConfigurationProvider = p76Var5;
        this.coreSettingsStorageProvider = p76Var6;
        this.executorProvider = p76Var7;
    }

    public static ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7) {
        return new ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7);
    }

    public static ZendeskBlipsProvider providerZendeskBlipsProvider(Object obj, Object obj2, Object obj3, Object obj4, ApplicationConfiguration applicationConfiguration, Object obj5, ExecutorService executorService) {
        return (ZendeskBlipsProvider) g16.c(ZendeskProvidersModule.providerZendeskBlipsProvider((BlipsService) obj, (DeviceInfo) obj2, (Serializer) obj3, (IdentityManager) obj4, applicationConfiguration, (CoreSettingsStorage) obj5, executorService), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskBlipsProvider get() {
        return providerZendeskBlipsProvider(this.blipsServiceProvider.get(), this.deviceInfoProvider.get(), this.serializerProvider.get(), this.identityManagerProvider.get(), (ApplicationConfiguration) this.applicationConfigurationProvider.get(), this.coreSettingsStorageProvider.get(), (ExecutorService) this.executorProvider.get());
    }
}
