package defpackage;

/* loaded from: classes3.dex */
final class wnf {
    private final String a;
    private int b;
    private long c;
    private zzf d;
    private boolean e;
    private boolean f;
    final /* synthetic */ znf g;

    public wnf(znf znfVar, String str, int i, zzf zzfVar) {
        this.g = znfVar;
        this.a = str;
        this.b = i;
        this.c = zzfVar == null ? -1L : zzfVar.d;
        if (zzfVar == null || !zzfVar.b()) {
            return;
        }
        this.d = zzfVar;
    }

    public final void g(int i, zzf zzfVar) {
        long k;
        if (this.c == -1 && i == this.b && zzfVar != null) {
            znf znfVar = this.g;
            long j = zzfVar.d;
            k = znfVar.k();
            if (j >= k) {
                this.c = j;
            }
        }
    }

    public final boolean j(int i, zzf zzfVar) {
        if (zzfVar == null) {
            return i == this.b;
        }
        zzf zzfVar2 = this.d;
        return zzfVar2 == null ? !zzfVar.b() && zzfVar.d == this.c : zzfVar.d == zzfVar2.d && zzfVar.b == zzfVar2.b && zzfVar.c == zzfVar2.c;
    }

    public final boolean k(tgf tgfVar) {
        zzf zzfVar = tgfVar.d;
        if (zzfVar == null) {
            return this.b != tgfVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (zzfVar.d > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        n1c n1cVar = tgfVar.b;
        int a = n1cVar.a(zzfVar.a);
        int a2 = n1cVar.a(this.d.a);
        zzf zzfVar2 = tgfVar.d;
        if (zzfVar2.d < this.d.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (!zzfVar2.b()) {
            int i = tgfVar.d.e;
            return i == -1 || i > this.d.b;
        }
        zzf zzfVar3 = tgfVar.d;
        int i2 = zzfVar3.b;
        int i3 = zzfVar3.c;
        zzf zzfVar4 = this.d;
        int i4 = zzfVar4.b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzfVar4.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.c()) goto L15;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x002e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(defpackage.n1c r7, defpackage.n1c r8) {
        /*
            r6 = this;
            int r0 = r6.b
            int r1 = r7.c()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.c()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = r3
            goto L4a
        L13:
            znf r1 = r6.g
            l0c r1 = defpackage.znf.i(r1)
            r4 = 0
            r7.e(r0, r1, r4)
            znf r0 = r6.g
            l0c r0 = defpackage.znf.i(r0)
            int r0 = r0.n
        L26:
            znf r1 = r6.g
            l0c r1 = defpackage.znf.i(r1)
            int r1 = r1.o
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.f(r0)
            int r1 = r8.a(r1)
            if (r1 == r3) goto L47
            znf r7 = r6.g
            fyb r7 = defpackage.znf.h(r7)
            fyb r7 = r8.d(r1, r7, r2)
            int r0 = r7.c
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.b = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            zzf r6 = r6.d
            r7 = 1
            if (r6 != 0) goto L55
            return r7
        L55:
            java.lang.Object r6 = r6.a
            int r6 = r8.a(r6)
            if (r6 == r3) goto L5e
            return r7
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnf.l(n1c, n1c):boolean");
    }
}
