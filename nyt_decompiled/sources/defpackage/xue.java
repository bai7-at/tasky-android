package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
final class xue {
    private final Class a;
    private final Class b;

    /* synthetic */ xue(Class cls, Class cls2, wue wueVar) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xue)) {
            return false;
        }
        xue xueVar = (xue) obj;
        return xueVar.a.equals(this.a) && xueVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
