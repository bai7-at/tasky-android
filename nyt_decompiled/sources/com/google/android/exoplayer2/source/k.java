package com.google.android.exoplayer2.source;

import android.net.Uri;
import defpackage.sq8;
import defpackage.ur;
import defpackage.yo5;
import java.util.Map;

/* loaded from: classes2.dex */
final class k implements com.google.android.exoplayer2.upstream.a {
    private final com.google.android.exoplayer2.upstream.a a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    public interface a {
        void b(yo5 yo5Var);
    }

    public k(com.google.android.exoplayer2.upstream.a aVar, int i, a aVar2) {
        ur.a(i > 0);
        this.a = aVar;
        this.b = i;
        this.c = aVar2;
        this.d = new byte[1];
        this.e = i;
    }

    private boolean k() {
        if (this.a.read(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.b(new yo5(bArr, i));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map f() {
        return this.a.f();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void i(sq8 sq8Var) {
        ur.e(sq8Var);
        this.a.i(sq8Var);
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        if (this.e == 0) {
            if (!k()) {
                return -1;
            }
            this.e = this.b;
        }
        int read = this.a.read(bArr, i, Math.min(this.e, i2));
        if (read != -1) {
            this.e -= read;
        }
        return read;
    }
}
