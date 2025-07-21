package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class v44 implements LineHeightSpan {
    private final float a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final float f;
    private int g = RecyclerView.UNDEFINED_DURATION;
    private int h = RecyclerView.UNDEFINED_DURATION;
    private int i = RecyclerView.UNDEFINED_DURATION;
    private int j = RecyclerView.UNDEFINED_DURATION;
    private int k;
    private int l;

    public v44(float f, int i, int i2, boolean z, boolean z2, float f2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = f2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int ceil = (int) Math.ceil(this.a);
        int a = ceil - w44.a(fontMetricsInt);
        float f = this.f;
        if (f == -1.0f) {
            f = Math.abs(fontMetricsInt.ascent) / w44.a(fontMetricsInt);
        }
        int ceil2 = (int) (a <= 0 ? Math.ceil(a * f) : Math.ceil(a * (1.0f - f)));
        int i = fontMetricsInt.descent;
        int i2 = ceil2 + i;
        this.i = i2;
        int i3 = i2 - ceil;
        this.h = i3;
        if (this.d) {
            i3 = fontMetricsInt.ascent;
        }
        this.g = i3;
        if (this.e) {
            i2 = i;
        }
        this.j = i2;
        this.k = fontMetricsInt.ascent - i3;
        this.l = i2 - i;
    }

    public final v44 b(int i, int i2, boolean z) {
        return new v44(this.a, i, i2, z, this.e, this.f);
    }

    public final int c() {
        return this.k;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (w44.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == this.b;
        boolean z2 = i2 == this.c;
        if (z && z2 && this.d && this.e) {
            return;
        }
        if (this.g == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.g : this.h;
        fontMetricsInt.descent = z2 ? this.j : this.i;
    }

    public final int d() {
        return this.l;
    }

    public final boolean e() {
        return this.e;
    }
}
