package androidx.paging;

import androidx.paging.PageEvent;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
final class FlattenedPageController {
    private final a a = new a();
    private final Mutex b = MutexKt.Mutex$default(false, 1, null);
    private int c = -1;

    public final PageEvent.Insert a() {
        PageEvent pageEvent = (PageEvent) kotlin.collections.i.m0(this.a.b());
        if (pageEvent == null || !(pageEvent instanceof PageEvent.Insert)) {
            return null;
        }
        PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
        if (insert.f() == LoadType.REFRESH) {
            return insert;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x004e, B:12:0x006e, B:14:0x0074, B:16:0x007c, B:17:0x0082), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.paging.FlattenedPageController$getStateAsEvents$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = (androidx.paging.FlattenedPageController$getStateAsEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = new androidx.paging.FlattenedPageController$getStateAsEvents$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r0 = r0.L$0
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            kotlin.f.b(r8)
            r8 = r7
            r7 = r0
            goto L4e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.f.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            androidx.paging.a r0 = r7.a     // Catch: java.lang.Throwable -> L80
            java.util.List r0 = r0.b()     // Catch: java.lang.Throwable -> L80
            int r7 = r7.c     // Catch: java.lang.Throwable -> L80
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L80
            int r7 = r7 - r1
            int r7 = r7 + r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L80
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L80
            r2 = 10
            int r2 = kotlin.collections.i.w(r0, r2)     // Catch: java.lang.Throwable -> L80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L80
            r2 = 0
        L6e:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L80
            int r5 = r2 + 1
            if (r2 >= 0) goto L82
            kotlin.collections.i.v()     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r7 = move-exception
            goto L93
        L82:
            androidx.paging.PageEvent r3 = (androidx.paging.PageEvent) r3     // Catch: java.lang.Throwable -> L80
            bj3 r6 = new bj3     // Catch: java.lang.Throwable -> L80
            int r2 = r2 + r7
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L80
            r1.add(r6)     // Catch: java.lang.Throwable -> L80
            r2 = r5
            goto L6e
        L8f:
            r8.unlock(r4)
            return r1
        L93:
            r8.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.b(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bj3 r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.FlattenedPageController$record$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController$record$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$record$1 r0 = new androidx.paging.FlattenedPageController$record$1
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
            bj3 r6 = (defpackage.bj3) r6
            java.lang.Object r0 = r0.L$0
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
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
            kotlinx.coroutines.sync.Mutex r7 = r5.b
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            int r0 = r6.a()     // Catch: java.lang.Throwable -> L6d
            r5.c = r0     // Catch: java.lang.Throwable -> L6d
            androidx.paging.a r5 = r5.a     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L6d
            androidx.paging.PageEvent r6 = (androidx.paging.PageEvent) r6     // Catch: java.lang.Throwable -> L6d
            r5.a(r6)     // Catch: java.lang.Throwable -> L6d
            ww8 r5 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L6d
            r7.unlock(r4)
            ww8 r5 = defpackage.ww8.a
            return r5
        L6d:
            r5 = move-exception
            r7.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.c(bj3, by0):java.lang.Object");
    }
}
