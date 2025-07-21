package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class HttpRequest {
    private final InputStream content;
    private final Map<String, String> headers;
    private boolean isStreaming;
    private final String method;
    private URI uri;

    public HttpRequest(String str, URI uri) {
        this(str, uri, null, null);
    }

    public InputStream getContent() {
        return this.content;
    }

    public long getContentLength() {
        String str;
        Map<String, String> map = this.headers;
        if (map == null || (str = map.get("Content-Length")) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public URI getUri() {
        return this.uri;
    }

    public boolean isStreaming() {
        return this.isStreaming;
    }

    public void setStreaming(boolean z) {
        this.isStreaming = z;
    }

    void setUri(URI uri) {
        this.uri = uri;
    }

    public HttpRequest(String str, URI uri, Map<String, String> map, InputStream inputStream) {
        this.method = StringUtils.upperCase(str);
        this.uri = uri;
        this.headers = map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(map);
        this.content = inputStream;
    }
}
