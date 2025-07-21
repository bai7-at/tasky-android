package defpackage;

import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class xo {
    public static final void a(vo voVar, int i) {
        zq3.h(voVar, "<this>");
        voVar.q(new int[i]);
        voVar.p(new Object[i]);
    }

    public static final int b(vo voVar, int i) {
        zq3.h(voVar, "<this>");
        try {
            return rv0.a(voVar.f(), voVar.j(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(vo voVar, Object obj, int i) {
        zq3.h(voVar, "<this>");
        int j = voVar.j();
        if (j == 0) {
            return -1;
        }
        int b = b(voVar, i);
        if (b < 0 || zq3.c(obj, voVar.c()[b])) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < j && voVar.f()[i2] == i) {
            if (zq3.c(obj, voVar.c()[i2])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = b - 1; i3 >= 0 && voVar.f()[i3] == i; i3--) {
            if (zq3.c(obj, voVar.c()[i3])) {
                return i3;
            }
        }
        return ~i2;
    }

    public static final int d(vo voVar) {
        zq3.h(voVar, "<this>");
        return c(voVar, null, 0);
    }
}
