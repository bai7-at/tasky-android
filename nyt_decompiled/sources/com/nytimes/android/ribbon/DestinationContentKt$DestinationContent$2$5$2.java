package com.nytimes.android.ribbon;

import androidx.compose.foundation.pager.PagerState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$5$2", f = "DestinationContent.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationContentKt$DestinationContent$2$5$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ List<String> $tabTitles;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationContentKt$DestinationContent$2$5$2(PagerState pagerState, List list, by0 by0Var) {
        super(1, by0Var);
        this.$pagerState = pagerState;
        this.$tabTitles = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new DestinationContentKt$DestinationContent$2$5$2(this.$pagerState, this.$tabTitles, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((DestinationContentKt$DestinationContent$2$5$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PagerState pagerState = this.$pagerState;
            int f = DestinationTabState.Companion.f(this.$tabTitles, RibbonConfig.TODAY.getId());
            this.label = 1;
            if (PagerState.b0(pagerState, f, 0.0f, this, 2, null) == h) {
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
}
