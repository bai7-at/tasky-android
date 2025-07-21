package com.nytimes.android.ribbon;

import androidx.compose.foundation.lazy.LazyListState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.it2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$5$3", f = "DestinationContent.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationContentKt$DestinationContent$2$5$3 extends SuspendLambda implements it2 {
    final /* synthetic */ Map<String, LazyListState> $destinationListStates;
    final /* synthetic */ fe4 $mainTabState;
    final /* synthetic */ DestinationContentViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationContentKt$DestinationContent$2$5$3(DestinationContentViewModel destinationContentViewModel, Map map, fe4 fe4Var, by0 by0Var) {
        super(3, by0Var);
        this.$viewModel = destinationContentViewModel;
        this.$destinationListStates = map;
        this.$mainTabState = fe4Var;
    }

    public final Object b(int i, RibbonConfig ribbonConfig, by0 by0Var) {
        DestinationContentKt$DestinationContent$2$5$3 destinationContentKt$DestinationContent$2$5$3 = new DestinationContentKt$DestinationContent$2$5$3(this.$viewModel, this.$destinationListStates, this.$mainTabState, by0Var);
        destinationContentKt$DestinationContent$2$5$3.L$0 = ribbonConfig;
        return destinationContentKt$DestinationContent$2$5$3.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(((Number) obj).intValue(), (RibbonConfig) obj2, (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object t;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            RibbonConfig ribbonConfig = (RibbonConfig) this.L$0;
            DestinationContentViewModel destinationContentViewModel = this.$viewModel;
            Map<String, LazyListState> map = this.$destinationListStates;
            fe4 fe4Var = this.$mainTabState;
            this.label = 1;
            t = DestinationContentKt.t(destinationContentViewModel, ribbonConfig, map, fe4Var, this);
            if (t == h) {
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
