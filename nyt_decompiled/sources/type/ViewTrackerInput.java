package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ViewTrackerInput {
    private final nk5 views;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewTrackerInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ViewTrackerInput copy$default(ViewTrackerInput viewTrackerInput, nk5 nk5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = viewTrackerInput.views;
        }
        return viewTrackerInput.copy(nk5Var);
    }

    public final nk5 component1() {
        return this.views;
    }

    public final ViewTrackerInput copy(nk5 nk5Var) {
        zq3.h(nk5Var, "views");
        return new ViewTrackerInput(nk5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewTrackerInput) && zq3.c(this.views, ((ViewTrackerInput) obj).views);
    }

    public final nk5 getViews() {
        return this.views;
    }

    public int hashCode() {
        return this.views.hashCode();
    }

    public String toString() {
        return "ViewTrackerInput(views=" + this.views + ")";
    }

    public ViewTrackerInput(nk5 nk5Var) {
        zq3.h(nk5Var, "views");
        this.views = nk5Var;
    }

    public /* synthetic */ ViewTrackerInput(nk5 nk5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var);
    }
}
