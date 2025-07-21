package com.nytimes.subauth.ui.purr.ui.theme;

import androidx.compose.runtime.CompositionLocalKt;
import defpackage.m76;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.ro0;
import defpackage.t96;
import defpackage.vn0;

/* loaded from: classes4.dex */
public abstract class PurrUIColorsKt {
    private static final t96 a;
    private static final t96 b;
    private static final m76 c;
    private static final m76 d;

    static {
        ro0 l = vn0.l();
        long n = vn0.n();
        long q = vn0.q();
        long m = vn0.m();
        long p = vn0.p();
        long o = vn0.o();
        long u = vn0.u();
        long r = vn0.r();
        long s = vn0.s();
        long t = vn0.t();
        nn0.a aVar = nn0.b;
        a = new t96(l, n, q, m, p, o, u, r, s, t, aVar.a(), aVar.a(), vn0.c(), null);
        b = new t96(vn0.a(), vn0.d(), vn0.g(), vn0.b(), vn0.f(), vn0.e(), vn0.k(), vn0.h(), vn0.i(), vn0.j(), aVar.h(), aVar.a(), vn0.g(), null);
        c = CompositionLocalKt.e(new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.theme.PurrUIColorsKt$PurrUILocalColors$1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t96 mo865invoke() {
                return PurrUIColorsKt.c();
            }
        });
        d = CompositionLocalKt.e(new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.theme.PurrUIColorsKt$PurrDarkUILocalColors$1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t96 mo865invoke() {
                return PurrUIColorsKt.b();
            }
        });
    }

    public static final m76 a() {
        return d;
    }

    public static final t96 b() {
        return b;
    }

    public static final t96 c() {
        return a;
    }

    public static final m76 d() {
        return c;
    }
}
