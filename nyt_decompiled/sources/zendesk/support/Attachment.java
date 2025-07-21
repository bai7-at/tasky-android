package zendesk.support;

import defpackage.mn0;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public class Attachment implements Serializable {
    private String contentType;
    private String contentUrl;
    private String fileName;
    private Long height;
    private Long id;
    private String mappedContentUrl;
    private Long size;
    private List<Attachment> thumbnails;
    private String url;
    private Long width;

    public String getContentType() {
        return this.contentType;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getHeight() {
        return this.height;
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

    public Long getWidth() {
        return this.width;
    }
}
