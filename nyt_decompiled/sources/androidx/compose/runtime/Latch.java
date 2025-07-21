package androidx.compose.runtime;

import defpackage.by0;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class Latch {
    private final Object a = new Object();
    private List b = new ArrayList();
    private List c = new ArrayList();
    private boolean d = true;

    public final Object c(by0 by0Var) {
        if (e()) {
            return ww8.a;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this.a) {
            this.b.add(cancellableContinuationImpl);
        }
        cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.compose.runtime.Latch$await$2$2
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
                Object obj = Latch.this.a;
                Latch latch = Latch.this;
                CancellableContinuation<ww8> cancellableContinuation = cancellableContinuationImpl;
                synchronized (obj) {
                    latch.b.remove(cancellableContinuation);
                    ww8 ww8Var = ww8.a;
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
    }

    public final void d() {
        synchronized (this.a) {
            this.d = false;
            ww8 ww8Var = ww8.a;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final void f() {
        synchronized (this.a) {
            try {
                if (e()) {
                    return;
                }
                List list = this.b;
                this.b = this.c;
                this.c = list;
                this.d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    by0 by0Var = (by0) list.get(i);
                    Result.a aVar = Result.a;
                    by0Var.resumeWith(Result.b(ww8.a));
                }
                list.clear();
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
