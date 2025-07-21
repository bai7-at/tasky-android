package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
final class n00 extends co {
    private final List a;

    n00(List list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.a = list;
    }

    @Override // defpackage.co
    List c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof co) {
            return this.a.equals(((co) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ArrayBasedTraceState{entries=" + this.a + "}";
    }
}
