package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import defpackage.fo6;
import defpackage.hk8;
import defpackage.k99;
import defpackage.m07;
import defpackage.ny1;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class t {
    private final TextView a;
    private f0 b;
    private f0 c;
    private f0 d;
    private f0 e;
    private f0 f;
    private f0 g;
    private f0 h;
    private final u i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    class a extends m07.e {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ WeakReference c;

        a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // m07.e
        /* renamed from: h */
        public void f(int i) {
        }

        @Override // m07.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i = this.a;
            if (i != -1) {
                typeface = f.a(typeface, i, (this.b & 2) != 0);
            }
            t.this.n(this.c, typeface);
        }
    }

    class b implements Runnable {
        final /* synthetic */ TextView a;
        final /* synthetic */ Typeface b;
        final /* synthetic */ int c;

        b(TextView textView, Typeface typeface, int i) {
            this.a = textView;
            this.b = typeface;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setTypeface(this.b, this.c);
        }
    }

    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class f {
        static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    t(TextView textView) {
        this.a = textView;
        this.i = new u(textView);
    }

    private void B(int i, float f2) {
        this.i.t(i, f2);
    }

    private void C(Context context, h0 h0Var) {
        String o;
        this.j = h0Var.k(fo6.TextAppearance_android_textStyle, this.j);
        int k = h0Var.k(fo6.TextAppearance_android_textFontWeight, -1);
        this.k = k;
        if (k != -1) {
            this.j &= 2;
        }
        if (!h0Var.s(fo6.TextAppearance_android_fontFamily) && !h0Var.s(fo6.TextAppearance_fontFamily)) {
            if (h0Var.s(fo6.TextAppearance_android_typeface)) {
                this.m = false;
                int k2 = h0Var.k(fo6.TextAppearance_android_typeface, 1);
                if (k2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (k2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (k2 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i = h0Var.s(fo6.TextAppearance_fontFamily) ? fo6.TextAppearance_fontFamily : fo6.TextAppearance_android_fontFamily;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface j = h0Var.j(i, this.j, new a(i2, i3, new WeakReference(this.a)));
                if (j != null) {
                    if (this.k != -1) {
                        this.l = f.a(Typeface.create(j, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = j;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (o = h0Var.o(i)) == null) {
            return;
        }
        if (this.k != -1) {
            this.l = f.a(Typeface.create(o, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(o, this.j);
        }
    }

    private void a(Drawable drawable, f0 f0Var) {
        if (drawable == null || f0Var == null) {
            return;
        }
        j.i(drawable, f0Var, this.a.getDrawableState());
    }

    private static f0 d(Context context, j jVar, int i) {
        ColorStateList f2 = jVar.f(context, i);
        if (f2 == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.d = true;
        f0Var.a = f2;
        return f0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a2 = c.a(this.a);
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = a2[0];
            }
            if (drawable2 == null) {
                drawable2 = a2[1];
            }
            if (drawable6 == null) {
                drawable6 = a2[2];
            }
            if (drawable4 == null) {
                drawable4 = a2[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] a3 = c.a(this.a);
        Drawable drawable7 = a3[0];
        if (drawable7 != null || a3[2] != null) {
            TextView textView2 = this.a;
            if (drawable2 == null) {
                drawable2 = a3[1];
            }
            Drawable drawable8 = a3[2];
            if (drawable4 == null) {
                drawable4 = a3[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView3 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        f0 f0Var = this.h;
        this.b = f0Var;
        this.c = f0Var;
        this.d = f0Var;
        this.e = f0Var;
        this.f = f0Var;
        this.g = f0Var;
    }

    void A(int i, float f2) {
        if (k0.b || l()) {
            return;
        }
        B(i, f2);
    }

    void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] a2 = c.a(this.a);
        a(a2[0], this.f);
        a(a2[2], this.g);
    }

    void c() {
        this.i.a();
    }

    int e() {
        return this.i.f();
    }

    int f() {
        return this.i.g();
    }

    int g() {
        return this.i.h();
    }

    int[] h() {
        return this.i.i();
    }

    int i() {
        return this.i.j();
    }

    ColorStateList j() {
        f0 f0Var = this.h;
        if (f0Var != null) {
            return f0Var.a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        f0 f0Var = this.h;
        if (f0Var != null) {
            return f0Var.b;
        }
        return null;
    }

    boolean l() {
        return this.i.n();
    }

    void m(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        Context context = this.a.getContext();
        j b2 = j.b();
        h0 v = h0.v(context, attributeSet, fo6.AppCompatTextHelper, i, 0);
        TextView textView = this.a;
        k99.j0(textView, textView.getContext(), fo6.AppCompatTextHelper, attributeSet, v.r(), i, 0);
        int n = v.n(fo6.AppCompatTextHelper_android_textAppearance, -1);
        if (v.s(fo6.AppCompatTextHelper_android_drawableLeft)) {
            this.b = d(context, b2, v.n(fo6.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (v.s(fo6.AppCompatTextHelper_android_drawableTop)) {
            this.c = d(context, b2, v.n(fo6.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (v.s(fo6.AppCompatTextHelper_android_drawableRight)) {
            this.d = d(context, b2, v.n(fo6.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (v.s(fo6.AppCompatTextHelper_android_drawableBottom)) {
            this.e = d(context, b2, v.n(fo6.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (v.s(fo6.AppCompatTextHelper_android_drawableStart)) {
            this.f = d(context, b2, v.n(fo6.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (v.s(fo6.AppCompatTextHelper_android_drawableEnd)) {
            this.g = d(context, b2, v.n(fo6.AppCompatTextHelper_android_drawableEnd, 0));
        }
        v.w();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        if (n != -1) {
            h0 t = h0.t(context, n, fo6.TextAppearance);
            if (z3 || !t.s(fo6.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = t.a(fo6.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            C(context, t);
            str = t.s(fo6.TextAppearance_textLocale) ? t.o(fo6.TextAppearance_textLocale) : null;
            str2 = t.s(fo6.TextAppearance_fontVariationSettings) ? t.o(fo6.TextAppearance_fontVariationSettings) : null;
            t.w();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        h0 v2 = h0.v(context, attributeSet, fo6.TextAppearance, i, 0);
        if (z3 || !v2.s(fo6.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = v2.a(fo6.TextAppearance_textAllCaps, false);
        }
        if (v2.s(fo6.TextAppearance_textLocale)) {
            str = v2.o(fo6.TextAppearance_textLocale);
        }
        if (v2.s(fo6.TextAppearance_fontVariationSettings)) {
            str2 = v2.o(fo6.TextAppearance_fontVariationSettings);
        }
        if (v2.s(fo6.TextAppearance_android_textSize) && v2.f(fo6.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, v2);
        v2.w();
        if (!z3 && z4) {
            s(z);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.a.setTypeface(typeface, this.j);
            } else {
                this.a.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            e.d(this.a, str2);
        }
        if (str != null) {
            d.b(this.a, d.a(str));
        }
        this.i.o(attributeSet, i);
        if (k0.b && this.i.j() != 0) {
            int[] i2 = this.i.i();
            if (i2.length > 0) {
                if (e.a(this.a) != -1.0f) {
                    e.b(this.a, this.i.g(), this.i.f(), this.i.h(), 0);
                } else {
                    e.c(this.a, i2, 0);
                }
            }
        }
        h0 u = h0.u(context, attributeSet, fo6.AppCompatTextView);
        int n2 = u.n(fo6.AppCompatTextView_drawableLeftCompat, -1);
        Drawable c2 = n2 != -1 ? b2.c(context, n2) : null;
        int n3 = u.n(fo6.AppCompatTextView_drawableTopCompat, -1);
        Drawable c3 = n3 != -1 ? b2.c(context, n3) : null;
        int n4 = u.n(fo6.AppCompatTextView_drawableRightCompat, -1);
        Drawable c4 = n4 != -1 ? b2.c(context, n4) : null;
        int n5 = u.n(fo6.AppCompatTextView_drawableBottomCompat, -1);
        Drawable c5 = n5 != -1 ? b2.c(context, n5) : null;
        int n6 = u.n(fo6.AppCompatTextView_drawableStartCompat, -1);
        Drawable c6 = n6 != -1 ? b2.c(context, n6) : null;
        int n7 = u.n(fo6.AppCompatTextView_drawableEndCompat, -1);
        y(c2, c3, c4, c5, c6, n7 != -1 ? b2.c(context, n7) : null);
        if (u.s(fo6.AppCompatTextView_drawableTint)) {
            hk8.f(this.a, u.c(fo6.AppCompatTextView_drawableTint));
        }
        if (u.s(fo6.AppCompatTextView_drawableTintMode)) {
            hk8.g(this.a, w.e(u.k(fo6.AppCompatTextView_drawableTintMode, -1), null));
        }
        int f2 = u.f(fo6.AppCompatTextView_firstBaselineToTopHeight, -1);
        int f3 = u.f(fo6.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int f4 = u.f(fo6.AppCompatTextView_lineHeight, -1);
        u.w();
        if (f2 != -1) {
            hk8.i(this.a, f2);
        }
        if (f3 != -1) {
            hk8.j(this.a, f3);
        }
        if (f4 != -1) {
            hk8.k(this.a, f4);
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (k99.O(textView)) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    void o(boolean z, int i, int i2, int i3, int i4) {
        if (k0.b) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i) {
        String o;
        h0 t = h0.t(context, i, fo6.TextAppearance);
        if (t.s(fo6.TextAppearance_textAllCaps)) {
            s(t.a(fo6.TextAppearance_textAllCaps, false));
        }
        if (t.s(fo6.TextAppearance_android_textSize) && t.f(fo6.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, t);
        if (t.s(fo6.TextAppearance_fontVariationSettings) && (o = t.o(fo6.TextAppearance_fontVariationSettings)) != null) {
            e.d(this.a, o);
        }
        t.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        ny1.e(editorInfo, textView.getText());
    }

    void s(boolean z) {
        this.a.setAllCaps(z);
    }

    void t(int i, int i2, int i3, int i4) {
        this.i.p(i, i2, i3, i4);
    }

    void u(int[] iArr, int i) {
        this.i.q(iArr, i);
    }

    void v(int i) {
        this.i.r(i);
    }

    void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new f0();
        }
        f0 f0Var = this.h;
        f0Var.a = colorStateList;
        f0Var.d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new f0();
        }
        f0 f0Var = this.h;
        f0Var.b = mode;
        f0Var.c = mode != null;
        z();
    }
}
