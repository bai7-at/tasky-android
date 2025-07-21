package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.h;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes2.dex */
final class w37 implements a47 {
    private final h a;
    private final int b;
    private yp8 c;
    private long d;
    private int e;
    private int f;
    private long g;
    private long h;

    public w37(h hVar) {
        this.a = hVar;
        try {
            this.b = e(hVar.d);
            this.d = -9223372036854775807L;
            this.e = -1;
            this.f = 0;
            this.g = 0L;
            this.h = -9223372036854775807L;
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static int e(ImmutableMap immutableMap) {
        String str = (String) immutableMap.get("config");
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            xo5 xo5Var = new xo5(z19.K(str));
            int h = xo5Var.h(1);
            if (h != 0) {
                throw ParserException.b("unsupported audio mux version: " + h, null);
            }
            ur.b(xo5Var.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int h2 = xo5Var.h(6);
            ur.b(xo5Var.h(4) == 0, "Only suppors one program.");
            ur.b(xo5Var.h(3) == 0, "Only suppors one layer.");
            i = h2;
        }
        return i + 1;
    }

    private void f() {
        ((yp8) ur.e(this.c)).b(this.h, 1, this.f, 0, null);
        this.f = 0;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.d = j;
        this.f = 0;
        this.g = j2;
    }

    @Override // defpackage.a47
    public void b(a82 a82Var, int i) {
        yp8 a = a82Var.a(i, 2);
        this.c = a;
        ((yp8) z19.j(a)).d(this.a.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i) {
        ur.g(this.d == -9223372036854775807L);
        this.d = j;
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i, boolean z) {
        ur.i(this.c);
        int b = z37.b(this.e);
        if (this.f > 0 && b < i) {
            f();
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = 0;
            while (yo5Var.f() < yo5Var.g()) {
                int H = yo5Var.H();
                i3 += H;
                if (H != 255) {
                    break;
                }
            }
            this.c.a(yo5Var, i3);
            this.f += i3;
        }
        this.h = c47.a(this.g, j, this.d, this.a.b);
        if (z) {
            f();
        }
        this.e = i;
    }
}
