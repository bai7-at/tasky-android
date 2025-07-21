package com.nytimes.android.features.discovery.discoverytab.data;

import defpackage.by0;
import defpackage.fc1;
import defpackage.se7;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsRepository$loadCarousels$1", f = "SectionCarouselsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SectionCarouselsRepository$loadCarousels$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ List<se7> $carouselConfigs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionCarouselsRepository$loadCarousels$1(List list, by0 by0Var) {
        super(1, by0Var);
        this.$carouselConfigs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SectionCarouselsRepository$loadCarousels$1(this.$carouselConfigs, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SectionCarouselsRepository$loadCarousels$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return this.$carouselConfigs;
    }
}
