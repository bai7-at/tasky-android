package com.nytimes.android.libs.messagingarchitecture.betasettings;

import com.comscore.streaming.ContentType;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.by0;
import defpackage.ec1;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$convertJson$1", f = "DebugViewModel.kt", l = {109, ContentType.SHORT_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DebugViewModel$convertJson$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Message $converted;
    int label;
    final /* synthetic */ DebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugViewModel$convertJson$1(DebugViewModel debugViewModel, Message message, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = debugViewModel;
        this.$converted = message;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DebugViewModel$convertJson$1(this.this$0, this.$converted, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ec1 ec1Var;
        ec1 ec1Var2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ec1Var = this.this$0.a;
            this.label = 1;
            obj = ec1Var.j(this);
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
        List F0 = i.F0(i.e(this.$converted), (List) obj);
        ec1Var2 = this.this$0.a;
        this.label = 2;
        if (ec1Var2.a(F0, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DebugViewModel$convertJson$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
