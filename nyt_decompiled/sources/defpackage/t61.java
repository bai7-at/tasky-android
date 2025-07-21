package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.work.WorkerParameters;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.apollographql.apollo.ApolloClient;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import com.comscore.streaming.EventType;
import com.comscore.streaming.WindowState;
import com.datadog.android.log.Logger;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.gson.Gson;
import com.nytimes.android.AbraLoginObserver;
import com.nytimes.android.ArticlePageEventSender;
import com.nytimes.android.ForegroundStateObserver;
import com.nytimes.android.FullscreenMediaActivity;
import com.nytimes.android.InstallReferrerReceiver;
import com.nytimes.android.IntentFilterActivity;
import com.nytimes.android.MainActivity;
import com.nytimes.android.MainViewModel;
import com.nytimes.android.NYTApplication;
import com.nytimes.android.ScreenshotTracker;
import com.nytimes.android.SectionActivity;
import com.nytimes.android.SingleArticleActivity;
import com.nytimes.android.SingleArticleViewModel;
import com.nytimes.android.VoiceOverDetector;
import com.nytimes.android.WebActivity;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.accountbenefits.AccountBenefitsActivity;
import com.nytimes.android.ad.AbraKVPs;
import com.nytimes.android.ad.params.VideoCustomAdParamProvider;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.analytics.AdEventTracker;
import com.nytimes.android.ads.games.GameHubAdUseCase;
import com.nytimes.android.ads.network.api.AlsApi;
import com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel;
import com.nytimes.android.ads.slideshow.SlideshowAdsViewModel;
import com.nytimes.android.ads.usecase.FetchAdUseCase;
import com.nytimes.android.analytics.event.video.VideoET2Reporter;
import com.nytimes.android.analytics.eventtracker.EventTrackerInitializer;
import com.nytimes.android.analytics.handler.FacebookChannelHandler;
import com.nytimes.android.analytics.handler.FirebaseChannelHandler;
import com.nytimes.android.api.retrofit.CookingApi;
import com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl;
import com.nytimes.android.assetretriever.AssetDownloader;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.assetretriever.AssetRetrieverDatabase;
import com.nytimes.android.assetretriever.AssetRetrieverJobIntentService;
import com.nytimes.android.bestsellers.BestSellersFetcher;
import com.nytimes.android.bestsellers.BookCategoryPersister;
import com.nytimes.android.bestsellers.BookCategoryRepository;
import com.nytimes.android.bestsellers.BookDialogView;
import com.nytimes.android.bestsellers.BooksBestSellersActivity;
import com.nytimes.android.comments.CommentsActivityModule_Companion_ProvideCommentsViewFactory;
import com.nytimes.android.comments.CommentsModule_ProvideDraftCommentDatabaseFactory;
import com.nytimes.android.comments.CommentsModule_ProvideGetCommentsApiFactory;
import com.nytimes.android.comments.CommentsModule_ProvideGetCurrentUserAPIFactory;
import com.nytimes.android.comments.CommentsModule_ProvideRetrofitFactory;
import com.nytimes.android.comments.CommentsModule_ProvideWriteNewCommentApiFactory;
import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.comments.comments.data.remote.flagcomment.FlagCommentDataSource;
import com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource;
import com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.getcommentbypermid.GetCommentThreadDataSource;
import com.nytimes.android.comments.comments.data.remote.getcommentssummary.GetCommentsSummaryDataSource;
import com.nytimes.android.comments.comments.data.remote.getreaderspicks.GetReadersPicksCommentsPagingSource;
import com.nytimes.android.comments.comments.data.remote.getreaderspicks.GetReadersPicksCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.getreplies.GetRepliesDataSource;
import com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource;
import com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.nytpickscomments.GetNYTPicksCommentsPagingSource;
import com.nytimes.android.comments.comments.data.remote.nytpickscomments.GetNYTPicksCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentDataSource;
import com.nytimes.android.comments.comments.data.repository.CommentsRepository;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.comments.comments.mvi.CommentsViewModel;
import com.nytimes.android.comments.comments.mvi.CommentsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity_MembersInjector;
import com.nytimes.android.comments.common.CommentsAnalytics;
import com.nytimes.android.comments.menu.item.CommentHandler;
import com.nytimes.android.comments.menu.item.Comments;
import com.nytimes.android.comments.menu.view.MenuCommentsView;
import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase;
import com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserApi;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserRemoteDataSource;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentApi;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource;
import com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nytimes.android.crashlytics.CrashlyticsConfig;
import com.nytimes.android.dailyfive.analytics.DailyFiveAnalytics;
import com.nytimes.android.dailyfive.di.DailyFiveMainTabFactory;
import com.nytimes.android.dailyfive.domain.DailyFiveFeedStore;
import com.nytimes.android.dailyfive.ui.DailyFiveFragment;
import com.nytimes.android.dailyfive.ui.DailyFiveViewModel;
import com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider;
import com.nytimes.android.deeplink.NytUriHandler;
import com.nytimes.android.deeplink.base.WebWallFilter;
import com.nytimes.android.deeplink.utils.AnalyticsDisablerImpl;
import com.nytimes.android.devsettings.home.DevSettingsActivity;
import com.nytimes.android.devsettings.home.DevSettingsXmlActivity;
import com.nytimes.android.devsettings.search.DevSettingsSearchManager;
import com.nytimes.android.dimodules.OkHttpClientFactory;
import com.nytimes.android.dimodules.q;
import com.nytimes.android.dimodules.r;
import com.nytimes.android.dimodules.s;
import com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference;
import com.nytimes.android.entitlements.di.SubauthBridgeModule;
import com.nytimes.android.entitlements.purr.PurrLoginManager;
import com.nytimes.android.entitlements.purr.client.PurrCookiePersister;
import com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl;
import com.nytimes.android.entitlements.subauth.SubauthEntitlementClientImpl;
import com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl;
import com.nytimes.android.entitlements.subauth.SubauthUserClientImpl;
import com.nytimes.android.eventtracker.AppLifecycleObserver;
import com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity;
import com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel;
import com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor;
import com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker;
import com.nytimes.android.features.discovery.discoverytab.DiscoverySectionViewModel;
import com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase;
import com.nytimes.android.features.discovery.discoverytab.DiscoveryTabFactory;
import com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher;
import com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsRepository;
import com.nytimes.android.features.discovery.discoverytab.data.SectionLinksRepository;
import com.nytimes.android.features.games.gameshub.PlayTabFactory;
import com.nytimes.android.features.games.gameshub.PlayTabPreferencesStore;
import com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider;
import com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel;
import com.nytimes.android.features.games.gameshub.playtab.debug.DebugMenuViewModel;
import com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider;
import com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository;
import com.nytimes.android.features.games.gameshub.progress.api.GamesProgressApi;
import com.nytimes.android.features.giftsharehub.GiftShareHubActivity;
import com.nytimes.android.features.giftsharehub.GiftShareHubViewModel;
import com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher;
import com.nytimes.android.features.home.data.GraphQLIdRetriever;
import com.nytimes.android.features.home.data.HomeCacheManager;
import com.nytimes.android.features.home.data.HomeDataFetcher;
import com.nytimes.android.features.home.data.HomeRepository;
import com.nytimes.android.features.home.domain.HomeUseCase;
import com.nytimes.android.features.home.ui.HomeFragment;
import com.nytimes.android.features.home.ui.HomeFragmentFactory;
import com.nytimes.android.features.home.ui.HomeViewModel;
import com.nytimes.android.features.home.ui.HomeWebViewClient;
import com.nytimes.android.features.home.ui.today.TodayTabViewModel;
import com.nytimes.android.features.notifications.push.ComposeNotificationsActivity;
import com.nytimes.android.features.notifications.push.SettingsNotificationsViewModel;
import com.nytimes.android.features.settings.AboutActivity;
import com.nytimes.android.features.settings.AboutFragment;
import com.nytimes.android.features.settings.AccountSettingsPresenter;
import com.nytimes.android.features.settings.LegalDynamicActivity;
import com.nytimes.android.features.settings.LogOutDialog;
import com.nytimes.android.features.settings.SettingsActivity;
import com.nytimes.android.features.settings.SettingsFragment;
import com.nytimes.android.features.settings.SettingsPageEventSender;
import com.nytimes.android.features.settings.legal.LibrariesViewModel;
import com.nytimes.android.features.settings.push.NotificationsFragment;
import com.nytimes.android.features.settings.push.NotificationsSettingsActivity;
import com.nytimes.android.features.settings.push.NotificationsSettingsFragment;
import com.nytimes.android.features.settings.push.NotificationsViewModel;
import com.nytimes.android.features.you.youtab.YouEventSender;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import com.nytimes.android.features.you.youtab.YouTabFactory;
import com.nytimes.android.features.you.youtab.YouTabPreferencesStore;
import com.nytimes.android.feedback.FeedbackActivity;
import com.nytimes.android.feedback.FeedbackProvider;
import com.nytimes.android.feedback.FeedbackViewModel;
import com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel;
import com.nytimes.android.feedback.ui.tooltip.FeedbackTooltipHelper;
import com.nytimes.android.feedback.workmanager.FeedbackUploadJob;
import com.nytimes.android.feedback.zendesk.ZendeskSdk;
import com.nytimes.android.firebase.FirebaseModule;
import com.nytimes.android.firebase.compliance.FirebasePurrEventInterceptor;
import com.nytimes.android.firebase.device.FirebaseInstanceIdEventInterceptor;
import com.nytimes.android.fragment.AssetViewModel;
import com.nytimes.android.fragment.WebViewFragment;
import com.nytimes.android.fragment.article.HybridContentLoader;
import com.nytimes.android.fragment.article.HybridEventManager;
import com.nytimes.android.fragment.article.WebContentLoader;
import com.nytimes.android.fragment.article.WebViewClientFactory;
import com.nytimes.android.fragment.article.hybrid.GetAllCookiesCommand;
import com.nytimes.android.fragment.article.hybrid.HybridConfigCommand;
import com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand;
import com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand;
import com.nytimes.android.fragment.fullscreen.FullScreenImageFragment;
import com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment;
import com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment;
import com.nytimes.android.fragment.fullscreen.FullscreenAdFragment;
import com.nytimes.android.fragment.gateway.GatewayBindings;
import com.nytimes.android.fragment.gateway.GatewayDependenciesImpl;
import com.nytimes.android.fragment.gateway.GatewayStrategy;
import com.nytimes.android.fragment.gateway.HasGateway;
import com.nytimes.android.fragment.gateway.PaywallOverlayViewModel;
import com.nytimes.android.fragment.gateway.PaywallPreferences;
import com.nytimes.android.gateway.AnalyticsSubauthHelper;
import com.nytimes.android.gateway.GatewayFragmentCard;
import com.nytimes.android.gateway.GatewayFragmentManager;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.landingpage.LandingPageActivity;
import com.nytimes.android.growthui.landingpage.LandingPageViewModel;
import com.nytimes.android.growthui.paywall.PaywallDialogFragment;
import com.nytimes.android.growthui.paywall.PaywallViewModel;
import com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository;
import com.nytimes.android.growthui.postauth.PostAuthActivity;
import com.nytimes.android.growthui.postauth.PostAuthViewModel;
import com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository;
import com.nytimes.android.growthui.regibundle.RegibundleConfigRepository;
import com.nytimes.android.growthui.regibundle.RegibundleDialogFragment;
import com.nytimes.android.growthui.regibundle.RegibundleViewModel;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.home.ui.hybrid.ET2ScopeCommand;
import com.nytimes.android.hybrid.HybridEventListener;
import com.nytimes.android.hybrid.HybridScriptInflater;
import com.nytimes.android.hybrid.ad.HybridAdInitializer;
import com.nytimes.android.interests.InterestsCacheManager;
import com.nytimes.android.interests.InterestsManager;
import com.nytimes.android.interests.InterestsOnboardingManager;
import com.nytimes.android.interests.InterestsPreferencesStore;
import com.nytimes.android.interests.InterestsRepository;
import com.nytimes.android.interests.db.InterestsDatabase;
import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import com.nytimes.android.internal.cms.CmsEnvironment;
import com.nytimes.android.jobs.HandleIncomingBNAWorker;
import com.nytimes.android.jobs.UpdateWorker;
import com.nytimes.android.jobs.UpdateWorkerCompletableCreator;
import com.nytimes.android.jobs.UpdateWorkerSchedulingParams;
import com.nytimes.android.jobs.WorkerRunner;
import com.nytimes.android.latestfeed.feed.FeedFetcher;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.latestfeed.feed.rx.FeedParseFunc;
import com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient;
import com.nytimes.android.libs.iterate.IterateInitializer;
import com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel;
import com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity;
import com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue;
import com.nytimes.android.libs.messagingarchitecture.core.MessageActionHandler;
import com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore;
import com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl;
import com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater;
import com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory;
import com.nytimes.android.libs.messagingarchitecture.db.MessageHistoryMigrator;
import com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase;
import com.nytimes.android.libs.messagingarchitecture.hardcoded.HardcodedMessageProvider;
import com.nytimes.android.libs.messagingarchitecture.network.GraphQlMessageFetcher;
import com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater;
import com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher;
import com.nytimes.android.libs.messagingarchitecture.network.local.OMAApiService;
import com.nytimes.android.link.share.GiftShareRemainingDataFetcher;
import com.nytimes.android.link.share.GiftShareViewModel;
import com.nytimes.android.logging.remote.AWS3StorageKeys;
import com.nytimes.android.logging.remote.LogUploaderImpl;
import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import com.nytimes.android.logging.remote.stream.network.NetworkManager;
import com.nytimes.android.logging.remote.stream.network.RemoteStreamSocket;
import com.nytimes.android.logging.remote.worker.LogRetryUploadWorker;
import com.nytimes.android.mainactivity.MainBottomNavUi;
import com.nytimes.android.mainactivity.MainBottomNavViewModel;
import com.nytimes.android.mainactivity.banner.NotificationsBannerViewModel;
import com.nytimes.android.media.MediaLifecycleObserverImpl;
import com.nytimes.android.media.analytics.AudioPlaybackEventTracker;
import com.nytimes.android.media.analytics.AudioSessionEventTracker;
import com.nytimes.android.media.audio.AudioDeepLinkHandler;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.audio.hybrid.PlayAudioCommand;
import com.nytimes.android.media.audio.podcast.PodcastFetcher;
import com.nytimes.android.media.audio.podcast.PodcastSearchResolver;
import com.nytimes.android.media.audio.podcast.PodcastSource;
import com.nytimes.android.media.audio.podcast.PodcastSourceImpl;
import com.nytimes.android.media.audio.podcast.PodcastStore;
import com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter;
import com.nytimes.android.media.audio.views.AudioControlView;
import com.nytimes.android.media.audio.views.AudioDrawer;
import com.nytimes.android.media.audio.views.AudioDrawerDialogFragment;
import com.nytimes.android.media.audio.views.AudioIndicator;
import com.nytimes.android.media.audio.views.AudioLayoutFooter;
import com.nytimes.android.media.audio.views.AudioOnboardingBar;
import com.nytimes.android.media.audio.views.SfAudioControl;
import com.nytimes.android.media.common.seekbar.MediaSeekBar;
import com.nytimes.android.media.player.MediaService;
import com.nytimes.android.media.player.VideoAdEvents;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.media.util.CaptionPrefManager;
import com.nytimes.android.media.util.MediaDurationFormatter;
import com.nytimes.android.media.util.VideoUtil;
import com.nytimes.android.media.video.MediaVideoAdManagerImpl;
import com.nytimes.android.media.video.presenter.FullscreenVideoFetcher;
import com.nytimes.android.menu.MenuManager;
import com.nytimes.android.menu.SaveMenuHelper;
import com.nytimes.android.menu.item.ConnectAccount;
import com.nytimes.android.menu.item.Feedback;
import com.nytimes.android.menu.item.Login;
import com.nytimes.android.menu.item.MenuTooltipManager;
import com.nytimes.android.menu.item.Notifications;
import com.nytimes.android.menu.item.OpenInBrowser;
import com.nytimes.android.menu.item.Refresh;
import com.nytimes.android.menu.item.Settings;
import com.nytimes.android.menu.item.Subscribe;
import com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer;
import com.nytimes.android.messaging.OfflineCard;
import com.nytimes.android.messaging.dock.DockPresenter;
import com.nytimes.android.messaging.dock.DockView;
import com.nytimes.android.messaging.dock.DockView_MembersInjector;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity;
import com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferViewModel;
import com.nytimes.android.messaging.regibundle.RegibundleFragment;
import com.nytimes.android.messaging.regiwall.DismissibleRegiwallCard;
import com.nytimes.android.messaging.regiwall.RegiwallCard;
import com.nytimes.android.messaging.truncator.TruncatorCard;
import com.nytimes.android.meter.MeterServiceApi;
import com.nytimes.android.meter.MeterServiceDAOImpl;
import com.nytimes.android.navigation.ItemToDetailNavigatorImpl;
import com.nytimes.android.network.urlexpander.UrlExpander;
import com.nytimes.android.network.urlexpander.UrlExpanderApi;
import com.nytimes.android.notification.NotificationParsingJobService;
import com.nytimes.android.notification.NotificationTrampolineActivity;
import com.nytimes.android.notification.SaveIntentHandler;
import com.nytimes.android.notification.parsing.SaveIntentParser;
import com.nytimes.android.onboarding.compose.ComposeOnboardingActivity;
import com.nytimes.android.onboarding.compose.OnboardingViewModel;
import com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel;
import com.nytimes.android.onboarding.compose.register.RegisterAccountViewModel;
import com.nytimes.android.onboarding.compose.splash.OnboardingSplashViewModel;
import com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsViewModel;
import com.nytimes.android.performancetrackerclientphoenix.event.MainThreadTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.MetricsTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.monitor.DiskUsageMonitor;
import com.nytimes.android.performancetrackerclientphoenix.monitor.NetworkDataUsageMonitor;
import com.nytimes.android.performancetrackerclientphoenix.monitor.ThermalMonitor;
import com.nytimes.android.poisonpill.view.PoisonPillOverlayViewImpl;
import com.nytimes.android.preference.ContactNewsroomPreference;
import com.nytimes.android.preference.ContactUsPreference;
import com.nytimes.android.preference.FAQPreference;
import com.nytimes.android.preference.ManageAccountPreference;
import com.nytimes.android.push.BreakingNewsAlertManager;
import com.nytimes.android.push.FcmIntentService;
import com.nytimes.android.push.MessagingHelper;
import com.nytimes.android.push.NYTPushMessagingUserProviderImpl;
import com.nytimes.android.push.NotificationChannelHelper;
import com.nytimes.android.push.PushClientManager;
import com.nytimes.android.push.PushMessageHandler;
import com.nytimes.android.push.PushMessagingFactory;
import com.nytimes.android.readerhybrid.HybridConfigBuilder;
import com.nytimes.android.readerhybrid.HybridConfigManager;
import com.nytimes.android.readerhybrid.HybridUserInfoBuilder;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.readerhybrid.widget.EmbeddedLinkWebChromeClient;
import com.nytimes.android.recent.RecentlyViewedFragment;
import com.nytimes.android.recent.RecentlyViewedUnfearFragment;
import com.nytimes.android.recent.SavingBridge;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.recentlyviewed.RecentlyViewedParams;
import com.nytimes.android.recentlyviewed.room.AssetDatabase;
import com.nytimes.android.remoteconfig.FirebaseConfigSource;
import com.nytimes.android.resourcedownloader.data.LegacyResourceStoreMigration;
import com.nytimes.android.resourcedownloader.data.ResourceDao;
import com.nytimes.android.resourcedownloader.data.ResourceDatabase;
import com.nytimes.android.resourcedownloader.data.ResourceRepository;
import com.nytimes.android.resourcedownloader.data.SourceDao;
import com.nytimes.android.resourcedownloader.font.PreCachedFontLoader;
import com.nytimes.android.resourcedownloader.utils.FileSystemPersister;
import com.nytimes.android.ribbon.DestinationContentViewModel;
import com.nytimes.android.ribbon.RibbonTabFactory;
import com.nytimes.android.ribbon.config.RibbonTabConfigRepository;
import com.nytimes.android.ribbon.destinations.CookingCollectionRepository;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import com.nytimes.android.ribbon.destinations.audio.AudioViewModel;
import com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel;
import com.nytimes.android.ribbon.destinations.cooking.CookingViewModel;
import com.nytimes.android.ribbon.destinations.elections.ElectionsViewModel;
import com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher;
import com.nytimes.android.ribbon.destinations.games.GamesViewModel;
import com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher;
import com.nytimes.android.ribbon.destinations.greatreads.GreatReadsViewModel;
import com.nytimes.android.ribbon.destinations.lifestyle.LifestyleWebViewModel;
import com.nytimes.android.ribbon.destinations.lifestyle.appnative.LifestyleViewModel;
import com.nytimes.android.ribbon.destinations.more.SectionsRepository;
import com.nytimes.android.ribbon.destinations.more.SectionsViewModel;
import com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher;
import com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel;
import com.nytimes.android.ribbon.destinations.theathletic.TheAthleticViewModel;
import com.nytimes.android.ribbon.destinations.trending.TrendingViewModel;
import com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher;
import com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator;
import com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import com.nytimes.android.room.media.MediaDatabase;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.saved.SavedMessageManager;
import com.nytimes.android.saved.SavedSectionHelper;
import com.nytimes.android.saved.persistence.SavedListDiskPersister;
import com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository;
import com.nytimes.android.saved.repository.GraphQLReadingListRepository;
import com.nytimes.android.saved.repository.SavedQueryFactory;
import com.nytimes.android.saved.synchronization.AssetSynchronizer;
import com.nytimes.android.saved.synchronization.LowLevelOperations;
import com.nytimes.android.saved.synchronization.SavedListFlyWeight;
import com.nytimes.android.saved.synchronization.SavedStrategyMigrationManager;
import com.nytimes.android.section.asset.GraphQlAssetFetcher;
import com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher;
import com.nytimes.android.section.sectionfront.SectionFrontPersister;
import com.nytimes.android.sectionfront.SavedSectionFrontFragment;
import com.nytimes.android.sectionfront.SectionFrontFragment;
import com.nytimes.android.sectionfront.adapter.model.GetMoreItemsCoalescerSource;
import com.nytimes.android.sectionfront.adapter.model.SFSummaryController;
import com.nytimes.android.sectionfront.adapter.model.SectionCoalescerSource;
import com.nytimes.android.sectionfront.adapter.model.SectionFrontCoalescer;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.sectionfront.ui.DefaultArticleSummary;
import com.nytimes.android.sectionfront.ui.FooterView;
import com.nytimes.android.share.ShareAnalyticsReporter;
import com.nytimes.android.share.ShareBroadcastReceiver;
import com.nytimes.android.share.sheet.ShareSheetViewModel;
import com.nytimes.android.side.effects.SideEffectOnScrollObserver;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.credentialmanager.SubauthSSO;
import com.nytimes.android.text.WrappedSummaryView;
import com.nytimes.android.textsize.TextSizeActivity;
import com.nytimes.android.textsize.TextSizeViewModel;
import com.nytimes.android.theathletic.AthleticViewModel;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.ComScoreWrapperImpl;
import com.nytimes.android.utils.FeedbackAppDependenciesImpl;
import com.nytimes.android.utils.ImageCropsHelper;
import com.nytimes.android.utils.LegacyFileUtils;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.OnboardingActivityManager;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.TrackingIdInitializer;
import com.nytimes.android.utils.composeutils.ComposeViewWithFragment;
import com.nytimes.android.utils.cropping.ImageCropper;
import com.nytimes.android.utils.sectionfrontrefresher.SectionFrontResourcesProvider;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.utils.snackbar.SnackbarViewModel;
import com.nytimes.android.video.FullscreenToolsController;
import com.nytimes.android.video.VideoAutoPlayScrollListener;
import com.nytimes.android.video.presenter.InlineVideoPresenter;
import com.nytimes.android.video.sectionfront.ui.VideoCover;
import com.nytimes.android.video.sectionfront.ui.VideoEndOverlay;
import com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc;
import com.nytimes.android.video.views.CaptionsView;
import com.nytimes.android.video.views.ExoPlayerView;
import com.nytimes.android.video.views.InlineVideoView;
import com.nytimes.android.video.views.VideoBottomActionsView;
import com.nytimes.android.video.views.VideoControlView;
import com.nytimes.android.widget.BookRecyclerView;
import com.nytimes.android.widget.BookRecyclerView_MembersInjector;
import com.nytimes.android.widget.BrazilDisclaimer;
import com.nytimes.android.widget.ForcedLogoutAlert;
import com.nytimes.games.spellingbee.SpellingBeeHostActivity;
import com.nytimes.navigation.ItemToDetailEventSender;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import com.nytimes.navigation.deeplink.MagicLinkManager;
import com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsActivity;
import com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel;
import com.nytimes.subauth.ui.purr.tcf.TCFViewModel;
import com.nytimes.subauth.ui.purr.webview.PurrUIWebViewActivity;
import com.nytimes.xwords.hybrid.rest.PageService;
import com.nytimes.xwords.hybrid.view.BaseHybridFragment;
import com.nytimes.xwords.hybrid.view.spellingbee.SpellingBeeHybridFragment;
import com.squareup.moshi.JsonAdapter;
import defpackage.lc3;
import defpackage.n98;
import defpackage.r42;
import defpackage.si1;
import defpackage.zk1;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.OkHttpClient;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.ws.WebSocketProtocol;
import org.threeten.bp.format.DateTimeFormatter;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public abstract class t61 {

    private static final class a implements l4 {
        private final j a;
        private final d b;
        private Activity c;

        @Override // defpackage.l4
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Activity activity) {
            this.c = (Activity) g16.b(activity);
            return this;
        }

        @Override // defpackage.l4
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public sz4 build() {
            g16.a(this.c, Activity.class);
            return new b(this.a, this.b, new a43(), this.c);
        }

        private a(j jVar, d dVar) {
            this.a = jVar;
            this.b = dVar;
        }
    }

    private static final class b extends sz4 {
        private p76 A;
        private p76 A0;
        private p76 B;
        private p76 B0;
        private p76 C;
        private p76 C0;
        private p76 D;
        private p76 D0;
        private p76 E;
        private p76 E0;
        private p76 F;
        private p76 F0;
        private p76 G;
        private p76 G0;
        private p76 H;
        private p76 I;
        private p76 J;
        private p76 K;
        private p76 L;
        private p76 M;
        private p76 N;
        private p76 O;
        private p76 P;
        private p76 Q;
        private p76 R;
        private p76 S;
        private p76 T;
        private p76 U;
        private p76 V;
        private p76 W;
        private p76 X;
        private p76 Y;
        private p76 Z;
        private final Activity a;
        private p76 a0;
        private final a43 b;
        private p76 b0;
        private final j c;
        private p76 c0;
        private final d d;
        private p76 d0;
        private final b e;
        private p76 e0;
        private p76 f;
        private p76 f0;
        private p76 g;
        private p76 g0;
        private p76 h;
        private p76 h0;
        private p76 i;
        private p76 i0;
        private p76 j;
        private p76 j0;
        private p76 k;
        private p76 k0;
        private p76 l;
        private p76 l0;
        private p76 m;
        private p76 m0;
        private p76 n;
        private p76 n0;
        private p76 o;
        private p76 o0;
        private p76 p;
        private p76 p0;
        private p76 q;
        private p76 q0;
        private p76 r;
        private p76 r0;
        private p76 s;
        private p76 s0;
        private p76 t;
        private p76 t0;
        private p76 u;
        private p76 u0;
        private p76 v;
        private p76 v0;
        private p76 w;
        private p76 w0;
        private p76 x;
        private p76 x0;
        private p76 y;
        private p76 y0;
        private p76 z;
        private p76 z0;

        private static final class a implements p76 {
            private final j a;
            private final d b;
            private final b c;
            private final int d;

            a(j jVar, d dVar, b bVar, int i) {
                this.a = jVar;
                this.b = dVar;
                this.c = bVar;
                this.d = i;
            }

            @Override // defpackage.p76
            public Object get() {
                switch (this.d) {
                    case 0:
                        return u40.a();
                    case 1:
                        return new MediaLifecycleObserverImpl(this.c.a, (hb5) this.c.g.get(), (bo4) this.c.h.get(), (z4) this.c.j.get(), (bp0) this.a.Z0.get());
                    case 2:
                        return new hb5(this.c.a);
                    case 3:
                        return new bo4(this.c.a);
                    case 4:
                        return new z4(this.c.a, (zh4) this.c.i.get(), (hb5) this.c.g.get());
                    case 5:
                        return new zh4();
                    case 6:
                        return new SnackbarUtil(this.c.a);
                    case 7:
                        return new ScreenshotTracker(this.c.p3(), (ET2Scope) this.a.k0.get(), this.c.a);
                    case 8:
                        return new FullscreenToolsController();
                    case 9:
                        return new vn8((SharedPreferences) this.a.M.get(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 10:
                        return this.c.N2(me9.a());
                    case 11:
                        return new hd3((fr) this.c.p.get(), (cr5) this.a.O2.get(), (AppEventFactory) this.a.X2.get(), (CoroutineScope) this.a.X.get());
                    case 12:
                        return new fr((cr5) this.a.O2.get(), (AppEventFactory) this.a.X2.get(), (CoroutineScope) this.a.X.get());
                    case 13:
                        return this.c.u2(qd3.a());
                    case 14:
                        return new dc3();
                    case 15:
                        return new EmbeddedLinkWebChromeClient((androidx.fragment.app.f) this.c.u.get(), (ld1) this.a.n4.get(), (SnackbarUtil) this.c.l.get(), this.c.d2(), (xt6) this.c.t.get(), (ls2) this.c.v.get());
                    case 16:
                        return b5.a(this.c.a);
                    case 17:
                        return com.nytimes.android.dimodules.b.a(this.c.a);
                    case 18:
                        return new AudioIndicatorPresenter(this.c.X1(), (zh4) this.c.i.get(), (AudioManager) this.a.G4.get(), (hb5) this.c.g.get(), (bo4) this.c.h.get(), (SnackbarUtil) this.c.l.get(), (NetworkStatus) this.a.F0.get());
                    case 19:
                        return new nd3(this.c.a, (uq7) this.a.y4.get());
                    case 20:
                        return new HybridEventManager(this.c.a, (HybridAdInitializer) this.c.z.get(), (HybridEventListener) this.c.A.get(), (ET2Scope) this.a.k0.get(), this.c.d2(), (xt6) this.c.t.get());
                    case 21:
                        return new HybridAdInitializer(nt1.a(this.a.a5), v01.a());
                    case 22:
                        return tq.a((androidx.fragment.app.f) this.c.u.get(), (ld3) this.a.c5.get(), v01.a());
                    case 23:
                        return com.nytimes.android.dimodules.h.a(this.c.a, (Subauth) this.a.L.get(), (xq5) this.c.C.get());
                    case 24:
                        return com.nytimes.android.dimodules.e.a(this.c.a, (SharedPreferences) this.a.M.get());
                    case EventType.SUBS /* 25 */:
                        return com.nytimes.android.dimodules.d.a(this.c.a, (Subauth) this.a.L.get(), (t98) this.a.d5.get(), (xq5) this.c.C.get(), (jh5) this.c.E.get(), (cb2) this.a.D.get());
                    case EventType.CDN /* 26 */:
                        return new kh5((ET2Scope) this.a.k0.get());
                    case 27:
                        return new SaveIntentHandler(nt1.a(this.c.H), nt1.a(this.a.C3), nt1.a(this.a.x2));
                    case 28:
                        return new SaveHandler(this.c.a, (SnackbarUtil) this.c.l.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (SavedManager) this.a.C3.get(), (com.nytimes.android.saved.a) this.c.G.get(), new g87(), (NetworkStatus) this.a.F0.get(), u01.a(), v01.a(), this.c.o3());
                    case BuildConfig.VERSION_CODE /* 29 */:
                        return new x87((zc) this.a.e5.get(), this.c.n3());
                    case 30:
                        return new OnboardingActivityManager(this.c.a, (AppPreferences) this.a.v.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (BrazilDisclaimer) this.c.J.get(), (SmartLockLifecycleObserver) this.c.D.get(), (OneTapLifecycleObserver) this.c.F.get());
                    case 31:
                        return new BrazilDisclaimer(this.c.a, (tm) this.a.U4.get());
                    case 32:
                        return new ForcedLogoutAlert(this.c.T1(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 33:
                        return new MainBottomNavUi(this.c.T1(), (qd4) this.c.M.get(), (Resources) this.a.u.get(), (SnackbarUtil) this.c.l.get());
                    case 34:
                        return new qd4((jc) this.a.L0.get(), (ET2Scope) this.a.k0.get());
                    case 35:
                        return new AudioDeepLinkHandler((com.nytimes.android.media.common.a) this.a.H4.get(), nt1.a(this.a.x2), this.c.b2());
                    case 36:
                        return com.nytimes.android.dimodules.g.a((NetworkStatus) this.a.F0.get(), (r57) this.a.F4.get(), (SnackbarUtil) this.c.l.get(), (Resources) this.a.u.get(), (AppPreferences) this.a.v.get(), (TimeStampUtil) this.a.w4.get(), (f15) this.a.z4.get(), this.c.r3(), (vb2) this.a.g5.get());
                    case 37:
                        return new MenuManager(this.c.a, (Resources) this.a.u.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (Map) this.c.c0.get(), new qq(), (PublishSubject) this.a.t4.get(), this.c.P2());
                    case 38:
                        return com.nytimes.android.dimodules.c.a(this.c.T2());
                    case 39:
                        return new Settings(this.c.a);
                    case 40:
                        return new Feedback((jc) this.a.L0.get(), (yc2) this.a.g1.get());
                    case 41:
                        return new Login(this.c.a, (com.nytimes.android.entitlements.a) this.a.j1.get(), (dk0) this.a.h5.get(), (PostLoginRegiOfferManager) this.a.i5.get());
                    case 42:
                        return new ConnectAccount(this.c.T1(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (CompositeDisposable) this.c.f.get());
                    case 43:
                        return new Subscribe(this.c.a, (com.nytimes.android.entitlements.a) this.a.j1.get(), (jc) this.a.L0.get(), (uy3) this.a.C1.get());
                    case 44:
                        return new Notifications(this.c.a);
                    case 45:
                        return new Comments(this.c.T1(), (NetworkStatus) this.a.F0.get(), (MenuCommentsView) this.c.W.get(), (CommentHandler) this.c.X.get());
                    case 46:
                        return CommentsActivityModule_Companion_ProvideCommentsViewFactory.provideCommentsView(this.c.a, this.a.j());
                    case 47:
                        return new CommentHandler(this.c.a, (NetworkStatus) this.a.F0.get(), (SnackbarUtil) this.c.l.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), u01.a(), v01.a());
                    case 48:
                        return new lp7();
                    case 49:
                        return new OpenInBrowser(this.c.a);
                    case 50:
                        return new Refresh();
                    case 51:
                        return mq5.a();
                    case 52:
                        return new dr7(this.c.a, (l17) this.c.f0.get(), this.a.Vb());
                    case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                        return com.nytimes.android.dimodules.f.a(this.c.a);
                    case 54:
                        return new ArticlePageEventSender((ET2Scope) this.a.k0.get());
                    case 55:
                        return new SubscriberLinkSharingMenuPreparer(this.c.a, (e54) this.a.k5.get(), (vn8) this.c.o.get(), (ET2Scope) this.a.k0.get(), (uq7) this.a.y4.get(), (MenuTooltipManager) this.c.i0.get(), (cb2) this.a.D.get());
                    case 56:
                        return new MenuTooltipManager(this.c.a);
                    case 57:
                        return new ti3((dr7) this.c.g0.get(), this.a.Vb());
                    case 58:
                        return new HasGateway(this.c.Y1(), (GatewayFragmentManager) this.c.m0.get(), (ex2) this.c.p0.get(), (qq5) this.c.o0.get());
                    case 59:
                        return new GatewayDependenciesImpl((GatewayFragmentManager) this.c.m0.get(), this.a.Sa(), (com.nytimes.android.entitlements.a) this.a.j1.get(), this.c.X2(), (AbraManager) this.a.Y0.get());
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        return new GatewayFragmentManager((ew2) this.c.l0.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (AbraManager) this.a.Y0.get(), (MutableStateFlow) this.c.d0.get());
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        return new ew2(this.c.a);
                    case 62:
                        return new jw2((qq5) this.c.o0.get(), (RecentlyViewedManager) this.a.R3.get(), (ex2) this.c.p0.get());
                    case 63:
                        return new qq5();
                    case 64:
                        return new GatewayBindings((GatewayFragmentManager) this.c.m0.get());
                    case 65:
                        return k70.a();
                    case 66:
                        return j70.a();
                    case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                        return i70.a();
                    case 68:
                        return new km7((jc) this.a.L0.get(), (cr5) this.a.O2.get());
                    case 69:
                        return new ds4((ET2Scope) this.a.k0.get());
                    case 70:
                        return new lu6((ET2Scope) this.a.k0.get());
                    case 71:
                        return com.nytimes.android.dimodules.a.a((com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 72:
                        return new FullscreenVideoFetcher(this.c.O2(), (j89) this.c.z0.get(), (VideoAssetToVideoItemFunc) this.a.v6.get(), (AssetRetriever) this.a.x2.get(), (r57) this.a.F4.get());
                    case ModuleDescriptor.MODULE_VERSION /* 73 */:
                        return new k89(this.c.a);
                    case 74:
                        return new SavingBridge((SaveHandler) this.c.H.get(), (AssetRetriever) this.a.x2.get());
                    case 75:
                        return new SavedSectionHelper((SavedManager) this.a.C3.get(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 76:
                        return new pr();
                    case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                        return new FooterBinder(this.c.a, (SaveHandler) this.c.H.get(), (SnackbarUtil) this.c.l.get(), (SavedManager) this.a.C3.get(), (uq7) this.a.y4.get(), (CommentHandler) this.c.X.get());
                    case 78:
                        return new g69();
                    case 79:
                        return new cv();
                    default:
                        throw new AssertionError(this.d);
                }
            }
        }

        private NotificationTrampolineActivity A2(NotificationTrampolineActivity notificationTrampolineActivity) {
            y40.a(notificationTrampolineActivity, (CompositeDisposable) this.f.get());
            y40.b(notificationTrampolineActivity, (s74) this.c.x4.get());
            y40.g(notificationTrampolineActivity, (fx3) this.c.f1.get());
            y40.d(notificationTrampolineActivity, (oi4) this.k.get());
            y40.c(notificationTrampolineActivity, new sd4());
            y40.f(notificationTrampolineActivity, (SnackbarUtil) this.l.get());
            y40.e(notificationTrampolineActivity, (ScreenshotTracker) this.m.get());
            x95.a(notificationTrampolineActivity, U2());
            return notificationTrampolineActivity;
        }

        private NotificationsSettingsActivity B2(NotificationsSettingsActivity notificationsSettingsActivity) {
            y40.a(notificationsSettingsActivity, (CompositeDisposable) this.f.get());
            y40.b(notificationsSettingsActivity, (s74) this.c.x4.get());
            y40.g(notificationsSettingsActivity, (fx3) this.c.f1.get());
            y40.d(notificationsSettingsActivity, (oi4) this.k.get());
            y40.c(notificationsSettingsActivity, new sd4());
            y40.f(notificationsSettingsActivity, (SnackbarUtil) this.l.get());
            y40.e(notificationsSettingsActivity, (ScreenshotTracker) this.m.get());
            oa5.a(notificationsSettingsActivity, (jc) this.c.L0.get());
            return notificationsSettingsActivity;
        }

        private PostAuthActivity C2(PostAuthActivity postAuthActivity) {
            h06.c(postAuthActivity, (r53) this.c.U5.get());
            h06.d(postAuthActivity, (t53) this.c.W5.get());
            h06.b(postAuthActivity, S2());
            h06.a(postAuthActivity, (CoroutineScope) this.c.X.get());
            return postAuthActivity;
        }

        private PostRegiLoginOfferBaseActivity D2(PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity) {
            t06.a(postRegiLoginOfferBaseActivity, (qv6) this.c.B.get());
            return postRegiLoginOfferBaseActivity;
        }

        private PurrUIWebViewActivity E2(PurrUIWebViewActivity purrUIWebViewActivity) {
            ba6.a(purrUIWebViewActivity, (h55) this.c.a6.get());
            return purrUIWebViewActivity;
        }

        private SectionActivity F2(SectionActivity sectionActivity) {
            y40.a(sectionActivity, (CompositeDisposable) this.f.get());
            y40.b(sectionActivity, (s74) this.c.x4.get());
            y40.g(sectionActivity, (fx3) this.c.f1.get());
            y40.d(sectionActivity, (oi4) this.k.get());
            y40.c(sectionActivity, new sd4());
            y40.f(sectionActivity, (SnackbarUtil) this.l.get());
            y40.e(sectionActivity, (ScreenshotTracker) this.m.get());
            qe7.f(sectionActivity, (NetworkStatus) this.c.F0.get());
            qe7.c(sectionActivity, (z58) this.c.e0.get());
            qe7.b(sectionActivity, (zc) this.c.e5.get());
            qe7.g(sectionActivity, (SavedManager) this.c.C3.get());
            qe7.i(sectionActivity, (bh7) this.P.get());
            qe7.h(sectionActivity, q3());
            qe7.e(sectionActivity, (MenuManager) this.e0.get());
            qe7.a(sectionActivity, (jc) this.c.L0.get());
            qe7.d(sectionActivity, (cb2) this.c.D.get());
            return sectionActivity;
        }

        private SettingsActivity G2(SettingsActivity settingsActivity) {
            y40.a(settingsActivity, (CompositeDisposable) this.f.get());
            y40.b(settingsActivity, (s74) this.c.x4.get());
            y40.g(settingsActivity, (fx3) this.c.f1.get());
            y40.d(settingsActivity, (oi4) this.k.get());
            y40.c(settingsActivity, new sd4());
            y40.f(settingsActivity, (SnackbarUtil) this.l.get());
            y40.e(settingsActivity, (ScreenshotTracker) this.m.get());
            jm7.a(settingsActivity, (km7) this.v0.get());
            return settingsActivity;
        }

        private SingleArticleActivity H2(SingleArticleActivity singleArticleActivity) {
            y40.a(singleArticleActivity, (CompositeDisposable) this.f.get());
            y40.b(singleArticleActivity, (s74) this.c.x4.get());
            y40.g(singleArticleActivity, (fx3) this.c.f1.get());
            y40.d(singleArticleActivity, (oi4) this.k.get());
            y40.c(singleArticleActivity, new sd4());
            y40.f(singleArticleActivity, (SnackbarUtil) this.l.get());
            y40.e(singleArticleActivity, (ScreenshotTracker) this.m.get());
            b50.e(singleArticleActivity, (cb2) this.c.D.get());
            b50.a(singleArticleActivity, S1());
            b50.c(singleArticleActivity, V1());
            b50.f(singleArticleActivity, (MenuManager) this.e0.get());
            b50.d(singleArticleActivity, (ET2Scope) this.c.k0.get());
            b50.b(singleArticleActivity, (jc) this.c.L0.get());
            ct7.h(singleArticleActivity, (HybridEventListener) this.A.get());
            ct7.e(singleArticleActivity, (dk0) this.c.h5.get());
            ct7.a(singleArticleActivity, (AbraManager) this.c.Y0.get());
            ct7.r(singleArticleActivity, (dr7) this.g0.get());
            ct7.s(singleArticleActivity, x3());
            ct7.c(singleArticleActivity, new rq());
            ct7.f(singleArticleActivity, new qq());
            ct7.d(singleArticleActivity, (ArticlePageEventSender) this.h0.get());
            ct7.m(singleArticleActivity, (OneTapLifecycleObserver) this.F.get());
            ct7.t(singleArticleActivity, (vn8) this.o.get());
            ct7.k(singleArticleActivity, (SubscriberLinkSharingMenuPreparer) this.j0.get());
            ct7.l(singleArticleActivity, (MenuTooltipManager) this.i0.get());
            ct7.o(singleArticleActivity, m3());
            ct7.j(singleArticleActivity, (ti3) this.k0.get());
            ct7.i(singleArticleActivity, e2());
            ct7.q(singleArticleActivity, (uq7) this.c.y4.get());
            ct7.p(singleArticleActivity, (ShareAnalyticsReporter) this.c.s4.get());
            ct7.g(singleArticleActivity, (HasGateway) this.r0.get());
            ct7.b(singleArticleActivity, (AppPreferences) this.c.v.get());
            ct7.n(singleArticleActivity, (s96) this.c.d0.get());
            return singleArticleActivity;
        }

        private SpellingBeeHostActivity I2(SpellingBeeHostActivity spellingBeeHostActivity) {
            vy7.c(spellingBeeHostActivity, (uy3) this.c.C1.get());
            vy7.e(spellingBeeHostActivity, (z58) this.c.e0.get());
            vy7.d(spellingBeeHostActivity, (dz1) this.c.Y5.get());
            vy7.b(spellingBeeHostActivity, (sb3) this.c.Z5.get());
            vy7.a(spellingBeeHostActivity, (AbraManager) this.c.Y0.get());
            return spellingBeeHostActivity;
        }

        private SubauthShowNewsUserStatePreference J2(SubauthShowNewsUserStatePreference subauthShowNewsUserStatePreference) {
            i98.a(subauthShowNewsUserStatePreference, (Subauth) this.c.L.get());
            i98.b(subauthShowNewsUserStatePreference, (c78) this.c.Y.get());
            return subauthShowNewsUserStatePreference;
        }

        private TextSizeActivity K2(TextSizeActivity textSizeActivity) {
            y40.a(textSizeActivity, (CompositeDisposable) this.f.get());
            y40.b(textSizeActivity, (s74) this.c.x4.get());
            y40.g(textSizeActivity, (fx3) this.c.f1.get());
            y40.d(textSizeActivity, (oi4) this.k.get());
            y40.c(textSizeActivity, new sd4());
            y40.f(textSizeActivity, (SnackbarUtil) this.l.get());
            y40.e(textSizeActivity, (ScreenshotTracker) this.m.get());
            return textSizeActivity;
        }

        private ViewingCommentsActivity L2(ViewingCommentsActivity viewingCommentsActivity) {
            ViewingCommentsActivity_MembersInjector.injectSharingManager(viewingCommentsActivity, (uq7) this.c.y4.get());
            ViewingCommentsActivity_MembersInjector.injectSingleArticleActivityNavigator(viewingCommentsActivity, v25.a());
            return viewingCommentsActivity;
        }

        private WebActivity M2(WebActivity webActivity) {
            y40.a(webActivity, (CompositeDisposable) this.f.get());
            y40.b(webActivity, (s74) this.c.x4.get());
            y40.g(webActivity, (fx3) this.c.f1.get());
            y40.d(webActivity, (oi4) this.k.get());
            y40.c(webActivity, new sd4());
            y40.f(webActivity, (SnackbarUtil) this.l.get());
            y40.e(webActivity, (ScreenshotTracker) this.m.get());
            kd9.a(webActivity, S1());
            kd9.e(webActivity, (cb2) this.c.D.get());
            kd9.h(webActivity, (qv6) this.c.B.get());
            kd9.c(webActivity, V1());
            kd9.f(webActivity, (uy3) this.c.C1.get());
            kd9.g(webActivity, (MenuManager) this.e0.get());
            kd9.d(webActivity, (ET2Scope) this.c.k0.get());
            kd9.b(webActivity, (jc) this.c.L0.get());
            return webActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public le9 N2(le9 le9Var) {
            je4.a(le9Var, this.a);
            je4.b(le9Var, (ld1) this.c.n4.get());
            je4.c(le9Var, d2());
            je4.f(le9Var, (SnackbarUtil) this.l.get());
            je4.h(le9Var, (if9) this.c.L4.get());
            je4.g(le9Var, j());
            je4.e(le9Var, (uy3) this.c.C1.get());
            je4.d(le9Var, (hd3) this.q.get());
            return le9Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Intent O2() {
            return v40.a(this.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StateFlow P2() {
            return nq5.a((MutableStateFlow) this.d0.get());
        }

        private MagicLinkManager Q2() {
            return new MagicLinkManager((Subauth) this.c.L.get());
        }

        private Map R2() {
            return ImmutableMap.s(DataConfigId.Games, d3(), DataConfigId.PlayTab, g3(), DataConfigId.AllAccess, Z2(), DataConfigId.AllAccessLandingPageAsPaywall, a3());
        }

        private i4 S1() {
            return new i4((jc) this.c.L0.get());
        }

        private Map S2() {
            return ImmutableMap.s(DataConfigId.GamesPostLogin, e3(), DataConfigId.GamesPostRegistration, f3(), DataConfigId.AllAccessPostLogin, b3(), DataConfigId.AllAccessPostRegistration, c3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public jk T1() {
            return sb9.a(this.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public iq4 T2() {
            return new iq4(this.a, (Settings) this.Q.get(), (Feedback) this.R.get(), (Login) this.S.get(), (ConnectAccount) this.T.get(), (Subscribe) this.U.get(), (Notifications) this.V.get(), (Comments) this.Y.get(), new c87(), new ox8(), (lp7) this.Z.get(), new ya8(), new ex8(), (OpenInBrowser) this.a0.get(), (Refresh) this.b0.get(), (up4) this.c.j5.get(), (cb2) this.c.D.get());
        }

        private ex U1() {
            return new ex((AudioManager) this.c.G4.get(), (bo4) this.h.get(), (com.nytimes.android.media.common.a) this.c.H4.get(), (ax) this.c.I4.get());
        }

        private q95 U2() {
            return new q95(l3(), w3());
        }

        private zs1 V1() {
            return new zs1(this.a, w25.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public la5 V2() {
            return new la5((PushClientManager) this.c.A1.get(), en.a(this.c.a));
        }

        private FeedbackTooltipHelper W1() {
            return new FeedbackTooltipHelper(en.a(this.c.a), (SharedPreferences) this.c.M.get());
        }

        private gn5 W2() {
            return new gn5((AbraManager) this.c.Y0.get(), (ET2Scope) this.c.k0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FragmentManager X1() {
            return x40.a((androidx.fragment.app.f) this.u.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaywallPreferences X2() {
            return new PaywallPreferences((AppPreferences) this.c.v.get(), en.a(this.c.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GatewayStrategy Y1() {
            return new GatewayStrategy((com.nytimes.android.entitlements.a) this.c.j1.get(), (NetworkStatus) this.c.F0.get(), (lw2) this.n0.get(), (iw2) this.q0.get(), (ArticlePageEventSender) this.h0.get(), d57.a(), e57.a());
        }

        private PlayAudioCommand Y2() {
            return new PlayAudioCommand(b2());
        }

        private GetAllCookiesCommand Z1() {
            return new GetAllCookiesCommand((n98) this.c.P0.get());
        }

        private cy3 Z2() {
            return b43.a(this.b, (k43) this.c.V5.get());
        }

        private cy3 a3() {
            return c43.a(this.b, (k43) this.c.V5.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public rb3 b2() {
            return new rb3((z4) this.j.get(), (hb5) this.g.get(), (bo4) this.h.get(), (AudioManager) this.c.G4.get(), nt1.a(this.x));
        }

        private i06 b3() {
            return d43.a(this.b, (k43) this.c.V5.get());
        }

        private HybridConfigCommand c2() {
            return new HybridConfigCommand((ET2Scope) this.c.k0.get(), (HybridConfigBuilder) this.c.R4.get(), this.c.V9());
        }

        private i06 c3() {
            return e43.a(this.b, (k43) this.c.V5.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HybridLinkHandlerImpl d2() {
            return new HybridLinkHandlerImpl((AssetRetriever) this.c.x2.get(), (DeepLinkManager) this.c.n3.get(), (NetworkStatus) this.c.F0.get(), U1());
        }

        private cy3 d3() {
            return f43.a(this.b, (k43) this.c.V5.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public md3 e2() {
            return new md3((bs3) this.c.T3.get(), this.a);
        }

        private i06 e3() {
            return g43.a(this.b, (k43) this.c.V5.get());
        }

        private void f2(a43 a43Var, Activity activity) {
            this.f = nt1.b(new a(this.c, this.d, this.e, 0));
            this.g = nt1.b(new a(this.c, this.d, this.e, 2));
            this.h = nt1.b(new a(this.c, this.d, this.e, 3));
            this.i = nt1.b(new a(this.c, this.d, this.e, 5));
            this.j = nt1.b(new a(this.c, this.d, this.e, 4));
            this.k = nt1.b(new a(this.c, this.d, this.e, 1));
            this.l = nt1.b(new a(this.c, this.d, this.e, 6));
            this.m = nt1.b(new a(this.c, this.d, this.e, 7));
            this.n = nt1.b(new a(this.c, this.d, this.e, 8));
            this.o = nt1.b(new a(this.c, this.d, this.e, 9));
            this.p = nt1.b(new a(this.c, this.d, this.e, 12));
            this.q = nt1.b(new a(this.c, this.d, this.e, 11));
            this.r = new a(this.c, this.d, this.e, 10);
            this.s = new a(this.c, this.d, this.e, 13);
            this.t = new a(this.c, this.d, this.e, 14);
            this.u = jt7.a(new a(this.c, this.d, this.e, 16));
            this.v = nt1.b(new a(this.c, this.d, this.e, 17));
            this.w = nt1.b(new a(this.c, this.d, this.e, 15));
            this.x = nt1.b(new a(this.c, this.d, this.e, 18));
            this.y = nt1.b(new a(this.c, this.d, this.e, 19));
            this.z = nt1.b(new a(this.c, this.d, this.e, 21));
            this.A = nt1.b(new a(this.c, this.d, this.e, 22));
            this.B = new a(this.c, this.d, this.e, 20);
            this.C = nt1.b(new a(this.c, this.d, this.e, 24));
            this.D = nt1.b(new a(this.c, this.d, this.e, 23));
            this.E = nt1.b(new a(this.c, this.d, this.e, 26));
            this.F = nt1.b(new a(this.c, this.d, this.e, 25));
            this.G = nt1.b(new a(this.c, this.d, this.e, 29));
            this.H = nt1.b(new a(this.c, this.d, this.e, 28));
            this.I = nt1.b(new a(this.c, this.d, this.e, 27));
            this.J = nt1.b(new a(this.c, this.d, this.e, 31));
            this.K = nt1.b(new a(this.c, this.d, this.e, 30));
            this.L = nt1.b(new a(this.c, this.d, this.e, 32));
            this.M = nt1.b(new a(this.c, this.d, this.e, 34));
            this.N = nt1.b(new a(this.c, this.d, this.e, 33));
            this.O = nt1.b(new a(this.c, this.d, this.e, 35));
            this.P = nt1.b(new a(this.c, this.d, this.e, 36));
            this.Q = nt1.b(new a(this.c, this.d, this.e, 39));
            this.R = nt1.b(new a(this.c, this.d, this.e, 40));
            this.S = nt1.b(new a(this.c, this.d, this.e, 41));
            this.T = nt1.b(new a(this.c, this.d, this.e, 42));
            this.U = nt1.b(new a(this.c, this.d, this.e, 43));
            this.V = nt1.b(new a(this.c, this.d, this.e, 44));
            this.W = nt1.b(new a(this.c, this.d, this.e, 46));
            this.X = nt1.b(new a(this.c, this.d, this.e, 47));
            this.Y = nt1.b(new a(this.c, this.d, this.e, 45));
            this.Z = nt1.b(new a(this.c, this.d, this.e, 48));
            this.a0 = nt1.b(new a(this.c, this.d, this.e, 49));
            this.b0 = nt1.b(new a(this.c, this.d, this.e, 50));
            this.c0 = nt1.b(new a(this.c, this.d, this.e, 38));
            this.d0 = nt1.b(new a(this.c, this.d, this.e, 51));
            this.e0 = nt1.b(new a(this.c, this.d, this.e, 37));
            this.f0 = nt1.b(new a(this.c, this.d, this.e, 53));
            this.g0 = nt1.b(new a(this.c, this.d, this.e, 52));
            this.h0 = nt1.b(new a(this.c, this.d, this.e, 54));
            this.i0 = nt1.b(new a(this.c, this.d, this.e, 56));
            this.j0 = nt1.b(new a(this.c, this.d, this.e, 55));
            this.k0 = nt1.b(new a(this.c, this.d, this.e, 57));
            this.l0 = nt1.b(new a(this.c, this.d, this.e, 61));
            this.m0 = nt1.b(new a(this.c, this.d, this.e, 60));
            this.n0 = nt1.b(new a(this.c, this.d, this.e, 59));
            this.o0 = nt1.b(new a(this.c, this.d, this.e, 63));
            this.p0 = nt1.b(new a(this.c, this.d, this.e, 64));
            this.q0 = nt1.b(new a(this.c, this.d, this.e, 62));
            this.r0 = nt1.b(new a(this.c, this.d, this.e, 58));
            this.s0 = nt1.b(new a(this.c, this.d, this.e, 65));
            this.t0 = nt1.b(new a(this.c, this.d, this.e, 66));
            this.u0 = nt1.b(new a(this.c, this.d, this.e, 67));
            this.v0 = nt1.b(new a(this.c, this.d, this.e, 68));
            this.w0 = nt1.b(new a(this.c, this.d, this.e, 69));
            this.x0 = nt1.b(new a(this.c, this.d, this.e, 70));
            this.y0 = nt1.b(new a(this.c, this.d, this.e, 71));
            this.z0 = nt1.b(new a(this.c, this.d, this.e, 73));
            this.A0 = nt1.b(new a(this.c, this.d, this.e, 72));
            this.B0 = nt1.b(new a(this.c, this.d, this.e, 74));
            this.C0 = nt1.b(new a(this.c, this.d, this.e, 75));
            this.D0 = nt1.b(new a(this.c, this.d, this.e, 76));
            this.E0 = nt1.b(new a(this.c, this.d, this.e, 77));
            this.F0 = nt1.b(new a(this.c, this.d, this.e, 78));
            this.G0 = nt1.b(new a(this.c, this.d, this.e, 79));
        }

        private i06 f3() {
            return h43.a(this.b, (k43) this.c.V5.get());
        }

        private AboutActivity g2(AboutActivity aboutActivity) {
            y40.a(aboutActivity, (CompositeDisposable) this.f.get());
            y40.b(aboutActivity, (s74) this.c.x4.get());
            y40.g(aboutActivity, (fx3) this.c.f1.get());
            y40.d(aboutActivity, (oi4) this.k.get());
            y40.c(aboutActivity, new sd4());
            y40.f(aboutActivity, (SnackbarUtil) this.l.get());
            y40.e(aboutActivity, (ScreenshotTracker) this.m.get());
            f0.a(aboutActivity, (km7) this.v0.get());
            return aboutActivity;
        }

        private cy3 g3() {
            return i43.a(this.b, (k43) this.c.V5.get());
        }

        private AccountBenefitsActivity h2(AccountBenefitsActivity accountBenefitsActivity) {
            y40.a(accountBenefitsActivity, (CompositeDisposable) this.f.get());
            y40.b(accountBenefitsActivity, (s74) this.c.x4.get());
            y40.g(accountBenefitsActivity, (fx3) this.c.f1.get());
            y40.d(accountBenefitsActivity, (oi4) this.k.get());
            y40.c(accountBenefitsActivity, new sd4());
            y40.f(accountBenefitsActivity, (SnackbarUtil) this.l.get());
            y40.e(accountBenefitsActivity, (ScreenshotTracker) this.m.get());
            return accountBenefitsActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public cu6 h3() {
            return j43.a(this.b, (k43) this.c.V5.get());
        }

        private BooksBestSellersActivity i2(BooksBestSellersActivity booksBestSellersActivity) {
            y40.a(booksBestSellersActivity, (CompositeDisposable) this.f.get());
            y40.b(booksBestSellersActivity, (s74) this.c.x4.get());
            y40.g(booksBestSellersActivity, (fx3) this.c.f1.get());
            y40.d(booksBestSellersActivity, (oi4) this.k.get());
            y40.c(booksBestSellersActivity, new sd4());
            y40.f(booksBestSellersActivity, (SnackbarUtil) this.l.get());
            y40.e(booksBestSellersActivity, (ScreenshotTracker) this.m.get());
            com.nytimes.android.bestsellers.b.c(booksBestSellersActivity, (BookCategoryRepository) this.c.o5.get());
            com.nytimes.android.bestsellers.b.b(booksBestSellersActivity, (PublishSubject) this.s0.get());
            com.nytimes.android.bestsellers.b.d(booksBestSellersActivity, (PublishSubject) this.t0.get());
            com.nytimes.android.bestsellers.b.e(booksBestSellersActivity, (PublishSubject) this.u0.get());
            com.nytimes.android.bestsellers.b.f(booksBestSellersActivity, (SnackbarUtil) this.l.get());
            com.nytimes.android.bestsellers.b.a(booksBestSellersActivity, (jc) this.c.L0.get());
            return booksBestSellersActivity;
        }

        private mo6 i3() {
            return new mo6((AbraManager) this.c.Y0.get());
        }

        private ComposeNotificationsActivity j2(ComposeNotificationsActivity composeNotificationsActivity) {
            y40.a(composeNotificationsActivity, (CompositeDisposable) this.f.get());
            y40.b(composeNotificationsActivity, (s74) this.c.x4.get());
            y40.g(composeNotificationsActivity, (fx3) this.c.f1.get());
            y40.d(composeNotificationsActivity, (oi4) this.k.get());
            y40.c(composeNotificationsActivity, new sd4());
            y40.f(composeNotificationsActivity, (SnackbarUtil) this.l.get());
            y40.e(composeNotificationsActivity, (ScreenshotTracker) this.m.get());
            gs0.a(composeNotificationsActivity, (jc) this.c.L0.get());
            return composeNotificationsActivity;
        }

        private bq6 j3() {
            return new bq6(U());
        }

        private ComposeOnboardingActivity k2(ComposeOnboardingActivity composeOnboardingActivity) {
            y40.a(composeOnboardingActivity, (CompositeDisposable) this.f.get());
            y40.b(composeOnboardingActivity, (s74) this.c.x4.get());
            y40.g(composeOnboardingActivity, (fx3) this.c.f1.get());
            y40.d(composeOnboardingActivity, (oi4) this.k.get());
            y40.c(composeOnboardingActivity, new sd4());
            y40.f(composeOnboardingActivity, (SnackbarUtil) this.l.get());
            y40.e(composeOnboardingActivity, (ScreenshotTracker) this.m.get());
            is0.b(composeOnboardingActivity, (SmartLockLifecycleObserver) this.D.get());
            is0.a(composeOnboardingActivity, (com.nytimes.android.onboarding.compose.b) this.c.X5.get());
            return composeOnboardingActivity;
        }

        private mr6 k3() {
            return new mr6(U(), (NetworkStatus) this.c.F0.get(), (SnackbarUtil) this.l.get());
        }

        private ContactNewsroomPreference l2(ContactNewsroomPreference contactNewsroomPreference) {
            mv0.a(contactNewsroomPreference, w25.a());
            return contactNewsroomPreference;
        }

        private SaveIntentParser l3() {
            return new SaveIntentParser(en.a(this.c.a), (AssetRetriever) this.c.x2.get(), (SavedManager) this.c.C3.get(), (com.nytimes.android.entitlements.a) this.c.j1.get(), n3(), new sd4());
        }

        private ContactUsPreference m2(ContactUsPreference contactUsPreference) {
            nv0.a(contactUsPreference, w25.a());
            return contactUsPreference;
        }

        private SaveMenuHelper m3() {
            return new SaveMenuHelper(this.a, (SavedManager) this.c.C3.get(), (com.nytimes.android.entitlements.a) this.c.j1.get(), (SaveHandler) this.H.get());
        }

        private DevSettingsActivity n2(DevSettingsActivity devSettingsActivity) {
            go1.a(devSettingsActivity, this.c.r9());
            go1.b(devSettingsActivity, (DevSettingsSearchManager) this.c.O5.get());
            return devSettingsActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w87 n3() {
            return new w87((ET2Scope) this.c.k0.get());
        }

        private DevSettingsXmlActivity o2(DevSettingsXmlActivity devSettingsXmlActivity) {
            jo1.a(devSettingsXmlActivity, this.c.r9());
            return devSettingsXmlActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SavedMessageManager o3() {
            return new SavedMessageManager(this.a, (SnackbarUtil) this.l.get(), new v63(), (cb2) this.c.D.get());
        }

        private ET2EventViewerActivity p2(ET2EventViewerActivity eT2EventViewerActivity) {
            px1.a(eT2EventViewerActivity, (nx1) this.c.P5.get());
            return eT2EventViewerActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ec7 p3() {
            return w40.a((CoroutineScope) this.c.X.get());
        }

        private FAQPreference q2(FAQPreference fAQPreference) {
            e82.a(fAQPreference, w25.a());
            return fAQPreference;
        }

        private nf7 q3() {
            return new nf7(this.c.Qb());
        }

        private FeedbackActivity r2(FeedbackActivity feedbackActivity) {
            y40.a(feedbackActivity, (CompositeDisposable) this.f.get());
            y40.b(feedbackActivity, (s74) this.c.x4.get());
            y40.g(feedbackActivity, (fx3) this.c.f1.get());
            y40.d(feedbackActivity, (oi4) this.k.get());
            y40.c(feedbackActivity, new sd4());
            y40.f(feedbackActivity, (SnackbarUtil) this.l.get());
            y40.e(feedbackActivity, (ScreenshotTracker) this.m.get());
            sc2.b(feedbackActivity, W1());
            sc2.a(feedbackActivity, (tc2) this.c.n1.get());
            return feedbackActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SectionFrontResourcesProvider r3() {
            return new SectionFrontResourcesProvider((Resources) this.c.u.get());
        }

        private FullscreenMediaActivity s2(FullscreenMediaActivity fullscreenMediaActivity) {
            y40.a(fullscreenMediaActivity, (CompositeDisposable) this.f.get());
            y40.b(fullscreenMediaActivity, (s74) this.c.x4.get());
            y40.g(fullscreenMediaActivity, (fx3) this.c.f1.get());
            y40.d(fullscreenMediaActivity, (oi4) this.k.get());
            y40.c(fullscreenMediaActivity, new sd4());
            y40.f(fullscreenMediaActivity, (SnackbarUtil) this.l.get());
            y40.e(fullscreenMediaActivity, (ScreenshotTracker) this.m.get());
            com.nytimes.android.a.a(fullscreenMediaActivity, nt1.a(this.c.L0));
            com.nytimes.android.a.e(fullscreenMediaActivity, nt1.a(this.c.y4));
            com.nytimes.android.a.f(fullscreenMediaActivity, x3());
            com.nytimes.android.a.d(fullscreenMediaActivity, (r57) this.c.F4.get());
            com.nytimes.android.a.h(fullscreenMediaActivity, (FullscreenToolsController) this.n.get());
            com.nytimes.android.a.c(fullscreenMediaActivity, (RecentlyViewedManager) this.c.R3.get());
            com.nytimes.android.a.g(fullscreenMediaActivity, (SnackbarUtil) this.l.get());
            com.nytimes.android.a.b(fullscreenMediaActivity, (cr5) this.c.O2.get());
            return fullscreenMediaActivity;
        }

        private oj7 s3() {
            return new oj7(this.c.O8());
        }

        private GiftShareHubActivity t2(GiftShareHubActivity giftShareHubActivity) {
            y40.a(giftShareHubActivity, (CompositeDisposable) this.f.get());
            y40.b(giftShareHubActivity, (s74) this.c.x4.get());
            y40.g(giftShareHubActivity, (fx3) this.c.f1.get());
            y40.d(giftShareHubActivity, (oi4) this.k.get());
            y40.c(giftShareHubActivity, new sd4());
            y40.f(giftShareHubActivity, (SnackbarUtil) this.l.get());
            y40.e(giftShareHubActivity, (ScreenshotTracker) this.m.get());
            g03.a(giftShareHubActivity, (tr3) this.c.p4.get());
            return giftShareHubActivity;
        }

        private rj7 t3() {
            return new rj7(u3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.nytimes.android.readerhybrid.c u2(com.nytimes.android.readerhybrid.c cVar) {
            je4.a(cVar, this.a);
            je4.b(cVar, (ld1) this.c.n4.get());
            je4.c(cVar, d2());
            je4.f(cVar, (SnackbarUtil) this.l.get());
            je4.h(cVar, (if9) this.c.L4.get());
            je4.g(cVar, j());
            je4.e(cVar, (uy3) this.c.C1.get());
            je4.d(cVar, (hd3) this.q.get());
            return cVar;
        }

        private zj7 u3() {
            return new zj7((cr5) this.c.O2.get(), (AppEventFactory) this.c.X2.get(), (CoroutineScope) this.c.X.get());
        }

        private IntentFilterActivity v2(IntentFilterActivity intentFilterActivity) {
            y40.a(intentFilterActivity, (CompositeDisposable) this.f.get());
            y40.b(intentFilterActivity, (s74) this.c.x4.get());
            y40.g(intentFilterActivity, (fx3) this.c.f1.get());
            y40.d(intentFilterActivity, (oi4) this.k.get());
            y40.c(intentFilterActivity, new sd4());
            y40.f(intentFilterActivity, (SnackbarUtil) this.l.get());
            y40.e(intentFilterActivity, (ScreenshotTracker) this.m.get());
            yn3.a(intentFilterActivity, (DeepLinkManager) this.c.n3.get());
            yn3.c(intentFilterActivity, Q2());
            yn3.b(intentFilterActivity, (com.nytimes.android.entitlements.a) this.c.j1.get());
            return intentFilterActivity;
        }

        private Set v3() {
            return ImmutableSet.D(Y2(), W2(), y3(), z3(), t3(), Z1(), c2(), s3(), (mc0) this.c.V4.get(), (mc0) this.c.W4.get(), (mc0) this.c.Y4.get(), (mc0) this.y.get());
        }

        private LandingPageActivity w2(LandingPageActivity landingPageActivity) {
            by3.b(landingPageActivity, (t43) this.c.T5.get());
            by3.d(landingPageActivity, (r53) this.c.U5.get());
            by3.c(landingPageActivity, R2());
            by3.e(landingPageActivity, (t53) this.c.W5.get());
            by3.a(landingPageActivity, (CoroutineScope) this.c.X.get());
            return landingPageActivity;
        }

        private zp7 w3() {
            return new zp7(en.a(this.c.a), (uq7) this.c.y4.get());
        }

        private LegalDynamicActivity x2(LegalDynamicActivity legalDynamicActivity) {
            y40.a(legalDynamicActivity, (CompositeDisposable) this.f.get());
            y40.b(legalDynamicActivity, (s74) this.c.x4.get());
            y40.g(legalDynamicActivity, (fx3) this.c.f1.get());
            y40.d(legalDynamicActivity, (oi4) this.k.get());
            y40.c(legalDynamicActivity, new sd4());
            y40.f(legalDynamicActivity, (SnackbarUtil) this.l.get());
            y40.e(legalDynamicActivity, (ScreenshotTracker) this.m.get());
            h34.a(legalDynamicActivity, w25.a());
            return legalDynamicActivity;
        }

        private gt7 x3() {
            return new gt7(en.a(this.c.a), (NetworkStatus) this.c.F0.get(), (f15) this.c.z4.get(), (AssetRetriever) this.c.x2.get());
        }

        private MainActivity y2(MainActivity mainActivity) {
            y40.a(mainActivity, (CompositeDisposable) this.f.get());
            y40.b(mainActivity, (s74) this.c.x4.get());
            y40.g(mainActivity, (fx3) this.c.f1.get());
            y40.d(mainActivity, (oi4) this.k.get());
            y40.c(mainActivity, new sd4());
            y40.f(mainActivity, (SnackbarUtil) this.l.get());
            y40.e(mainActivity, (ScreenshotTracker) this.m.get());
            yd4.q(mainActivity, (z58) this.c.e0.get());
            yd4.p(mainActivity, (SmartLockLifecycleObserver) this.D.get());
            yd4.l(mainActivity, (OneTapLifecycleObserver) this.F.get());
            yd4.o(mainActivity, (SaveIntentHandler) this.I.get());
            yd4.k(mainActivity, (OnboardingActivityManager) this.K.get());
            yd4.e(mainActivity, (wc) this.c.E0.get());
            yd4.g(mainActivity, (ForcedLogoutAlert) this.L.get());
            yd4.b(mainActivity, de0.a());
            yd4.s(mainActivity, (MainBottomNavUi) this.N.get());
            yd4.c(mainActivity, (AudioDeepLinkHandler) this.O.get());
            yd4.i(mainActivity, (lm) this.c.Y2.get());
            yd4.a(mainActivity, nt1.a(this.c.L0));
            yd4.r(mainActivity, (if8) this.c.i3.get());
            yd4.j(mainActivity, V2());
            yd4.f(mainActivity, (cb2) this.c.D.get());
            yd4.m(mainActivity, (s96) this.c.d0.get());
            yd4.h(mainActivity, new ForegroundStateObserver());
            yd4.d(mainActivity, (ln1) this.c.f5.get());
            yd4.n(mainActivity, i3());
            return mainActivity;
        }

        private SubscriptionStatusCommand y3() {
            return new SubscriptionStatusCommand((FeedStore) this.c.V.get(), V2());
        }

        private ManageAccountPreference z2(ManageAccountPreference manageAccountPreference) {
            ke4.a(manageAccountPreference, w25.a());
            return manageAccountPreference;
        }

        private UpdateSubscriptionCommand z3() {
            return new UpdateSubscriptionCommand((PushClientManager) this.c.A1.get(), (ET2Scope) this.c.k0.get(), (AbraManager) this.c.Y0.get());
        }

        @Override // defpackage.g34
        public void A(LegalDynamicActivity legalDynamicActivity) {
            x2(legalDynamicActivity);
        }

        @Override // defpackage.db
        public vn8 B() {
            return (vn8) this.o.get();
        }

        @Override // defpackage.rc2
        public void C(FeedbackActivity feedbackActivity) {
            r2(feedbackActivity);
        }

        @Override // defpackage.xn3
        public void D(IntentFilterActivity intentFilterActivity) {
            v2(intentFilterActivity);
        }

        @Override // defpackage.pe7
        public void E(SectionActivity sectionActivity) {
            F2(sectionActivity);
        }

        @Override // defpackage.n3
        public void F(AccountBenefitsActivity accountBenefitsActivity) {
            h2(accountBenefitsActivity);
        }

        @Override // defpackage.w68
        public void G(SubauthShowNewsUserStatePreference subauthShowNewsUserStatePreference) {
            J2(subauthShowNewsUserStatePreference);
        }

        @Override // defpackage.ay3
        public void H(LandingPageActivity landingPageActivity) {
            w2(landingPageActivity);
        }

        @Override // defpackage.gs4
        public void I(MessagingBetaSettingsActivity messagingBetaSettingsActivity) {
        }

        @Override // defpackage.td3
        public si1.a J() {
            return this.c.k9();
        }

        @Override // defpackage.gq5
        public String K() {
            return (String) this.c.S5.get();
        }

        @Override // defpackage.km9
        public SaveHandler L() {
            return (SaveHandler) this.H.get();
        }

        @Override // defpackage.dv5
        public bs3 M() {
            return (bs3) this.c.T3.get();
        }

        @Override // defpackage.td3
        public HybridConfigManager N() {
            return new HybridConfigManager(this.c.V9(), (HybridConfigBuilder) this.c.R4.get(), (ld3) this.c.c5.get(), u01.a());
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.a
        public o99 O() {
            return new k(this.c, this.d, this.e);
        }

        @Override // defpackage.hs0
        public void P(ComposeOnboardingActivity composeOnboardingActivity) {
            k2(composeOnboardingActivity);
        }

        @Override // defpackage.en7
        public void Q(FAQPreference fAQPreference) {
            q2(fAQPreference);
        }

        @Override // defpackage.td3
        public ET2SimpleScope R() {
            return (ET2SimpleScope) this.c.k0.get();
        }

        @Override // defpackage.td3
        public cn8 S() {
            return (cn8) this.c.M4.get();
        }

        @Override // defpackage.td3
        public WebViewClientFactory T() {
            return new WebViewClientFactory(this.r, this.s, this.t, this.w, this.v);
        }

        @Override // defpackage.qb5
        public NytUriHandler U() {
            return new NytUriHandler(T1(), (DeepLinkManager) this.c.n3.get(), (ld1) this.c.n4.get(), w25.a());
        }

        @Override // defpackage.uh7
        public sh7 V() {
            return k3();
        }

        @Override // defpackage.pr1
        public go3 W() {
            return new go3(U(), (NetworkStatus) this.c.F0.get(), (SnackbarUtil) this.l.get(), z());
        }

        @Override // defpackage.td3
        public ld1 X() {
            return (ld1) this.c.n4.get();
        }

        @Override // defpackage.js2
        public void Y(FullscreenMediaActivity fullscreenMediaActivity) {
            s2(fullscreenMediaActivity);
        }

        @Override // defpackage.b27
        public fm9 Z() {
            return (fm9) this.c.R5.get();
        }

        @Override // defpackage.td3, defpackage.ud4, defpackage.dv5
        public cb2 a() {
            return (cb2) this.c.D.get();
        }

        @Override // defpackage.gq5
        public HasGateway a0() {
            return (HasGateway) this.r0.get();
        }

        public mn7 a2() {
            return new mn7(this.a, new sd4());
        }

        @Override // defpackage.td3
        public NetworkStatus b() {
            return (NetworkStatus) this.c.F0.get();
        }

        @Override // defpackage.dv5
        public qv6 b0() {
            return (qv6) this.c.B.get();
        }

        @Override // zk1.a
        public zk1.c c() {
            return al1.a(m(), new m(this.c, this.d));
        }

        @Override // defpackage.td3
        public lm c0() {
            return (lm) this.c.Y2.get();
        }

        @Override // defpackage.ud4, defpackage.dv5
        public gv5 d() {
            return new gv5((cr5) this.c.O2.get(), (AppEventFactory) this.c.X2.get(), (CoroutineScope) this.c.X.get());
        }

        @Override // defpackage.ud4
        public dk0 d0() {
            return (dk0) this.c.h5.get();
        }

        @Override // defpackage.en7
        public void e(ContactNewsroomPreference contactNewsroomPreference) {
            l2(contactNewsroomPreference);
        }

        @Override // defpackage.ud4
        public wy5 e0() {
            return (wy5) this.c.x5.get();
        }

        @Override // defpackage.io1
        public void f(DevSettingsXmlActivity devSettingsXmlActivity) {
            o2(devSettingsXmlActivity);
        }

        @Override // defpackage.uy7
        public void f0(SpellingBeeHostActivity spellingBeeHostActivity) {
            I2(spellingBeeHostActivity);
        }

        @Override // defpackage.vj8
        public void g(TextSizeActivity textSizeActivity) {
            K2(textSizeActivity);
        }

        @Override // defpackage.db
        public ic3 g0() {
            return d2();
        }

        @Override // defpackage.b27
        public b05 getClock() {
            return (b05) this.c.K0.get();
        }

        @Override // defpackage.xd4
        public void h(MainActivity mainActivity) {
            y2(mainActivity);
        }

        @Override // defpackage.dv5
        public d4 h0() {
            return new d4((xr4) this.c.G5.get());
        }

        @Override // defpackage.en7
        public void i(ManageAccountPreference manageAccountPreference) {
            z2(manageAccountPreference);
        }

        @Override // defpackage.ud4
        public qd4 i0() {
            return (qd4) this.M.get();
        }

        @Override // com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity_GeneratedInjector
        public void injectViewingCommentsActivity(ViewingCommentsActivity viewingCommentsActivity) {
            L2(viewingCommentsActivity);
        }

        @Override // com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity_GeneratedInjector
        public void injectWriteNewCommentActivity(WriteNewCommentActivity writeNewCommentActivity) {
        }

        @Override // defpackage.td3
        public pe9 j() {
            return new pe9(this.a);
        }

        @Override // defpackage.jd9
        public void j0(WebActivity webActivity) {
            M2(webActivity);
        }

        @Override // defpackage.ka0
        public void k(BooksBestSellersActivity booksBestSellersActivity) {
            i2(booksBestSellersActivity);
        }

        @Override // defpackage.f03
        public void k0(GiftShareHubActivity giftShareHubActivity) {
            t2(giftShareHubActivity);
        }

        @Override // defpackage.cs4
        public ds4 l() {
            return (ds4) this.w0.get();
        }

        @Override // defpackage.td3
        public oc0 l0() {
            return new oc0(v3());
        }

        @Override // g83.c
        public Set m() {
            return ImmutableSet.D(au.a(), xu.a(), oz.a(), f70.a(), CommentsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), uz0.a(), o81.a(), dc1.a(), kc1.a(), kn1.a(), lr1.a(), nr1.a(), sy1.a(), gd2.a(), md2.a(), vv2.a(), o03.a(), v03.a(), h33.a(), y93.a(), iy3.a(), q34.a(), i44.a(), n44.a(), ce4.a(), ie4.a(), z95.a(), va5.a(), yg5.a(), ah5.a(), dh5.a(), lk5.a(), pq5.a(), sq5.a(), mv5.a(), r06.a(), w06.a(), k36.a(), ru6.a(), qu6.a(), tu6.a(), jf7.a(), bi7.a(), on7.a(), dq7.a(), et7.a(), tu7.a(), bw7.a(), lb8.a(), ze8.a(), yj8.a(), qk8.a(), en8.a(), rs8.a(), ii9.a(), WriteNewCommentViewModel_HiltModules_KeyModule_ProvideFactory.provide(), jm9.a());
        }

        @Override // defpackage.s06
        public void m0(PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity) {
            D2(postRegiLoginOfferBaseActivity);
        }

        @Override // defpackage.b27
        public cn8 n() {
            return (cn8) this.c.M4.get();
        }

        @Override // defpackage.e0
        public void n0(AboutActivity aboutActivity) {
            g2(aboutActivity);
        }

        @Override // defpackage.fo1
        public void o(DevSettingsActivity devSettingsActivity) {
            n2(devSettingsActivity);
        }

        @Override // defpackage.vv7
        public SnackbarUtil o0() {
            return (SnackbarUtil) this.l.get();
        }

        @Override // defpackage.fs0
        public void p(ComposeNotificationsActivity composeNotificationsActivity) {
            j2(composeNotificationsActivity);
        }

        @Override // defpackage.bt7
        public void p0(SingleArticleActivity singleArticleActivity) {
            H2(singleArticleActivity);
        }

        @Override // defpackage.td3
        public n98 q() {
            return (n98) this.c.P0.get();
        }

        @Override // defpackage.b27
        public kb3 q0() {
            return (kb3) this.c.a5.get();
        }

        @Override // defpackage.na5
        public void r(NotificationsSettingsActivity notificationsSettingsActivity) {
            B2(notificationsSettingsActivity);
        }

        @Override // defpackage.dr
        public br r0() {
            return j3();
        }

        @Override // defpackage.pr1
        public TimeStampUtil s() {
            return (TimeStampUtil) this.c.w4.get();
        }

        @Override // defpackage.dv5
        public PlayTabPreferencesStore s0() {
            return this.c.hb();
        }

        @Override // defpackage.km9
        public YouTabPreferencesStore t() {
            return this.c.tc();
        }

        @Override // defpackage.ox1
        public void t0(ET2EventViewerActivity eT2EventViewerActivity) {
            p2(eT2EventViewerActivity);
        }

        @Override // defpackage.td3
        public hd3 u() {
            return (hd3) this.q.get();
        }

        @Override // defpackage.en7
        public void u0(ContactUsPreference contactUsPreference) {
            m2(contactUsPreference);
        }

        @Override // defpackage.td3
        public HybridEventManager v() {
            return (HybridEventManager) this.B.get();
        }

        @Override // defpackage.w95
        public void v0(NotificationTrampolineActivity notificationTrampolineActivity) {
            A2(notificationTrampolineActivity);
        }

        @Override // defpackage.aa6
        public void w(PurrUIWebViewActivity purrUIWebViewActivity) {
            E2(purrUIWebViewActivity);
        }

        @Override // defpackage.g06
        public void w0(PostAuthActivity postAuthActivity) {
            C2(postAuthActivity);
        }

        @Override // defpackage.h36
        public void x(PrivacySettingsActivity privacySettingsActivity) {
        }

        @Override // g83.c
        public ma9 x0() {
            return new m(this.c, this.d);
        }

        @Override // defpackage.im7
        public void y(SettingsActivity settingsActivity) {
            G2(settingsActivity);
        }

        @Override // dagger.hilt.android.internal.managers.a.InterfaceC0476a
        public xp2 y0() {
            return new f(this.c, this.d, this.e);
        }

        @Override // defpackage.pr1
        public DiscoveryEventTracker z() {
            return new DiscoveryEventTracker((ET2Scope) this.c.k0.get(), T1());
        }

        private b(j jVar, d dVar, a43 a43Var, Activity activity) {
            this.e = this;
            this.c = jVar;
            this.d = dVar;
            this.a = activity;
            this.b = a43Var;
            f2(a43Var, activity);
        }
    }

    private static final class c implements n5 {
        private final j a;
        private w97 b;

        @Override // defpackage.n5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public tz4 build() {
            g16.a(this.b, w97.class);
            return new d(this.a, this.b);
        }

        @Override // defpackage.n5
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a(w97 w97Var) {
            this.b = (w97) g16.b(w97Var);
            return this;
        }

        private c(j jVar) {
            this.a = jVar;
        }
    }

    private static final class d extends tz4 {
        private final j a;
        private final d b;
        private p76 c;
        private p76 d;

        private static final class a implements p76 {
            private final j a;
            private final d b;
            private final int c;

            a(j jVar, d dVar, int i) {
                this.a = jVar;
                this.b = dVar;
                this.c = i;
            }

            @Override // defpackage.p76
            public Object get() {
                int i = this.c;
                if (i == 0) {
                    return p5.a();
                }
                if (i == 1) {
                    return new t93();
                }
                throw new AssertionError(this.c);
            }
        }

        private void d(w97 w97Var) {
            this.c = nt1.b(new a(this.a, this.b, 0));
            this.d = nt1.b(new a(this.a, this.b, 1));
        }

        @Override // m4.a
        public l4 a() {
            return new a(this.a, this.b);
        }

        @Override // o5.d
        public q5 b() {
            return (q5) this.c.get();
        }

        private d(j jVar, w97 w97Var) {
            this.b = this;
            this.a = jVar;
            d(w97Var);
        }
    }

    public static final class e {
        private v6 a;
        private w7 b;
        private i9 c;
        private dn d;
        private cb1 e;
        private jx1 f;
        private j52 g;
        private FirebaseModule h;
        private m43 i;
        private y43 j;
        private lc3 k;
        private s94 l;
        private m05 m;
        private o05 n;
        private v96 o;
        private c17 p;
        private g58 q;
        private f58 r;
        private a78 s;

        public e a(dn dnVar) {
            this.d = (dn) g16.b(dnVar);
            return this;
        }

        public wz4 b() {
            if (this.a == null) {
                this.a = new v6();
            }
            if (this.b == null) {
                this.b = new w7();
            }
            if (this.c == null) {
                this.c = new i9();
            }
            g16.a(this.d, dn.class);
            if (this.e == null) {
                this.e = new cb1();
            }
            if (this.f == null) {
                this.f = new jx1();
            }
            if (this.g == null) {
                this.g = new j52();
            }
            if (this.h == null) {
                this.h = new FirebaseModule();
            }
            if (this.i == null) {
                this.i = new m43();
            }
            if (this.j == null) {
                this.j = new y43();
            }
            if (this.k == null) {
                this.k = new lc3();
            }
            if (this.l == null) {
                this.l = new s94();
            }
            if (this.m == null) {
                this.m = new m05();
            }
            if (this.n == null) {
                this.n = new o05();
            }
            if (this.o == null) {
                this.o = new v96();
            }
            if (this.p == null) {
                this.p = new c17();
            }
            if (this.q == null) {
                this.q = new g58();
            }
            if (this.r == null) {
                this.r = new f58();
            }
            if (this.s == null) {
                this.s = new a78();
            }
            return new j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
        }

        private e() {
        }
    }

    private static final class f implements xp2 {
        private final j a;
        private final d b;
        private final b c;
        private Fragment d;

        @Override // defpackage.xp2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public uz4 build() {
            g16.a(this.d, Fragment.class);
            return new g(this.a, this.b, this.c, new m6(), this.d);
        }

        @Override // defpackage.xp2
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f a(Fragment fragment) {
            this.d = (Fragment) g16.b(fragment);
            return this;
        }

        private f(j jVar, d dVar, b bVar) {
            this.a = jVar;
            this.b = dVar;
            this.c = bVar;
        }
    }

    private static final class g extends uz4 {
        private final Fragment a;
        private final m6 b;
        private final j c;
        private final d d;
        private final b e;
        private final g f;
        private p76 g;
        private p76 h;
        private p76 i;
        private p76 j;
        private p76 k;
        private p76 l;
        private p76 m;
        private p76 n;
        private p76 o;
        private p76 p;

        private static final class a implements p76 {
            private final j a;
            private final d b;
            private final b c;
            private final g d;
            private final int e;

            a(j jVar, d dVar, b bVar, g gVar, int i) {
                this.a = jVar;
                this.b = dVar;
                this.c = bVar;
                this.d = gVar;
                this.e = i;
            }

            @Override // defpackage.p76
            public Object get() {
                switch (this.e) {
                    case 0:
                        return new b35();
                    case 1:
                        return new q93((ET2Scope) this.a.k0.get());
                    case 2:
                        return hn7.a(this.d.a, (ET2Scope) this.a.k0.get());
                    case 3:
                        return n6.a(this.d.b, this.a.S5);
                    case 4:
                        return new HybridContentLoader((hd3) this.c.q.get(), this.d.a);
                    case 5:
                        return new WebContentLoader((NetworkStatus) this.a.F0.get(), (z58) this.a.e0.get(), this.c.j(), (SnackbarUtil) this.c.l.get(), (hd3) this.c.q.get(), this.d.a);
                    case 6:
                        return this.d.q0(kf7.a());
                    case 7:
                        return new eh5(this.c.a, (NetworkStatus) this.a.F0.get(), (cb2) this.a.D.get(), (pr) this.c.D0.get(), (FooterBinder) this.c.E0.get(), (RecentlyViewedManager) this.a.R3.get(), (hb5) this.c.g.get(), (yi7) this.a.S6.get(), (pr) this.c.D0.get(), (com.nytimes.android.media.common.a) this.a.H4.get(), (AudioFileVerifier) this.a.L6.get(), (BookCategoryRepository) this.a.o5.get(), (FeedStore) this.a.V.get(), this.d.w0(), this.d.a);
                    case 8:
                        return new dx4(this.c.a, (NetworkStatus) this.a.F0.get(), (cb2) this.a.D.get(), (pr) this.c.D0.get(), (FooterBinder) this.c.E0.get(), (RecentlyViewedManager) this.a.R3.get(), (hb5) this.c.g.get(), (yi7) this.a.S6.get(), (pr) this.c.D0.get(), (com.nytimes.android.media.common.a) this.a.H4.get(), (AudioFileVerifier) this.a.L6.get(), (FeedStore) this.a.V.get(), this.d.w0(), this.a.va(), this.d.a);
                    case 9:
                        return new et5(this.c.a, (cb2) this.a.D.get(), this.a.ea(), (NetworkStatus) this.a.F0.get());
                    default:
                        throw new AssertionError(this.e);
                }
            }
        }

        private mu6 A0() {
            return new mu6((ET2Scope) this.c.k0.get(), z0(), this.e.X1(), (AbraManager) this.c.Y0.get());
        }

        private RegiwallCard B0() {
            return n0(ev6.a());
        }

        private p97 C0() {
            return new p97(nt1.a(this.m), (r57) this.c.F4.get(), this.c.j(), (NetworkStatus) this.c.F0.get(), e57.a(), (SavedSectionHelper) this.e.C0.get(), (vb2) this.c.g5.get());
        }

        private SectionCoalescerSource D0() {
            return p0(bf7.a());
        }

        private com.nytimes.android.dailyfive.ui.b E() {
            return new com.nytimes.android.dailyfive.ui.b((SnackbarUtil) this.e.l.get(), this.e.a, (TimeStampUtil) this.c.w4.get());
        }

        private vg7 E0() {
            return new vg7(nt1.a(this.m), (r57) this.c.F4.get(), this.c.j(), (NetworkStatus) this.c.F0.get(), e57.a(), (vb2) this.c.g5.get());
        }

        private j81 F() {
            return new j81((tr3) this.c.p4.get(), this.a, (b35) this.g.get());
        }

        private tr7 F0() {
            return new tr7(this.e.a, (vn8) this.e.o.get(), this.e.e2());
        }

        private DailyFiveViewItemProvider G() {
            return new DailyFiveViewItemProvider(qg3.a(), (k56) this.c.c6.get(), F(), (RecentlyViewedManager) this.c.R3.get(), (DailyFiveAnalytics) this.c.b6.get(), this.a);
        }

        private SideEffectOnScrollObserver G0() {
            return new SideEffectOnScrollObserver(this.e.a, F0());
        }

        private Set H() {
            return ImmutableSet.z(this.c.m9());
        }

        private TruncatorCard H0() {
            return new TruncatorCard((nt8) this.c.K6.get(), (AppPreferences) this.c.v.get());
        }

        private rn1 I() {
            return new rn1(en.a(this.c.a), H());
        }

        private VideoAutoPlayScrollListener I0() {
            return new VideoAutoPlayScrollListener(en.a(this.c.a), this.c.X8(), (hb5) this.e.g.get(), (RecentlyViewedManager) this.c.R3.get(), (g69) this.e.F0.get(), (cv) this.e.G0.get());
        }

        private DismissibleRegiwallCard J() {
            return U(bs1.a());
        }

        private GetMoreItemsCoalescerSource K() {
            return a0(ey2.a());
        }

        private HomeWebViewClient L() {
            return c0(aa3.a(this.a, (DeepLinkManager) this.c.n3.get(), (t93) this.d.d.get()));
        }

        private oa3 M() {
            return new oa3(this.k, this.l);
        }

        private id3 N() {
            return new id3(this.c.da());
        }

        private kd3 O() {
            return new kd3((com.nytimes.android.subauth.core.purr.a) this.c.a0.get(), (PurrDirectiveOverrider) this.c.g0.get());
        }

        private void P(m6 m6Var, Fragment fragment) {
            this.g = nt1.b(new a(this.c, this.d, this.e, this.f, 0));
            this.h = nt1.b(new a(this.c, this.d, this.e, this.f, 1));
            this.i = nt1.b(new a(this.c, this.d, this.e, this.f, 2));
            this.j = nt1.b(new a(this.c, this.d, this.e, this.f, 3));
            this.k = new a(this.c, this.d, this.e, this.f, 4);
            this.l = new a(this.c, this.d, this.e, this.f, 5);
            this.m = new a(this.c, this.d, this.e, this.f, 6);
            this.n = new a(this.c, this.d, this.e, this.f, 7);
            this.o = new a(this.c, this.d, this.e, this.f, 8);
            this.p = new a(this.c, this.d, this.e, this.f, 9);
        }

        private AboutFragment Q(AboutFragment aboutFragment) {
            l0.b(aboutFragment, this.c.b9());
            l0.d(aboutFragment, (yc2) this.c.g1.get());
            l0.e(aboutFragment, (yc2) this.c.g1.get());
            l0.j(aboutFragment, (SnackbarUtil) this.e.l.get());
            l0.h(aboutFragment, (qv6) this.c.B.get());
            l0.f(aboutFragment, this.c.E9());
            l0.c(aboutFragment, (cb2) this.c.D.get());
            l0.k(aboutFragment, w25.a());
            l0.i(aboutFragment, (SettingsPageEventSender) this.i.get());
            l0.g(aboutFragment, (d96) this.c.l0.get());
            l0.a(aboutFragment, (AbraManager) this.c.Y0.get());
            return aboutFragment;
        }

        private AudioDrawerDialogFragment R(AudioDrawerDialogFragment audioDrawerDialogFragment) {
            com.nytimes.android.media.audio.views.b.a(audioDrawerDialogFragment, (AudioManager) this.c.G4.get());
            com.nytimes.android.media.audio.views.b.c(audioDrawerDialogFragment, (hb5) this.e.g.get());
            com.nytimes.android.media.audio.views.b.b(audioDrawerDialogFragment, (ax) this.c.I4.get());
            com.nytimes.android.media.audio.views.b.d(audioDrawerDialogFragment, (zh4) this.e.i.get());
            return audioDrawerDialogFragment;
        }

        private BaseHybridFragment S(BaseHybridFragment baseHybridFragment) {
            n50.h(baseHybridFragment, this.c.W9());
            n50.l(baseHybridFragment, this.c.Z9());
            n50.c(baseHybridFragment, this.c.U9());
            n50.b(baseHybridFragment, this.c.T9());
            n50.o(baseHybridFragment, this.c.da());
            n50.i(baseHybridFragment, N());
            n50.e(baseHybridFragment, (dz1) this.c.Y5.get());
            n50.d(baseHybridFragment, (sb3) this.c.Z5.get());
            n50.p(baseHybridFragment, this.c.ba());
            n50.n(baseHybridFragment, this.c.aa());
            n50.g(baseHybridFragment, this.c.X9());
            n50.k(baseHybridFragment, zc3.a(this.c.i));
            n50.a(baseHybridFragment, (AbraManager) this.c.Y0.get());
            n50.j(baseHybridFragment, O());
            n50.f(baseHybridFragment, (kb3) this.c.a5.get());
            n50.m(baseHybridFragment, (c05) this.c.P1.get());
            return baseHybridFragment;
        }

        private DailyFiveFragment T(DailyFiveFragment dailyFiveFragment) {
            z71.a(dailyFiveFragment, (DailyFiveAnalytics) this.c.b6.get());
            z71.h(dailyFiveFragment, this.e.a2());
            z71.g(dailyFiveFragment, F());
            z71.i(dailyFiveFragment, G());
            z71.b(dailyFiveFragment, E());
            z71.f(dailyFiveFragment, (b35) this.g.get());
            z71.c(dailyFiveFragment, (cb2) this.c.D.get());
            z71.e(dailyFiveFragment, new sd4());
            z71.d(dailyFiveFragment, (vb2) this.c.g5.get());
            return dailyFiveFragment;
        }

        private DismissibleRegiwallCard U(DismissibleRegiwallCard dismissibleRegiwallCard) {
            cs1.a(dismissibleRegiwallCard, (ET2Scope) this.c.k0.get());
            return dismissibleRegiwallCard;
        }

        private FullScreenImageFragment V(FullScreenImageFragment fullScreenImageFragment) {
            pr2.b(fullScreenImageFragment, nt1.a(this.c.y4));
            pr2.c(fullScreenImageFragment, (FullscreenToolsController) this.e.n.get());
            pr2.a(fullScreenImageFragment, this.c.ea());
            return fullScreenImageFragment;
        }

        private FullScreenSlideshowFragment W(FullScreenSlideshowFragment fullScreenSlideshowFragment) {
            rr2.a(fullScreenSlideshowFragment, (cb2) this.c.D.get());
            return fullScreenSlideshowFragment;
        }

        private FullScreenVideoFragment X(FullScreenVideoFragment fullScreenVideoFragment) {
            bs2.f(fullScreenVideoFragment, (NetworkStatus) this.c.F0.get());
            bs2.j(fullScreenVideoFragment, (VideoUtil) this.c.f6.get());
            bs2.i(fullScreenVideoFragment, (FullscreenVideoFetcher) this.e.A0.get());
            bs2.h(fullScreenVideoFragment, (x89) this.c.J6.get());
            bs2.g(fullScreenVideoFragment, (FullscreenToolsController) this.e.n.get());
            bs2.d(fullScreenVideoFragment, (zh4) this.e.i.get());
            bs2.e(fullScreenVideoFragment, (bo4) this.e.h.get());
            bs2.a(fullScreenVideoFragment, (z4) this.e.j.get());
            bs2.c(fullScreenVideoFragment, (hb5) this.e.g.get());
            bs2.b(fullScreenVideoFragment, (AudioManager) this.c.G4.get());
            return fullScreenVideoFragment;
        }

        private FullscreenAdFragment Y(FullscreenAdFragment fullscreenAdFragment) {
            ds2.a(fullscreenAdFragment, nt1.a(this.c.y4));
            return fullscreenAdFragment;
        }

        private GatewayFragmentCard Z(GatewayFragmentCard gatewayFragmentCard) {
            qw2.i(gatewayFragmentCard, B0());
            qw2.h(gatewayFragmentCard, x0());
            qw2.d(gatewayFragmentCard, J());
            qw2.f(gatewayFragmentCard, this.c.K9());
            qw2.j(gatewayFragmentCard, H0());
            qw2.b(gatewayFragmentCard, (AppPreferences) this.c.v.get());
            qw2.g(gatewayFragmentCard, (uy3) this.c.C1.get());
            qw2.e(gatewayFragmentCard, (GatewayFragmentManager) this.e.m0.get());
            qw2.c(gatewayFragmentCard, (ArticlePageEventSender) this.e.h0.get());
            qw2.k(gatewayFragmentCard, w25.a());
            qw2.a(gatewayFragmentCard, (AbraManager) this.c.Y0.get());
            return gatewayFragmentCard;
        }

        private GetMoreItemsCoalescerSource a0(GetMoreItemsCoalescerSource getMoreItemsCoalescerSource) {
            com.nytimes.android.sectionfront.adapter.model.a.a(getMoreItemsCoalescerSource, (SavedSectionHelper) this.e.C0.get());
            return getMoreItemsCoalescerSource;
        }

        private HomeFragment b0(HomeFragment homeFragment) {
            s93.f(homeFragment, (ld1) this.c.n4.get());
            s93.t(homeFragment, (SnackbarUtil) this.e.l.get());
            s93.v(homeFragment, (ls2) this.e.v.get());
            s93.h(homeFragment, (q93) this.h.get());
            s93.k(homeFragment, (hd3) this.e.q.get());
            s93.w(homeFragment, L());
            s93.s(homeFragment, this.e.a2());
            s93.q(homeFragment, (lu6) this.e.x0.get());
            s93.p(homeFragment, z0());
            s93.o(homeFragment, (NetworkStatus) this.c.F0.get());
            s93.b(homeFragment, (lm) this.c.Y2.get());
            s93.j(homeFragment, (kb3) this.c.a5.get());
            s93.e(homeFragment, this.e.l0());
            s93.u(homeFragment, (TimeStampUtil) this.c.w4.get());
            s93.r(homeFragment, (qv6) this.c.B.get());
            s93.l(homeFragment, (bs3) this.c.T3.get());
            s93.c(homeFragment, (AppPreferences) this.c.v.get());
            s93.d(homeFragment, en.a(this.c.a));
            s93.i(homeFragment, (cb2) this.c.D.get());
            s93.m(homeFragment, new sd4());
            s93.n(homeFragment, (MessageStateFactory) this.c.Q5.get());
            s93.g(homeFragment, (ET2Scope) this.c.k0.get());
            s93.a(homeFragment, (AbraManager) this.c.Y0.get());
            return homeFragment;
        }

        private HomeWebViewClient c0(HomeWebViewClient homeWebViewClient) {
            je4.a(homeWebViewClient, this.e.a);
            je4.b(homeWebViewClient, (ld1) this.c.n4.get());
            je4.c(homeWebViewClient, this.e.d2());
            je4.f(homeWebViewClient, (SnackbarUtil) this.e.l.get());
            je4.h(homeWebViewClient, (if9) this.c.L4.get());
            je4.g(homeWebViewClient, this.e.j());
            je4.e(homeWebViewClient, (uy3) this.c.C1.get());
            je4.d(homeWebViewClient, (hd3) this.e.q.get());
            return homeWebViewClient;
        }

        private LogOutDialog d0(LogOutDialog logOutDialog) {
            q84.a(logOutDialog, (com.nytimes.android.entitlements.a) this.c.j1.get());
            q84.b(logOutDialog, (FeedStore) this.c.V.get());
            return logOutDialog;
        }

        private NotificationsFragment e0(NotificationsFragment notificationsFragment) {
            ja5.d(notificationsFragment, (SnackbarUtil) this.e.l.get());
            ja5.b(notificationsFragment, (SettingsPageEventSender) this.i.get());
            ja5.a(notificationsFragment, this.e.V2());
            ja5.c(notificationsFragment, (SharedPreferences) this.c.M.get());
            return notificationsFragment;
        }

        private NotificationsSettingsFragment f0(NotificationsSettingsFragment notificationsSettingsFragment) {
            ta5.a(notificationsSettingsFragment, (AppPreferences) this.c.v.get());
            ta5.b(notificationsSettingsFragment, (tm) this.c.U4.get());
            return notificationsSettingsFragment;
        }

        private OfflineCard g0(OfflineCard offlineCard) {
            ed5.c(offlineCard, (qv6) this.c.B.get());
            ed5.d(offlineCard, (Resources) this.c.u.get());
            ed5.b(offlineCard, (com.nytimes.android.entitlements.a) this.c.j1.get());
            ed5.e(offlineCard, (SavedManager) this.c.C3.get());
            ed5.a(offlineCard, (AppPreferences) this.c.v.get());
            return offlineCard;
        }

        private PaywallDialogFragment h0(PaywallDialogFragment paywallDialogFragment) {
            kq5.b(paywallDialogFragment, (t53) this.c.W5.get());
            kq5.a(paywallDialogFragment, (CoroutineScope) this.c.X.get());
            return paywallDialogFragment;
        }

        private PoisonPillOverlayViewImpl i0(PoisonPillOverlayViewImpl poisonPillOverlayViewImpl) {
            cz5.a(poisonPillOverlayViewImpl, (wy5) this.c.x5.get());
            return poisonPillOverlayViewImpl;
        }

        private RecentlyViewedFragment j0(RecentlyViewedFragment recentlyViewedFragment) {
            fs6.e(recentlyViewedFragment, (RecentlyViewedManager) this.c.R3.get());
            fs6.g(recentlyViewedFragment, (uq7) this.c.y4.get());
            fs6.i(recentlyViewedFragment, (SnackbarUtil) this.e.l.get());
            fs6.f(recentlyViewedFragment, (SavingBridge) this.e.B0.get());
            fs6.b(recentlyViewedFragment, this.c.j());
            fs6.d(recentlyViewedFragment, (qq3) this.c.Q3.get());
            fs6.c(recentlyViewedFragment, (cb2) this.c.D.get());
            fs6.h(recentlyViewedFragment, (com.nytimes.android.entitlements.b) this.c.j1.get());
            fs6.a(recentlyViewedFragment, y0());
            return recentlyViewedFragment;
        }

        private RecentlyViewedUnfearFragment k0(RecentlyViewedUnfearFragment recentlyViewedUnfearFragment) {
            ws6.a(recentlyViewedUnfearFragment, y0());
            ws6.b(recentlyViewedUnfearFragment, (SaveHandler) this.e.H.get());
            ws6.c(recentlyViewedUnfearFragment, (uq7) this.c.y4.get());
            return recentlyViewedUnfearFragment;
        }

        private RegibundleDialogFragment l0(RegibundleDialogFragment regibundleDialogFragment) {
            gu6.d(regibundleDialogFragment, (t53) this.c.W5.get());
            gu6.a(regibundleDialogFragment, (CoroutineScope) this.c.X.get());
            gu6.b(regibundleDialogFragment, (t43) this.c.T5.get());
            gu6.c(regibundleDialogFragment, v0());
            return regibundleDialogFragment;
        }

        private RegibundleFragment m0(RegibundleFragment regibundleFragment) {
            ju6.c(regibundleFragment, (uy3) this.c.C1.get());
            ju6.d(regibundleFragment, (z58) this.c.e0.get());
            ju6.a(regibundleFragment, (com.nytimes.android.entitlements.a) this.c.j1.get());
            ju6.b(regibundleFragment, (lu6) this.e.x0.get());
            return regibundleFragment;
        }

        private RegiwallCard n0(RegiwallCard regiwallCard) {
            fv6.b(regiwallCard, (qv6) this.c.B.get());
            fv6.a(regiwallCard, (ET2Scope) this.c.k0.get());
            return regiwallCard;
        }

        private SavedSectionFrontFragment o0(SavedSectionFrontFragment savedSectionFrontFragment) {
            com.nytimes.android.sectionfront.e.l(savedSectionFrontFragment, (RecentlyViewedManager) this.c.R3.get());
            com.nytimes.android.sectionfront.e.h(savedSectionFrontFragment, (NetworkStatus) this.c.F0.get());
            com.nytimes.android.sectionfront.e.k(savedSectionFrontFragment, E0());
            com.nytimes.android.sectionfront.e.p(savedSectionFrontFragment, (SnackbarUtil) this.e.l.get());
            com.nytimes.android.sectionfront.e.e(savedSectionFrontFragment, (z4) this.e.j.get());
            com.nytimes.android.sectionfront.e.d(savedSectionFrontFragment, (hb5) this.e.g.get());
            com.nytimes.android.sectionfront.e.g(savedSectionFrontFragment, (tr3) this.c.p4.get());
            com.nytimes.android.sectionfront.e.i(savedSectionFrontFragment, this.n);
            com.nytimes.android.sectionfront.e.f(savedSectionFrontFragment, this.o);
            com.nytimes.android.sectionfront.e.j(savedSectionFrontFragment, this.p);
            com.nytimes.android.sectionfront.e.c(savedSectionFrontFragment, (vb2) this.c.g5.get());
            com.nytimes.android.sectionfront.e.q(savedSectionFrontFragment, I0());
            com.nytimes.android.sectionfront.e.o(savedSectionFrontFragment, (r57) this.c.F4.get());
            com.nytimes.android.sectionfront.e.n(savedSectionFrontFragment, A0());
            com.nytimes.android.sectionfront.e.m(savedSectionFrontFragment, (lu6) this.e.x0.get());
            com.nytimes.android.sectionfront.e.b(savedSectionFrontFragment, (cb2) this.c.D.get());
            com.nytimes.android.sectionfront.e.a(savedSectionFrontFragment, (ET2Scope) this.c.k0.get());
            com.nytimes.android.sectionfront.d.d(savedSectionFrontFragment, (SavedSectionHelper) this.e.C0.get());
            com.nytimes.android.sectionfront.d.c(savedSectionFrontFragment, (SavedManager) this.c.C3.get());
            com.nytimes.android.sectionfront.d.b(savedSectionFrontFragment, C0());
            com.nytimes.android.sectionfront.d.a(savedSectionFrontFragment, (com.nytimes.android.entitlements.a) this.c.j1.get());
            return savedSectionFrontFragment;
        }

        private SectionCoalescerSource p0(SectionCoalescerSource sectionCoalescerSource) {
            com.nytimes.android.sectionfront.adapter.model.d.b(sectionCoalescerSource, en.a(this.c.a));
            com.nytimes.android.sectionfront.adapter.model.d.a(sectionCoalescerSource, (AudioFileVerifier) this.c.L6.get());
            com.nytimes.android.sectionfront.adapter.model.d.d(sectionCoalescerSource, this.c.wa());
            com.nytimes.android.sectionfront.adapter.model.d.f(sectionCoalescerSource, (TimeStampUtil) this.c.w4.get());
            com.nytimes.android.sectionfront.adapter.model.d.e(sectionCoalescerSource, (SFSummaryController) this.c.R6.get());
            com.nytimes.android.sectionfront.adapter.model.d.c(sectionCoalescerSource, this.c.ea());
            return sectionCoalescerSource;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SectionFrontCoalescer q0(SectionFrontCoalescer sectionFrontCoalescer) {
            com.nytimes.android.sectionfront.adapter.model.e.b(sectionFrontCoalescer, D0());
            com.nytimes.android.sectionfront.adapter.model.e.a(sectionFrontCoalescer, K());
            return sectionFrontCoalescer;
        }

        private SectionFrontFragment r0(SectionFrontFragment sectionFrontFragment) {
            com.nytimes.android.sectionfront.e.l(sectionFrontFragment, (RecentlyViewedManager) this.c.R3.get());
            com.nytimes.android.sectionfront.e.h(sectionFrontFragment, (NetworkStatus) this.c.F0.get());
            com.nytimes.android.sectionfront.e.k(sectionFrontFragment, E0());
            com.nytimes.android.sectionfront.e.p(sectionFrontFragment, (SnackbarUtil) this.e.l.get());
            com.nytimes.android.sectionfront.e.e(sectionFrontFragment, (z4) this.e.j.get());
            com.nytimes.android.sectionfront.e.d(sectionFrontFragment, (hb5) this.e.g.get());
            com.nytimes.android.sectionfront.e.g(sectionFrontFragment, (tr3) this.c.p4.get());
            com.nytimes.android.sectionfront.e.i(sectionFrontFragment, this.n);
            com.nytimes.android.sectionfront.e.f(sectionFrontFragment, this.o);
            com.nytimes.android.sectionfront.e.j(sectionFrontFragment, this.p);
            com.nytimes.android.sectionfront.e.c(sectionFrontFragment, (vb2) this.c.g5.get());
            com.nytimes.android.sectionfront.e.q(sectionFrontFragment, I0());
            com.nytimes.android.sectionfront.e.o(sectionFrontFragment, (r57) this.c.F4.get());
            com.nytimes.android.sectionfront.e.n(sectionFrontFragment, A0());
            com.nytimes.android.sectionfront.e.m(sectionFrontFragment, (lu6) this.e.x0.get());
            com.nytimes.android.sectionfront.e.b(sectionFrontFragment, (cb2) this.c.D.get());
            com.nytimes.android.sectionfront.e.a(sectionFrontFragment, (ET2Scope) this.c.k0.get());
            return sectionFrontFragment;
        }

        private SettingsFragment s0(SettingsFragment settingsFragment) {
            jn7.r(settingsFragment, w25.a());
            jn7.p(settingsFragment, this.c.Pb());
            jn7.c(settingsFragment, (jc) this.c.L0.get());
            jn7.j(settingsFragment, (yc2) this.c.g1.get());
            jn7.l(settingsFragment, (NetworkStatus) this.c.F0.get());
            jn7.g(settingsFragment, (com.nytimes.android.entitlements.a) this.c.j1.get());
            jn7.i(settingsFragment, (FeedStore) this.c.V.get());
            jn7.d(settingsFragment, (AppPreferences) this.c.v.get());
            jn7.e(settingsFragment, (tm) this.c.U4.get());
            jn7.q(settingsFragment, (SnackbarUtil) this.e.l.get());
            jn7.k(settingsFragment, (uy3) this.c.C1.get());
            jn7.b(settingsFragment, (AccountSettingsPresenter) this.e.y0.get());
            jn7.m(settingsFragment, this.c.Za());
            jn7.n(settingsFragment, (PostLoginRegiOfferManager) this.c.i5.get());
            jn7.h(settingsFragment, (cb2) this.c.D.get());
            jn7.f(settingsFragment, I());
            jn7.a(settingsFragment, (AbraManager) this.c.Y0.get());
            jn7.o(settingsFragment, (s96) this.c.d0.get());
            return settingsFragment;
        }

        private SpellingBeeHybridFragment t0(SpellingBeeHybridFragment spellingBeeHybridFragment) {
            n50.h(spellingBeeHybridFragment, this.c.W9());
            n50.l(spellingBeeHybridFragment, this.c.Z9());
            n50.c(spellingBeeHybridFragment, this.c.U9());
            n50.b(spellingBeeHybridFragment, this.c.T9());
            n50.o(spellingBeeHybridFragment, this.c.da());
            n50.i(spellingBeeHybridFragment, N());
            n50.e(spellingBeeHybridFragment, (dz1) this.c.Y5.get());
            n50.d(spellingBeeHybridFragment, (sb3) this.c.Z5.get());
            n50.p(spellingBeeHybridFragment, this.c.ba());
            n50.n(spellingBeeHybridFragment, this.c.aa());
            n50.g(spellingBeeHybridFragment, this.c.X9());
            n50.k(spellingBeeHybridFragment, zc3.a(this.c.i));
            n50.a(spellingBeeHybridFragment, (AbraManager) this.c.Y0.get());
            n50.j(spellingBeeHybridFragment, O());
            n50.f(spellingBeeHybridFragment, (kb3) this.c.a5.get());
            n50.m(spellingBeeHybridFragment, (c05) this.c.P1.get());
            return spellingBeeHybridFragment;
        }

        private WebViewFragment u0(WebViewFragment webViewFragment) {
            xe9.g(webViewFragment, (hd3) this.e.q.get());
            xe9.i(webViewFragment, (String) this.j.get());
            xe9.d(webViewFragment, (HasGateway) this.e.r0.get());
            xe9.h(webViewFragment, (MenuManager) this.e.e0.get());
            xe9.c(webViewFragment, (cb2) this.c.D.get());
            xe9.b(webViewFragment, (ld1) this.c.n4.get());
            xe9.k(webViewFragment, this.e.T());
            xe9.f(webViewFragment, nt1.a(this.e.B));
            xe9.e(webViewFragment, M());
            xe9.j(webViewFragment, G0());
            xe9.a(webViewFragment, this.e.l0());
            return webViewFragment;
        }

        private Map v0() {
            return ImmutableMap.q(DataConfigId.Regibundle, this.e.h3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public mi4 w0() {
            return new mi4((VideoAssetToVideoItemFunc) this.c.v6.get(), (com.nytimes.android.ad.a) this.c.h6.get());
        }

        private OfflineCard x0() {
            return g0(dd5.a());
        }

        private xr6 y0() {
            return new xr6((ET2Scope) this.c.k0.get());
        }

        private ku6 z0() {
            return new ku6((cb2) this.c.D.get(), (AppPreferences) this.c.v.get(), (com.nytimes.android.entitlements.a) this.c.j1.get(), (qv6) this.c.B.get());
        }

        @Override // defpackage.bz5
        public void a(PoisonPillOverlayViewImpl poisonPillOverlayViewImpl) {
            i0(poisonPillOverlayViewImpl);
        }

        @Override // defpackage.r93
        public void b(HomeFragment homeFragment) {
            b0(homeFragment);
        }

        @Override // zk1.b
        public zk1.c c() {
            return this.e.c();
        }

        @Override // defpackage.k0
        public void d(AboutFragment aboutFragment) {
            Q(aboutFragment);
        }

        @Override // defpackage.qr2
        public void e(FullScreenSlideshowFragment fullScreenSlideshowFragment) {
            W(fullScreenSlideshowFragment);
        }

        @Override // defpackage.fu6
        public void f(RegibundleDialogFragment regibundleDialogFragment) {
            l0(regibundleDialogFragment);
        }

        @Override // defpackage.cs2
        public void g(FullscreenAdFragment fullscreenAdFragment) {
            Y(fullscreenAdFragment);
        }

        @Override // defpackage.vs6
        public void h(RecentlyViewedUnfearFragment recentlyViewedUnfearFragment) {
            k0(recentlyViewedUnfearFragment);
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.b
        public zb9 i() {
            return new o(this.c, this.d, this.e, this.f);
        }

        @Override // defpackage.in7
        public void j(SettingsFragment settingsFragment) {
            s0(settingsFragment);
        }

        @Override // defpackage.y71
        public void k(DailyFiveFragment dailyFiveFragment) {
            T(dailyFiveFragment);
        }

        @Override // defpackage.sw
        public void l(AudioDrawerDialogFragment audioDrawerDialogFragment) {
            R(audioDrawerDialogFragment);
        }

        @Override // defpackage.es6
        public void m(RecentlyViewedFragment recentlyViewedFragment) {
            j0(recentlyViewedFragment);
        }

        @Override // defpackage.as2
        public void n(FullScreenVideoFragment fullScreenVideoFragment) {
            X(fullScreenVideoFragment);
        }

        @Override // defpackage.wy7
        public void o(SpellingBeeHybridFragment spellingBeeHybridFragment) {
            t0(spellingBeeHybridFragment);
        }

        @Override // defpackage.sa5
        public void p(NotificationsSettingsFragment notificationsSettingsFragment) {
            f0(notificationsSettingsFragment);
        }

        @Override // defpackage.of7
        public void q(SectionFrontFragment sectionFrontFragment) {
            r0(sectionFrontFragment);
        }

        @Override // defpackage.jq5
        public void r(PaywallDialogFragment paywallDialogFragment) {
            h0(paywallDialogFragment);
        }

        @Override // defpackage.m50
        public void s(BaseHybridFragment baseHybridFragment) {
            S(baseHybridFragment);
        }

        @Override // defpackage.p84
        public void t(LogOutDialog logOutDialog) {
            d0(logOutDialog);
        }

        @Override // defpackage.or2
        public void u(FullScreenImageFragment fullScreenImageFragment) {
            V(fullScreenImageFragment);
        }

        @Override // defpackage.pw2
        public void v(GatewayFragmentCard gatewayFragmentCard) {
            Z(gatewayFragmentCard);
        }

        @Override // defpackage.iu6
        public void w(RegibundleFragment regibundleFragment) {
            m0(regibundleFragment);
        }

        @Override // defpackage.ia5
        public void x(NotificationsFragment notificationsFragment) {
            e0(notificationsFragment);
        }

        @Override // defpackage.o97
        public void y(SavedSectionFrontFragment savedSectionFrontFragment) {
            o0(savedSectionFrontFragment);
        }

        @Override // defpackage.we9
        public void z(WebViewFragment webViewFragment) {
            u0(webViewFragment);
        }

        private g(j jVar, d dVar, b bVar, m6 m6Var, Fragment fragment) {
            this.f = this;
            this.c = jVar;
            this.d = dVar;
            this.e = bVar;
            this.a = fragment;
            this.b = m6Var;
            P(m6Var, fragment);
        }
    }

    private static final class h implements al7 {
        private final j a;
        private Service b;

        @Override // defpackage.al7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vz4 build() {
            g16.a(this.b, Service.class);
            return new i(this.a, this.b);
        }

        @Override // defpackage.al7
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h a(Service service) {
            this.b = (Service) g16.b(service);
            return this;
        }

        private h(j jVar) {
            this.a = jVar;
        }
    }

    private static final class i extends vz4 {
        private final j a;
        private final i b;

        private AudioPlaybackEventTracker e() {
            return new AudioPlaybackEventTracker((ET2Scope) this.a.k0.get(), (NetworkStatus) this.a.F0.get());
        }

        private AudioSessionEventTracker f() {
            return new AudioSessionEventTracker((ET2Scope) this.a.k0.get(), (NetworkStatus) this.a.F0.get());
        }

        private AssetRetrieverJobIntentService g(AssetRetrieverJobIntentService assetRetrieverJobIntentService) {
            gt.a(assetRetrieverJobIntentService, (AssetDownloader) this.a.v2.get());
            return assetRetrieverJobIntentService;
        }

        private FcmIntentService h(FcmIntentService fcmIntentService) {
            com.nytimes.android.push.a.a(fcmIntentService, (MessagingHelper) this.a.o3.get());
            return fcmIntentService;
        }

        private MediaService i(MediaService mediaService) {
            com.nytimes.android.media.player.f.e(mediaService, (ax) this.a.I4.get());
            com.nytimes.android.media.player.f.d(mediaService, (bp0) this.a.Z0.get());
            com.nytimes.android.media.player.f.m(mediaService, (PodcastSource) this.a.B7.get());
            com.nytimes.android.media.player.f.l(mediaService, (vw5) this.a.C7.get());
            com.nytimes.android.media.player.f.i(mediaService, (NetworkStatus) this.a.F0.get());
            com.nytimes.android.media.player.f.a(mediaService, (AudioManager) this.a.G4.get());
            com.nytimes.android.media.player.f.o(mediaService, (b99) this.a.E7.get());
            com.nytimes.android.media.player.f.c(mediaService, f());
            com.nytimes.android.media.player.f.b(mediaService, e());
            com.nytimes.android.media.player.f.f(mediaService, (ci4) this.a.F7.get());
            com.nytimes.android.media.player.f.n(mediaService, (w89) this.a.J6.get());
            com.nytimes.android.media.player.f.g(mediaService, (qq3) this.a.Q3.get());
            com.nytimes.android.media.player.f.j(mediaService, (ov5) this.a.I7.get());
            com.nytimes.android.media.player.f.h(mediaService, (jh4) this.a.X6.get());
            com.nytimes.android.media.player.f.k(mediaService, this.a.x9());
            return mediaService;
        }

        private NotificationParsingJobService j(NotificationParsingJobService notificationParsingJobService) {
            t95.a(notificationParsingJobService, k());
            return notificationParsingJobService;
        }

        private q95 k() {
            return new q95(l(), n());
        }

        private SaveIntentParser l() {
            return new SaveIntentParser(en.a(this.a.a), (AssetRetriever) this.a.x2.get(), (SavedManager) this.a.C3.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), m(), new sd4());
        }

        private w87 m() {
            return new w87((ET2Scope) this.a.k0.get());
        }

        private zp7 n() {
            return new zp7(en.a(this.a.a), (uq7) this.a.y4.get());
        }

        @Override // defpackage.xa2
        public void a(FcmIntentService fcmIntentService) {
            h(fcmIntentService);
        }

        @Override // defpackage.s95
        public void b(NotificationParsingJobService notificationParsingJobService) {
            j(notificationParsingJobService);
        }

        @Override // defpackage.ft
        public void c(AssetRetrieverJobIntentService assetRetrieverJobIntentService) {
            g(assetRetrieverJobIntentService);
        }

        @Override // defpackage.co4
        public void d(MediaService mediaService) {
            i(mediaService);
        }

        private i(j jVar, Service service) {
            this.b = this;
            this.a = jVar;
        }
    }

    private static final class j extends wz4 {
        private p76 A;
        private p76 A0;
        private p76 A1;
        private p76 A2;
        private p76 A3;
        private p76 A4;
        private p76 A5;
        private p76 A6;
        private p76 A7;
        private p76 B;
        private p76 B0;
        private p76 B1;
        private p76 B2;
        private p76 B3;
        private p76 B4;
        private p76 B5;
        private p76 B6;
        private p76 B7;
        private p76 C;
        private p76 C0;
        private p76 C1;
        private p76 C2;
        private p76 C3;
        private p76 C4;
        private p76 C5;
        private p76 C6;
        private p76 C7;
        private p76 D;
        private p76 D0;
        private p76 D1;
        private p76 D2;
        private p76 D3;
        private p76 D4;
        private p76 D5;
        private p76 D6;
        private p76 D7;
        private p76 E;
        private p76 E0;
        private p76 E1;
        private p76 E2;
        private p76 E3;
        private p76 E4;
        private p76 E5;
        private p76 E6;
        private p76 E7;
        private p76 F;
        private p76 F0;
        private p76 F1;
        private p76 F2;
        private p76 F3;
        private p76 F4;
        private p76 F5;
        private p76 F6;
        private p76 F7;
        private p76 G;
        private p76 G0;
        private p76 G1;
        private p76 G2;
        private p76 G3;
        private p76 G4;
        private p76 G5;
        private p76 G6;
        private p76 G7;
        private p76 H;
        private p76 H0;
        private p76 H1;
        private p76 H2;
        private p76 H3;
        private p76 H4;
        private p76 H5;
        private p76 H6;
        private p76 H7;
        private p76 I;
        private p76 I0;
        private p76 I1;
        private p76 I2;
        private p76 I3;
        private p76 I4;
        private p76 I5;
        private p76 I6;
        private p76 I7;
        private p76 J;
        private p76 J0;
        private p76 J1;
        private p76 J2;
        private p76 J3;
        private p76 J4;
        private p76 J5;
        private p76 J6;
        private p76 K;
        private p76 K0;
        private p76 K1;
        private p76 K2;
        private p76 K3;
        private p76 K4;
        private p76 K5;
        private p76 K6;
        private p76 L;
        private p76 L0;
        private p76 L1;
        private p76 L2;
        private p76 L3;
        private p76 L4;
        private p76 L5;
        private p76 L6;
        private p76 M;
        private p76 M0;
        private p76 M1;
        private p76 M2;
        private p76 M3;
        private p76 M4;
        private p76 M5;
        private p76 M6;
        private p76 N;
        private p76 N0;
        private p76 N1;
        private p76 N2;
        private p76 N3;
        private p76 N4;
        private p76 N5;
        private p76 N6;
        private p76 O;
        private p76 O0;
        private p76 O1;
        private p76 O2;
        private p76 O3;
        private p76 O4;
        private p76 O5;
        private p76 O6;
        private p76 P;
        private p76 P0;
        private p76 P1;
        private p76 P2;
        private p76 P3;
        private p76 P4;
        private p76 P5;
        private p76 P6;
        private p76 Q;
        private p76 Q0;
        private p76 Q1;
        private p76 Q2;
        private p76 Q3;
        private p76 Q4;
        private p76 Q5;
        private p76 Q6;
        private p76 R;
        private p76 R0;
        private p76 R1;
        private p76 R2;
        private p76 R3;
        private p76 R4;
        private p76 R5;
        private p76 R6;
        private p76 S;
        private p76 S0;
        private p76 S1;
        private p76 S2;
        private p76 S3;
        private p76 S4;
        private p76 S5;
        private p76 S6;
        private p76 T;
        private p76 T0;
        private p76 T1;
        private p76 T2;
        private p76 T3;
        private p76 T4;
        private p76 T5;
        private p76 T6;
        private p76 U;
        private p76 U0;
        private p76 U1;
        private p76 U2;
        private p76 U3;
        private p76 U4;
        private p76 U5;
        private p76 U6;
        private p76 V;
        private p76 V0;
        private p76 V1;
        private p76 V2;
        private p76 V3;
        private p76 V4;
        private p76 V5;
        private p76 V6;
        private p76 W;
        private p76 W0;
        private p76 W1;
        private p76 W2;
        private p76 W3;
        private p76 W4;
        private p76 W5;
        private p76 W6;
        private p76 X;
        private p76 X0;
        private p76 X1;
        private p76 X2;
        private p76 X3;
        private p76 X4;
        private p76 X5;
        private p76 X6;
        private p76 Y;
        private p76 Y0;
        private p76 Y1;
        private p76 Y2;
        private p76 Y3;
        private p76 Y4;
        private p76 Y5;
        private p76 Y6;
        private p76 Z;
        private p76 Z0;
        private p76 Z1;
        private p76 Z2;
        private p76 Z3;
        private p76 Z4;
        private p76 Z5;
        private p76 Z6;
        private final dn a;
        private p76 a0;
        private p76 a1;
        private p76 a2;
        private p76 a3;
        private p76 a4;
        private p76 a5;
        private p76 a6;
        private p76 a7;
        private final cb1 b;
        private p76 b0;
        private p76 b1;
        private p76 b2;
        private p76 b3;
        private p76 b4;
        private p76 b5;
        private p76 b6;
        private p76 b7;
        private final g58 c;
        private p76 c0;
        private p76 c1;
        private p76 c2;
        private p76 c3;
        private p76 c4;
        private p76 c5;
        private p76 c6;
        private p76 c7;
        private final a78 d;
        private p76 d0;
        private p76 d1;
        private p76 d2;
        private p76 d3;
        private p76 d4;
        private p76 d5;
        private p76 d6;
        private p76 d7;
        private final FirebaseModule e;
        private p76 e0;
        private p76 e1;
        private p76 e2;
        private p76 e3;
        private p76 e4;
        private p76 e5;
        private p76 e6;
        private p76 e7;
        private final f58 f;
        private p76 f0;
        private p76 f1;
        private p76 f2;
        private p76 f3;
        private p76 f4;
        private p76 f5;
        private p76 f6;
        private p76 f7;
        private final v96 g;
        private p76 g0;
        private p76 g1;
        private p76 g2;
        private p76 g3;
        private p76 g4;
        private p76 g5;
        private p76 g6;
        private p76 g7;
        private final o05 h;
        private p76 h0;
        private p76 h1;
        private p76 h2;
        private p76 h3;
        private p76 h4;
        private p76 h5;
        private p76 h6;
        private p76 h7;
        private final lc3 i;
        private p76 i0;
        private p76 i1;
        private p76 i2;
        private p76 i3;
        private p76 i4;
        private p76 i5;
        private p76 i6;
        private p76 i7;
        private final s94 j;
        private p76 j0;
        private p76 j1;
        private p76 j2;
        private p76 j3;
        private p76 j4;
        private p76 j5;
        private p76 j6;
        private p76 j7;
        private final w7 k;
        private p76 k0;
        private p76 k1;
        private p76 k2;
        private p76 k3;
        private p76 k4;
        private p76 k5;
        private p76 k6;
        private p76 k7;
        private final v6 l;
        private p76 l0;
        private p76 l1;
        private p76 l2;
        private p76 l3;
        private p76 l4;
        private p76 l5;
        private p76 l6;
        private p76 l7;
        private final i9 m;
        private p76 m0;
        private p76 m1;
        private p76 m2;
        private p76 m3;
        private p76 m4;
        private p76 m5;
        private p76 m6;
        private p76 m7;
        private final j52 n;
        private p76 n0;
        private p76 n1;
        private p76 n2;
        private p76 n3;
        private p76 n4;
        private p76 n5;
        private p76 n6;
        private p76 n7;
        private final m05 o;
        private p76 o0;
        private p76 o1;
        private p76 o2;
        private p76 o3;
        private p76 o4;
        private p76 o5;
        private p76 o6;
        private p76 o7;
        private final jx1 p;
        private p76 p0;
        private p76 p1;
        private p76 p2;
        private p76 p3;
        private p76 p4;
        private p76 p5;
        private p76 p6;
        private p76 p7;
        private final m43 q;
        private p76 q0;
        private p76 q1;
        private p76 q2;
        private p76 q3;
        private p76 q4;
        private p76 q5;
        private p76 q6;
        private p76 q7;
        private final c17 r;
        private p76 r0;
        private p76 r1;
        private p76 r2;
        private p76 r3;
        private p76 r4;
        private p76 r5;
        private p76 r6;
        private p76 r7;
        private final y43 s;
        private p76 s0;
        private p76 s1;
        private p76 s2;
        private p76 s3;
        private p76 s4;
        private p76 s5;
        private p76 s6;
        private p76 s7;
        private final j t;
        private p76 t0;
        private p76 t1;
        private p76 t2;
        private p76 t3;
        private p76 t4;
        private p76 t5;
        private p76 t6;
        private p76 t7;
        private p76 u;
        private p76 u0;
        private p76 u1;
        private p76 u2;
        private p76 u3;
        private p76 u4;
        private p76 u5;
        private p76 u6;
        private p76 u7;
        private p76 v;
        private p76 v0;
        private p76 v1;
        private p76 v2;
        private p76 v3;
        private p76 v4;
        private p76 v5;
        private p76 v6;
        private p76 v7;
        private p76 w;
        private p76 w0;
        private p76 w1;
        private p76 w2;
        private p76 w3;
        private p76 w4;
        private p76 w5;
        private p76 w6;
        private p76 w7;
        private p76 x;
        private p76 x0;
        private p76 x1;
        private p76 x2;
        private p76 x3;
        private p76 x4;
        private p76 x5;
        private p76 x6;
        private p76 x7;
        private p76 y;
        private p76 y0;
        private p76 y1;
        private p76 y2;
        private p76 y3;
        private p76 y4;
        private p76 y5;
        private p76 y6;
        private p76 y7;
        private p76 z;
        private p76 z0;
        private p76 z1;
        private p76 z2;
        private p76 z3;
        private p76 z4;
        private p76 z5;
        private p76 z6;
        private p76 z7;

        private static final class a implements p76 {
            private final j a;
            private final int b;

            /* renamed from: t61$j$a$a, reason: collision with other inner class name */
            class C0539a implements ok9 {
                C0539a() {
                }

                @Override // defpackage.ok9
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FeedbackUploadJob a(Context context, WorkerParameters workerParameters) {
                    return new FeedbackUploadJob(context, workerParameters, (ZendeskSdk) a.this.a.o1.get(), a.this.a.Fa());
                }
            }

            class b implements ok9 {
                b() {
                }

                @Override // defpackage.ok9
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public HandleIncomingBNAWorker a(Context context, WorkerParameters workerParameters) {
                    return new HandleIncomingBNAWorker(context, workerParameters, (MessagingHelper) a.this.a.o3.get());
                }
            }

            class c implements ok9 {
                c() {
                }

                @Override // defpackage.ok9
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public LogRetryUploadWorker a(Context context, WorkerParameters workerParameters) {
                    return new LogRetryUploadWorker(context, workerParameters, a.this.a.Fa());
                }
            }

            class d implements ok9 {
                d() {
                }

                @Override // defpackage.ok9
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public UpdateWorker a(Context context, WorkerParameters workerParameters) {
                    return new UpdateWorker(context, workerParameters, a.this.a.qc(), a.this.a.rc());
                }
            }

            a(j jVar, int i) {
                this.a = jVar;
                this.b = i;
            }

            private Object b() {
                switch (this.b) {
                    case 0:
                        return new cb2(this.a.va(), (Resources) this.a.u.get(), (AppPreferences) this.a.v.get(), nt1.a(this.a.B), nt1.a(this.a.Y0), en.a(this.a.a));
                    case 1:
                        return f45.a(en.a(this.a.a));
                    case 2:
                        return new AppPreferences(en.a(this.a.a));
                    case 3:
                        return wv6.a((FirebaseConfigSource) this.a.z.get(), (d07) this.a.A.get());
                    case 4:
                        return new FirebaseConfigSource((com.google.firebase.remoteconfig.a) this.a.w.get(), (BehaviorSubject) this.a.x.get(), en.a(this.a.a), (pg8) this.a.y.get(), u01.a());
                    case 5:
                        return vv6.a(en.a(this.a.a));
                    case 6:
                        return xv6.a();
                    case 7:
                        return yv6.a();
                    case 8:
                        return new d07(en.a(this.a.a));
                    case 9:
                        return r0.a(en.a(this.a.a), nt1.a(this.a.H), (t) this.a.w0.get(), (u0) this.a.X0.get());
                    case 10:
                        return e45.a(this.a.fb());
                    case 11:
                        return i45.a(en.a(this.a.a));
                    case 12:
                        return ib1.a(this.a.b);
                    case 13:
                        return new kz1();
                    case 14:
                        return new ig8(nt1.a(this.a.e0));
                    case 15:
                        return p58.a(this.a.jc());
                    case 16:
                        return q58.a(this.a.kc());
                    case 17:
                        return r58.a(en.a(this.a.a), (r35) this.a.G.get(), (OkHttpClient) this.a.H.get(), (h98) this.a.J.get(), this.a.P8(), this.a.gc());
                    case 18:
                        return n58.a();
                    case 19:
                        return u58.a((SubauthSSO) this.a.I.get());
                    case 20:
                        return s58.a();
                    case 21:
                        return new g96(en.a(this.a.a), (cb2) this.a.D.get());
                    case 22:
                        return com.nytimes.android.dimodules.o.a((FeedStore) this.a.V.get());
                    case 23:
                        return new FeedStore((FeedFetcher) this.a.R.get(), (ve2) this.a.S.get(), (FeedParseFunc) this.a.U.get());
                    case 24:
                        return new FeedFetcher(en.a(this.a.a), (SharedPreferences) this.a.M.get(), nt1.a(this.a.Q));
                    case EventType.SUBS /* 25 */:
                        return z16.a(en.a(this.a.a));
                    case EventType.CDN /* 26 */:
                        return h45.a(en.a(this.a.a), this.a.Ub(), nt1.a(this.a.H), (CmsEnvironment) this.a.O.get(), (so1) this.a.P.get());
                    case 27:
                        return com.nytimes.android.dimodules.k.a();
                    case 28:
                        return b45.a((Resources) this.a.u.get(), (SharedPreferences) this.a.M.get());
                    case BuildConfig.VERSION_CODE /* 29 */:
                        return c45.a(ee0.a.b(), en.a(this.a.a), (SharedPreferences) this.a.M.get());
                    case 30:
                        return bp1.a(this.a.D9());
                    case 31:
                        return new FeedParseFunc(nt1.a(this.a.T));
                    case 32:
                        return oy3.a((Gson) this.a.N.get());
                    case 33:
                        return s01.a();
                    case 34:
                        return t58.a(this.a.lc());
                    case 35:
                        return v58.a(this.a.mc());
                    case 36:
                        return y58.a((Subauth) this.a.L.get(), en.a(this.a.a));
                    case 37:
                        return ww2.a((dd) this.a.M0.get());
                    case 38:
                        return new dd((jc) this.a.L0.get());
                    case 39:
                        return new jc(en.a(this.a.a), (wc) this.a.E0.get(), (NetworkStatus) this.a.F0.get(), (AppPreferences) this.a.v.get(), (String) this.a.G0.get(), (String) this.a.H0.get(), (String) this.a.I0.get(), (VoiceOverDetector) this.a.J0.get(), (BehaviorSubject) this.a.p0.get(), this.a.ab(), (b05) this.a.K0.get(), (z58) this.a.e0.get());
                    case 40:
                        return pp6.a(en.a(this.a.a), (hc) this.a.D0.get());
                    case 41:
                        return qi2.a(this.a.e, (FacebookChannelHandler) this.a.n0.get(), (FirebaseChannelHandler) this.a.q0.get(), (mn) this.a.v0.get(), (cb2) this.a.D.get(), (qh2) this.a.x0.get(), (FirebasePurrEventInterceptor) this.a.y0.get(), (pi2) this.a.z0.get(), (FirebaseInstanceIdEventInterceptor) this.a.A0.get(), (pn) this.a.C0.get());
                    case 42:
                        return lc.a((p86) this.a.m0.get(), t01.a());
                    case 43:
                        return s.a(nt1.a(this.a.l0));
                    case 44:
                        return new PurrManagerClientImpl((com.nytimes.android.subauth.core.purr.a) this.a.a0.get(), (s96) this.a.d0.get(), (PurrCookiePersister) this.a.f0.get(), (PurrDirectiveOverrider) this.a.g0.get(), this.a.Nb(), t01.a());
                    case 45:
                        return k58.a(this.a.f, (Subauth) this.a.L.get());
                    case 46:
                        return y96.a(this.a.g, this.a.ec(), (MutableSharedFlow) this.a.b0.get(), (MutableSharedFlow) this.a.c0.get());
                    case 47:
                        return w96.a(this.a.g);
                    case 48:
                        return x96.a(this.a.g);
                    case 49:
                        return new PurrCookiePersister((z58) this.a.e0.get(), (CoroutineScope) this.a.X.get());
                    case 50:
                        return j58.a(this.a.f, (Subauth) this.a.L.get());
                    case 51:
                        return new ET2SimpleScope((ET2SinglePageClient) this.a.j0.get());
                    case 52:
                        return new ET2SinglePageClient((AppLifecycleObserver) this.a.h0.get(), (q52) this.a.i0.get());
                    case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                        return new AppLifecycleObserver();
                    case 54:
                        return o52.a((z58) this.a.e0.get());
                    case 55:
                        return mc.a((a19) this.a.o0.get(), (p86) this.a.m0.get(), (BehaviorSubject) this.a.p0.get(), t01.a());
                    case 56:
                        return cp1.a(en.a(this.a.a));
                    case 57:
                        return xo1.a();
                    case 58:
                        return rn.a((AppsFlyerClient) this.a.u0.get(), t01.a());
                    case 59:
                        return new AppsFlyerClient(nt1.a(this.a.r0), (String) this.a.s0.get(), en.a(this.a.a), (cb2) this.a.D.get(), (AppsFlyerConversionListener) this.a.t0.get(), (p86) this.a.m0.get(), t01.a());
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        return si2.a(this.a.e);
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        return sn.a((Resources) this.a.u.get());
                    case 62:
                        return ri2.a(this.a.e, en.a(this.a.a));
                    case 63:
                        return new qh2((t) this.a.w0.get());
                    case 64:
                        return t0.a(this.a.va());
                    case 65:
                        return new FirebasePurrEventInterceptor((d96) this.a.l0.get(), t01.a());
                    case 66:
                        return new pi2(en.a(this.a.a), new bf());
                    case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                        return new FirebaseInstanceIdEventInterceptor(this.a.E9(), (CoroutineScope) this.a.X.get());
                    case 68:
                        return new pn((String) this.a.s0.get(), (String) this.a.B0.get(), (AppsFlyerClient) this.a.u0.get());
                    case 69:
                        return qn.Companion.c((AppsFlyerLib) this.a.r0.get(), en.a(this.a.a));
                    case 70:
                        return new NetworkStatus(en.a(this.a.a));
                    case 71:
                        return wo1.a(en.a(this.a.a));
                    case 72:
                        return vo1.a(en.a(this.a.a));
                    case ModuleDescriptor.MODULE_VERSION /* 73 */:
                        return uv6.a((Resources) this.a.u.get());
                    case 74:
                        return new VoiceOverDetector(en.a(this.a.a));
                    case 75:
                        return new b05();
                    case 76:
                        return zv7.a();
                    case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                        return com.nytimes.android.dimodules.n.a((FeedStore) this.a.V.get());
                    case 78:
                        return new com.nytimes.android.accountbenefits.b();
                    case 79:
                        return o58.a();
                    case 80:
                        return w58.a(this.a.mc());
                    case 81:
                        return x58.a(this.a.nc());
                    case 82:
                        return s0.a(en.a(this.a.a), (AppPreferences) this.a.v.get(), (String) this.a.H0.get(), (cb2) this.a.D.get(), nt1.a(this.a.e0));
                    case 83:
                        return new ComScoreWrapperImpl(en.a(this.a.a), (AppPreferences) this.a.v.get(), (d96) this.a.l0.get(), t01.a());
                    case 84:
                        return new xm(en.a(this.a.a), u25.a());
                    case 85:
                        return new NotificationChannelHelper((FeedStore) this.a.V.get(), d57.a(), this.a.cb(), (SharedPreferences) this.a.M.get());
                    case 86:
                        return new yx8((pk9) this.a.e1.get(), (h05) this.a.t2.get(), (SharedPreferences) this.a.M.get(), this.a.rc(), en.a(this.a.a));
                    case 87:
                        return new pk9(this.a.c1, this.a.d1, (NetworkStatus) this.a.F0.get());
                    case 88:
                        return Boolean.valueOf(x16.Companion.c(en.a(this.a.a), (AppPreferences) this.a.v.get()));
                    case 89:
                        return Boolean.valueOf(x16.Companion.b(en.a(this.a.a), (AppPreferences) this.a.v.get()));
                    case 90:
                        return new h05((fx3) this.a.f1.get(), (nj9) this.a.E3.get());
                    case 91:
                        return new fx3((AppPreferences) this.a.v.get());
                    case 92:
                        return new nj9((mj9) this.a.u1.get());
                    case 93:
                        return ws3.a(en.a(this.a.a), this.a.P9());
                    case 94:
                        return new C0539a();
                    case 95:
                        return new vm9(this.a.Q8(), en.a(this.a.a), (SharedPreferences) this.a.M.get());
                    case 96:
                        return new FeedbackAppDependenciesImpl(en.a(this.a.a), (com.nytimes.android.entitlements.a) this.a.j1.get(), (AbraManager) this.a.Y0.get(), (CrashlyticsConfig) this.a.k1.get(), (r82) this.a.m1.get(), (FeedStore) this.a.V.get(), (cb2) this.a.D.get());
                    case 97:
                        return v12.a((ex1) this.a.i1.get());
                    case 98:
                        return np0.a(en.a(this.a.a), (my3) this.a.W.get(), (ly3) this.a.Q0.get(), (PublishSubject) this.a.O0.get(), (cd) this.a.N0.get(), (NetworkStatus) this.a.F0.get(), (BehaviorSubject) this.a.p0.get(), (Subauth) this.a.L.get(), (z58) this.a.e0.get(), (Resources) this.a.u.get(), nt1.a(this.a.R0), (f98) this.a.h1.get(), u01.a(), (CoroutineScope) this.a.X.get());
                    case 99:
                        return new tp6(en.a(this.a.a), (yc2) this.a.g1.get());
                    default:
                        throw new AssertionError(this.b);
                }
            }

            private Object c() {
                switch (this.b) {
                    case 100:
                        return new com.nytimes.android.feedback.e(en.a(this.a.a));
                    case 101:
                        return by6.a((AppPreferences) this.a.v.get(), (BehaviorSubject) this.a.p0.get());
                    case 102:
                        return wi2.a(this.a.e, (f82) this.a.l1.get());
                    case 103:
                        return ui2.a(this.a.e, en.a(this.a.a), (Resources) this.a.u.get(), this.a.Y8());
                    case 104:
                        return new LogUploaderImpl(en.a(this.a.a), (v84) this.a.q1.get(), (ie2) this.a.p1.get(), (AmazonS3Client) this.a.t1.get(), r05.a(this.a.h), q05.a(this.a.h), (g17) this.a.w1.get());
                    case 105:
                        return vx6.a((ie2) this.a.p1.get());
                    case 106:
                        return ux6.a(en.a(this.a.a));
                    case 107:
                        return l05.a(en.a(this.a.a), (BasicAWSCredentials) this.a.s1.get());
                    case 108:
                        return k05.a((AWS3StorageKeys) this.a.r1.get());
                    case 109:
                        return p05.a(this.a.h);
                    case 110:
                        return xx6.a((t05) this.a.v1.get());
                    case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                        return new t05((mj9) this.a.u1.get());
                    case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                        return new b();
                    case ContentType.LIVE /* 113 */:
                        return new MessagingHelper(new sd4(), v25.a(), (BreakingNewsAlertManager) this.a.B1.get(), (DeepLinkManager) this.a.n3.get());
                    case 114:
                        return new BreakingNewsAlertManager(en.a(this.a.a), this.a.C9(), (Gson) this.a.N.get(), (SharedPreferences) this.a.M.get(), (f95) this.a.z1.get(), ta6.a(), this.a.s9(), this.a.La(), (PushClientManager) this.a.A1.get(), u01.a());
                    case 115:
                        return za6.a();
                    case 116:
                        return new PushClientManager(this.a.Ob(), (AppPreferences) this.a.v.get(), va6.a());
                    case 117:
                        return new DeepLinkManager(this.a.T8(), new md1(), (cd1) this.a.l3.get(), this.a.sc(), (kd1) this.a.m3.get(), (AppPreferences) this.a.v.get());
                    case 118:
                        return new cd1(this.a.Zb(), this.a.j9());
                    case 119:
                        return new vy3(en.a(this.a.a));
                    case 120:
                        return new ks(this.a.W8());
                    case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                        return new ga4(this.a.W8());
                    case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                        return new k21(this.a.W8());
                    case ContentType.USER_GENERATED_LIVE /* 123 */:
                        return new ua8(this.a.W8(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 124:
                        return new cv2(this.a.W8());
                    case 125:
                        return new xu2((cb2) this.a.D.get(), this.a.W8());
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                        return new m0((SharedPreferences) this.a.M.get(), (AbraManager) this.a.Y0.get());
                    case 127:
                        return new n9((SharedPreferences) this.a.M.get());
                    case 128:
                        return new pf8((if8) this.a.i3.get());
                    case 129:
                        return new if8(this.a.Ja(), (gf8) this.a.h3.get(), (SharedPreferences) this.a.M.get());
                    case 130:
                        return new DailyFiveMainTabFactory(nt1.a(this.a.z2), (cb2) this.a.D.get());
                    case 131:
                        return new m81((DailyFiveFeedStore) this.a.y2.get());
                    case 132:
                        return new DailyFiveFeedStore((MoshiFileSystemPersister) this.a.L1.get(), (com.nytimes.android.coroutinesutils.d) this.a.V1.get(), (w71) this.a.W1.get(), (com.nytimes.android.coroutinesutils.d) this.a.Y1.get(), (j91) this.a.Z1.get(), (AssetRetriever) this.a.x2.get());
                    case 133:
                        return g81.a((ve2) this.a.S.get());
                    case 134:
                        return e81.a((ApolloClient) this.a.T1.get(), (MoshiFileSystemPersister) this.a.L1.get(), (k81) this.a.U1.get());
                    case 135:
                        return zj.a((w13) this.a.O1.get(), nt1.a(this.a.H), (c05) this.a.P1.get(), (x13) this.a.Q1.get(), (Set) this.a.R1.get(), (Map) this.a.S1.get(), this.a.va());
                    case 136:
                        return bk.a((SharedPreferences) this.a.M.get(), (Resources) this.a.u.get(), (GraphQlEnvironment) this.a.M1.get(), (Single) this.a.N1.get());
                    case 137:
                        return ck.a((SharedPreferences) this.a.M.get(), (Resources) this.a.u.get());
                    case 138:
                        return uo1.a(en.a(this.a.a));
                    case 139:
                        return h58.a(this.a.f, (Subauth) this.a.L.get());
                    case 140:
                        return dk.a((SharedPreferences) this.a.M.get());
                    case 141:
                        return ek.a();
                    case 142:
                        return ak.a();
                    case 143:
                        return new k81();
                    case 144:
                        return new w71((ve2) this.a.S.get());
                    case 145:
                        return f81.a((ApolloClient) this.a.T1.get(), (w71) this.a.W1.get(), (u71) this.a.X1.get());
                    case 146:
                        return new u71();
                    case 147:
                        return d81.a((SharedPreferences) this.a.M.get(), (b05) this.a.K0.get());
                    case 148:
                        return new AssetRetriever(nt1.a(this.a.e2), nt1.a(this.a.v2), (h07) this.a.p2.get(), nt1.a(this.a.u2), u01.a(), (NYTUser) this.a.w2.get());
                    case 149:
                        return new com.nytimes.android.assetretriever.h((AssetRetrieverDatabase) this.a.a2.get(), (com.nytimes.android.assetretriever.a) this.a.b2.get(), (tt) this.a.c2.get(), (com.nytimes.android.assetretriever.i) this.a.d2.get());
                    case 150:
                        return lt.a(en.a(this.a.a));
                    case 151:
                        return jt.a((AssetRetrieverDatabase) this.a.a2.get());
                    case 152:
                        return mt.a((AssetRetrieverDatabase) this.a.a2.get());
                    case 153:
                        return kt.a((AssetRetrieverDatabase) this.a.a2.get());
                    case 154:
                        return new AssetDownloader((com.nytimes.android.coroutinesutils.d) this.a.s2.get(), (NetworkStatus) this.a.F0.get(), (com.nytimes.android.assetretriever.h) this.a.e2.get(), (pt) this.a.u2.get());
                    case 155:
                        return ot.a((l28) this.a.r2.get());
                    case 156:
                        return nt.a((GraphQlAssetFetcher) this.a.q2.get(), (com.nytimes.android.assetretriever.h) this.a.e2.get());
                    case 157:
                        return ph7.a((ApolloClient) this.a.T1.get(), this.a.c9(), (e23) this.a.f2.get(), (ls) this.a.i2.get(), (h07) this.a.p2.get());
                    case 158:
                        return new e23();
                    case 159:
                        return qh7.a((UrlExpander) this.a.h2.get());
                    case 160:
                        return j45.a((UrlExpanderApi) this.a.g2.get());
                    case 161:
                        return k45.a(this.a.Ub(), (Resources) this.a.u.get());
                    case 162:
                        return sz6.a(nt1.a(this.a.k2), (SharedPreferences) this.a.M.get(), (ResourceRepository) this.a.n2.get(), (Resources) this.a.u.get(), (kz6) this.a.o2.get(), this.a.Xa(), this.a.Ca());
                    case 163:
                        return qz6.a((OkHttpClient) this.a.j2.get());
                    case 164:
                        return rz6.a(en.a(this.a.a), (OkHttpClient) this.a.H.get());
                    case 165:
                        return new ResourceRepository((ResourceDatabase) this.a.l2.get(), this.a.Sb(), this.a.ic(), (FileSystemPersister) this.a.m2.get());
                    case 166:
                        return oz6.a(en.a(this.a.a));
                    case 167:
                        return mz6.a(en.a(this.a.a));
                    case 168:
                        return pz6.a(nt1.a(this.a.k2), nt1.a(this.a.j2));
                    case 169:
                        return new pt((com.nytimes.android.assetretriever.h) this.a.e2.get(), (h05) this.a.t2.get());
                    case 170:
                        return i58.a(this.a.f, (Subauth) this.a.L.get());
                    case 171:
                        return new DiscoveryTabFactory(nt1.a(this.a.B2), (cb2) this.a.D.get());
                    case 172:
                        return new SectionCarouselsRepository((SharedPreferences) this.a.M.get(), (b05) this.a.K0.get(), this.a.Xb(), this.a.D9());
                    case 173:
                        return new YouTabFactory((cb2) this.a.D.get(), this.a.tc(), (InterestsManager) this.a.G2.get(), (AppPreferences) this.a.v.get(), (z58) this.a.e0.get(), (CoroutineScope) this.a.X.get());
                    case 174:
                        return eb2.a(this.a.ua(), this.a.ra(), u01.a(), this.a.D9(), (b05) this.a.K0.get(), (SharedPreferences) this.a.M.get());
                    case 175:
                        return hb2.a((SharedPreferences) this.a.M.get(), (b05) this.a.K0.get());
                    case 176:
                        return db2.a((InterestsDatabase) this.a.E2.get());
                    case 177:
                        return gb2.a(en.a(this.a.a));
                    case 178:
                        return new HomeFragmentFactory(nt1.a(this.a.d3), this.a.z9(), (AppPreferences) this.a.v.get(), (cb2) this.a.D.get());
                    case 179:
                        return new HomeUseCase((HomeRepository) this.a.a3.get(), (HomeCacheManager) this.a.c3.get(), u01.a(), this.a.M9(), (com.nytimes.android.coroutinesutils.b) this.a.Z2.get(), this.a.R9());
                    case 180:
                        return new HomeRepository(this.a.Q9(), (h07) this.a.p2.get(), (b05) this.a.K0.get(), (AssetRetriever) this.a.x2.get(), u01.a(), (com.nytimes.android.coroutinesutils.b) this.a.Z2.get());
                    case 181:
                        return new oh5();
                    case 182:
                        return new lm((cr5) this.a.O2.get(), (AppEventFactory) this.a.X2.get(), (CoroutineScope) this.a.X.get());
                    case 183:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.h.a(this.a.hc(), (zo2) this.a.N2.get());
                    case 184:
                        return db1.a(this.a.b, (Logger) this.a.J2.get());
                    case 185:
                        return eb1.a(this.a.b, en.a(this.a.a), (cb2) this.a.D.get(), (so1) this.a.P.get(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 186:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.c.a();
                    case 187:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.d.a((ET2Scope) this.a.k0.get());
                    case 188:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.e.a();
                    case 189:
                        return new AppEventFactory(this.a.cc());
                    case 190:
                        return new ThermalMonitor((wk8) this.a.P2.get(), (SharedPreferences) this.a.M.get());
                    case 191:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.i.a(en.a(this.a.a));
                    case 192:
                        return new com.nytimes.android.performancetrackerclientphoenix.monitor.a(en.a(this.a.a), (SharedPreferences) this.a.M.get());
                    case 193:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.g.a(en.a(this.a.a), (cr5) this.a.O2.get(), (SharedPreferences) this.a.M.get());
                    case 194:
                        return new NetworkDataUsageMonitor((CoroutineScope) this.a.X.get());
                    case 195:
                        return new com.nytimes.android.performancetrackerclientphoenix.monitor.c((NetworkStatus) this.a.F0.get());
                    case 196:
                        return new DiskUsageMonitor((DiskUsageMonitor.a) this.a.V2.get(), (CoroutineScope) this.a.X.get());
                    case 197:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.a.a(en.a(this.a.a));
                    case 198:
                        return gb1.a(this.a.b, this.a.k9());
                    case ContentType.BUMPER /* 199 */:
                        return new HomeCacheManager((j91) this.a.b3.get(), (ve2) this.a.S.get(), u01.a(), (lm) this.a.Y2.get(), (com.nytimes.android.coroutinesutils.b) this.a.Z2.get());
                    default:
                        throw new AssertionError(this.b);
                }
            }

            private Object d() {
                switch (this.b) {
                    case 200:
                        return com.nytimes.android.features.home.b.a((SharedPreferences) this.a.M.get(), (b05) this.a.K0.get());
                    case 201:
                        return new PlayTabFactory(this.a.hb());
                    case 202:
                        return new RibbonTabFactory((cb2) this.a.D.get(), nt1.a(this.a.d3), (FeedStore) this.a.V.get(), nt1.a(this.a.p2));
                    case 203:
                        return rf8.a((SharedPreferences) this.a.M.get());
                    case 204:
                        return new tq5();
                    case 205:
                        return fd1.a();
                    case 206:
                        return new c();
                    case 207:
                        return new d();
                    case 208:
                        return new WorkerRunner((h05) this.a.t2.get(), ge0.a());
                    case 209:
                        return new SavedManager((com.nytimes.android.entitlements.a) this.a.j1.get(), (AssetSynchronizer) this.a.B3.get(), (LowLevelOperations) this.a.y3.get(), u01.a(), (CoroutineScope) this.a.X.get());
                    case 210:
                        return new AssetSynchronizer((LowLevelOperations) this.a.y3.get(), (q87) this.a.z3.get(), (SavedStrategyMigrationManager) this.a.A3.get());
                    case AdvertisementType.ON_DEMAND_PRE_ROLL /* 211 */:
                        return new LowLevelOperations((y87) this.a.s3.get(), (aq6) this.a.v3.get(), (SavedListFlyWeight) this.a.x3.get());
                    case AdvertisementType.ON_DEMAND_MID_ROLL /* 212 */:
                        return new AssetRetrieverSavedAssetRepository((AssetRetriever) this.a.x2.get(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case AdvertisementType.ON_DEMAND_POST_ROLL /* 213 */:
                        return new GraphQLReadingListRepository((SavedQueryFactory) this.a.u3.get());
                    case 214:
                        return new SavedQueryFactory((ApolloClient) this.a.T1.get(), (zp6) this.a.t3.get());
                    case 215:
                        return new zp6();
                    case 216:
                        return new SavedListFlyWeight((a97) this.a.w3.get(), u01.a());
                    case 217:
                        return new SavedListDiskPersister(this.a.C9(), u01.a(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 218:
                        return new q87();
                    case 219:
                        return new SavedStrategyMigrationManager((SharedPreferences) this.a.M.get(), u01.a());
                    case 220:
                        return n52.a();
                    case AdvertisementType.LIVE /* 221 */:
                        return ti2.a(this.a.e, (r82) this.a.m1.get());
                    case 222:
                        return fd3.a(this.a.i);
                    case 223:
                        return yv7.a();
                    case 224:
                        return new PurrLoginManager((d96) this.a.l0.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), t01.a());
                    case 225:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.b.a((cd) this.a.N0.get(), (cr5) this.a.O2.get(), (AppEventFactory) this.a.X2.get(), (CoroutineScope) this.a.X.get(), (so1) this.a.P.get());
                    case 226:
                        return com.nytimes.android.performancetrackerclientphoenix.dimodules.f.a(en.a(this.a.a), (cr5) this.a.O2.get(), this.a.va());
                    case 227:
                        return wx6.a((v84) this.a.q1.get());
                    case 228:
                        return new qz1(en.a(this.a.a));
                    case 229:
                        return qs6.a((AssetDatabase) this.a.P3.get(), this.a.Rb());
                    case 230:
                        return rs6.a(en.a(this.a.a));
                    case AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL /* 231 */:
                        return y16.a(en.a(this.a.a));
                    case AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL /* 232 */:
                        return new ya();
                    case AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL /* 233 */:
                        return xr3.a((cb2) this.a.D.get(), (AppPreferences) this.a.v.get(), (b05) this.a.K0.get(), en.a(this.a.a));
                    case AdvertisementType.BRANDED_AS_CONTENT /* 234 */:
                        return new rj8();
                    case AdvertisementType.BRANDED_DURING_LIVE /* 235 */:
                        return y94.a(this.a.j, en.a(this.a.a), (fw6) this.a.X3.get(), (NetworkManager) this.a.Z3.get(), (RemoteStreamSocket) this.a.Y3.get(), (l52) this.a.a4.get(), (i55) this.a.b4.get());
                    case 236:
                        return x94.a(this.a.j, (r94) this.a.W3.get());
                    case 237:
                        return u94.a(this.a.j, en.a(this.a.a), (String) this.a.V3.get());
                    case 238:
                        return aa4.a(this.a.j);
                    case 239:
                        return v94.a(this.a.j, (RemoteStreamSocket) this.a.Y3.get());
                    case 240:
                        return z94.a(this.a.j);
                    case 241:
                        return t94.a(this.a.j, en.a(this.a.a), (String) this.a.V3.get());
                    case 242:
                        return w94.a(this.a.j, en.a(this.a.a), (String) this.a.V3.get());
                    case 243:
                        return new PushMessageHandler((o82) this.a.d4.get(), (ua2) this.a.f4.get(), (PushClientManager) this.a.A1.get(), (h05) this.a.t2.get(), en.a(this.a.a), (CoroutineScope) this.a.X.get());
                    case 244:
                        return vi2.a(this.a.e, (f82) this.a.l1.get());
                    case 245:
                        return ua6.a(en.a(this.a.a), this.a.e4);
                    case 246:
                        return new va2();
                    case 247:
                        return xw2.a((s52) this.a.h4.get());
                    case 248:
                        return yw2.a();
                    case 249:
                        return i6.a((MutableSharedFlow) this.a.j4.get(), (MutableSharedFlow) this.a.k4.get());
                    case 250:
                        return g6.a();
                    case 251:
                        return h6.a();
                    case 252:
                        return new uk8(en.a(this.a.a));
                    case 253:
                        return new ItemToDetailNavigatorImpl((ld1) this.a.n4.get(), (nr3) this.a.o4.get(), this.a.xa(), this.a.sc(), (cb2) this.a.D.get());
                    case 254:
                        return new ld1((NetworkStatus) this.a.F0.get(), en.a(this.a.a));
                    case 255:
                        return new nr3();
                    case JceEncryptionConstants.SYMMETRIC_KEY_LENGTH /* 256 */:
                        return CommentsModule_ProvideGetCommentsApiFactory.provideGetCommentsApi((Retrofit) this.a.q4.get());
                    case 257:
                        return CommentsModule_ProvideRetrofitFactory.provideRetrofit(nt1.a(this.a.H), (c05) this.a.P1.get(), (Resources) this.a.u.get(), (AppPreferences) this.a.v.get());
                    case 258:
                        return new ShareAnalyticsReporter((ET2Scope) this.a.k0.get());
                    case 259:
                        return ap1.a(en.a(this.a.a), (PublishSubject) this.a.t4.get(), (TimeStampUtil) this.a.w4.get());
                    case 260:
                        return zo1.a();
                    case 261:
                        return new TimeStampUtil(en.a(this.a.a), this.a.u4, this.a.v4);
                    case 262:
                        return vb1.a();
                    case 263:
                        return wb1.a();
                    case 264:
                        return new uq7();
                    case 265:
                        return new f15();
                    case 266:
                        return new r57((eh7) this.a.E4.get(), (FeedStore) this.a.V.get());
                    case 267:
                        return eg7.a((GraphQlSectionFrontFetcher) this.a.A4.get(), (SectionFrontPersister) this.a.D4.get());
                    case 268:
                        return bg7.a((ApolloClient) this.a.T1.get(), this.a.c9(), (AssetRetriever) this.a.x2.get(), (e23) this.a.f2.get(), (b05) this.a.K0.get());
                    case 269:
                        return new SectionFrontPersister((ve2) this.a.S.get(), (JsonAdapter) this.a.C4.get(), u01.a());
                    case 270:
                        return dg7.a((com.squareup.moshi.i) this.a.B4.get());
                    case 271:
                        return cg7.a(this.a.va());
                    case 272:
                        return new AudioManager();
                    case 273:
                        return new com.nytimes.android.media.common.a();
                    case 274:
                        return new bx((wc) this.a.E0.get(), (jc) this.a.L0.get(), (NetworkStatus) this.a.F0.get(), (b05) this.a.K0.get(), (String) this.a.H0.get(), (String) this.a.G0.get(), (String) this.a.I0.get());
                    case 275:
                        return new if9((xd9) this.a.K4.get());
                    case 276:
                        return uz6.a((h07) this.a.p2.get(), (PreCachedFontLoader) this.a.J4.get());
                    case 277:
                        return new PreCachedFontLoader(this.a.Tb());
                    case 278:
                        return new cn8((AppEventFactory) this.a.X2.get());
                    case 279:
                        return new HybridConfigBuilder((com.nytimes.android.entitlements.a) this.a.j1.get(), en.a(this.a.a), (NetworkStatus) this.a.F0.get(), (HybridUserInfoBuilder) this.a.O4.get(), (jd3) this.a.P4.get(), this.a.S9(), (AbraManager) this.a.Y0.get(), this.a.ab());
                    case 280:
                        return new HybridUserInfoBuilder((ab6) this.a.N4.get(), (z58) this.a.e0.get());
                    case 281:
                        return new bb6((r82) this.a.m1.get());
                    case 282:
                        return new jd3((d96) this.a.l0.get());
                    case 283:
                        return x6.a(this.a.l, fn.a(this.a.a), (z58) this.a.e0.get(), (d96) this.a.l0.get(), this.a.N8(), (AbraManager) this.a.Y0.get());
                    case 284:
                        return ub3.a(en.a(this.a.a));
                    case 285:
                        return new zx2((tm) this.a.U4.get());
                    case 286:
                        return new tm((AppPreferences) this.a.v.get(), (Resources) this.a.u.get(), (g00) this.a.T4.get());
                    case 287:
                        return new g00((AppPreferences) this.a.v.get(), (NetworkStatus) this.a.F0.get(), (Resources) this.a.u.get());
                    case 288:
                        return new jp6((RecentlyViewedManager) this.a.R3.get());
                    case 289:
                        return new ET2ScopeCommand((ET2Scope) this.a.k0.get(), (AbraManager) this.a.Y0.get(), (DestinationTabState) this.a.X4.get());
                    case 290:
                        return new DestinationTabState((ET2Scope) this.a.k0.get());
                    case 291:
                        return mb3.a((bc) this.a.Z4.get());
                    case 292:
                        return vb.a(this.a.R8(), (com.nytimes.android.ads.a) this.a.Q4.get(), this.a.S8(), (MutableSharedFlow) this.a.k4.get());
                    case 293:
                        return new ld3((Resources) this.a.u.get(), (HybridScriptInflater) this.a.b5.get());
                    case 294:
                        return wb3.a();
                    case 295:
                        return m58.a(this.a.f, (r98) this.a.Z.get());
                    case 296:
                        return new zc((jc) this.a.L0.get());
                    case 297:
                        return new ln1();
                    case 298:
                        return new vb2((cr5) this.a.O2.get(), (AppEventFactory) this.a.X2.get(), (CoroutineScope) this.a.X.get());
                    case 299:
                        return fk0.a((AbraManager) this.a.Y0.get(), (cb2) this.a.D.get(), en.a(this.a.a), (CoroutineScope) this.a.X.get());
                    default:
                        throw new AssertionError(this.b);
                }
            }

            private Object e() {
                switch (this.b) {
                    case ContentFeedType.OTHER /* 300 */:
                        return r.a((NetworkStatus) this.a.F0.get(), (z58) this.a.e0.get(), (AbraManager) this.a.Y0.get());
                    case 301:
                        return new up4();
                    case ContentFeedType.WEST_HD /* 302 */:
                        return vq.a((ApolloClient) this.a.T1.get(), new f54());
                    case ContentFeedType.EAST_SD /* 303 */:
                        return wq.a(this.a.Ub(), (Resources) this.a.u.get());
                    case ContentFeedType.WEST_SD /* 304 */:
                        return new d27(en.a(this.a.a), (SharedPreferences) this.a.M.get(), this.a.va());
                    case 305:
                        return p70.a(this.a.a9(), (BestSellersFetcher) this.a.n5.get());
                    case 306:
                        return new BestSellersFetcher((ApolloClient) this.a.T1.get());
                    case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
                        return new rd4(en.a(this.a.a));
                    case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                        return sy5.a((dz5) this.a.u5.get(), this.a.l9(), (jy5) this.a.w5.get());
                    case 309:
                        return ty5.a(this.a.kb());
                    case 310:
                        return qy5.a((com.squareup.moshi.i) this.a.B4.get());
                    case 311:
                        return py5.a((qv6) this.a.B.get(), (JsonAdapter) this.a.r5.get(), (rp0) this.a.s5.get());
                    case 312:
                        return uy5.a((com.squareup.moshi.i) this.a.B4.get());
                    case 313:
                        return ny5.a(en.a(this.a.a), (cb2) this.a.D.get(), (SharedPreferences) this.a.M.get());
                    case 314:
                        return ry5.a((ET2Scope) this.a.k0.get(), (dz5) this.a.u5.get(), (String) this.a.v5.get());
                    case 315:
                        return vy5.a(en.a(this.a.a));
                    case 316:
                        return new DevSettingsSearchManager(this.a.ac());
                    case 317:
                        return com.nytimes.android.libs.messagingarchitecture.di.e.a((xr4) this.a.G5.get(), (MessageQueueUpdater) this.a.K5.get(), this.a.Pa());
                    case 318:
                        return new DeferringMessageQueue(this.a.Qa());
                    case 319:
                        return com.nytimes.android.libs.messagingarchitecture.di.k.a((cr4) this.a.z5.get(), (b34) this.a.A5.get(), (cb2) this.a.D.get(), (gr4) this.a.B5.get(), (b4) this.a.C5.get(), (AbraManager) this.a.Y0.get(), this.a.Ra());
                    case 320:
                        return com.nytimes.android.libs.messagingarchitecture.di.b.a((MessagingArchitectureDatabase) this.a.y5.get());
                    case 321:
                        return com.nytimes.android.libs.messagingarchitecture.di.d.a(en.a(this.a.a));
                    case 322:
                        return com.nytimes.android.libs.messagingarchitecture.di.a.a((MessagingArchitectureDatabase) this.a.y5.get());
                    case 323:
                        return com.nytimes.android.libs.messagingarchitecture.di.f.a((MessagingArchitectureDatabase) this.a.y5.get());
                    case 324:
                        return com.nytimes.android.libs.messagingarchitecture.di.c.a((MessagingArchitectureDatabase) this.a.y5.get());
                    case 325:
                        return com.nytimes.android.libs.messagingarchitecture.di.j.a((cb2) this.a.D.get(), (qg0) this.a.E5.get(), (gr4) this.a.B5.get(), (cr4) this.a.z5.get());
                    case 326:
                        return com.nytimes.android.libs.messagingarchitecture.di.i.a((MessagingArchitectureDatabase) this.a.y5.get());
                    case 327:
                        return new MessageQueueUpdater((FeedStore) this.a.V.get(), (er4) this.a.I5.get(), this.a.Da(), (qg0) this.a.E5.get(), this.a.Na(), this.a.Ma(), (xr4) this.a.G5.get(), (cb2) this.a.D.get(), this.a.Pa());
                    case 328:
                        return com.nytimes.android.libs.messagingarchitecture.di.h.a(this.a.N9());
                    case 329:
                        return com.nytimes.android.libs.messagingarchitecture.di.l.a();
                    case 330:
                        return com.nytimes.android.libs.messagingarchitecture.di.g.a(this.a.Ub());
                    case 331:
                        return com.nytimes.android.features.games.gameshub.playtab.a.a((fv5) this.a.M5.get(), this.a.hb());
                    case 332:
                        return new fv5(en.a(this.a.a));
                    case 333:
                        return kx1.a(this.a.p);
                    case 334:
                        return new MessageStateFactory((xr4) this.a.G5.get(), new MessageActionHandler(), (cb2) this.a.D.get(), this.a.O9());
                    case 335:
                        return new fm9((cr5) this.a.O2.get(), (AppEventFactory) this.a.X2.get(), (CoroutineScope) this.a.X.get());
                    case 336:
                        return b7.a(this.a.l);
                    case 337:
                        return m53.a((z58) this.a.e0.get());
                    case 338:
                        return o53.a((z58) this.a.e0.get());
                    case 339:
                        return l53.a((ET2SimpleScope) this.a.k0.get());
                    case 340:
                        return o43.a(this.a.q, this.a.bc());
                    case 341:
                        return new com.nytimes.android.onboarding.compose.b((AppPreferences) this.a.v.get(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 342:
                        return rc3.a(this.a.i);
                    case 343:
                        return pc3.a(this.a.i);
                    case 344:
                        return new h55(en.a(this.a.a));
                    case 345:
                        return new DailyFiveAnalytics((ET2Scope) this.a.k0.get());
                    case 346:
                        return new k56(qg3.a());
                    case 347:
                        return new ge4((ET2Scope) this.a.k0.get());
                    case 348:
                        return this.a.la(bg3.a());
                    case 349:
                        return new VideoUtil(en.a(this.a.a));
                    case 350:
                        return new VideoAssetToVideoItemFunc((VideoUtil) this.a.f6.get(), (xo4) this.a.u6.get());
                    case 351:
                        return a7.a((MediaVideoAdManagerImpl) this.a.t6.get());
                    case 352:
                        return new MediaVideoAdManagerImpl((com.nytimes.android.ad.a) this.a.h6.get(), (VideoCustomAdParamProvider) this.a.s6.get(), (FeedStore) this.a.V.get());
                    case 353:
                        return new com.nytimes.android.ad.a(en.a(this.a.a), (AppPreferences) this.a.v.get(), (at5) this.a.g6.get());
                    case 354:
                        return new at5(en.a(this.a.a));
                    case 355:
                        j jVar = this.a;
                        return jVar.qa(h79.a((g89) jVar.i6.get(), (l79) this.a.j6.get(), (c69) this.a.k6.get(), (c50) this.a.q6.get(), (i89) this.a.r6.get(), (d96) this.a.l0.get(), t01.a()));
                    case 356:
                        return new g89();
                    case 357:
                        return new l79();
                    case 358:
                        return new c69((g00) this.a.T4.get());
                    case 359:
                        return new c50(en.a(this.a.a), (g76) this.a.l6.get(), (vu5) this.a.m6.get(), (t20) this.a.n6.get(), (fb8) this.a.o6.get(), (a80) this.a.p6.get());
                    case 360:
                        return new g76(en.a(this.a.a));
                    case 361:
                        return new vu5(en.a(this.a.a));
                    case 362:
                        return new t20((g00) this.a.T4.get());
                    case 363:
                        return new fb8((com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 364:
                        return new a80(en.a(this.a.a), (AppPreferences) this.a.v.get());
                    case 365:
                        return new i89();
                    case 366:
                        return new x89((t79) this.a.x6.get(), (VideoET2Reporter) this.a.I6.get());
                    case 367:
                        return new t79((wc) this.a.E0.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (jc) this.a.L0.get(), (NetworkStatus) this.a.F0.get(), nt1.a(this.a.S3), (tm) this.a.U4.get(), (String) this.a.H0.get(), (String) this.a.G0.get(), (String) this.a.I0.get(), (CaptionPrefManager) this.a.w6.get(), (b05) this.a.K0.get());
                    case 368:
                        return new CaptionPrefManager(en.a(this.a.a), (AppPreferences) this.a.v.get());
                    case 369:
                        return new VideoET2Reporter((ET2Scope) this.a.k0.get(), (CaptionPrefManager) this.a.w6.get(), (com.nytimes.android.media.player.p) this.a.H6.get(), (com.nytimes.android.media.player.m) this.a.G6.get());
                    case 370:
                        return uk4.a(this.a.x9());
                    case 371:
                        return new VideoAdEvents();
                    case 372:
                        return new iq8();
                    case 373:
                        return com.nytimes.android.media.player.n.a((m59) this.a.D6.get(), (y91) this.a.F6.get());
                    case 374:
                        return y6.a((c61) this.a.C6.get());
                    case 375:
                        return new c61(en.a(this.a.a), (com.nytimes.android.ad.c) this.a.A6.get(), (com.nytimes.android.ad.b) this.a.B6.get());
                    case 376:
                        return c7.a((at5) this.a.g6.get());
                    case 377:
                        return z6.a((at5) this.a.g6.get());
                    case 378:
                        return new y91(en.a(this.a.a), (Cache) this.a.E6.get(), nt1.a(this.a.H), (so1) this.a.P.get());
                    case 379:
                        return wk4.a(en.a(this.a.a));
                    case 380:
                        return new nt8((qv6) this.a.B.get());
                    case 381:
                        return new AudioFileVerifier(new d62());
                    case 382:
                        j jVar2 = this.a;
                        return jVar2.oa(t57.a(en.a(jVar2.a), new bt5(), (u57) this.a.P6.get(), (b24) this.a.Q6.get()));
                    case 383:
                        return new u57(en.a(this.a.a), (jl9) this.a.O6.get(), (cb2) this.a.D.get());
                    case 384:
                        return new jl9(en.a(this.a.a), (l57) this.a.M6.get(), (hl9) this.a.N6.get());
                    case 385:
                        return new l57(en.a(this.a.a));
                    case 386:
                        return new hl9(en.a(this.a.a), (l57) this.a.M6.get());
                    case 387:
                        return new b24(en.a(this.a.a), (jl9) this.a.O6.get(), (cb2) this.a.D.get());
                    case 388:
                        return new yi7();
                    case 389:
                        return uc3.a(this.a.i, (OkHttpClient) this.a.H.get(), this.a.ca(), en.a(this.a.a), this.a.W9());
                    case 390:
                        return new jq((jc) this.a.L0.get());
                    case 391:
                        return new DockPresenter((com.nytimes.android.entitlements.a) this.a.j1.get(), (qv6) this.a.B.get(), (DeepLinkManager) this.a.n3.get(), w25.a(), (ET2Scope) this.a.k0.get());
                    case 392:
                        return new io4((uq7) this.a.y4.get());
                    case 393:
                        return new kh4();
                    case 394:
                        return new mz(kb2.a(), (Resources) this.a.u.get());
                    case 395:
                        return new DestinationEventTracker((ET2SimpleScope) this.a.k0.get(), t01.a());
                    case 396:
                        return new RibbonTabConfigRepository((FeedStore) this.a.V.get(), kb2.a(), (Resources) this.a.u.get());
                    case 397:
                        return CommentsModule_ProvideGetCurrentUserAPIFactory.provideGetCurrentUserAPI((Retrofit) this.a.q4.get(), (Resources) this.a.u.get(), (AppPreferences) this.a.v.get());
                    case 398:
                        return new DestinationAssetRepository((eh7) this.a.E4.get(), this.a.Ya(), this.a.d9(), (z24) this.a.c7.get(), (CookingCollectionRepository) this.a.d7.get(), this.a.gb(), this.a.F9(), this.a.D9(), (b05) this.a.K0.get(), (SharedPreferences) this.a.M.get(), this.a.k9());
                    case 399:
                        return new z24((GraphQlSectionFrontFetcher) this.a.A4.get());
                    default:
                        throw new AssertionError(this.b);
                }
            }

            private Object f() {
                switch (this.b) {
                    case WindowState.NORMAL /* 400 */:
                        return new CookingCollectionRepository((GraphQlSectionFrontFetcher) this.a.A4.get());
                    case WindowState.FULL_SCREEN /* 401 */:
                        return lv2.a(en.a(this.a.a), (cb2) this.a.D.get(), this.a.G9(), this.a.I9());
                    case WindowState.MINIMIZED /* 402 */:
                        return kv2.a(en.a(this.a.a), (cb2) this.a.D.get(), nv2.a(), (qv6) this.a.B.get());
                    case 403:
                        return mv2.a(this.a.Wa(), (Resources) this.a.u.get());
                    case Constants.NO_SUCH_BUCKET_STATUS_CODE /* 404 */:
                        return new bn8();
                    case 405:
                        return new DiscoverySectionsUseCase((FeedStore) this.a.V.get(), u01.a(), this.a.Yb(), (SectionCarouselsRepository) this.a.B2.get(), (RecentlyViewedManager) this.a.R3.get(), new te7(), (SectionFrontPersister) this.a.D4.get(), (cb2) this.a.D.get());
                    case 406:
                        return new mn1(this.a.va(), (GraphQlEnvironment) this.a.M1.get());
                    case 407:
                        return dd2.a(en.a(this.a.a), this.a.o());
                    case 408:
                        return gv2.a((SharedPreferences) this.a.M.get(), (b05) this.a.K0.get());
                    case 409:
                        return fv2.a((ve2) this.a.S.get(), (com.squareup.moshi.i) this.a.B4.get());
                    case 410:
                        return new wz2((TimeStampUtil) this.a.w4.get());
                    case 411:
                        return r43.a(this.a.q, (t43) this.a.T5.get());
                    case Constants.FAILED_PRECONDITION_STATUS_CODE /* 412 */:
                        return n53.a((qv6) this.a.B.get());
                    case 413:
                        return s43.a(this.a.q);
                    case 414:
                        return q43.a(this.a.q, (ConnectivityManager) this.a.s7.get());
                    case 415:
                        return n43.a(this.a.q, en.a(this.a.a));
                    case 416:
                        return new SectionsRepository((FeedStore) this.a.V.get(), kb2.a(), (Resources) this.a.u.get());
                    case 417:
                        return ca1.a(en.a(this.a.a));
                    case 418:
                        return CommentsModule_ProvideDraftCommentDatabaseFactory.provideDraftCommentDatabase(en.a(this.a.a));
                    case 419:
                        return CommentsModule_ProvideWriteNewCommentApiFactory.provideWriteNewCommentApi((Retrofit) this.a.q4.get());
                    case 420:
                        return fb2.a(this.a.ua(), (AppPreferences) this.a.v.get());
                    case StatusLine.HTTP_MISDIRECTED_REQUEST /* 421 */:
                        return new PodcastSourceImpl((PodcastStore) this.a.A7.get());
                    case 422:
                        return ix5.a(this.a.ib(), (ve2) this.a.S.get());
                    case 423:
                        return vk4.a(en.a(this.a.a));
                    case 424:
                        return new PodcastSearchResolver((PodcastSourceImpl) this.a.B7.get(), (DateTimeFormatter) this.a.z7.get(), (b05) this.a.K0.get());
                    case 425:
                        return b89.a((c99) this.a.D7.get());
                    case 426:
                        return new c99((w89) this.a.J6.get());
                    case 427:
                        return new ci4((RecentlyViewedManager) this.a.R3.get());
                    case 428:
                        return zk4.a((cl4) this.a.H7.get());
                    case 429:
                        return yk4.a((MediaDatabase) this.a.G7.get());
                    case 430:
                        return xk4.a(en.a(this.a.a));
                    default:
                        throw new AssertionError(this.b);
                }
            }

            @Override // defpackage.p76
            public Object get() {
                int i = this.b / 100;
                if (i == 0) {
                    return b();
                }
                if (i == 1) {
                    return c();
                }
                if (i == 2) {
                    return d();
                }
                if (i == 3) {
                    return e();
                }
                if (i == 4) {
                    return f();
                }
                throw new AssertionError(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public wc2 A9() {
            return ad2.a((so1) this.P.get(), (AppPreferences) this.v.get(), (qv6) this.B.get(), (tc2) this.n1.get(), (ed2) this.l7.get(), o(), (b05) this.K0.get());
        }

        private ey3 Aa() {
            return com.nytimes.android.dimodules.m.a(W8(), (com.nytimes.android.entitlements.a) this.j1.get(), (Resources) this.u.get());
        }

        private de4 Ab() {
            return nb2.a((DiscoveryTabFactory) this.C2.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FeedbackProvider B9() {
            return cd2.a((h05) this.t2.get(), (ZendeskSdk) this.o1.get(), A9(), (ed2) this.l7.get(), (qv6) this.B.get());
        }

        private LegacyFileUtils Ba() {
            return new LegacyFileUtils((SharedPreferences) this.M.get(), en.a(this.a), D9());
        }

        private de4 Bb() {
            return pb2.a((YouTabFactory) this.H2.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ge2 C9() {
            return new ge2(D9());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LegacyResourceStoreMigration Ca() {
            return new LegacyResourceStoreMigration((SharedPreferences) this.M.get(), (ve2) this.S.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaywallConfigRepository Cb() {
            return z43.a(this.s, en.a(this.a), (p53) this.q7.get(), (com.squareup.moshi.i) this.r7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File D9() {
            return yo1.a(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LocalOMAMessageFetcher Da() {
            return new LocalOMAMessageFetcher((OMAApiService) this.J5.get(), new e74());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PostAuthConfigRepository Db() {
            return a53.a(this.s, en.a(this.a), (p53) this.q7.get(), (r53) this.U5.get(), (com.squareup.moshi.i) this.r7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Flow E9() {
            FirebaseModule firebaseModule = this.e;
            return yi2.a(firebaseModule, xi2.a(firebaseModule));
        }

        private y74 Ea() {
            return com.nytimes.android.dimodules.p.a((cb2) this.D.get(), (Resources) this.u.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PostAuthConfigRepository Eb() {
            return b53.a(this.s, en.a(this.a), (p53) this.q7.get(), (r53) this.U5.get(), (com.squareup.moshi.i) this.r7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GamesAssetFetcher F9() {
            return new GamesAssetFetcher((ApolloClient) this.T1.get(), c9(), H9());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public d94 Fa() {
            return s05.a(this.h, (LogUploaderImpl) this.x1.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PostAuthConfigRepository Fb() {
            return c53.a(this.s, en.a(this.a), (p53) this.q7.get(), (r53) this.U5.get(), (com.squareup.moshi.i) this.r7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GamesConfigurationProvider G9() {
            return new GamesConfigurationProvider((z58) this.e0.get(), (ju0) this.f7.get());
        }

        private Retrofit Ga() {
            return wb.a(zb.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PostAuthConfigRepository Gb() {
            return d53.a(this.s, en.a(this.a), (p53) this.q7.get(), (r53) this.U5.get(), (com.squareup.moshi.i) this.r7.get());
        }

        private hv2 H9() {
            return new hv2((e23) this.f2.get());
        }

        private SharedPreferences Ha() {
            return ac.a(fn.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public gy3 Hb() {
            return e53.a(this.s, en.a(this.a), (r53) this.U5.get(), (p53) this.q7.get(), (com.squareup.moshi.i) this.r7.get());
        }

        private AbraKVPs I8() {
            return new AbraKVPs((AbraManager) this.Y0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GamesProgressProvider I9() {
            return new GamesProgressProvider(J9());
        }

        private Map Ia() {
            return ImmutableMap.q(0, do1.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public gy3 Ib() {
            return f53.a(this.s, en.a(this.a), (r53) this.U5.get(), (p53) this.q7.get(), (com.squareup.moshi.i) this.r7.get());
        }

        private AbraLoginObserver J8() {
            return new AbraLoginObserver((z58) this.e0.get(), (AbraManager) this.Y0.get());
        }

        private GamesProgressRepository J9() {
            return new GamesProgressRepository((GamesProgressApi) this.g7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map Ja() {
            return ImmutableMap.c(6).f("dailyfive", tb()).f("discovery", Ab()).f("you", Bb()).f("topStories", (de4) this.e3.get()).f("play", (de4) this.f3.get()).f("ribbon", (de4) this.g3.get()).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public gy3 Jb() {
            return g53.a(this.s, en.a(this.a), (p53) this.q7.get(), (r53) this.U5.get(), (com.squareup.moshi.i) this.r7.get());
        }

        private com.nytimes.abtests.a K8() {
            return new com.nytimes.abtests.a((AbraManager) this.Y0.get(), (ET2Scope) this.k0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public sw2 K9() {
            return xq.a(Sa(), (RecentlyViewedManager) this.R3.get(), (jc) this.L0.get(), (com.nytimes.android.entitlements.a) this.j1.get(), (uy3) this.C1.get(), d57.a(), e57.a(), (NetworkStatus) this.F0.get(), (PostLoginRegiOfferManager) this.i5.get());
        }

        private Map Ka() {
            return ImmutableMap.s("com.nytimes.android.feedback.workmanager.FeedbackUploadJob", this.y1, "com.nytimes.android.jobs.HandleIncomingBNAWorker", this.p3, "com.nytimes.android.logging.remote.worker.LogRetryUploadWorker", this.q3, "com.nytimes.android.jobs.UpdateWorker", this.D3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public gy3 Kb() {
            return h53.a(this.s, en.a(this.a), (p53) this.q7.get(), (r53) this.U5.get(), (com.squareup.moshi.i) this.r7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AdConfig.Builder L8() {
            return x7.a(this.k, fn.a(this.a), (com.nytimes.android.ads.a) this.Q4.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GetCommentsSummaryDataSource L9() {
            return new GetCommentsSummaryDataSource((CommentsApi) this.r4.get(), u01.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ai4 La() {
            return new ai4(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RegibundleConfigRepository Lb() {
            return i53.a(this.s, en.a(this.a), (p53) this.q7.get(), (r53) this.U5.get(), (com.squareup.moshi.i) this.r7.get());
        }

        private AdEventTracker M8() {
            return new AdEventTracker((ET2Scope) this.k0.get(), O8(), (e6) this.l4.get(), t01.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GraphQLIdRetriever M9() {
            return new GraphQLIdRetriever((FeedStore) this.V.get(), (SharedPreferences) this.M.get(), (Resources) this.u.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MessageHistoryMigrator Ma() {
            return new MessageHistoryMigrator(en.a(this.a), Na(), (gr4) this.B5.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaywallConfigRepository Mb() {
            return j53.a(this.s, en.a(this.a), (p53) this.q7.get(), (com.squareup.moshi.i) this.r7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public g7 N8() {
            return b6.a(fn.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GraphQlMessageFetcher N9() {
            return new GraphQlMessageFetcher((ApolloClient) this.T1.get(), Oa(), (u0) this.X0.get(), i9(), va(), en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MessageHistoryUpdater Na() {
            return new MessageHistoryUpdater((ApolloClient) this.T1.get(), (z58) this.e0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public q86 Nb() {
            return new q86((ET2SimpleScope) this.k0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i7 O8() {
            return new i7((cr5) this.O2.get(), (AppEventFactory) this.X2.get(), (CoroutineScope) this.X.get(), (z58) this.e0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HardcodedMessageProvider O9() {
            return new HardcodedMessageProvider((cb2) this.D.get(), (AppPreferences) this.v.get(), (InterestsManager) this.G2.get());
        }

        private qr4 Oa() {
            return new qr4((yc8) this.H5.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PushMessagingFactory Ob() {
            return new PushMessagingFactory(en.a(this.a), (r82) this.m1.get(), Ua(), (String) this.H0.get(), (FeedStore) this.V.get(), (AppPreferences) this.v.get(), u9());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean P8() {
            return SubauthBridgeModule.a.a((f96) this.K.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public j83 P9() {
            return vk9.a(Ka());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MessagePreferencesStore Pa() {
            return new MessagePreferencesStore(en.a(this.a), new fs4());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public fp6 Pb() {
            return w12.a((z58) this.e0.get(), w25.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean Q8() {
            return zc2.a.b((tc2) this.n1.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HomeDataFetcher Q9() {
            return new HomeDataFetcher((ApolloClient) this.T1.get(), (oh5) this.I2.get(), z9(), (lm) this.Y2.get(), (com.nytimes.android.coroutinesutils.b) this.Z2.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MessageQueueImpl Qa() {
            return new MessageQueueImpl((zr4) this.D5.get(), (kr4) this.F5.get(), (b4) this.C5.get(), Pa(), (cb2) this.D.get(), new dm8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ts6 Qb() {
            return new ts6((cb2) this.D.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AlsApi R8() {
            return xb.a(Ga());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.nytimes.android.coroutinesutils.b R9() {
            return hb1.a(this.b, k9());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public js4 Ra() {
            return q.a((z58) this.e0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RecentlyViewedParams Rb() {
            return new RecentlyViewedParams((FeedStore) this.V.get(), (qq3) this.Q3.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public qb S8() {
            return yb.a(Ha());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public jb3 S9() {
            return new jb3(L8(), (AbraManager) this.Y0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MeterServiceDAOImpl Sa() {
            return new MeterServiceDAOImpl((String) this.H0.get(), (MeterServiceApi) this.l5.get(), (AppPreferences) this.v.get(), (Resources) this.u.get(), (NetworkStatus) this.F0.get(), (d27) this.m5.get(), (z58) this.e0.get(), (qv6) this.B.get(), (CoroutineScope) this.X.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ResourceDao Sb() {
            return nz6.a((ResourceDatabase) this.l2.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AnalyticsDisablerImpl T8() {
            return new AnalyticsDisablerImpl((jc) this.L0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public el T9() {
            return qc3.a(this.i, W9());
        }

        private MetricsTracker Ta() {
            return new MetricsTracker(cc(), (cr5) this.O2.get(), (zo2) this.N2.get(), (CoroutineScope) this.X.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c07 Tb() {
            return new c07(en.a(this.a));
        }

        private AnalyticsSubauthHelper U8() {
            return new AnalyticsSubauthHelper((jc) this.L0.get(), (s98) this.V0.get(), (z88) this.T0.get(), (ET2SimpleScope) this.k0.get(), (xl1) this.i4.get(), (s52) this.h4.get(), (CoroutineScope) this.X.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public lc3.a U9() {
            return oc3.a(this.i, W9());
        }

        private a15 Ua() {
            return wa6.a(Va());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Retrofit.Builder Ub() {
            return g45.a(nt1.a(this.H), (Resources) this.u.get(), (Gson) this.N.get());
        }

        private kn V8() {
            return new kn((PublishSubject) this.O0.get(), (Queue) this.J3.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bc3 V9() {
            return vb3.a((xb3) this.S4.get());
        }

        private NYTPushMessagingUserProviderImpl Va() {
            return new NYTPushMessagingUserProviderImpl(en.a(this.a), (Subauth) this.L.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public m17 Vb() {
            return new m17((SharedPreferences) this.M.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ms W8() {
            return com.nytimes.android.dimodules.i.a((FeedStore) this.V.get(), (uy3) this.C1.get(), new sd4(), (z58) this.e0.get(), (CoroutineScope) this.X.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ec3 W9() {
            return gc3.a(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Retrofit.Builder Wa() {
            return d45.a(nt1.a(this.H), (c05) this.P1.get(), (Resources) this.u.get());
        }

        private b97 Wb() {
            return new b97(nt1.a(this.j1), (SharedPreferences) this.M.get(), nt1.a(this.C3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i00 X8() {
            return new i00((g00) this.T4.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bc3 X9() {
            return sc3.a(this.i, Y9());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f55 Xa() {
            return new f55(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SectionCarouselsDataFetcher Xb() {
            return new SectionCarouselsDataFetcher((ApolloClient) this.T1.get(), (e23) this.f2.get(), c9(), (AssetRetriever) this.x2.get(), (b05) this.K0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean Y8() {
            return sa6.Companion.e(u9());
        }

        private JsonAdapter Y9() {
            lc3 lc3Var = this.i;
            return tc3.a(lc3Var, zc3.a(lc3Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NewsletterFetcher Ya() {
            return new NewsletterFetcher((ApolloClient) this.T1.get(), new c65());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SectionLinksRepository Yb() {
            return new SectionLinksRepository(new com.nytimes.navigation.deeplink.a(), (SectionFrontPersister) this.D4.get());
        }

        private m40 Z8() {
            return new m40((qv6) this.B.get(), kb2.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public g55 Z9() {
            return bd3.a(this.i, en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i65 Za() {
            return new i65(en.a(this.a), ab(), bb());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set Zb() {
            return ImmutableSet.D(zb(), wb(), yb(), xb(), (dd1) this.D1.get(), (dd1) this.E1.get(), (dd1) this.F1.get(), Aa(), (dd1) this.G1.get(), (dd1) this.H1.get(), (dd1) this.I1.get(), db(), (dd1) this.J1.get(), (dd1) this.K1.get(), (dd1) this.j3.get(), (dd1) this.k3.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BookCategoryPersister a9() {
            return new BookCategoryPersister(D9());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PageService aa() {
            return cd3.a(this.i, ba());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public j65 ab() {
            return new j65(en.a(this.a), (SharedPreferences) this.M.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set ac() {
            return ImmutableSet.p(17).j(n9()).j(o9()).a(nb()).j(ub()).a(ob()).a(bd2.a()).j(com.nytimes.android.features.home.a.a()).a((wn1) this.L5.get()).a(pb()).a(qb()).a((wn1) this.N5.get()).a(b06.a()).a(rb()).j(p9()).a(mb()).a(sb()).j(q9()).l();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ae0 b9() {
            return com.nytimes.android.dimodules.j.a(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Retrofit ba() {
            return vc3.a(this.i, (OkHttpClient) this.T6.get(), da());
        }

        private k65 bb() {
            return new k65(ab());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set bc() {
            return ImmutableSet.u(p43.a(this.q));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ml0 c9() {
            return new ml0(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set ca() {
            return ImmutableSet.z(wc3.a(this.i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NotificationManager cb() {
            return xa6.a(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set cc() {
            return ImmutableSet.D((com.nytimes.android.performancetrackerclientphoenix.monitor.b) this.Q2.get(), (com.nytimes.android.performancetrackerclientphoenix.monitor.b) this.R2.get(), (com.nytimes.android.performancetrackerclientphoenix.monitor.b) this.S2.get(), (com.nytimes.android.performancetrackerclientphoenix.monitor.b) this.T2.get(), (com.nytimes.android.performancetrackerclientphoenix.monitor.b) this.U2.get(), (com.nytimes.android.performancetrackerclientphoenix.monitor.b) this.W2.get(), new com.nytimes.android.performancetrackerclientphoenix.monitor.b[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ContentSearchExecutor d9() {
            return new ContentSearchExecutor((ApolloClient) this.T1.get(), f9(), e9(), (SharedPreferences) this.M.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SharedPreferences da() {
            return dd3.a(this.i, en.a(this.a));
        }

        private ma5 db() {
            return new ma5(W8());
        }

        private Set dc() {
            return ImmutableSet.B(lb(), t9(), oc());
        }

        private sw0 e9() {
            return new sw0((TimeStampUtil) this.w4.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ImageCropper ea() {
            return m31.a((ImageCropsHelper) this.e6.get(), h9());
        }

        private pb5 eb() {
            return new pb5((com.nytimes.android.performancetrackerclientphoenix.tracing.a) this.E.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set ec() {
            return ImmutableSet.u(z96.a(this.g));
        }

        private uw0 f9() {
            return new uw0((TimeStampUtil) this.w4.get());
        }

        private zf3 fa() {
            return l31.a(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OkHttpClientFactory fb() {
            return new OkHttpClientFactory((ds7) this.C.get(), dc(), en.a(this.a), (so1) this.P.get(), ee0.a.a());
        }

        private Set fc() {
            return ImmutableSet.p(2).j(p52.a()).a(vb()).l();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CookingApi g9() {
            return d17.a(this.r, Wa());
        }

        private void ga(v6 v6Var, w7 w7Var, i9 i9Var, dn dnVar, cb1 cb1Var, jx1 jx1Var, j52 j52Var, FirebaseModule firebaseModule, m43 m43Var, y43 y43Var, lc3 lc3Var, s94 s94Var, m05 m05Var, o05 o05Var, v96 v96Var, c17 c17Var, g58 g58Var, f58 f58Var, a78 a78Var) {
            this.u = nt1.b(new a(this.t, 1));
            this.v = nt1.b(new a(this.t, 2));
            this.w = nt1.b(new a(this.t, 5));
            this.x = nt1.b(new a(this.t, 6));
            this.y = nt1.b(new a(this.t, 7));
            this.z = nt1.b(new a(this.t, 4));
            this.A = nt1.b(new a(this.t, 8));
            this.B = nt1.b(new a(this.t, 3));
            this.C = nt1.b(new a(this.t, 11));
            this.D = new sl1();
            this.E = nt1.b(new a(this.t, 12));
            this.F = nt1.b(new a(this.t, 13));
            this.G = nt1.b(new a(this.t, 18));
            this.H = new sl1();
            this.I = nt1.b(new a(this.t, 20));
            this.J = nt1.b(new a(this.t, 19));
            this.K = nt1.b(new a(this.t, 21));
            this.L = nt1.b(new a(this.t, 17));
            this.M = nt1.b(new a(this.t, 25));
            this.N = nt1.b(new a(this.t, 27));
            this.O = nt1.b(new a(this.t, 28));
            this.P = nt1.b(new a(this.t, 29));
            this.Q = nt1.b(new a(this.t, 26));
            this.R = nt1.b(new a(this.t, 24));
            this.S = nt1.b(new a(this.t, 30));
            this.T = nt1.b(new a(this.t, 32));
            this.U = nt1.b(new a(this.t, 31));
            this.V = nt1.b(new a(this.t, 23));
            this.W = nt1.b(new a(this.t, 22));
            this.X = nt1.b(new a(this.t, 33));
            this.Y = nt1.b(new a(this.t, 16));
            this.Z = nt1.b(new a(this.t, 36));
            this.a0 = nt1.b(new a(this.t, 45));
            this.b0 = nt1.b(new a(this.t, 47));
            this.c0 = nt1.b(new a(this.t, 48));
            this.d0 = nt1.b(new a(this.t, 46));
            this.e0 = new sl1();
            this.f0 = nt1.b(new a(this.t, 49));
            this.g0 = nt1.b(new a(this.t, 50));
            this.h0 = nt1.b(new a(this.t, 53));
            this.i0 = nt1.b(new a(this.t, 54));
            this.j0 = nt1.b(new a(this.t, 52));
            this.k0 = nt1.b(new a(this.t, 51));
            this.l0 = nt1.b(new a(this.t, 44));
            this.m0 = nt1.b(new a(this.t, 43));
            this.n0 = nt1.b(new a(this.t, 42));
            this.o0 = nt1.b(new a(this.t, 56));
            this.p0 = nt1.b(new a(this.t, 57));
            this.q0 = nt1.b(new a(this.t, 55));
            this.r0 = nt1.b(new a(this.t, 60));
            this.s0 = nt1.b(new a(this.t, 61));
            this.t0 = nt1.b(new a(this.t, 62));
            this.u0 = nt1.b(new a(this.t, 59));
            this.v0 = nt1.b(new a(this.t, 58));
            this.w0 = nt1.b(new a(this.t, 64));
            this.x0 = nt1.b(new a(this.t, 63));
            this.y0 = nt1.b(new a(this.t, 65));
            this.z0 = nt1.b(new a(this.t, 66));
            this.A0 = nt1.b(new a(this.t, 67));
            this.B0 = nt1.b(new a(this.t, 69));
            this.C0 = nt1.b(new a(this.t, 68));
            this.D0 = nt1.b(new a(this.t, 41));
            this.E0 = nt1.b(new a(this.t, 40));
            this.F0 = nt1.b(new a(this.t, 70));
            this.G0 = nt1.b(new a(this.t, 71));
            this.H0 = nt1.b(new a(this.t, 72));
            this.I0 = nt1.b(new a(this.t, 73));
            this.J0 = nt1.b(new a(this.t, 74));
            this.K0 = nt1.b(new a(this.t, 75));
            this.L0 = nt1.b(new a(this.t, 39));
            this.M0 = nt1.b(new a(this.t, 38));
            this.N0 = nt1.b(new a(this.t, 37));
            this.O0 = nt1.b(new a(this.t, 76));
            this.P0 = nt1.b(new a(this.t, 35));
            this.Q0 = nt1.b(new a(this.t, 77));
            this.R0 = new a(this.t, 78);
            this.S0 = nt1.b(new a(this.t, 79));
            this.T0 = nt1.b(new a(this.t, 34));
            this.U0 = nt1.b(new a(this.t, 80));
            this.V0 = nt1.b(new a(this.t, 81));
            sl1.a(this.e0, nt1.b(new a(this.t, 15)));
            this.W0 = nt1.b(new a(this.t, 14));
            sl1.a(this.H, nt1.b(new a(this.t, 10)));
            this.X0 = nt1.b(new a(this.t, 82));
            this.Y0 = nt1.b(new a(this.t, 9));
            sl1.a(this.D, nt1.b(new a(this.t, 0)));
            this.Z0 = nt1.b(new a(this.t, 83));
            this.a1 = nt1.b(new a(this.t, 84));
            this.b1 = nt1.b(new a(this.t, 85));
            this.c1 = new a(this.t, 88);
            this.d1 = new a(this.t, 89);
            this.e1 = nt1.b(new a(this.t, 87));
            this.f1 = nt1.b(new a(this.t, 91));
            this.g1 = nt1.b(new a(this.t, 100));
            this.h1 = nt1.b(new a(this.t, 99));
            this.i1 = nt1.b(new a(this.t, 98));
            this.j1 = nt1.b(new a(this.t, 97));
            this.k1 = nt1.b(new a(this.t, 101));
            this.l1 = nt1.b(new a(this.t, 103));
            this.m1 = nt1.b(new a(this.t, 102));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OpinionAssetFetcher gb() {
            return new OpinionAssetFetcher((ApolloClient) this.T1.get(), new gj5(), new wj5());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set gc() {
            return ImmutableSet.p(2).j(l58.a(this.c)).a(b78.a(this.d)).l();
        }

        private i31 h9() {
            return k31.a(fa());
        }

        private void ha(v6 v6Var, w7 w7Var, i9 i9Var, dn dnVar, cb1 cb1Var, jx1 jx1Var, j52 j52Var, FirebaseModule firebaseModule, m43 m43Var, y43 y43Var, lc3 lc3Var, s94 s94Var, m05 m05Var, o05 o05Var, v96 v96Var, c17 c17Var, g58 g58Var, f58 f58Var, a78 a78Var) {
            this.n1 = nt1.b(new a(this.t, 96));
            this.o1 = nt1.b(new a(this.t, 95));
            this.p1 = nt1.b(new a(this.t, 106));
            this.q1 = nt1.b(new a(this.t, 105));
            this.r1 = nt1.b(new a(this.t, 109));
            this.s1 = nt1.b(new a(this.t, 108));
            this.t1 = nt1.b(new a(this.t, 107));
            this.u1 = new sl1();
            this.v1 = nt1.b(new a(this.t, ContentType.SHORT_FORM_ON_DEMAND));
            this.w1 = nt1.b(new a(this.t, 110));
            this.x1 = nt1.b(new a(this.t, 104));
            this.y1 = jt7.a(new a(this.t, 94));
            this.z1 = nt1.b(new a(this.t, 115));
            this.A1 = nt1.b(new a(this.t, 116));
            this.B1 = nt1.b(new a(this.t, 114));
            this.C1 = nt1.b(new a(this.t, 119));
            this.D1 = nt1.b(new a(this.t, 120));
            this.E1 = nt1.b(new a(this.t, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND));
            this.F1 = nt1.b(new a(this.t, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND));
            this.G1 = nt1.b(new a(this.t, ContentType.USER_GENERATED_LIVE));
            this.H1 = nt1.b(new a(this.t, 124));
            this.I1 = nt1.b(new a(this.t, 125));
            this.J1 = nt1.b(new a(this.t, WebSocketProtocol.PAYLOAD_SHORT));
            this.K1 = nt1.b(new a(this.t, 127));
            this.L1 = nt1.b(new a(this.t, 133));
            this.M1 = nt1.b(new a(this.t, 137));
            this.N1 = nt1.b(new a(this.t, 138));
            this.O1 = nt1.b(new a(this.t, 136));
            this.P1 = nt1.b(new a(this.t, 139));
            this.Q1 = nt1.b(new a(this.t, 140));
            this.R1 = nt1.b(new a(this.t, 141));
            this.S1 = nt1.b(new a(this.t, 142));
            this.T1 = nt1.b(new a(this.t, 135));
            this.U1 = nt1.b(new a(this.t, 143));
            this.V1 = nt1.b(new a(this.t, 134));
            this.W1 = nt1.b(new a(this.t, 144));
            this.X1 = nt1.b(new a(this.t, 146));
            this.Y1 = nt1.b(new a(this.t, 145));
            this.Z1 = nt1.b(new a(this.t, 147));
            this.a2 = nt1.b(new a(this.t, 150));
            this.b2 = nt1.b(new a(this.t, 151));
            this.c2 = nt1.b(new a(this.t, 152));
            this.d2 = nt1.b(new a(this.t, 153));
            this.e2 = nt1.b(new a(this.t, 149));
            this.f2 = nt1.b(new a(this.t, 158));
            this.g2 = nt1.b(new a(this.t, 161));
            this.h2 = nt1.b(new a(this.t, 160));
            this.i2 = nt1.b(new a(this.t, 159));
            this.j2 = nt1.b(new a(this.t, 164));
            this.k2 = nt1.b(new a(this.t, 163));
            this.l2 = nt1.b(new a(this.t, 166));
            this.m2 = nt1.b(new a(this.t, 167));
            this.n2 = nt1.b(new a(this.t, 165));
            this.o2 = nt1.b(new a(this.t, 168));
            this.p2 = nt1.b(new a(this.t, 162));
            this.q2 = nt1.b(new a(this.t, 157));
            this.r2 = nt1.b(new a(this.t, 156));
            this.s2 = nt1.b(new a(this.t, 155));
            this.t2 = new sl1();
            this.u2 = new a(this.t, 169);
            this.v2 = nt1.b(new a(this.t, 154));
            this.w2 = nt1.b(new a(this.t, 170));
            this.x2 = nt1.b(new a(this.t, 148));
            this.y2 = nt1.b(new a(this.t, 132));
            this.z2 = nt1.b(new a(this.t, 131));
            this.A2 = nt1.b(new a(this.t, 130));
            this.B2 = new a(this.t, 172);
            this.C2 = nt1.b(new a(this.t, 171));
            this.D2 = nt1.b(new a(this.t, 175));
            this.E2 = nt1.b(new a(this.t, 177));
            this.F2 = nt1.b(new a(this.t, 176));
            this.G2 = nt1.b(new a(this.t, 174));
            this.H2 = nt1.b(new a(this.t, 173));
            this.I2 = nt1.b(new a(this.t, 181));
            this.J2 = nt1.b(new a(this.t, 185));
            this.K2 = nt1.b(new a(this.t, 184));
            this.L2 = nt1.b(new a(this.t, 186));
            this.M2 = nt1.b(new a(this.t, 187));
            this.N2 = nt1.b(new a(this.t, 188));
            this.O2 = nt1.b(new a(this.t, 183));
            this.P2 = nt1.b(new a(this.t, 191));
            this.Q2 = nt1.b(new a(this.t, 190));
            this.R2 = nt1.b(new a(this.t, 192));
            this.S2 = nt1.b(new a(this.t, 193));
            this.T2 = nt1.b(new a(this.t, 194));
            this.U2 = nt1.b(new a(this.t, 195));
            this.V2 = nt1.b(new a(this.t, 197));
            this.W2 = nt1.b(new a(this.t, 196));
            this.X2 = nt1.b(new a(this.t, 189));
            this.Y2 = nt1.b(new a(this.t, 182));
            this.Z2 = nt1.b(new a(this.t, 198));
            this.a3 = nt1.b(new a(this.t, 180));
            this.b3 = nt1.b(new a(this.t, 200));
            this.c3 = nt1.b(new a(this.t, ContentType.BUMPER));
            this.d3 = nt1.b(new a(this.t, 179));
            this.e3 = nt1.b(new a(this.t, 178));
            this.f3 = nt1.b(new a(this.t, 201));
            this.g3 = nt1.b(new a(this.t, 202));
            this.h3 = nt1.b(new a(this.t, 203));
            this.i3 = nt1.b(new a(this.t, 129));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PlayTabPreferencesStore hb() {
            return new PlayTabPreferencesStore(en.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set hc() {
            return ImmutableSet.B((yk8) this.K2.get(), (yk8) this.L2.get(), (yk8) this.M2.get());
        }

        private com.nytimes.android.libs.messagingarchitecture.network.a i9() {
            return new com.nytimes.android.libs.messagingarchitecture.network.a((u0) this.X0.get(), (AbraManager) this.Y0.get(), (cb2) this.D.get());
        }

        private void ia(v6 v6Var, w7 w7Var, i9 i9Var, dn dnVar, cb1 cb1Var, jx1 jx1Var, j52 j52Var, FirebaseModule firebaseModule, m43 m43Var, y43 y43Var, lc3 lc3Var, s94 s94Var, m05 m05Var, o05 o05Var, v96 v96Var, c17 c17Var, g58 g58Var, f58 f58Var, a78 a78Var) {
            this.j3 = nt1.b(new a(this.t, 128));
            this.k3 = nt1.b(new a(this.t, 204));
            this.l3 = nt1.b(new a(this.t, 118));
            this.m3 = nt1.b(new a(this.t, 205));
            this.n3 = nt1.b(new a(this.t, 117));
            this.o3 = nt1.b(new a(this.t, ContentType.LIVE));
            this.p3 = jt7.a(new a(this.t, ContentType.LONG_FORM_ON_DEMAND));
            this.q3 = jt7.a(new a(this.t, 206));
            this.r3 = nt1.b(new a(this.t, 208));
            this.s3 = nt1.b(new a(this.t, AdvertisementType.ON_DEMAND_MID_ROLL));
            this.t3 = nt1.b(new a(this.t, 215));
            this.u3 = nt1.b(new a(this.t, 214));
            this.v3 = nt1.b(new a(this.t, AdvertisementType.ON_DEMAND_POST_ROLL));
            this.w3 = nt1.b(new a(this.t, 217));
            this.x3 = nt1.b(new a(this.t, 216));
            this.y3 = nt1.b(new a(this.t, AdvertisementType.ON_DEMAND_PRE_ROLL));
            this.z3 = nt1.b(new a(this.t, 218));
            this.A3 = nt1.b(new a(this.t, 219));
            this.B3 = nt1.b(new a(this.t, 210));
            this.C3 = nt1.b(new a(this.t, 209));
            this.D3 = jt7.a(new a(this.t, 207));
            sl1.a(this.u1, nt1.b(new a(this.t, 93)));
            this.E3 = nt1.b(new a(this.t, 92));
            sl1.a(this.t2, nt1.b(new a(this.t, 90)));
            this.F3 = nt1.b(new a(this.t, 86));
            this.G3 = nt1.b(new a(this.t, 220));
            this.H3 = nt1.b(new a(this.t, AdvertisementType.LIVE));
            this.I3 = nt1.b(new a(this.t, 222));
            this.J3 = nt1.b(new a(this.t, 223));
            this.K3 = nt1.b(new a(this.t, 224));
            this.L3 = nt1.b(new a(this.t, 225));
            this.M3 = nt1.b(new a(this.t, 226));
            this.N3 = nt1.b(new a(this.t, 227));
            this.O3 = nt1.b(new a(this.t, 228));
            this.P3 = nt1.b(new a(this.t, 230));
            this.Q3 = nt1.b(new a(this.t, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL));
            this.R3 = nt1.b(new a(this.t, 229));
            this.S3 = nt1.b(new a(this.t, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL));
            this.T3 = nt1.b(new a(this.t, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL));
            this.U3 = nt1.b(new a(this.t, AdvertisementType.BRANDED_AS_CONTENT));
            this.V3 = nt1.b(new a(this.t, 238));
            this.W3 = nt1.b(new a(this.t, 237));
            this.X3 = nt1.b(new a(this.t, 236));
            this.Y3 = nt1.b(new a(this.t, 240));
            this.Z3 = nt1.b(new a(this.t, 239));
            this.a4 = nt1.b(new a(this.t, 241));
            this.b4 = nt1.b(new a(this.t, 242));
            this.c4 = nt1.b(new a(this.t, AdvertisementType.BRANDED_DURING_LIVE));
            this.d4 = nt1.b(new a(this.t, 244));
            this.e4 = new a(this.t, 246);
            this.f4 = nt1.b(new a(this.t, 245));
            this.g4 = nt1.b(new a(this.t, 243));
            this.h4 = nt1.b(new a(this.t, 248));
            this.i4 = nt1.b(new a(this.t, 247));
            this.j4 = nt1.b(new a(this.t, 250));
            this.k4 = nt1.b(new a(this.t, 251));
            this.l4 = nt1.b(new a(this.t, 249));
            this.m4 = nt1.b(new a(this.t, 252));
            this.n4 = nt1.b(new a(this.t, 254));
            this.o4 = nt1.b(new a(this.t, 255));
            this.p4 = nt1.b(new a(this.t, 253));
            this.q4 = nt1.b(new a(this.t, 257));
            this.r4 = nt1.b(new a(this.t, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH));
            this.s4 = nt1.b(new a(this.t, 258));
            this.t4 = nt1.b(new a(this.t, 260));
            this.u4 = new a(this.t, 262);
            this.v4 = new a(this.t, 263);
            this.w4 = nt1.b(new a(this.t, 261));
            this.x4 = nt1.b(new a(this.t, 259));
            this.y4 = nt1.b(new a(this.t, 264));
            this.z4 = nt1.b(new a(this.t, 265));
            this.A4 = nt1.b(new a(this.t, 268));
            this.B4 = nt1.b(new a(this.t, 271));
            this.C4 = nt1.b(new a(this.t, 270));
            this.D4 = nt1.b(new a(this.t, 269));
            this.E4 = nt1.b(new a(this.t, 267));
            this.F4 = nt1.b(new a(this.t, 266));
            this.G4 = nt1.b(new a(this.t, 272));
            this.H4 = nt1.b(new a(this.t, 273));
            this.I4 = nt1.b(new a(this.t, 274));
            this.J4 = nt1.b(new a(this.t, 277));
            this.K4 = nt1.b(new a(this.t, 276));
            this.L4 = nt1.b(new a(this.t, 275));
            this.M4 = nt1.b(new a(this.t, 278));
            this.N4 = nt1.b(new a(this.t, 281));
            this.O4 = nt1.b(new a(this.t, 280));
            this.P4 = nt1.b(new a(this.t, 282));
            this.Q4 = nt1.b(new a(this.t, 283));
            this.R4 = nt1.b(new a(this.t, 279));
            this.S4 = nt1.b(new a(this.t, 284));
            this.T4 = nt1.b(new a(this.t, 287));
            this.U4 = nt1.b(new a(this.t, 286));
            this.V4 = nt1.b(new a(this.t, 285));
            this.W4 = nt1.b(new a(this.t, 288));
            this.X4 = nt1.b(new a(this.t, 290));
            this.Y4 = nt1.b(new a(this.t, 289));
            this.Z4 = nt1.b(new a(this.t, 292));
            this.a5 = nt1.b(new a(this.t, 291));
            this.b5 = nt1.b(new a(this.t, 294));
            this.c5 = nt1.b(new a(this.t, 293));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PodcastFetcher ib() {
            return new PodcastFetcher((ApolloClient) this.T1.get(), jb(), v9());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SourceDao ic() {
            return tz6.a((ResourceDatabase) this.l2.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ig1 j9() {
            return new ig1(W8());
        }

        private void ja(v6 v6Var, w7 w7Var, i9 i9Var, dn dnVar, cb1 cb1Var, jx1 jx1Var, j52 j52Var, FirebaseModule firebaseModule, m43 m43Var, y43 y43Var, lc3 lc3Var, s94 s94Var, m05 m05Var, o05 o05Var, v96 v96Var, c17 c17Var, g58 g58Var, f58 f58Var, a78 a78Var) {
            this.d5 = nt1.b(new a(this.t, 295));
            this.e5 = nt1.b(new a(this.t, 296));
            this.f5 = nt1.b(new a(this.t, 297));
            this.g5 = nt1.b(new a(this.t, 298));
            this.h5 = nt1.b(new a(this.t, 299));
            this.i5 = nt1.b(new a(this.t, ContentFeedType.OTHER));
            this.j5 = nt1.b(new a(this.t, 301));
            this.k5 = nt1.b(new a(this.t, ContentFeedType.WEST_HD));
            this.l5 = nt1.b(new a(this.t, ContentFeedType.EAST_SD));
            this.m5 = nt1.b(new a(this.t, ContentFeedType.WEST_SD));
            this.n5 = nt1.b(new a(this.t, 306));
            this.o5 = nt1.b(new a(this.t, 305));
            this.p5 = nt1.b(new a(this.t, StatusLine.HTTP_TEMP_REDIRECT));
            this.q5 = nt1.b(new a(this.t, 310));
            this.r5 = nt1.b(new a(this.t, 312));
            this.s5 = nt1.b(new a(this.t, 313));
            this.t5 = nt1.b(new a(this.t, 311));
            this.u5 = nt1.b(new a(this.t, 309));
            this.v5 = nt1.b(new a(this.t, 315));
            this.w5 = nt1.b(new a(this.t, 314));
            this.x5 = nt1.b(new a(this.t, StatusLine.HTTP_PERM_REDIRECT));
            this.y5 = nt1.b(new a(this.t, 321));
            this.z5 = nt1.b(new a(this.t, 320));
            this.A5 = nt1.b(new a(this.t, 322));
            this.B5 = nt1.b(new a(this.t, 323));
            this.C5 = nt1.b(new a(this.t, 324));
            this.D5 = nt1.b(new a(this.t, 319));
            this.E5 = nt1.b(new a(this.t, 326));
            this.F5 = nt1.b(new a(this.t, 325));
            this.G5 = nt1.b(new a(this.t, 318));
            this.H5 = nt1.b(new a(this.t, 329));
            this.I5 = nt1.b(new a(this.t, 328));
            this.J5 = nt1.b(new a(this.t, 330));
            this.K5 = nt1.b(new a(this.t, 327));
            this.L5 = nt1.b(new a(this.t, 317));
            this.M5 = nt1.b(new a(this.t, 332));
            this.N5 = nt1.b(new a(this.t, 331));
            this.O5 = nt1.b(new a(this.t, 316));
            this.P5 = nt1.b(new a(this.t, 333));
            this.Q5 = nt1.b(new a(this.t, 334));
            this.R5 = nt1.b(new a(this.t, 335));
            this.S5 = new a(this.t, 336);
            this.T5 = nt1.b(new a(this.t, 337));
            this.U5 = nt1.b(new a(this.t, 338));
            this.V5 = nt1.b(new a(this.t, 339));
            this.W5 = nt1.b(new a(this.t, 340));
            this.X5 = nt1.b(new a(this.t, 341));
            this.Y5 = nt1.b(new a(this.t, 342));
            this.Z5 = nt1.b(new a(this.t, 343));
            this.a6 = nt1.b(new a(this.t, 344));
            this.b6 = nt1.b(new a(this.t, 345));
            this.c6 = nt1.b(new a(this.t, 346));
            this.d6 = nt1.b(new a(this.t, 347));
            this.e6 = nt1.b(new a(this.t, 348));
            this.f6 = nt1.b(new a(this.t, 349));
            this.g6 = nt1.b(new a(this.t, 354));
            this.h6 = nt1.b(new a(this.t, 353));
            this.i6 = nt1.b(new a(this.t, 356));
            this.j6 = nt1.b(new a(this.t, 357));
            this.k6 = nt1.b(new a(this.t, 358));
            this.l6 = nt1.b(new a(this.t, 360));
            this.m6 = nt1.b(new a(this.t, 361));
            this.n6 = nt1.b(new a(this.t, 362));
            this.o6 = nt1.b(new a(this.t, 363));
            this.p6 = nt1.b(new a(this.t, 364));
            this.q6 = nt1.b(new a(this.t, 359));
            this.r6 = nt1.b(new a(this.t, 365));
            this.s6 = nt1.b(new a(this.t, 355));
            this.t6 = nt1.b(new a(this.t, 352));
            this.u6 = nt1.b(new a(this.t, 351));
            this.v6 = nt1.b(new a(this.t, 350));
            this.w6 = nt1.b(new a(this.t, 368));
            this.x6 = nt1.b(new a(this.t, 367));
            this.y6 = nt1.b(new a(this.t, 371));
            this.z6 = nt1.b(new a(this.t, 372));
            this.A6 = nt1.b(new a(this.t, 376));
            this.B6 = nt1.b(new a(this.t, 377));
            this.C6 = nt1.b(new a(this.t, 375));
            this.D6 = nt1.b(new a(this.t, 374));
            this.E6 = nt1.b(new a(this.t, 379));
            this.F6 = nt1.b(new a(this.t, 378));
            this.G6 = nt1.b(new a(this.t, 373));
            this.H6 = nt1.b(new a(this.t, 370));
            this.I6 = nt1.b(new a(this.t, 369));
            this.J6 = nt1.b(new a(this.t, 366));
            this.K6 = nt1.b(new a(this.t, 380));
            this.L6 = nt1.b(new a(this.t, 381));
            this.M6 = nt1.b(new a(this.t, 385));
            this.N6 = nt1.b(new a(this.t, 386));
            this.O6 = nt1.b(new a(this.t, 384));
            this.P6 = nt1.b(new a(this.t, 383));
            this.Q6 = nt1.b(new a(this.t, 387));
            this.R6 = nt1.b(new a(this.t, 382));
            this.S6 = nt1.b(new a(this.t, 388));
            this.T6 = nt1.b(new a(this.t, 389));
            this.U6 = nt1.b(new a(this.t, 390));
            this.V6 = nt1.b(new a(this.t, 391));
            this.W6 = nt1.b(new a(this.t, 392));
            this.X6 = nt1.b(new a(this.t, 393));
            this.Y6 = nt1.b(new a(this.t, 394));
        }

        private com.nytimes.android.media.audio.podcast.a jb() {
            return new com.nytimes.android.media.audio.podcast.a(wa());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a68 jc() {
            return new a68((c78) this.Y.get(), (z88) this.T0.get(), (n98) this.P0.get(), (n98.b) this.U0.get(), (s98) this.V0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public si1.a k9() {
            return new si1.a((AppEventFactory) this.X2.get());
        }

        private void ka(v6 v6Var, w7 w7Var, i9 i9Var, dn dnVar, cb1 cb1Var, jx1 jx1Var, j52 j52Var, FirebaseModule firebaseModule, m43 m43Var, y43 y43Var, lc3 lc3Var, s94 s94Var, m05 m05Var, o05 o05Var, v96 v96Var, c17 c17Var, g58 g58Var, f58 f58Var, a78 a78Var) {
            this.Z6 = nt1.b(new a(this.t, 395));
            this.a7 = nt1.b(new a(this.t, 396));
            this.b7 = nt1.b(new a(this.t, 397));
            this.c7 = nt1.b(new a(this.t, 399));
            this.d7 = nt1.b(new a(this.t, WindowState.NORMAL));
            this.e7 = nt1.b(new a(this.t, 398));
            this.f7 = nt1.b(new a(this.t, WindowState.MINIMIZED));
            this.g7 = nt1.b(new a(this.t, 403));
            this.h7 = nt1.b(new a(this.t, WindowState.FULL_SCREEN));
            this.i7 = nt1.b(new a(this.t, Constants.NO_SUCH_BUCKET_STATUS_CODE));
            this.j7 = nt1.b(new a(this.t, 405));
            this.k7 = nt1.b(new a(this.t, 406));
            this.l7 = nt1.b(new a(this.t, 407));
            this.m7 = nt1.b(new a(this.t, 408));
            this.n7 = nt1.b(new a(this.t, 409));
            this.o7 = nt1.b(new a(this.t, 410));
            this.p7 = nt1.b(new a(this.t, 411));
            this.q7 = nt1.b(new a(this.t, Constants.FAILED_PRECONDITION_STATUS_CODE));
            this.r7 = nt1.b(new a(this.t, 413));
            this.s7 = nt1.b(new a(this.t, 415));
            this.t7 = nt1.b(new a(this.t, 414));
            this.u7 = nt1.b(new a(this.t, 416));
            this.v7 = nt1.b(new a(this.t, 417));
            this.w7 = nt1.b(new a(this.t, 418));
            this.x7 = nt1.b(new a(this.t, 419));
            this.y7 = nt1.b(new a(this.t, 420));
            this.z7 = nt1.b(new a(this.t, 423));
            this.A7 = nt1.b(new a(this.t, 422));
            this.B7 = nt1.b(new a(this.t, StatusLine.HTTP_MISDIRECTED_REQUEST));
            this.C7 = nt1.b(new a(this.t, 424));
            this.D7 = nt1.b(new a(this.t, 426));
            this.E7 = nt1.b(new a(this.t, 425));
            this.F7 = nt1.b(new a(this.t, 427));
            this.G7 = nt1.b(new a(this.t, 430));
            this.H7 = nt1.b(new a(this.t, 429));
            this.I7 = nt1.b(new a(this.t, 428));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ez5 kb() {
            return new ez5((SharedPreferences) this.M.get(), (JsonAdapter) this.q5.get(), (ly5) this.t5.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SubauthEntitlementClientImpl kc() {
            return new SubauthEntitlementClientImpl((Subauth) this.L.get(), (my3) this.W.get(), (SharedPreferences) this.M.get(), (CoroutineScope) this.X.get(), u01.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String l9() {
            return oy5.a((Resources) this.u.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ImageCropsHelper la(ImageCropsHelper imageCropsHelper) {
            com.nytimes.android.utils.b.a(imageCropsHelper, (FeedStore) this.V.get());
            return imageCropsHelper;
        }

        private tb5 lb() {
            return fb1.a(this.b, (cb2) this.D.get(), eb());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SubauthPurchaseClientImpl lc() {
            return new SubauthPurchaseClientImpl((Subauth) this.L.get(), (n98) this.P0.get(), (NetworkStatus) this.F0.get(), (ly3) this.Q0.get(), (PublishSubject) this.O0.get(), (ry3) this.R0.get(), (MutableSharedFlow) this.S0.get(), (SharedPreferences) this.M.get(), (CoroutineScope) this.X.get(), u01.a(), (Resources) this.u.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Intent m9() {
            return co1.a(en.a(this.a));
        }

        private InstallReferrerReceiver ma(InstallReferrerReceiver installReferrerReceiver) {
            com.nytimes.android.i.a(installReferrerReceiver, (cb2) this.D.get());
            com.nytimes.android.i.b(installReferrerReceiver, (qv6) this.B.get());
            return installReferrerReceiver;
        }

        private wn1 mb() {
            return com.nytimes.android.betasettings.a.a(zi2.a(this.e));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SubauthUserClientImpl mc() {
            return new SubauthUserClientImpl((Subauth) this.L.get(), (r98) this.Z.get(), nt1.a(this.N0), (NetworkStatus) this.F0.get(), (PublishSubject) this.O0.get(), (Resources) this.u.get());
        }

        private Set n9() {
            return j9.a(this.m, fn.a(this.a), (com.nytimes.android.ads.a) this.Q4.get());
        }

        private NYTApplication na(NYTApplication nYTApplication) {
            a05.z(nYTApplication, (NetworkStatus) this.F0.get());
            a05.h(nYTApplication, (bp0) this.Z0.get());
            a05.l(nYTApplication, (wc) this.E0.get());
            a05.f(nYTApplication, (xm) this.a1.get());
            a05.o(nYTApplication, (cb2) this.D.get());
            a05.A(nYTApplication, Za());
            a05.C(nYTApplication, (NotificationChannelHelper) this.b1.get());
            a05.D(nYTApplication, nt1.a(this.H));
            a05.S(nYTApplication, (yx8) this.F3.get());
            a05.M(nYTApplication, (SharedPreferences) this.M.get());
            a05.E(nYTApplication, Wb());
            a05.m(nYTApplication, w9());
            a05.u(nYTApplication, Ea());
            a05.N(nYTApplication, V8());
            a05.G(nYTApplication, (PurrLoginManager) this.K3.get());
            a05.n(nYTApplication, y9());
            a05.b(nYTApplication, K8());
            a05.x(nYTApplication, nt1.a(this.S2));
            a05.y(nYTApplication, Ta());
            a05.j(nYTApplication, (hx1) this.L3.get());
            a05.e(nYTApplication, (lm) this.Y2.get());
            a05.F(nYTApplication, (cr5) this.O2.get());
            a05.w(nYTApplication, (MainThreadTracker) this.M3.get());
            a05.q(nYTApplication, (le2) this.N3.get());
            a05.k(nYTApplication, (qz1) this.O3.get());
            a05.a(nYTApplication, J8());
            a05.p(nYTApplication, (FeedStore) this.V.get());
            a05.J(nYTApplication, nt1.a(this.p2));
            a05.g(nYTApplication, (CoroutineScope) this.X.get());
            a05.I(nYTApplication, (RecentlyViewedManager) this.R3.get());
            a05.t(nYTApplication, Ba());
            a05.i(nYTApplication, (com.nytimes.android.entitlements.a) this.j1.get());
            a05.K(nYTApplication, (SavedListFlyWeight) this.x3.get());
            a05.L(nYTApplication, nt1.a(this.C3));
            a05.R(nYTApplication, pc());
            a05.s(nYTApplication, ya());
            a05.B(nYTApplication, bb());
            a05.P(nYTApplication, (rj8) this.U3.get());
            a05.v(nYTApplication, (LoggingRemoteStreamManager) this.c4.get());
            a05.H(nYTApplication, (PushMessageHandler) this.g4.get());
            a05.O(nYTApplication, (z58) this.e0.get());
            a05.d(nYTApplication, U8());
            a05.r(nYTApplication, new ForegroundStateObserver());
            a05.Q(nYTApplication, (com.nytimes.android.performancetrackerclientphoenix.tracing.a) this.E.get());
            a05.c(nYTApplication, M8());
            return nYTApplication;
        }

        private wn1 nb() {
            return ob2.a((AppPreferences) this.v.get(), tc(), (InterestsManager) this.G2.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public u98 nc() {
            return new u98((r98) this.Z.get());
        }

        private Set o9() {
            return k52.a(this.n, fn.a(this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SFSummaryController oa(SFSummaryController sFSummaryController) {
            com.nytimes.android.sectionfront.adapter.model.c.a(sFSummaryController, en.a(this.a));
            com.nytimes.android.sectionfront.adapter.model.c.c(sFSummaryController, new bt5());
            com.nytimes.android.sectionfront.adapter.model.c.d(sFSummaryController, (u57) this.P6.get());
            com.nytimes.android.sectionfront.adapter.model.c.b(sFSummaryController, (b24) this.Q6.get());
            return sFSummaryController;
        }

        private wn1 ob() {
            return dn1.a((uk8) this.m4.get());
        }

        private jg8 oc() {
            return new jg8((ig8) this.W0.get());
        }

        private Set p9() {
            return n05.a(this.o, (LoggingRemoteStreamManager) this.c4.get());
        }

        private ShareBroadcastReceiver pa(ShareBroadcastReceiver shareBroadcastReceiver) {
            pp7.b(shareBroadcastReceiver, (ShareAnalyticsReporter) this.s4.get());
            pp7.a(shareBroadcastReceiver, Vb());
            pp7.c(shareBroadcastReceiver, (SharedPreferences) this.M.get());
            return shareBroadcastReceiver;
        }

        private wn1 pb() {
            return wd4.a((rd4) this.p5.get());
        }

        private TrackingIdInitializer pc() {
            return new TrackingIdInitializer(en.a(this.a), (CoroutineScope) this.X.get(), (ya) this.S3.get(), (z58) this.e0.get());
        }

        private Set q9() {
            return z68.a(fn.a(this.a), (Subauth) this.L.get(), (r98) this.Z.get(), (CoroutineScope) this.X.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public VideoCustomAdParamProvider qa(VideoCustomAdParamProvider videoCustomAdParamProvider) {
            i79.a(videoCustomAdParamProvider, I8());
            return videoCustomAdParamProvider;
        }

        private wn1 qb() {
            return com.nytimes.android.onboarding.compose.d.a((AppPreferences) this.v.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UpdateWorkerCompletableCreator qc() {
            return new UpdateWorkerCompletableCreator((WorkerRunner) this.r3.get(), (pk9) this.e1.get(), ge0.a(), (SavedManager) this.C3.get(), (if8) this.i3.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ho1 r9() {
            return eo1.a(Ia());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterestsCacheManager ra() {
            return new InterestsCacheManager((j91) this.D2.get(), u01.a(), (gp3) this.F2.get(), ta(), (AssetRetriever) this.x2.get(), (z58) this.e0.get(), (b05) this.K0.get(), (AppPreferences) this.v.get());
        }

        private wn1 rb() {
            return com.nytimes.android.saved.b.a((SavedManager) this.C3.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UpdateWorkerSchedulingParams rc() {
            return new UpdateWorkerSchedulingParams(nt1.a(this.B));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public lo1 s9() {
            return new lo1(en.a(this.a));
        }

        private fq3 sa() {
            return new fq3(new cq3());
        }

        private wn1 sb() {
            return ps6.a(nt1.a(this.R3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public WebWallFilter sc() {
            return new WebWallFilter((com.nytimes.android.entitlements.a) this.j1.get());
        }

        private lz1 t9() {
            return new lz1((kz1) this.F.get());
        }

        private InterestsPreferencesStore ta() {
            return new InterestsPreferencesStore(en.a(this.a));
        }

        private de4 tb() {
            return h81.a((DailyFiveMainTabFactory) this.A2.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public YouTabPreferencesStore tc() {
            return new YouTabPreferencesStore(en.a(this.a));
        }

        private com.nytimes.android.internal.pushmessaging.model.a u9() {
            return ya6.a((SharedPreferences) this.M.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterestsRepository ua() {
            return new InterestsRepository((ApolloClient) this.T1.get(), sa());
        }

        private Set ub() {
            return yu2.a(en.a(this.a));
        }

        private p22 v9() {
            return new p22((DateTimeFormatter) this.z7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean va() {
            return to1.Companion.f(en.a(this.a));
        }

        private r42.c vb() {
            return xc3.a(this.i, (rx1) this.I3.get());
        }

        private EventTrackerInitializer w9() {
            return new EventTrackerInitializer(en.a(this.a), (SharedPreferences) this.M.get(), (AppPreferences) this.v.get(), (r42) this.G3.get(), (Single) this.N1.get(), (vp1) this.H3.get(), va(), fc(), Z8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean wa() {
            return to1.Companion.g(en.a(this.a));
        }

        private dd1 wb() {
            return gd1.a(W8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.nytimes.android.media.player.a x9() {
            return com.nytimes.android.media.player.b.a(en.a(this.a), (VideoAdEvents) this.y6.get(), (iq8) this.z6.get(), (com.nytimes.android.media.player.m) this.G6.get(), (d96) this.l0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ItemToDetailEventSender xa() {
            return new ItemToDetailEventSender((ET2Scope) this.k0.get());
        }

        private dd1 xb() {
            return rp6.a(W8());
        }

        private d92 y9() {
            return new d92((d96) this.l0.get());
        }

        private IterateInitializer ya() {
            return new IterateInitializer(za(), (bs3) this.T3.get(), (CoroutineScope) this.X.get());
        }

        private dd1 yb() {
            return sp6.a(W8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public oa2 z9() {
            return new oa2((SharedPreferences) this.M.get());
        }

        private cs3 za() {
            return com.nytimes.android.dimodules.l.a(en.a(this.a), (z58) this.e0.get());
        }

        private dd1 zb() {
            return hd1.a(W8());
        }

        @Override // defpackage.z87
        public cb2 a() {
            return (cb2) this.D.get();
        }

        @Override // defpackage.j03, defpackage.z87
        public NetworkStatus b() {
            return (NetworkStatus) this.F0.get();
        }

        @Override // defpackage.j03, defpackage.z87
        public tr3 c() {
            return (tr3) this.p4.get();
        }

        @Override // defpackage.j03, defpackage.z87
        public ET2Scope d() {
            return (ET2Scope) this.k0.get();
        }

        @Override // bl7.a
        public al7 e() {
            return new h(this.t);
        }

        @Override // defpackage.rz4
        public void f(NYTApplication nYTApplication) {
            na(nYTApplication);
        }

        @Override // defpackage.z87
        public DeepLinkManager g() {
            return (DeepLinkManager) this.n3.get();
        }

        @Override // defpackage.vv5
        public uy3 h() {
            return (uy3) this.C1.get();
        }

        @Override // defpackage.ys5
        public s74 i() {
            return (s74) this.x4.get();
        }

        @Override // defpackage.z87
        public CommentsStore j() {
            return new CommentsStore(L9());
        }

        @Override // defpackage.tk8
        public uk8 k() {
            return (uk8) this.m4.get();
        }

        @Override // aq2.a
        public Set l() {
            return ImmutableSet.y();
        }

        @Override // defpackage.op7
        public void m(ShareBroadcastReceiver shareBroadcastReceiver) {
            pa(shareBroadcastReceiver);
        }

        @Override // defpackage.ul3
        public void n(InstallReferrerReceiver installReferrerReceiver) {
            ma(installReferrerReceiver);
        }

        @Override // defpackage.ys5
        public zm2 o() {
            return new zm2((SharedPreferences) this.M.get());
        }

        @Override // defpackage.lx1
        public ET2SinglePageClient p() {
            return (ET2SinglePageClient) this.j0.get();
        }

        @Override // defpackage.z87
        public SavedManager q() {
            return (SavedManager) this.C3.get();
        }

        @Override // o5.b
        public n5 r() {
            return new c(this.t);
        }

        private j(v6 v6Var, w7 w7Var, i9 i9Var, dn dnVar, cb1 cb1Var, jx1 jx1Var, j52 j52Var, FirebaseModule firebaseModule, m43 m43Var, y43 y43Var, lc3 lc3Var, s94 s94Var, m05 m05Var, o05 o05Var, v96 v96Var, c17 c17Var, g58 g58Var, f58 f58Var, a78 a78Var) {
            this.t = this;
            this.a = dnVar;
            this.b = cb1Var;
            this.c = g58Var;
            this.d = a78Var;
            this.e = firebaseModule;
            this.f = f58Var;
            this.g = v96Var;
            this.h = o05Var;
            this.i = lc3Var;
            this.j = s94Var;
            this.k = w7Var;
            this.l = v6Var;
            this.m = i9Var;
            this.n = j52Var;
            this.o = m05Var;
            this.p = jx1Var;
            this.q = m43Var;
            this.r = c17Var;
            this.s = y43Var;
            ga(v6Var, w7Var, i9Var, dnVar, cb1Var, jx1Var, j52Var, firebaseModule, m43Var, y43Var, lc3Var, s94Var, m05Var, o05Var, v96Var, c17Var, g58Var, f58Var, a78Var);
            ha(v6Var, w7Var, i9Var, dnVar, cb1Var, jx1Var, j52Var, firebaseModule, m43Var, y43Var, lc3Var, s94Var, m05Var, o05Var, v96Var, c17Var, g58Var, f58Var, a78Var);
            ia(v6Var, w7Var, i9Var, dnVar, cb1Var, jx1Var, j52Var, firebaseModule, m43Var, y43Var, lc3Var, s94Var, m05Var, o05Var, v96Var, c17Var, g58Var, f58Var, a78Var);
            ja(v6Var, w7Var, i9Var, dnVar, cb1Var, jx1Var, j52Var, firebaseModule, m43Var, y43Var, lc3Var, s94Var, m05Var, o05Var, v96Var, c17Var, g58Var, f58Var, a78Var);
            ka(v6Var, w7Var, i9Var, dnVar, cb1Var, jx1Var, j52Var, firebaseModule, m43Var, y43Var, lc3Var, s94Var, m05Var, o05Var, v96Var, c17Var, g58Var, f58Var, a78Var);
        }
    }

    private static final class k implements o99 {
        private final j a;
        private final d b;
        private final b c;
        private View d;

        @Override // defpackage.o99
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public xz4 build() {
            g16.a(this.d, View.class);
            return new l(this.a, this.b, this.c, this.d);
        }

        @Override // defpackage.o99
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k view(View view) {
            this.d = (View) g16.b(view);
            return this;
        }

        private k(j jVar, d dVar, b bVar) {
            this.a = jVar;
            this.b = dVar;
            this.c = bVar;
        }
    }

    private static final class l extends xz4 {
        private final j a;
        private final d b;
        private final b c;
        private final l d;

        private AudioIndicator A(AudioIndicator audioIndicator) {
            com.nytimes.android.media.audio.views.d.a(audioIndicator, (AudioIndicatorPresenter) this.c.x.get());
            return audioIndicator;
        }

        private AudioLayoutFooter B(AudioLayoutFooter audioLayoutFooter) {
            com.nytimes.android.media.audio.views.e.c(audioLayoutFooter, (uq7) this.a.y4.get());
            com.nytimes.android.media.audio.views.e.b(audioLayoutFooter, (ld1) this.a.n4.get());
            com.nytimes.android.media.audio.views.e.a(audioLayoutFooter, this.c.a);
            return audioLayoutFooter;
        }

        private AudioOnboardingBar C(AudioOnboardingBar audioOnboardingBar) {
            com.nytimes.android.media.audio.views.f.a(audioOnboardingBar, u());
            return audioOnboardingBar;
        }

        private BookDialogView D(BookDialogView bookDialogView) {
            com.nytimes.android.bestsellers.a.b(bookDialogView, w25.a());
            com.nytimes.android.bestsellers.a.a(bookDialogView, (jq) this.a.U6.get());
            return bookDialogView;
        }

        private BookRecyclerView E(BookRecyclerView bookRecyclerView) {
            BookRecyclerView_MembersInjector.injectBookListUpdater(bookRecyclerView, (PublishSubject) this.c.s0.get());
            BookRecyclerView_MembersInjector.injectOtherListsUpdater(bookRecyclerView, (PublishSubject) this.c.u0.get());
            BookRecyclerView_MembersInjector.injectAdapter(bookRecyclerView, v());
            BookRecyclerView_MembersInjector.injectSnackbarUtil(bookRecyclerView, (SnackbarUtil) this.c.l.get());
            return bookRecyclerView;
        }

        private CaptionsView F(CaptionsView captionsView) {
            com.nytimes.android.video.views.a.a(captionsView, (AppPreferences) this.a.v.get());
            com.nytimes.android.video.views.a.b(captionsView, (CaptionPrefManager) this.a.w6.get());
            return captionsView;
        }

        private DockView G(DockView dockView) {
            DockView_MembersInjector.injectPresenter(dockView, (DockPresenter) this.a.V6.get());
            DockView_MembersInjector.injectAppPreferences(dockView, (AppPreferences) this.a.v.get());
            return dockView;
        }

        private ExoPlayerView H(ExoPlayerView exoPlayerView) {
            com.nytimes.android.video.views.b.a(exoPlayerView, (hb5) this.c.g.get());
            return exoPlayerView;
        }

        private HybridWebView I(HybridWebView hybridWebView) {
            xd3.g(hybridWebView, (SharedPreferences) this.a.M.get());
            xd3.a(hybridWebView, T());
            xd3.e(hybridWebView, u01.a());
            xd3.f(hybridWebView, Q());
            xd3.c(hybridWebView, this.c.N());
            xd3.d(hybridWebView, x());
            xd3.b(hybridWebView, (ET2Scope) this.a.k0.get());
            return hybridWebView;
        }

        private MediaSeekBar J(MediaSeekBar mediaSeekBar) {
            com.nytimes.android.media.common.seekbar.c.a(mediaSeekBar, new MediaDurationFormatter());
            com.nytimes.android.media.common.seekbar.c.d(mediaSeekBar, P());
            com.nytimes.android.media.common.seekbar.c.c(mediaSeekBar, (bo4) this.c.h.get());
            com.nytimes.android.media.common.seekbar.c.b(mediaSeekBar, (hb5) this.c.g.get());
            return mediaSeekBar;
        }

        private SfAudioControl K(SfAudioControl sfAudioControl) {
            com.nytimes.android.media.audio.views.n.c(sfAudioControl, R());
            com.nytimes.android.media.audio.views.n.b(sfAudioControl, new MediaDurationFormatter());
            com.nytimes.android.media.audio.views.n.a(sfAudioControl, (hb5) this.c.g.get());
            com.nytimes.android.media.audio.views.n.d(sfAudioControl, (bo4) this.c.h.get());
            return sfAudioControl;
        }

        private VideoBottomActionsView L(VideoBottomActionsView videoBottomActionsView) {
            com.nytimes.android.video.views.o.a(videoBottomActionsView, w());
            return videoBottomActionsView;
        }

        private VideoControlView M(VideoControlView videoControlView) {
            com.nytimes.android.video.views.p.b(videoControlView, S());
            com.nytimes.android.video.views.p.a(videoControlView, (hb5) this.c.g.get());
            return videoControlView;
        }

        private VideoCover N(VideoCover videoCover) {
            g79.a(videoCover, qg3.a());
            return videoCover;
        }

        private VideoEndOverlay O(VideoEndOverlay videoEndOverlay) {
            s79.a(videoEndOverlay, (ho4) this.a.W6.get());
            return videoEndOverlay;
        }

        private kl4 P() {
            return new kl4((zh4) this.c.i.get(), (hb5) this.c.g.get(), (bo4) this.c.h.get());
        }

        private y15 Q() {
            return new y15((com.squareup.moshi.i) this.a.B4.get(), t01.a(), v01.a());
        }

        private ao7 R() {
            return bo7.a((zh4) this.c.i.get(), (AudioManager) this.a.G4.get(), (hb5) this.c.g.get(), (bo4) this.c.h.get(), (ax) this.a.I4.get(), (SnackbarUtil) this.c.l.get(), new MediaDurationFormatter(), (NetworkStatus) this.a.F0.get());
        }

        private u69 S() {
            return new u69(this.c.a, (zh4) this.c.i.get(), (VideoAdEvents) this.a.y6.get(), (hb5) this.c.g.get(), (FullscreenToolsController) this.c.n.get());
        }

        private qe9 T() {
            return new qe9(this.a.ab());
        }

        private fw s() {
            return new fw((zh4) this.c.i.get(), (hb5) this.c.g.get());
        }

        private ww t() {
            return new ww((AudioManager) this.a.G4.get(), (zh4) this.c.i.get(), (hb5) this.c.g.get(), (bo4) this.c.h.get());
        }

        private sy u() {
            return ty.a((AudioManager) this.a.G4.get(), (AppPreferences) this.a.v.get());
        }

        private aa0 v() {
            return new aa0((PublishSubject) this.c.t0.get());
        }

        private yb0 w() {
            return new yb0(this.c.a, (zh4) this.c.i.get(), (hb5) this.c.g.get(), (ho4) this.a.W6.get(), (CaptionPrefManager) this.a.w6.get(), (w89) this.a.J6.get(), (jh4) this.a.X6.get());
        }

        private sd3 x() {
            return new sd3((tm) this.a.U4.get());
        }

        private AudioControlView y(AudioControlView audioControlView) {
            com.nytimes.android.media.audio.views.a.b(audioControlView, s());
            com.nytimes.android.media.audio.views.a.a(audioControlView, (hb5) this.c.g.get());
            return audioControlView;
        }

        private AudioDrawer z(AudioDrawer audioDrawer) {
            com.nytimes.android.media.audio.views.c.a(audioDrawer, t());
            return audioDrawer;
        }

        @Override // defpackage.f79
        public void a(VideoCover videoCover) {
            N(videoCover);
        }

        @Override // defpackage.yw
        public void b(AudioDrawer audioDrawer) {
            z(audioDrawer);
        }

        @Override // defpackage.wd3
        public void c(HybridWebView hybridWebView) {
            I(hybridWebView);
        }

        @Override // defpackage.rn2
        public void d(FooterView footerView) {
        }

        @Override // defpackage.s90
        public void e(BookDialogView bookDialogView) {
            D(bookDialogView);
        }

        @Override // defpackage.ey
        public void f(AudioIndicator audioIndicator) {
            A(audioIndicator);
        }

        @Override // defpackage.zh0
        public void g(CaptionsView captionsView) {
            F(captionsView);
        }

        @Override // defpackage.wn4
        public void h(MediaSeekBar mediaSeekBar) {
            J(mediaSeekBar);
        }

        @Override // defpackage.jy
        public void i(AudioLayoutFooter audioLayoutFooter) {
            B(audioLayoutFooter);
        }

        @Override // com.nytimes.android.widget.BookRecyclerView_GeneratedInjector
        public void injectBookRecyclerView(BookRecyclerView bookRecyclerView) {
            E(bookRecyclerView);
        }

        @Override // com.nytimes.android.messaging.dock.DockView_GeneratedInjector
        public void injectDockView(DockView dockView) {
            G(dockView);
        }

        @Override // defpackage.z69
        public void j(VideoControlView videoControlView) {
            M(videoControlView);
        }

        @Override // defpackage.hg1
        public void k(DefaultArticleSummary defaultArticleSummary) {
        }

        @Override // defpackage.kl9
        public void l(WrappedSummaryView wrappedSummaryView) {
        }

        @Override // defpackage.vy
        public void m(AudioOnboardingBar audioOnboardingBar) {
            C(audioOnboardingBar);
        }

        @Override // defpackage.do7
        public void n(SfAudioControl sfAudioControl) {
            K(sfAudioControl);
        }

        @Override // defpackage.p72
        public void o(ExoPlayerView exoPlayerView) {
            H(exoPlayerView);
        }

        @Override // defpackage.r79
        public void p(VideoEndOverlay videoEndOverlay) {
            O(videoEndOverlay);
        }

        @Override // defpackage.i69
        public void q(VideoBottomActionsView videoBottomActionsView) {
            L(videoBottomActionsView);
        }

        @Override // defpackage.kw
        public void r(AudioControlView audioControlView) {
            y(audioControlView);
        }

        private l(j jVar, d dVar, b bVar, View view) {
            this.d = this;
            this.a = jVar;
            this.b = dVar;
            this.c = bVar;
        }
    }

    private static final class m implements ma9 {
        private final j a;
        private final d b;
        private androidx.lifecycle.n c;
        private qa9 d;

        @Override // defpackage.ma9
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public yz4 build() {
            g16.a(this.c, androidx.lifecycle.n.class);
            g16.a(this.d, qa9.class);
            return new n(this.a, this.b, new v53(), this.c, this.d);
        }

        @Override // defpackage.ma9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public m a(androidx.lifecycle.n nVar) {
            this.c = (androidx.lifecycle.n) g16.b(nVar);
            return this;
        }

        @Override // defpackage.ma9
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public m b(qa9 qa9Var) {
            this.d = (qa9) g16.b(qa9Var);
            return this;
        }

        private m(j jVar, d dVar) {
            this.a = jVar;
            this.b = dVar;
        }
    }

    private static final class n extends yz4 {
        private p76 A;
        private p76 B;
        private p76 C;
        private p76 D;
        private p76 E;
        private p76 F;
        private p76 G;
        private p76 H;
        private p76 I;
        private p76 J;
        private p76 K;
        private p76 L;
        private p76 M;
        private p76 N;
        private p76 O;
        private p76 P;
        private p76 Q;
        private p76 R;
        private p76 S;
        private p76 T;
        private p76 U;
        private p76 V;
        private p76 W;
        private p76 X;
        private p76 Y;
        private p76 Z;
        private final androidx.lifecycle.n a;
        private p76 a0;
        private final v53 b;
        private p76 b0;
        private final j c;
        private p76 c0;
        private final d d;
        private p76 d0;
        private final n e;
        private p76 e0;
        private p76 f;
        private p76 f0;
        private p76 g;
        private p76 g0;
        private p76 h;
        private p76 h0;
        private p76 i;
        private p76 i0;
        private p76 j;
        private p76 j0;
        private p76 k;
        private p76 k0;
        private p76 l;
        private p76 l0;
        private p76 m;
        private p76 m0;
        private p76 n;
        private p76 n0;
        private p76 o;
        private p76 o0;
        private p76 p;
        private p76 p0;
        private p76 q;
        private p76 q0;
        private p76 r;
        private p76 r0;
        private p76 s;
        private p76 s0;
        private p76 t;
        private p76 u;
        private p76 v;
        private p76 w;
        private p76 x;
        private p76 y;
        private p76 z;

        private static final class a implements p76 {
            private final j a;
            private final d b;
            private final n c;
            private final int d;

            /* renamed from: t61$n$a$a, reason: collision with other inner class name */
            class C0540a implements GetAllCommentsPagingSourceFactory {
                C0540a() {
                }

                @Override // com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSourceFactory
                public GetAllCommentsPagingSource create(String str, String str2) {
                    return new GetAllCommentsPagingSource((CommentsApi) a.this.a.r4.get(), (TimeStampUtil) a.this.a.w4.get(), str, str2);
                }
            }

            class b implements GetReadersPicksCommentsPagingSourceFactory {
                b() {
                }

                @Override // com.nytimes.android.comments.comments.data.remote.getreaderspicks.GetReadersPicksCommentsPagingSourceFactory
                public GetReadersPicksCommentsPagingSource create(String str) {
                    return new GetReadersPicksCommentsPagingSource((CommentsApi) a.this.a.r4.get(), (TimeStampUtil) a.this.a.w4.get(), str);
                }
            }

            class c implements GetReportersRepliesPagingSourceFactory {
                c() {
                }

                @Override // com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSourceFactory
                public GetReportersRepliesPagingSource create(String str) {
                    return new GetReportersRepliesPagingSource((CommentsApi) a.this.a.r4.get(), (TimeStampUtil) a.this.a.w4.get(), str);
                }
            }

            class d implements GetNYTPicksCommentsPagingSourceFactory {
                d() {
                }

                @Override // com.nytimes.android.comments.comments.data.remote.nytpickscomments.GetNYTPicksCommentsPagingSourceFactory
                public GetNYTPicksCommentsPagingSource create(String str) {
                    return new GetNYTPicksCommentsPagingSource((CommentsApi) a.this.a.r4.get(), (TimeStampUtil) a.this.a.w4.get(), str);
                }
            }

            class e implements ae7 {
                e() {
                }

                @Override // defpackage.ae7
                public zd7 create(String str) {
                    return new zd7(a.this.a.d9(), str);
                }
            }

            a(j jVar, d dVar, n nVar, int i) {
                this.a = jVar;
                this.b = dVar;
                this.c = nVar;
                this.d = i;
            }

            @Override // defpackage.p76
            public Object get() {
                switch (this.d) {
                    case 0:
                        return new AssetViewModel((AssetRetriever) this.a.x2.get(), this.c.Q(), this.c.a);
                    case 1:
                        return new AthleticViewModel((AppPreferences) this.a.v.get(), this.c.l0(), en.a(this.a.a), (c78) this.a.Y.get());
                    case 2:
                        return new AudioViewModel((tr3) this.a.p4.get(), (mz) this.a.Y6.get(), (DestinationEventTracker) this.a.Z6.get(), this.c.Y(), (DestinationTabState) this.a.X4.get());
                    case 3:
                        return new BestOfViewModel((DestinationTabState) this.a.X4.get(), (RibbonTabConfigRepository) this.a.a7.get());
                    case 4:
                        return new CommentsViewModel(this.c.L(), this.c.K(), (NetworkStatus) this.a.F0.get(), this.c.a, en.a(this.a.a));
                    case 5:
                        return new C0540a();
                    case 6:
                        return new b();
                    case 7:
                        return new c();
                    case 8:
                        return new d();
                    case 9:
                        return new CookingViewModel((DestinationAssetRepository) this.a.e7.get(), (tr3) this.a.p4.get(), this.c.Y(), (DestinationEventTracker) this.a.Z6.get(), this.a.g9(), (DestinationTabState) this.a.X4.get());
                    case 10:
                        return new DailyFiveViewModel((m81) this.a.z2.get(), u01.a(), (com.nytimes.android.entitlements.a) this.a.j1.get());
                    case 11:
                        return new DebugMenuViewModel((com.nytimes.android.features.games.gameshub.playtab.usecase.a) this.a.h7.get());
                    case 12:
                        return new DebugViewModel((ec1) this.a.G5.get(), (qg0) this.a.E5.get(), this.a.Na(), (yc8) this.a.H5.get());
                    case 13:
                        return new DestinationContentViewModel((DestinationEventTracker) this.a.Z6.get(), (DestinationTabState) this.a.X4.get(), (ln1) this.a.f5.get(), (RibbonTabConfigRepository) this.a.a7.get(), (cn8) this.a.M4.get(), (bn8) this.a.i7.get());
                    case 14:
                        return new DiscoverySearchViewModel((ae7) this.c.t.get(), (NetworkStatus) this.a.F0.get(), (SharedPreferences) this.a.M.get(), (RecentlyViewedManager) this.a.R3.get(), (Resources) this.a.u.get());
                    case 15:
                        return new e();
                    case 16:
                        return new DiscoverySectionViewModel((DiscoverySectionsUseCase) this.a.j7.get());
                    case 17:
                        return new ElectionsViewModel((mn1) this.a.k7.get(), (DestinationTabState) this.a.X4.get());
                    case 18:
                        return new FeedbackScreenshotViewModel(en.a(this.a.a));
                    case 19:
                        return new FeedbackViewModel(this.a.B9(), this.a.A9(), (ed2) this.a.l7.get(), (cr5) this.a.O2.get());
                    case 20:
                        return new GamesViewModel((DestinationAssetRepository) this.a.e7.get(), (tr3) this.a.p4.get(), this.c.Y(), (DestinationEventTracker) this.a.Z6.get(), this.c.P(), this.a.xa(), (DestinationTabState) this.a.X4.get(), (j91) this.a.m7.get(), (MoshiFileSystemPersister) this.a.n7.get());
                    case 21:
                        return new GiftShareHubViewModel(en.a(this.a.a), this.c.U(), (e54) this.a.k5.get(), (uq7) this.a.y4.get(), (ET2Scope) this.a.k0.get(), (z58) this.a.e0.get(), (cb2) this.a.D.get());
                    case 22:
                        return new GiftShareViewModel(this.c.V(), u01.a());
                    case 23:
                        return new GreatReadsViewModel(this.c.X(), (tr3) this.a.p4.get(), (DestinationEventTracker) this.a.Z6.get(), (DestinationTabState) this.a.X4.get());
                    case 24:
                        return new HomeViewModel((HomeUseCase) this.a.d3.get(), (vb2) this.a.g5.get(), this.c.Z(), (t93) this.b.d.get(), (z58) this.a.e0.get(), (AbraManager) this.a.Y0.get());
                    case EventType.SUBS /* 25 */:
                        return new LandingPageViewModel(this.c.a, (SharedFlow) this.a.p7.get(), (gy3) this.c.E.get(), (p60) this.a.t7.get());
                    case EventType.CDN /* 26 */:
                        return w53.a(this.c.b, this.c.a, this.c.d0());
                    case 27:
                        return new LibrariesViewModel(this.c.b0(), this.c.c0());
                    case 28:
                        return new LifestyleViewModel((DestinationAssetRepository) this.a.e7.get(), (tr3) this.a.p4.get());
                    case BuildConfig.VERSION_CODE /* 29 */:
                        return new LifestyleWebViewModel((DestinationTabState) this.a.X4.get(), (RibbonTabConfigRepository) this.a.a7.get());
                    case 30:
                        return new MainBottomNavViewModel((FeedStore) this.a.V.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (if8) this.a.i3.get(), u01.a());
                    case 31:
                        return new MainViewModel((FeedStore) this.a.V.get(), (bp0) this.a.Z0.get(), (qv6) this.a.B.get(), (AbraManager) this.a.Y0.get(), (MessageStateFactory) this.a.Q5.get(), (MessageQueueUpdater) this.a.K5.get(), (AppPreferences) this.a.v.get(), (z58) this.a.e0.get());
                    case 32:
                        return new NotificationsBannerViewModel((FeedStore) this.a.V.get(), (PushClientManager) this.a.A1.get(), (SharedPreferences) this.a.M.get(), u01.a());
                    case 33:
                        return new NotificationsViewModel((FeedStore) this.a.V.get(), (PushClientManager) this.a.A1.get(), this.c.i0(), u01.a());
                    case 34:
                        return new OnboardingNotificationsViewModel((FeedStore) this.a.V.get(), (ET2SimpleScope) this.a.k0.get(), (PushClientManager) this.a.A1.get(), this.c.i0(), (SharedPreferences) this.a.M.get(), (com.nytimes.android.onboarding.compose.b) this.a.X5.get(), u01.a());
                    case 35:
                        return new OnboardingSplashViewModel((com.nytimes.android.onboarding.compose.b) this.a.X5.get(), u01.a());
                    case 36:
                        return new OnboardingViewModel((AppPreferences) this.a.v.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (com.nytimes.android.onboarding.compose.b) this.a.X5.get(), (ET2Scope) this.a.k0.get(), u01.a());
                    case 37:
                        return new OpinionsViewModel((DestinationAssetRepository) this.a.e7.get(), (tr3) this.a.p4.get(), (DestinationEventTracker) this.a.Z6.get(), (DestinationTabState) this.a.X4.get(), (RibbonTabConfigRepository) this.a.a7.get());
                    case 38:
                        return new PaywallOverlayViewModel(this.c.Q());
                    case 39:
                        return new PaywallViewModel(this.c.a, (SharedFlow) this.a.p7.get(), (PaywallConfigRepository) this.c.S.get());
                    case 40:
                        return x53.a(this.c.b, this.c.a, this.c.e0());
                    case 41:
                        return new PlayTabViewModel(this.c.O(), (uy3) this.a.C1.get(), (ET2SimpleScope) this.a.k0.get(), this.c.j0(), (com.nytimes.android.features.games.gameshub.playtab.usecase.a) this.a.h7.get(), (NetworkStatus) this.a.F0.get());
                    case 42:
                        return new PostAuthViewModel(this.c.a, (SharedFlow) this.a.p7.get(), (PostAuthConfigRepository) this.c.V.get());
                    case 43:
                        return y53.a(this.c.b, this.c.a, this.c.f0());
                    case 44:
                        return new PostRegiLoginOfferViewModel((z58) this.a.e0.get(), (qv6) this.a.B.get(), (com.squareup.moshi.i) this.a.B4.get(), this.c.a);
                    case 45:
                        return new PrivacySettingsViewModel((NYTUser) this.a.w2.get(), (com.nytimes.android.subauth.core.purr.a) this.a.a0.get(), (t98) this.a.d5.get(), (PurrDirectiveOverrider) this.a.g0.get(), (MutableSharedFlow) this.a.b0.get(), (h55) this.a.a6.get(), u01.a(), v01.a(), t01.a());
                    case 46:
                        return new RegibundleViewModel((SharedFlow) this.a.p7.get(), (RegibundleConfigRepository) this.c.Z.get());
                    case 47:
                        return z53.a(this.c.b, this.c.g0());
                    case 48:
                        return new com.nytimes.android.messaging.regibundle.RegibundleViewModel((z58) this.a.e0.get(), u01.a(), (qv6) this.a.B.get());
                    case 49:
                        return new RegisterAccountViewModel((ET2SimpleScope) this.a.k0.get(), (com.nytimes.android.onboarding.compose.b) this.a.X5.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), u01.a());
                    case 50:
                        return new SectionFrontAdsViewModel(this.c.M(), (ET2Scope) this.a.k0.get(), (r57) this.a.F4.get(), this.a.L8(), (AppPreferences) this.a.v.get(), (AbraManager) this.a.Y0.get(), fn.a(this.a.a));
                    case 51:
                        return new SectionsViewModel((SectionsRepository) this.a.u7.get(), (DestinationEventTracker) this.a.Z6.get(), (DestinationTabState) this.a.X4.get());
                    case 52:
                        return new SettingsNotificationsViewModel(en.a(this.a.a), (FeedStore) this.a.V.get(), (ET2SimpleScope) this.a.k0.get(), (PushClientManager) this.a.A1.get(), this.c.i0(), (SharedPreferences) this.a.M.get(), u01.a(), this.c.a);
                    case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                        return new ShareSheetViewModel((com.squareup.moshi.i) this.a.B4.get(), nt1.a(this.a.H), en.a(this.a.a), u01.a(), v01.a());
                    case 54:
                        return new SingleArticleViewModel((SharedPreferences) this.a.M.get(), (AssetRetriever) this.a.x2.get(), this.c.a, (b05) this.a.K0.get(), (MessageStateFactory) this.a.Q5.get(), tu.a());
                    case 55:
                        return new SlideshowAdsViewModel(this.c.M(), (AbraManager) this.a.Y0.get(), (ET2Scope) this.a.k0.get(), fn.a(this.a.a), this.a.L8());
                    case 56:
                        return new SnackbarViewModel();
                    case 57:
                        return new SubscriptionOptionsViewModel((ET2SimpleScope) this.a.k0.get(), (com.nytimes.android.entitlements.a) this.a.j1.get(), (com.nytimes.android.onboarding.compose.b) this.a.X5.get(), (uy3) this.a.C1.get(), u01.a());
                    case 58:
                        return new TCFViewModel((com.nytimes.android.subauth.core.purr.a) this.a.a0.get(), (h55) this.a.a6.get(), (MutableSharedFlow) this.a.c0.get(), u01.a(), t01.a());
                    case 59:
                        return new TextSizeViewModel(this.a.o(), this.c.m0(), (rj8) this.a.U3.get());
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        return new TheAthleticViewModel((DestinationAssetRepository) this.a.e7.get(), (tr3) this.a.p4.get(), this.c.Y(), (DestinationEventTracker) this.a.Z6.get(), (DestinationTabState) this.a.X4.get());
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        return new TodayTabViewModel((HomeUseCase) this.a.d3.get(), (DestinationTabState) this.a.X4.get(), (bn8) this.a.i7.get());
                    case 62:
                        return new TrendingViewModel((DestinationAssetRepository) this.a.e7.get(), (tr3) this.a.p4.get());
                    case 63:
                        return new WirecutterViewModel((DestinationAssetRepository) this.a.e7.get(), (tr3) this.a.p4.get(), this.c.h0(), (DestinationEventTracker) this.a.Z6.get(), this.c.Y(), (DestinationTabState) this.a.X4.get(), (RibbonTabConfigRepository) this.a.a7.get());
                    case 64:
                        return new WriteNewCommentViewModel(this.c.p0(), (ET2Scope) this.a.k0.get(), this.c.a);
                    case 65:
                        return new YouScreenViewModel((z58) this.a.e0.get(), (cb2) this.a.D.get(), this.c.q0(), (bs3) this.a.T3.get(), (RecentlyViewedManager) this.a.R3.get(), (SavedManager) this.a.C3.get(), (tr3) this.a.p4.get(), (NetworkStatus) this.a.F0.get(), (DeepLinkManager) this.a.n3.get(), (uq7) this.a.y4.get(), (AssetDatabase) this.a.P3.get(), new sd4(), w25.a(), (TimeStampUtil) this.a.w4.get(), (InterestsManager) this.a.G2.get(), (InterestsOnboardingManager) this.a.y7.get(), (AppPreferences) this.a.v.get(), (Subauth) this.a.L.get());
                    default:
                        throw new AssertionError(this.d);
                }
            }
        }

        private t6 H() {
            return f7.a(fn.a(this.c.a));
        }

        private m7 I() {
            return e7.a((com.nytimes.android.ads.a) this.c.Q4.get(), H(), new o7(), (MutableSharedFlow) this.c.j4.get());
        }

        private fp J() {
            return new fp((jc) this.c.L0.get(), (BreakingNewsAlertManager) this.c.B1.get(), (z58) this.c.e0.get(), (jq) this.c.U6.get(), (Resources) this.c.u.get(), this.c.Sa());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CommentsAnalytics K() {
            return new CommentsAnalytics((ET2Scope) this.c.k0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CommentsRepository L() {
            return new CommentsRepository((GetAllCommentsPagingSourceFactory) this.j.get(), (GetReadersPicksCommentsPagingSourceFactory) this.k.get(), (GetReportersRepliesPagingSourceFactory) this.l.get(), (GetNYTPicksCommentsPagingSourceFactory) this.m.get(), this.c.L9(), S(), N(), k0(), T(), R());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FetchAdUseCase M() {
            return new FetchAdUseCase(I(), (bc) this.c.Z4.get());
        }

        private FlagCommentDataSource N() {
            return new FlagCommentDataSource((CommentsApi) this.c.r4.get(), u01.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GameHubAdUseCase O() {
            return new GameHubAdUseCase(M(), (AbraManager) this.c.Y0.get(), this.c.L8(), (ET2Scope) this.c.k0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public uu2 P() {
            return new uu2((qv6) this.c.B.get(), kb2.a(), (Resources) this.c.u.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public fw2 Q() {
            return new fw2((jc) this.c.L0.get(), J(), (dk0) this.c.h5.get());
        }

        private GetCommentThreadDataSource R() {
            return new GetCommentThreadDataSource((CommentsApi) this.c.r4.get(), (TimeStampUtil) this.c.w4.get(), u01.a());
        }

        private GetCurrentUserRemoteDataSource S() {
            return new GetCurrentUserRemoteDataSource((GetCurrentUserApi) this.c.b7.get(), u01.a());
        }

        private GetRepliesDataSource T() {
            return new GetRepliesDataSource((CommentsApi) this.c.r4.get(), (TimeStampUtil) this.c.w4.get(), u01.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GiftHistoryDataFetcher U() {
            return new GiftHistoryDataFetcher((ApolloClient) this.c.T1.get(), (wz2) this.c.o7.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GiftShareRemainingDataFetcher V() {
            return new GiftShareRemainingDataFetcher((ApolloClient) this.c.T1.get(), new p03());
        }

        private GreatReadsFetcher W() {
            return new GreatReadsFetcher((ApolloClient) this.c.T1.get(), new GreatReadsFetcher.c(), new GreatReadsFetcher.b(), (RibbonTabConfigRepository) this.c.a7.get(), this.c.D9(), (b05) this.c.K0.get(), (SharedPreferences) this.c.M.get(), this.c.k9());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e33 X() {
            return new e33(W());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public s63 Y() {
            return new s63((tr3) this.c.p4.get(), (DestinationEventTracker) this.c.Z6.get(), en.a(this.c.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public u93 Z() {
            return new u93((cr5) this.c.O2.get(), (AppEventFactory) this.c.X2.get(), (CoroutineScope) this.c.X.get());
        }

        private void a0(v53 v53Var, androidx.lifecycle.n nVar, qa9 qa9Var) {
            this.f = new a(this.c, this.d, this.e, 0);
            this.g = new a(this.c, this.d, this.e, 1);
            this.h = new a(this.c, this.d, this.e, 2);
            this.i = new a(this.c, this.d, this.e, 3);
            this.j = jt7.a(new a(this.c, this.d, this.e, 5));
            this.k = jt7.a(new a(this.c, this.d, this.e, 6));
            this.l = jt7.a(new a(this.c, this.d, this.e, 7));
            this.m = jt7.a(new a(this.c, this.d, this.e, 8));
            this.n = new a(this.c, this.d, this.e, 4);
            this.o = new a(this.c, this.d, this.e, 9);
            this.p = new a(this.c, this.d, this.e, 10);
            this.q = new a(this.c, this.d, this.e, 11);
            this.r = new a(this.c, this.d, this.e, 12);
            this.s = new a(this.c, this.d, this.e, 13);
            this.t = jt7.a(new a(this.c, this.d, this.e, 15));
            this.u = new a(this.c, this.d, this.e, 14);
            this.v = new a(this.c, this.d, this.e, 16);
            this.w = new a(this.c, this.d, this.e, 17);
            this.x = new a(this.c, this.d, this.e, 18);
            this.y = new a(this.c, this.d, this.e, 19);
            this.z = new a(this.c, this.d, this.e, 20);
            this.A = new a(this.c, this.d, this.e, 21);
            this.B = new a(this.c, this.d, this.e, 22);
            this.C = new a(this.c, this.d, this.e, 23);
            this.D = new a(this.c, this.d, this.e, 24);
            this.E = nt1.b(new a(this.c, this.d, this.e, 26));
            this.F = new a(this.c, this.d, this.e, 25);
            this.G = new a(this.c, this.d, this.e, 27);
            this.H = new a(this.c, this.d, this.e, 28);
            this.I = new a(this.c, this.d, this.e, 29);
            this.J = new a(this.c, this.d, this.e, 30);
            this.K = new a(this.c, this.d, this.e, 31);
            this.L = new a(this.c, this.d, this.e, 32);
            this.M = new a(this.c, this.d, this.e, 33);
            this.N = new a(this.c, this.d, this.e, 34);
            this.O = new a(this.c, this.d, this.e, 35);
            this.P = new a(this.c, this.d, this.e, 36);
            this.Q = new a(this.c, this.d, this.e, 37);
            this.R = new a(this.c, this.d, this.e, 38);
            this.S = nt1.b(new a(this.c, this.d, this.e, 40));
            this.T = new a(this.c, this.d, this.e, 39);
            this.U = new a(this.c, this.d, this.e, 41);
            this.V = nt1.b(new a(this.c, this.d, this.e, 43));
            this.W = new a(this.c, this.d, this.e, 42);
            this.X = new a(this.c, this.d, this.e, 44);
            this.Y = new a(this.c, this.d, this.e, 45);
            this.Z = nt1.b(new a(this.c, this.d, this.e, 47));
            this.a0 = new a(this.c, this.d, this.e, 46);
            this.b0 = new a(this.c, this.d, this.e, 48);
            this.c0 = new a(this.c, this.d, this.e, 49);
            this.d0 = new a(this.c, this.d, this.e, 50);
            this.e0 = new a(this.c, this.d, this.e, 51);
            this.f0 = new a(this.c, this.d, this.e, 52);
            this.g0 = new a(this.c, this.d, this.e, 53);
            this.h0 = new a(this.c, this.d, this.e, 54);
            this.i0 = new a(this.c, this.d, this.e, 55);
            this.j0 = new a(this.c, this.d, this.e, 56);
            this.k0 = new a(this.c, this.d, this.e, 57);
            this.l0 = new a(this.c, this.d, this.e, 58);
            this.m0 = new a(this.c, this.d, this.e, 59);
            this.n0 = new a(this.c, this.d, this.e, 60);
            this.o0 = new a(this.c, this.d, this.e, 61);
            this.p0 = new a(this.c, this.d, this.e, 62);
            this.q0 = new a(this.c, this.d, this.e, 63);
            this.r0 = new a(this.c, this.d, this.e, 64);
            this.s0 = new a(this.c, this.d, this.e, 65);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public n34 b0() {
            return new n34(en.a(this.c.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public o34 c0() {
            return new o34(kb2.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map d0() {
            return ImmutableMap.s(DataConfigId.Games, this.c.Jb(), DataConfigId.PlayTab, this.c.Kb(), DataConfigId.AllAccess, this.c.Hb(), DataConfigId.AllAccessLandingPageAsPaywall, this.c.Ib());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map e0() {
            return ImmutableMap.r(DataConfigId.AllAccessPaywall, this.c.Cb(), DataConfigId.WordlebotPaywall, this.c.Mb());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map f0() {
            return ImmutableMap.s(DataConfigId.GamesPostLogin, this.c.Fb(), DataConfigId.GamesPostRegistration, this.c.Gb(), DataConfigId.AllAccessPostLogin, this.c.Db(), DataConfigId.AllAccessPostRegistration, this.c.Eb());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map g0() {
            return ImmutableMap.q(DataConfigId.Regibundle, this.c.Lb());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NewsletterSubscriptionMutator h0() {
            return new NewsletterSubscriptionMutator((ApolloClient) this.c.T1.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public la5 i0() {
            return new la5((PushClientManager) this.c.A1.get(), en.a(this.c.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ev5 j0() {
            return new ev5((ET2Scope) this.c.k0.get());
        }

        private RecommendCommentDataSource k0() {
            return new RecommendCommentDataSource((CommentsApi) this.c.r4.get(), u01.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public we8 l0() {
            return new we8((ET2SimpleScope) this.c.k0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public wj8 m0() {
            return new wj8((ET2SimpleScope) this.c.k0.get());
        }

        private WriteNewCommentPreferencesDataStore n0() {
            return new WriteNewCommentPreferencesDataStore((ba1) this.c.v7.get());
        }

        private WriteNewCommentRemoteDataSource o0() {
            return new WriteNewCommentRemoteDataSource((WriteNewCommentApi) this.c.x7.get(), en.a(this.c.a), u01.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public WriteNewCommentRepository p0() {
            return new WriteNewCommentRepository(n0(), (DraftCommentDatabase) this.c.w7.get(), o0(), S());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public YouEventSender q0() {
            return new YouEventSender((ET2Scope) this.c.k0.get());
        }

        @Override // g83.d
        public Map a() {
            return ImmutableMap.c(57).f("com.nytimes.android.fragment.AssetViewModel", this.f).f("com.nytimes.android.theathletic.AthleticViewModel", this.g).f("com.nytimes.android.ribbon.destinations.audio.AudioViewModel", this.h).f("com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel", this.i).f("com.nytimes.android.comments.comments.mvi.CommentsViewModel", this.n).f("com.nytimes.android.ribbon.destinations.cooking.CookingViewModel", this.o).f("com.nytimes.android.dailyfive.ui.DailyFiveViewModel", this.p).f("com.nytimes.android.features.games.gameshub.playtab.debug.DebugMenuViewModel", this.q).f("com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel", this.r).f("com.nytimes.android.ribbon.DestinationContentViewModel", this.s).f("com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel", this.u).f("com.nytimes.android.features.discovery.discoverytab.DiscoverySectionViewModel", this.v).f("com.nytimes.android.ribbon.destinations.elections.ElectionsViewModel", this.w).f("com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel", this.x).f("com.nytimes.android.feedback.FeedbackViewModel", this.y).f("com.nytimes.android.ribbon.destinations.games.GamesViewModel", this.z).f("com.nytimes.android.features.giftsharehub.GiftShareHubViewModel", this.A).f("com.nytimes.android.link.share.GiftShareViewModel", this.B).f("com.nytimes.android.ribbon.destinations.greatreads.GreatReadsViewModel", this.C).f("com.nytimes.android.features.home.ui.HomeViewModel", this.D).f("com.nytimes.android.growthui.landingpage.LandingPageViewModel", this.F).f("com.nytimes.android.features.settings.legal.LibrariesViewModel", this.G).f("com.nytimes.android.ribbon.destinations.lifestyle.appnative.LifestyleViewModel", this.H).f("com.nytimes.android.ribbon.destinations.lifestyle.LifestyleWebViewModel", this.I).f("com.nytimes.android.mainactivity.MainBottomNavViewModel", this.J).f("com.nytimes.android.MainViewModel", this.K).f("com.nytimes.android.mainactivity.banner.NotificationsBannerViewModel", this.L).f("com.nytimes.android.features.settings.push.NotificationsViewModel", this.M).f("com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel", this.N).f("com.nytimes.android.onboarding.compose.splash.OnboardingSplashViewModel", this.O).f("com.nytimes.android.onboarding.compose.OnboardingViewModel", this.P).f("com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel", this.Q).f("com.nytimes.android.fragment.gateway.PaywallOverlayViewModel", this.R).f("com.nytimes.android.growthui.paywall.PaywallViewModel", this.T).f("com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel", this.U).f("com.nytimes.android.growthui.postauth.PostAuthViewModel", this.W).f("com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferViewModel", this.X).f("com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel", this.Y).f("com.nytimes.android.growthui.regibundle.RegibundleViewModel", this.a0).f("com.nytimes.android.messaging.regibundle.RegibundleViewModel", this.b0).f("com.nytimes.android.onboarding.compose.register.RegisterAccountViewModel", this.c0).f("com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel", this.d0).f("com.nytimes.android.ribbon.destinations.more.SectionsViewModel", this.e0).f("com.nytimes.android.features.notifications.push.SettingsNotificationsViewModel", this.f0).f("com.nytimes.android.share.sheet.ShareSheetViewModel", this.g0).f("com.nytimes.android.SingleArticleViewModel", this.h0).f("com.nytimes.android.ads.slideshow.SlideshowAdsViewModel", this.i0).f("com.nytimes.android.utils.snackbar.SnackbarViewModel", this.j0).f("com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsViewModel", this.k0).f("com.nytimes.subauth.ui.purr.tcf.TCFViewModel", this.l0).f("com.nytimes.android.textsize.TextSizeViewModel", this.m0).f("com.nytimes.android.ribbon.destinations.theathletic.TheAthleticViewModel", this.n0).f("com.nytimes.android.features.home.ui.today.TodayTabViewModel", this.o0).f("com.nytimes.android.ribbon.destinations.trending.TrendingViewModel", this.p0).f("com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel", this.q0).f("com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel", this.r0).f("com.nytimes.android.features.you.youtab.YouScreenViewModel", this.s0).a();
        }

        @Override // g83.d
        public Map b() {
            return ImmutableMap.o();
        }

        private n(j jVar, d dVar, v53 v53Var, androidx.lifecycle.n nVar, qa9 qa9Var) {
            this.e = this;
            this.c = jVar;
            this.d = dVar;
            this.a = nVar;
            this.b = v53Var;
            a0(v53Var, nVar, qa9Var);
        }
    }

    private static final class o implements zb9 {
        private final j a;
        private final d b;
        private final b c;
        private final g d;
        private View e;

        @Override // defpackage.zb9
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public zz4 build() {
            g16.a(this.e, View.class);
            return new p(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.zb9
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o view(View view) {
            this.e = (View) g16.b(view);
            return this;
        }

        private o(j jVar, d dVar, b bVar, g gVar) {
            this.a = jVar;
            this.b = dVar;
            this.c = bVar;
            this.d = gVar;
        }
    }

    private static final class p extends zz4 {
        private final j a;
        private final d b;
        private final b c;
        private final g d;
        private final p e;

        private ComposeViewWithFragment c(ComposeViewWithFragment composeViewWithFragment) {
            ls0.a(composeViewWithFragment, this.d.a);
            return composeViewWithFragment;
        }

        private InlineVideoView d(InlineVideoView inlineVideoView) {
            sk3.a(inlineVideoView, g());
            return inlineVideoView;
        }

        private ek3 e() {
            return new ek3(this.c.T1(), (w89) this.a.J6.get());
        }

        private InlineVideoPresenter f() {
            return new InlineVideoPresenter((zh4) this.c.i.get(), (SnackbarUtil) this.c.l.get(), (NetworkStatus) this.a.F0.get(), (hb5) this.c.g.get(), (RecentlyViewedManager) this.a.R3.get(), (bo4) this.c.h.get(), (g69) this.c.F0.get(), e());
        }

        private com.nytimes.android.video.views.h g() {
            return new com.nytimes.android.video.views.h(f(), (z4) this.c.j.get(), (hb5) this.c.g.get(), (bo4) this.c.h.get(), (FullscreenToolsController) this.c.n.get(), (cv) this.c.G0.get(), new qk3());
        }

        @Override // defpackage.ks0
        public void a(ComposeViewWithFragment composeViewWithFragment) {
            c(composeViewWithFragment);
        }

        @Override // defpackage.rk3
        public void b(InlineVideoView inlineVideoView) {
            d(inlineVideoView);
        }

        private p(j jVar, d dVar, b bVar, g gVar, View view) {
            this.e = this;
            this.a = jVar;
            this.b = dVar;
            this.c = bVar;
            this.d = gVar;
        }
    }

    public static e a() {
        return new e();
    }
}
