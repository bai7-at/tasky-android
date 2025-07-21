package defpackage;

/* loaded from: classes3.dex */
abstract class f2g extends z8f {
    final CharSequence c;
    final ykf d;
    final boolean e;
    int f = 0;
    int g;

    protected f2g(p3g p3gVar, CharSequence charSequence) {
        ykf ykfVar;
        boolean z;
        ykfVar = p3gVar.a;
        this.d = ykfVar;
        z = p3gVar.b;
        this.e = z;
        this.g = Integer.MAX_VALUE;
        this.c = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r3 = r5.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r3 != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r1 = r5.c.length();
        r5.f = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r1 <= r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r5.c.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r5.c.subSequence(r0, r1).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r5.g = r3 - 1;
     */
    @Override // defpackage.z8f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object b() {
        /*
            r5 = this;
            int r0 = r5.f
        L2:
            int r1 = r5.f
            r2 = -1
            if (r1 == r2) goto L6c
            int r1 = r5.e(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r5.c
            int r1 = r1.length()
            r5.f = r2
            r3 = r2
            goto L1d
        L17:
            int r3 = r5.d(r1)
            r5.f = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r5.f = r3
            java.lang.CharSequence r1 = r5.c
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r5.f = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L35
            java.lang.CharSequence r3 = r5.c
            r3.charAt(r0)
        L35:
            if (r0 >= r1) goto L3e
            java.lang.CharSequence r3 = r5.c
            int r4 = r1 + (-1)
            r3.charAt(r4)
        L3e:
            boolean r3 = r5.e
            if (r3 == 0) goto L47
            if (r0 != r1) goto L47
            int r0 = r5.f
            goto L2
        L47:
            int r3 = r5.g
            r4 = 1
            if (r3 != r4) goto L5e
            java.lang.CharSequence r1 = r5.c
            int r1 = r1.length()
            r5.f = r2
            if (r1 <= r0) goto L61
            java.lang.CharSequence r2 = r5.c
            int r3 = r1 + (-1)
            r2.charAt(r3)
            goto L61
        L5e:
            int r3 = r3 + r2
            r5.g = r3
        L61:
            java.lang.CharSequence r5 = r5.c
            java.lang.CharSequence r5 = r5.subSequence(r0, r1)
            java.lang.String r5 = r5.toString()
            goto L70
        L6c:
            r5.c()
            r5 = 0
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2g.b():java.lang.Object");
    }

    abstract int d(int i);

    abstract int e(int i);
}
