package zendesk.support;

import zendesk.core.Settings;

/* loaded from: classes5.dex */
class SupportSettings implements Settings {
    private static SupportSettings DEFAULT = new SupportSettings(ConversationsSettings.defaultSettings(), ContactUsSettings.defaultSettings(), AttachmentSettings.defaultSettings(), TicketFormSettings.defaultSettings(), true, true, false, "", "");
    private final AttachmentSettings attachments;
    private final ContactUsSettings contactUs;
    private final ConversationsSettings conversations;
    private final boolean neverRequestEmail;
    private final String referrerUrl;
    private final boolean showClosedRequests;
    private final boolean showReferrerLogo;
    private final String systemMessage;
    private final TicketFormSettings ticketForms;

    SupportSettings(ConversationsSettings conversationsSettings, ContactUsSettings contactUsSettings, AttachmentSettings attachmentSettings, TicketFormSettings ticketFormSettings, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.conversations = conversationsSettings;
        this.contactUs = contactUsSettings;
        this.attachments = attachmentSettings;
        this.ticketForms = ticketFormSettings;
        this.neverRequestEmail = z;
        this.showClosedRequests = z2;
        this.showReferrerLogo = z3;
        this.referrerUrl = str;
        this.systemMessage = str2;
    }

    static SupportSettings defaultSettings() {
        return DEFAULT;
    }

    AttachmentSettings getAttachments() {
        return this.attachments;
    }

    ContactUsSettings getContactUs() {
        return this.contactUs;
    }

    ConversationsSettings getConversations() {
        return this.conversations;
    }

    String getReferrerUrl() {
        return this.referrerUrl;
    }

    String getSystemMessage() {
        return this.systemMessage;
    }

    TicketFormSettings getTicketForms() {
        return this.ticketForms;
    }

    boolean isNeverRequestEmailOn() {
        return this.neverRequestEmail;
    }

    boolean isShowClosedRequests() {
        return this.showClosedRequests;
    }

    boolean isShowReferrerLogo() {
        return this.showReferrerLogo;
    }
}
