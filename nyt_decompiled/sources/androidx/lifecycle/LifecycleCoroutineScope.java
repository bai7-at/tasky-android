package androidx.lifecycle;

import defpackage.gt2;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements CoroutineScope {
    public abstract Lifecycle a();

    public final Job b(gt2 gt2Var) {
        Job launch$default;
        zq3.h(gt2Var, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, gt2Var, null), 3, null);
        return launch$default;
    }

    public final Job c(gt2 gt2Var) {
        Job launch$default;
        zq3.h(gt2Var, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, gt2Var, null), 3, null);
        return launch$default;
    }
}
