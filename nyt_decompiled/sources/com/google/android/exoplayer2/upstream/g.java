package com.google.android.exoplayer2.upstream;

import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.h;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes2.dex */
public class g implements h {
    private final int a;

    public g() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.h
    public long a(h.c cVar) {
        IOException iOException = cVar.c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.d - 1) * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, CrashReportManager.TIME_WINDOW);
    }

    @Override // com.google.android.exoplayer2.upstream.h
    public int b(int i) {
        int i2 = this.a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // com.google.android.exoplayer2.upstream.h
    public h.b c(h.a aVar, h.c cVar) {
        if (!e(cVar.c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new h.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new h.b(2, 60000L);
        }
        return null;
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    public g(int i) {
        this.a = i;
    }
}
