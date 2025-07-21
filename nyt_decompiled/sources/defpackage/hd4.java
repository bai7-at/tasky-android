package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class hd4 {
    private int a;
    private final id4 b;
    private final u74 c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public hd4(int i) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new id4(0, 0.75f);
        this.c = new u74();
    }

    private final int h(Object obj, Object obj2) {
        int j = j(obj, obj2);
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object a(Object obj) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        return null;
    }

    protected void b(boolean z, Object obj, Object obj2, Object obj3) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        zq3.h(obj2, "oldValue");
    }

    public final void c() {
        l(-1);
    }

    public final Object d(Object obj) {
        Object d;
        zq3.h(obj, TransferTable.COLUMN_KEY);
        synchronized (this.c) {
            Object a = this.b.a(obj);
            if (a != null) {
                this.h++;
                return a;
            }
            this.i++;
            Object a2 = a(obj);
            if (a2 == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    this.f++;
                    d = this.b.d(obj, a2);
                    if (d != null) {
                        this.b.d(obj, d);
                    } else {
                        this.d += h(obj, a2);
                        ww8 ww8Var = ww8.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (d != null) {
                b(false, obj, a2, d);
                return d;
            }
            l(this.a);
            return a2;
        }
    }

    public final int e() {
        int i;
        synchronized (this.c) {
            i = this.a;
        }
        return i;
    }

    public final Object f(Object obj, Object obj2) {
        Object d;
        zq3.h(obj, TransferTable.COLUMN_KEY);
        zq3.h(obj2, "value");
        synchronized (this.c) {
            try {
                this.e++;
                this.d += h(obj, obj2);
                d = this.b.d(obj, obj2);
                if (d != null) {
                    this.d -= h(obj, d);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d != null) {
            b(false, obj, d, obj2);
        }
        l(this.a);
        return d;
    }

    public final Object g(Object obj) {
        Object e;
        zq3.h(obj, TransferTable.COLUMN_KEY);
        synchronized (this.c) {
            try {
                e = this.b.e(obj);
                if (e != null) {
                    this.d -= h(obj, e);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e != null) {
            b(false, obj, e, null);
        }
        return e;
    }

    public final int i() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    protected int j(Object obj, Object obj2) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        zq3.h(obj2, "value");
        return 1;
    }

    public final Map k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.c) {
            try {
                for (Map.Entry entry : this.b.b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r6) {
        /*
            r5 = this;
        L0:
            u74 r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L59
            id4 r1 = r5.b     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            int r1 = r5.d     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L59
            goto L16
        L14:
            r5 = move-exception
            goto L61
        L16:
            int r1 = r5.d     // Catch: java.lang.Throwable -> L14
            if (r1 <= r6) goto L57
            id4 r1 = r5.b     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            goto L57
        L23:
            id4 r1 = r5.b     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L14
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = kotlin.collections.i.l0(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L35
            monitor-exit(r0)
            return
        L35:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            id4 r3 = r5.b     // Catch: java.lang.Throwable -> L14
            r3.e(r2)     // Catch: java.lang.Throwable -> L14
            int r3 = r5.d     // Catch: java.lang.Throwable -> L14
            int r4 = r5.h(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r3 = r3 - r4
            r5.d = r3     // Catch: java.lang.Throwable -> L14
            int r3 = r5.g     // Catch: java.lang.Throwable -> L14
            r4 = 1
            int r3 = r3 + r4
            r5.g = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r0 = 0
            r5.b(r4, r2, r1, r0)
            goto L0
        L57:
            monitor-exit(r0)
            return
        L59:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r6     // Catch: java.lang.Throwable -> L14
        L61:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd4.l(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.h;
                int i2 = this.i + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
