package com.nytimes.android.saved.persistence;

import com.nytimes.android.saved.SavedAssetIndexList;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.ge2;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.nytimes.android.saved.persistence.SavedListDiskPersister$delete$2", f = "SavedListDiskPersister.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedListDiskPersister$delete$2 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SavedListDiskPersister this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedListDiskPersister$delete$2(SavedListDiskPersister savedListDiskPersister, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedListDiskPersister;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedListDiskPersister$delete$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ge2 ge2Var;
        Object h;
        Class cls;
        ge2 ge2Var2;
        Object h2 = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ge2Var = this.this$0.a;
            SavedListDiskPersister savedListDiskPersister = this.this$0;
            this.L$0 = ge2Var;
            this.L$1 = SavedAssetIndexList.class;
            this.label = 1;
            h = savedListDiskPersister.h(this);
            if (h == h2) {
                return h2;
            }
            cls = SavedAssetIndexList.class;
            obj = h;
            ge2Var2 = ge2Var;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = (Class) this.L$1;
            ge2Var2 = (ge2) this.L$0;
            f.b(obj);
        }
        return cc0.a(ge2Var2.b(cls, (String) obj).delete());
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SavedListDiskPersister$delete$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
