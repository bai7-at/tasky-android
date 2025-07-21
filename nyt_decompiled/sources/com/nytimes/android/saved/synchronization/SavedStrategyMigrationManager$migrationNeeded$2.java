package com.nytimes.android.saved.synchronization;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.synchronization.SavedStrategyMigrationManager$migrationNeeded$2", f = "SavedStrategyMigrationManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedStrategyMigrationManager$migrationNeeded$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SavedStrategyMigrationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedStrategyMigrationManager$migrationNeeded$2(SavedStrategyMigrationManager savedStrategyMigrationManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedStrategyMigrationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedStrategyMigrationManager$migrationNeeded$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean d;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        d = this.this$0.d();
        return cc0.a(d);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SavedStrategyMigrationManager$migrationNeeded$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
