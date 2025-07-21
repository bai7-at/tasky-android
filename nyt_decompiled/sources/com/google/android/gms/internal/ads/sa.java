package com.google.android.gms.internal.ads;

import defpackage.j64;

/* loaded from: classes3.dex */
abstract class sa extends ub implements Runnable {
    j64 h;
    Class i;
    Object j;

    sa(j64 j64Var, Class cls, Object obj) {
        j64Var.getClass();
        this.h = j64Var;
        this.i = cls;
        this.j = obj;
    }

    abstract Object D(Object obj, Throwable th);

    abstract void E(Object obj);

    @Override // com.google.android.gms.internal.ads.eb
    protected final String d() {
        String str;
        j64 j64Var = this.h;
        Class cls = this.i;
        Object obj = this.j;
        String d = super.d();
        if (j64Var != null) {
            str = "inputFuture=[" + j64Var.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (d != null) {
                return str.concat(d);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final void e() {
        t(this.h);
        this.h = null;
        this.i = null;
        this.j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            j64 r0 = r9.h
            java.lang.Class r1 = r9.i
            java.lang.Object r2 = r9.j
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto La6
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L21
            goto La6
        L21:
            r3 = 0
            r9.h = r3
            boolean r4 = r0 instanceof defpackage.oke     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            oke r4 = (defpackage.oke) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = r4.b()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.ads.zb.p(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L79
        L3c:
            r5 = r3
            goto L79
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L77
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Future type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L77:
            r4 = r5
            goto L3c
        L79:
            if (r4 != 0) goto L7f
            r9.f(r5)
            return
        L7f:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto La3
            java.lang.Object r0 = r9.D(r2, r4)     // Catch: java.lang.Throwable -> L91
            r9.i = r3
            r9.j = r3
            r9.E(r0)
            return
        L91:
            r0 = move-exception
            com.google.android.gms.internal.ads.mc.a(r0)     // Catch: java.lang.Throwable -> L9d
            r9.g(r0)     // Catch: java.lang.Throwable -> L9d
            r9.i = r3
            r9.j = r3
            return
        L9d:
            r0 = move-exception
            r9.i = r3
            r9.j = r3
            throw r0
        La3:
            r9.u(r0)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sa.run():void");
    }
}
