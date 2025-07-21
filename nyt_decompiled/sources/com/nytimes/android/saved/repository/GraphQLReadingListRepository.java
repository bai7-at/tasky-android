package com.nytimes.android.saved.repository;

import com.nytimes.android.logging.NYTLogger;
import defpackage.aq6;
import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes4.dex */
public final class GraphQLReadingListRepository implements aq6 {
    private final SavedQueryFactory a;

    public GraphQLReadingListRepository(SavedQueryFactory savedQueryFactory) {
        zq3.h(savedQueryFactory, "savedQueryFactory");
        this.a = savedQueryFactory;
    }

    @Override // defpackage.aq6
    public Object a(String str, by0 by0Var) {
        NYTLogger.l("adding to reading list " + str, new Object[0]);
        Object a = this.a.a(str, by0Var);
        return a == a.h() ? a : ww8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: Exception -> 0x007b, TRY_LEAVE, TryCatch #0 {Exception -> 0x007b, blocks: (B:11:0x002d, B:14:0x005b, B:16:0x006c, B:21:0x0046, B:28:0x0040), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0057 -> B:13:0x0033). Please report as a decompilation issue!!! */
    @Override // defpackage.aq6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.saved.repository.GraphQLReadingListRepository$downloadFromReadingList$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.saved.repository.GraphQLReadingListRepository$downloadFromReadingList$1 r0 = (com.nytimes.android.saved.repository.GraphQLReadingListRepository$downloadFromReadingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.repository.GraphQLReadingListRepository$downloadFromReadingList$1 r0 = new com.nytimes.android.saved.repository.GraphQLReadingListRepository$downloadFromReadingList$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r0.L$0
            com.nytimes.android.saved.repository.GraphQLReadingListRepository r2 = (com.nytimes.android.saved.repository.GraphQLReadingListRepository) r2
            kotlin.f.b(r8)     // Catch: java.lang.Exception -> L7b
            r6 = r0
            r0 = r7
            r7 = r2
        L33:
            r2 = r6
            goto L5b
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.f.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L7b
            r8.<init>()     // Catch: java.lang.Exception -> L7b
            r2 = 0
        L46:
            com.nytimes.android.saved.repository.SavedQueryFactory r4 = r7.a     // Catch: java.lang.Exception -> L7b
            r0.L$0 = r7     // Catch: java.lang.Exception -> L7b
            r0.L$1 = r8     // Catch: java.lang.Exception -> L7b
            r0.label = r3     // Catch: java.lang.Exception -> L7b
            r5 = 50
            java.lang.Object r2 = r4.c(r5, r2, r0)     // Catch: java.lang.Exception -> L7b
            if (r2 != r1) goto L57
            return r1
        L57:
            r6 = r0
            r0 = r8
            r8 = r2
            goto L33
        L5b:
            yp6 r8 = (defpackage.yp6) r8     // Catch: java.lang.Exception -> L7b
            java.util.List r4 = r8.a()     // Catch: java.lang.Exception -> L7b
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Exception -> L7b
            r0.addAll(r4)     // Catch: java.lang.Exception -> L7b
            java.lang.String r8 = r8.b()     // Catch: java.lang.Exception -> L7b
            if (r8 != 0) goto L76
            r7 = 0
            java.lang.Boolean r7 = defpackage.cc0.a(r7)     // Catch: java.lang.Exception -> L7b
            kotlin.Pair r7 = defpackage.du8.a(r7, r0)     // Catch: java.lang.Exception -> L7b
            goto L87
        L76:
            r6 = r2
            r2 = r8
            r8 = r0
            r0 = r6
            goto L46
        L7b:
            java.lang.Boolean r7 = defpackage.cc0.a(r3)
            java.util.List r8 = kotlin.collections.i.l()
            kotlin.Pair r7 = defpackage.du8.a(r7, r8)
        L87:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.repository.GraphQLReadingListRepository.b(by0):java.lang.Object");
    }

    @Override // defpackage.aq6
    public Object c(String str, by0 by0Var) {
        NYTLogger.l("deleting " + str + " from reading list", new Object[0]);
        Object d = this.a.d(str, by0Var);
        return d == a.h() ? d : ww8.a;
    }
}
