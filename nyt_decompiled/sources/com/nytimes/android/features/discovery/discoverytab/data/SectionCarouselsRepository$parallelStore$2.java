package com.nytimes.android.features.discovery.discoverytab.data;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsRepository$parallelStore$2", f = "SectionCarouselsRepository.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SectionCarouselsRepository$parallelStore$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SectionCarouselsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionCarouselsRepository$parallelStore$2(SectionCarouselsRepository sectionCarouselsRepository, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = sectionCarouselsRepository;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(List list, by0 by0Var) {
        return ((SectionCarouselsRepository$parallelStore$2) create(list, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SectionCarouselsRepository$parallelStore$2 sectionCarouselsRepository$parallelStore$2 = new SectionCarouselsRepository$parallelStore$2(this.this$0, by0Var);
        sectionCarouselsRepository$parallelStore$2.L$0 = obj;
        return sectionCarouselsRepository$parallelStore$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SectionCarouselsDataFetcher sectionCarouselsDataFetcher;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            List list = (List) this.L$0;
            sectionCarouselsDataFetcher = this.this$0.b;
            this.label = 1;
            obj = sectionCarouselsDataFetcher.f(list, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }
}
