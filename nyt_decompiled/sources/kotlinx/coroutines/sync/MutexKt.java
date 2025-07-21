package kotlinx.coroutines.sync;

import defpackage.bk3;
import defpackage.by0;
import defpackage.qs2;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes5.dex */
public final class MutexKt {
    private static final int HOLDS_LOCK_ANOTHER_OWNER = 2;
    private static final int HOLDS_LOCK_UNLOCKED = 0;
    private static final int HOLDS_LOCK_YES = 1;
    private static final Symbol NO_OWNER = new Symbol("NO_OWNER");
    private static final Symbol ON_LOCK_ALREADY_LOCKED_BY_OWNER = new Symbol("ALREADY_LOCKED_BY_OWNER");
    private static final int TRY_LOCK_ALREADY_LOCKED_BY_OWNER = 2;
    private static final int TRY_LOCK_FAILED = 1;
    private static final int TRY_LOCK_SUCCESS = 0;

    public static final Mutex Mutex(boolean z) {
        return new MutexImpl(z);
    }

    public static /* synthetic */ Mutex Mutex$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Mutex(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object withLock(kotlinx.coroutines.sync.Mutex r4, java.lang.Object r5, defpackage.qs2 r6, defpackage.by0<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.MutexKt$withLock$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt$withLock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$2
            r6 = r4
            qs2 r6 = (defpackage.qs2) r6
            java.lang.Object r5 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            kotlin.f.b(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.f.b(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.lock(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.mo865invoke()     // Catch: java.lang.Throwable -> L5c
            defpackage.bk3.b(r3)
            r4.unlock(r5)
            defpackage.bk3.a(r3)
            return r6
        L5c:
            r6 = move-exception
            defpackage.bk3.b(r3)
            r4.unlock(r5)
            defpackage.bk3.a(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexKt.withLock(kotlinx.coroutines.sync.Mutex, java.lang.Object, qs2, by0):java.lang.Object");
    }

    private static final <T> Object withLock$$forInline(Mutex mutex, Object obj, qs2 qs2Var, by0<? super T> by0Var) {
        bk3.c(0);
        mutex.lock(obj, by0Var);
        bk3.c(1);
        try {
            return qs2Var.mo865invoke();
        } finally {
            bk3.b(1);
            mutex.unlock(obj);
            bk3.a(1);
        }
    }

    public static /* synthetic */ Object withLock$default(Mutex mutex, Object obj, qs2 qs2Var, by0 by0Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        bk3.c(0);
        mutex.lock(obj, by0Var);
        bk3.c(1);
        try {
            return qs2Var.mo865invoke();
        } finally {
            bk3.b(1);
            mutex.unlock(obj);
            bk3.a(1);
        }
    }
}
