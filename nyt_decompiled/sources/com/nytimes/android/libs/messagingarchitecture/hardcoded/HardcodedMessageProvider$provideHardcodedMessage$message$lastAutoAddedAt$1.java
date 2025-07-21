package com.nytimes.android.libs.messagingarchitecture.hardcoded;

import com.comscore.streaming.EventType;
import com.nytimes.android.interests.InterestsManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.hardcoded.HardcodedMessageProvider$provideHardcodedMessage$message$lastAutoAddedAt$1", f = "HardcodedMessageProvider.kt", l = {EventType.SUBS}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HardcodedMessageProvider$provideHardcodedMessage$message$lastAutoAddedAt$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ HardcodedMessageProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HardcodedMessageProvider$provideHardcodedMessage$message$lastAutoAddedAt$1(HardcodedMessageProvider hardcodedMessageProvider, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hardcodedMessageProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HardcodedMessageProvider$provideHardcodedMessage$message$lastAutoAddedAt$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterestsManager interestsManager;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            interestsManager = this.this$0.c;
            this.label = 1;
            obj = interestsManager.j(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HardcodedMessageProvider$provideHardcodedMessage$message$lastAutoAddedAt$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
