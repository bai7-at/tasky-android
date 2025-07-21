package com.nytimes.android.features.discovery.discoverytab;

import androidx.lifecycle.Lifecycle;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j38;
import defpackage.l34;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$BooleanRef;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.ImpressionUnfearInterceptor$Intercept$extraModifier$1", f = "ImpressionUnfearInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ImpressionUnfearInterceptor$Intercept$extraModifier$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ l34 $obj;
    final /* synthetic */ Ref$BooleanRef $visible;
    int label;
    final /* synthetic */ ImpressionUnfearInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImpressionUnfearInterceptor$Intercept$extraModifier$1(Ref$BooleanRef ref$BooleanRef, ImpressionUnfearInterceptor impressionUnfearInterceptor, l34 l34Var, by0 by0Var) {
        super(2, by0Var);
        this.$visible = ref$BooleanRef;
        this.this$0 = impressionUnfearInterceptor;
        this.$obj = l34Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Lifecycle.Event event, by0 by0Var) {
        return ((ImpressionUnfearInterceptor$Intercept$extraModifier$1) create(event, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ImpressionUnfearInterceptor$Intercept$extraModifier$1(this.$visible, this.this$0, this.$obj, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DiscoveryEventTracker discoveryEventTracker;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (this.$visible.element) {
            discoveryEventTracker = this.this$0.a;
            discoveryEventTracker.j((j38) this.$obj);
        }
        return ww8.a;
    }
}
