package org.jsoup;

import java.io.IOException;

/* loaded from: classes5.dex */
public class HttpStatusException extends IOException {
    private int statusCode;
    private String url;

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Status=" + this.statusCode + ", URL=" + this.url;
    }
}
