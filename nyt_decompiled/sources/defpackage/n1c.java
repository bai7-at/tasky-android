package defpackage;

import android.util.Pair;

/* loaded from: classes3.dex */
public abstract class n1c {
    public static final n1c a = new xvb();
    private static final String b = Integer.toString(0, 36);
    private static final String c = Integer.toString(1, 36);
    private static final String d = Integer.toString(2, 36);
    public static final zhf e = new zhf() { // from class: tub
    };

    protected n1c() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract fyb d(int i, fyb fybVar, boolean z);

    public abstract l0c e(int i, l0c l0cVar, long j);

    public final boolean equals(Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1c)) {
            return false;
        }
        n1c n1cVar = (n1c) obj;
        if (n1cVar.c() == c() && n1cVar.b() == b()) {
            l0c l0cVar = new l0c();
            fyb fybVar = new fyb();
            l0c l0cVar2 = new l0c();
            fyb fybVar2 = new fyb();
            for (int i = 0; i < c(); i++) {
                if (!e(i, l0cVar, 0L).equals(n1cVar.e(i, l0cVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < b(); i2++) {
                if (!d(i2, fybVar, true).equals(n1cVar.d(i2, fybVar2, true))) {
                    return false;
                }
            }
            int g = g(true);
            if (g == n1cVar.g(true) && (h = h(true)) == n1cVar.h(true)) {
                while (g != h) {
                    int j = j(g, 0, true);
                    if (j != n1cVar.j(g, 0, true)) {
                        return false;
                    }
                    g = j;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        return o() ? -1 : 0;
    }

    public int h(boolean z) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        l0c l0cVar = new l0c();
        fyb fybVar = new fyb();
        int c2 = c() + 217;
        int i2 = 0;
        while (true) {
            i = c2 * 31;
            if (i2 >= c()) {
                break;
            }
            c2 = i + e(i2, l0cVar, 0L).hashCode();
            i2++;
        }
        int b2 = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            b2 = (b2 * 31) + d(i3, fybVar, true).hashCode();
        }
        int g = g(true);
        while (g != -1) {
            b2 = (b2 * 31) + g;
            g = j(g, 0, true);
        }
        return b2;
    }

    public final int i(int i, fyb fybVar, l0c l0cVar, int i2, boolean z) {
        int i3 = d(i, fybVar, false).c;
        if (e(i3, l0cVar, 0L).o != i) {
            return i + 1;
        }
        int j = j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return e(j, l0cVar, 0L).n;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == h(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == h(z) ? g(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i, int i2, boolean z) {
        if (i == g(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair l(l0c l0cVar, fyb fybVar, int i, long j) {
        Pair m = m(l0cVar, fybVar, i, j, 0L);
        m.getClass();
        return m;
    }

    public final Pair m(l0c l0cVar, fyb fybVar, int i, long j, long j2) {
        wad.a(i, 0, c());
        e(i, l0cVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = l0cVar.l;
            j = 0;
        }
        int i2 = l0cVar.n;
        d(i2, fybVar, false);
        while (i2 < l0cVar.o) {
            long j4 = fybVar.e;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = d(i3, fybVar, false).e;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, fybVar, true);
        long j6 = fybVar.e;
        long j7 = fybVar.d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = fybVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public fyb n(Object obj, fyb fybVar) {
        return d(a(obj), fybVar, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
