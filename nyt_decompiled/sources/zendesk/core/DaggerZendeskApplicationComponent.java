package zendesk.core;

import defpackage.g16;
import defpackage.jt7;
import defpackage.nt1;
import defpackage.p76;

/* loaded from: classes5.dex */
final class DaggerZendeskApplicationComponent implements ZendeskApplicationComponent {
    private p76 actionHandlerRegistryProvider;
    private p76 provideAcceptLanguageHeaderInterceptorProvider;
    private p76 provideAccessInterceptorProvider;
    private p76 provideAccessProvider;
    private p76 provideAccessServiceProvider;
    private p76 provideAdditionalSdkBaseStorageProvider;
    private p76 provideApplicationConfigurationProvider;
    private p76 provideApplicationContextProvider;
    private p76 provideAuthHeaderInterceptorProvider;
    private p76 provideAuthProvider;
    private p76 provideBase64SerializerProvider;
    private p76 provideBaseOkHttpClientProvider;
    private p76 provideBlipsServiceProvider;
    private p76 provideCacheProvider;
    private p76 provideCachingInterceptorProvider;
    private p76 provideCoreOkHttpClientProvider;
    private p76 provideCoreRetrofitProvider;
    private p76 provideCoreSdkModuleProvider;
    private p76 provideCoreSettingsStorageProvider;
    private p76 provideDeviceInfoProvider;
    private p76 provideExecutorProvider;
    private p76 provideExecutorServiceProvider;
    private p76 provideGsonProvider;
    private p76 provideHttpLoggingInterceptorProvider;
    private p76 provideIdentityBaseStorageProvider;
    private p76 provideIdentityManagerProvider;
    private p76 provideIdentityStorageProvider;
    private p76 provideLegacyIdentityBaseStorageProvider;
    private p76 provideLegacyIdentityStorageProvider;
    private p76 provideLegacyPushBaseStorageProvider;
    private p76 provideMediaOkHttpClientProvider;
    private p76 provideMemoryCacheProvider;
    private p76 provideOkHttpClientProvider;
    private p76 provideProviderStoreProvider;
    private p76 providePushDeviceIdStorageProvider;
    private p76 providePushInterceptorProvider;
    private p76 providePushProviderRetrofitProvider;
    private p76 providePushRegistrationProvider;
    private p76 providePushRegistrationProviderInternalProvider;
    private p76 providePushRegistrationServiceProvider;
    private p76 provideRestServiceProvider;
    private p76 provideRetrofitProvider;
    private p76 provideSdkBaseStorageProvider;
    private p76 provideSdkSettingsProvider;
    private p76 provideSdkSettingsProviderInternalProvider;
    private p76 provideSdkSettingsServiceProvider;
    private p76 provideSdkStorageProvider;
    private p76 provideSerializerProvider;
    private p76 provideSessionStorageProvider;
    private p76 provideSettingsBaseStorageProvider;
    private p76 provideSettingsInterceptorProvider;
    private p76 provideSettingsStorageProvider;
    private p76 provideUserProvider;
    private p76 provideUserServiceProvider;
    private p76 provideZendeskBasicHeadersInterceptorProvider;
    private p76 provideZendeskLocaleConverterProvider;
    private p76 provideZendeskProvider;
    private p76 provideZendeskSdkSettingsProvider;
    private p76 provideZendeskUnauthorizedInterceptorProvider;
    private p76 providerBlipsCoreProvider;
    private p76 providerBlipsProvider;
    private p76 providerConnectivityManagerProvider;
    private p76 providerNetworkInfoProvider;
    private p76 providerZendeskBlipsProvider;
    private p76 providesAcceptHeaderInterceptorProvider;
    private p76 providesBelvedereDirProvider;
    private p76 providesCacheDirProvider;
    private p76 providesDataDirProvider;
    private p76 providesDiskLruStorageProvider;
    private p76 providesUserAgentHeaderInterceptorProvider;

    static final class Builder {
        private ZendeskApplicationModule zendeskApplicationModule;
        private ZendeskNetworkModule zendeskNetworkModule;

        public ZendeskApplicationComponent build() {
            g16.a(this.zendeskApplicationModule, ZendeskApplicationModule.class);
            if (this.zendeskNetworkModule == null) {
                this.zendeskNetworkModule = new ZendeskNetworkModule();
            }
            return new DaggerZendeskApplicationComponent(this.zendeskApplicationModule, this.zendeskNetworkModule);
        }

        public Builder zendeskApplicationModule(ZendeskApplicationModule zendeskApplicationModule) {
            this.zendeskApplicationModule = (ZendeskApplicationModule) g16.b(zendeskApplicationModule);
            return this;
        }

