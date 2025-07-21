package defpackage;

/* loaded from: classes4.dex */
public final class hi0 {
    private final int a;
    private final int b;

    public hi0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return this.a == hi0Var.a && this.b == hi0Var.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "CarouselItemModel(image=" + this.a + ", description=" + this.b + ")";
    }
}
