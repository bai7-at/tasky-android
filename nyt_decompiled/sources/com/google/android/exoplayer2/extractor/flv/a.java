package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.t0;
import defpackage.d0;
import defpackage.yo5;
import defpackage.yp8;
import java.util.Collections;

/* loaded from: classes2.dex */
final class a extends TagPayloadReader {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public a(yp8 yp8Var) {
        super(yp8Var);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(yo5 yo5Var) {
        if (this.b) {
            yo5Var.V(1);
        } else {
            int H = yo5Var.H();
            int i = (H >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.a.d(new t0.b().g0("audio/mpeg").J(1).h0(e[(H >> 2) & 3]).G());
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.a.d(new t0.b().g0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").J(1).h0(8000).G());
                this.c = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.d);
            }
            this.b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(yo5 yo5Var, long j) {
        if (this.d == 2) {
            int a = yo5Var.a();
            this.a.a(yo5Var, a);
            this.a.b(j, 1, a, 0, null);
            return true;
        }
        int H = yo5Var.H();
        if (H != 0 || this.c) {
            if (this.d == 10 && H != 1) {
                return false;
            }
            int a2 = yo5Var.a();
            this.a.a(yo5Var, a2);
            this.a.b(j, 1, a2, 0, null);
            return true;
        }
        int a3 = yo5Var.a();
        byte[] bArr = new byte[a3];
        yo5Var.l(bArr, 0, a3);
        d0.b f = d0.f(bArr);
        this.a.d(new t0.b().g0("audio/mp4a-latm").K(f.c).J(f.b).h0(f.a).V(Collections.singletonList(bArr)).G());
        this.c = true;
        return false;
    }
}
