package com.nytimes.android.saved;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.SavedManager$getAssetsAsSingle$1", f = "SavedManager.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedManager$getAssetsAsSingle$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $count;
    final /* synthetic */ int $start;
    int label;
    final /* synthetic */ SavedManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedManager$getAssetsAsSingle$1(SavedManager savedManager, int i, int i2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedManager;
        this.$start = i;
        this.$count = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedManager$getAssetsAsSingle$1(this.this$0, this.$start, this.$count, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SavedManager savedManager = this.this$0;
            int i2 = this.$start;
            int i3 = this.$count;
            this.label = 1;
            obj = savedManager.getAssets(i2, i3, this);
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
        return ((SavedManager$getAssetsAsSingle$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
