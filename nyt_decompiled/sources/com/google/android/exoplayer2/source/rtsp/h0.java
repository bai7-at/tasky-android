package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.b;
import defpackage.aa1;
import defpackage.d47;
import java.io.IOException;

/* loaded from: classes2.dex */
final class h0 implements b.a {
    private final long a;

    public h0(long j) {
        this.a = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b.a
    public b a(int i) {
        g0 g0Var = new g0(this.a);
        g0 g0Var2 = new g0(this.a);
        try {
            g0Var.b(d47.a(0));
            int d = g0Var.d();
            boolean z = d % 2 == 0;
            g0Var2.b(d47.a(z ? d + 1 : d - 1));
            if (z) {
                g0Var.k(g0Var2);
                return g0Var;
            }
            g0Var2.k(g0Var);
            return g0Var2;
        } catch (IOException e) {
            aa1.a(g0Var);
            aa1.a(g0Var2);
            throw e;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b.a
    public b.a b() {
        return new f0(this.a);
    }
}
