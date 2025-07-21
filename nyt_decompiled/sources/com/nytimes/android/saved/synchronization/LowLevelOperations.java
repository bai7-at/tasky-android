package com.nytimes.android.saved.synchronization;

import com.nytimes.android.saved.SavedAssetIndexList;
import defpackage.aq6;
import defpackage.by0;
import defpackage.s87;
import defpackage.y87;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class LowLevelOperations {
    private final y87 a;
    private final aq6 b;
    private final SavedListFlyWeight c;

    public LowLevelOperations(y87 y87Var, aq6 aq6Var, SavedListFlyWeight savedListFlyWeight) {
        zq3.h(y87Var, "repository");
        zq3.h(aq6Var, "readingListRepository");
        zq3.h(savedListFlyWeight, "flyWeight");
        this.a = y87Var;
        this.b = aq6Var;
        this.c = savedListFlyWeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(1:23))|12|13|14|15))|26|6|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        com.nytimes.android.logging.NYTLogger.i(r5, "Failed to add to reading list " + r6, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.s87 r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.saved.synchronization.LowLevelOperations$addToReadingList$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.saved.synchronization.LowLevelOperations$addToReadingList$1 r0 = (com.nytimes.android.saved.synchronization.LowLevelOperations$addToReadingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.LowLevelOperations$addToReadingList$1 r0 = new com.nytimes.android.saved.synchronization.LowLevelOperations$addToReadingList$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r5 = r0.L$0
            r6 = r5
            s87 r6 = (defpackage.s87) r6
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L2f
            goto L4d
        L2f:
            r5 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r7)
            aq6 r5 = r5.b     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = r6.getUrl()     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r6     // Catch: java.lang.Exception -> L2f
            r0.label = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r5 = r5.a(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r5.<init>()     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = "Added to reading list "
            r5.append(r7)     // Catch: java.lang.Exception -> L2f
            r5.append(r6)     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L2f
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2f
            com.nytimes.android.logging.NYTLogger.l(r5, r7)     // Catch: java.lang.Exception -> L2f
            r3 = r4
            goto L7b
        L65:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to add to reading list "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.nytimes.android.logging.NYTLogger.i(r5, r6, r7)
        L7b:
            java.lang.Boolean r5 = defpackage.cc0.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.f(s87, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(1:23))|12|13|14|15))|26|6|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        com.nytimes.android.logging.NYTLogger.i(r5, "Failed to remove from reading list " + r6, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.s87 r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.saved.synchronization.LowLevelOperations$removeFromReadingList$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.saved.synchronization.LowLevelOperations$removeFromReadingList$1 r0 = (com.nytimes.android.saved.synchronization.LowLevelOperations$removeFromReadingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.LowLevelOperations$removeFromReadingList$1 r0 = new com.nytimes.android.saved.synchronization.LowLevelOperations$removeFromReadingList$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r5 = r0.L$0
            r6 = r5
            s87 r6 = (defpackage.s87) r6
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L2f
            goto L4d
        L2f:
            r5 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r7)
            aq6 r5 = r5.b     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = r6.getUrl()     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r6     // Catch: java.lang.Exception -> L2f
            r0.label = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r5 = r5.c(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r5.<init>()     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = "Removed from reading list "
            r5.append(r7)     // Catch: java.lang.Exception -> L2f
            r5.append(r6)     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L2f
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2f
            com.nytimes.android.logging.NYTLogger.l(r5, r7)     // Catch: java.lang.Exception -> L2f
            r3 = r4
            goto L7b
        L65:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to remove from reading list "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.nytimes.android.logging.NYTLogger.i(r5, r6, r7)
        L7b:
            java.lang.Boolean r5 = defpackage.cc0.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.r(s87, by0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, s87] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.s87 r10, defpackage.by0 r11) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.c(s87, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:25:0x007e, B:26:0x008a, B:28:0x0090, B:30:0x0098, B:31:0x009f, B:33:0x00a7, B:35:0x00ca, B:36:0x00ae, B:39:0x00d5), top: B:24:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r17, java.util.List r18, defpackage.by0 r19) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.d(java.util.Collection, java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:26:0x0066, B:29:0x00e0, B:31:0x00e8), top: B:25:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #1 {all -> 0x00ef, blocks: (B:33:0x00b4, B:35:0x00ba, B:39:0x00f2, B:51:0x009d), top: B:50:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2 A[Catch: all -> 0x00ef, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ef, blocks: (B:33:0x00b4, B:35:0x00ba, B:39:0x00f2, B:51:0x009d), top: B:50:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00da -> B:28:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.e(by0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, s87] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.s87 r10, defpackage.by0 r11) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.g(s87, by0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(4:(2:3|(9:5|6|(1:(1:(1:(6:11|12|13|14|15|16)(2:22|23))(9:24|25|26|27|28|29|30|31|(4:33|34|35|(1:37)(7:38|27|28|29|30|31|(2:44|(1:46)(4:47|14|15|16))(0)))(0)))(1:57))(2:64|(1:66)(1:67))|58|59|60|30|31|(0)(0)))|30|31|(0)(0))|68|6|(0)(0)|58|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0165, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc A[Catch: all -> 0x011a, TRY_LEAVE, TryCatch #5 {all -> 0x011a, blocks: (B:31:0x00c6, B:33:0x00cc, B:35:0x00ed, B:42:0x0125, B:44:0x013d), top: B:30:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d A[Catch: all -> 0x011a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x011a, blocks: (B:31:0x00c6, B:33:0x00cc, B:35:0x00ed, B:42:0x0125, B:44:0x013d), top: B:30:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0106 -> B:27:0x0112). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012c -> B:28:0x0138). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.Collection r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.h(java.util.Collection, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:17:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.saved.synchronization.LowLevelOperations$deleteCache$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.saved.synchronization.LowLevelOperations$deleteCache$1 r0 = (com.nytimes.android.saved.synchronization.LowLevelOperations$deleteCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.LowLevelOperations$deleteCache$1 r0 = new com.nytimes.android.saved.synchronization.LowLevelOperations$deleteCache$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L96
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            com.nytimes.android.saved.SavedAssetIndex r6 = (com.nytimes.android.saved.SavedAssetIndex) r6
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.saved.synchronization.LowLevelOperations r5 = (com.nytimes.android.saved.synchronization.LowLevelOperations) r5
            kotlin.f.b(r7)
            goto L75
        L44:
            kotlin.f.b(r7)
            com.nytimes.android.saved.SavedAssetIndexList r7 = r6.n()
            java.util.List r7 = r7.i()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L56:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L84
            java.lang.Object r7 = r2.next()
            com.nytimes.android.saved.SavedAssetIndex r7 = (com.nytimes.android.saved.SavedAssetIndex) r7
            y87 r5 = r6.a
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r5 = r5.a(r7, r0)
            if (r5 != r1) goto L73
            return r1
        L73:
            r5 = r6
            r6 = r7
        L75:
            java.lang.String r6 = r6.getUri()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "Deleted record %s"
            com.nytimes.android.logging.NYTLogger.l(r7, r6)
            r6 = r5
            goto L56
        L84:
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r6 = r6.c
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L96
            return r1
        L96:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "Finished deleting saved article cache"
            com.nytimes.android.logging.NYTLogger.l(r7, r6)
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.i(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.s87 r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.saved.synchronization.LowLevelOperations$deleteFromQueueForDeletion$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.saved.synchronization.LowLevelOperations$deleteFromQueueForDeletion$1 r0 = (com.nytimes.android.saved.synchronization.LowLevelOperations$deleteFromQueueForDeletion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.LowLevelOperations$deleteFromQueueForDeletion$1 r0 = new com.nytimes.android.saved.synchronization.LowLevelOperations$deleteFromQueueForDeletion$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.L$2
            com.nytimes.android.saved.SavedAssetIndexList r7 = (com.nytimes.android.saved.SavedAssetIndexList) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r0 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r0
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L39
            goto L92
        L39:
            r7 = move-exception
            goto La1
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r8 = r0.L$1
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r8 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r8
            java.lang.Object r2 = r0.L$0
            s87 r2 = (defpackage.s87) r2
            kotlin.f.b(r9)
            r9 = r8
            r8 = r2
            goto L71
        L56:
            kotlin.f.b(r9)
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r7 = r7.c
            kotlinx.coroutines.sync.Mutex r9 = com.nytimes.android.saved.synchronization.SavedListFlyWeight.c(r7)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r6 = r9
            r9 = r7
            r7 = r6
        L71:
            com.nytimes.android.saved.SavedAssetIndexList r2 = r9.f()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r8 = r8.getUrl()     // Catch: java.lang.Throwable -> L9d
            r2.d(r8)     // Catch: java.lang.Throwable -> L9d
            a97 r8 = com.nytimes.android.saved.synchronization.SavedListFlyWeight.a(r9)     // Catch: java.lang.Throwable -> L9d
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L9d
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9d
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L9d
            r0.label = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r8 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L9d
            if (r8 != r1) goto L8f
            return r1
        L8f:
            r8 = r7
            r0 = r9
            r7 = r2
        L92:
            com.nytimes.android.saved.synchronization.SavedListFlyWeight.d(r0, r7)     // Catch: java.lang.Throwable -> L39
            ww8 r7 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L39
            r8.unlock(r5)
            ww8 r7 = defpackage.ww8.a
            return r7
        L9d:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La1:
            r8.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.j(s87, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.saved.synchronization.LowLevelOperations$deleteQueuedItems$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.saved.synchronization.LowLevelOperations$deleteQueuedItems$1 r0 = (com.nytimes.android.saved.synchronization.LowLevelOperations$deleteQueuedItems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.LowLevelOperations$deleteQueuedItems$1 r0 = new com.nytimes.android.saved.synchronization.LowLevelOperations$deleteQueuedItems$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.L$2
            com.nytimes.android.saved.SavedAssetIndexList r6 = (com.nytimes.android.saved.SavedAssetIndexList) r6
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r0 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r0
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L39
            goto L84
        L39:
            r6 = move-exception
            goto L91
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r2 = r0.L$0
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r2 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r2
            kotlin.f.b(r7)
            r7 = r6
            r6 = r2
            goto L67
        L51:
            kotlin.f.b(r7)
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r6 = r6.c
            kotlinx.coroutines.sync.Mutex r7 = com.nytimes.android.saved.synchronization.SavedListFlyWeight.c(r6)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r7.lock(r5, r0)
            if (r2 != r1) goto L67
            return r1
        L67:
            com.nytimes.android.saved.SavedAssetIndexList r2 = r6.f()     // Catch: java.lang.Throwable -> L8f
            r2.e()     // Catch: java.lang.Throwable -> L8f
            a97 r4 = com.nytimes.android.saved.synchronization.SavedListFlyWeight.a(r6)     // Catch: java.lang.Throwable -> L8f
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L8f
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L8f
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L8f
            r0.label = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 != r1) goto L81
            return r1
        L81:
            r0 = r6
            r1 = r7
            r6 = r2
        L84:
            com.nytimes.android.saved.synchronization.SavedListFlyWeight.d(r0, r6)     // Catch: java.lang.Throwable -> L39
            ww8 r6 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L39
            r1.unlock(r5)
            ww8 r6 = defpackage.ww8.a
            return r6
        L8f:
            r6 = move-exception
            r1 = r7
        L91:
            r1.unlock(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.k(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.util.List r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.saved.synchronization.LowLevelOperations$downloadAssets$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.saved.synchronization.LowLevelOperations$downloadAssets$1 r0 = (com.nytimes.android.saved.synchronization.LowLevelOperations$downloadAssets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.LowLevelOperations$downloadAssets$1 r0 = new com.nytimes.android.saved.synchronization.LowLevelOperations$downloadAssets$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            y87 r4 = r4.a     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r4.c(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r4 = defpackage.cc0.a(r3)     // Catch: java.lang.Exception -> L29
            kotlin.Pair r4 = defpackage.du8.a(r6, r4)     // Catch: java.lang.Exception -> L29
            goto L5e
        L4a:
            java.lang.String r5 = "failed to download saved articles"
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.nytimes.android.logging.NYTLogger.i(r4, r5, r0)
            java.util.List r4 = kotlin.collections.i.l()
            java.lang.Boolean r5 = defpackage.cc0.a(r6)
            kotlin.Pair r4 = defpackage.du8.a(r4, r5)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.l(java.util.List, by0):java.lang.Object");
    }

    public final Object m(by0 by0Var) {
        return this.b.b(by0Var);
    }

    public final SavedAssetIndexList n() {
        return this.c.f();
    }

    public final boolean o(String str) {
        zq3.h(str, "url");
        return this.c.f().j(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.s87 r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.saved.synchronization.LowLevelOperations$queueForDeletion$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.saved.synchronization.LowLevelOperations$queueForDeletion$1 r0 = (com.nytimes.android.saved.synchronization.LowLevelOperations$queueForDeletion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.LowLevelOperations$queueForDeletion$1 r0 = new com.nytimes.android.saved.synchronization.LowLevelOperations$queueForDeletion$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.L$2
            com.nytimes.android.saved.SavedAssetIndexList r7 = (com.nytimes.android.saved.SavedAssetIndexList) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r0 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r0
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L39
            goto L94
        L39:
            r7 = move-exception
            goto La3
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r8 = r0.L$1
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r8 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r8
            java.lang.Object r2 = r0.L$0
            s87 r2 = (defpackage.s87) r2
            kotlin.f.b(r9)
            r9 = r8
            r8 = r2
            goto L71
        L56:
            kotlin.f.b(r9)
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r7 = r7.c
            kotlinx.coroutines.sync.Mutex r9 = com.nytimes.android.saved.synchronization.SavedListFlyWeight.c(r7)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r6 = r9
            r9 = r7
            r7 = r6
        L71:
            com.nytimes.android.saved.SavedAssetIndexList r2 = r9.f()     // Catch: java.lang.Throwable -> L9f
            com.nytimes.android.saved.SavedAssetIndex$Companion r4 = com.nytimes.android.saved.SavedAssetIndex.Companion     // Catch: java.lang.Throwable -> L9f
            com.nytimes.android.saved.SavedAssetIndex r8 = r4.b(r8)     // Catch: java.lang.Throwable -> L9f
            r2.k(r8)     // Catch: java.lang.Throwable -> L9f
            a97 r8 = com.nytimes.android.saved.synchronization.SavedListFlyWeight.a(r9)     // Catch: java.lang.Throwable -> L9f
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L9f
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9f
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L9f
            r0.label = r3     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r8 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L9f
            if (r8 != r1) goto L91
            return r1
        L91:
            r8 = r7
            r0 = r9
            r7 = r2
        L94:
            com.nytimes.android.saved.synchronization.SavedListFlyWeight.d(r0, r7)     // Catch: java.lang.Throwable -> L39
            ww8 r7 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L39
            r8.unlock(r5)
            ww8 r7 = defpackage.ww8.a
            return r7
        L9f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La3:
            r8.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.p(s87, by0):java.lang.Object");
    }

    public final Object q(s87 s87Var, by0 by0Var) {
        return this.a.d(s87Var, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #2 {all -> 0x006b, blocks: (B:26:0x0066, B:27:0x00e9, B:29:0x00f1), top: B:25:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #0 {all -> 0x00f6, blocks: (B:31:0x00c0, B:33:0x00c6, B:37:0x00f9, B:55:0x0099, B:57:0x00ab), top: B:54:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9 A[Catch: all -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f6, blocks: (B:31:0x00c0, B:33:0x00c6, B:37:0x00f9, B:55:0x0099, B:57:0x00ab), top: B:54:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:31:0x00c0, B:33:0x00c6, B:37:0x00f9, B:55:0x0099, B:57:0x00ab), top: B:54:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e6 -> B:27:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.s(by0):java.lang.Object");
    }

    public final int t() {
        return this.c.f().q();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.util.List r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.saved.synchronization.LowLevelOperations$updateExistingSyncedItems$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.saved.synchronization.LowLevelOperations$updateExistingSyncedItems$1 r0 = (com.nytimes.android.saved.synchronization.LowLevelOperations$updateExistingSyncedItems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.LowLevelOperations$updateExistingSyncedItems$1 r0 = new com.nytimes.android.saved.synchronization.LowLevelOperations$updateExistingSyncedItems$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L55
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.L$2
            com.nytimes.android.saved.SavedAssetIndexList r7 = (com.nytimes.android.saved.SavedAssetIndexList) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r0 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r0
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L39
            goto L8d
        L39:
            r7 = move-exception
            goto L9c
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r8 = r0.L$1
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r8 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r8
            java.lang.Object r2 = r0.L$0
            java.util.List r2 = (java.util.List) r2
            kotlin.f.b(r9)
            r9 = r8
            r8 = r2
            goto L70
        L55:
            kotlin.f.b(r9)
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r7 = r7.c
            kotlinx.coroutines.sync.Mutex r9 = com.nytimes.android.saved.synchronization.SavedListFlyWeight.c(r7)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 != r1) goto L6d
            return r1
        L6d:
            r6 = r9
            r9 = r7
            r7 = r6
        L70:
            com.nytimes.android.saved.SavedAssetIndexList r2 = r9.f()     // Catch: java.lang.Throwable -> L98
            r2.r(r8)     // Catch: java.lang.Throwable -> L98
            a97 r8 = com.nytimes.android.saved.synchronization.SavedListFlyWeight.a(r9)     // Catch: java.lang.Throwable -> L98
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L98
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L98
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L98
            r0.label = r3     // Catch: java.lang.Throwable -> L98
            java.lang.Object r8 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L98
            if (r8 != r1) goto L8a
            return r1
        L8a:
            r8 = r7
            r0 = r9
            r7 = r2
        L8d:
            com.nytimes.android.saved.synchronization.SavedListFlyWeight.d(r0, r7)     // Catch: java.lang.Throwable -> L39
            ww8 r7 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L39
            r8.unlock(r5)
            ww8 r7 = defpackage.ww8.a
            return r7
        L98:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9c:
            r8.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.LowLevelOperations.u(java.util.List, by0):java.lang.Object");
    }
}
