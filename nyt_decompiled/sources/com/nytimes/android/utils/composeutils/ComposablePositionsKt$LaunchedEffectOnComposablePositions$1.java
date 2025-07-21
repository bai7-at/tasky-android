package com.nytimes.android.utils.composeutils;

import androidx.compose.runtime.y;
import com.comscore.streaming.ContentType;
import defpackage.bs0;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.utils.composeutils.ComposablePositionsKt$LaunchedEffectOnComposablePositions$1", f = "ComposablePositions.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ComposablePositionsKt$LaunchedEffectOnComposablePositions$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ bs0 $composablePositions;
    final /* synthetic */ gt2 $onNewMap;
    int label;

    @fc1(c = "com.nytimes.android.utils.composeutils.ComposablePositionsKt$LaunchedEffectOnComposablePositions$1$2", f = "ComposablePositions.kt", l = {ContentType.LIVE}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.utils.composeutils.ComposablePositionsKt$LaunchedEffectOnComposablePositions$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ gt2 $onNewMap;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(gt2 gt2Var, by0 by0Var) {
            super(2, by0Var);
            this.$onNewMap = gt2Var;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, by0 by0Var) {
            return ((AnonymousClass2) create(map, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onNewMap, by0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Map map = (Map) this.L$0;
                gt2 gt2Var = this.$onNewMap;
                this.label = 1;
                if (gt2Var.invoke(map, this) == h) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposablePositionsKt$LaunchedEffectOnComposablePositions$1(bs0 bs0Var, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$composablePositions = bs0Var;
        this.$onNewMap = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ComposablePositionsKt$LaunchedEffectOnComposablePositions$1(this.$composablePositions, this.$onNewMap, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final bs0 bs0Var = this.$composablePositions;
            Flow onEach = FlowKt.onEach(FlowKt.debounce(y.p(new qs2() { // from class: com.nytimes.android.utils.composeutils.ComposablePositionsKt$LaunchedEffectOnComposablePositions$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Map mo865invoke() {
                    return bs0.this.a().l();
                }
            }), 1L), new AnonymousClass2(this.$onNewMap, null));
            this.label = 1;
            if (FlowKt.collect(onEach, this) == h) {
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
        return ((ComposablePositionsKt$LaunchedEffectOnComposablePositions$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
