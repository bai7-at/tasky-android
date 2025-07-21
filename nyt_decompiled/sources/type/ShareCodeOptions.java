package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ShareCodeOptions {
    private final nk5 pageViewId;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareCodeOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareCodeOptions copy$default(ShareCodeOptions shareCodeOptions, nk5 nk5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = shareCodeOptions.pageViewId;
        }
        return shareCodeOptions.copy(nk5Var);
    }

    public final nk5 component1() {
        return this.pageViewId;
    }

    public final ShareCodeOptions copy(nk5 nk5Var) {
        zq3.h(nk5Var, "pageViewId");
        return new ShareCodeOptions(nk5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShareCodeOptions) && zq3.c(this.pageViewId, ((ShareCodeOptions) obj).pageViewId);
    }

    public final nk5 getPageViewId() {
        return this.pageViewId;
    }

    public int hashCode() {
        return this.pageViewId.hashCode();
    }

    public String toString() {
        return "ShareCodeOptions(pageViewId=" + this.pageViewId + ")";
    }

    public ShareCodeOptions(nk5 nk5Var) {
        zq3.h(nk5Var, "pageViewId");
        this.pageViewId = nk5Var;
    }

    public /* synthetic */ ShareCodeOptions(nk5 nk5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var);
    }
}
