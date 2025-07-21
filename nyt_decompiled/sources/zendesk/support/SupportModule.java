package zendesk.support;

import java.util.UUID;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public class SupportModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final SupportBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;
    private final UUID id = UUID.randomUUID();
    private final OkHttpClient okHttpClient;
    private final RequestProvider requestProvider;
    private final SupportSettingsProvider settingsProvider;
    private final UploadProvider uploadProvider;
    private final ZendeskTracker zendeskTracker;

    public SupportModule(RequestProvider requestProvider, UploadProvider uploadProvider, HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, OkHttpClient okHttpClient, ZendeskTracker zendeskTracker, ArticleVoteStorage articleVoteStorage) {
        this.requestProvider = requestProvider;
        this.uploadProvider = uploadProvider;
        this.helpCenterProvider = helpCenterProvider;
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.okHttpClient = okHttpClient;
        this.zendeskTracker = zendeskTracker;
        this.articleVoteStorage = articleVoteStorage;
    }
}
