package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.t0;
import defpackage.d52;
import defpackage.ep2;
import defpackage.j42;
import defpackage.y77;
import defpackage.z19;

/* loaded from: classes2.dex */
final class d implements y77 {
    private final t0 a;
    private long[] c;
    private boolean d;
    private d52 e;
    private boolean f;
    private int g;
    private final j42 b = new j42();
    private long h = -9223372036854775807L;

    public d(d52 d52Var, t0 t0Var, boolean z) {
        this.a = t0Var;
        this.e = d52Var;
        this.c = d52Var.b;
        d(d52Var, z);
    }

    @Override // defpackage.y77
    public void a() {
    }

    public String b() {
        return this.e.a();
    }

    public void c(long j) {
        int e = z19.e(this.c, j, true, false);
        this.g = e;
        if (!this.d || e != this.c.length) {
            j = -9223372036854775807L;
        }
        this.h = j;
    }

    public void d(d52 d52Var, boolean z) {
        int i = this.g;
        long j = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = d52Var;
        long[] jArr = d52Var.b;
        this.c = jArr;
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            c(j2);
        } else if (j != -9223372036854775807L) {
            this.g = z19.e(jArr, j, false, false);
        }
    }

    @Override // defpackage.y77
    public boolean g() {
        return true;
    }

    @Override // defpackage.y77
    public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
        int i2 = this.g;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            decoderInputBuffer.q(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            ep2Var.b = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] a = this.b.a(this.e.a[i2]);
            decoderInputBuffer.t(a.length);
            decoderInputBuffer.c.put(a);
        }
        decoderInputBuffer.e = this.c[i2];
        decoderInputBuffer.q(1);
        return -4;
    }

    @Override // defpackage.y77
    public int s(long j) {
        int max = Math.max(this.g, z19.e(this.c, j, true, false));
        int i = max - this.g;
        this.g = max;
        return i;
    }
}
