package defpackage;

import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.b;
import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.e;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public abstract class wn0 {
    public static final long a(float f, float f2, float f3, float f4, c cVar) {
        float d = cVar.d(0);
        if (f <= cVar.c(0) && d <= f) {
            float d2 = cVar.d(1);
            if (f2 <= cVar.c(1) && d2 <= f2) {
                float d3 = cVar.d(2);
                if (f3 <= cVar.c(2) && d3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (cVar.g()) {
                        return nn0.o(pv8.b(pv8.b(pv8.b((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (cVar.a() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int b = cVar.b();
                    if (b == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short a = tk2.a(f);
                    return nn0.o(pv8.b(pv8.b(pv8.b(pv8.b(pv8.b(pv8.b(pv8.b(tk2.a(f2)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | pv8.b(pv8.b(pv8.b(a) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | pv8.b(pv8.b(pv8.b(tk2.a(f3)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | pv8.b(pv8.b(pv8.b((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | pv8.b(pv8.b(b) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + cVar).toString());
    }

    public static final long b(int i) {
        return nn0.o(pv8.b(pv8.b(i) << 32));
    }

    public static final long c(int i, int i2, int i3, int i4) {
        return b(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long d(long j) {
        return nn0.o(pv8.b(pv8.b(pv8.b(j) & 4294967295L) << 32));
    }

    public static /* synthetic */ long e(float f, float f2, float f3, float f4, c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            cVar = e.a.w();
        }
        return a(f, f2, f3, f4, cVar);
    }

    public static /* synthetic */ long f(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return c(i, i2, i3, i4);
    }

    public static final long g(long j, long j2) {
        long p = nn0.p(j, nn0.w(j2));
        float u = nn0.u(j2);
        float u2 = nn0.u(p);
        float f = 1.0f - u2;
        float f2 = (u * f) + u2;
        return a(f2 == 0.0f ? 0.0f : ((nn0.y(p) * u2) + ((nn0.y(j2) * u) * f)) / f2, f2 == 0.0f ? 0.0f : ((nn0.x(p) * u2) + ((nn0.x(j2) * u) * f)) / f2, f2 != 0.0f ? ((nn0.v(p) * u2) + ((nn0.v(j2) * u) * f)) / f2 : 0.0f, f2, nn0.w(j2));
    }

    public static final long h(long j, long j2, float f) {
        c t = e.a.t();
        long p = nn0.p(j, t);
        long p2 = nn0.p(j2, t);
        float u = nn0.u(p);
        float y = nn0.y(p);
        float x = nn0.x(p);
        float v = nn0.v(p);
        float u2 = nn0.u(p2);
        float y2 = nn0.y(p2);
        float x2 = nn0.x(p2);
        float v2 = nn0.v(p2);
        return nn0.p(a(cg4.a(y, y2, f), cg4.a(x, x2, f), cg4.a(v, v2, f), cg4.a(u, u2, f), t), nn0.w(j2));
    }

    public static final float i(long j) {
        c w = nn0.w(j);
        if (!b.e(w.e(), b.a.b())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) b.h(w.e()))).toString());
        }
        zq3.f(w, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        st1 E = ((Rgb) w).E();
        return j((float) ((E.a(nn0.y(j)) * 0.2126d) + (E.a(nn0.x(j)) * 0.7152d) + (E.a(nn0.v(j)) * 0.0722d)));
    }

    private static final float j(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    public static final int k(long j) {
        return (int) pv8.b(nn0.p(j, e.a.w()) >>> 32);
    }
}
