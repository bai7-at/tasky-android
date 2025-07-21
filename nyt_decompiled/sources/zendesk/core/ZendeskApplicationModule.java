package zendesk.core;

import android.content.Context;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zendesk.logger.Logger;
import defpackage.um9;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes5.dex */
class ZendeskApplicationModule {
    static final String APPLICATION_CONTEXT = "application_context";
    static final String BASE_64_SERIALIZER = "base_64_serializer";
    private static final int THREAD_POOL_SIZE = 5;
    private ApplicationConfiguration applicationConfiguration;
    private Context context;

    ZendeskApplicationModule(Context context, ApplicationConfiguration applicationConfiguration) {
        this.context = context.getApplicationContext();
        this.applicationConfiguration = applicationConfiguration;
    }

    static DeviceInfo provideDeviceInfo(Context context) {
        return new DeviceInfo(context);
    }

    static ScheduledExecutorService provideExecutor() {
        return Executors.newScheduledThreadPool(5, new ThreadFactory() { // from class: zendesk.core.ZendeskApplicationModule.1
            final AtomicInteger atomicInteger = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, String.format(Locale.ENGLISH, "ZendeskThread-%d", Integer.valueOf(this.atomicInteger.getAndIncrement())));
                thread.setPriority(10);
                return thread;
            }
        });
    }

    static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService;
    }

    static Gson provideGson() {
        return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).excludeFieldsWithModifiers(128, 8).registerTypeAdapter(Date.class, new um9()).create();
    }

    static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(Logger.f() ? HttpLoggingInterceptor.Level.BASIC : HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }

    static ZendeskShadow provideZendesk(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        return new ZendeskShadow(storage, legacyIdentityMigrator, identityManager, blipsCoreProvider, pushRegistrationProvider, coreModule, providerStore);
    }

    ApplicationConfiguration provideApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    Context provideApplicationContext() {
        return this.context;
    }

    Serializer provideBase64Serializer(Serializer serializer) {
        return new ZendeskBase64Serializer(serializer);
    }

    ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return new ZendeskLocaleConverter();
    }
}
