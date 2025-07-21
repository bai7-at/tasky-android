package com.nytimes.android.ads.slideshow;

import com.nytimes.android.ads.usecase.FetchAdUseCase;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ads.slideshow.SlideshowAdsViewModel$initializeAdConfig$1", f = "SlideshowAdsViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlideshowAdsViewModel$initializeAdConfig$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $contentUri;
    int label;
    final /* synthetic */ SlideshowAdsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlideshowAdsViewModel$initializeAdConfig$1(SlideshowAdsViewModel slideshowAdsViewModel, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = slideshowAdsViewModel;
        this.$contentUri = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SlideshowAdsViewModel$initializeAdConfig$1(this.this$0, this.$contentUri, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FetchAdUseCase fetchAdUseCase;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            fetchAdUseCase = this.this$0.a;
            String str = this.$contentUri;
            this.label = 1;
            if (FetchAdUseCase.e(fetchAdUseCase, str, null, "ss", this, 2, null) == h) {
                return h;
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
        return ((SlideshowAdsViewModel$initializeAdConfig$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
