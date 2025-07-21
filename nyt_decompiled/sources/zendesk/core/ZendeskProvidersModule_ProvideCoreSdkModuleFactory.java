package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideCoreSdkModuleFactory implements ba2 {
    private final p76 actionHandlerRegistryProvider;
    private final p76 authenticationProvider;
    private final p76 blipsProvider;
    private final p76 contextProvider;
    private final p76 executorProvider;
    private final p76 memoryCacheProvider;
    private final p76 networkInfoProvider;
    private final p76 pushRegistrationProvider;
    private final p76 restServiceProvider;
    private final p76 sessionStorageProvider;
    private final p76 settingsProvider;
    private final p76 zendeskConfigurationProvider;

    public ZendeskProvidersModule_ProvideCoreSdkModuleFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8, p76 p76Var9, p76 p76Var10, p76 p76Var11, p76 p76Var12) {
        this.settingsProvider = p76Var;
        this.restServiceProvider = p76Var2;
        this.blipsProvider = p76Var3;
        this.sessionStorageProvider = p76Var4;
        this.networkInfoProvider = p76Var5;
        this.memoryCacheProvider = p76Var6;
        this.actionHandlerRegistryProvider = p76Var7;
        this.executorProvider = p76Var8;
        this.contextProvider = p76Var9;
        this.authenticationProvider = p76Var10;
        this.zendeskConfigurationProvider = p76Var11;
        this.pushRegistrationProvider = p76Var12;
    }

    public static ZendeskProvidersModule_ProvideCoreSdkModuleFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8, p76 p76Var9, p76 p76Var10, p76 p76Var11, p76 p76Var12) {
        return new ZendeskProvidersModule_ProvideCoreSdkModuleFactory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7, p76Var8, p76Var9, p76Var10, p76Var11, p76Var12);
    }

    public static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ScheduledExecutorService scheduledExecutorService, Context context, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider) {
        return (CoreModule) g16.c(ZendeskProvidersModule.provideCoreSdkModule(settingsProvider, restServiceProvider, blipsProvider, sessionStorage, networkInfoProvider, memoryCache, actionHandlerRegistry, scheduledExecutorService, context, authenticationProvider, applicationConfiguration, pushRegistrationProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public CoreModule get() {
        return provideCoreSdkModule((SettingsProvider) this.settingsProvider.get(), (RestServiceProvider) this.restServiceProvider.get(), (BlipsProvider) this.blipsProvider.get(), (SessionStorage) this.sessionStorageProvider.get(), (NetworkInfoProvider) this.networkInfoProvider.get(), (MemoryCache) this.memoryCacheProvider.get(), (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get(), (ScheduledExecutorService) this.executorProvider.get(), (Context) this.contextProvider.get(), (AuthenticationProvider) this.authenticationProvider.get(), (ApplicationConfiguration) this.zendeskConfigurationProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get());
    }
}
