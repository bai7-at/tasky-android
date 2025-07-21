package androidx.work.impl.constraints;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.dk9;
import defpackage.h94;
import defpackage.oe5;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public abstract class WorkConstraintsTrackerKt {
    private static final String a;
    private static final long b;

    static {
        String i = h94.i("WorkConstraintsTracker");
        zq3.g(i, "tagWithPrefix(\"WorkConstraintsTracker\")");
        a = i;
        b = 1000L;
    }

    public static final NetworkRequestConstraintController a(Context context) {
        zq3.h(context, "context");
        Object systemService = context.getSystemService("connectivity");
        zq3.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new NetworkRequestConstraintController((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final Job d(WorkConstraintsTracker workConstraintsTracker, dk9 dk9Var, CoroutineDispatcher coroutineDispatcher, oe5 oe5Var) {
        CompletableJob Job$default;
        zq3.h(workConstraintsTracker, "<this>");
        zq3.h(dk9Var, "spec");
        zq3.h(coroutineDispatcher, "dispatcher");
        zq3.h(oe5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(Job$default)), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, dk9Var, oe5Var, null), 3, null);
        return Job$default;
    }
}
