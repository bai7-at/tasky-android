package zendesk.support;

import defpackage.g16;
import defpackage.nt1;
import defpackage.p76;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;

/* loaded from: classes5.dex */
final class DaggerSupportSdkProvidersComponent implements SupportSdkProvidersComponent {
    private final CoreModule coreModule;
    private p76 getApplicationContextProvider;
    private p76 getAuthenticationProvider;
    private p76 getBlipsProvider;
    private p76 getMemoryCacheProvider;
    private p76 getRestServiceProvider;
    private p76 getSessionStorageProvider;
    private p76 getSettingsProvider;
    private p76 provideLocaleProvider;
    private p76 provideMetadataProvider;
    private p76 provideProviderStoreProvider;
    private p76 provideRequestMigratorProvider;
    private p76 provideRequestProvider;
    private p76 provideRequestSessionCacheProvider;
    private p76 provideRequestStorageProvider;
    private p76 provideSdkSettingsProvider;
    private p76 provideSupportBlipsProvider;
    private p76 provideSupportModuleProvider;
    private p76 provideUploadProvider;
    private p76 provideZendeskLocaleConverterProvider;
    private p76 provideZendeskRequestServiceProvider;
    private p76 provideZendeskUploadServiceProvider;
    private p76 providesArticleVoteStorageProvider;
    private p76 providesHelpCenterProvider;
    private p76 providesRequestServiceProvider;
    private p76 providesUploadServiceProvider;
    private p76 providesZendeskTrackerProvider;

    static final class Builder {
        private CoreModule coreModule;
        private GuideModule guideModule;
        private ProviderModule providerModule;
        private StorageModule storageModule;
        private SupportApplicationModule supportApplicationModule;

        public SupportSdkProvidersComponent build() {
            g16.a(this.supportApplicationModule, SupportApplicationModule.class);
            g16.a(this.coreModule, CoreModule.class);
            if (this.providerModule == null) {
                this.providerModule = new ProviderModule();
            }
            g16.a(this.guideModule, GuideModule.class);
            if (this.storageModule == null) {
                this.storageModule = new StorageModule();
            }
            return new DaggerSupportSdkProvidersComponent(this.supportApplicationModule, this.coreModule, this.providerModule, this.guideModule, this.storageModule);
        }

        public Builder coreModule(CoreModule coreModule) {
            this.coreModule = (CoreModule) g16.b(coreModule);
            return this;
        }

        public Builder guideModule(GuideModule guideModule) {
            this.guideModule = (GuideModule) g16.b(guideModule);
            return this;
        }

        public Builder providerModule(ProviderModule providerModule) {
            this.providerModule = (ProviderModule) g16.b(providerModule);
            return this;
        }

        public Builder storageModule(StorageModule storageModule) {
            this.storageModule = (StorageModule) g16.b(storageModule);
            return this;
        }

