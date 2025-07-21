package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class s3a {
    private final t3a a = new t3a();
    private final b9e b = new b9e(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    s3a() {
    }

    private final int f(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            t3a t3aVar = this.a;
            if (i5 >= t3aVar.c) {
                break;
            }
            this.d = i4 + 1;
            i2 = t3aVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final b9e a() {
        return this.b;
    }

    public final t3a b() {
        return this.a;
    }

    public final void c() {
        this.a.a();
        this.b.h(0);
        this.c = -1;
        this.e = false;
    }

    public final void d() {
        b9e b9eVar = this.b;
        if (b9eVar.m().length == 65025) {
            return;
        }
        b9eVar.i(Arrays.copyOf(b9eVar.m(), Math.max(65025, b9eVar.t())), this.b.t());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.ov9 r7) {
        /*
            r6 = this;
            boolean r0 = r6.e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.e = r1
            b9e r0 = r6.b
            r0.h(r1)
        Ld:
            boolean r0 = r6.e
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.c
            if (r0 >= 0) goto L4e
            t3a r0 = r6.a
            r3 = -1
            boolean r0 = r0.c(r7, r3)
            if (r0 == 0) goto L4d
            t3a r0 = r6.a
            boolean r0 = r0.b(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            t3a r0 = r6.a
            int r3 = r0.d
            int r0 = r0.a
            r0 = r0 & r2
            if (r0 != r2) goto L42
            b9e r0 = r6.b
            int r0 = r0.t()
            if (r0 != 0) goto L42
            int r0 = r6.f(r1)
            int r3 = r3 + r0
            int r0 = r6.d
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r3 = defpackage.tv9.e(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.c = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.f(r0)
            int r3 = r6.c
            int r4 = r6.d
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            b9e r4 = r6.b
            int r5 = r4.t()
            int r5 = r5 + r0
            r4.e(r5)
            b9e r4 = r6.b
            byte[] r5 = r4.m()
            int r4 = r4.t()
            boolean r4 = defpackage.tv9.d(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            b9e r4 = r6.b
            int r5 = r4.t()
            int r5 = r5 + r0
            r4.j(r5)
            t3a r0 = r6.a
            int r4 = r3 + (-1)
            int[] r0 = r0.f
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = r1
        L8c:
            r6.e = r2
        L8e:
            t3a r0 = r6.a
            int r0 = r0.c
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.c = r3
            goto Ld
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3a.e(ov9):boolean");
    }
}
