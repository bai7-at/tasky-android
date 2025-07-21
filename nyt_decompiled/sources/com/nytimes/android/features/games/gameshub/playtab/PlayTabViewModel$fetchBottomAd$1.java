package com.nytimes.android.features.games.gameshub.playtab;

import android.content.Context;
import com.nytimes.android.ads.games.GameHubAdUseCase;
import com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel;
import defpackage.by0;
import defpackage.d8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel$fetchBottomAd$1", f = "PlayTabViewModel.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabViewModel$fetchBottomAd$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ PlayTabViewModel this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ PlayTabViewModel a;

        a(PlayTabViewModel playTabViewModel) {
            this.a = playTabViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(d8 d8Var, by0 by0Var) {
            MutableStateFlow mutableStateFlow;
            Object value;
            mutableStateFlow = this.a.h;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, PlayTabViewModel.b.b((PlayTabViewModel.b) value, false, false, null, null, d8Var, null, 47, null)));
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabViewModel$fetchBottomAd$1(PlayTabViewModel playTabViewModel, Context context, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = playTabViewModel;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PlayTabViewModel$fetchBottomAd$1(this.this$0, this.$context, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GameHubAdUseCase gameHubAdUseCase;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            gameHubAdUseCase = this.this$0.a;
            Flow e = gameHubAdUseCase.e(this.$context);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (e.collect(aVar, this) == h) {
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
        return ((PlayTabViewModel$fetchBottomAd$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
