package androidx.work.impl;

import android.content.Context;
import defpackage.h94;
import defpackage.v36;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public abstract class UnfinishedWorkListenerKt {
    private static final String a;
    private static final long b;

    static {
        String i = h94.i("UnfinishedWorkListener");
        zq3.g(i, "tagWithPrefix(\"UnfinishedWorkListener\")");
        a = i;
        b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void c(CoroutineScope coroutineScope, Context context, androidx.work.a aVar, WorkDatabase workDatabase) {
        zq3.h(coroutineScope, "<this>");
        zq3.h(context, "appContext");
        zq3.h(aVar, "configuration");
        zq3.h(workDatabase, "db");
        if (v36.b(context, aVar)) {
            FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.conflate(FlowKt.retryWhen(workDatabase.i().r(), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(null)))), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(context, null)), coroutineScope);
        }
    }
}
