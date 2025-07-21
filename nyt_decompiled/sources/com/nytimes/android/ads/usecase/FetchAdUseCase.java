package com.nytimes.android.ads.usecase;

import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.network.model.AlsTargetingData;
import defpackage.bc;
import defpackage.by0;
import defpackage.m7;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Result;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class FetchAdUseCase {
    private final m7 a;
    private final bc b;
    private AlsTargetingData c;

    static final class a implements FlowCollector {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, by0 by0Var) {
            Result result = (Result) obj;
            if (Result.h(result.j())) {
                FetchAdUseCase fetchAdUseCase = FetchAdUseCase.this;
                Object j = result.j();
                if (Result.g(j)) {
                    j = null;
                }
                fetchAdUseCase.c = (AlsTargetingData) j;
            }
            return ww8.a;
        }
    }

    public FetchAdUseCase(m7 m7Var, bc bcVar) {
        zq3.h(m7Var, "repository");
        zq3.h(bcVar, "alsRepository");
        this.a = m7Var;
        this.b = bcVar;
    }

    public static /* synthetic */ Object e(FetchAdUseCase fetchAdUseCase, String str, String str2, String str3, by0 by0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fetchAdUseCase.d(str, str2, str3, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, java.lang.String r7, java.lang.String r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.android.ads.usecase.FetchAdUseCase$fetchAlsTargeting$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.ads.usecase.FetchAdUseCase$fetchAlsTargeting$1 r0 = (com.nytimes.android.ads.usecase.FetchAdUseCase$fetchAlsTargeting$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ads.usecase.FetchAdUseCase$fetchAlsTargeting$1 r0 = new com.nytimes.android.ads.usecase.FetchAdUseCase$fetchAlsTargeting$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L63
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.ads.usecase.FetchAdUseCase r5 = (com.nytimes.android.ads.usecase.FetchAdUseCase) r5
            kotlin.f.b(r9)
            goto L50
        L3c:
            kotlin.f.b(r9)
            com.nytimes.android.ads.network.model.AlsTargetingData r9 = r5.c
            if (r9 != 0) goto L66
            bc r9 = r5.b
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r9 = r9.a(r8, r6, r7, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
            com.nytimes.android.ads.usecase.FetchAdUseCase$a r6 = new com.nytimes.android.ads.usecase.FetchAdUseCase$a
            r6.<init>()
            r5 = 0
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = r9.collect(r6, r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            ww8 r5 = defpackage.ww8.a
            return r5
        L66:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.usecase.FetchAdUseCase.d(java.lang.String, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    public final Flow f(AdConfig adConfig, String str) {
        zq3.h(adConfig, "adConfig");
        zq3.h(str, "adPosition");
        return FlowKt.flow(new FetchAdUseCase$getAd$1(this, str, adConfig, null));
    }
}
