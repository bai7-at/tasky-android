package com.nytimes.android.features.recentlyviewedui;

import android.content.Context;
import com.nytimes.android.entitlements.b;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel$openLIRELoginFlow$1", f = "RecentlyViewedViewModel.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RecentlyViewedViewModel$openLIRELoginFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ RecentlyViewedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentlyViewedViewModel$openLIRELoginFlow$1(RecentlyViewedViewModel recentlyViewedViewModel, Context context, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = recentlyViewedViewModel;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RecentlyViewedViewModel$openLIRELoginFlow$1(this.this$0, this.$context, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            b n = this.this$0.n();
            Context context = this.$context;
            RegiInterface regiInterface = RegiInterface.RegiRecentPrompt;
            this.label = 1;
            if (b.a.a(n, context, regiInterface, null, this, 4, null) == h) {
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
        return ((RecentlyViewedViewModel$openLIRELoginFlow$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
