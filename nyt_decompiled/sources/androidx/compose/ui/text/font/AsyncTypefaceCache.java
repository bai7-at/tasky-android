package androidx.compose.ui.text.font;

import defpackage.fd4;
import defpackage.gs7;
import defpackage.hu5;
import defpackage.nd8;
import defpackage.od8;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class AsyncTypefaceCache {
    private final Object a = a.b(null);
    private final fd4 b = new fd4(16);
    private final gs7 c = new gs7(0, 1, null);
    private final od8 d = nd8.a();

    public static final class a {
        private final Object a;

        private /* synthetic */ a(Object obj) {
            this.a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static Object b(Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && zq3.c(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.a;
        }

        public int hashCode() {
            return d(this.a);
        }

        public String toString() {
            return f(this.a);
        }
    }

    public static final class b {
        private final d a;
        private final Object b;

        public b(d dVar, Object obj) {
            this.a = dVar;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.a + ", loaderKey=" + this.b + ')';
        }
    }

    public static /* synthetic */ void f(AsyncTypefaceCache asyncTypefaceCache, d dVar, hu5 hu5Var, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.e(dVar, hu5Var, obj, z);
    }

    public final a d(d dVar, hu5 hu5Var) {
        a aVar;
        b bVar = new b(dVar, hu5Var.c());
        synchronized (this.d) {
            aVar = (a) this.b.d(bVar);
            if (aVar == null) {
                aVar = (a) this.c.b(bVar);
            }
        }
        return aVar;
    }

    public final void e(d dVar, hu5 hu5Var, Object obj, boolean z) {
        b bVar = new b(dVar, hu5Var.c());
        synchronized (this.d) {
            try {
                if (obj == null) {
                } else if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(androidx.compose.ui.text.font.d r6, defpackage.hu5 r7, boolean r8, defpackage.ss2 r9, defpackage.by0 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r8 = r0.Z$0
            java.lang.Object r5 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r5 = (androidx.compose.ui.text.font.AsyncTypefaceCache.b) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r6
            kotlin.f.b(r10)
            r4 = r10
            r10 = r5
            r5 = r6
            r6 = r4
            goto L7d
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.f.b(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b
            java.lang.Object r7 = r7.c()
            r10.<init>(r6, r7)
            od8 r6 = r5.d
            monitor-enter(r6)
            fd4 r7 = r5.b     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r7.d(r10)     // Catch: java.lang.Throwable -> L61
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r7     // Catch: java.lang.Throwable -> L61
            if (r7 != 0) goto L63
            gs7 r7 = r5.c     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r7.b(r10)     // Catch: java.lang.Throwable -> L61
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r7     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r5 = move-exception
            goto Lb3
        L63:
            if (r7 == 0) goto L6b
            java.lang.Object r5 = r7.g()     // Catch: java.lang.Throwable -> L61
            monitor-exit(r6)
            return r5
        L6b:
            ww8 r7 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L61
            monitor-exit(r6)
            r0.L$0 = r5
            r0.L$1 = r10
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L7d
            return r1
        L7d:
            od8 r7 = r5.d
            monitor-enter(r7)
            if (r6 != 0) goto L90
            gs7 r8 = r5.c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r5 = r5.a     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r5 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.a(r5)     // Catch: java.lang.Throwable -> L8e
            r8.h(r10, r5)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r5 = move-exception
            goto Lb1
        L90:
            if (r8 == 0) goto La0
            gs7 r5 = r5.c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.b(r6)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.a(r8)     // Catch: java.lang.Throwable -> L8e
            r5.h(r10, r8)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            fd4 r5 = r5.b     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.b(r6)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.a(r8)     // Catch: java.lang.Throwable -> L8e
            r5.e(r10, r8)     // Catch: java.lang.Throwable -> L8e
        Lad:
            ww8 r5 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r7)
            return r6
        Lb1:
            monitor-exit(r7)
            throw r5
        Lb3:
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.g(androidx.compose.ui.text.font.d, hu5, boolean, ss2, by0):java.lang.Object");
    }
}
