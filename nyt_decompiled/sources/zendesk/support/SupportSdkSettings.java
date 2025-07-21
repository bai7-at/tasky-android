package zendesk.support;

import defpackage.mn0;
import defpackage.r48;
import java.util.ArrayList;
import java.util.List;
import zendesk.core.AuthenticationType;

/* loaded from: classes5.dex */
public class SupportSdkSettings {
    private final AuthenticationType authenticationType;
    private final HelpCenterSettings helpCenterSettings;
    private final SupportSettings mobileSettings;

    public SupportSdkSettings(SupportSettings supportSettings, HelpCenterSettings helpCenterSettings, AuthenticationType authenticationType) {
        this.mobileSettings = supportSettings;
        this.helpCenterSettings = helpCenterSettings;
        this.authenticationType = authenticationType;
    }

    private AttachmentSettings getAttachmentSettings() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || supportSettings.getAttachments() == null) {
            return null;
        }
        return this.mobileSettings.getAttachments();
    }

    private ConversationsSettings getConversationsSettings() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || supportSettings.getConversations() == null) {
            return null;
        }
        return this.mobileSettings.getConversations();
    }

    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    public List<String> getContactZendeskTags() {
        SupportSettings supportSettings = this.mobileSettings;
        return (supportSettings == null || supportSettings.getContactUs() == null || !mn0.h(this.mobileSettings.getContactUs().getTags())) ? new ArrayList() : this.mobileSettings.getContactUs().getTags();
    }

    public String getHelpCenterLocale() {
        HelpCenterSettings helpCenterSettings = this.helpCenterSettings;
        return (helpCenterSettings == null || helpCenterSettings.getLocale() == null) ? "" : this.helpCenterSettings.getLocale();
    }

    public long getMaxAttachmentSize() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null) {
            return attachmentSettings.getMaxAttachmentSize();
        }
        return 0L;
    }

    public String getReferrerUrl() {
        SupportSettings supportSettings = this.mobileSettings;
        return (supportSettings == null || !r48.b(supportSettings.getReferrerUrl())) ? "https://www.zendesk.com/embeddables" : this.mobileSettings.getReferrerUrl();
    }

    public String getRequestSystemMessage() {
        SupportSettings supportSettings = this.mobileSettings;
        return (supportSettings == null || !r48.b(supportSettings.getSystemMessage())) ? "" : this.mobileSettings.getSystemMessage();
    }

    public boolean hasHelpCenterSettings() {
        return this.helpCenterSettings != null;
    }

    public boolean isAttachmentsEnabled() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        return attachmentSettings != null && attachmentSettings.isEnabled();
    }

    public boolean isConversationsEnabled() {
        ConversationsSettings conversationsSettings = getConversationsSettings();
        return conversationsSettings != null && conversationsSettings.isEnabled();
    }

    public boolean isHelpCenterArticleVotingEnabled() {
        return hasHelpCenterSettings() && this.helpCenterSettings.isArticleVotingEnabled();
    }

    public boolean isHelpCenterEnabled() {
        HelpCenterSettings helpCenterSettings = this.helpCenterSettings;
        return helpCenterSettings != null && helpCenterSettings.isEnabled();
    }

    public boolean isNeverAskForEmailEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings == null || supportSettings.isNeverRequestEmailOn();
    }

    public boolean isShowClosedRequests() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings == null || supportSettings.isShowClosedRequests();
    }

    public boolean isShowReferrerLogoEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings != null && supportSettings.isShowReferrerLogo();
    }

    public boolean isTicketFormSupportAvailable() {
        SupportSettings supportSettings = this.mobileSettings;
        return (supportSettings == null || supportSettings.getTicketForms() == null || !this.mobileSettings.getTicketForms().isAvailable()) ? false : true;
    }
}
