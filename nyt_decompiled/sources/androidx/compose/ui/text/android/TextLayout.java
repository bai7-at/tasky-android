package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import defpackage.c04;
import defpackage.eh8;
import defpackage.fz3;
import defpackage.j59;
import defpackage.kb0;
import defpackage.lh8;
import defpackage.lz3;
import defpackage.n18;
import defpackage.o60;
import defpackage.qs2;
import defpackage.v44;
import defpackage.xi3;
import defpackage.zi8;
import defpackage.zq3;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;

/* loaded from: classes.dex */
public final class TextLayout {
    private final boolean a;
    private final boolean b;
    private final lz3 c;
    private final boolean d;
    private final Layout e;
    private final int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;
    private final boolean k;
    private final Paint.FontMetricsInt l;
    private final int m;
    private final v44[] n;
    private final Rect o;
    private final c04 p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, lz3 lz3Var) {
        boolean z3;
        boolean z4;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout a;
        long k;
        v44[] i9;
        long h;
        Paint.FontMetricsInt g;
        this.a = z;
        this.b = z2;
        this.c = lz3Var;
        this.o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic j = zi8.j(i2);
        Layout.Alignment a2 = eh8.a.a(i);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, o60.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a3 = lz3Var.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a3 == null || lz3Var.b() > f || z5) {
                z3 = true;
                this.k = false;
                z4 = false;
                textDirectionHeuristic = j;
                a = n18.a.a(charSequence, textPaint, ceil, 0, charSequence.length(), j, a2, i3, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            } else {
                this.k = true;
                z3 = true;
                a = kb0.a.a(charSequence, textPaint, ceil, a3, a2, z, z2, truncateAt, ceil);
                textDirectionHeuristic = j;
                z4 = false;
            }
            this.e = a;
            Trace.endSection();
            int min = Math.min(a.getLineCount(), i3);
            this.f = min;
            int i10 = min - 1;
            this.d = (min >= i3 && (a.getEllipsisCount(i10) > 0 || a.getLineEnd(i10) != charSequence.length())) ? z3 : z4;
            k = zi8.k(this);
            i9 = zi8.i(this);
            this.n = i9;
            h = zi8.h(this, i9);
            this.g = Math.max(j59.c(k), j59.c(h));
            this.h = Math.max(j59.b(k), j59.b(h));
            g = zi8.g(this, textPaint, textDirectionHeuristic, i9);
            this.m = g != null ? g.bottom - ((int) r(i10)) : z4;
            this.l = g;
            this.i = xi3.b(a, i10, null, 2, null);
            this.j = xi3.d(a, i10, null, 2, null);
            this.p = c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: androidx.compose.ui.text.android.TextLayout$layoutHelper$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final fz3 mo865invoke() {
                    return new fz3(TextLayout.this.h());
                }
            });
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float A(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.z(i, z);
    }

    public static /* synthetic */ float C(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.B(i, z);
    }

    private final float f(int i) {
        if (i == this.f - 1) {
            return this.i + this.j;
        }
        return 0.0f;
    }

    private final fz3 i() {
        return (fz3) this.p.getValue();
    }

    public final float B(int i, boolean z) {
        return i().c(i, false, z) + f(p(i));
    }

    public final void D(int i, int i2, Path path) {
        this.e.getSelectionPath(i, i2, path);
        if (this.g == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.g);
    }

    public final CharSequence E() {
        return this.e.getText();
    }

    public final boolean F() {
        if (this.k) {
            kb0 kb0Var = kb0.a;
            Layout layout = this.e;
            zq3.f(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return kb0Var.b((BoringLayout) layout);
        }
        n18 n18Var = n18.a;
        Layout layout2 = this.e;
        zq3.f(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return n18Var.c((StaticLayout) layout2, this.b);
    }

    public final boolean G(int i) {
        return this.e.isRtlCharAt(i);
    }

    public final void H(Canvas canvas) {
        lh8 lh8Var;
        if (canvas.getClipBounds(this.o)) {
            int i = this.g;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            lh8Var = zi8.a;
            lh8Var.a(canvas);
            this.e.draw(lh8Var);
            int i2 = this.g;
            if (i2 != 0) {
                canvas.translate(0.0f, (-1) * i2);
            }
        }
    }

    public final void a(int i, int i2, float[] fArr, int i3) {
        float d;
        float e;
        int length = E().length();
        if (i < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (i >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (i2 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i3 < (i2 - i) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int p = p(i);
        int p2 = p(i2 - 1);
        a aVar = new a(this);
        if (p > p2) {
            return;
        }
        while (true) {
            int u = u(p);
            int o = o(p);
            int min = Math.min(i2, o);
            float v = v(p);
            float k = k(p);
            boolean z = y(p) == 1;
            for (int max = Math.max(i, u); max < min; max++) {
                boolean G = G(max);
                if (z && !G) {
                    d = aVar.b(max);
                    e = aVar.c(max + 1);
                } else if (z && G) {
                    e = aVar.d(max);
                    d = aVar.e(max + 1);
                } else if (z || !G) {
                    d = aVar.d(max);
                    e = aVar.e(max + 1);
                } else {
                    e = aVar.b(max);
                    d = aVar.c(max + 1);
                }
                fArr[i3] = d;
                fArr[i3 + 1] = v;
                fArr[i3 + 2] = e;
                fArr[i3 + 3] = k;
                i3 += 4;
            }
            if (p == p2) {
                return;
            } else {
                p++;
            }
        }
    }

    public final RectF b(int i) {
        float B;
        float B2;
        float z;
        float z2;
        int p = p(i);
        float v = v(p);
        float k = k(p);
        boolean z3 = y(p) == 1;
        boolean isRtlCharAt = this.e.isRtlCharAt(i);
        if (!z3 || isRtlCharAt) {
            if (z3 && isRtlCharAt) {
                z = B(i, false);
                z2 = B(i + 1, true);
            } else if (isRtlCharAt) {
                z = z(i, false);
                z2 = z(i + 1, true);
            } else {
                B = B(i, false);
                B2 = B(i + 1, true);
            }
            float f = z;
            B = z2;
            B2 = f;
        } else {
            B = z(i, false);
            B2 = z(i + 1, true);
        }
        return new RectF(B, v, B2, k);
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public final int e() {
        return (this.d ? this.e.getLineBottom(this.f - 1) : this.e.getHeight()) + this.g + this.h + this.m;
    }

    public final boolean g() {
        return this.a;
    }

    public final Layout h() {
        return this.e;
    }

    public final float j(int i) {
        return this.g + ((i != this.f + (-1) || this.l == null) ? this.e.getLineBaseline(i) : v(i) - this.l.ascent);
    }

    public final float k(int i) {
        if (i != this.f - 1 || this.l == null) {
            return this.g + this.e.getLineBottom(i) + (i == this.f + (-1) ? this.h : 0);
        }
        return this.e.getLineBottom(i - 1) + this.l.bottom;
    }

    public final int l() {
        return this.f;
    }

    public final int m(int i) {
        return this.e.getEllipsisCount(i);
    }

    public final int n(int i) {
        return this.e.getEllipsisStart(i);
    }

    public final int o(int i) {
        return this.e.getEllipsisStart(i) == 0 ? this.e.getLineEnd(i) : this.e.getText().length();
    }

    public final int p(int i) {
        return this.e.getLineForOffset(i);
    }

    public final int q(int i) {
        return this.e.getLineForVertical(i - this.g);
    }

    public final float r(int i) {
        return k(i) - v(i);
    }

    public final float s(int i) {
        return this.e.getLineLeft(i) + (i == this.f + (-1) ? this.i : 0.0f);
    }

    public final float t(int i) {
        return this.e.getLineRight(i) + (i == this.f + (-1) ? this.j : 0.0f);
    }

    public final int u(int i) {
        return this.e.getLineStart(i);
    }

    public final float v(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final int w(int i) {
        if (this.e.getEllipsisStart(i) == 0) {
            return i().d(i);
        }
        return this.e.getEllipsisStart(i) + this.e.getLineStart(i);
    }

    public final int x(int i, float f) {
        return this.e.getOffsetForHorizontal(i, f + ((-1) * f(i)));
    }

    public final int y(int i) {
        return this.e.getParagraphDirection(i);
    }

    public final float z(int i, boolean z) {
        return i().c(i, true, z) + f(p(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, defpackage.lz3 r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], lz3, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
