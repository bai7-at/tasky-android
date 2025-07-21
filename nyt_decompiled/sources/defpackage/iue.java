package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
final class iue {
    private final Class a;
    private final Class b;

    /* synthetic */ iue(Class cls, Class cls2, hue hueVar) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iue)) {
            return false;
        }
        iue iueVar = (iue) obj;
        return iueVar.a.equals(this.a) && iueVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
