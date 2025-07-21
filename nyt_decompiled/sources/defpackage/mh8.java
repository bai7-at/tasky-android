package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import defpackage.m07;

/* loaded from: classes3.dex */
public class mh8 {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    public final float l;
    private ColorStateList m;
    private float n;
    private final int o;
    private boolean p = false;
    private Typeface q;

    class a extends m07.e {
        final /* synthetic */ oh8 a;

        a(oh8 oh8Var) {
            this.a = oh8Var;
        }

        @Override // m07.e
        /* renamed from: h */
        public void f(int i) {
            mh8.this.p = true;
            this.a.a(i);
        }

        @Override // m07.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            mh8 mh8Var = mh8.this;
            mh8Var.q = Typeface.create(typeface, mh8Var.e);
            mh8.this.p = true;
            this.a.b(mh8.this.q, false);
        }
    }

    class b extends oh8 {
        final /* synthetic */ Context a;
        final /* synthetic */ TextPaint b;
        final /* synthetic */ oh8 c;

        b(Context context, TextPaint textPaint, oh8 oh8Var) {
            this.a = context;
            this.b = textPaint;
            this.c = oh8Var;
        }

        @Override // defpackage.oh8
        public void a(int i) {
            this.c.a(i);
        }

        @Override // defpackage.oh8
        public void b(Typeface typeface, boolean z) {
            mh8.this.p(this.a, this.b, typeface);
            this.c.b(typeface, z);
        }
    }

    public mh8(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, nn6.TextAppearance);
        l(obtainStyledAttributes.getDimension(nn6.TextAppearance_android_textSize, 0.0f));
        k(tf4.a(context, obtainStyledAttributes, nn6.TextAppearance_android_textColor));
        this.a = tf4.a(context, obtainStyledAttributes, nn6.TextAppearance_android_textColorHint);
        this.b = tf4.a(context, obtainStyledAttributes, nn6.TextAppearance_android_textColorLink);
        this.e = obtainStyledAttributes.getInt(nn6.TextAppearance_android_textStyle, 0);
        this.f = obtainStyledAttributes.getInt(nn6.TextAppearance_android_typeface, 1);
        int e = tf4.e(obtainStyledAttributes, nn6.TextAppearance_fontFamily, nn6.TextAppearance_android_fontFamily);
        this.o = obtainStyledAttributes.getResourceId(e, 0);
        this.d = obtainStyledAttributes.getString(e);
        this.g = obtainStyledAttributes.getBoolean(nn6.TextAppearance_textAllCaps, false);
        this.c = tf4.a(context, obtainStyledAttributes, nn6.TextAppearance_android_shadowColor);
        this.h = obtainStyledAttributes.getFloat(nn6.TextAppearance_android_shadowDx, 0.0f);
        this.i = obtainStyledAttributes.getFloat(nn6.TextAppearance_android_shadowDy, 0.0f);
        this.j = obtainStyledAttributes.getFloat(nn6.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, nn6.MaterialTextAppearance);
        this.k = obtainStyledAttributes2.hasValue(nn6.MaterialTextAppearance_android_letterSpacing);
        this.l = obtainStyledAttributes2.getFloat(nn6.MaterialTextAppearance_android_letterSpacing, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.q == null && (str = this.d) != null) {
            this.q = Typeface.create(str, this.e);
        }
        if (this.q == null) {
            int i = this.f;
            if (i == 1) {
                this.q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.q = Typeface.SERIF;
            } else if (i != 3) {
                this.q = Typeface.DEFAULT;
            } else {
                this.q = Typeface.MONOSPACE;
            }
            this.q = Typeface.create(this.q, this.e);
        }
    }

    private boolean m(Context context) {
        if (nh8.a()) {
            return true;
        }
        int i = this.o;
        return (i != 0 ? m07.c(context, i) : null) != null;
    }

    public Typeface e() {
        d();
        return this.q;
    }

    public Typeface f(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g = m07.g(context, this.o);
                this.q = g;
                if (g != null) {
                    this.q = Typeface.create(g, this.e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.d, e);
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(Context context, oh8 oh8Var) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.o;
        if (i == 0) {
            this.p = true;
        }
        if (this.p) {
            oh8Var.b(this.q, true);
            return;
        }
        try {
            m07.i(context, i, new a(oh8Var), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            oh8Var.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.d, e);
            this.p = true;
            oh8Var.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, oh8 oh8Var) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, oh8Var));
    }

    public ColorStateList i() {
        return this.m;
    }

    public float j() {
        return this.n;
    }

    public void k(ColorStateList colorStateList) {
        this.m = colorStateList;
    }

    public void l(float f) {
        this.n = f;
    }

    public void n(Context context, TextPaint textPaint, oh8 oh8Var) {
        o(context, textPaint, oh8Var);
        ColorStateList colorStateList = this.m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.j;
        float f2 = this.h;
        float f3 = this.i;
        ColorStateList colorStateList2 = this.c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, oh8 oh8Var) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, oh8Var);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a2 = xu8.a(context, typeface);
        if (a2 != null) {
            typeface = a2;
        }
        textPaint.setTypeface(typeface);
        int i = this.e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (this.k) {
            textPaint.setLetterSpacing(this.l);
        }
    }
}
