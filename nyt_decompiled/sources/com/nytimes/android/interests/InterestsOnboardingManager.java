package com.nytimes.android.interests;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.utils.AppPreferences;
import defpackage.bh5;
import defpackage.by0;
import defpackage.sp3;
import defpackage.tp3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class InterestsOnboardingManager {
    private final InterestsRepository a;
    private final AppPreferences b;
    private final MutableStateFlow c;
    private final StateFlow d;
    private final MutableStateFlow e;
    private final StateFlow f;
    private boolean g;

    public InterestsOnboardingManager(InterestsRepository interestsRepository, AppPreferences appPreferences) {
        zq3.h(interestsRepository, "repository");
        zq3.h(appPreferences, "appPreferences");
        this.a = interestsRepository;
        this.b = appPreferences;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new tp3(i.l(), i.l(), i.l()));
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(OnboardingToolTipState.NONE);
        this.e = MutableStateFlow2;
        this.f = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final Object a(by0 by0Var) {
        return this.a.e(by0Var);
    }

    public final StateFlow b() {
        return this.d;
    }

    public final StateFlow c() {
        return this.f;
    }

    public final void d() {
        this.g = true;
        this.b.f("interestsOnboarding", false);
    }

    public final void e() {
        this.b.f("interestsOnboarding", false);
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
    public final java.lang.Object f(java.util.List r8, defpackage.qs2 r9, defpackage.qs2 r10, defpackage.by0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$1 r0 = (com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$1 r0 = new com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$1
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
            java.lang.Object r11 = r7.i(r8, r0)
            if (r11 != r1) goto L60
            return r1
        L60:
            com.nytimes.android.coroutinesutils.FetchResult r11 = (com.nytimes.android.coroutinesutils.FetchResult) r11
            com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$2 r7 = new com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$2
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
            com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$3 r8 = new com.nytimes.android.interests.InterestsOnboardingManager$setOnboardingUserInterests$3
            r8.<init>(r7, r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r11 = com.nytimes.android.coroutinesutils.FetchResultKt.d(r11, r8, r0)
            if (r11 != r1) goto L87
            return r1
        L87:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsOnboardingManager.f(java.util.List, qs2, qs2, by0):java.lang.Object");
    }

    public final void g(OnboardingToolTipState onboardingToolTipState) {
        zq3.h(onboardingToolTipState, TransferTable.COLUMN_STATE);
        this.e.setValue(onboardingToolTipState);
        if (this.e.getValue() == OnboardingToolTipState.COMPLETE) {
            this.b.f("interestsOnboardingTooltips", false);
        }
    }

    public final boolean h() {
        return this.b.n("interestsOnboarding", true);
    }

    public final boolean i() {
        return this.b.n("interestsOnboardingTooltips", true);
    }

    public final void j(sp3 sp3Var, List list) {
        zq3.h(sp3Var, "allInterests");
        zq3.h(list, "selectedTopicIds");
        List b = sp3Var.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (list.contains(Integer.valueOf(((bh5) obj).b()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i.B(arrayList2, ((bh5) it2.next()).c());
        }
        this.c.setValue(new tp3(arrayList2, sp3Var.c(), sp3Var.a()));
    }

    public final boolean k() {
        return this.g;
    }
}
