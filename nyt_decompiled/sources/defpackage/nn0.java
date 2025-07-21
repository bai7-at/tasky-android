package defpackage;

import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.d;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class nn0 {
    public static final a b = new a(null);
    private static final long c = wn0.d(4278190080L);
    private static final long d = wn0.d(4282664004L);
    private static final long e = wn0.d(4287137928L);
    private static final long f = wn0.d(4291611852L);
    private static final long g = wn0.d(4294967295L);
    private static final long h = wn0.d(4294901760L);
    private static final long i = wn0.d(4278255360L);
    private static final long j = wn0.d(4278190335L);
    private static final long k = wn0.d(4294967040L);
    private static final long l = wn0.d(4278255615L);
    private static final long m = wn0.d(4294902015L);
    private static final long n = wn0.b(0);
    private static final long o = wn0.a(0.0f, 0.0f, 0.0f, 0.0f, e.a.y());
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return nn0.c;
        }

        public final long b() {
            return nn0.j;
        }

        public final long c() {
            return nn0.d;
        }

        public final long d() {
            return nn0.f;
        }

        public final long e() {
            return nn0.h;
        }

        public final long f() {
            return nn0.n;
        }

        public final long g() {
            return nn0.o;
        }

        public final long h() {
            return nn0.g;
        }

        public final long i() {
            return nn0.k;
        }

        private a() {
        }
    }

    private /* synthetic */ nn0(long j2) {
        this.a = j2;
    }

    public static String A(long j2) {
        return "Color(" + y(j2) + ", " + x(j2) + ", " + v(j2) + ", " + u(j2) + ", " + w(j2).f() + ')';
    }

    public static final /* synthetic */ nn0 j(long j2) {
        return new nn0(j2);
    }

    public static final float k(long j2) {
        return y(j2);
    }

    public static final float l(long j2) {
        return x(j2);
    }

    public static final float m(long j2) {
        return v(j2);
    }

    public static final float n(long j2) {
        return u(j2);
    }

    public static long o(long j2) {
        return j2;
    }

    public static final long p(long j2, c cVar) {
        c w = w(j2);
        return zq3.c(cVar, w) ? j2 : d.i(w, cVar, 0, 2, null).e(y(j2), x(j2), v(j2), u(j2));
    }

    public static final long q(long j2, float f2, float f3, float f4, float f5) {
        return wn0.a(f3, f4, f5, f2, w(j2));
    }

    public static /* synthetic */ long r(long j2, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = u(j2);
        }
        float f6 = f2;
        if ((i2 & 2) != 0) {
            f3 = y(j2);
        }
        float f7 = f3;
        if ((i2 & 4) != 0) {
            f4 = x(j2);
        }
        float f8 = f4;
        if ((i2 & 8) != 0) {
            f5 = v(j2);
        }
        return q(j2, f6, f7, f8, f5);
    }

    public static boolean s(long j2, Object obj) {
        return (obj instanceof nn0) && j2 == ((nn0) obj).B();
    }

    public static final boolean t(long j2, long j3) {
        return pv8.d(j2, j3);
    }

    public static final float u(long j2) {
        float c2;
        float f2;
        if (pv8.b(63 & j2) == 0) {
            c2 = (float) qx8.c(pv8.b(pv8.b(j2 >>> 56) & 255));
            f2 = 255.0f;
        } else {
            c2 = (float) qx8.c(pv8.b(pv8.b(j2 >>> 6) & 1023));
            f2 = 1023.0f;
        }
        return c2 / f2;
    }

    public static final float v(long j2) {
        return pv8.b(63 & j2) == 0 ? ((float) qx8.c(pv8.b(pv8.b(j2 >>> 32) & 255))) / 255.0f : tk2.c(tk2.b((short) pv8.b(pv8.b(j2 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static final c w(long j2) {
        e eVar = e.a;
        return eVar.l()[(int) pv8.b(j2 & 63)];
    }

    public static final float x(long j2) {
        return pv8.b(63 & j2) == 0 ? ((float) qx8.c(pv8.b(pv8.b(j2 >>> 40) & 255))) / 255.0f : tk2.c(tk2.b((short) pv8.b(pv8.b(j2 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static final float y(long j2) {
        return pv8.b(63 & j2) == 0 ? ((float) qx8.c(pv8.b(pv8.b(j2 >>> 48) & 255))) / 255.0f : tk2.c(tk2.b((short) pv8.b(pv8.b(j2 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static int z(long j2) {
        return pv8.e(j2);
    }

    public final /* synthetic */ long B() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return s(this.a, obj);
    }

    public int hashCode() {
        return z(this.a);
    }

    public String toString() {
        return A(this.a);
    }
}
