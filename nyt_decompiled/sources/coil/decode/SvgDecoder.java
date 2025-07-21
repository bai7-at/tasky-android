package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import coil.size.Scale;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.c;
import defpackage.au7;
import defpackage.by0;
import defpackage.dd8;
import defpackage.dg4;
import defpackage.du8;
import defpackage.ed8;
import defpackage.gm0;
import defpackage.q;
import defpackage.qs2;
import defpackage.r;
import defpackage.sc1;
import defpackage.sd0;
import defpackage.sx7;
import defpackage.tc1;
import defpackage.uc1;
import defpackage.uk5;
import defpackage.yg3;
import defpackage.zq3;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.InterruptibleKt;

/* loaded from: classes.dex */
public final class SvgDecoder implements uc1 {
    public static final a d = new a(null);
    private final yg3 a;
    private final uk5 b;
    private final boolean c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SvgDecoder(yg3 yg3Var, uk5 uk5Var, boolean z) {
        this.a = yg3Var;
        this.b = uk5Var;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair e(float f, float f2, Scale scale) {
        if (!q.a(this.b.o())) {
            au7 o = this.b.o();
            return du8.a(Float.valueOf(r.c(o.a(), scale)), Float.valueOf(r.c(o.b(), scale)));
        }
        if (f <= 0.0f) {
            f = 512.0f;
        }
        if (f2 <= 0.0f) {
            f2 = 512.0f;
        }
        return du8.a(Float.valueOf(f), Float.valueOf(f2));
    }

    @Override // defpackage.uc1
    public Object a(by0 by0Var) {
        return InterruptibleKt.runInterruptible$default(null, new qs2() { // from class: coil.decode.SvgDecoder$decode$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sc1 mo865invoke() {
                yg3 yg3Var;
                float h;
                float f;
                uk5 uk5Var;
                Pair e;
                int d2;
                int d3;
                uk5 uk5Var2;
                uk5 uk5Var3;
                uk5 uk5Var4;
                uk5 uk5Var5;
                yg3Var = SvgDecoder.this.a;
                sd0 b2 = yg3Var.b();
                try {
                    SVG l = SVG.l(b2.t1());
                    gm0.a(b2, null);
                    RectF g = l.g();
                    if (!SvgDecoder.this.f() || g == null) {
                        h = l.h();
                        f = l.f();
                    } else {
                        h = g.width();
                        f = g.height();
                    }
                    SvgDecoder svgDecoder = SvgDecoder.this;
                    uk5Var = svgDecoder.b;
                    e = svgDecoder.e(h, f, uk5Var.n());
                    float floatValue = ((Number) e.a()).floatValue();
                    float floatValue2 = ((Number) e.b()).floatValue();
                    if (h <= 0.0f || f <= 0.0f) {
                        d2 = dg4.d(floatValue);
                        d3 = dg4.d(floatValue2);
                    } else {
                        uk5Var5 = SvgDecoder.this.b;
                        float d4 = tc1.d(h, f, floatValue, floatValue2, uk5Var5.n());
                        d2 = (int) (d4 * h);
                        d3 = (int) (d4 * f);
                    }
                    if (g == null && h > 0.0f && f > 0.0f) {
                        l.s(0.0f, 0.0f, h, f);
                    }
                    l.t("100%");
                    l.r("100%");
                    uk5Var2 = SvgDecoder.this.b;
                    Bitmap createBitmap = Bitmap.createBitmap(d2, d3, r.d(uk5Var2.f()));
                    zq3.g(createBitmap, "createBitmap(width, height, config)");
                    uk5Var3 = SvgDecoder.this.b;
                    String a2 = ed8.a(uk5Var3.l());
                    l.o(new Canvas(createBitmap), a2 != null ? new c().a(a2) : null);
                    uk5Var4 = SvgDecoder.this.b;
                    return new sc1(new BitmapDrawable(uk5Var4.g().getResources(), createBitmap), true);
                } finally {
                }
            }
        }, by0Var, 1, null);
    }

    public final boolean f() {
        return this.c;
    }

    public static final class b implements uc1.a {
        private final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        private final boolean b(sx7 sx7Var) {
            return zq3.c(sx7Var.b(), "image/svg+xml") || dd8.a(tc1.a, sx7Var.c().b());
        }

        @Override // uc1.a
        public uc1 a(sx7 sx7Var, uk5 uk5Var, ImageLoader imageLoader) {
            if (b(sx7Var)) {
                return new SvgDecoder(sx7Var.c(), uk5Var, this.a);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public /* synthetic */ b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }
}
