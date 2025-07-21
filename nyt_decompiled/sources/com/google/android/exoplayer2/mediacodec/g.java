package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.t0;
import defpackage.a84;
import defpackage.ur;
import defpackage.vw4;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class g {
    private long a;
    private long b;
    private boolean c;

    g() {
    }

    private long a(long j) {
        return this.a + Math.max(0L, ((this.b - 529) * 1000000) / j);
    }

    public long b(t0 t0Var) {
        return a(t0Var.N);
    }

    public void c() {
        this.a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public long d(t0 t0Var, DecoderInputBuffer decoderInputBuffer) {
        if (this.b == 0) {
            this.a = decoderInputBuffer.e;
        }
        if (this.c) {
            return decoderInputBuffer.e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ur.e(decoderInputBuffer.c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int m = vw4.m(i);
        if (m != -1) {
            long a = a(t0Var.N);
            this.b += m;
            return a;
        }
        this.c = true;
        this.b = 0L;
        this.a = decoderInputBuffer.e;
        a84.j("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return decoderInputBuffer.e;
    }
}
