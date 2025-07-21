package zendesk.support;

import com.google.gson.annotations.SerializedName;
import zendesk.core.Settings;

/* loaded from: classes5.dex */
public class HelpCenterSettings implements Settings {
    private static HelpCenterSettings DEFAULT = new HelpCenterSettings();

    @SerializedName("help_center_article_voting_enabled")
    private boolean articleVotingEnabled;
    private boolean enabled;
    private String locale;

    HelpCenterSettings(boolean z, boolean z2, String str) {
        this.enabled = z;
        this.articleVotingEnabled = z2;
        this.locale = str;
    }

    static HelpCenterSettings defaultSettings() {
        return DEFAULT;
    }

    public String getLocale() {
        return this.locale;
    }

    public boolean isArticleVotingEnabled() {
        return this.articleVotingEnabled;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    HelpCenterSettings() {
    }
}
