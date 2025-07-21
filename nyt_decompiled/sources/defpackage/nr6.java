package defpackage;

/* loaded from: classes.dex */
public final class nr6 implements fu7 {
    private final au7 b;

    public nr6(au7 au7Var) {
        this.b = au7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr6) && zq3.c(this.b, ((nr6) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.fu7
    public Object r(by0 by0Var) {
        return this.b;
    }
}
