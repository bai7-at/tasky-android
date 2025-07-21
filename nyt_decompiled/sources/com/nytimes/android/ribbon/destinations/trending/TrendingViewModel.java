package com.nytimes.android.ribbon.destinations.trending;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.api.cms.SectionQueryType;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import defpackage.by0;
import defpackage.ss8;
import defpackage.tr3;
import defpackage.y25;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class TrendingViewModel extends q {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private static final ss8 f = new ss8(i.l(), i.l(), i.l());
    private final DestinationAssetRepository a;
    private final tr3 b;
    private final MutableStateFlow c;
    private final StateFlow d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public TrendingViewModel(DestinationAssetRepository destinationAssetRepository, tr3 tr3Var) {
        zq3.h(destinationAssetRepository, "store");
        zq3.h(tr3Var, "itemToDetailNavigator");
        this.a = destinationAssetRepository;
        this.b = tr3Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(f);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final Object g(by0 by0Var) {
        return DestinationAssetRepository.e(this.a, "eos-hybrid-most-gifted", "nyt://per/personalized-list/eos-hybrid-most-gifted", null, null, by0Var, 12, null);
    }

    private final Object i(by0 by0Var) {
        return DestinationAssetRepository.e(this.a, "TRENDING", null, SectionQueryType.MOST_POPULAR_LIST, "TRENDING", by0Var, 2, null);
    }

    private final Object j(by0 by0Var) {
        return DestinationAssetRepository.e(this.a, "VIDEOS", null, SectionQueryType.MOST_POPULAR_LIST, "VIDEOS", by0Var, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.by0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.nytimes.android.ribbon.destinations.trending.TrendingViewModel$queryAssets$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.ribbon.destinations.trending.TrendingViewModel$queryAssets$1 r0 = (com.nytimes.android.ribbon.destinations.trending.TrendingViewModel$queryAssets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.trending.TrendingViewModel$queryAssets$1 r0 = new com.nytimes.android.ribbon.destinations.trending.TrendingViewModel$queryAssets$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L54
            if (r2 == r6) goto L4c
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.f.b(r9)
            goto L92
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.L$0
            com.nytimes.android.ribbon.destinations.trending.TrendingViewModel r2 = (com.nytimes.android.ribbon.destinations.trending.TrendingViewModel) r2
            kotlin.f.b(r9)
            goto L7b
        L4c:
            java.lang.Object r8 = r0.L$0
            com.nytimes.android.ribbon.destinations.trending.TrendingViewModel r8 = (com.nytimes.android.ribbon.destinations.trending.TrendingViewModel) r8
            kotlin.f.b(r9)
            goto L62
        L54:
            kotlin.f.b(r9)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r8.i(r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r2 = 10
            java.util.List r9 = kotlin.collections.i.P0(r9, r2)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r2 = r8.g(r0)
            if (r2 != r1) goto L77
            return r1
        L77:
            r7 = r2
            r2 = r8
            r8 = r9
            r9 = r7
        L7b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = kotlin.collections.i.P0(r9, r3)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r0 = r2.j(r0)
            if (r0 != r1) goto L8e
            return r1
        L8e:
            r7 = r0
            r0 = r8
            r8 = r9
            r9 = r7
        L92:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = kotlin.collections.i.P0(r9, r3)
            ss8 r1 = new ss8
            r1.<init>(r0, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.trending.TrendingViewModel.m(by0):java.lang.Object");
    }

    public final StateFlow k() {
        return this.d;
    }

    public final void l(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        this.b.a(componentActivity, y25Var);
    }

    public final Job n() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new TrendingViewModel$refreshTrendingAssets$1(this, null), 3, null);
        return launch$default;
    }
}
