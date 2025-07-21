package com.nytimes.android.interests;

import android.content.SharedPreferences;
import com.nytimes.android.coroutinesutils.CachedParallelStore;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.coroutinesutils.ParallelStore;
import defpackage.b05;
import defpackage.bq3;
import defpackage.by0;
import defpackage.he0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class InterestsManager {
    private final InterestsRepository a;
    private final InterestsCacheManager b;
    private final CoroutineDispatcher c;
    private final ParallelStore d;
    private final CachedParallelStore e;

    public InterestsManager(InterestsRepository interestsRepository, InterestsCacheManager interestsCacheManager, CoroutineDispatcher coroutineDispatcher, File file, b05 b05Var, SharedPreferences sharedPreferences) {
        zq3.h(interestsRepository, "repository");
        zq3.h(interestsCacheManager, "cacheManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(file, "baseDir");
        zq3.h(b05Var, "clock");
        zq3.h(sharedPreferences, "prefs");
        this.a = interestsRepository;
        this.b = interestsCacheManager;
        this.c = coroutineDispatcher;
        this.d = new ParallelStore(new ss2() { // from class: com.nytimes.android.interests.InterestsManager$userInterestsParallelStore$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Boolean invoke(String str) {
                InterestsCacheManager interestsCacheManager2;
                zq3.h(str, "it");
                interestsCacheManager2 = InterestsManager.this.b;
                return Boolean.valueOf(interestsCacheManager2.j());
            }
        }, new InterestsManager$userInterestsParallelStore$2(this, null), new InterestsManager$userInterestsParallelStore$3(this, null), null, 0L, 24, null);
        this.e = new CachedParallelStore(sharedPreferences, new InterestsManager$interestPreviewsParallelStore$1(b05Var), file, "interestsPreviewCache.json", he0.h(InterestPreview.Companion.serializer()), new InterestsManager$interestPreviewsParallelStore$2(this, null), null, 86400000L, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(by0 by0Var) {
        return BuildersKt.withContext(this.c, new InterestsManager$fetchUserInterestsFromServer$2(this, null), by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.interests.InterestsManager$getInterestsAvailableToAdd$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.interests.InterestsManager$getInterestsAvailableToAdd$1 r0 = (com.nytimes.android.interests.InterestsManager$getInterestsAvailableToAdd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsManager$getInterestsAvailableToAdd$1 r0 = new com.nytimes.android.interests.InterestsManager$getInterestsAvailableToAdd$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.interests.InterestsManager r4 = (com.nytimes.android.interests.InterestsManager) r4
            kotlin.f.b(r5)     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L2d
            goto L47
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            com.nytimes.android.interests.InterestsRepository r5 = r4.a     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L2d
            r0.L$0 = r4     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L2d
            r0.label = r3     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L2d
            java.lang.Object r5 = r5.d(r0)     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L2d
            if (r5 != r1) goto L47
            return r1
        L47:
            java.util.List r5 = (java.util.List) r5     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L2d
            goto L6d
        L4a:
            int r0 = r5.a()
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto L76
            com.nytimes.android.coroutinesutils.CachedParallelStore r4 = r4.e
            com.nytimes.android.interests.InterestPreview$Companion r5 = com.nytimes.android.interests.InterestPreview.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            kotlinx.serialization.KSerializer r5 = defpackage.he0.h(r5)
            kotlin.Pair r4 = r4.e(r5)
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r4.c()
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L6e
        L6d:
            return r5
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "304 error with no data available in cache"
            r4.<init>(r5)
            throw r4
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsManager.i(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087 A[PHI: r11
      0x0087: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v1 java.lang.Object) binds: [B:18:0x0084, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r8, defpackage.qs2 r9, defpackage.qs2 r10, defpackage.by0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.nytimes.android.interests.InterestsManager$addInterestsToUser$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.android.interests.InterestsManager$addInterestsToUser$1 r0 = (com.nytimes.android.interests.InterestsManager$addInterestsToUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsManager$addInterestsToUser$1 r0 = new com.nytimes.android.interests.InterestsManager$addInterestsToUser$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r11)
            goto L87
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.L$0
            qs2 r7 = (defpackage.qs2) r7
            kotlin.f.b(r11)
            goto L75
        L40:
            java.lang.Object r7 = r0.L$1
            r10 = r7
            qs2 r10 = (defpackage.qs2) r10
            java.lang.Object r7 = r0.L$0
            r9 = r7
            qs2 r9 = (defpackage.qs2) r9
            kotlin.f.b(r11)
            goto L60
        L4e:
            kotlin.f.b(r11)
            com.nytimes.android.interests.InterestsRepository r7 = r7.a
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r11 = r7.a(r8, r0)
            if (r11 != r1) goto L60
            return r1
        L60:
            com.nytimes.android.coroutinesutils.FetchResult r11 = (com.nytimes.android.coroutinesutils.FetchResult) r11
            com.nytimes.android.interests.InterestsManager$addInterestsToUser$2 r7 = new com.nytimes.android.interests.InterestsManager$addInterestsToUser$2
            r7.<init>(r9, r6)
            r0.L$0 = r10
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r11 = com.nytimes.android.coroutinesutils.FetchResultKt.e(r11, r7, r0)
            if (r11 != r1) goto L74
            return r1
        L74:
            r7 = r10
        L75:
            com.nytimes.android.coroutinesutils.FetchResult r11 = (com.nytimes.android.coroutinesutils.FetchResult) r11
            com.nytimes.android.interests.InterestsManager$addInterestsToUser$3 r8 = new com.nytimes.android.interests.InterestsManager$addInterestsToUser$3
            r8.<init>(r7, r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r11 = com.nytimes.android.coroutinesutils.FetchResultKt.d(r11, r8, r0)
            if (r11 != r1) goto L87
            return r1
        L87:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsManager.e(java.util.List, qs2, qs2, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[PHI: r8
      0x006e: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x006b, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$1 r0 = (com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$1 r0 = new com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.f.b(r8)
            goto L6e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.f.b(r8)
            goto L5e
        L3c:
            kotlin.f.b(r8)
            goto L4e
        L40:
            kotlin.f.b(r8)
            com.nytimes.android.interests.InterestsRepository r7 = r7.a
            r0.label = r6
            java.lang.Object r8 = r7.b(r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            com.nytimes.android.coroutinesutils.FetchResult r8 = (com.nytimes.android.coroutinesutils.FetchResult) r8
            com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$2 r7 = new com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$2
            r7.<init>(r3)
            r0.label = r5
            java.lang.Object r8 = com.nytimes.android.coroutinesutils.FetchResultKt.e(r8, r7, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            com.nytimes.android.coroutinesutils.FetchResult r8 = (com.nytimes.android.coroutinesutils.FetchResult) r8
            com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$3 r7 = new com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$3
            r7.<init>(r3)
            r0.label = r4
            java.lang.Object r8 = com.nytimes.android.coroutinesutils.FetchResultKt.d(r8, r7, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsManager.f(by0):java.lang.Object");
    }

    public final Object g(by0 by0Var) {
        Object g = this.b.g(by0Var);
        return g == a.h() ? g : ww8.a;
    }

    public final Object j(by0 by0Var) {
        return this.b.i(by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.nytimes.android.interests.db.a r8, defpackage.qs2 r9, defpackage.qs2 r10, defpackage.by0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.nytimes.android.interests.InterestsManager$removeInterest$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.android.interests.InterestsManager$removeInterest$1 r0 = (com.nytimes.android.interests.InterestsManager$removeInterest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsManager$removeInterest$1 r0 = new com.nytimes.android.interests.InterestsManager$removeInterest$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5b
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r11)
            goto L9e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.L$1
            qs2 r7 = (defpackage.qs2) r7
            java.lang.Object r8 = r0.L$0
            com.nytimes.android.interests.db.a r8 = (com.nytimes.android.interests.db.a) r8
            kotlin.f.b(r11)
            goto L8a
        L44:
            java.lang.Object r7 = r0.L$3
            r10 = r7
            qs2 r10 = (defpackage.qs2) r10
            java.lang.Object r7 = r0.L$2
            r9 = r7
            qs2 r9 = (defpackage.qs2) r9
            java.lang.Object r7 = r0.L$1
            r8 = r7
            com.nytimes.android.interests.db.a r8 = (com.nytimes.android.interests.db.a) r8
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.interests.InterestsManager r7 = (com.nytimes.android.interests.InterestsManager) r7
            kotlin.f.b(r11)
            goto L71
        L5b:
            kotlin.f.b(r11)
            com.nytimes.android.interests.InterestsRepository r11 = r7.a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r5
            java.lang.Object r11 = r11.g(r8, r0)
            if (r11 != r1) goto L71
            return r1
        L71:
            com.nytimes.android.coroutinesutils.FetchResult r11 = (com.nytimes.android.coroutinesutils.FetchResult) r11
            com.nytimes.android.interests.InterestsManager$removeInterest$2 r2 = new com.nytimes.android.interests.InterestsManager$removeInterest$2
            r2.<init>(r7, r8, r9, r6)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r4
            java.lang.Object r11 = com.nytimes.android.coroutinesutils.FetchResultKt.e(r11, r2, r0)
            if (r11 != r1) goto L89
            return r1
        L89:
            r7 = r10
        L8a:
            com.nytimes.android.coroutinesutils.FetchResult r11 = (com.nytimes.android.coroutinesutils.FetchResult) r11
            com.nytimes.android.interests.InterestsManager$removeInterest$3 r9 = new com.nytimes.android.interests.InterestsManager$removeInterest$3
            r9.<init>(r7, r8, r6)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = com.nytimes.android.coroutinesutils.FetchResultKt.d(r11, r9, r0)
            if (r7 != r1) goto L9e
            return r1
        L9e:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsManager.k(com.nytimes.android.interests.db.a, qs2, qs2, by0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.util.List r9, defpackage.qs2 r10, defpackage.qs2 r11, defpackage.by0 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.nytimes.android.interests.InterestsManager$reorderInterests$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.android.interests.InterestsManager$reorderInterests$1 r0 = (com.nytimes.android.interests.InterestsManager$reorderInterests$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsManager$reorderInterests$1 r0 = new com.nytimes.android.interests.InterestsManager$reorderInterests$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5c
            if (r2 == r5) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.f.b(r12)
            goto Lc6
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.L$0
            qs2 r8 = (defpackage.qs2) r8
            kotlin.f.b(r12)
            goto Lb4
        L42:
            java.lang.Object r8 = r0.L$3
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$2
            r11 = r9
            qs2 r11 = (defpackage.qs2) r11
            java.lang.Object r9 = r0.L$1
            r10 = r9
            qs2 r10 = (defpackage.qs2) r10
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.interests.InterestsManager r9 = (com.nytimes.android.interests.InterestsManager) r9
            kotlin.f.b(r12)
            r7 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            goto L9b
        L5c:
            kotlin.f.b(r12)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r12 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.i.w(r9, r2)
            r12.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r9.next()
            com.nytimes.android.interests.db.a r2 = (com.nytimes.android.interests.db.a) r2
            int r2 = r2.d()
            java.lang.Integer r2 = defpackage.cc0.c(r2)
            r12.add(r2)
            goto L70
        L88:
            com.nytimes.android.interests.InterestsRepository r9 = r8.a
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            r0.label = r5
            java.lang.Object r9 = r9.h(r12, r0)
            if (r9 != r1) goto L9b
            return r1
        L9b:
            com.nytimes.android.coroutinesutils.FetchResult r9 = (com.nytimes.android.coroutinesutils.FetchResult) r9
            com.nytimes.android.interests.InterestsManager$reorderInterests$2 r2 = new com.nytimes.android.interests.InterestsManager$reorderInterests$2
            r2.<init>(r8, r12, r10, r6)
            r0.L$0 = r11
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r4
            java.lang.Object r12 = com.nytimes.android.coroutinesutils.FetchResultKt.e(r9, r2, r0)
            if (r12 != r1) goto Lb3
            return r1
        Lb3:
            r8 = r11
        Lb4:
            com.nytimes.android.coroutinesutils.FetchResult r12 = (com.nytimes.android.coroutinesutils.FetchResult) r12
            com.nytimes.android.interests.InterestsManager$reorderInterests$3 r9 = new com.nytimes.android.interests.InterestsManager$reorderInterests$3
            r9.<init>(r8, r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = com.nytimes.android.coroutinesutils.FetchResultKt.d(r12, r9, r0)
            if (r8 != r1) goto Lc6
            return r1
        Lc6:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsManager.l(java.util.List, qs2, qs2, by0):java.lang.Object");
    }

    public final Flow m(Set set) {
        zq3.h(set, "currentInterestIds");
        return this.e.d(ParallelDownloadStrategy.FETCH_IF_STALE, new InterestsManager$retrieveInterestPreviews$1(set, null), null);
    }

    public final Flow n(ParallelDownloadStrategy parallelDownloadStrategy, bq3 bq3Var) {
        zq3.h(parallelDownloadStrategy, "strategy");
        return this.d.p(parallelDownloadStrategy, new InterestsManager$retrieveUserInterests$1(null), bq3Var);
    }

    public final Object o(int i, by0 by0Var) {
        return BuildersKt.withContext(this.c, new InterestsManager$updateSingleInterestFromServer$2(this, i, null), by0Var);
    }
}
