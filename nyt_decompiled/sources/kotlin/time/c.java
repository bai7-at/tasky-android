package kotlin.time;

import defpackage.an3;
import defpackage.dg4;
import defpackage.qm3;
import defpackage.uo6;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import kotlin.text.h;
import kotlin.time.b;

/* loaded from: classes5.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j, int i) {
        return b.j((j << 1) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j) {
        return b.j((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? j(uo6.o(j, -4611686018427387903L, 4611686018427387903L)) : l(n(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j) {
        return b.j(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? j(o(j)) : l(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j) {
        return j * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j) {
        return j / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z) {
        long j;
        char charAt;
        char charAt2;
        int i;
        char charAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.a aVar = b.b;
        long d = aVar.d();
        char charAt4 = str.charAt(0);
        boolean z2 = true;
        int i2 = (charAt4 == '+' || charAt4 == '-') ? 1 : 0;
        boolean z3 = i2 > 0;
        boolean z4 = z3 && h.K0(str, '-', false, 2, null);
        if (length <= i2) {
            throw new IllegalArgumentException("No components");
        }
        char c = ':';
        char c2 = '0';
        if (str.charAt(i2) == 'P') {
            int i3 = i2 + 1;
            if (i3 == length) {
                throw new IllegalArgumentException();
            }
            DurationUnit durationUnit = null;
            boolean z5 = false;
            while (i3 < length) {
                if (str.charAt(i3) != 'T') {
                    int i4 = i3;
                    while (i4 < str.length() && ((c2 <= (charAt3 = str.charAt(i4)) && charAt3 < c) || h.O("+-.", charAt3, false, 2, null))) {
                        i4++;
                        c = ':';
                        c2 = '0';
                    }
                    zq3.f(str, "null cannot be cast to non-null type java.lang.String");
                    String substring = str.substring(i3, i4);
                    zq3.g(substring, "substring(...)");
                    if (substring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length2 = i3 + substring.length();
                    if (length2 < 0 || length2 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + substring);
                    }
                    char charAt5 = str.charAt(length2);
                    int i5 = length2 + 1;
                    DurationUnit d2 = e.d(charAt5, z5);
                    if (durationUnit != null && durationUnit.compareTo(d2) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int a0 = h.a0(substring, '.', 0, false, 6, null);
                    if (d2 != DurationUnit.SECONDS || a0 <= 0) {
                        i = i5;
                        d = b.I(d, t(q(substring), d2));
                    } else {
                        zq3.f(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = substring.substring(0, a0);
                        zq3.g(substring2, "substring(...)");
                        i = i5;
                        long I = b.I(d, t(q(substring2), d2));
                        zq3.f(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring3 = substring.substring(a0);
                        zq3.g(substring3, "substring(...)");
                        d = b.I(I, r(Double.parseDouble(substring3), d2));
                    }
                    i3 = i;
                    durationUnit = d2;
                    c = ':';
                    c2 = '0';
                    z2 = true;
                } else {
                    if (z5 || (i3 = i3 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z5 = z2;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            if (h.z(str, i2, "Infinity", 0, Math.max(length - i2, 8), true)) {
                d = aVar.b();
            } else {
                boolean z6 = !z3;
                if (z3 && str.charAt(i2) == '(' && h.j1(str) == ')') {
                    i2++;
                    length--;
                    if (i2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    j = d;
                    z6 = true;
                } else {
                    j = d;
                }
                DurationUnit durationUnit2 = null;
                boolean z7 = false;
                while (i2 < length) {
                    if (z7 && z6) {
                        while (i2 < str.length() && str.charAt(i2) == ' ') {
                            i2++;
                        }
                    }
                    int i6 = i2;
                    while (i6 < str.length() && (('0' <= (charAt2 = str.charAt(i6)) && charAt2 < ':') || charAt2 == '.')) {
                        i6++;
                    }
                    zq3.f(str, "null cannot be cast to non-null type java.lang.String");
                    String substring4 = str.substring(i2, i6);
                    zq3.g(substring4, "substring(...)");
                    if (substring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i2 + substring4.length();
                    int i7 = length3;
                    while (i7 < str.length() && 'a' <= (charAt = str.charAt(i7)) && charAt < '{') {
                        i7++;
                    }
                    zq3.f(str, "null cannot be cast to non-null type java.lang.String");
                    String substring5 = str.substring(length3, i7);
                    zq3.g(substring5, "substring(...)");
                    i2 = length3 + substring5.length();
                    DurationUnit e = e.e(substring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(e) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int a02 = h.a0(substring4, '.', 0, false, 6, null);
                    if (a02 > 0) {
                        zq3.f(substring4, "null cannot be cast to non-null type java.lang.String");
                        String substring6 = substring4.substring(0, a02);
                        zq3.g(substring6, "substring(...)");
                        long I2 = b.I(j, t(Long.parseLong(substring6), e));
                        zq3.f(substring4, "null cannot be cast to non-null type java.lang.String");
                        String substring7 = substring4.substring(a02);
                        zq3.g(substring7, "substring(...)");
                        j = b.I(I2, r(Double.parseDouble(substring7), e));
                        i2 = i2;
                        if (i2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        j = b.I(j, t(Long.parseLong(substring4), e));
                    }
                    str2 = str3;
                    durationUnit2 = e;
                    z7 = true;
                }
                d = j;
            }
        }
        return z4 ? b.M(d) : d;
    }

    private static final long q(String str) {
        int length = str.length();
        int i = (length <= 0 || !h.O("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i > 16) {
            Iterable an3Var = new an3(i, h.V(str));
            if (!(an3Var instanceof Collection) || !((Collection) an3Var).isEmpty()) {
                Iterator it2 = an3Var.iterator();
                while (it2.hasNext()) {
                    char charAt = str.charAt(((qm3) it2).c());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (h.K(str, "+", false, 2, null)) {
            str = h.g1(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d, DurationUnit durationUnit) {
        zq3.h(durationUnit, "unit");
        double a = d.a(d, durationUnit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(a)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long e = dg4.e(a);
        return (-4611686018426999999L > e || e >= 4611686018427000000L) ? k(dg4.e(d.a(d, durationUnit, DurationUnit.MILLISECONDS))) : l(e);
    }

    public static final long s(int i, DurationUnit durationUnit) {
        zq3.h(durationUnit, "unit");
        return durationUnit.compareTo(DurationUnit.SECONDS) <= 0 ? l(d.c(i, durationUnit, DurationUnit.NANOSECONDS)) : t(i, durationUnit);
    }

    public static final long t(long j, DurationUnit durationUnit) {
        zq3.h(durationUnit, "unit");
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long c = d.c(4611686018426999999L, durationUnit2, durationUnit);
        return ((-c) > j || j > c) ? j(uo6.o(d.b(j, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(d.c(j, durationUnit, durationUnit2));
    }
}
