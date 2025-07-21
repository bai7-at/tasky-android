package com.nytimes.games.spellingbee;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ia4;
import defpackage.ib8;
import defpackage.n98;
import defpackage.uz;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@fc1(c = "com.nytimes.games.spellingbee.SpellingBeeHostActivity$listenForSubscriptionButtonEvents$1", f = "SpellingBeeHostActivity.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SpellingBeeHostActivity$listenForSubscriptionButtonEvents$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SpellingBeeHostActivity this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ SpellingBeeHostActivity a;

        a(SpellingBeeHostActivity spellingBeeHostActivity) {
            this.a = spellingBeeHostActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(uz uzVar, by0 by0Var) {
            if (zq3.c(uzVar, ia4.a)) {
                Object a = n98.a.a(this.a.getSubauthClient(), this.a, false, null, null, by0Var, 14, null);
                return a == kotlin.coroutines.intrinsics.a.h() ? a : ww8.a;
            }
            if (zq3.c(uzVar, ib8.a)) {
                SpellingBeeHostActivity spellingBeeHostActivity = this.a;
                spellingBeeHostActivity.startActivity(spellingBeeHostActivity.O().a());
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpellingBeeHostActivity$listenForSubscriptionButtonEvents$1(SpellingBeeHostActivity spellingBeeHostActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = spellingBeeHostActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SpellingBeeHostActivity$listenForSubscriptionButtonEvents$1 spellingBeeHostActivity$listenForSubscriptionButtonEvents$1 = new SpellingBeeHostActivity$listenForSubscriptionButtonEvents$1(this.this$0, by0Var);
        spellingBeeHostActivity$listenForSubscriptionButtonEvents$1.L$0 = obj;
        return spellingBeeHostActivity$listenForSubscriptionButtonEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SharedFlow a2 = this.this$0.N().a((CoroutineScope) this.L$0);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (a2.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SpellingBeeHostActivity$listenForSubscriptionButtonEvents$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
