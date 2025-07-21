package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class qm9 {
    private final boolean a;
    private final boolean b;

    public qm9(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm9)) {
            return false;
        }
        qm9 qm9Var = (qm9) obj;
        return this.a == qm9Var.a && this.b == qm9Var.b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "YourPrivacyState(ccpaOptOutState=" + this.a + ", showPreferenceWillBeForgotten=" + this.b + ")";
    }

    public /* synthetic */ qm9(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
