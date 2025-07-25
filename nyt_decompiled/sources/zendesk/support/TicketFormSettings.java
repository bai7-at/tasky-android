package zendesk.support;

/* loaded from: classes5.dex */
public class TicketFormSettings {
    private static TicketFormSettings DEFAULT = new TicketFormSettings(false);
    private boolean available;

    TicketFormSettings(boolean z) {
        this.available = z;
    }

    static TicketFormSettings defaultSettings() {
        return DEFAULT;
    }

    public boolean isAvailable() {
        return this.available;
    }
}
