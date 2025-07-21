package com.nytimes.android.ribbon;

import androidx.compose.foundation.pager.PagerState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import defpackage.by0;
import defpackage.cn8;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xl9;
import defpackage.yl9;
import defpackage.zq3;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$1", f = "DestinationContent.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationContentKt$DestinationContent$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ x08 $deeplinkState$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ List<String> $tabTitles;
    final /* synthetic */ cn8 $todayTabTracing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationContentKt$DestinationContent$2$1(cn8 cn8Var, PagerState pagerState, List list, x08 x08Var, by0 by0Var) {
        super(2, by0Var);
        this.$todayTabTracing = cn8Var;
        this.$pagerState = pagerState;
        this.$tabTitles = list;
        this.$deeplinkState$delegate = x08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DestinationContentKt$DestinationContent$2$1(this.$todayTabTracing, this.$pagerState, this.$tabTitles, this.$deeplinkState$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xl9 c;
        xl9 c2;
        xl9 c3;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            c = DestinationContentKt.c(this.$deeplinkState$delegate);
            if (c instanceof yl9) {
                cn8 cn8Var = this.$todayTabTracing;
                if (cn8Var != null) {
                    c3 = DestinationContentKt.c(this.$deeplinkState$delegate);
                    zq3.f(c3, "null cannot be cast to non-null type com.nytimes.android.ribbon.XPNDeeplink");
                    cn8Var.d(du8.a("context.deeplinkTarget", ((yl9) c3).a().getId()));
                }
                PagerState pagerState = this.$pagerState;
                DestinationTabState.a aVar = DestinationTabState.Companion;
                List<String> list = this.$tabTitles;
                c2 = DestinationContentKt.c(this.$deeplinkState$delegate);
                zq3.f(c2, "null cannot be cast to non-null type com.nytimes.android.ribbon.XPNDeeplink");
                int f = aVar.f(list, ((yl9) c2).a().getId());
                this.label = 1;
                if (PagerState.b0(pagerState, f, 0.0f, this, 2, null) == h) {
                    return h;
                }
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
        return ((DestinationContentKt$DestinationContent$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
