package kotlin.text;

import defpackage.aw8;
import defpackage.hv8;
import defpackage.lv8;
import defpackage.pv8;
import defpackage.zq3;
import kotlin.KotlinNothingValueException;
import okhttp3.internal.http2.Settings;

/* loaded from: classes5.dex */
public abstract class s {
    public static final byte a(String str) {
        zq3.h(str, "<this>");
        hv8 b = b(str);
        if (b != null) {
            return b.f();
        }
        o.k(str);
        throw new KotlinNothingValueException();
    }

    public static final hv8 b(String str) {
        zq3.h(str, "<this>");
        return c(str, 10);
    }

    public static final hv8 c(String str, int i) {
        zq3.h(str, "<this>");
        lv8 f = f(str, i);
        if (f == null) {
            return null;
        }
        int f2 = f.f();
        if (Integer.compareUnsigned(f2, lv8.b(255)) > 0) {
            return null;
        }
        return hv8.a(hv8.b((byte) f2));
    }

    public static final int d(String str) {
        zq3.h(str, "<this>");
        lv8 e = e(str);
        if (e != null) {
            return e.f();
        }
        o.k(str);
        throw new KotlinNothingValueException();
    }

    public static final lv8 e(String str) {
        zq3.h(str, "<this>");
        return f(str, 10);
    }

    public static final lv8 f(String str, int i) {
        int i2;
        zq3.h(str, "<this>");
        a.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (zq3.j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int b = lv8.b(i);
        int i4 = 119304647;
        while (i2 < length) {
            int b2 = b.b(str.charAt(i2), i);
            if (b2 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i3, i4) > 0) {
                if (i4 == 119304647) {
                    i4 = Integer.divideUnsigned(-1, b);
                    if (Integer.compareUnsigned(i3, i4) > 0) {
                    }
                }
                return null;
            }
            int b3 = lv8.b(i3 * b);
            int b4 = lv8.b(lv8.b(b2) + b3);
            if (Integer.compareUnsigned(b4, b3) < 0) {
                return null;
            }
            i2++;
            i3 = b4;
        }
        return lv8.a(i3);
    }

    public static final long g(String str) {
        zq3.h(str, "<this>");
        pv8 h = h(str);
        if (h != null) {
            return h.g();
        }
        o.k(str);
        throw new KotlinNothingValueException();
    }

    public static final pv8 h(String str) {
        zq3.h(str, "<this>");
        return i(str, 10);
    }

    public static final pv8 i(String str, int i) {
        zq3.h(str, "<this>");
        a.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (zq3.j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b = pv8.b(i);
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            if (b.b(str.charAt(i2), i) < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, j2) > 0) {
                if (j2 == 512409557603043100L) {
                    j2 = Long.divideUnsigned(-1L, b);
                    if (Long.compareUnsigned(j, j2) > 0) {
                    }
                }
                return null;
            }
            long b2 = pv8.b(j * b);
            long b3 = pv8.b(pv8.b(lv8.b(r13) & 4294967295L) + b2);
            if (Long.compareUnsigned(b3, b2) < 0) {
                return null;
            }
            i2++;
            j = b3;
        }
        return pv8.a(j);
    }

    public static final short j(String str) {
        zq3.h(str, "<this>");
        aw8 k = k(str);
        if (k != null) {
            return k.f();
        }
        o.k(str);
        throw new KotlinNothingValueException();
    }

    public static final aw8 k(String str) {
        zq3.h(str, "<this>");
        return l(str, 10);
    }

    public static final aw8 l(String str, int i) {
        zq3.h(str, "<this>");
        lv8 f = f(str, i);
        if (f == null) {
            return null;
        }
        int f2 = f.f();
        if (Integer.compareUnsigned(f2, lv8.b(Settings.DEFAULT_INITIAL_WINDOW_SIZE)) > 0) {
            return null;
        }
        return aw8.a(aw8.b((short) f2));
    }
}
