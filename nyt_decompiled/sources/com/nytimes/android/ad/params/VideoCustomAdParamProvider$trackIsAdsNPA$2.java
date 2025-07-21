package com.nytimes.android.ad.params;

import defpackage.by0;
import defpackage.d96;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.ad.params.VideoCustomAdParamProvider$trackIsAdsNPA$2", f = "VideoCustomAdParamProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VideoCustomAdParamProvider$trackIsAdsNPA$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ d96 $purrManagerClient;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ VideoCustomAdParamProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoCustomAdParamProvider$trackIsAdsNPA$2(VideoCustomAdParamProvider videoCustomAdParamProvider, d96 d96Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = videoCustomAdParamProvider;
        this.$purrManagerClient = d96Var;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((VideoCustomAdParamProvider$trackIsAdsNPA$2) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        VideoCustomAdParamProvider$trackIsAdsNPA$2 videoCustomAdParamProvider$trackIsAdsNPA$2 = new VideoCustomAdParamProvider$trackIsAdsNPA$2(this.this$0, this.$purrManagerClient, by0Var);
        videoCustomAdParamProvider$trackIsAdsNPA$2.Z$0 = ((Boolean) obj).booleanValue();
        return videoCustomAdParamProvider$trackIsAdsNPA$2;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String g;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        boolean z = this.Z$0;
        this.this$0.g = z && ((g = this.$purrManagerClient.g()) == null || g.length() == 0);
        return ww8.a;
    }
}
