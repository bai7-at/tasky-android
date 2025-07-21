package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class fd4 {
    private final od8 a = nd8.a();
    private final HashMap b;
    private final LinkedHashSet c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public fd4(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.e = i;
        this.b = new HashMap(0, 0.75f);
        this.c = new LinkedHashSet();
    }

    private final int g(Object obj, Object obj2) {
        int i = i(obj, obj2);
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object b(Object obj) {
        return null;
    }

    protected void c(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final Object d(Object obj) {
        synchronized (this.a) {
            Object obj2 = this.b.get(obj);
            if (obj2 != null) {
                this.c.remove(obj);
                this.c.add(obj);
                this.i++;
                return obj2;
            }
            this.j++;
            Object b = b(obj);
            if (b == null) {
                return null;
            }
            synchronized (this.a) {
                try {
                    this.g++;
                    Object put = this.b.put(obj, b);
                    this.c.remove(obj);
                    this.c.add(obj);
                    if (put != null) {
                        this.b.put(obj, put);
                        obj2 = put;
                    } else {
                        this.d = h() + g(obj, b);
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (obj2 != null) {
                c(false, obj, b, obj2);
                return obj2;
            }
            j(this.e);
            return b;
        }
    }

    public final Object e(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.a) {
            try {
                this.f++;
                this.d = h() + g(obj, obj2);
                put = this.b.put(obj, obj2);
                if (put != null) {
                    this.d = h() - g(obj, put);
                }
                if (this.c.contains(obj)) {
                    this.c.remove(obj);
                }
                this.c.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            c(false, obj, put, obj2);
        }
        j(this.e);
        return put;
    }

    public final Object f(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.a) {
            try {
                remove = this.b.remove(obj);
                this.c.remove(obj);
                if (remove != null) {
                    this.d = h() - g(obj, remove);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            c(false, obj, remove, null);
        }
        return remove;
    }

    public final int h() {
        int i;
        synchronized (this.a) {
            i = this.d;
        }
        return i;
    }

    protected int i(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r8) {
        /*
            r7 = this;
        L0:
            od8 r0 = r7.a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r7 = move-exception
            goto L95
        L1b:
            java.util.HashMap r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r2 = r7.c     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet r1 = r7.c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = kotlin.collections.i.j0(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap r4 = r7.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap r5 = r7.b     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = defpackage.ku8.d(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r5 = r7.c     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = defpackage.ku8.a(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.h()     // Catch: java.lang.Throwable -> L18
            defpackage.zq3.e(r1)     // Catch: java.lang.Throwable -> L18
            defpackage.zq3.e(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.g(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.d = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.h     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.h = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = "inconsistent state"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L18
            throw r7     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            ww8 r5 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            defpackage.zq3.e(r1)
            defpackage.zq3.e(r4)
            r7.c(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = "map/keySet size inconsistency"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L18
            throw r7     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd4.j(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.a) {
            try {
                int i = this.i;
                int i2 = this.j + i;
                str = "LruCache[maxSize=" + this.e + ",hits=" + this.i + ",misses=" + this.j + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
