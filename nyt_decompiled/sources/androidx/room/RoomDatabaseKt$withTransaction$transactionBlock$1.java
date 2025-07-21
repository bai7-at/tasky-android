package androidx.room;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RoomDatabaseKt$withTransaction$transactionBlock$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_withTransaction = roomDatabase;
        this.$block = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, by0Var);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i iVar;
        Throwable th;
        i iVar2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                CoroutineContext.a aVar = ((CoroutineScope) this.L$0).getCoroutineContext().get(i.c);
                zq3.e(aVar);
                iVar = (i) aVar;
                iVar.a();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        ss2 ss2Var = this.$block;
                        this.L$0 = iVar;
                        this.label = 1;
                        Object invoke = ss2Var.invoke(this);
                        if (invoke == h) {
                            return h;
                        }
                        iVar2 = iVar;
                        obj = invoke;
                    } catch (Throwable th2) {
                        th = th2;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    iVar.e();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar2 = (i) this.L$0;
                try {
                    kotlin.f.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    this.$this_withTransaction.endTransaction();
                    throw th;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            iVar2.e();
            return obj;
        } catch (Throwable th5) {
            th = th5;
            iVar = h;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
