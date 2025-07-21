package androidx.paging;

import defpackage.by0;
import defpackage.ss2;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class SingleRunner {
    public static final a b = new a(null);
    private final Holder a;

    private static final class CancelIsolatedRunnerException extends CancellationException {
        private final SingleRunner runner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelIsolatedRunnerException(SingleRunner singleRunner) {
            super("Cancelled isolated runner");
            zq3.h(singleRunner, "runner");
            this.runner = singleRunner;
        }

        public final SingleRunner a() {
            return this.runner;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Holder {
        private final SingleRunner a;
        private final boolean b;
        private final Mutex c;
        private Job d;
        private int e;

        public Holder(SingleRunner singleRunner, boolean z) {
            zq3.h(singleRunner, "singleRunner");
            this.a = singleRunner;
            this.b = z;
            this.c = MutexKt.Mutex$default(false, 1, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:11:0x0054, B:13:0x0058, B:14:0x005d), top: B:10:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(kotlinx.coroutines.Job r6, defpackage.by0 r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.SingleRunner$Holder$onFinish$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = (androidx.paging.SingleRunner$Holder$onFinish$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = new androidx.paging.SingleRunner$Holder$onFinish$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L40
                if (r2 != r3) goto L38
                java.lang.Object r5 = r0.L$2
                kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
                java.lang.Object r6 = r0.L$1
                kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                kotlin.f.b(r7)
                r7 = r5
                r5 = r0
                goto L54
            L38:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L40:
                kotlin.f.b(r7)
                kotlinx.coroutines.sync.Mutex r7 = r5.c
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r0 = r7.lock(r4, r0)
                if (r0 != r1) goto L54
                return r1
            L54:
                kotlinx.coroutines.Job r0 = r5.d     // Catch: java.lang.Throwable -> L5b
                if (r6 != r0) goto L5d
                r5.d = r4     // Catch: java.lang.Throwable -> L5b
                goto L5d
            L5b:
                r5 = move-exception
                goto L65
            L5d:
                ww8 r5 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L5b
                r7.unlock(r4)
                ww8 r5 = defpackage.ww8.a
                return r5
            L65:
                r7.unlock(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.a(kotlinx.coroutines.Job, by0):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        
            r2.cancel((java.util.concurrent.CancellationException) new androidx.paging.SingleRunner.CancelIsolatedRunnerException(r8.a));
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009a A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:14:0x00b1, B:31:0x0071, B:33:0x0075, B:35:0x007b, B:38:0x0081, B:43:0x008e, B:45:0x009a), top: B:30:0x0071 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(int r9, kotlinx.coroutines.Job r10, defpackage.by0 r11) {
            /*
                Method dump skipped, instructions count: 194
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.b(int, kotlinx.coroutines.Job, by0):java.lang.Object");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SingleRunner(boolean z) {
        this.a = new Holder(this, z);
    }

    public static /* synthetic */ Object c(SingleRunner singleRunner, int i, ss2 ss2Var, by0 by0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return singleRunner.b(i, ss2Var, by0Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r5.a() != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        throw r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.ss2 r6, defpackage.by0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.SingleRunner$runInIsolation$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner$runInIsolation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SingleRunner$runInIsolation$1 r0 = new androidx.paging.SingleRunner$runInIsolation$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.paging.SingleRunner r4 = (androidx.paging.SingleRunner) r4
            kotlin.f.b(r7)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L4b
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r7)
            androidx.paging.SingleRunner$runInIsolation$2 r7 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            r0.L$0 = r4     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            r0.label = r3     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r7, r0)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            if (r4 != r1) goto L51
            return r1
        L4b:
            androidx.paging.SingleRunner r6 = r5.a()
            if (r6 != r4) goto L54
        L51:
            ww8 r4 = defpackage.ww8.a
            return r4
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.b(int, ss2, by0):java.lang.Object");
    }

    public /* synthetic */ SingleRunner(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
