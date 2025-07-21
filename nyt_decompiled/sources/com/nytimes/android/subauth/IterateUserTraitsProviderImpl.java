package com.nytimes.android.subauth;

import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.libs.iterate.IterateUserType;
import defpackage.by0;
import defpackage.cs3;
import defpackage.fc1;
import defpackage.ww8;
import defpackage.z58;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class IterateUserTraitsProviderImpl implements cs3 {
    private final Application a;
    private final z58 b;
    private final Flow c;
    private final Flow d;

    public IterateUserTraitsProviderImpl(Application application, z58 z58Var) {
        zq3.h(application, "application");
        zq3.h(z58Var, "subauth");
        this.a = application;
        this.b = z58Var;
        final Flow e = z58Var.e();
        this.c = new Flow() { // from class: com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1

            /* renamed from: com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ IterateUserTraitsProviderImpl b;

                @fc1(c = "com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1$2", f = "IterateUserTraitsProviderImpl.kt", l = {220, 219}, m = "emit")
                /* renamed from: com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, IterateUserTraitsProviderImpl iterateUserTraitsProviderImpl) {
                    this.a = flowCollector;
                    this.b = iterateUserTraitsProviderImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, defpackage.by0 r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1$2$1 r0 = (com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1$2$1 r0 = new com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.f.b(r8)
                        goto L62
                    L2c:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L34:
                        java.lang.Object r6 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                        kotlin.f.b(r8)
                        goto L56
                    L3c:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.a
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        r7.booleanValue()
                        com.nytimes.android.subauth.IterateUserTraitsProviderImpl r6 = r6.b
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r6 = r6.a(r0)
                        if (r6 != r1) goto L53
                        return r1
                    L53:
                        r5 = r8
                        r8 = r6
                        r6 = r5
                    L56:
                        r7 = 0
                        r0.L$0 = r7
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r8, r0)
                        if (r6 != r1) goto L62
                        return r1
                    L62:
                        ww8 r6 = defpackage.ww8.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.IterateUserTraitsProviderImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
        this.d = FlowKt.flow(new IterateUserTraitsProviderImpl$agentIdFlow$1(this, null));
    }

    @Override // defpackage.cs3
    public Object a(by0 by0Var) {
        return this.b.q() ? this.b.F() ? IterateUserType.Sub : IterateUserType.Regi : IterateUserType.Anon;
    }

    @Override // defpackage.cs3
    public Flow b() {
        return this.d;
    }

    @Override // defpackage.cs3
    public Flow c() {
        return this.c;
    }
}
