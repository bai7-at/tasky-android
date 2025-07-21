package zendesk.core;

import android.content.Context;
import com.google.gson.Gson;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes5.dex */
class ZendeskNetworkModule {
    private static final String BASE_OK_HTTP = "BaseOkHttp";
    private static final String CORE_OK_HTTP = "CoreOkHttp";
    static final String CORE_RETROFIT = "CoreRetrofit";
    private static final String MEDIA_OK_HTTP = "MediaOkHttp";
    static final String PUSH_PROVIDER_RETROFIT = "PushProviderRetrofit";
    private static final String STANDARD_OK_HTTP = "StandardOkHttp";
    static final String STANDARD_RETROFIT = "Retrofit";

    ZendeskNetworkModule() {
    }

    static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return new AcceptLanguageHeaderInterceptor(context);
    }

    static ZendeskAccessInterceptor provideAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        return new ZendeskAccessInterceptor(identityManager, accessProvider, storage, coreSettingsStorage);
    }

    static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(IdentityManager identityManager) {
        return new ZendeskAuthHeaderInterceptor(identityManager);
    }

    static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return new CachingInterceptor(baseStorage);
    }

    static Retrofit provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(applicationConfiguration.getZendeskUrl()).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient).build();
    }

    static ZendeskPushInterceptor providePushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage, IdentityStorage identityStorage) {
        return new ZendeskPushInterceptor(pushRegistrationProviderInternal, pushDeviceIdStorage, identityStorage);
    }

    static Retrofit providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor) {
        return new Retrofit.Builder().baseUrl(applicationConfiguration.getZendeskUrl()).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient.newBuilder().addInterceptor(zendeskAuthHeaderInterceptor).build()).build();
    }

    static Retrofit provideRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(applicationConfiguration.getZendeskUrl()).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient).build();
    }

    static ZendeskSettingsInterceptor provideSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage) {
        return new ZendeskSettingsInterceptor(sdkSettingsProviderInternal, settingsStorage);
    }

    static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage) {
        return new ZendeskUnauthorizedInterceptor(sessionStorage);
    }

    static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return new AcceptHeaderInterceptor();
    }

    OkHttpClient provideBaseOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, ZendeskOauthIdHeaderInterceptor zendeskOauthIdHeaderInterceptor, UserAgentAndClientHeadersInterceptor userAgentAndClientHeadersInterceptor, ExecutorService executorService) {
        OkHttpClient.Builder addInterceptor = Tls12SocketFactory.enableTls12OnPreLollipop(new OkHttpClient.Builder()).addInterceptor(zendeskOauthIdHeaderInterceptor).addInterceptor(httpLoggingInterceptor).addInterceptor(userAgentAndClientHeadersInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return addInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).dispatcher(new Dispatcher(executorService)).build();
    }

    OkHttpClient provideCoreOkHttpClient(OkHttpClient okHttpClient, AcceptLanguageHeaderInterceptor acceptLanguageHeaderInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(acceptLanguageHeaderInterceptor).addInterceptor(acceptHeaderInterceptor).build();
    }

    OkHttpClient provideMediaOkHttpClient(OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, CachingInterceptor cachingInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(cachingInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).build();
    }

    OkHttpClient provideOkHttpClient(OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor, ZendeskPushInterceptor zendeskPushInterceptor, Cache cache) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).addInterceptor(acceptHeaderInterceptor).addInterceptor(zendeskPushInterceptor).cache(cache).build();
    }

    RestServiceProvider provideRestServiceProvider(Retrofit retrofit, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        return new ZendeskRestServiceProvider(retrofit, okHttpClient, okHttpClient2, okHttpClient3);
    }

    ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ApplicationConfiguration applicationConfiguration) {
        return new ZendeskOauthIdHeaderInterceptor(applicationConfiguration.getOauthClientId());
    }

    UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor() {
        return new UserAgentAndClientHeadersInterceptor(BuildConfig.VERSION_NAME, Constants.VARIANT);
    }
}
