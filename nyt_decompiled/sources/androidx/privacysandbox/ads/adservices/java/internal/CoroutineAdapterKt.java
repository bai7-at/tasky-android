package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import defpackage.j64;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;

/* loaded from: classes.dex */
public abstract class CoroutineAdapterKt {
    public static final j64 b(final Deferred deferred, final Object obj) {
        zq3.h(deferred, "<this>");
        j64 a = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: l01
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object a(CallbackToFutureAdapter.a aVar) {
                Object d;
                d = CoroutineAdapterKt.d(Deferred.this, obj, aVar);
                return d;
            }
        });
        zq3.g(a, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a;
    }

    public static /* synthetic */ j64 c(Deferred deferred, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(deferred, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(final Deferred deferred, Object obj, final CallbackToFutureAdapter.a aVar) {
        zq3.h(deferred, "$this_asListenableFuture");
        zq3.h(aVar, "completer");
        deferred.invokeOnCompletion(new ss2() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((Throwable) obj2);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                if (th == null) {
                    CallbackToFutureAdapter.a.this.c(deferred.getCompleted());
                } else if (th instanceof CancellationException) {
                    CallbackToFutureAdapter.a.this.d();
                } else {
                    CallbackToFutureAdapter.a.this.f(th);
                }
            }
        });
        return obj;
    }
}
