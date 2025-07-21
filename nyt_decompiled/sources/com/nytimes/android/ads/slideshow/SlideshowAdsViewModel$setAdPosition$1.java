package com.nytimes.android.ads.slideshow;

import defpackage.by0;
import defpackage.cc0;
import defpackage.d8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ru7;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ads.slideshow.SlideshowAdsViewModel$setAdPosition$1", f = "SlideshowAdsViewModel.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlideshowAdsViewModel$setAdPosition$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ SlideshowAdsViewModel this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ SlideshowAdsViewModel a;

        a(SlideshowAdsViewModel slideshowAdsViewModel) {
            this.a = slideshowAdsViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(d8 d8Var, by0 by0Var) {
            MutableStateFlow mutableStateFlow;
            mutableStateFlow = this.a.f;
            Object emit = mutableStateFlow.emit(new ru7(d8Var), by0Var);
            return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlideshowAdsViewModel$setAdPosition$1(SlideshowAdsViewModel slideshowAdsViewModel, int i, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = slideshowAdsViewModel;
        this.$position = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SlideshowAdsViewModel$setAdPosition$1(this.this$0, this.$position, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            map = this.this$0.d;
            Flow flow = (Flow) map.get(cc0.c(this.$position));
            if (flow != null) {
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flow.collect(aVar, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SlideshowAdsViewModel$setAdPosition$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
