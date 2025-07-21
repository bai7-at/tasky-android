package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.l;
import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class BroadcastFrameClock implements l {
    private final qs2 a;
    private Throwable c;
    private final Object b = new Object();
    private List d = new ArrayList();
    private List e = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final ss2 a;
        private final by0 b;

        public a(ss2 ss2Var, by0 by0Var) {
            this.a = ss2Var;
            this.b = by0Var;
        }

        public final by0 a() {
            return this.b;
        }

        public final void b(long j) {
            Object b;
            by0 by0Var = this.b;
            try {
                Result.a aVar = Result.a;
                b = Result.b(this.a.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                b = Result.b(kotlin.f.a(th));
            }
            by0Var.resumeWith(b);
        }
    }

    public BroadcastFrameClock(qs2 qs2Var) {
        this.a = qs2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Throwable th) {
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    return;
                }
                this.c = th;
                List list = this.d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    by0 a2 = ((a) list.get(i)).a();
                    Result.a aVar = Result.a;
                    a2.resumeWith(Result.b(kotlin.f.a(th)));
                }
                this.d.clear();
                ww8 ww8Var = ww8.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.runtime.BroadcastFrameClock$a] */
    @Override // androidx.compose.runtime.l
    public Object b(ss2 ss2Var, by0 by0Var) {
        a aVar;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.b) {
            Throwable th = this.c;
            if (th != null) {
                Result.a aVar2 = Result.a;
                cancellableContinuationImpl.resumeWith(Result.b(kotlin.f.a(th)));
            } else {
                ref$ObjectRef.element = new a(ss2Var, cancellableContinuationImpl);
                boolean isEmpty = this.d.isEmpty();
                List list = this.d;
                T t = ref$ObjectRef.element;
                if (t == 0) {
                    zq3.z("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t;
                }
                list.add(aVar);
                cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return ww8.a;
                    }

                    public final void invoke(Throwable th2) {
                        BroadcastFrameClock.a aVar3;
                        Object obj = BroadcastFrameClock.this.b;
                        BroadcastFrameClock broadcastFrameClock = BroadcastFrameClock.this;
                        Ref$ObjectRef<BroadcastFrameClock.a> ref$ObjectRef2 = ref$ObjectRef;
                        synchronized (obj) {
                            try {
                                List list2 = broadcastFrameClock.d;
                                BroadcastFrameClock.a aVar4 = ref$ObjectRef2.element;
                                if (aVar4 == null) {
                                    zq3.z("awaiter");
                                    aVar3 = null;
                                } else {
                                    aVar3 = aVar4;
                                }
                                list2.remove(aVar3);
                                ww8 ww8Var = ww8.a;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                });
                if (isEmpty && this.a != null) {
                    try {
                        this.a.mo865invoke();
                    } catch (Throwable th2) {
                        h(th2);
                    }
                }
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, gt2 gt2Var) {
        return l.a.a(this, obj, gt2Var);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return l.a.b(this, bVar);
    }

    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = !this.d.isEmpty();
        }
        return z;
    }

    public final void j(long j) {
        synchronized (this.b) {
            try {
                List list = this.d;
                this.d = this.e;
                this.e = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((a) list.get(i)).b(j);
                }
                list.clear();
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return l.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return l.a.d(this, coroutineContext);
    }
}
