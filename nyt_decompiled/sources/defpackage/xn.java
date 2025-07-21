package defpackage;

import kotlin.text.h;

/* loaded from: classes5.dex */
public final class xn implements CharSequence {
    private final char[] a;
    private int b;

    public xn(char[] cArr) {
        zq3.h(cArr, "buffer");
        this.a = cArr;
        this.b = cArr.length;
    }

    public char b(int i) {
        return this.a[i];
    }

    public int c() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return b(i);
    }

    public void d(int i) {
        this.b = i;
    }

    public final String e(int i, int i2) {
        return h.q(this.a, i, Math.min(i2, length()));
    }

    public final void f(int i) {
        d(Math.min(this.a.length, i));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return h.q(this.a, i, Math.min(i2, length()));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return e(0, length());
    }
}
