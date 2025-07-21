package defpackage;

/* loaded from: classes.dex */
public final class eg implements px5 {
    private final int b;

    public eg(int i) {
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(eg.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.b == ((eg) obj).b;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.b + ')';
    }
}
