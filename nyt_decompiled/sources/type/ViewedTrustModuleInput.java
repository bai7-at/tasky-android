package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ViewedTrustModuleInput {
    private final nk5 lastSeen;
    private final nk5 trustModule;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewedTrustModuleInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ViewedTrustModuleInput copy$default(ViewedTrustModuleInput viewedTrustModuleInput, nk5 nk5Var, nk5 nk5Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = viewedTrustModuleInput.lastSeen;
        }
        if ((i & 2) != 0) {
            nk5Var2 = viewedTrustModuleInput.trustModule;
        }
        return viewedTrustModuleInput.copy(nk5Var, nk5Var2);
    }

    public final nk5 component1() {
        return this.lastSeen;
    }

    public final nk5 component2() {
        return this.trustModule;
    }

    public final ViewedTrustModuleInput copy(nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(nk5Var, "lastSeen");
        zq3.h(nk5Var2, "trustModule");
        return new ViewedTrustModuleInput(nk5Var, nk5Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewedTrustModuleInput)) {
            return false;
        }
        ViewedTrustModuleInput viewedTrustModuleInput = (ViewedTrustModuleInput) obj;
        return zq3.c(this.lastSeen, viewedTrustModuleInput.lastSeen) && zq3.c(this.trustModule, viewedTrustModuleInput.trustModule);
    }

    public final nk5 getLastSeen() {
        return this.lastSeen;
    }

    public final nk5 getTrustModule() {
        return this.trustModule;
    }

    public int hashCode() {
        return (this.lastSeen.hashCode() * 31) + this.trustModule.hashCode();
    }

    public String toString() {
        return "ViewedTrustModuleInput(lastSeen=" + this.lastSeen + ", trustModule=" + this.trustModule + ")";
    }

    public ViewedTrustModuleInput(nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(nk5Var, "lastSeen");
        zq3.h(nk5Var2, "trustModule");
        this.lastSeen = nk5Var;
        this.trustModule = nk5Var2;
    }

    public /* synthetic */ ViewedTrustModuleInput(nk5 nk5Var, nk5 nk5Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2);
    }
}