        public Builder zendeskNetworkModule(ZendeskNetworkModule zendeskNetworkModule) {
            this.zendeskNetworkModule = (ZendeskNetworkModule) g16.b(zendeskNetworkModule);
            return this;
        }

        @Deprecated
        public Builder zendeskProvidersModule(ZendeskProvidersModule zendeskProvidersModule) {
            g16.b(zendeskProvidersModule);
            return this;
        }

        @Deprecated
        public Builder zendeskStorageModule(ZendeskStorageModule zendeskStorageModule) {
            g16.b(zendeskStorageModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
        this.provideApplicationContextProvider = nt1.b(ZendeskApplicationModule_ProvideApplicationContextFactory.create(zendeskApplicationModule));
        p76 a = jt7.a(ZendeskApplicationModule_ProvideGsonFactory.create());
        this.provideGsonProvider = a;
        p76 b = nt1.b(ZendeskStorageModule_ProvideSerializerFactory.create(a));
        this.provideSerializerProvider = b;
        p76 b2 = nt1.b(ZendeskStorageModule_ProvideSettingsBaseStorageFactory.create(this.provideApplicationContextProvider, b));
        this.provideSettingsBaseStorageProvider = b2;
        this.provideSettingsStorageProvider = nt1.b(ZendeskStorageModule_ProvideSettingsStorageFactory.create(b2));
        p76 b3 = nt1.b(ZendeskStorageModule_ProvideIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityBaseStorageProvider = b3;
        this.provideIdentityStorageProvider = nt1.b(ZendeskStorageModule_ProvideIdentityStorageFactory.create(b3));
        this.provideAdditionalSdkBaseStorageProvider = nt1.b(ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        p76 b4 = nt1.b(ZendeskStorageModule_ProvidesCacheDirFactory.create(this.provideApplicationContextProvider));
        this.providesCacheDirProvider = b4;
        this.providesDiskLruStorageProvider = nt1.b(ZendeskStorageModule_ProvidesDiskLruStorageFactory.create(b4, this.provideSerializerProvider));
        this.provideCacheProvider = nt1.b(ZendeskStorageModule_ProvideCacheFactory.create(this.providesCacheDirProvider));
        this.providesDataDirProvider = nt1.b(ZendeskStorageModule_ProvidesDataDirFactory.create(this.provideApplicationContextProvider));
        p76 b5 = nt1.b(ZendeskStorageModule_ProvidesBelvedereDirFactory.create(this.provideApplicationContextProvider));
        this.providesBelvedereDirProvider = b5;
        this.provideSessionStorageProvider = nt1.b(ZendeskStorageModule_ProvideSessionStorageFactory.create(this.provideIdentityStorageProvider, this.provideAdditionalSdkBaseStorageProvider, this.providesDiskLruStorageProvider, this.provideCacheProvider, this.providesCacheDirProvider, this.providesDataDirProvider, b5));
        this.provideSdkBaseStorageProvider = nt1.b(ZendeskStorageModule_ProvideSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        p76 b6 = nt1.b(ZendeskStorageModule_ProvideMemoryCacheFactory.create());
        this.provideMemoryCacheProvider = b6;
        this.provideSdkStorageProvider = nt1.b(ZendeskStorageModule_ProvideSdkStorageFactory.create(this.provideSettingsStorageProvider, this.provideSessionStorageProvider, this.provideSdkBaseStorageProvider, b6));
        this.provideLegacyIdentityBaseStorageProvider = nt1.b(ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideLegacyPushBaseStorageProvider = nt1.b(ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityManagerProvider = nt1.b(ZendeskStorageModule_ProvideIdentityManagerFactory.create(this.provideIdentityStorageProvider));
        p76 b7 = nt1.b(ZendeskStorageModule_ProvidePushDeviceIdStorageFactory.create(this.provideAdditionalSdkBaseStorageProvider));
        this.providePushDeviceIdStorageProvider = b7;
        this.provideLegacyIdentityStorageProvider = nt1.b(ZendeskStorageModule_ProvideLegacyIdentityStorageFactory.create(this.provideLegacyIdentityBaseStorageProvider, this.provideLegacyPushBaseStorageProvider, this.provideIdentityStorageProvider, this.provideIdentityManagerProvider, b7));
        this.provideApplicationConfigurationProvider = nt1.b(ZendeskApplicationModule_ProvideApplicationConfigurationFactory.create(zendeskApplicationModule));
        this.provideHttpLoggingInterceptorProvider = jt7.a(ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory.create());
        this.provideZendeskBasicHeadersInterceptorProvider = jt7.a(ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory.create(zendeskNetworkModule, this.provideApplicationConfigurationProvider));
        this.providesUserAgentHeaderInterceptorProvider = jt7.a(ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory.create(zendeskNetworkModule));
        p76 b8 = nt1.b(ZendeskApplicationModule_ProvideExecutorFactory.create());
        this.provideExecutorProvider = b8;
        p76 b9 = nt1.b(ZendeskApplicationModule_ProvideExecutorServiceFactory.create(b8));
        this.provideExecutorServiceProvider = b9;
        this.provideBaseOkHttpClientProvider = nt1.b(ZendeskNetworkModule_ProvideBaseOkHttpClientFactory.create(zendeskNetworkModule, this.provideHttpLoggingInterceptorProvider, this.provideZendeskBasicHeadersInterceptorProvider, this.providesUserAgentHeaderInterceptorProvider, b9));
        this.provideAcceptLanguageHeaderInterceptorProvider = jt7.a(ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory.create(this.provideApplicationContextProvider));
        p76 a2 = jt7.a(ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory.create());
        this.providesAcceptHeaderInterceptorProvider = a2;
        p76 b10 = nt1.b(ZendeskNetworkModule_ProvideCoreOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAcceptLanguageHeaderInterceptorProvider, a2));
        this.provideCoreOkHttpClientProvider = b10;
        p76 b11 = nt1.b(ZendeskNetworkModule_ProvideCoreRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, b10));
        this.provideCoreRetrofitProvider = b11;
        this.provideBlipsServiceProvider = nt1.b(ZendeskProvidersModule_ProvideBlipsServiceFactory.create(b11));
        this.provideDeviceInfoProvider = nt1.b(ZendeskApplicationModule_ProvideDeviceInfoFactory.create(this.provideApplicationContextProvider));
        this.provideBase64SerializerProvider = jt7.a(ZendeskApplicationModule_ProvideBase64SerializerFactory.create(zendeskApplicationModule, this.provideSerializerProvider));
        p76 b12 = nt1.b(ZendeskStorageModule_ProvideCoreSettingsStorageFactory.create(this.provideSettingsStorageProvider));
        this.provideCoreSettingsStorageProvider = b12;
        p76 b13 = nt1.b(ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory.create(this.provideBlipsServiceProvider, this.provideDeviceInfoProvider, this.provideBase64SerializerProvider, this.provideIdentityManagerProvider, this.provideApplicationConfigurationProvider, b12, this.provideExecutorServiceProvider));
        this.providerZendeskBlipsProvider = b13;
        this.providerBlipsCoreProvider = nt1.b(ZendeskProvidersModule_ProviderBlipsCoreProviderFactory.create(b13));
        p76 a3 = jt7.a(ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory.create(this.provideIdentityManagerProvider));
        this.provideAuthHeaderInterceptorProvider = a3;
        p76 b14 = nt1.b(ZendeskNetworkModule_ProvidePushProviderRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideCoreOkHttpClientProvider, a3));
        this.providePushProviderRetrofitProvider = b14;
        this.providePushRegistrationServiceProvider = jt7.a(ZendeskProvidersModule_ProvidePushRegistrationServiceFactory.create(b14));
        this.provideSdkSettingsServiceProvider = jt7.a(ZendeskProvidersModule_ProvideSdkSettingsServiceFactory.create(this.provideCoreRetrofitProvider));
        this.actionHandlerRegistryProvider = nt1.b(ZendeskProvidersModule_ActionHandlerRegistryFactory.create());
        p76 b15 = nt1.b(ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory.create(zendeskApplicationModule));
        this.provideZendeskLocaleConverterProvider = b15;
        p76 b16 = nt1.b(ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory.create(this.provideSdkSettingsServiceProvider, this.provideSettingsStorageProvider, this.provideCoreSettingsStorageProvider, this.actionHandlerRegistryProvider, this.provideSerializerProvider, b15, this.provideApplicationConfigurationProvider, this.provideApplicationContextProvider));
        this.provideZendeskSdkSettingsProvider = b16;
        p76 b17 = nt1.b(ZendeskProvidersModule_ProvideSdkSettingsProviderFactory.create(b16));
        this.provideSdkSettingsProvider = b17;
        this.providePushRegistrationProvider = nt1.b(ZendeskProvidersModule_ProvidePushRegistrationProviderFactory.create(this.providePushRegistrationServiceProvider, this.provideIdentityManagerProvider, b17, this.providerBlipsCoreProvider, this.providePushDeviceIdStorageProvider, this.provideApplicationContextProvider));
        p76 a4 = jt7.a(ZendeskProvidersModule_ProvideAccessServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideAccessServiceProvider = a4;
        p76 b18 = nt1.b(ZendeskProvidersModule_ProvideAccessProviderFactory.create(this.provideIdentityManagerProvider, a4));
        this.provideAccessProvider = b18;
        this.provideAccessInterceptorProvider = jt7.a(ZendeskNetworkModule_ProvideAccessInterceptorFactory.create(this.provideIdentityManagerProvider, b18, this.provideSdkStorageProvider, this.provideCoreSettingsStorageProvider));
        this.provideZendeskUnauthorizedInterceptorProvider = jt7.a(ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory.create(this.provideSessionStorageProvider));
        p76 b19 = nt1.b(ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory.create(this.provideZendeskSdkSettingsProvider));
        this.provideSdkSettingsProviderInternalProvider = b19;
        this.provideSettingsInterceptorProvider = jt7.a(ZendeskNetworkModule_ProvideSettingsInterceptorFactory.create(b19, this.provideSettingsStorageProvider));
        p76 b20 = nt1.b(ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory.create(this.providePushRegistrationProvider));
        this.providePushRegistrationProviderInternalProvider = b20;
        p76 a5 = jt7.a(ZendeskNetworkModule_ProvidePushInterceptorFactory.create(b20, this.providePushDeviceIdStorageProvider, this.provideIdentityStorageProvider));
        this.providePushInterceptorProvider = a5;
        p76 b21 = nt1.b(ZendeskNetworkModule_ProvideOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.providesAcceptHeaderInterceptorProvider, a5, this.provideCacheProvider));
        this.provideOkHttpClientProvider = b21;
        this.provideRetrofitProvider = nt1.b(ZendeskNetworkModule_ProvideRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, b21));
        p76 a6 = jt7.a(ZendeskNetworkModule_ProvideCachingInterceptorFactory.create(this.providesDiskLruStorageProvider));
        this.provideCachingInterceptorProvider = a6;
        p76 b22 = nt1.b(ZendeskNetworkModule_ProvideMediaOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, a6, this.provideZendeskUnauthorizedInterceptorProvider));
        this.provideMediaOkHttpClientProvider = b22;
        this.provideRestServiceProvider = nt1.b(ZendeskNetworkModule_ProvideRestServiceProviderFactory.create(zendeskNetworkModule, this.provideRetrofitProvider, b22, this.provideOkHttpClientProvider, this.provideCoreOkHttpClientProvider));
        this.providerBlipsProvider = nt1.b(ZendeskProvidersModule_ProviderBlipsProviderFactory.create(this.providerZendeskBlipsProvider));
        p76 b23 = nt1.b(ZendeskProvidersModule_ProviderConnectivityManagerFactory.create(this.provideApplicationContextProvider));
        this.providerConnectivityManagerProvider = b23;
        this.providerNetworkInfoProvider = nt1.b(ZendeskProvidersModule_ProviderNetworkInfoProviderFactory.create(this.provideApplicationContextProvider, b23));
        p76 b24 = nt1.b(ZendeskStorageModule_ProvideAuthProviderFactory.create(this.provideIdentityManagerProvider));
        this.provideAuthProvider = b24;
        this.provideCoreSdkModuleProvider = jt7.a(ZendeskProvidersModule_ProvideCoreSdkModuleFactory.create(this.provideSdkSettingsProvider, this.provideRestServiceProvider, this.providerBlipsProvider, this.provideSessionStorageProvider, this.providerNetworkInfoProvider, this.provideMemoryCacheProvider, this.actionHandlerRegistryProvider, this.provideExecutorProvider, this.provideApplicationContextProvider, b24, this.provideApplicationConfigurationProvider, this.providePushRegistrationProvider));
        p76 a7 = jt7.a(ZendeskProvidersModule_ProvideUserServiceFactory.create(this.provideRetrofitProvider));
        this.provideUserServiceProvider = a7;
        p76 b25 = nt1.b(ZendeskProvidersModule_ProvideUserProviderFactory.create(a7));
        this.provideUserProvider = b25;
        p76 b26 = nt1.b(ZendeskProvidersModule_ProvideProviderStoreFactory.create(b25, this.providePushRegistrationProvider));
        this.provideProviderStoreProvider = b26;
        this.provideZendeskProvider = nt1.b(ZendeskApplicationModule_ProvideZendeskFactory.create(this.provideSdkStorageProvider, this.provideLegacyIdentityStorageProvider, this.provideIdentityManagerProvider, this.providerBlipsCoreProvider, this.providePushRegistrationProvider, this.provideCoreSdkModuleProvider, b26));
    }

    @Override // zendesk.core.ZendeskApplicationComponent
    public ZendeskShadow zendeskShadow() {
        return (ZendeskShadow) this.provideZendeskProvider.get();
    }

    private DaggerZendeskApplicationComponent(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
        initialize(zendeskApplicationModule, zendeskNetworkModule);
    }
}
