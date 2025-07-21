package zendesk.core;

/* loaded from: classes5.dex */
public final class ActionDescription {
    private final int icon;
    private final String localizedAccessibilityLabel;
    private final String localizedLabel;

    public ActionDescription(String str, String str2, int i) {
        this.localizedLabel = str;
        this.localizedAccessibilityLabel = str2;
        this.icon = i;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getLocalizedAccessibilityLabel() {
        return this.localizedAccessibilityLabel;
    }

    public String getLocalizedLabel() {
        return this.localizedLabel;
    }
}
