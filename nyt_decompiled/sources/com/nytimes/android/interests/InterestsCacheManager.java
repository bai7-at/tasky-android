package com.nytimes.android.interests;

import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.utils.AppPreferences;
import defpackage.b05;
import defpackage.by0;
import defpackage.gp3;
import defpackage.j91;
import defpackage.st;
import defpackage.ww8;
import defpackage.z58;
import defpackage.zq3;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class InterestsCacheManager {
    private final j91 a;
    private final CoroutineDispatcher b;
    private final gp3 c;
    private final InterestsPreferencesStore d;
    private final AssetRetriever e;
    private final z58 f;
    private final b05 g;
    private final AppPreferences h;

    public InterestsCacheManager(j91 j91Var, CoroutineDispatcher coroutineDispatcher, gp3 gp3Var, InterestsPreferencesStore interestsPreferencesStore, AssetRetriever assetRetriever, z58 z58Var, b05 b05Var, AppPreferences appPreferences) {
        zq3.h(j91Var, "userInterestExpirationChecker");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(gp3Var, "interestDao");
        zq3.h(interestsPreferencesStore, "interestsPreferences");
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(z58Var, "subauthClient");
        zq3.h(b05Var, "nytClock");
        zq3.h(appPreferences, "appPreferences");
        this.a = j91Var;
        this.b = coroutineDispatcher;
        this.c = gp3Var;
        this.d = interestsPreferencesStore;
        this.e = assetRetriever;
        this.f = z58Var;
        this.g = b05Var;
        this.h = appPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final st h(long j) {
        return new st("YOUR_INTERESTS", null, Long.valueOf(j), null, this.f.L(), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.st r10, java.util.List r11, defpackage.by0 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.nytimes.android.interests.InterestsCacheManager$prefetchAssets$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.android.interests.InterestsCacheManager$prefetchAssets$1 r0 = (com.nytimes.android.interests.InterestsCacheManager$prefetchAssets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsCacheManager$prefetchAssets$1 r0 = new com.nytimes.android.interests.InterestsCacheManager$prefetchAssets$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r12)
            goto Lcd
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$1
            r10 = r9
            st r10 = (defpackage.st) r10
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.interests.InterestsCacheManager r9 = (com.nytimes.android.interests.InterestsCacheManager) r9
            kotlin.f.b(r12)
            goto Laf
        L42:
            kotlin.f.b(r12)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r11.next()
            boolean r5 = r2 instanceof com.nytimes.android.interests.db.InterestArticleAsset
            if (r5 == 0) goto L50
            r12.add(r2)
            goto L50
        L62:
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto Laf
            com.nytimes.android.assetretriever.AssetRetriever r11 = r9.e
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.i.w(r12, r5)
            r2.<init>(r5)
            java.util.Iterator r12 = r12.iterator()
        L79:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L9f
            java.lang.Object r5 = r12.next()
            com.nytimes.android.interests.db.InterestArticleAsset r5 = (com.nytimes.android.interests.db.InterestArticleAsset) r5
            et r6 = new et
            com.nytimes.android.assetretriever.e$b r7 = new com.nytimes.android.assetretriever.e$b
            java.lang.String r8 = r5.j()
            r7.<init>(r8)
            org.threeten.bp.OffsetDateTime r5 = r5.n()
            org.threeten.bp.Instant r5 = r5.toInstant()
            r6.<init>(r7, r5)
            r2.add(r6)
            goto L79
        L9f:
            r12 = 0
            st[] r12 = new defpackage.st[r12]
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r11.n(r2, r10, r12, r0)
            if (r11 != r1) goto Laf
            return r1
        Laf:
            java.lang.Long r11 = r10.c()
            if (r11 == 0) goto Lcd
            long r11 = r11.longValue()
            com.nytimes.android.assetretriever.AssetRetriever r9 = r9.e
            java.lang.String r10 = r10.d()
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r9 = r9.j(r10, r11, r0)
            if (r9 != r1) goto Lcd
            return r1
        Lcd:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsCacheManager.m(st, java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.interests.InterestsCacheManager$clearInterests$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.interests.InterestsCacheManager$clearInterests$1 r0 = (com.nytimes.android.interests.InterestsCacheManager$clearInterests$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsCacheManager$clearInterests$1 r0 = new com.nytimes.android.interests.InterestsCacheManager$clearInterests$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.interests.InterestsCacheManager r6 = (com.nytimes.android.interests.InterestsCacheManager) r6
            kotlin.f.b(r7)
            goto L7f
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.interests.InterestsCacheManager r6 = (com.nytimes.android.interests.InterestsCacheManager) r6
            kotlin.f.b(r7)
            goto L6c
        L43:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.interests.InterestsCacheManager r6 = (com.nytimes.android.interests.InterestsCacheManager) r6
            kotlin.f.b(r7)
            goto L5b
        L4b:
            kotlin.f.b(r7)
            gp3 r7 = r6.c
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            com.nytimes.android.interests.InterestsPreferencesStore r7 = r6.d
            java.util.List r2 = kotlin.collections.i.l()
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.g(r2, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            com.nytimes.android.interests.InterestsPreferencesStore r7 = r6.d
            com.nytimes.android.interests.InterestsPreferencesStore$a r2 = com.nytimes.android.interests.InterestsPreferencesStore.Companion
            long r4 = r2.a()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.h(r4, r0)
            if (r7 != r1) goto L7f
            return r1
        L7f:
            com.nytimes.android.utils.AppPreferences r7 = r6.h
            com.nytimes.android.interests.InterestsPreferencesStore$a r0 = com.nytimes.android.interests.InterestsPreferencesStore.Companion
            long r0 = r0.a()
            java.lang.String r2 = "lastSeenUserInterests"
            r7.c(r2, r0)
            j91 r6 = r6.a
            r6.a()
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsCacheManager.g(by0):java.lang.Object");
    }

    public final Object i(by0 by0Var) {
        return this.d.f(by0Var);
    }

    public final boolean j() {
        return this.a.e();
    }

    public final Object k(by0 by0Var) {
        return BuildersKt.withContext(this.b, new InterestsCacheManager$loadAll$2(this, null), by0Var);
    }

    public final Object l(int i, by0 by0Var) {
        return BuildersKt.withContext(this.b, new InterestsCacheManager$loadInterestId$2(this, i, null), by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.nytimes.android.interests.db.a r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.interests.InterestsCacheManager$removeInterest$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.interests.InterestsCacheManager$removeInterest$1 r0 = (com.nytimes.android.interests.InterestsCacheManager$removeInterest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsCacheManager$removeInterest$1 r0 = new com.nytimes.android.interests.InterestsCacheManager$removeInterest$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L51
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r9)
            goto Lb4
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.L$1
            com.nytimes.android.interests.db.a r7 = (com.nytimes.android.interests.db.a) r7
            java.lang.Object r8 = r0.L$0
            com.nytimes.android.interests.InterestsCacheManager r8 = (com.nytimes.android.interests.InterestsCacheManager) r8
            kotlin.f.b(r9)
            goto L7d
        L44:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            com.nytimes.android.interests.db.a r8 = (com.nytimes.android.interests.db.a) r8
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.interests.InterestsCacheManager r7 = (com.nytimes.android.interests.InterestsCacheManager) r7
            kotlin.f.b(r9)
            goto L67
        L51:
            kotlin.f.b(r9)
            gp3 r9 = r7.c
            int r2 = r8.d()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 != r1) goto L67
            return r1
        L67:
            com.nytimes.android.interests.InterestsPreferencesStore r9 = r7.d
            kotlinx.coroutines.flow.Flow r9 = r9.d()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r0)
            if (r9 != r1) goto L7a
            return r1
        L7a:
            r6 = r8
            r8 = r7
            r7 = r6
        L7d:
            gq3 r9 = (defpackage.gq3) r9
            com.nytimes.android.interests.InterestsOrder r9 = r9.a()
            java.util.List r9 = r9.b()
            r2 = 0
            if (r9 == 0) goto L91
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r9 = kotlin.collections.i.a1(r9)
            goto L92
        L91:
            r9 = r2
        L92:
            if (r9 == 0) goto La3
            int r7 = r7.d()
            java.lang.Integer r7 = defpackage.cc0.c(r7)
            boolean r7 = r9.remove(r7)
            defpackage.cc0.a(r7)
        La3:
            if (r9 == 0) goto Lb4
            com.nytimes.android.interests.InterestsPreferencesStore r7 = r8.d
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.g(r9, r0)
            if (r7 != r1) goto Lb4
            return r1
        Lb4:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsCacheManager.n(com.nytimes.android.interests.db.a, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.fp3 r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.interests.InterestsCacheManager$saveResponse$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.interests.InterestsCacheManager$saveResponse$1 r0 = (com.nytimes.android.interests.InterestsCacheManager$saveResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsCacheManager$saveResponse$1 r0 = new com.nytimes.android.interests.InterestsCacheManager$saveResponse$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.interests.InterestsCacheManager r5 = (com.nytimes.android.interests.InterestsCacheManager) r5
            kotlin.f.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = r5.b
            com.nytimes.android.interests.InterestsCacheManager$saveResponse$2 r2 = new com.nytimes.android.interests.InterestsCacheManager$saveResponse$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            j91 r5 = r5.a
            org.threeten.bp.Instant r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsCacheManager.o(fp3, by0):java.lang.Object");
    }

    public final Object p(List list, by0 by0Var) {
        Object g = this.d.g(list, by0Var);
        return g == a.h() ? g : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.fp3 r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.interests.InterestsCacheManager$updateSingleInterest$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.interests.InterestsCacheManager$updateSingleInterest$1 r0 = (com.nytimes.android.interests.InterestsCacheManager$updateSingleInterest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsCacheManager$updateSingleInterest$1 r0 = new com.nytimes.android.interests.InterestsCacheManager$updateSingleInterest$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.interests.InterestsCacheManager r5 = (com.nytimes.android.interests.InterestsCacheManager) r5
            kotlin.f.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = r5.b
            com.nytimes.android.interests.InterestsCacheManager$updateSingleInterest$2 r2 = new com.nytimes.android.interests.InterestsCacheManager$updateSingleInterest$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            b05 r5 = r5.g
            long r5 = r5.c()
            org.threeten.bp.Instant r5 = org.threeten.bp.Instant.ofEpochMilli(r5)
            java.lang.String r6 = "ofEpochMilli(...)"
            defpackage.zq3.g(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsCacheManager.q(fp3, by0):java.lang.Object");
    }
}
