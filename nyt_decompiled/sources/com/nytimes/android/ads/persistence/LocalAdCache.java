package com.nytimes.android.ads.persistence;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.by0;
import defpackage.dm0;
import defpackage.fc1;
import defpackage.ww8;
import defpackage.z7;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class LocalAdCache {
    private final long a;
    private final Map b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final z7 a;
        private final long b;

        public a(z7 z7Var, long j) {
            this.a = z7Var;
            this.b = j;
        }

        public final z7 a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            z7 z7Var = this.a;
            return ((z7Var == null ? 0 : z7Var.hashCode()) * 31) + Long.hashCode(this.b);
        }

        public String toString() {
            return "CachedAdView(adView=" + this.a + ", timestamp=" + this.b + ")";
        }
    }

    public LocalAdCache(long j) {
        this.a = j;
    }

    private final MutableStateFlow b(String str) {
        Map map = this.b;
        Object obj = map.get(str);
        if (obj == null) {
            obj = StateFlowKt.MutableStateFlow(null);
            map.put(str, obj);
        }
        return (MutableStateFlow) obj;
    }

    public final Long a(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.b.get(str);
        a aVar = mutableStateFlow != null ? (a) mutableStateFlow.getValue() : null;
        long a2 = dm0.a.a();
        if ((aVar != null ? aVar.a() : null) == null || a2 - aVar.b() < this.a) {
            return null;
        }
        return Long.valueOf(a2 - aVar.b());
    }

    public final boolean c(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        a aVar = (a) b(str).getValue();
        return (aVar != null ? aVar.a() : null) != null;
    }

    public final Flow d(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        final MutableStateFlow b = b(str);
        return new Flow() { // from class: com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1

            /* renamed from: com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1$2", f = "LocalAdCache.kt", l = {223}, m = "emit")
                /* renamed from: com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1$2$1 r0 = (com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1$2$1 r0 = new com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        com.nytimes.android.ads.persistence.LocalAdCache$a r5 = (com.nytimes.android.ads.persistence.LocalAdCache.a) r5
                        if (r5 == 0) goto L3f
                        z7 r5 = r5.a()
                        goto L40
                    L3f:
                        r5 = 0
                    L40:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L49
                        return r1
                    L49:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.persistence.LocalAdCache$observeItem$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    public final void e(String str, z7 z7Var) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        b(str).setValue(new a(z7Var, dm0.a.a()));
    }
}
