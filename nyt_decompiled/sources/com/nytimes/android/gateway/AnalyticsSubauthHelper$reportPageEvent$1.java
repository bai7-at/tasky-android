package com.nytimes.android.gateway;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import defpackage.by0;
import defpackage.e32;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.gateway.AnalyticsSubauthHelper$reportPageEvent$1", f = "AnalyticsSubauthHelper.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnalyticsSubauthHelper$reportPageEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ e32 $asset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnalyticsSubauthHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsSubauthHelper$reportPageEvent$1(AnalyticsSubauthHelper analyticsSubauthHelper, e32 e32Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = analyticsSubauthHelper;
        this.$asset = e32Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AnalyticsSubauthHelper$reportPageEvent$1 analyticsSubauthHelper$reportPageEvent$1 = new AnalyticsSubauthHelper$reportPageEvent$1(this.this$0, this.$asset, by0Var);
        analyticsSubauthHelper$reportPageEvent$1.L$0 = obj;
        return analyticsSubauthHelper$reportPageEvent$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2SimpleScope eT2SimpleScope;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            eT2SimpleScope = this.this$0.b;
            e32 e32Var = this.$asset;
            this.label = 1;
            if (ET2SimpleScope.i(eT2SimpleScope, e32Var, null, null, null, null, null, null, null, coroutineScope, this, 254, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AnalyticsSubauthHelper$reportPageEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
