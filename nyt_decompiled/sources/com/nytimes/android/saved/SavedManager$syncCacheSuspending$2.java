package com.nytimes.android.saved;

import com.nytimes.android.saved.synchronization.AssetSynchronizer;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.SavedManager$syncCacheSuspending$2", f = "SavedManager.kt", l = {54, 56}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedManager$syncCacheSuspending$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SavedManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedManager$syncCacheSuspending$2(SavedManager savedManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedManager$syncCacheSuspending$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.nytimes.android.entitlements.a aVar;
        AssetSynchronizer assetSynchronizer;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            aVar = this.this$0.eCommClient;
            if (aVar.q()) {
                assetSynchronizer = this.this$0.assetSynchronizer;
                this.label = 1;
                if (assetSynchronizer.i(this) == h) {
                    return h;
                }
            } else {
                SavedManager savedManager = this.this$0;
                this.label = 2;
                if (savedManager.deleteCache(this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SavedManager$syncCacheSuspending$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
