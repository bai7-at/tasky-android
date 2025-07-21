package androidx.room;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ThreadContextElementKt;

/* loaded from: classes.dex */
public abstract class RoomDatabaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext b(RoomDatabase roomDatabase, kotlin.coroutines.c cVar) {
        i iVar = new i(cVar);
        return cVar.plus(iVar).plus(ThreadContextElementKt.asContextElement(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(iVar))));
    }

    private static final Object c(final RoomDatabase roomDatabase, final CoroutineContext coroutineContext, final gt2 gt2Var, by0 by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                @fc1(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", l = {103}, m = "invokeSuspend")
                /* renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                    final /* synthetic */ CancellableContinuation<Object> $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ gt2 $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(RoomDatabase roomDatabase, CancellableContinuation cancellableContinuation, gt2 gt2Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = cancellableContinuation;
                        this.$transactionBlock = gt2Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, by0Var);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineContext b;
                        by0 by0Var;
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.f.b(obj);
                            CoroutineContext.a aVar = ((CoroutineScope) this.L$0).getCoroutineContext().get(kotlin.coroutines.c.P);
                            zq3.e(aVar);
                            b = RoomDatabaseKt.b(this.$this_startTransactionCoroutine, (kotlin.coroutines.c) aVar);
                            CancellableContinuation<Object> cancellableContinuation = this.$continuation;
                            Result.a aVar2 = Result.a;
                            gt2 gt2Var = this.$transactionBlock;
                            this.L$0 = cancellableContinuation;
                            this.label = 1;
                            obj = BuildersKt.withContext(b, gt2Var, this);
                            if (obj == h) {
                                return h;
                            }
                            by0Var = cancellableContinuation;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            by0Var = (by0) this.L$0;
                            kotlin.f.b(obj);
                        }
                        by0Var.resumeWith(Result.b(obj));
                        return ww8.a;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                        return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        BuildersKt.runBlocking(CoroutineContext.this.minusKey(kotlin.coroutines.c.P), new AnonymousClass1(roomDatabase, cancellableContinuationImpl, gt2Var, null));
                    } catch (Throwable th) {
                        cancellableContinuationImpl.cancel(th);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public static final Object d(RoomDatabase roomDatabase, ss2 ss2Var, by0 by0Var) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, ss2Var, null);
        i iVar = (i) by0Var.getContext().get(i.c);
        kotlin.coroutines.c c = iVar != null ? iVar.c() : null;
        return c != null ? BuildersKt.withContext(c, roomDatabaseKt$withTransaction$transactionBlock$1, by0Var) : c(roomDatabase, by0Var.getContext(), roomDatabaseKt$withTransaction$transactionBlock$1, by0Var);
    }
}
