package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class zo2 {
    private boolean a;

    public zo2(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final void b(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo2) && this.a == ((zo2) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "ForegroundState(isInForeground=" + this.a + ")";
    }

    public /* synthetic */ zo2(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
