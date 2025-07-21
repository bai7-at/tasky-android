package com.nytimes.android.section.sectionfront;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.external.store3.base.RecordState;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.section.sectionfront.SectionFrontPersister;
import com.nytimes.android.section.sectionfront.a;
import com.squareup.moshi.JsonAdapter;
import defpackage.a92;
import defpackage.ad0;
import defpackage.bq5;
import defpackage.jl0;
import defpackage.js5;
import defpackage.jt6;
import defpackage.qd0;
import defpackage.sd0;
import defpackage.ss2;
import defpackage.ve2;
import defpackage.y82;
import defpackage.zq3;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class SectionFrontPersister implements js5, jt6, jl0 {
    private final ve2 a;
    private final JsonAdapter b;
    private final CoroutineDispatcher c;
    private final y82 d;
    private final a92 e;
    private final bq5 f;
    private final long g;
    private final TimeUnit h;

    public SectionFrontPersister(ve2 ve2Var, JsonAdapter jsonAdapter, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(ve2Var, "fileSystem");
        zq3.h(jsonAdapter, "adapter");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = ve2Var;
        this.b = jsonAdapter;
        this.c = coroutineDispatcher;
        bq5 bq5Var = new bq5() { // from class: mg7
            @Override // defpackage.bq5
            public final String a(Object obj) {
                String m;
                m = SectionFrontPersister.m((a) obj);
                return m;
            }
        };
        this.f = bq5Var;
        this.g = 12L;
        this.h = TimeUnit.HOURS;
        this.d = new y82(ve2Var, bq5Var);
        this.e = new a92(ve2Var, bq5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(a aVar) {
        zq3.h(aVar, "it");
        return aVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SectionFront o(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SectionFront) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ad0 q(SectionFrontPersister sectionFrontPersister, SectionFront sectionFront) {
        zq3.h(sectionFrontPersister, "this$0");
        zq3.h(sectionFront, "$assets");
        ad0 ad0Var = new ad0();
        sectionFrontPersister.b.toJson((qd0) ad0Var, (ad0) sectionFront);
        return ad0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource r(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    @Override // defpackage.jl0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void clear(a aVar) {
        zq3.h(aVar, "sectionFrontId");
        try {
            this.a.b(this.f.a(aVar));
        } catch (IOException e) {
            NYTLogger.i(e, "Error deleting sf with id: " + ((Object) aVar.getKey()), new Object[0]);
        }
    }

    @Override // defpackage.jt6
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public RecordState e(a aVar) {
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        RecordState f = this.a.f(this.h, this.g, this.f.a(aVar));
        zq3.g(f, "getRecordState(...)");
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.nytimes.android.api.cms.SectionMeta r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.section.sectionfront.SectionFrontPersister$hasSection$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.section.sectionfront.SectionFrontPersister$hasSection$1 r0 = (com.nytimes.android.section.sectionfront.SectionFrontPersister$hasSection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.section.sectionfront.SectionFrontPersister$hasSection$1 r0 = new com.nytimes.android.section.sectionfront.SectionFrontPersister$hasSection$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            com.nytimes.android.section.sectionfront.a$a r7 = com.nytimes.android.section.sectionfront.a.Companion
            com.nytimes.android.section.sectionfront.a r6 = r7.a(r6)
            kotlinx.coroutines.CoroutineDispatcher r7 = r5.c
            com.nytimes.android.section.sectionfront.SectionFrontPersister$hasSection$recordState$1 r2 = new com.nytimes.android.section.sectionfront.SectionFrontPersister$hasSection$recordState$1
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.nytimes.android.external.store3.base.RecordState r7 = (com.nytimes.android.external.store3.base.RecordState) r7
            com.nytimes.android.external.store3.base.RecordState r5 = com.nytimes.android.external.store3.base.RecordState.MISSING
            if (r7 == r5) goto L52
            goto L53
        L52:
            r3 = 0
        L53:
            java.lang.Boolean r5 = defpackage.cc0.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.SectionFrontPersister.l(com.nytimes.android.api.cms.SectionMeta, by0):java.lang.Object");
    }

    @Override // defpackage.js5
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Maybe d(a aVar) {
        zq3.h(aVar, "sectionFrontId");
        Maybe c = this.d.c(aVar);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.section.sectionfront.SectionFrontPersister$read$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SectionFront invoke(sd0 sd0Var) {
                JsonAdapter jsonAdapter;
                zq3.h(sd0Var, "it");
                jsonAdapter = SectionFrontPersister.this.b;
                return (SectionFront) jsonAdapter.fromJson(sd0Var);
            }
        };
        Maybe map = c.map(new Function() { // from class: ng7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SectionFront o;
                o = SectionFrontPersister.o(ss2.this, obj);
                return o;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }

    @Override // defpackage.js5
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Single b(final a aVar, final SectionFront sectionFront) {
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        zq3.h(sectionFront, "assets");
        Single fromCallable = Single.fromCallable(new Callable() { // from class: og7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ad0 q;
                q = SectionFrontPersister.q(SectionFrontPersister.this, sectionFront);
                return q;
            }
        });
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.section.sectionfront.SectionFrontPersister$write$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(ad0 ad0Var) {
                a92 a92Var;
                zq3.h(ad0Var, "it");
                a92Var = SectionFrontPersister.this.e;
                return a92Var.c(aVar, ad0Var);
            }
        };
        Single flatMap = fromCallable.flatMap(new Function() { // from class: pg7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource r;
                r = SectionFrontPersister.r(ss2.this, obj);
                return r;
            }
        });
        zq3.g(flatMap, "flatMap(...)");
        return flatMap;
    }
}
