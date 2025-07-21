package androidx.room;

import android.os.CancellationSignal;
import defpackage.by0;
import defpackage.hc1;
import defpackage.nc8;
import defpackage.q01;
import defpackage.ss2;
import defpackage.ww8;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public abstract class CoroutinesRoom {
    public static final Companion a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Flow a(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable callable) {
            return FlowKt.flow(new CoroutinesRoom$Companion$createFlow$1(z, roomDatabase, strArr, callable, null));
        }

        public final Object b(RoomDatabase roomDatabase, boolean z, final CancellationSignal cancellationSignal, Callable callable, by0 by0Var) {
            kotlin.coroutines.c b;
            final Job launch$default;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            i iVar = (i) by0Var.getContext().get(i.c);
            if (iVar == null || (b = iVar.c()) == null) {
                b = z ? q01.b(roomDatabase) : q01.a(roomDatabase);
            }
            kotlin.coroutines.c cVar = b;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, cVar, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, cancellableContinuationImpl, null), 2, null);
            cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    CancellationSignal cancellationSignal2 = cancellationSignal;
                    if (cancellationSignal2 != null) {
                        nc8.a(cancellationSignal2);
                    }
                    Job.DefaultImpls.cancel$default(launch$default, (CancellationException) null, 1, (Object) null);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result;
        }

        public final Object c(RoomDatabase roomDatabase, boolean z, Callable callable, by0 by0Var) {
            kotlin.coroutines.c b;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            i iVar = (i) by0Var.getContext().get(i.c);
            if (iVar == null || (b = iVar.c()) == null) {
                b = z ? q01.b(roomDatabase) : q01.a(roomDatabase);
            }
            return BuildersKt.withContext(b, new CoroutinesRoom$Companion$execute$2(callable, null), by0Var);
        }

        private Companion() {
        }
    }

    public static final Flow a(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable callable) {
        return a.a(roomDatabase, z, strArr, callable);
    }

    public static final Object b(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable callable, by0 by0Var) {
        return a.b(roomDatabase, z, cancellationSignal, callable, by0Var);
    }

    public static final Object c(RoomDatabase roomDatabase, boolean z, Callable callable, by0 by0Var) {
        return a.c(roomDatabase, z, callable, by0Var);
    }
}
