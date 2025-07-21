package zendesk.support;

import java.util.Date;

/* loaded from: classes5.dex */
public class UploadResponse {
    private Attachment attachment;
    private Date expiresAt;
    private String token;

    public Attachment getAttachment() {
        return this.attachment;
    }

    public Date getExpiresAt() {
        if (this.expiresAt == null) {
            return null;
        }
        return new Date(this.expiresAt.getTime());
    }

    public String getToken() {
        return this.token;
    }
}
