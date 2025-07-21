package com.nytimes.android.ad.params;

import defpackage.by0;
import defpackage.d96;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ad.params.VideoCustomAdParamProvider$trackIsAdsNPA$1", f = "VideoCustomAdParamProvider.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VideoCustomAdParamProvider$trackIsAdsNPA$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ d96 $purrManagerClient;
    Object L$0;
    int label;
    final /* synthetic */ VideoCustomAdParamProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoCustomAdParamProvider$trackIsAdsNPA$1(VideoCustomAdParamProvider videoCustomAdParamProvider, d96 d96Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = videoCustomAdParamProvider;
        this.$purrManagerClient = d96Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new VideoCustomAdParamProvider$trackIsAdsNPA$1(this.this$0, this.$purrManagerClient, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VideoCustomAdParamProvider videoCustomAdParamProvider;
        String g;
        Object h = a.h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            f.b(obj);
            VideoCustomAdParamProvider videoCustomAdParamProvider2 = this.this$0;
            d96 d96Var = this.$purrManagerClient;
            this.L$0 = videoCustomAdParamProvider2;
            this.label = 1;
            Object i2 = d96Var.i(this);
            if (i2 == h) {
                return h;
            }
            videoCustomAdParamProvider = videoCustomAdParamProvider2;
            obj = i2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            videoCustomAdParamProvider = (VideoCustomAdParamProvider) this.L$0;
            f.b(obj);
        }
        if (!((Boolean) obj).booleanValue() || ((g = this.$purrManagerClient.g()) != null && g.length() != 0)) {
            z = false;
        }
        videoCustomAdParamProvider.g = z;
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((VideoCustomAdParamProvider$trackIsAdsNPA$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
