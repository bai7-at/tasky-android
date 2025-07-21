package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class lz3 {
    private final CharSequence a;
    private final TextPaint b;
    private final int c;
    private float d = Float.NaN;
    private float e = Float.NaN;
    private BoringLayout.Metrics f;
    private boolean g;

    public lz3(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
    }

    public final BoringLayout.Metrics a() {
        if (!this.g) {
            this.f = kb0.a.c(this.a, this.b, zi8.j(this.c));
            this.g = true;
        }
        return this.f;
    }

    public final float b() {
        boolean e;
        if (!Float.isNaN(this.d)) {
            return this.d;
        }
        Float valueOf = a() != null ? Float.valueOf(r0.width) : null;
        if (valueOf == null) {
            CharSequence charSequence = this.a;
            valueOf = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.b)));
        }
        e = nz3.e(valueOf.floatValue(), this.a, this.b);
        if (e) {
            valueOf = Float.valueOf(valueOf.floatValue() + 0.5f);
        }
        float floatValue = valueOf.floatValue();
        this.d = floatValue;
        return floatValue;
    }

    public final float c() {
        if (!Float.isNaN(this.e)) {
            return this.e;
        }
        float c = nz3.c(this.a, this.b);
        this.e = c;
        return c;
    }
}
