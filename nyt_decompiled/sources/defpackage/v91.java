package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.b;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public final class v91 extends d50 {
    private b e;
    private byte[] f;
    private int g;
    private int h;

    public v91() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) {
        u(bVar);
        this.e = bVar;
        Uri normalizeScheme = bVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        ur.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] V0 = z19.V0(normalizeScheme.getSchemeSpecificPart(), ",");
        if (V0.length != 2) {
            throw ParserException.b("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = V0[1];
        if (V0[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw ParserException.b("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f = z19.o0(URLDecoder.decode(str, zj0.a.name()));
        }
        long j = bVar.g;
        byte[] bArr = this.f;
        if (j > bArr.length) {
            this.f = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j;
        this.g = i;
        int length = bArr.length - i;
        this.h = length;
        long j2 = bVar.h;
        if (j2 != -1) {
            this.h = (int) Math.min(length, j2);
        }
        v(bVar);
        long j3 = bVar.h;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        if (this.f != null) {
            this.f = null;
            t();
        }
        this.e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(z19.j(this.f), this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        s(min);
        return min;
    }
}
