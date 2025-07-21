package androidx.paging;

import defpackage.qs2;
import defpackage.xn5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class Pager {
    private final Flow a;

    public Pager(xn5 xn5Var, Object obj, RemoteMediator remoteMediator, qs2 qs2Var) {
        zq3.h(xn5Var, "config");
        zq3.h(qs2Var, "pagingSourceFactory");
        this.a = new PageFetcher(qs2Var instanceof SuspendingPagingSourceFactory ? new Pager$flow$1(qs2Var) : new Pager$flow$2(qs2Var, null), obj, xn5Var, remoteMediator).i();
    }

    public final Flow a() {
        return this.a;
    }

    public /* synthetic */ Pager(xn5 xn5Var, Object obj, qs2 qs2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xn5Var, (i & 2) != 0 ? null : obj, qs2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pager(xn5 xn5Var, Object obj, qs2 qs2Var) {
        this(xn5Var, obj, null, qs2Var);
        zq3.h(xn5Var, "config");
        zq3.h(qs2Var, "pagingSourceFactory");
    }
}
