package zendesk.support;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class User implements Serializable {
    private boolean agent;
    private Long id;
    private String name;
    private Long organizationId;
    private Attachment photo;
    private List<String> tags;
    private Map<String, String> userFields;

    public User(Long l, String str, Attachment attachment, boolean z, Long l2, List<String> list, Map<String, String> map) {
        this.id = l;
        this.name = str;
        this.photo = attachment;
        this.agent = z;
        this.organizationId = l2;
        this.tags = list;
        this.userFields = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (this.agent != user.agent) {
            return false;
        }
        Long l = this.id;
        if (l == null ? user.id != null : !l.equals(user.id)) {
            return false;
        }
        Attachment attachment = this.photo;
        if (attachment == null ? user.photo != null : !attachment.equals(user.photo)) {
            return false;
        }
        Long l2 = this.organizationId;
        if (l2 == null ? user.organizationId != null : !l2.equals(user.organizationId)) {
            return false;
        }
        List<String> list = this.tags;
        if (list == null ? user.tags != null : !list.equals(user.tags)) {
            return false;
        }
        Map<String, String> map = this.userFields;
        return map != null ? map.equals(user.userFields) : user.userFields == null;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Attachment getPhoto() {
        return this.photo;
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Attachment attachment = this.photo;
        int hashCode2 = (((hashCode + (attachment != null ? attachment.hashCode() : 0)) * 31) + (this.agent ? 1 : 0)) * 31;
        Long l2 = this.organizationId;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        List<String> list = this.tags;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, String> map = this.userFields;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }
}
