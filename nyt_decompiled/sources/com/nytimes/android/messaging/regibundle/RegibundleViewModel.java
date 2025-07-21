package com.nytimes.android.messaging.regibundle;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.messaging.regibundle.models.RegibundleDataKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qv6;
import defpackage.ww8;
import defpackage.z58;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class RegibundleViewModel extends q {
    private final z58 a;
    private final CoroutineDispatcher b;
    private final qv6 c;
    private final boolean d;
    private final MutableStateFlow e;
    private final StateFlow f;
    private final MutableStateFlow g;
    private final StateFlow h;

    @fc1(c = "com.nytimes.android.messaging.regibundle.RegibundleViewModel$1", f = "RegibundleViewModel.kt", l = {45, 48}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.messaging.regibundle.RegibundleViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return RegibundleViewModel.this.new AnonymousClass1(by0Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0095 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:7:0x0012, B:8:0x008f, B:10:0x0095, B:14:0x00d7, B:15:0x00de, B:19:0x0026, B:21:0x006e, B:26:0x002e, B:28:0x003e, B:29:0x005d, B:32:0x0059), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00d7 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:7:0x0012, B:8:0x008f, B:10:0x0095, B:14:0x00d7, B:15:0x00de, B:19:0x0026, B:21:0x006e, B:26:0x002e, B:28:0x003e, B:29:0x005d, B:32:0x0059), top: B:2:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.L$0
                com.nytimes.android.messaging.regibundle.models.RegibundleData r0 = (com.nytimes.android.messaging.regibundle.models.RegibundleData) r0
                kotlin.f.b(r6)     // Catch: java.lang.Exception -> L17
                goto L8f
            L17:
                r5 = move-exception
                goto Ldf
            L1a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L22:
                java.lang.Object r1 = r5.L$0
                com.nytimes.android.messaging.regibundle.models.RegibundleData r1 = (com.nytimes.android.messaging.regibundle.models.RegibundleData) r1
                kotlin.f.b(r6)     // Catch: java.lang.Exception -> L17
                r6 = r1
                goto L6e
            L2b:
                kotlin.f.b(r6)
                com.nytimes.android.messaging.regibundle.RegibundleViewModel r6 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.this     // Catch: java.lang.Exception -> L17
                qv6 r6 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.e(r6)     // Catch: java.lang.Exception -> L17
                java.lang.String r6 = r6.D()     // Catch: java.lang.Exception -> L17
                int r6 = r6.length()     // Catch: java.lang.Exception -> L17
                if (r6 <= 0) goto L59
                com.google.gson.Gson r6 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L17
                r6.<init>()     // Catch: java.lang.Exception -> L17
                com.nytimes.android.messaging.regibundle.RegibundleViewModel r1 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.this     // Catch: java.lang.Exception -> L17
                qv6 r1 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.e(r1)     // Catch: java.lang.Exception -> L17
                java.lang.String r1 = r1.D()     // Catch: java.lang.Exception -> L17
                java.lang.Class<com.nytimes.android.messaging.regibundle.models.RegibundleData> r4 = com.nytimes.android.messaging.regibundle.models.RegibundleData.class
                java.lang.Object r6 = r6.fromJson(r1, r4)     // Catch: java.lang.Exception -> L17
                defpackage.zq3.e(r6)     // Catch: java.lang.Exception -> L17
                com.nytimes.android.messaging.regibundle.models.RegibundleData r6 = (com.nytimes.android.messaging.regibundle.models.RegibundleData) r6     // Catch: java.lang.Exception -> L17
                goto L5d
            L59:
                com.nytimes.android.messaging.regibundle.models.RegibundleData r6 = com.nytimes.android.messaging.regibundle.models.RegibundleDataKt.defaultRegibundleData()     // Catch: java.lang.Exception -> L17
            L5d:
                com.nytimes.android.messaging.regibundle.RegibundleViewModel r1 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.this     // Catch: java.lang.Exception -> L17
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.i(r1)     // Catch: java.lang.Exception -> L17
                r5.L$0 = r6     // Catch: java.lang.Exception -> L17
                r5.label = r3     // Catch: java.lang.Exception -> L17
                java.lang.Object r1 = r1.emit(r6, r5)     // Catch: java.lang.Exception -> L17
                if (r1 != r0) goto L6e
                return r0
            L6e:
                com.nytimes.android.messaging.regibundle.models.SubscriptionData r1 = com.nytimes.android.messaging.regibundle.models.RegibundleDataKt.currentSubscriptionValues(r6)     // Catch: java.lang.Exception -> L17
                java.lang.String r1 = r1.getSku()     // Catch: java.lang.Exception -> L17
                java.util.List r1 = kotlin.collections.i.e(r1)     // Catch: java.lang.Exception -> L17
                com.nytimes.android.messaging.regibundle.RegibundleViewModel r4 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.this     // Catch: java.lang.Exception -> L17
                z58 r4 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.f(r4)     // Catch: java.lang.Exception -> L17
                java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L17
                r5.L$0 = r6     // Catch: java.lang.Exception -> L17
                r5.label = r2     // Catch: java.lang.Exception -> L17
                java.lang.Object r1 = r4.H(r1, r3, r5)     // Catch: java.lang.Exception -> L17
                if (r1 != r0) goto L8d
                return r0
            L8d:
                r0 = r6
                r6 = r1
            L8f:
                w28 r6 = (defpackage.w28) r6     // Catch: java.lang.Exception -> L17
                boolean r1 = r6 instanceof w28.b     // Catch: java.lang.Exception -> L17
                if (r1 == 0) goto Ld7
                lu7 r1 = defpackage.lu7.a     // Catch: java.lang.Exception -> L17
                w28$b r6 = (w28.b) r6     // Catch: java.lang.Exception -> L17
                java.util.Set r6 = r6.a()     // Catch: java.lang.Exception -> L17
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Exception -> L17
                java.lang.Object r6 = kotlin.collections.i.j0(r6)     // Catch: java.lang.Exception -> L17
                v28 r6 = (defpackage.v28) r6     // Catch: java.lang.Exception -> L17
                java.lang.CharSequence r6 = r1.b(r6)     // Catch: java.lang.Exception -> L17
                com.nytimes.android.messaging.regibundle.RegibundleViewModel r5 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.this     // Catch: java.lang.Exception -> L17
                kotlinx.coroutines.flow.MutableStateFlow r5 = com.nytimes.android.messaging.regibundle.RegibundleViewModel.g(r5)     // Catch: java.lang.Exception -> L17
                com.nytimes.android.messaging.regibundle.models.SubscriptionData r0 = com.nytimes.android.messaging.regibundle.models.RegibundleDataKt.currentSubscriptionValues(r0)     // Catch: java.lang.Exception -> L17
                java.lang.String r0 = r0.getHeader()     // Catch: java.lang.Exception -> L17
                java.lang.CharSequence r0 = kotlin.text.h.c1(r0)     // Catch: java.lang.Exception -> L17
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L17
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L17
                r1.<init>()     // Catch: java.lang.Exception -> L17
                r1.append(r0)     // Catch: java.lang.Exception -> L17
                java.lang.String r0 = " "
                r1.append(r0)     // Catch: java.lang.Exception -> L17
                r1.append(r6)     // Catch: java.lang.Exception -> L17
                java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L17
                r5.setValue(r6)     // Catch: java.lang.Exception -> L17
                goto Le8
            Ld7:
                android.accounts.NetworkErrorException r5 = new android.accounts.NetworkErrorException     // Catch: java.lang.Exception -> L17
                java.lang.String r6 = "StoreFrontSkuDetailsStatus Failure"
                r5.<init>(r6)     // Catch: java.lang.Exception -> L17
                throw r5     // Catch: java.lang.Exception -> L17
            Ldf:
                java.lang.String r6 = "GMAX: Unable to display regibundle pricing information"
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                com.nytimes.android.logging.NYTLogger.g(r6, r5)
            Le8:
                ww8 r5 = defpackage.ww8.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.messaging.regibundle.RegibundleViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public RegibundleViewModel(z58 z58Var, CoroutineDispatcher coroutineDispatcher, qv6 qv6Var) {
        zq3.h(z58Var, "subauthClient");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(qv6Var, "remoteConfig");
        this.a = z58Var;
        this.b = coroutineDispatcher;
        this.c = qv6Var;
        this.d = !z58Var.q();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(RegibundleDataKt.defaultRegibundleData());
        this.g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), coroutineDispatcher, null, new AnonymousClass1(null), 2, null);
    }

    public final StateFlow j() {
        return this.f;
    }

    public final StateFlow k() {
        return this.h;
    }

    public final boolean l() {
        return this.d;
    }
}
