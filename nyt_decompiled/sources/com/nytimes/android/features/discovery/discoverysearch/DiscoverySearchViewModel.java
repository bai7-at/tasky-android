package com.nytimes.android.features.discovery.discoverysearch;

import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.lifecycle.q;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.features.discovery.discoverysearch.a;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ae7;
import defpackage.by0;
import defpackage.fc1;
import defpackage.pk6;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DiscoverySearchViewModel extends q {
    public static final a Companion = new a(null);
    public static final int k = 8;
    private final ae7 a;
    private final NetworkStatus b;
    private final SharedPreferences c;
    private final MutableStateFlow d;
    private final MutableStateFlow e;
    private final StateFlow f;
    private final String g;
    private final MutableStateFlow h;
    private final Flow i;
    private final MutableStateFlow j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DiscoverySearchViewModel(ae7 ae7Var, NetworkStatus networkStatus, SharedPreferences sharedPreferences, RecentlyViewedManager recentlyViewedManager, Resources resources) {
        zq3.h(ae7Var, "factory");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(sharedPreferences, "prefs");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        zq3.h(resources, "resources");
        this.a = ae7Var;
        this.b = networkStatus;
        this.c = sharedPreferences;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.d = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.e = MutableStateFlow2;
        this.f = recentlyViewedManager.r();
        String string = resources.getString(pk6.search_term_relevance);
        zq3.g(string, "getString(...)");
        this.g = string;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(Long.valueOf(System.currentTimeMillis()));
        this.h = MutableStateFlow3;
        final Flow combine = FlowKt.combine(MutableStateFlow, MutableStateFlow3, MutableStateFlow2, new DiscoverySearchViewModel$searchModels$1(null));
        this.i = FlowKt.m911catch(FlowKt.transformLatest(FlowKt.debounce(new Flow() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1

            /* renamed from: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1$2", f = "DiscoverySearchViewModel.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1$2$1 r0 = (com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1$2$1 r0 = new com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L5b
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        kotlin.Pair r6 = (kotlin.Pair) r6
                        java.lang.Object r2 = r6.c()
                        java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                        int r2 = r2.length()
                        if (r2 <= 0) goto L5b
                        java.lang.Object r6 = r6.c()
                        java.lang.String r6 = (java.lang.String) r6
                        int r6 = r6.length()
                        r2 = 2
                        if (r6 <= r2) goto L5b
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L5b
                        return r1
                    L5b:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, 150L), new DiscoverySearchViewModel$special$$inlined$flatMapLatest$1(null, this)), new DiscoverySearchViewModel$searchModels$4(this, null));
        this.j = StateFlowKt.MutableStateFlow(a.d.b);
        g();
    }

    private final void g() {
        if (!this.b.g()) {
            this.j.setValue(a.c.b);
            FlowKt.asFlow(new PagingData[0]);
        } else if (((CharSequence) this.d.getValue()).length() == 0) {
            this.j.setValue(a.d.b);
        }
    }

    public final StateFlow i() {
        return this.f;
    }

    public final Flow j() {
        return this.i;
    }

    public final MutableStateFlow k() {
        return this.d;
    }

    public final MutableStateFlow l() {
        return this.j;
    }

    public final void m(String str) {
        zq3.h(str, "query");
        g();
        if (((CharSequence) this.d.getValue()).length() == 0 && str.length() > 0) {
            this.j.setValue(a.b.b);
        }
        this.d.setValue(str);
    }

    public final void n(String str) {
        String lowerCase;
        zq3.h(str, "sortValue");
        this.e.setValue(str);
        if (zq3.c(str, this.g)) {
            lowerCase = "best";
        } else {
            lowerCase = str.toLowerCase(Locale.ROOT);
            zq3.g(lowerCase, "toLowerCase(...)");
        }
        SharedPreferences.Editor edit = this.c.edit();
        edit.putString("DiscoverySearchOrderPref", lowerCase);
        edit.apply();
    }
}
