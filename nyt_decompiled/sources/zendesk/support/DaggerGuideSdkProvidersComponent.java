package zendesk.support;

import defpackage.g16;
import defpackage.jt7;
import defpackage.nt1;
import defpackage.p76;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;

/* loaded from: classes5.dex */
final class DaggerGuideSdkProvidersComponent implements GuideSdkProvidersComponent {
    private p76 getBlipsProvider;
    private p76 getRestServiceProvider;
    private p76 getSessionStorageProvider;
    private p76 getSettingsProvider;
    private p76 provideArticleVoteStorageProvider;
    private p76 provideCustomNetworkConfigProvider;
    private p76 provideDeviceLocaleProvider;
    private p76 provideGuideModuleProvider;
    private p76 provideHelpCenterCachingInterceptorProvider;
    private p76 provideHelpCenterProvider;
    private p76 provideHelpCenterSessionCacheProvider;
    private p76 provideSettingsProvider;
    private p76 provideZendeskHelpCenterServiceProvider;
    private p76 provideZendeskLocaleConverterProvider;
    private p76 providesHelpCenterBlipsProvider;
    private p76 providesHelpCenterServiceProvider;

    static final class Builder {
        private CoreModule coreModule;
        private GuideProviderModule guideProviderModule;

        public GuideSdkProvidersComponent build() {
            g16.a(this.coreModule, CoreModule.class);
            g16.a(this.guideProviderModule, GuideProviderModule.class);
            return new DaggerGuideSdkProvidersComponent(this.coreModule, this.guideProviderModule);
        }

        public Builder coreModule(CoreModule coreModule) {
            this.coreModule = (CoreModule) g16.b(coreModule);
            return this;
        }

        public Builder guideProviderModule(GuideProviderModule guideProviderModule) {
            this.guideProviderModule = (GuideProviderModule) g16.b(guideProviderModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(CoreModule coreModule, GuideProviderModule guideProviderModule) {
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule);
        this.provideZendeskLocaleConverterProvider = nt1.b(GuideProviderModule_ProvideZendeskLocaleConverterFactory.create());
        p76 b = nt1.b(GuideProviderModule_ProvideDeviceLocaleFactory.create(guideProviderModule));
        this.provideDeviceLocaleProvider = b;
        this.provideSettingsProvider = nt1.b(GuideProviderModule_ProvideSettingsProviderFactory.create(guideProviderModule, this.getSettingsProvider, this.provideZendeskLocaleConverterProvider, b));
        CoreModule_GetBlipsProviderFactory create = CoreModule_GetBlipsProviderFactory.create(coreModule);
        this.getBlipsProvider = create;
        this.providesHelpCenterBlipsProvider = nt1.b(GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory.create(guideProviderModule, create, this.provideDeviceLocaleProvider));
        this.getRestServiceProvider = CoreModule_GetRestServiceProviderFactory.create(coreModule);
        p76 a = jt7.a(GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory.create());
        this.provideHelpCenterCachingInterceptorProvider = a;
        p76 a2 = jt7.a(GuideProviderModule_ProvideCustomNetworkConfigFactory.create(a));
        this.provideCustomNetworkConfigProvider = a2;
        p76 b2 = nt1.b(GuideProviderModule_ProvidesHelpCenterServiceFactory.create(this.getRestServiceProvider, a2));
        this.providesHelpCenterServiceProvider = b2;
        this.provideZendeskHelpCenterServiceProvider = nt1.b(GuideProviderModule_ProvideZendeskHelpCenterServiceFactory.create(b2, this.provideZendeskLocaleConverterProvider));
        p76 b3 = nt1.b(GuideProviderModule_ProvideHelpCenterSessionCacheFactory.create());
        this.provideHelpCenterSessionCacheProvider = b3;
        this.provideHelpCenterProvider = nt1.b(GuideProviderModule_ProvideHelpCenterProviderFactory.create(guideProviderModule, this.provideSettingsProvider, this.providesHelpCenterBlipsProvider, this.provideZendeskHelpCenterServiceProvider, b3));
        CoreModule_GetSessionStorageFactory create2 = CoreModule_GetSessionStorageFactory.create(coreModule);
        this.getSessionStorageProvider = create2;
        p76 b4 = nt1.b(GuideProviderModule_ProvideArticleVoteStorageFactory.create(create2));
        this.provideArticleVoteStorageProvider = b4;
        this.provideGuideModuleProvider = nt1.b(GuideProviderModule_ProvideGuideModuleFactory.create(guideProviderModule, this.provideHelpCenterProvider, this.provideSettingsProvider, this.providesHelpCenterBlipsProvider, b4, this.getRestServiceProvider));
    }

    private Guide injectGuide(Guide guide) {
        Guide_MembersInjector.injectGuideModule(guide, (GuideModule) this.provideGuideModuleProvider.get());
        Guide_MembersInjector.injectBlipsProvider(guide, (HelpCenterBlipsProvider) this.providesHelpCenterBlipsProvider.get());
        return guide;
    }

    @Override // zendesk.support.GuideSdkProvidersComponent
    public Guide inject(Guide guide) {
        return injectGuide(guide);
    }

    private DaggerGuideSdkProvidersComponent(CoreModule coreModule, GuideProviderModule guideProviderModule) {
        initialize(coreModule, guideProviderModule);
    }
}
