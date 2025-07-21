package defpackage;

/* loaded from: classes.dex */
public final class bm1 implements fy1 {
    private final int a;
    private final int b;

    public bm1(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[LOOP:0: B:2:0x0005->B:10:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[EDGE_INSN: B:11:0x0036->B:12:0x0036 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0033], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[LOOP:1: B:13:0x0039->B:21:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[EDGE_INSN: B:22:0x0074->B:23:0x0074 BREAK  A[LOOP:1: B:13:0x0039->B:21:0x0071], SYNTHETIC] */
    @Override // defpackage.fy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.ly1 r8) {
        /*
            r7 = this;
            int r0 = r7.a
            r1 = 0
            r2 = r1
            r3 = r2
        L5:
            if (r2 >= r0) goto L36
            int r4 = r3 + 1
            int r5 = r8.k()
            if (r5 <= r4) goto L2c
            int r5 = r8.k()
            int r5 = r5 - r4
            int r5 = r5 + (-1)
            char r5 = r8.c(r5)
            int r6 = r8.k()
            int r6 = r6 - r4
            char r6 = r8.c(r6)
            boolean r5 = defpackage.gy1.a(r5, r6)
            if (r5 == 0) goto L2c
            int r3 = r3 + 2
            goto L2d
        L2c:
            r3 = r4
        L2d:
            int r4 = r8.k()
            if (r3 == r4) goto L36
            int r2 = r2 + 1
            goto L5
        L36:
            int r7 = r7.b
            r0 = r1
        L39:
            if (r1 >= r7) goto L74
            int r2 = r0 + 1
            int r4 = r8.j()
            int r4 = r4 + r2
            int r5 = r8.h()
            if (r4 >= r5) goto L65
            int r4 = r8.j()
            int r4 = r4 + r2
            int r4 = r4 + (-1)
            char r4 = r8.c(r4)
            int r5 = r8.j()
            int r5 = r5 + r2
            char r5 = r8.c(r5)
            boolean r4 = defpackage.gy1.a(r4, r5)
            if (r4 == 0) goto L65
            int r0 = r0 + 2
            goto L66
        L65:
            r0 = r2
        L66:
            int r2 = r8.j()
            int r2 = r2 + r0
            int r4 = r8.h()
            if (r2 == r4) goto L74
            int r1 = r1 + 1
            goto L39
        L74:
            int r7 = r8.j()
            int r1 = r8.j()
            int r1 = r1 + r0
            r8.b(r7, r1)
            int r7 = r8.k()
            int r7 = r7 - r3
            int r0 = r8.k()
            r8.b(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.a(ly1):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm1)) {
            return false;
        }
        bm1 bm1Var = (bm1) obj;
        return this.a == bm1Var.a && this.b == bm1Var.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
