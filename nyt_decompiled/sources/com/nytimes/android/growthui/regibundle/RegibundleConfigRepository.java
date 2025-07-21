package com.nytimes.android.growthui.regibundle;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData;
import com.squareup.moshi.i;
import defpackage.by0;
import defpackage.fc1;
import defpackage.p53;
import defpackage.r53;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class RegibundleConfigRepository {
    private final DataConfigId a;
    private final String b;
    private final r53 c;
    private final p53 d;
    private final i e;

    public RegibundleConfigRepository(DataConfigId dataConfigId, String str, r53 r53Var, p53 p53Var, i iVar) {
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
    public final RegibundleData e() {
        try {
            RegibundleData regibundleData = (RegibundleData) this.e.c(RegibundleData.class).fromJson(this.b);
            return regibundleData == null ? new RegibundleData(null, null, null, null, null, 31, null) : regibundleData;
        } catch (Exception e) {
            ul8.b bVar = ul8.a;
            bVar.z("GROWTHUI").d("Fallback Failed", new Object[0]);
            bVar.z("GROWTHUI").e(e);
            return new RegibundleData(null, null, null, null, null, 31, null);
        }
    }

    public final Flow d() {
        final Flow flowOf = FlowKt.flowOf(this.d.a(this.a));
        return new Flow() { // from class: com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1

            /* renamed from: com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ RegibundleConfigRepository b;

                @fc1(c = "com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1$2", f = "RegibundleConfigRepository.kt", l = {AdvertisementType.BRANDED_AS_CONTENT, 223}, m = "emit")
                /* renamed from: com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, RegibundleConfigRepository regibundleConfigRepository) {
                    this.a = flowCollector;
                    this.b = regibundleConfigRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x00d9 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, defpackage.by0 r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1$2$1 r0 = (com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1$2$1 r0 = new com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L42
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.f.b(r10)
                        goto Lda
                    L2d:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L35:
                        java.lang.Object r8 = r0.L$1
                        com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData r8 = (com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData) r8
                        java.lang.Object r9 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                        kotlin.f.b(r10)
                        goto Lc0
                    L42:
                        kotlin.f.b(r10)
                        kotlinx.coroutines.flow.FlowCollector r10 = r8.a
                        java.lang.String r9 = (java.lang.String) r9
                        com.nytimes.android.growthui.regibundle.RegibundleConfigRepository r2 = r8.b     // Catch: java.lang.Exception -> L64
                        com.squareup.moshi.i r2 = com.nytimes.android.growthui.regibundle.RegibundleConfigRepository.a(r2)     // Catch: java.lang.Exception -> L64
                        java.lang.Class<com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData> r5 = com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData.class
                        com.squareup.moshi.JsonAdapter r2 = r2.c(r5)     // Catch: java.lang.Exception -> L64
                        java.lang.Object r2 = r2.fromJson(r9)     // Catch: java.lang.Exception -> L64
                        com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData r2 = (com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData) r2     // Catch: java.lang.Exception -> L64
                        if (r2 != 0) goto L66
                        com.nytimes.android.growthui.regibundle.RegibundleConfigRepository r2 = r8.b     // Catch: java.lang.Exception -> L64
                        com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData r2 = com.nytimes.android.growthui.regibundle.RegibundleConfigRepository.c(r2)     // Catch: java.lang.Exception -> L64
                        goto L66
                    L64:
                        r9 = move-exception
                        goto L90
                    L66:
                        defpackage.zq3.e(r2)     // Catch: java.lang.Exception -> L64
                        com.nytimes.android.growthui.regibundle.models.remoteconfig.SubscriptionData r5 = r2.d()     // Catch: java.lang.Exception -> L64
                        java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L64
                        boolean r5 = kotlin.text.h.d0(r5)     // Catch: java.lang.Exception -> L64
                        if (r5 != 0) goto L79
                        r9 = r2
                        goto La1
                    L79:
                        java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Exception -> L64
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L64
                        r5.<init>()     // Catch: java.lang.Exception -> L64
                        java.lang.String r6 = "Unexpected JSON configuration: "
                        r5.append(r6)     // Catch: java.lang.Exception -> L64
                        r5.append(r9)     // Catch: java.lang.Exception -> L64
                        java.lang.String r9 = r5.toString()     // Catch: java.lang.Exception -> L64
                        r2.<init>(r9)     // Catch: java.lang.Exception -> L64
                        throw r2     // Catch: java.lang.Exception -> L64
                    L90:
                        ul8$b r2 = defpackage.ul8.a
                        java.lang.String r5 = "GROWTHUI"
                        ul8$c r2 = r2.z(r5)
                        r2.e(r9)
                        com.nytimes.android.growthui.regibundle.RegibundleConfigRepository r9 = r8.b
                        com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData r9 = com.nytimes.android.growthui.regibundle.RegibundleConfigRepository.c(r9)
                    La1:
                        com.nytimes.android.growthui.regibundle.RegibundleConfigRepository r8 = r8.b
                        r53 r8 = com.nytimes.android.growthui.regibundle.RegibundleConfigRepository.b(r8)
                        java.lang.String r2 = defpackage.eu6.a(r9)
                        java.util.List r2 = kotlin.collections.i.e(r2)
                        r0.L$0 = r10
                        r0.L$1 = r9
                        r0.label = r4
                        java.lang.Object r8 = r8.a(r2, r0)
                        if (r8 != r1) goto Lbc
                        return r1
                    Lbc:
                        r7 = r10
                        r10 = r8
                        r8 = r9
                        r9 = r7
                    Lc0:
                        java.util.List r10 = (java.util.List) r10
                        java.lang.Object r10 = kotlin.collections.i.m0(r10)
                        zc5 r10 = (defpackage.zc5) r10
                        du6 r8 = defpackage.eu6.b(r8, r10)
                        r10 = 0
                        r0.L$0 = r10
                        r0.L$1 = r10
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r8, r0)
                        if (r8 != r1) goto Lda
                        return r1
                    Lda:
                        ww8 r8 = defpackage.ww8.a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.growthui.regibundle.RegibundleConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        };
    }
}
