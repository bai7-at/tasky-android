package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import defpackage.dk9;
import defpackage.gv0;
import defpackage.yu0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class NetworkRequestConstraintController implements yu0 {
    private final ConnectivityManager a;
    private final long b;

    public NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j) {
        zq3.h(connectivityManager, "connManager");
        this.a = connectivityManager;
        this.b = j;
    }

    @Override // defpackage.yu0
    public boolean a(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        if (c(dk9Var)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // defpackage.yu0
    public Flow b(gv0 gv0Var) {
        zq3.h(gv0Var, "constraints");
        return FlowKt.callbackFlow(new NetworkRequestConstraintController$track$1(gv0Var, this, null));
    }

    @Override // defpackage.yu0
    public boolean c(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        return dk9Var.j.d() != null;
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i & 2) != 0 ? WorkConstraintsTrackerKt.b : j);
    }
}
