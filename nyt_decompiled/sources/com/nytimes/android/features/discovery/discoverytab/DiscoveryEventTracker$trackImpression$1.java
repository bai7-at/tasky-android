package com.nytimes.android.features.discovery.discoverytab;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j38;
import defpackage.ki0;
import defpackage.s55;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$trackImpression$1", f = "DiscoveryEventTracker.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DiscoveryEventTracker$trackImpression$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ j38 $storyLockup;
    int label;
    final /* synthetic */ DiscoveryEventTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoveryEventTracker$trackImpression$1(DiscoveryEventTracker discoveryEventTracker, j38 j38Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = discoveryEventTracker;
        this.$storyLockup = j38Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DiscoveryEventTracker$trackImpression$1(this.this$0, this.$storyLockup, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2Scope eT2Scope;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            eT2Scope = this.this$0.a;
            s55.m mVar = s55.m.c;
            this.label = 1;
            if (eT2Scope.g(mVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        j38 j38Var = this.$storyLockup;
        if (j38Var instanceof ki0) {
            this.this$0.h((ki0) j38Var);
        } else {
            this.this$0.n(j38Var);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DiscoveryEventTracker$trackImpression$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
