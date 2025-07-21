package com.nytimes.android.productlanding.adapters;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import defpackage.by0;
import defpackage.du8;
import defpackage.e32;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ue4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.productlanding.adapters.GrowthUIAnalyticsAdapter$initAnalytics$1", f = "GrowthUIAnalyticsAdapter.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GrowthUIAnalyticsAdapter$initAnalytics$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $section;
    final /* synthetic */ String $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GrowthUIAnalyticsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GrowthUIAnalyticsAdapter$initAnalytics$1(GrowthUIAnalyticsAdapter growthUIAnalyticsAdapter, String str, String str2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = growthUIAnalyticsAdapter;
        this.$type = str;
        this.$section = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        GrowthUIAnalyticsAdapter$initAnalytics$1 growthUIAnalyticsAdapter$initAnalytics$1 = new GrowthUIAnalyticsAdapter$initAnalytics$1(this.this$0, this.$type, this.$section, by0Var);
        growthUIAnalyticsAdapter$initAnalytics$1.L$0 = obj;
        return growthUIAnalyticsAdapter$initAnalytics$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2SimpleScope eT2SimpleScope;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            eT2SimpleScope = this.this$0.a;
            e32 e32Var = new e32(new ue4(du8.a(TransferTable.COLUMN_TYPE, this.$type), du8.a("section", this.$section)));
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
        return ((GrowthUIAnalyticsAdapter$initAnalytics$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
