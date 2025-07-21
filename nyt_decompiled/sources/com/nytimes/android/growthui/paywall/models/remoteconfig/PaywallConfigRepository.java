package com.nytimes.android.growthui.paywall.models.remoteconfig;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.squareup.moshi.i;
import defpackage.by0;
import defpackage.fc1;
import defpackage.p53;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class PaywallConfigRepository {
    private final DataConfigId a;
    private final String b;
    private final p53 c;
    private final i d;

    public PaywallConfigRepository(DataConfigId dataConfigId, String str, p53 p53Var, i iVar) {
        zq3.h(dataConfigId, "dataConfigId");
        zq3.h(str, "fallbackJson");
        zq3.h(p53Var, "remoteConfigAdapter");
        zq3.h(iVar, "moshi");
        this.a = dataConfigId;
        this.b = str;
        this.c = p53Var;
        this.d = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaywallData d() {
        try {
            PaywallData paywallData = (PaywallData) this.d.c(PaywallData.class).fromJson(this.b);
            return paywallData == null ? new PaywallData(null, null, null, null, null, 31, null) : paywallData;
        } catch (Exception e) {
            ul8.b bVar = ul8.a;
            bVar.z("GROWTHUI").d("Fallback Failed", new Object[0]);
            bVar.z("GROWTHUI").e(e);
            return new PaywallData(null, null, null, null, null, 31, null);
        }
    }

    public final Flow c(final String str) {
        final Flow flowOf = FlowKt.flowOf(this.c.a(this.a));
        return new Flow() { // from class: com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1

            /* renamed from: com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ PaywallConfigRepository b;
                final /* synthetic */ String c;

                @fc1(c = "com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1$2", f = "PaywallConfigRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector, PaywallConfigRepository paywallConfigRepository, String str) {
                    this.a = flowCollector;
                    this.b = paywallConfigRepository;
                    this.c = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, defpackage.by0 r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1$2$1 r0 = (com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1$2$1 r0 = new com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.f.b(r9)
                        goto Lb7
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        kotlin.f.b(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.a
                        java.lang.String r8 = (java.lang.String) r8
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository r2 = r7.b     // Catch: java.lang.Exception -> L61
                        com.squareup.moshi.i r2 = com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository.a(r2)     // Catch: java.lang.Exception -> L61
                        java.lang.Class<com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigsData> r4 = com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigsData.class
                        com.squareup.moshi.JsonAdapter r2 = r2.c(r4)     // Catch: java.lang.Exception -> L61
                        java.lang.Object r2 = r2.fromJson(r8)     // Catch: java.lang.Exception -> L61
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigsData r2 = (com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigsData) r2     // Catch: java.lang.Exception -> L61
                        java.lang.String r4 = r7.c     // Catch: java.lang.Exception -> L61
                        r5 = 0
                        if (r4 == 0) goto L6e
                        if (r2 == 0) goto L63
                        java.util.Map r6 = r2.b()     // Catch: java.lang.Exception -> L61
                        if (r6 == 0) goto L63
                        java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L61
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallData r4 = (com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallData) r4     // Catch: java.lang.Exception -> L61
                        if (r4 != 0) goto L6b
                        goto L63
                    L61:
                        r8 = move-exception
                        goto L99
                    L63:
                        if (r2 == 0) goto L6a
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallData r4 = r2.a()     // Catch: java.lang.Exception -> L61
                        goto L6b
                    L6a:
                        r4 = r5
                    L6b:
                        if (r4 == 0) goto L6e
                        goto L75
                    L6e:
                        if (r2 == 0) goto L74
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallData r5 = r2.a()     // Catch: java.lang.Exception -> L61
                    L74:
                        r4 = r5
                    L75:
                        if (r4 == 0) goto L82
                        java.lang.String r2 = r4.b()     // Catch: java.lang.Exception -> L61
                        boolean r2 = kotlin.text.h.d0(r2)     // Catch: java.lang.Exception -> L61
                        if (r2 != 0) goto L82
                        goto Laa
                    L82:
                        java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Exception -> L61
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L61
                        r4.<init>()     // Catch: java.lang.Exception -> L61
                        java.lang.String r5 = "Unexpected JSON configuration: "
                        r4.append(r5)     // Catch: java.lang.Exception -> L61
                        r4.append(r8)     // Catch: java.lang.Exception -> L61
                        java.lang.String r8 = r4.toString()     // Catch: java.lang.Exception -> L61
                        r2.<init>(r8)     // Catch: java.lang.Exception -> L61
                        throw r2     // Catch: java.lang.Exception -> L61
                    L99:
                        ul8$b r2 = defpackage.ul8.a
                        java.lang.String r4 = "GROWTHUI"
                        ul8$c r2 = r2.z(r4)
                        r2.e(r8)
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository r7 = r7.b
                        com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallData r4 = com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository.b(r7)
                    Laa:
                        hq5 r7 = defpackage.iq5.a(r4)
                        r0.label = r3
                        java.lang.Object r7 = r9.emit(r7, r0)
                        if (r7 != r1) goto Lb7
                        return r1
                    Lb7:
                        ww8 r7 = defpackage.ww8.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, str), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }
}
