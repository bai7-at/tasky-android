package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import defpackage.ep2;
import defpackage.ur;
import defpackage.y77;

/* loaded from: classes2.dex */
final class f implements y77 {
    private final int a;
    private final i b;
    private int c = -1;

    public f(i iVar, int i) {
        this.b = iVar;
        this.a = i;
    }

    private boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.y77
    public void a() {
        int i = this.c;
        if (i == -2) {
            throw new SampleQueueMappingException(this.b.t().c(this.a).d(0).l);
        }
        if (i == -1) {
            this.b.U();
        } else if (i != -3) {
            this.b.V(i);
        }
    }

    public void b() {
        ur.a(this.c == -1);
        this.c = this.b.y(this.a);
    }

    public void d() {
        if (this.c != -1) {
            this.b.p0(this.a);
            this.c = -1;
        }
    }

    @Override // defpackage.y77
    public boolean g() {
        return this.c == -3 || (c() && this.b.Q(this.c));
    }

    @Override // defpackage.y77
    public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
        if (this.c == -3) {
            decoderInputBuffer.e(4);
            return -4;
        }
        if (c()) {
            return this.b.e0(this.c, ep2Var, decoderInputBuffer, i);
        }
        return -3;
    }

    @Override // defpackage.y77
    public int s(long j) {
        if (c()) {
            return this.b.o0(this.c, j);
        }
        return 0;
    }
}
