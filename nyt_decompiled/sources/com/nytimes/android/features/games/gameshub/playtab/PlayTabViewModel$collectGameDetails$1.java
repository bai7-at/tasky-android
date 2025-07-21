package com.nytimes.android.features.games.gameshub.playtab;

import androidx.lifecycle.r;
import com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.iv2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel$collectGameDetails$1", f = "PlayTabViewModel.kt", l = {62, 62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabViewModel$collectGameDetails$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ PlayTabViewModel this$0;

    @fc1(c = "com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel$collectGameDetails$1$1", f = "PlayTabViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel$collectGameDetails$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PlayTabViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PlayTabViewModel playTabViewModel, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = playTabViewModel;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(iv2 iv2Var, by0 by0Var) {
            return ((AnonymousClass1) create(iv2Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean q;
            MutableStateFlow mutableStateFlow;
            Object value;
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            iv2 iv2Var = (iv2) this.L$0;
            q = this.this$0.q();
            if (q) {
                mutableStateFlow = this.this$0.h;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, PlayTabViewModel.b.b((PlayTabViewModel.b) value, false, iv2Var.e(), iv2Var.d(), iv2Var.c(), null, iv2Var.b(), 17, null)));
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabViewModel$collectGameDetails$1(PlayTabViewModel playTabViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = playTabViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PlayTabViewModel$collectGameDetails$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.nytimes.android.features.games.gameshub.playtab.usecase.a aVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            aVar = this.this$0.e;
            CoroutineScope a = r.a(this.this$0);
            this.label = 1;
            obj = aVar.a(a, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            f.b(obj);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (FlowKt.collectLatest((Flow) obj, anonymousClass1, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PlayTabViewModel$collectGameDetails$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
