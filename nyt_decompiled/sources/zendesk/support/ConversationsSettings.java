package zendesk.support;

/* loaded from: classes5.dex */
class ConversationsSettings {
    private static ConversationsSettings DEFAULT = new ConversationsSettings(false);
    private boolean enabled;

    ConversationsSettings(boolean z) {
        this.enabled = z;
    }

    static ConversationsSettings defaultSettings() {
        return DEFAULT;
    }

    boolean isEnabled() {
        return this.enabled;
    }
}
