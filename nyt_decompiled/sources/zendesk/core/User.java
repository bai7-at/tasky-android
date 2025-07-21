package zendesk.core;

import defpackage.mn0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class User {
    private final Long id = -1L;
    private final String name = "";
    private final Attachment photo = null;
    private final boolean agent = false;
    private final List<String> tags = new ArrayList();
    private final Map<String, String> userFields = new HashMap();

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoto() {
        Attachment attachment = this.photo;
        if (attachment == null) {
            return null;
        }
        return attachment.getContentUrl();
    }

    public List<String> getTags() {
        return mn0.b(this.tags);
    }

    public Map<String, String> getUserFields() {
        return mn0.c(this.userFields);
    }

    public boolean isAgent() {
        return this.agent;
    }
}
