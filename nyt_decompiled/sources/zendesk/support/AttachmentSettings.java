package zendesk.support;

/* loaded from: classes5.dex */
class AttachmentSettings {
    private static AttachmentSettings DEFAULT = new AttachmentSettings(false, 0);
    private boolean enabled;
    private long maxAttachmentSize;

    AttachmentSettings(boolean z, long j) {
        this.enabled = z;
        this.maxAttachmentSize = j;
    }

    static AttachmentSettings defaultSettings() {
        return DEFAULT;
    }

    long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    boolean isEnabled() {
        return this.enabled;
    }
}
