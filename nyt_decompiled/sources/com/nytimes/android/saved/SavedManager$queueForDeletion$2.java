package com.nytimes.android.saved;

import com.nytimes.android.saved.synchronization.LowLevelOperations;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s87;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.SavedManager$queueForDeletion$2", f = "SavedManager.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedManager$queueForDeletion$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ s87 $saveable;
    int label;
    final /* synthetic */ SavedManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedManager$queueForDeletion$2(SavedManager savedManager, s87 s87Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedManager;
        this.$saveable = s87Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedManager$queueForDeletion$2(this.this$0, this.$saveable, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LowLevelOperations lowLevelOperations;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            lowLevelOperations = this.this$0.ops;
            s87 s87Var = this.$saveable;
            this.label = 1;
            if (lowLevelOperations.p(s87Var, this) == h) {
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
        return ((SavedManager$queueForDeletion$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
