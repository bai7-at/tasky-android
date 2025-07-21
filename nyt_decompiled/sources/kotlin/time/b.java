package kotlin.time;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.tw1;
import defpackage.uo6;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes5.dex */
public final class b implements Comparable {
    public static final a b = new a(null);
    private static final long c = j(0);
    private static final long d;
    private static final long e;
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final double a(double d, DurationUnit durationUnit, DurationUnit durationUnit2) {
            zq3.h(durationUnit, "sourceUnit");
            zq3.h(durationUnit2, "targetUnit");
            return d.a(d, durationUnit, durationUnit2);
        }

        public final long b() {
            return b.d;
        }

        public final long c() {
            return b.e;
        }

        public final long d() {
            return b.c;
        }

        public final /* synthetic */ long e(int i) {
            return c.s(i, DurationUnit.HOURS);
        }

        public final long f(String str) {
            long p;
            zq3.h(str, "value");
            try {
                p = c.p(str, false);
                return p;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + str + "'.", e);
            }
        }

        public final long g(String str) {
            long p;
            zq3.h(str, "value");
            try {
                p = c.p(str, true);
                return p;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e);
            }
        }

        private a() {
        }
    }

    static {
        long j;
        long j2;
        j = c.j(4611686018427387903L);
        d = j;
        j2 = c.j(-4611686018427387903L);
        e = j2;
    }

    private /* synthetic */ b(long j) {
        this.a = j;
    }

    public static int A(long j) {
        return Long.hashCode(j);
    }

    public static final boolean B(long j) {
        return !E(j);
    }

    private static final boolean C(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean D(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean E(long j) {
        return j == d || j == e;
    }

    public static final boolean F(long j) {
        return j < 0;
    }

    public static final boolean G(long j) {
        return j > 0;
    }

    public static final long H(long j, long j2) {
        return I(j, M(j2));
    }

    public static final long I(long j, long j2) {
        long k;
        long m;
        if (E(j)) {
            if (B(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (E(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return C(j) ? d(j, z(j), z(j2)) : d(j, z(j2), z(j));
        }
        long z = z(j) + z(j2);
        if (D(j)) {
            m = c.m(z);
            return m;
        }
        k = c.k(z);
        return k;
    }

    public static final String J(long j) {
        StringBuilder sb = new StringBuilder();
        if (F(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long n = n(j);
        long q = q(n);
        int v = v(n);
        int x = x(n);
        int w = w(n);
        if (E(j)) {
            q = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = q != 0;
        boolean z3 = (x == 0 && w == 0) ? false : true;
        if (v != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(q);
            sb.append('H');
        }
        if (z) {
            sb.append(v);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            e(j, sb, x, w, 9, QueryKeys.SCREEN_WIDTH, true);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public static final long K(long j, DurationUnit durationUnit) {
        zq3.h(durationUnit, "unit");
        if (j == d) {
            return Long.MAX_VALUE;
        }
        if (j == e) {
            return Long.MIN_VALUE;
        }
        return d.b(z(j), y(j), durationUnit);
    }

    public static String L(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == d) {
            return "Infinity";
        }
        if (j == e) {
            return "-Infinity";
        }
        boolean F = F(j);
        StringBuilder sb = new StringBuilder();
        if (F) {
            sb.append('-');
        }
        long n = n(j);
        long p = p(n);
        int o = o(n);
        int v = v(n);
        int x = x(n);
        int w = w(n);
        int i = 0;
        boolean z = p != 0;
        boolean z2 = o != 0;
        boolean z3 = v != 0;
        boolean z4 = (x == 0 && w == 0) ? false : true;
        if (z) {
            sb.append(p);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(o);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(v);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (x != 0 || z || z2 || z3) {
                e(j, sb, x, w, 9, "s", false);
            } else if (w >= 1000000) {
                e(j, sb, w / 1000000, w % 1000000, 6, "ms", false);
            } else if (w >= 1000) {
                e(j, sb, w / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, w % NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, 3, "us", false);
            } else {
                sb.append(w);
                sb.append("ns");
            }
            i = i4;
        }
        if (F && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public static final long M(long j) {
        long i;
        i = c.i(-z(j), ((int) j) & 1);
        return i;
    }

    private static final long d(long j, long j2, long j3) {
        long o;
        long j4;
        long n;
        long n2;
        long l;
        o = c.o(j3);
        long j5 = j2 + o;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            j4 = c.j(uo6.o(j5, -4611686018427387903L, 4611686018427387903L));
            return j4;
        }
        n = c.n(o);
        long j6 = j3 - n;
        n2 = c.n(j5);
        l = c.l(n2 + j6);
        return l;
    }

    private static final void e(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String p0 = h.p0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = p0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (p0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) p0, 0, ((i4 + 3) / 3) * 3);
                zq3.g(sb, "append(...)");
            } else {
                sb.append((CharSequence) p0, 0, i6);
                zq3.g(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ b f(long j) {
        return new b(j);
    }

    public static int i(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return zq3.k(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return F(j) ? -i : i;
    }

    public static long j(long j) {
        if (tw1.a()) {
            if (D(j)) {
                long z = z(j);
                if (-4611686018426999999L > z || z >= 4611686018427000000L) {
                    throw new AssertionError(z(j) + " ns is out of nanoseconds range");
                }
            } else {
                long z2 = z(j);
                if (-4611686018427387903L > z2 || z2 >= 4611686018427387904L) {
                    throw new AssertionError(z(j) + " ms is out of milliseconds range");
                }
                long z3 = z(j);
                if (-4611686018426L <= z3 && z3 < 4611686018427L) {
                    throw new AssertionError(z(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    public static boolean k(long j, Object obj) {
        return (obj instanceof b) && j == ((b) obj).N();
    }

    public static final boolean l(long j, long j2) {
        return j == j2;
    }

    public static final long n(long j) {
        return F(j) ? M(j) : j;
    }

    public static final int o(long j) {
        if (E(j)) {
            return 0;
        }
        return (int) (q(j) % 24);
    }

    public static final long p(long j) {
        return K(j, DurationUnit.DAYS);
    }

    public static final long q(long j) {
        return K(j, DurationUnit.HOURS);
    }

    public static final long s(long j) {
        return (C(j) && B(j)) ? z(j) : K(j, DurationUnit.MILLISECONDS);
    }

    public static final long t(long j) {
        return K(j, DurationUnit.MINUTES);
    }

    public static final long u(long j) {
        return K(j, DurationUnit.SECONDS);
    }

    public static final int v(long j) {
        if (E(j)) {
            return 0;
        }
        return (int) (t(j) % 60);
    }

    public static final int w(long j) {
        if (E(j)) {
            return 0;
        }
        return (int) (C(j) ? c.n(z(j) % NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) : z(j) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    public static final int x(long j) {
        if (E(j)) {
            return 0;
        }
        return (int) (u(j) % 60);
    }

    private static final DurationUnit y(long j) {
        return D(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    private static final long z(long j) {
        return j >> 1;
    }

    public final /* synthetic */ long N() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return g(((b) obj).N());
    }

    public boolean equals(Object obj) {
        return k(this.a, obj);
    }

    public int g(long j) {
        return i(this.a, j);
    }

    public int hashCode() {
        return A(this.a);
    }

    public String toString() {
        return L(this.a);
    }
}
