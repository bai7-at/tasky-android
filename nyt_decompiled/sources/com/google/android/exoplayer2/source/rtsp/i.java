package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.u;
import defpackage.z19;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
final class i {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public i(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    private String b(u.a aVar) {
        return z19.D("Basic %s", Base64.encodeToString(u.d(aVar.a + ":" + aVar.b), 0));
    }

    private String c(u.a aVar, Uri uri, int i) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String t = u.t(i);
            String c1 = z19.c1(messageDigest.digest(u.d(aVar.a + ":" + this.b + ":" + aVar.b)));
            StringBuilder sb = new StringBuilder();
            sb.append(t);
            sb.append(":");
            sb.append(uri);
            String c12 = z19.c1(messageDigest.digest(u.d(c1 + ":" + this.c + ":" + z19.c1(messageDigest.digest(u.d(sb.toString()))))));
            return this.d.isEmpty() ? z19.D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.a, this.b, this.c, uri, c12) : z19.D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.a, this.b, this.c, uri, c12, this.d);
        } catch (NoSuchAlgorithmException e) {
            throw ParserException.d(null, e);
        }
    }

    public String a(u.a aVar, Uri uri, int i) {
        int i2 = this.a;
        if (i2 == 1) {
            return b(aVar);
        }
        if (i2 == 2) {
            return c(aVar, uri, i);
        }
        throw ParserException.d(null, new UnsupportedOperationException());
    }
}