        public Builder supportApplicationModule(SupportApplicationModule supportApplicationModule) {
            this.supportApplicationModule = (SupportApplicationModule) g16.b(supportApplicationModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(SupportApplicationModule supportApplicationModule, CoreModule coreModule, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule) {
        this.providesHelpCenterProvider = GuideModule_ProvidesHelpCenterProviderFactory.create(guideModule);
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule);
        this.provideLocaleProvider = nt1.b(SupportApplicationModule_ProvideLocaleFactory.create(supportApplicationModule));
        p76 b = nt1.b(ProviderModule_ProvideZendeskLocaleConverterFactory.create(providerModule));
        this.provideZendeskLocaleConverterProvider = b;
        this.provideSdkSettingsProvider = nt1.b(ProviderModule_ProvideSdkSettingsProviderFactory.create(providerModule, this.getSettingsProvider, this.provideLocaleProvider, b));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(coreModule);
        CoreModule_GetRestServiceProviderFactory create = CoreModule_GetRestServiceProviderFactory.create(coreModule);
        this.getRestServiceProvider = create;
        p76 b2 = nt1.b(ServiceModule_ProvidesRequestServiceFactory.create(create));
        this.providesRequestServiceProvider = b2;
        this.provideZendeskRequestServiceProvider = nt1.b(ServiceModule_ProvideZendeskRequestServiceFactory.create(b2));
        this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(coreModule);
        CoreModule_GetApplicationContextFactory create2 = CoreModule_GetApplicationContextFactory.create(coreModule);
        this.getApplicationContextProvider = create2;
        this.provideRequestMigratorProvider = nt1.b(StorageModule_ProvideRequestMigratorFactory.create(storageModule, create2));
        CoreModule_GetMemoryCacheFactory create3 = CoreModule_GetMemoryCacheFactory.create(coreModule);
        this.getMemoryCacheProvider = create3;
        this.provideRequestStorageProvider = nt1.b(StorageModule_ProvideRequestStorageFactory.create(storageModule, this.getSessionStorageProvider, this.provideRequestMigratorProvider, create3));
        this.provideRequestSessionCacheProvider = nt1.b(StorageModule_ProvideRequestSessionCacheFactory.create(storageModule));
        this.providesZendeskTrackerProvider = nt1.b(SupportApplicationModule_ProvidesZendeskTrackerFactory.create(supportApplicationModule));
        this.provideMetadataProvider = nt1.b(SupportApplicationModule_ProvideMetadataFactory.create(supportApplicationModule, this.getApplicationContextProvider));
        CoreModule_GetBlipsProviderFactory create4 = CoreModule_GetBlipsProviderFactory.create(coreModule);
        this.getBlipsProvider = create4;
        p76 b3 = nt1.b(ProviderModule_ProvideSupportBlipsProviderFactory.create(providerModule, create4));
        this.provideSupportBlipsProvider = b3;
        this.provideRequestProvider = nt1.b(ProviderModule_ProvideRequestProviderFactory.create(providerModule, this.provideSdkSettingsProvider, this.getAuthenticationProvider, this.provideZendeskRequestServiceProvider, this.provideRequestStorageProvider, this.provideRequestSessionCacheProvider, this.providesZendeskTrackerProvider, this.provideMetadataProvider, b3));
        p76 b4 = nt1.b(ServiceModule_ProvidesUploadServiceFactory.create(this.getRestServiceProvider));
        this.providesUploadServiceProvider = b4;
        p76 b5 = nt1.b(ServiceModule_ProvideZendeskUploadServiceFactory.create(b4));
        this.provideZendeskUploadServiceProvider = b5;
        p76 b6 = nt1.b(ProviderModule_ProvideUploadProviderFactory.create(providerModule, b5));
        this.provideUploadProvider = b6;
        this.provideProviderStoreProvider = nt1.b(ProviderModule_ProvideProviderStoreFactory.create(providerModule, this.providesHelpCenterProvider, this.provideRequestProvider, b6));
        GuideModule_ProvidesArticleVoteStorageFactory create5 = GuideModule_ProvidesArticleVoteStorageFactory.create(guideModule);
        this.providesArticleVoteStorageProvider = create5;
        this.provideSupportModuleProvider = nt1.b(ProviderModule_ProvideSupportModuleFactory.create(providerModule, this.provideRequestProvider, this.provideUploadProvider, this.providesHelpCenterProvider, this.provideSdkSettingsProvider, this.getRestServiceProvider, this.provideSupportBlipsProvider, this.providesZendeskTrackerProvider, create5));
    }

    private Support injectSupport(Support support) {
        Support_MembersInjector.injectProviderStore(support, (ProviderStore) this.provideProviderStoreProvider.get());
        Support_MembersInjector.injectSupportModule(support, (SupportModule) this.provideSupportModuleProvider.get());
        Support_MembersInjector.injectRequestMigrator(support, this.provideRequestMigratorProvider.get());
        Support_MembersInjector.injectBlipsProvider(support, (SupportBlipsProvider) this.provideSupportBlipsProvider.get());
        Support_MembersInjector.injectActionHandlerRegistry(support, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        Support_MembersInjector.injectRequestProvider(support, (RequestProvider) this.provideRequestProvider.get());
        Support_MembersInjector.injectAuthenticationProvider(support, CoreModule_GetAuthenticationProviderFactory.getAuthenticationProvider(this.coreModule));
        return support;
    }

    @Override // zendesk.support.SupportSdkProvidersComponent
    public Support inject(Support support) {
        return injectSupport(support);
    }

    private DaggerSupportSdkProvidersComponent(SupportApplicationModule supportApplicationModule, CoreModule coreModule, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule) {
        this.coreModule = coreModule;
        initialize(supportApplicationModule, coreModule, providerModule, guideModule, storageModule);
    }
}
