package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class f30 extends g30 {
    private final Set a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f30(Set set) {
        super(null);
        zq3.h(set, "possibleTypes");
        this.a = set;
    }

    public final Set a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f30) && zq3.c(this.a, ((f30) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "BPossibleTypes(possibleTypes=" + this.a + ')';
    }
}
