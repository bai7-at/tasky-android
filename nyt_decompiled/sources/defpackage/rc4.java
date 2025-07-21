package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class rc4 {
    private final int a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private Bitmap f;

    public rc4(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public rc4 a(float f) {
        rc4 rc4Var = new rc4((int) (this.a * f), (int) (this.b * f), this.c, this.d, this.e);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            rc4Var.g(Bitmap.createScaledBitmap(bitmap, rc4Var.a, rc4Var.b, true));
        }
        return rc4Var;
    }

    public Bitmap b() {
        return this.f;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.a;
    }

    public void g(Bitmap bitmap) {
        this.f = bitmap;
    }
}
