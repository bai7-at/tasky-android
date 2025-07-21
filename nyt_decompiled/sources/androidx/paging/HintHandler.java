package androidx.paging;

import androidx.paging.HintHandler;
import androidx.paging.s;
import defpackage.gt2;
import defpackage.v83;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes.dex */
public final class HintHandler {
    private final b a = new b();

    /* JADX INFO: Access modifiers changed from: private */
    final class a {
        private s a;
        private final MutableSharedFlow b = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);

        public a() {
        }

        public final Flow a() {
            return this.b;
        }

        public final s b() {
            return this.a;
        }

        public final void c(s sVar) {
            this.a = sVar;
            if (sVar != null) {
                this.b.tryEmit(sVar);
            }
        }
    }

    private final class b {
        private final a a;
        private final a b;
        private s.a c;
        private final ReentrantLock d = new ReentrantLock();

        public b() {
            this.a = HintHandler.this.new a();
            this.b = HintHandler.this.new a();
        }

        public final Flow a() {
            return this.b.a();
        }

        public final s.a b() {
            return this.c;
        }

        public final Flow c() {
            return this.a.a();
        }

        public final void d(s.a aVar, gt2 gt2Var) {
            zq3.h(gt2Var, "block");
            ReentrantLock reentrantLock = this.d;
            try {
                reentrantLock.lock();
                if (aVar != null) {
                    this.c = aVar;
                }
                gt2Var.invoke(this.a, this.b);
                ww8 ww8Var = ww8.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public final void a(final LoadType loadType, final s sVar) {
        zq3.h(loadType, "loadType");
        zq3.h(sVar, "viewportHint");
        if (loadType == LoadType.PREPEND || loadType == LoadType.APPEND) {
            this.a.d(null, new gt2() { // from class: androidx.paging.HintHandler$forceSetHint$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(HintHandler.a aVar, HintHandler.a aVar2) {
                    zq3.h(aVar, "prependHint");
                    zq3.h(aVar2, "appendHint");
                    if (LoadType.this == LoadType.PREPEND) {
                        aVar.c(sVar);
                    } else {
                        aVar2.c(sVar);
                    }
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((HintHandler.a) obj, (HintHandler.a) obj2);
                    return ww8.a;
                }
            });
            return;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public final s.a b() {
        return this.a.b();
    }

    public final Flow c(LoadType loadType) {
        zq3.h(loadType, "loadType");
        int i = c.a[loadType.ordinal()];
        if (i == 1) {
            return this.a.c();
        }
        if (i == 2) {
            return this.a.a();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void d(final s sVar) {
        zq3.h(sVar, "viewportHint");
        this.a.d(sVar instanceof s.a ? (s.a) sVar : null, new gt2() { // from class: androidx.paging.HintHandler$processHint$1
            {
                super(2);
            }

            public final void b(HintHandler.a aVar, HintHandler.a aVar2) {
                zq3.h(aVar, "prependHint");
                zq3.h(aVar2, "appendHint");
                if (v83.a(s.this, aVar.b(), LoadType.PREPEND)) {
                    aVar.c(s.this);
                }
                if (v83.a(s.this, aVar2.b(), LoadType.APPEND)) {
                    aVar2.c(s.this);
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((HintHandler.a) obj, (HintHandler.a) obj2);
                return ww8.a;
            }
        });
    }
}
