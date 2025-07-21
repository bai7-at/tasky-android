package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.t0;
import defpackage.j15;
import defpackage.v20;
import defpackage.yo5;
import defpackage.yp8;

/* loaded from: classes2.dex */
final class d extends TagPayloadReader {
    private final yo5 b;
    private final yo5 c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public d(yp8 yp8Var) {
        super(yp8Var);
        this.b = new yo5(j15.a);
        this.c = new yo5(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(yo5 yo5Var) {
        int H = yo5Var.H();
        int i = (H >> 4) & 15;
        int i2 = H & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(yo5 yo5Var, long j) {
        int H = yo5Var.H();
        long r = j + (yo5Var.r() * 1000);
        if (H == 0 && !this.e) {
            yo5 yo5Var2 = new yo5(new byte[yo5Var.a()]);
            yo5Var.l(yo5Var2.e(), 0, yo5Var.a());
            v20 b = v20.b(yo5Var2);
            this.d = b.b;
            this.a.d(new t0.b().g0("video/avc").K(b.i).n0(b.c).S(b.d).c0(b.h).V(b.a).G());
            this.e = true;
            return false;
        }
        if (H != 1 || !this.e) {
            return false;
        }
        int i = this.g == 1 ? 1 : 0;
        if (!this.f && i == 0) {
            return false;
        }
        byte[] e = this.c.e();
        e[0] = 0;
        e[1] = 0;
        e[2] = 0;
        int i2 = 4 - this.d;
        int i3 = 0;
        while (yo5Var.a() > 0) {
            yo5Var.l(this.c.e(), i2, this.d);
            this.c.U(0);
            int L = this.c.L();
            this.b.U(0);
            this.a.a(this.b, 4);
            this.a.a(yo5Var, L);
            i3 = i3 + 4 + L;
        }
        this.a.b(r, i, i3, 0, null);
        this.f = true;
        return true;
    }
}
