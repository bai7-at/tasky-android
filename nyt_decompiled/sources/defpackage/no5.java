package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class no5 {
    private final int a;
    private final int b;
    private final long c;
    private final ni8 d;
    private final uu5 e;
    private final u44 f;
    private final int g;
    private final int h;
    private final ij8 i;

    public /* synthetic */ no5(int i, int i2, long j, ni8 ni8Var, uu5 uu5Var, u44 u44Var, int i3, int i4, ij8 ij8Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, ni8Var, uu5Var, u44Var, i3, i4, ij8Var);
    }

    public final no5 a(int i, int i2, long j, ni8 ni8Var, uu5 uu5Var, u44 u44Var, int i3, int i4, ij8 ij8Var) {
        return new no5(i, i2, j, ni8Var, uu5Var, u44Var, i3, i4, ij8Var, null);
    }

    public final int c() {
        return this.h;
    }

    public final int d() {
        return this.g;
    }

    public final long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no5)) {
            return false;
        }
        no5 no5Var = (no5) obj;
        return dh8.k(this.a, no5Var.a) && uh8.j(this.b, no5Var.b) && dk8.e(this.c, no5Var.c) && zq3.c(this.d, no5Var.d) && zq3.c(this.e, no5Var.e) && zq3.c(this.f, no5Var.f) && q44.f(this.g, no5Var.g) && yd3.g(this.h, no5Var.h) && zq3.c(this.i, no5Var.i);
    }

    public final u44 f() {
        return this.f;
    }

    public final uu5 g() {
        return this.e;
    }

    public final int h() {
        return this.a;
    }

    public int hashCode() {
        int l = ((((dh8.l(this.a) * 31) + uh8.k(this.b)) * 31) + dk8.i(this.c)) * 31;
        ni8 ni8Var = this.d;
        int hashCode = (l + (ni8Var != null ? ni8Var.hashCode() : 0)) * 31;
        uu5 uu5Var = this.e;
        int hashCode2 = (hashCode + (uu5Var != null ? uu5Var.hashCode() : 0)) * 31;
        u44 u44Var = this.f;
        int hashCode3 = (((((hashCode2 + (u44Var != null ? u44Var.hashCode() : 0)) * 31) + q44.j(this.g)) * 31) + yd3.h(this.h)) * 31;
        ij8 ij8Var = this.i;
        return hashCode3 + (ij8Var != null ? ij8Var.hashCode() : 0);
    }

    public final int i() {
        return this.b;
    }

    public final ni8 j() {
        return this.d;
    }

    public final ij8 k() {
        return this.i;
    }

    public final no5 l(no5 no5Var) {
        return no5Var == null ? this : oo5.a(this, no5Var.a, no5Var.b, no5Var.c, no5Var.d, no5Var.e, no5Var.f, no5Var.g, no5Var.h, no5Var.i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) dh8.m(this.a)) + ", textDirection=" + ((Object) uh8.l(this.b)) + ", lineHeight=" + ((Object) dk8.j(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) q44.k(this.g)) + ", hyphens=" + ((Object) yd3.i(this.h)) + ", textMotion=" + this.i + ')';
    }

    private no5(int i, int i2, long j, ni8 ni8Var, uu5 uu5Var, u44 u44Var, int i3, int i4, ij8 ij8Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = ni8Var;
        this.e = uu5Var;
        this.f = u44Var;
        this.g = i3;
        this.h = i4;
        this.i = ij8Var;
        if (dk8.e(j, dk8.b.a()) || dk8.h(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + dk8.h(j) + ')').toString());
    }

    public /* synthetic */ no5(int i, int i2, long j, ni8 ni8Var, uu5 uu5Var, u44 u44Var, int i3, int i4, ij8 ij8Var, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? dh8.b.g() : i, (i5 & 2) != 0 ? uh8.b.f() : i2, (i5 & 4) != 0 ? dk8.b.a() : j, (i5 & 8) != 0 ? null : ni8Var, (i5 & 16) != 0 ? null : uu5Var, (i5 & 32) != 0 ? null : u44Var, (i5 & 64) != 0 ? q44.b.b() : i3, (i5 & 128) != 0 ? yd3.b.c() : i4, (i5 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0 ? ij8Var : null, null);
    }
}
