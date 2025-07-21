package com.iteratehq.iterate;

import androidx.fragment.app.FragmentManager;
import com.iteratehq.iterate.model.EmbedResults;
import com.iteratehq.iterate.model.Survey;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.iteratehq.iterate.Iterate$sendEvent$2$onSuccess$3$1", f = "Iterate.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Iterate$sendEvent$2$onSuccess$3$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ long $responseId;
    final /* synthetic */ EmbedResults $result;
    final /* synthetic */ Survey $survey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Iterate$sendEvent$2$onSuccess$3$1(EmbedResults embedResults, Survey survey, long j, FragmentManager fragmentManager, by0 by0Var) {
        super(2, by0Var);
        this.$result = embedResults;
        this.$survey = survey;
        this.$responseId = j;
        this.$fragmentManager = fragmentManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new Iterate$sendEvent$2$onSuccess$3$1(this.$result, this.$survey, this.$responseId, this.$fragmentManager, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Integer seconds = this.$result.getTriggers().get(0).getOptions().getSeconds();
            int intValue = seconds != null ? seconds.intValue() : 0;
            this.label = 1;
            if (DelayKt.delay(intValue * 1000, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        Iterate.a.p(this.$survey, this.$responseId, this.$fragmentManager);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((Iterate$sendEvent$2$onSuccess$3$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
