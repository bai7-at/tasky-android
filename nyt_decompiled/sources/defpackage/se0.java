package defpackage;

import com.google.android.exoplayer2.source.s;

/* loaded from: classes2.dex */
public final class se0 implements s {
    private final d82 a;
    private y72 b;
    private z72 c;

    public se0(d82 d82Var) {
        this.a = d82Var;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void a(long j, long j2) {
        ((y72) ur.e(this.b)).a(j, j2);
    }

    @Override // com.google.android.exoplayer2.source.s
    public void b() {
        y72 y72Var = this.b;
        if (y72Var instanceof ow4) {
            ((ow4) y72Var).j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r6.getPosition() != r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r6.getPosition() != r11) goto L22;
     */
    @Override // com.google.android.exoplayer2.source.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.s91 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.a82 r15) {
        /*
            r7 = this;
            hh1 r6 = new hh1
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.c = r6
            y72 r8 = r7.b
            if (r8 == 0) goto L10
            return
        L10:
            d82 r8 = r7.a
            y72[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.b = r8
            goto L76
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L72
            r1 = r8[r0]
            boolean r2 = r1.e(r6)     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L62
            if (r2 == 0) goto L37
            r7.b = r1     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L62
            defpackage.ur.g(r14)
            r6.g()
            goto L72
        L35:
            r8 = move-exception
            goto L4e
        L37:
            y72 r1 = r7.b
            if (r1 != 0) goto L46
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L44
            goto L46
        L44:
            r1 = r13
            goto L47
        L46:
            r1 = r14
        L47:
            defpackage.ur.g(r1)
            r6.g()
            goto L6f
        L4e:
            y72 r7 = r7.b
            if (r7 != 0) goto L5a
            long r9 = r6.getPosition()
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L5b
        L5a:
            r13 = r14
        L5b:
            defpackage.ur.g(r13)
            r6.g()
            throw r8
        L62:
            y72 r1 = r7.b
            if (r1 != 0) goto L46
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L44
            goto L46
        L6f:
            int r0 = r0 + 1
            goto L22
        L72:
            y72 r10 = r7.b
            if (r10 == 0) goto L7c
        L76:
            y72 r7 = r7.b
            r7.c(r15)
            return
        L7c:
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r7 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "None of the available extractors ("
            r10.append(r11)
            java.lang.String r8 = defpackage.z19.N(r8)
            r10.append(r8)
            java.lang.String r8 = ") could read the stream."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.Object r9 = defpackage.ur.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r7.<init>(r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se0.c(s91, android.net.Uri, java.util.Map, long, long, a82):void");
    }

    @Override // com.google.android.exoplayer2.source.s
    public long d() {
        z72 z72Var = this.c;
        if (z72Var != null) {
            return z72Var.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.s
    public int e(e06 e06Var) {
        return ((y72) ur.e(this.b)).d((z72) ur.e(this.c), e06Var);
    }

    @Override // com.google.android.exoplayer2.source.s
    public void release() {
        y72 y72Var = this.b;
        if (y72Var != null) {
            y72Var.release();
            this.b = null;
        }
        this.c = null;
    }
}
