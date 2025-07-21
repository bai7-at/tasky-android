package androidx.lifecycle;

import defpackage.fm0;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes.dex */
public abstract class r {
    public static final CoroutineScope a(q qVar) {
        zq3.h(qVar, "<this>");
        CoroutineScope coroutineScope = (CoroutineScope) qVar.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Object tagIfAbsent = qVar.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new fm0(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate())));
        zq3.g(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (CoroutineScope) tagIfAbsent;
    }
}
