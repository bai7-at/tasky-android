package com.nytimes.android.libs.iterate;

import defpackage.bs3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.libs.iterate.IterateInitializer$init$2", f = "IterateInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IterateInitializer$init$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ IterateInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IterateInitializer$init$2(IterateInitializer iterateInitializer, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = iterateInitializer;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(IterateUserType iterateUserType, String str, by0 by0Var) {
        IterateInitializer$init$2 iterateInitializer$init$2 = new IterateInitializer$init$2(this.this$0, by0Var);
        iterateInitializer$init$2.L$0 = iterateUserType;
        iterateInitializer$init$2.L$1 = str;
        return iterateInitializer$init$2.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bs3 bs3Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        IterateUserType iterateUserType = (IterateUserType) this.L$0;
        String str = (String) this.L$1;
        bs3Var = this.this$0.b;
        bs3Var.a(iterateUserType, str);
        return ww8.a;
    }
}
