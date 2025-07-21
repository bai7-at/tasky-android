package com.nytimes.android.growthui.landingpage.data;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData;
import com.squareup.moshi.i;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gy3;
import defpackage.p53;
import defpackage.r53;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class AllAccessLandingPageConfigRepository implements gy3 {
    private final DataConfigId a;
    private final String b;
    private final r53 c;
    private final p53 d;
    private final i e;

    public AllAccessLandingPageConfigRepository(DataConfigId dataConfigId, String str, r53 r53Var, p53 p53Var, i iVar) {
        zq3.h(dataConfigId, "dataConfigId");
        zq3.h(str, "fallbackJson");
        zq3.h(r53Var, "subscriptionAdapter");
        zq3.h(p53Var, "remoteConfigAdapter");
        zq3.h(iVar, "moshi");
        this.a = dataConfigId;
        this.b = str;
        this.c = r53Var;
        this.d = p53Var;
        this.e = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllAccessLandingPageData e() {
        try {
            AllAccessLandingPageData allAccessLandingPageData = (AllAccessLandingPageData) this.e.c(AllAccessLandingPageData.class).fromJson(this.b);
            return allAccessLandingPageData == null ? new AllAccessLandingPageData(null, null, null, null, 15, null) : allAccessLandingPageData;
        } catch (Exception e) {
            ul8.b bVar = ul8.a;
            bVar.z("GROWTHUI").d("Fallback Failed", new Object[0]);
            bVar.z("GROWTHUI").e(e);
            return new AllAccessLandingPageData(null, null, null, null, 15, null);
        }
    }

    @Override // defpackage.gy3
    public Flow a(String str) {
        final Flow flowOf = FlowKt.flowOf(this.d.a(this.a));
        return new Flow() { // from class: com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1

            /* renamed from: com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ AllAccessLandingPageConfigRepository b;

                @fc1(c = "com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1$2", f = "AllAccessLandingPageConfigRepository.kt", l = {230, 223}, m = "emit")
                /* renamed from: com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AllAccessLandingPageConfigRepository allAccessLandingPageConfigRepository) {
                    this.a = flowCollector;
                    this.b = allAccessLandingPageConfigRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[LOOP:0: B:18:0x00ae->B:20:0x00b4, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00d4 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, defpackage.by0 r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1$2$1 r0 = (com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1$2$1 r0 = new com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.f.b(r9)
                        goto Ld5
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData r7 = (com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData) r7
                        java.lang.Object r8 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                        kotlin.f.b(r9)
                        goto L93
                    L41:
                        kotlin.f.b(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.a
                        java.lang.String r8 = (java.lang.String) r8
                        com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository r2 = r7.b     // Catch: java.lang.Exception -> L63
                        com.squareup.moshi.i r2 = com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository.b(r2)     // Catch: java.lang.Exception -> L63
                        java.lang.Class<com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData> r5 = com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData.class
                        com.squareup.moshi.JsonAdapter r2 = r2.c(r5)     // Catch: java.lang.Exception -> L63
                        java.lang.Object r8 = r2.fromJson(r8)     // Catch: java.lang.Exception -> L63
                        com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData r8 = (com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData) r8     // Catch: java.lang.Exception -> L63
                        if (r8 != 0) goto L75
                        com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository r8 = r7.b     // Catch: java.lang.Exception -> L63
                        com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData r8 = com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository.d(r8)     // Catch: java.lang.Exception -> L63
                        goto L75
                    L63:
                        r8 = move-exception
                        ul8$b r2 = defpackage.ul8.a
                        java.lang.String r5 = "GROWTHUI"
                        ul8$c r2 = r2.z(r5)
                        r2.e(r8)
                        com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository r8 = r7.b
                        com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData r8 = com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository.d(r8)
                    L75:
                        defpackage.zq3.e(r8)
                        com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository r7 = r7.b
                        r53 r7 = com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository.c(r7)
                        java.util.List r2 = defpackage.jb.a(r8)
                        r0.L$0 = r9
                        r0.L$1 = r8
                        r0.label = r4
                        java.lang.Object r7 = r7.a(r2, r0)
                        if (r7 != r1) goto L8f
                        return r1
                    L8f:
                        r6 = r9
                        r9 = r7
                        r7 = r8
                        r8 = r6
                    L93:
                        java.lang.Iterable r9 = (java.lang.Iterable) r9
                        r2 = 10
                        int r2 = kotlin.collections.i.w(r9, r2)
                        int r2 = kotlin.collections.t.e(r2)
                        r4 = 16
                        int r2 = defpackage.uo6.d(r2, r4)
                        java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                        r4.<init>(r2)
                        java.util.Iterator r9 = r9.iterator()
                    Lae:
                        boolean r2 = r9.hasNext()
                        if (r2 == 0) goto Lc3
                        java.lang.Object r2 = r9.next()
                        r5 = r2
                        zc5 r5 = (defpackage.zc5) r5
                        java.lang.String r5 = r5.e()
                        r4.put(r5, r2)
                        goto Lae
                    Lc3:
                        dy3 r7 = defpackage.jb.b(r7, r4)
                        r9 = 0
                        r0.L$0 = r9
                        r0.L$1 = r9
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto Ld5
                        return r1
                    Ld5:
                        ww8 r7 = defpackage.ww8.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }
}
