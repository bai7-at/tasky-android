package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.bu5;
import defpackage.c04;
import defpackage.cg;
import defpackage.dh8;
import defpackage.du7;
import defpackage.fd5;
import defpackage.fv0;
import defpackage.gv1;
import defpackage.io5;
import defpackage.ip5;
import defpackage.jo7;
import defpackage.kt6;
import defpackage.mg;
import defpackage.ph0;
import defpackage.ph8;
import defpackage.pi9;
import defpackage.pj8;
import defpackage.q44;
import defpackage.qs2;
import defpackage.uo6;
import defpackage.vf;
import defpackage.wd;
import defpackage.yc0;
import defpackage.yf;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class AndroidParagraph implements io5 {
    private final AndroidParagraphIntrinsics a;
    private final int b;
    private final boolean c;
    private final long d;
    private final TextLayout e;
    private final CharSequence f;
    private final List g;
    private final c04 h;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, z, j);
    }

    private final TextLayout D(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return new TextLayout(this.f, getWidth(), H(), i, truncateAt, this.a.j(), 1.0f, 0.0f, vf.b(this.a.i()), true, i3, i5, i6, i7, i4, i2, null, null, this.a.h(), 196736, null);
    }

    private final ShaderBrushSpan[] F(TextLayout textLayout) {
        if (!(textLayout.E() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        CharSequence E = textLayout.E();
        zq3.f(E, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) E).getSpans(0, textLayout.E().length(), ShaderBrushSpan.class);
        return shaderBrushSpanArr.length == 0 ? new ShaderBrushSpan[0] : shaderBrushSpanArr;
    }

    private final pi9 I() {
        return (pi9) this.h.getValue();
    }

    private final void J(ph0 ph0Var) {
        Canvas d = wd.d(ph0Var);
        if (n()) {
            d.save();
            d.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.e.H(d);
        if (n()) {
            d.restore();
        }
    }

    @Override // defpackage.io5
    public kt6 A(int i) {
        if (i >= 0 && i < this.f.length()) {
            RectF b = this.e.b(i);
            return new kt6(b.left, b.top, b.right, b.bottom);
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0," + this.f.length() + ')').toString());
    }

    @Override // defpackage.io5
    public List B() {
        return this.g;
    }

    public final float E(int i) {
        return this.e.j(i);
    }

    public final Locale G() {
        return this.a.k().getTextLocale();
    }

    public final mg H() {
        return this.a.k();
    }

    @Override // defpackage.io5
    public float a() {
        return this.a.a();
    }

    @Override // defpackage.io5
    public float b() {
        return this.a.b();
    }

    @Override // defpackage.io5
    public ResolvedTextDirection c(int i) {
        return this.e.y(this.e.p(i)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // defpackage.io5
    public float d(int i) {
        return this.e.v(i);
    }

    @Override // defpackage.io5
    public kt6 e(int i) {
        if (i >= 0 && i <= this.f.length()) {
            float A = TextLayout.A(this.e, i, false, 2, null);
            int p = this.e.p(i);
            return new kt6(A, this.e.v(p), A, this.e.k(p));
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0," + this.f.length() + ']').toString());
    }

    @Override // defpackage.io5
    public long f(int i) {
        return pj8.b(I().b(i), I().a(i));
    }

    @Override // defpackage.io5
    public float g() {
        return E(0);
    }

    @Override // defpackage.io5
    public float getHeight() {
        return this.e.e();
    }

    @Override // defpackage.io5
    public float getWidth() {
        return fv0.n(this.d);
    }

    @Override // defpackage.io5
    public int i(long j) {
        return this.e.x(this.e.q((int) fd5.p(j)), fd5.o(j));
    }

    @Override // defpackage.io5
    public int j(int i) {
        return this.e.u(i);
    }

    @Override // defpackage.io5
    public int k(int i, boolean z) {
        return z ? this.e.w(i) : this.e.o(i);
    }

    @Override // defpackage.io5
    public int l() {
        return this.e.l();
    }

    @Override // defpackage.io5
    public float m(int i) {
        return this.e.t(i);
    }

    @Override // defpackage.io5
    public boolean n() {
        return this.e.c();
    }

    @Override // defpackage.io5
    public int o(float f) {
        return this.e.q((int) f);
    }

    @Override // defpackage.io5
    public ip5 p(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= this.f.length()) {
            Path path = new Path();
            this.e.D(i, i2, path);
            return cg.b(path);
        }
        throw new IllegalArgumentException(("start(" + i + ") or end(" + i2 + ") is out of range [0.." + this.f.length() + "], or start > end!").toString());
    }

    @Override // defpackage.io5
    public float q(int i, boolean z) {
        return z ? TextLayout.A(this.e, i, false, 2, null) : TextLayout.C(this.e, i, false, 2, null);
    }

    @Override // defpackage.io5
    public void r(ph0 ph0Var, yc0 yc0Var, float f, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i) {
        int a2 = H().a();
        mg H = H();
        H.c(yc0Var, du7.a(getWidth(), getHeight()), f);
        H.f(jo7Var);
        H.g(ph8Var);
        H.e(gv1Var);
        H.b(i);
        J(ph0Var);
        H().b(a2);
    }

    @Override // defpackage.io5
    public float s(int i) {
        return this.e.s(i);
    }

    @Override // defpackage.io5
    public void u(long j, float[] fArr, int i) {
        this.e.a(i.l(j), i.k(j), fArr, i);
    }

    @Override // defpackage.io5
    public float v() {
        return E(l() - 1);
    }

    @Override // defpackage.io5
    public void w(ph0 ph0Var, long j, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i) {
        int a2 = H().a();
        mg H = H();
        H.d(j);
        H.f(jo7Var);
        H.g(ph8Var);
        H.e(gv1Var);
        H.b(i);
        J(ph0Var);
        H().b(a2);
    }

    @Override // defpackage.io5
    public int x(int i) {
        return this.e.p(i);
    }

    @Override // defpackage.io5
    public ResolvedTextDirection y(int i) {
        return this.e.G(i) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // defpackage.io5
    public float z(int i) {
        return this.e.k(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j) {
        boolean k;
        int l;
        int n;
        int m;
        int o;
        int p;
        List list;
        kt6 kt6Var;
        float q;
        float j2;
        int b;
        float v;
        float f;
        float j3;
        int j4;
        this.a = androidParagraphIntrinsics;
        this.b = i;
        this.c = z;
        this.d = j;
        if (fv0.o(j) != 0 || fv0.p(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        j i2 = androidParagraphIntrinsics.i();
        k = yf.k(i2, z);
        this.f = k ? yf.i(androidParagraphIntrinsics.f()) : androidParagraphIntrinsics.f();
        l = yf.l(i2.D());
        boolean k2 = dh8.k(i2.D(), dh8.b.c());
        n = yf.n(i2.z().c());
        m = yf.m(q44.g(i2.v()));
        o = yf.o(q44.h(i2.v()));
        p = yf.p(q44.i(i2.v()));
        TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
        TextLayout D = D(l, k2 ? 1 : 0, truncateAt, i, n, m, o, p);
        if (!z || D.e() <= fv0.m(j) || i <= 1) {
            this.e = D;
        } else {
            j4 = yf.j(D, fv0.m(j));
            if (j4 >= 0 && j4 != i) {
                D = D(l, k2 ? 1 : 0, truncateAt, uo6.d(j4, 1), n, m, o, p);
            }
            this.e = D;
        }
        H().c(i2.k(), du7.a(getWidth(), getHeight()), i2.h());
        for (ShaderBrushSpan shaderBrushSpan : F(this.e)) {
            shaderBrushSpan.c(du7.a(getWidth(), getHeight()));
        }
        CharSequence charSequence = this.f;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), bu5.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                bu5 bu5Var = (bu5) obj;
                int spanStart = spanned.getSpanStart(bu5Var);
                int spanEnd = spanned.getSpanEnd(bu5Var);
                int p2 = this.e.p(spanStart);
                Object[] objArr = p2 >= this.b;
                Object[] objArr2 = this.e.m(p2) > 0 && spanEnd > this.e.n(p2);
                Object[] objArr3 = spanEnd > this.e.o(p2);
                if (objArr2 == true || objArr3 == true || objArr == true) {
                    kt6Var = null;
                } else {
                    int i3 = a.a[y(spanStart).ordinal()];
                    if (i3 == 1) {
                        q = q(spanStart, true);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        q = q(spanStart, true) - bu5Var.d();
                    }
                    float d = bu5Var.d() + q;
                    TextLayout textLayout = this.e;
                    switch (bu5Var.c()) {
                        case 0:
                            j2 = textLayout.j(p2);
                            b = bu5Var.b();
                            v = j2 - b;
                            kt6Var = new kt6(q, v, d, bu5Var.b() + v);
                            break;
                        case 1:
                            v = textLayout.v(p2);
                            kt6Var = new kt6(q, v, d, bu5Var.b() + v);
                            break;
                        case 2:
                            j2 = textLayout.k(p2);
                            b = bu5Var.b();
                            v = j2 - b;
                            kt6Var = new kt6(q, v, d, bu5Var.b() + v);
                            break;
                        case 3:
                            v = ((textLayout.v(p2) + textLayout.k(p2)) - bu5Var.b()) / 2;
                            kt6Var = new kt6(q, v, d, bu5Var.b() + v);
                            break;
                        case 4:
                            f = bu5Var.a().ascent;
                            j3 = textLayout.j(p2);
                            v = f + j3;
                            kt6Var = new kt6(q, v, d, bu5Var.b() + v);
                            break;
                        case 5:
                            v = (bu5Var.a().descent + textLayout.j(p2)) - bu5Var.b();
                            kt6Var = new kt6(q, v, d, bu5Var.b() + v);
                            break;
                        case 6:
                            Paint.FontMetricsInt a2 = bu5Var.a();
                            f = ((a2.ascent + a2.descent) - bu5Var.b()) / 2;
                            j3 = textLayout.j(p2);
                            v = f + j3;
                            kt6Var = new kt6(q, v, d, bu5Var.b() + v);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(kt6Var);
            }
            list = arrayList;
        } else {
            list = kotlin.collections.i.l();
        }
        this.g = list;
        this.h = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final pi9 mo865invoke() {
                TextLayout textLayout2;
                Locale G = AndroidParagraph.this.G();
                textLayout2 = AndroidParagraph.this.e;
                return new pi9(G, textLayout2.E());
            }
        });
    }
}
