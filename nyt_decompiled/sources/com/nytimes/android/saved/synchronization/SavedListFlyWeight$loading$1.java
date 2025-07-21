package com.nytimes.android.saved.synchronization;

import com.nytimes.android.saved.SavedAssetIndexList;
import defpackage.a97;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.synchronization.SavedListFlyWeight$loading$1", f = "SavedListFlyWeight.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedListFlyWeight$loading$1 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ SavedListFlyWeight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedListFlyWeight$loading$1(SavedListFlyWeight savedListFlyWeight, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedListFlyWeight;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedListFlyWeight$loading$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a97 a97Var;
        SavedListFlyWeight savedListFlyWeight;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SavedListFlyWeight savedListFlyWeight2 = this.this$0;
            a97Var = savedListFlyWeight2.a;
            this.L$0 = savedListFlyWeight2;
            this.label = 1;
            Object c = a97Var.c(this);
            if (c == h) {
                return h;
            }
            obj = c;
            savedListFlyWeight = savedListFlyWeight2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            savedListFlyWeight = (SavedListFlyWeight) this.L$0;
            f.b(obj);
        }
        savedListFlyWeight.b = (SavedAssetIndexList) obj;
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SavedListFlyWeight$loading$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
