package com.nytimes.android.interests;

import com.apollographql.apollo.ApolloClient;
import defpackage.fq3;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class InterestsRepository {
    private final ApolloClient a;
    private final fq3 b;

    public InterestsRepository(ApolloClient apolloClient, fq3 fq3Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(fq3Var, "interestsParser");
        this.a = apolloClient;
        this.b = fq3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.interests.InterestsRepository$addInterestsToUser$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.interests.InterestsRepository$addInterestsToUser$1 r0 = (com.nytimes.android.interests.InterestsRepository$addInterestsToUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$addInterestsToUser$1 r0 = new com.nytimes.android.interests.InterestsRepository$addInterestsToUser$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L51
        L29:
            r4 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            com.nytimes.android.coroutinesutils.FetchResult$a r6 = com.nytimes.android.coroutinesutils.FetchResult.Companion
            com.apollographql.apollo.ApolloClient r4 = r4.a     // Catch: java.lang.Exception -> L29
            z8 r6 = new z8     // Catch: java.lang.Exception -> L29
            type.UserInterestsInput r2 = new type.UserInterestsInput     // Catch: java.lang.Exception -> L29
            r2.<init>(r5)     // Catch: java.lang.Exception -> L29
            r6.<init>(r2)     // Catch: java.lang.Exception -> L29
            com.apollographql.apollo.ApolloCall r4 = r4.G(r6)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L51
            return r1
        L51:
            yj r6 = (defpackage.yj) r6     // Catch: java.lang.Exception -> L29
            com.nytimes.android.coroutinesutils.FetchResult$b$b r4 = new com.nytimes.android.coroutinesutils.FetchResult$b$b     // Catch: java.lang.Exception -> L29
            r4.<init>(r6)     // Catch: java.lang.Exception -> L29
            goto L5f
        L59:
            com.nytimes.android.coroutinesutils.FetchResult$b$a r5 = new com.nytimes.android.coroutinesutils.FetchResult$b$a
            r5.<init>(r4)
            r4 = r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.a(java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.interests.InterestsRepository$clearNewsQuizStats$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.interests.InterestsRepository$clearNewsQuizStats$1 r0 = (com.nytimes.android.interests.InterestsRepository$clearNewsQuizStats$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$clearNewsQuizStats$1 r0 = new com.nytimes.android.interests.InterestsRepository$clearNewsQuizStats$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L4c
        L29:
            r4 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r5)
            com.nytimes.android.coroutinesutils.FetchResult$a r5 = com.nytimes.android.coroutinesutils.FetchResult.Companion
            com.apollographql.apollo.ApolloClient r4 = r4.a     // Catch: java.lang.Exception -> L29
            gl0 r5 = new gl0     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            com.apollographql.apollo.ApolloCall r4 = r4.G(r5)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = com.nytimes.android.apolloschema.ExtensionsKt.a(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L4c
            return r1
        L4c:
            yj r5 = (defpackage.yj) r5     // Catch: java.lang.Exception -> L29
            com.nytimes.android.coroutinesutils.FetchResult$b$b r4 = new com.nytimes.android.coroutinesutils.FetchResult$b$b     // Catch: java.lang.Exception -> L29
            r4.<init>(r5)     // Catch: java.lang.Exception -> L29
            goto L5a
        L54:
            com.nytimes.android.coroutinesutils.FetchResult$b$a r5 = new com.nytimes.android.coroutinesutils.FetchResult$b$a
            r5.<init>(r4)
            r4 = r5
        L5a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.b(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.interests.InterestsRepository$fetchAllUserInterests$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.interests.InterestsRepository$fetchAllUserInterests$1 r0 = (com.nytimes.android.interests.InterestsRepository$fetchAllUserInterests$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$fetchAllUserInterests$1 r0 = new com.nytimes.android.interests.InterestsRepository$fetchAllUserInterests$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.interests.InterestsRepository r5 = (com.nytimes.android.interests.InterestsRepository) r5
            kotlin.f.b(r6)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r5.a
            bz2 r2 = new bz2
            nk5$a r4 = nk5.a.b
            r2.<init>(r4, r4, r4)
            com.apollographql.apollo.ApolloCall r6 = r6.L(r2)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            yj r6 = (defpackage.yj) r6
            kotlin.Pair r0 = new kotlin.Pair
            fq3 r5 = r5.b
            ii5$a r1 = r6.c
            bz2$c r1 = (bz2.c) r1
            fp3 r5 = r5.j(r1)
            java.util.List r6 = r6.d
            if (r6 != 0) goto L66
            java.util.List r6 = kotlin.collections.i.l()
        L66:
            r0.<init>(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.c(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.interests.InterestsRepository$fetchInterestPreviews$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.interests.InterestsRepository$fetchInterestPreviews$1 r0 = (com.nytimes.android.interests.InterestsRepository$fetchInterestPreviews$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$fetchInterestPreviews$1 r0 = new com.nytimes.android.interests.InterestsRepository$fetchInterestPreviews$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.interests.InterestsRepository r4 = (com.nytimes.android.interests.InterestsRepository) r4
            kotlin.f.b(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            com.apollographql.apollo.ApolloClient r5 = r4.a
            by2 r2 = new by2
            r2.<init>()
            com.apollographql.apollo.ApolloCall r5 = r5.L(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            yj r5 = (defpackage.yj) r5
            ii5$a r5 = r5.c
            by2$b r5 = (by2.b) r5
            if (r5 == 0) goto L5e
            fq3 r4 = r4.b
            java.util.List r4 = r4.e(r5)
            if (r4 != 0) goto L62
        L5e:
            java.util.List r4 = kotlin.collections.i.l()
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.d(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.interests.InterestsRepository$fetchOnboardingResponse$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.interests.InterestsRepository$fetchOnboardingResponse$1 r0 = (com.nytimes.android.interests.InterestsRepository$fetchOnboardingResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$fetchOnboardingResponse$1 r0 = new com.nytimes.android.interests.InterestsRepository$fetchOnboardingResponse$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.interests.InterestsRepository r4 = (com.nytimes.android.interests.InterestsRepository) r4
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L50
        L2d:
            r4 = move-exception
            goto L5d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            com.apollographql.apollo.ApolloClient r5 = r4.a     // Catch: java.lang.Exception -> L2d
            fy2 r2 = new fy2     // Catch: java.lang.Exception -> L2d
            r2.<init>()     // Catch: java.lang.Exception -> L2d
            com.apollographql.apollo.ApolloCall r5 = r5.L(r2)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)     // Catch: java.lang.Exception -> L2d
            if (r5 != r1) goto L50
            return r1
        L50:
            yj r5 = (defpackage.yj) r5     // Catch: java.lang.Exception -> L2d
            fq3 r4 = r4.b     // Catch: java.lang.Exception -> L2d
            ii5$a r5 = r5.c     // Catch: java.lang.Exception -> L2d
            fy2$b r5 = (fy2.b) r5     // Catch: java.lang.Exception -> L2d
            sp3 r4 = r4.h(r5)     // Catch: java.lang.Exception -> L2d
            goto L66
        L5d:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = "Unable to fetch Onboarding Response"
            com.nytimes.android.logging.NYTLogger.i(r4, r0, r5)
            r4 = 0
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.e(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r7, defpackage.by0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.nytimes.android.interests.InterestsRepository$fetchSingleUserInterest$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.interests.InterestsRepository$fetchSingleUserInterest$1 r0 = (com.nytimes.android.interests.InterestsRepository$fetchSingleUserInterest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$fetchSingleUserInterest$1 r0 = new com.nytimes.android.interests.InterestsRepository$fetchSingleUserInterest$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.interests.InterestsRepository r6 = (com.nytimes.android.interests.InterestsRepository) r6
            kotlin.f.b(r8)
            goto L5e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.f.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r6.a
            bz2 r2 = new bz2
            nk5$a r4 = nk5.a.b
            nk5$b r5 = defpackage.nk5.a
            java.lang.Integer r7 = defpackage.cc0.c(r7)
            java.util.List r7 = kotlin.collections.i.e(r7)
            nk5 r7 = r5.b(r7)
            r2.<init>(r4, r4, r7)
            com.apollographql.apollo.ApolloCall r7 = r8.L(r2)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = com.nytimes.android.apolloschema.ExtensionsKt.a(r7, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            yj r8 = (defpackage.yj) r8
            kotlin.Pair r7 = new kotlin.Pair
            fq3 r6 = r6.b
            ii5$a r0 = r8.c
            bz2$c r0 = (bz2.c) r0
            fp3 r6 = r6.j(r0)
            java.util.List r8 = r8.d
            if (r8 != 0) goto L74
            java.util.List r8 = kotlin.collections.i.l()
        L74:
            r7.<init>(r6, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.f(int, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.nytimes.android.interests.db.a r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.interests.InterestsRepository$removeInterest$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.interests.InterestsRepository$removeInterest$1 r0 = (com.nytimes.android.interests.InterestsRepository$removeInterest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$removeInterest$1 r0 = new com.nytimes.android.interests.InterestsRepository$removeInterest$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L61
        L29:
            r4 = move-exception
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            com.nytimes.android.coroutinesutils.FetchResult$a r6 = com.nytimes.android.coroutinesutils.FetchResult.Companion
            com.apollographql.apollo.ApolloClient r4 = r4.a     // Catch: java.lang.Exception -> L29
            uw6 r6 = new uw6     // Catch: java.lang.Exception -> L29
            type.UserInterestsInput r2 = new type.UserInterestsInput     // Catch: java.lang.Exception -> L29
            int r5 = r5.d()     // Catch: java.lang.Exception -> L29
            java.lang.Integer r5 = defpackage.cc0.c(r5)     // Catch: java.lang.Exception -> L29
            java.lang.Integer[] r5 = new java.lang.Integer[]{r5}     // Catch: java.lang.Exception -> L29
            java.util.List r5 = kotlin.collections.i.r(r5)     // Catch: java.lang.Exception -> L29
            r2.<init>(r5)     // Catch: java.lang.Exception -> L29
            r6.<init>(r2)     // Catch: java.lang.Exception -> L29
            com.apollographql.apollo.ApolloCall r4 = r4.G(r6)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L61
            return r1
        L61:
            yj r6 = (defpackage.yj) r6     // Catch: java.lang.Exception -> L29
            com.nytimes.android.coroutinesutils.FetchResult$b$b r4 = new com.nytimes.android.coroutinesutils.FetchResult$b$b     // Catch: java.lang.Exception -> L29
            r4.<init>(r6)     // Catch: java.lang.Exception -> L29
            goto L6f
        L69:
            com.nytimes.android.coroutinesutils.FetchResult$b$a r5 = new com.nytimes.android.coroutinesutils.FetchResult$b$a
            r5.<init>(r4)
            r4 = r5
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.g(com.nytimes.android.interests.db.a, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.interests.InterestsRepository$reorderInterests$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.interests.InterestsRepository$reorderInterests$1 r0 = (com.nytimes.android.interests.InterestsRepository$reorderInterests$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$reorderInterests$1 r0 = new com.nytimes.android.interests.InterestsRepository$reorderInterests$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L51
        L29:
            r4 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            com.nytimes.android.coroutinesutils.FetchResult$a r6 = com.nytimes.android.coroutinesutils.FetchResult.Companion
            com.apollographql.apollo.ApolloClient r4 = r4.a     // Catch: java.lang.Exception -> L29
            gx6 r6 = new gx6     // Catch: java.lang.Exception -> L29
            type.UserInterestsInput r2 = new type.UserInterestsInput     // Catch: java.lang.Exception -> L29
            r2.<init>(r5)     // Catch: java.lang.Exception -> L29
            r6.<init>(r2)     // Catch: java.lang.Exception -> L29
            com.apollographql.apollo.ApolloCall r4 = r4.G(r6)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L51
            return r1
        L51:
            yj r6 = (defpackage.yj) r6     // Catch: java.lang.Exception -> L29
            com.nytimes.android.coroutinesutils.FetchResult$b$b r4 = new com.nytimes.android.coroutinesutils.FetchResult$b$b     // Catch: java.lang.Exception -> L29
            r4.<init>(r6)     // Catch: java.lang.Exception -> L29
            goto L5f
        L59:
            com.nytimes.android.coroutinesutils.FetchResult$b$a r5 = new com.nytimes.android.coroutinesutils.FetchResult$b$a
            r5.<init>(r4)
            r4 = r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.h(java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.interests.InterestsRepository$setOnboardingUserInterests$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.interests.InterestsRepository$setOnboardingUserInterests$1 r0 = (com.nytimes.android.interests.InterestsRepository$setOnboardingUserInterests$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsRepository$setOnboardingUserInterests$1 r0 = new com.nytimes.android.interests.InterestsRepository$setOnboardingUserInterests$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L51
        L29:
            r4 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            com.nytimes.android.coroutinesutils.FetchResult$a r6 = com.nytimes.android.coroutinesutils.FetchResult.Companion
            com.apollographql.apollo.ApolloClient r4 = r4.a     // Catch: java.lang.Exception -> L29
            am7 r6 = new am7     // Catch: java.lang.Exception -> L29
            type.SetUserInterestsInput r2 = new type.SetUserInterestsInput     // Catch: java.lang.Exception -> L29
            r2.<init>(r5)     // Catch: java.lang.Exception -> L29
            r6.<init>(r2)     // Catch: java.lang.Exception -> L29
            com.apollographql.apollo.ApolloCall r4 = r4.G(r6)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L51
            return r1
        L51:
            yj r6 = (defpackage.yj) r6     // Catch: java.lang.Exception -> L29
            com.nytimes.android.coroutinesutils.FetchResult$b$b r4 = new com.nytimes.android.coroutinesutils.FetchResult$b$b     // Catch: java.lang.Exception -> L29
            r4.<init>(r6)     // Catch: java.lang.Exception -> L29
            goto L5f
        L59:
            com.nytimes.android.coroutinesutils.FetchResult$b$a r5 = new com.nytimes.android.coroutinesutils.FetchResult$b$a
            r5.<init>(r4)
            r4 = r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsRepository.i(java.util.List, by0):java.lang.Object");
    }
}
