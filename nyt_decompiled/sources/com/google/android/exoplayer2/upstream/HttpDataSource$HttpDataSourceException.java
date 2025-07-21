package com.google.android.exoplayer2.upstream;

import com.comscore.streaming.ContentMediaFormat;
import defpackage.tr;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final b dataSpec;

    /* renamed from: type, reason: collision with root package name */
    public final int f47type;

    public HttpDataSource$HttpDataSourceException(b bVar, int i, int i2) {
        super(b(i, i2));
        this.dataSpec = bVar;
        this.f47type = i2;
    }

    private static int b(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final b bVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ContentMediaFormat.PARTIAL_CONTENT_GENERIC : (message == null || !tr.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, bVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, bVar, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, b bVar, int i, int i2) {
        super(str, b(i, i2));
        this.dataSpec = bVar;
        this.f47type = i2;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, b bVar, int i, int i2) {
        super(iOException, b(i, i2));
        this.dataSpec = bVar;
        this.f47type = i2;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, b bVar, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.dataSpec = bVar;
        this.f47type = i2;
    }
}
