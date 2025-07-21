package defpackage;

/* loaded from: classes5.dex */
final class w10 extends k84 {
    private final int b;
    private final int c;

    w10(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.k84
    public int c() {
        return this.c;
    }

    @Override // defpackage.k84
    public int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k84)) {
            return false;
        }
        k84 k84Var = (k84) obj;
        return this.b == k84Var.d() && this.c == k84Var.c();
    }

    public int hashCode() {
        return this.c ^ ((this.b ^ 1000003) * 1000003);
    }

    public String toString() {
        return "LogLimits{maxNumberOfAttributes=" + this.b + ", maxAttributeValueLength=" + this.c + "}";
    }
}
