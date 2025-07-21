package com.nytimes.games.spellingbee;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hd2;
import defpackage.j57;
import defpackage.pj7;
import defpackage.ri9;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@fc1(c = "com.nytimes.games.spellingbee.SpellingBeeHostActivity$listenForFeedbackEvents$1", f = "SpellingBeeHostActivity.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SpellingBeeHostActivity$listenForFeedbackEvents$1 extends SuspendLambda implements gt2 {
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
        public final Object emit(pj7 pj7Var, by0 by0Var) {
            String b = pj7Var.b();
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = b.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            j57 hd2Var = zq3.c(lowerCase, "feedback") ? new hd2(this.a, pj7Var.a()) : zq3.c(lowerCase, "suggest") ? new ri9(this.a, pj7Var.a()) : null;
            if (hd2Var != null) {
                hd2Var.g();
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpellingBeeHostActivity$listenForFeedbackEvents$1(SpellingBeeHostActivity spellingBeeHostActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = spellingBeeHostActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SpellingBeeHostActivity$listenForFeedbackEvents$1 spellingBeeHostActivity$listenForFeedbackEvents$1 = new SpellingBeeHostActivity$listenForFeedbackEvents$1(this.this$0, by0Var);
        spellingBeeHostActivity$listenForFeedbackEvents$1.L$0 = obj;
        return spellingBeeHostActivity$listenForFeedbackEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SharedFlow b = this.this$0.P().b((CoroutineScope) this.L$0);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (b.collect(aVar, this) == h) {
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
        return ((SpellingBeeHostActivity$listenForFeedbackEvents$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
