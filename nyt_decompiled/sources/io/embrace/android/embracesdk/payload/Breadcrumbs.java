package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Breadcrumbs {
    private final List<RnActionBreadcrumb> rnActionBreadcrumbs;

    /* JADX WARN: Multi-variable type inference failed */
    public Breadcrumbs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Breadcrumbs copy$default(Breadcrumbs breadcrumbs, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = breadcrumbs.rnActionBreadcrumbs;
        }
        return breadcrumbs.copy(list);
    }

    public final List<RnActionBreadcrumb> component1() {
        return this.rnActionBreadcrumbs;
    }

    public final Breadcrumbs copy(@bt3(name = "rna") List<RnActionBreadcrumb> list) {
        return new Breadcrumbs(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Breadcrumbs) && zq3.c(this.rnActionBreadcrumbs, ((Breadcrumbs) obj).rnActionBreadcrumbs);
        }
        return true;
    }

    public final List<RnActionBreadcrumb> getRnActionBreadcrumbs() {
        return this.rnActionBreadcrumbs;
    }

    public int hashCode() {
        List<RnActionBreadcrumb> list = this.rnActionBreadcrumbs;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Breadcrumbs(rnActionBreadcrumbs=" + this.rnActionBreadcrumbs + ")";
    }

    public Breadcrumbs(@bt3(name = "rna") List<RnActionBreadcrumb> list) {
        this.rnActionBreadcrumbs = list;
    }

    public /* synthetic */ Breadcrumbs(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
