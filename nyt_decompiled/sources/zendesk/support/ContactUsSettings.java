package zendesk.support;

import defpackage.mn0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
class ContactUsSettings {
    private static ContactUsSettings DEFAULT = new ContactUsSettings(Collections.emptyList());
    private List<String> tags;

    ContactUsSettings(List<String> list) {
        this.tags = list;
    }

    static ContactUsSettings defaultSettings() {
        return DEFAULT;
    }

    public List<String> getTags() {
        return mn0.b(this.tags);
    }
}
