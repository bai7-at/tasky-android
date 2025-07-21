package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.y;
import com.nytimes.android.comments.comments.mvi.CommentTab;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$2", f = "CommentsScreenContent.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsScreenContentKt$CommentsScreenContent$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<CommentTab> $commentsTabs;
    final /* synthetic */ ss2 $onSelectedTabChanged;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommentsScreenContentKt$CommentsScreenContent$2(PagerState pagerState, ss2 ss2Var, List<? extends CommentTab> list, by0<? super CommentsScreenContentKt$CommentsScreenContent$2> by0Var) {
        super(2, by0Var);
        this.$pagerState = pagerState;
        this.$onSelectedTabChanged = ss2Var;
        this.$commentsTabs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new CommentsScreenContentKt$CommentsScreenContent$2(this.$pagerState, this.$onSelectedTabChanged, this.$commentsTabs, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final PagerState pagerState = this.$pagerState;
            Flow p = y.p(new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$2.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Integer mo865invoke() {
                    return Integer.valueOf(PagerState.this.w());
                }
            });
            final ss2 ss2Var = this.$onSelectedTabChanged;
            final List<CommentTab> list = this.$commentsTabs;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$2.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, by0 by0Var) {
                    return emit(((Number) obj2).intValue(), (by0<? super ww8>) by0Var);
                }

                public final Object emit(int i2, by0<? super ww8> by0Var) {
                    ss2.this.invoke(list.get(i2));
                    return ww8.a;
                }
            };
            this.label = 1;
            if (p.collect(flowCollector, this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((CommentsScreenContentKt$CommentsScreenContent$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
