package defpackage;

import androidx.compose.ui.text.i;

/* loaded from: classes.dex */
public final class jo5 {
    private final io5 a;
    private final int b;
    private final int c;
    private int d;
    private int e;
    private float f;
    private float g;

    public jo5(io5 io5Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = io5Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final float a() {
        return this.g;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.c - this.b;
    }

    public final io5 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo5)) {
            return false;
        }
        jo5 jo5Var = (jo5) obj;
        return zq3.c(this.a, jo5Var.a) && this.b == jo5Var.b && this.c == jo5Var.c && this.d == jo5Var.d && this.e == jo5Var.e && Float.compare(this.f, jo5Var.f) == 0 && Float.compare(this.g, jo5Var.g) == 0;
    }

    public final int f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }

    public final float h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + Float.hashCode(this.g);
    }

    public final ip5 i(ip5 ip5Var) {
        ip5Var.C(hd5.a(0.0f, this.f));
        return ip5Var;
    }

    public final kt6 j(kt6 kt6Var) {
        return kt6Var.t(hd5.a(0.0f, this.f));
    }

    public final long k(long j) {
        return pj8.b(l(i.n(j)), l(i.i(j)));
    }

    public final int l(int i) {
        return i + this.b;
    }

    public final int m(int i) {
        return i + this.d;
    }

    public final float n(float f) {
        return f + this.f;
    }

    public final long o(long j) {
        return hd5.a(fd5.o(j), fd5.p(j) - this.f);
    }

    public final int p(int i) {
        return uo6.m(i, this.b, this.c) - this.b;
    }

    public final int q(int i) {
        return i - this.d;
    }

    public final float r(float f) {
        return f - this.f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ')';
    }
}
