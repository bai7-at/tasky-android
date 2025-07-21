package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.g;

/* loaded from: classes2.dex */
public final class y31 implements g {
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float r;
    public final int s;
    public final float t;
    public static final y31 u = new b().o("").a();
    private static final String w = z19.t0(0);
    private static final String x = z19.t0(1);
    private static final String y = z19.t0(2);
    private static final String B = z19.t0(3);
    private static final String H = z19.t0(4);
    private static final String L = z19.t0(5);
    private static final String M = z19.t0(6);
    private static final String N = z19.t0(7);
    private static final String Q = z19.t0(8);
    private static final String S = z19.t0(9);
    private static final String X = z19.t0(10);
    private static final String Y = z19.t0(11);
    private static final String Z = z19.t0(12);
    private static final String e0 = z19.t0(13);
    private static final String f0 = z19.t0(14);
    private static final String g0 = z19.t0(15);
    private static final String h0 = z19.t0(16);
    public static final g.a i0 = new g.a() { // from class: x31
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            y31 d;
            d = y31.d(bundle);
            return d;
        }
    };

    public static final class b {
        private CharSequence a;
        private Bitmap b;
        private Layout.Alignment c;
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private int o;
        private int p;
        private float q;

        public y31 a() {
            return new y31(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }

        public b b() {
            this.n = false;
            return this;
        }

        public int c() {
            return this.g;
        }

        public int d() {
            return this.i;
        }

        public CharSequence e() {
            return this.a;
        }

        public b f(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public b g(float f) {
            this.m = f;
            return this;
        }

        public b h(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public b i(int i) {
            this.g = i;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b k(float f) {
            this.h = f;
            return this;
        }

        public b l(int i) {
            this.i = i;
            return this;
        }

        public b m(float f) {
            this.q = f;
            return this;
        }

        public b n(float f) {
            this.l = f;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public b q(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        public b r(int i) {
            this.p = i;
            return this;
        }

        public b s(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = RecyclerView.UNDEFINED_DURATION;
            this.g = RecyclerView.UNDEFINED_DURATION;
            this.h = -3.4028235E38f;
            this.i = RecyclerView.UNDEFINED_DURATION;
            this.j = RecyclerView.UNDEFINED_DURATION;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = RecyclerView.UNDEFINED_DURATION;
        }

        private b(y31 y31Var) {
            this.a = y31Var.a;
            this.b = y31Var.d;
            this.c = y31Var.b;
            this.d = y31Var.c;
            this.e = y31Var.e;
            this.f = y31Var.f;
            this.g = y31Var.g;
            this.h = y31Var.h;
            this.i = y31Var.i;
            this.j = y31Var.n;
            this.k = y31Var.r;
            this.l = y31Var.j;
            this.m = y31Var.k;
            this.n = y31Var.l;
            this.o = y31Var.m;
            this.p = y31Var.s;
            this.q = y31Var.t;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y31 d(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(w);
        if (charSequence != null) {
            bVar.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(x);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(y);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(B);
        if (bitmap != null) {
            bVar.f(bitmap);
        }
        String str = H;
        if (bundle.containsKey(str)) {
            String str2 = L;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = M;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = N;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = Q;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            String str7 = S;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = Y;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = e0;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f0, false)) {
            bVar.b();
        }
        String str11 = g0;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = h0;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(w, this.a);
        bundle.putSerializable(x, this.b);
        bundle.putSerializable(y, this.c);
        bundle.putParcelable(B, this.d);
        bundle.putFloat(H, this.e);
        bundle.putInt(L, this.f);
        bundle.putInt(M, this.g);
        bundle.putFloat(N, this.h);
        bundle.putInt(Q, this.i);
        bundle.putInt(S, this.n);
        bundle.putFloat(X, this.r);
        bundle.putFloat(Y, this.j);
        bundle.putFloat(Z, this.k);
        bundle.putBoolean(f0, this.l);
        bundle.putInt(e0, this.m);
        bundle.putInt(g0, this.s);
        bundle.putFloat(h0, this.t);
        return bundle;
    }

    public b c() {
        return new b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || y31.class != obj.getClass()) {
            return false;
        }
        y31 y31Var = (y31) obj;
        return TextUtils.equals(this.a, y31Var.a) && this.b == y31Var.b && this.c == y31Var.c && ((bitmap = this.d) != null ? !((bitmap2 = y31Var.d) == null || !bitmap.sameAs(bitmap2)) : y31Var.d == null) && this.e == y31Var.e && this.f == y31Var.f && this.g == y31Var.g && this.h == y31Var.h && this.i == y31Var.i && this.j == y31Var.j && this.k == y31Var.k && this.l == y31Var.l && this.m == y31Var.m && this.n == y31Var.n && this.r == y31Var.r && this.s == y31Var.s && this.t == y31Var.t;
    }

    public int hashCode() {
        return hc5.b(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.r), Integer.valueOf(this.s), Float.valueOf(this.t));
    }

    private y31(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            ur.e(bitmap);
        } else {
            ur.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z;
        this.m = i5;
        this.n = i4;
        this.r = f3;
        this.s = i6;
        this.t = f6;
    }
}
