package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
class ZendeskProvidersModule {
    ZendeskProvidersModule() {
    }

    static ActionHandlerRegistry actionHandlerRegistry() {
        return Zendesk.INSTANCE.actionHandlerRegistry();
    }

    static AccessProvider provideAccessProvider(IdentityManager identityManager, AccessService accessService) {
        return new ZendeskAccessProvider(identityManager, accessService);
    }

    static AccessService provideAccessService(Retrofit retrofit) {
        return (AccessService) retrofit.create(AccessService.class);
    }

    static BlipsService provideBlipsService(Retrofit retrofit) {
        return (BlipsService) retrofit.create(BlipsService.class);
    }

    static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ScheduledExecutorService scheduledExecutorService, Context context, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider) {
        return new CoreModule(settingsProvider, restServiceProvider, blipsProvider, sessionStorage, networkInfoProvider, context, actionHandlerRegistry, memoryCache, scheduledExecutorService, authenticationProvider, applicationConfiguration, pushRegistrationProvider);
    }

    static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        return new ZendeskProviderStore(userProvider, pushRegistrationProvider);
    }

    static PushRegistrationProvider providePushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Context context) {
        return new ZendeskPushRegistrationProvider(pushRegistrationService, identityManager, settingsProvider, blipsCoreProvider, pushDeviceIdStorage, DeviceInfo.getCurrentLocale(context));
    }

    static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider) {
        return (ZendeskPushRegistrationProvider) pushRegistrationProvider;
    }

    static PushRegistrationService providePushRegistrationService(Retrofit retrofit) {
        return (PushRegistrationService) retrofit.create(PushRegistrationService.class);
    }

    static SettingsProvider provideSdkSettingsProvider(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    static SdkSettingsService provideSdkSettingsService(Retrofit retrofit) {
        return (SdkSettingsService) retrofit.create(SdkSettingsService.class);
    }

    static UserProvider provideUserProvider(UserService userService) {
        return new ZendeskUserProvider(userService);
    }

    static UserService provideUserService(Retrofit retrofit) {
        return (UserService) retrofit.create(UserService.class);
    }

    static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, ActionHandlerRegistry actionHandlerRegistry, Serializer serializer, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        return new ZendeskSettingsProvider(sdkSettingsService, settingsStorage, coreSettingsStorage, actionHandlerRegistry, serializer, zendeskLocaleConverter, applicationConfiguration.getApplicationId(), context);
    }

    static BlipsCoreProvider providerBlipsCoreProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    static BlipsProvider providerBlipsProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    static ConnectivityManager providerConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    static NetworkInfoProvider providerNetworkInfoProvider(Context context, ConnectivityManager connectivityManager) {
        return new ZendeskNetworkInfoProvider(context, connectivityManager);
    }

    static ZendeskBlipsProvider providerZendeskBlipsProvider(BlipsService blipsService, DeviceInfo deviceInfo, Serializer serializer, IdentityManager identityManager, ApplicationConfiguration applicationConfiguration, CoreSettingsStorage coreSettingsStorage, ExecutorService executorService) {
        return new ZendeskBlipsProvider(blipsService, deviceInfo, serializer, identityManager, applicationConfiguration.getApplicationId(), coreSettingsStorage, executorService);
    }
}
