package defpackage;

/* loaded from: classes4.dex */
public final class ei {
    private final int a;
    private final vx1 b;
    private final int c;

    public ei(int i, vx1 vx1Var, int i2) {
        zq3.h(vx1Var, "easing");
        this.a = i;
        this.b = vx1Var;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final vx1 c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        return this.a == eiVar.a && zq3.c(this.b, eiVar.b) && this.c == eiVar.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "AnimationSpecModel(durationMillis=" + this.a + ", easing=" + this.b + ", delayMillis=" + this.c + ")";
    }
}
