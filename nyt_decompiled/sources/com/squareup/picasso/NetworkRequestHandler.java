package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.r;
import defpackage.au1;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
class NetworkRequestHandler extends r {
    private final au1 a;
    private final t b;

    static class ContentLengthException extends IOException {
        ContentLengthException(String str) {
            super(str);
        }
    }

    static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        ResponseException(int i, int i2) {
            super("HTTP " + i);
            this.code = i;
            this.networkPolicy = i2;
        }
    }

    NetworkRequestHandler(au1 au1Var, t tVar) {
        this.a = au1Var;
        this.b = tVar;
    }

    private static Request j(p pVar, int i) {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (NetworkPolicy.isOfflineOnly(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(pVar.d.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    @Override // com.squareup.picasso.r
    public boolean c(p pVar) {
        String scheme = pVar.d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.r
    int e() {
        return 2;
    }

    @Override // com.squareup.picasso.r
    public r.a f(p pVar, int i) {
        Response a = this.a.a(j(pVar, i));
        ResponseBody body = a.body();
        if (!a.isSuccessful()) {
            body.close();
            throw new ResponseException(a.code(), pVar.c);
        }
        Picasso.LoadedFrom loadedFrom = a.cacheResponse() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && body.contentLength() == 0) {
            body.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && body.contentLength() > 0) {
            this.b.f(body.contentLength());
        }
        return new r.a(body.source(), loadedFrom);
    }

    @Override // com.squareup.picasso.r
    boolean h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.r
    boolean i() {
        return true;
    }
}
