package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class e2d {
    private static final String A;
    private static final String B;
    private static final String C;
    private static final String D;
    private static final String E;
    private static final String F;
    private static final String G;
    private static final String H;
    private static final String I;
    public static final zhf J;
    public static final e2d p;
    private static final String q;
    private static final String r;
    private static final String s;
    private static final String t;
    private static final String u;
    private static final String v;
    private static final String w;
    private static final String x;
    private static final String y;
    private static final String z;
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
    public final int l;
    public final float m;
    public final int n;
    public final float o;

    static {
        zzc zzcVar = new zzc();
        zzcVar.l("");
        p = zzcVar.p();
        q = Integer.toString(0, 36);
        r = Integer.toString(17, 36);
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(18, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
        G = Integer.toString(14, 36);
        H = Integer.toString(15, 36);
        I = Integer.toString(16, 36);
        J = new zhf() { // from class: axc
        };
    }

    /* synthetic */ e2d(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, b1d b1dVar) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            wad.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else {
            this.a = charSequence != null ? charSequence.toString() : null;
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
        this.l = i4;
        this.m = f3;
        this.n = i6;
        this.o = f6;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(q, charSequence);
            CharSequence charSequence2 = this.a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> a = o5d.a((Spanned) charSequence2);
                if (!a.isEmpty()) {
                    bundle.putParcelableArrayList(r, a);
                }
            }
        }
        bundle.putSerializable(s, this.b);
        bundle.putSerializable(t, this.c);
        bundle.putFloat(w, this.e);
        bundle.putInt(x, this.f);
        bundle.putInt(y, this.g);
        bundle.putFloat(z, this.h);
        bundle.putInt(A, this.i);
        bundle.putInt(B, this.l);
        bundle.putFloat(C, this.m);
        bundle.putFloat(D, this.j);
        bundle.putFloat(E, this.k);
        bundle.putBoolean(G, false);
        bundle.putInt(F, -16777216);
        bundle.putInt(H, this.n);
        bundle.putFloat(I, this.o);
        if (this.d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            wad.f(this.d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(v, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final zzc b() {
        return new zzc(this, null);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && e2d.class == obj.getClass()) {
            e2d e2dVar = (e2d) obj;
            if (TextUtils.equals(this.a, e2dVar.a) && this.b == e2dVar.b && this.c == e2dVar.c && ((bitmap = this.d) != null ? !((bitmap2 = e2dVar.d) == null || !bitmap.sameAs(bitmap2)) : e2dVar.d == null) && this.e == e2dVar.e && this.f == e2dVar.f && this.g == e2dVar.g && this.h == e2dVar.h && this.i == e2dVar.i && this.j == e2dVar.j && this.k == e2dVar.k && this.l == e2dVar.l && this.m == e2dVar.m && this.n == e2dVar.n && this.o == e2dVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.FALSE, -16777216, Integer.valueOf(this.l), Float.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o)});
    }
}
