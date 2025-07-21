package zendesk.core;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public class CoreModule {
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final ApplicationConfiguration applicationConfiguration;
    private final Context applicationContext;
    private final AuthenticationProvider authenticationProvider;
    private final BlipsProvider blipsProvider;
    private final ScheduledExecutorService executor;
    private final MemoryCache memoryCache;
    private final NetworkInfoProvider networkInfoProvider;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final RestServiceProvider restServiceProvider;
    private final SessionStorage sessionStorage;
    private final SettingsProvider settingsProvider;

    CoreModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, Context context, ActionHandlerRegistry actionHandlerRegistry, MemoryCache memoryCache, ScheduledExecutorService scheduledExecutorService, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider) {
        this.settingsProvider = settingsProvider;
        this.restServiceProvider = restServiceProvider;
        this.blipsProvider = blipsProvider;
        this.sessionStorage = sessionStorage;
        this.networkInfoProvider = networkInfoProvider;
        this.applicationContext = context;
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.memoryCache = memoryCache;
        this.executor = scheduledExecutorService;
        this.authenticationProvider = authenticationProvider;
        this.applicationConfiguration = applicationConfiguration;
        this.pushRegistrationProvider = pushRegistrationProvider;
    }

    ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    ApplicationConfiguration getApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    Context getApplicationContext() {
        return this.applicationContext;
    }

    AuthenticationProvider getAuthenticationProvider() {
        return this.authenticationProvider;
    }

    BlipsProvider getBlipsProvider() {
        return this.blipsProvider;
    }

    Executor getExecutor() {
        return this.executor;
    }

    ExecutorService getExecutorService() {
        return this.executor;
    }

    MemoryCache getMemoryCache() {
        return this.memoryCache;
    }

    NetworkInfoProvider getNetworkInfoProvider() {
        return this.networkInfoProvider;
    }

    PushRegistrationProvider getPushRegistrationProvider() {
        return this.pushRegistrationProvider;
    }

    RestServiceProvider getRestServiceProvider() {
        return this.restServiceProvider;
    }

    ScheduledExecutorService getScheduledExecutorService() {
        return this.executor;
    }

    SessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    SettingsProvider getSettingsProvider() {
        return this.settingsProvider;
    }
}
