package zendesk.support;

import java.util.UUID;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public class GuideModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final HelpCenterBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;
    private final HelpCenterTracker helpCenterTracker;
    private final UUID id = UUID.randomUUID();
    private final OkHttpClient okHttpClient;
    private final HelpCenterSettingsProvider settingsProvider;

    public GuideModule(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, HelpCenterTracker helpCenterTracker, ArticleVoteStorage articleVoteStorage, OkHttpClient okHttpClient) {
        this.helpCenterProvider = helpCenterProvider;
        this.settingsProvider = helpCenterSettingsProvider;
        this.blipsProvider = helpCenterBlipsProvider;
        this.helpCenterTracker = helpCenterTracker;
        this.articleVoteStorage = articleVoteStorage;
        this.okHttpClient = okHttpClient;
    }

    ArticleVoteStorage providesArticleVoteStorage() {
        return this.articleVoteStorage;
    }

    HelpCenterProvider providesHelpCenterProvider() {
        return this.helpCenterProvider;
    }
}
