package defpackage;

import defpackage.gy7;

/* loaded from: classes5.dex */
final class e20 extends gy7.a {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    e20(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    @Override // gy7.a, defpackage.gy7
    public int c() {
        return this.g;
    }

    @Override // defpackage.gy7
    public int d() {
        return this.b;
    }

    @Override // defpackage.gy7
    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gy7.a)) {
            return false;
        }
        gy7.a aVar = (gy7.a) obj;
        return this.b == aVar.d() && this.c == aVar.g() && this.d == aVar.h() && this.e == aVar.e() && this.f == aVar.f() && this.g == aVar.c();
    }

    @Override // defpackage.gy7
    public int f() {
        return this.f;
    }

    @Override // defpackage.gy7
    public int g() {
        return this.c;
    }

    @Override // defpackage.gy7
    public int h() {
        return this.d;
    }

    public int hashCode() {
        return this.g ^ ((((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003);
    }

    public String toString() {
        return "SpanLimitsValue{maxNumberOfAttributes=" + this.b + ", maxNumberOfEvents=" + this.c + ", maxNumberOfLinks=" + this.d + ", maxNumberOfAttributesPerEvent=" + this.e + ", maxNumberOfAttributesPerLink=" + this.f + ", maxAttributeValueLength=" + this.g + "}";
    }
}
