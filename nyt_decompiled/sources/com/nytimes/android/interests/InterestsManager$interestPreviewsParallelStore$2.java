package com.nytimes.android.interests;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.interests.InterestsManager$interestPreviewsParallelStore$2", f = "InterestsManager.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsManager$interestPreviewsParallelStore$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ InterestsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsManager$interestPreviewsParallelStore$2(InterestsManager interestsManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = interestsManager;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Set set, by0 by0Var) {
        return ((InterestsManager$interestPreviewsParallelStore$2) create(set, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsManager$interestPreviewsParallelStore$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            InterestsManager interestsManager = this.this$0;
            this.label = 1;
            obj = interestsManager.i(this);
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
}
