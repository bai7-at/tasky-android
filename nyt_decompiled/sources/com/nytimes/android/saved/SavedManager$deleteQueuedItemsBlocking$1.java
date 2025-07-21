package com.nytimes.android.saved;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.SavedManager$deleteQueuedItemsBlocking$1", f = "SavedManager.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedManager$deleteQueuedItemsBlocking$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SavedManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedManager$deleteQueuedItemsBlocking$1(SavedManager savedManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedManager$deleteQueuedItemsBlocking$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SavedManager savedManager = this.this$0;
            this.label = 1;
            if (savedManager.deleteQueuedItems(this) == h) {
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
        return ((SavedManager$deleteQueuedItemsBlocking$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
