package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import defpackage.us4;

/* loaded from: classes.dex */
public class m {
    private static final ThreadLocal d = new ThreadLocal();
    private final int a;
    private final l b;
    private volatile int c = 0;

    m(l lVar, int i) {
        this.b = lVar;
        this.a = i;
    }

    private us4 g() {
        ThreadLocal threadLocal = d;
        us4 us4Var = (us4) threadLocal.get();
        if (us4Var == null) {
            us4Var = new us4();
            threadLocal.set(us4Var);
        }
        this.b.d().j(us4Var, this.a);
        return us4Var;
    }

    public void a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        canvas.drawText(this.b.c(), this.a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return g().h(i);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.c & 4) > 0;
    }

    public void l(boolean z) {
        int d2 = d();
        if (z) {
            this.c = d2 | 4;
        } else {
            this.c = d2;
        }
    }

    public void m(boolean z) {
        int i = this.c & 4;
        this.c = z ? i | 2 : i | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
