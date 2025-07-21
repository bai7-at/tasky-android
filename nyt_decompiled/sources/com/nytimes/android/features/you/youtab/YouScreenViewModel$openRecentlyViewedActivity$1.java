package com.nytimes.android.features.you.youtab;

import android.content.Intent;
import androidx.fragment.app.f;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$openRecentlyViewedActivity$1", f = "YouScreenViewModel.kt", l = {547}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouScreenViewModel$openRecentlyViewedActivity$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ f $activity;
    int label;
    final /* synthetic */ YouScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$openRecentlyViewedActivity$1(YouScreenViewModel youScreenViewModel, f fVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = youScreenViewModel;
        this.$activity = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouScreenViewModel$openRecentlyViewedActivity$1(this.this$0, this.$activity, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeepLinkManager deepLinkManager;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            this.this$0.C().n();
            deepLinkManager = this.this$0.i;
            f fVar = this.$activity;
            this.label = 1;
            obj = deepLinkManager.d(fVar, "nytimes://reader/recent", "Settings", this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        this.$activity.startActivity((Intent) obj);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((YouScreenViewModel$openRecentlyViewedActivity$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
