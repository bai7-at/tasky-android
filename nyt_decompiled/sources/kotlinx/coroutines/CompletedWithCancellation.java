package kotlinx.coroutines;

import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class CompletedWithCancellation {
    public final ss2 onCancellation;
    public final Object result;

    public CompletedWithCancellation(Object obj, ss2 ss2Var) {
        this.result = obj;
        this.onCancellation = ss2Var;
    }

    public static /* synthetic */ CompletedWithCancellation copy$default(CompletedWithCancellation completedWithCancellation, Object obj, ss2 ss2Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = completedWithCancellation.result;
        }
        if ((i & 2) != 0) {
            ss2Var = completedWithCancellation.onCancellation;
        }
        return completedWithCancellation.copy(obj, ss2Var);
    }

    public final Object component1() {
        return this.result;
    }

    public final ss2 component2() {
        return this.onCancellation;
    }

    public final CompletedWithCancellation copy(Object obj, ss2 ss2Var) {
        return new CompletedWithCancellation(obj, ss2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedWithCancellation)) {
            return false;
        }
        CompletedWithCancellation completedWithCancellation = (CompletedWithCancellation) obj;
        return zq3.c(this.result, completedWithCancellation.result) && zq3.c(this.onCancellation, completedWithCancellation.onCancellation);
    }

    public int hashCode() {
        Object obj = this.result;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.onCancellation.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.result + ", onCancellation=" + this.onCancellation + ')';
    }
}
