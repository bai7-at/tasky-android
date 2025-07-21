package com.amazonaws.http;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class HttpResponse {
    private InputStream content;
    private final Map<String, String> headers;
    private final InputStream rawContent;
    private final int statusCode;
    private final String statusText;

    public static class Builder {
        private InputStream content;
        private final Map<String, String> headers = new HashMap();
        private int statusCode;
        private String statusText;

        public HttpResponse build() {
            return new HttpResponse(this.statusText, this.statusCode, Collections.unmodifiableMap(this.headers), this.content);
        }

        public Builder content(InputStream inputStream) {
            this.content = inputStream;
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.put(str, str2);
            return this;
        }

        public Builder statusCode(int i) {
            this.statusCode = i;
            return this;
        }

        public Builder statusText(String str) {
            this.statusText = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public InputStream getContent() throws IOException {
        if (this.content == null) {
            synchronized (this) {
                try {
                    if (this.rawContent == null || !EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP.equals(this.headers.get("Content-Encoding"))) {
                        this.content = this.rawContent;
                    } else {
                        this.content = new GZIPInputStream(this.rawContent);
                    }
                } finally {
                }
            }
        }
        return this.content;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public InputStream getRawContent() throws IOException {
        return this.rawContent;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusText() {
        return this.statusText;
    }

    private HttpResponse(String str, int i, Map<String, String> map, InputStream inputStream) {
        this.statusText = str;
        this.statusCode = i;
        this.headers = map;
        this.rawContent = inputStream;
    }
}
