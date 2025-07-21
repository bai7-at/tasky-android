package zendesk.support;

import java.util.Locale;
import zendesk.core.BlipsProvider;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes5.dex */
class GuideProviderModule {
    private HelpCenterTracker tracker;

    GuideProviderModule(HelpCenterTracker helpCenterTracker) {
        this.tracker = helpCenterTracker;
    }

    static ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        return new ZendeskArticleVoteStorage(sessionStorage.getAdditionalSdkStorage());
    }

    static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        return new HelpCenterCachingNetworkConfig(helpCenterCachingInterceptor);
    }

    static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        return new HelpCenterCachingInterceptor();
    }

    static HelpCenterSessionCache provideHelpCenterSessionCache() {
        return new ZendeskHelpCenterSessionCache();
    }

    static ZendeskHelpCenterService provideZendeskHelpCenterService(HelpCenterService helpCenterService, ZendeskLocaleConverter zendeskLocaleConverter) {
        return new ZendeskHelpCenterService(helpCenterService, zendeskLocaleConverter);
    }

    static ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return new ZendeskLocaleConverter();
    }

    static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider, HelpCenterCachingNetworkConfig helpCenterCachingNetworkConfig) {
        return (HelpCenterService) restServiceProvider.createRestService(HelpCenterService.class, "1.0.3", "Guide", helpCenterCachingNetworkConfig);
    }

    Locale provideDeviceLocale() {
        return Locale.getDefault();
    }

    GuideModule provideGuideModule(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ArticleVoteStorage articleVoteStorage, RestServiceProvider restServiceProvider) {
        return new GuideModule(helpCenterProvider, helpCenterSettingsProvider, helpCenterBlipsProvider, this.tracker, articleVoteStorage, restServiceProvider.getMediaOkHttpClient());
    }

    HelpCenterProvider provideHelpCenterProvider(HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache) {
        return new ZendeskHelpCenterProvider(helpCenterSettingsProvider, helpCenterBlipsProvider, zendeskHelpCenterService, helpCenterSessionCache, this.tracker);
    }

    HelpCenterSettingsProvider provideSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        return new ZendeskHelpCenterSettingsProvider(settingsProvider, zendeskLocaleConverter, locale);
    }

    HelpCenterBlipsProvider providesHelpCenterBlipsProvider(BlipsProvider blipsProvider, Locale locale) {
        return new ZendeskHelpCenterBlipsProvider(blipsProvider, locale);
    }
}
