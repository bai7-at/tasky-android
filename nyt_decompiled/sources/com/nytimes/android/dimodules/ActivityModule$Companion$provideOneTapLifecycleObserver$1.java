package com.nytimes.android.dimodules;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cb2;
import defpackage.fc1;
import defpackage.it2;
import defpackage.t98;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.dimodules.ActivityModule$Companion$provideOneTapLifecycleObserver$1", f = "ActivityModule.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ActivityModule$Companion$provideOneTapLifecycleObserver$1 extends SuspendLambda implements it2 {
    final /* synthetic */ cb2 $featureFlagUtil;
    final /* synthetic */ t98 $subauthUserUI;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityModule$Companion$provideOneTapLifecycleObserver$1(cb2 cb2Var, t98 t98Var, by0 by0Var) {
        super(3, by0Var);
        this.$featureFlagUtil = cb2Var;
        this.$subauthUserUI = t98Var;
    }

    public final Object b(androidx.fragment.app.f fVar, boolean z, by0 by0Var) {
        ActivityModule$Companion$provideOneTapLifecycleObserver$1 activityModule$Companion$provideOneTapLifecycleObserver$1 = new ActivityModule$Companion$provideOneTapLifecycleObserver$1(this.$featureFlagUtil, this.$subauthUserUI, by0Var);
        activityModule$Companion$provideOneTapLifecycleObserver$1.L$0 = fVar;
        activityModule$Companion$provideOneTapLifecycleObserver$1.Z$0 = z;
        return activityModule$Companion$provideOneTapLifecycleObserver$1.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((androidx.fragment.app.f) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.L$0;
            boolean z = this.Z$0;
            if (this.$featureFlagUtil.A()) {
                NYTLogger.d("Open Account Ready Flow", new Object[0]);
                t98 t98Var = this.$subauthUserUI;
                this.label = 1;
                if (t98.a.b(t98Var, fVar, z, null, this, 4, null) == h) {
                    return h;
                }
            } else {
                NYTLogger.A("Skipping Account Ready Flow. Feature Flag Disabled.", new Object[0]);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
