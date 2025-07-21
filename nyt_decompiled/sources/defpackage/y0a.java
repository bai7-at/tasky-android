package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
final class y0a implements a1a {
    private final byte[] a = new byte[8];
    private final ArrayDeque b = new ArrayDeque();
    private final p1a c = new p1a();
    private z0a d;
    private int e;
    private int f;
    private long g;

    private final long c(ov9 ov9Var, int i) {
        ((bv9) ov9Var).c(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0095, code lost:
    
        if (r0 == 1) goto L34;
     */
    @Override // defpackage.a1a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.ov9 r14) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0a.a(ov9):boolean");
    }

    @Override // defpackage.a1a
    public final void b(z0a z0aVar) {
        this.d = z0aVar;
    }

    @Override // defpackage.a1a
    public final void zzb() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
}
