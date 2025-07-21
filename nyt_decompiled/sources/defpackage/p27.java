package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class p27 implements vc8, uc8 {
    public static final a i = new a(null);
    public static final TreeMap j = new TreeMap();
    private final int a;
    private volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    private final int[] g;
    private int h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p27 a(String str, int i) {
            zq3.h(str, "query");
            TreeMap treeMap = p27.j;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry == null) {
                    ww8 ww8Var = ww8.a;
                    p27 p27Var = new p27(i, null);
                    p27Var.j(str, i);
                    return p27Var;
                }
                treeMap.remove(ceilingEntry.getKey());
                p27 p27Var2 = (p27) ceilingEntry.getValue();
                p27Var2.j(str, i);
                zq3.g(p27Var2, "sqliteQuery");
                return p27Var2;
            }
        }

        public final void b() {
            TreeMap treeMap = p27.j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it2 = treeMap.descendingKeySet().iterator();
            zq3.g(it2, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it2.next();
                it2.remove();
                size = i;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ p27(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static final p27 d(String str, int i2) {
        return i.a(str, i2);
    }

    @Override // defpackage.uc8
    public void H(int i2, double d) {
        this.g[i2] = 3;
        this.d[i2] = d;
    }

    @Override // defpackage.uc8
    public void L0(int i2, long j2) {
        this.g[i2] = 2;
        this.c[i2] = j2;
    }

    @Override // defpackage.uc8
    public void Q0(int i2, byte[] bArr) {
        zq3.h(bArr, "value");
        this.g[i2] = 5;
        this.f[i2] = bArr;
    }

    @Override // defpackage.vc8
    public String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.vc8
    public void b(uc8 uc8Var) {
        zq3.h(uc8Var, "statement");
        int i2 = i();
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i4 = this.g[i3];
            if (i4 == 1) {
                uc8Var.c1(i3);
            } else if (i4 == 2) {
                uc8Var.L0(i3, this.c[i3]);
            } else if (i4 == 3) {
                uc8Var.H(i3, this.d[i3]);
            } else if (i4 == 4) {
                String str = this.e[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                uc8Var.v0(i3, str);
            } else if (i4 == 5) {
                byte[] bArr = this.f[i3];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                uc8Var.Q0(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // defpackage.uc8
    public void c1(int i2) {
        this.g[i2] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void h(p27 p27Var) {
        zq3.h(p27Var, "other");
        int i2 = p27Var.i() + 1;
        System.arraycopy(p27Var.g, 0, this.g, 0, i2);
        System.arraycopy(p27Var.c, 0, this.c, 0, i2);
        System.arraycopy(p27Var.e, 0, this.e, 0, i2);
        System.arraycopy(p27Var.f, 0, this.f, 0, i2);
        System.arraycopy(p27Var.d, 0, this.d, 0, i2);
    }

    public int i() {
        return this.h;
    }

    public final void j(String str, int i2) {
        zq3.h(str, "query");
        this.b = str;
        this.h = i2;
    }

    public final void release() {
        TreeMap treeMap = j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            i.b();
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // defpackage.uc8
    public void v0(int i2, String str) {
        zq3.h(str, "value");
        this.g[i2] = 4;
        this.e[i2] = str;
    }

    private p27(int i2) {
        this.a = i2;
        int i3 = i2 + 1;
        this.g = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3][];
    }
}
