package defpackage;

/* loaded from: classes3.dex */
public final class oyf implements c1g {
    private final fw9 a;
    private nv9 b;
    private ov9 c;

    public oyf(fw9 fw9Var) {
        this.a = fw9Var;
    }

    @Override // defpackage.c1g
    public final int a(cx9 cx9Var) {
        nv9 nv9Var = this.b;
        nv9Var.getClass();
        ov9 ov9Var = this.c;
        ov9Var.getClass();
        return nv9Var.n(ov9Var, cx9Var);
    }

    @Override // defpackage.c1g
    public final void b(long j, long j2) {
        nv9 nv9Var = this.b;
        nv9Var.getClass();
        nv9Var.k(j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        if (r6.zzf() != r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006b, code lost:
    
        if (r6.zzf() != r11) goto L22;
     */
    @Override // defpackage.c1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.xyf r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.sv9 r15) {
        /*
            r7 = this;
            bv9 r6 = new bv9
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.c = r6
            nv9 r8 = r7.b
            if (r8 == 0) goto L10
            return
        L10:
            fw9 r8 = r7.a
            nv9[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L21
            r8 = r8[r13]
            r7.b = r8
            goto Lb6
        L21:
            r0 = r13
        L22:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.l(r6)     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L61
            if (r2 == 0) goto L37
            r7.b = r1     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L61
            defpackage.wad.f(r14)
            r6.zzj()
            goto L71
        L35:
            r8 = move-exception
            goto L4d
        L37:
            nv9 r1 = r7.b
            if (r1 != 0) goto L43
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L45
        L43:
            r1 = r14
            goto L46
        L45:
            r1 = r13
        L46:
            defpackage.wad.f(r1)
            r6.zzj()
            goto L6e
        L4d:
            nv9 r7 = r7.b
            if (r7 != 0) goto L59
            long r9 = r6.zzf()
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L5a
        L59:
            r13 = r14
        L5a:
            defpackage.wad.f(r13)
            r6.zzj()
            throw r8
        L61:
            nv9 r1 = r7.b
            if (r1 != 0) goto L43
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L45
            goto L43
        L6e:
            int r0 = r0 + 1
            goto L22
        L71:
            nv9 r10 = r7.b
            if (r10 != 0) goto Lb6
            com.google.android.gms.internal.ads.zzwt r7 = new com.google.android.gms.internal.ads.zzwt
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
        L7c:
            int r11 = r8.length
            if (r13 >= r11) goto L98
            r12 = r8[r13]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r10.append(r12)
            int r11 = r11 + (-1)
            if (r13 >= r11) goto L95
            java.lang.String r11 = ", "
            r10.append(r11)
        L95:
            int r13 = r13 + 1
            goto L7c
        L98:
            java.lang.String r8 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "None of the available extractors ("
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = ") could read the stream."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r7.<init>(r8, r9)
            throw r7
        Lb6:
            nv9 r7 = r7.b
            r7.m(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyf.c(xyf, android.net.Uri, java.util.Map, long, long, sv9):void");
    }

    @Override // defpackage.c1g
    public final long zzb() {
        ov9 ov9Var = this.c;
        if (ov9Var != null) {
            return ov9Var.zzf();
        }
        return -1L;
    }

    @Override // defpackage.c1g
    public final void zzc() {
        nv9 nv9Var = this.b;
        if (nv9Var != null && (nv9Var instanceof u1a)) {
            ((u1a) nv9Var).a();
        }
    }

    @Override // defpackage.c1g
    public final void zze() {
        if (this.b != null) {
            this.b = null;
        }
        this.c = null;
    }
}
