package zendesk.core;

import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
class Attachment {
    private String contentType;
    private String contentUrl;
    private String fileName;
    private Long id;
    private String mappedContentUrl;
    private Long size;
    private List<Attachment> thumbnails;
    private String url;

    Attachment() {
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getId() {
        return this.id;
    }

    public Long getSize() {
        return this.size;
    }

    public List<Attachment> getThumbnails() {
        return mn0.b(this.thumbnails);
    }

    public String getUrl() {
        return this.url;
    }
}
