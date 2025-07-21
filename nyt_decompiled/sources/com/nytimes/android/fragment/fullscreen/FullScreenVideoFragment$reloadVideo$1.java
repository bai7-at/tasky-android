package com.nytimes.android.fragment.fullscreen;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.util.VideoUtil;
import com.nytimes.android.media.video.presenter.FullscreenVideoFetcher;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.nk6;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment$reloadVideo$1", f = "FullScreenVideoFragment.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullScreenVideoFragment$reloadVideo$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $playVideoAd;
    Object L$0;
    int label;
    final /* synthetic */ FullScreenVideoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenVideoFragment$reloadVideo$1(FullScreenVideoFragment fullScreenVideoFragment, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fullScreenVideoFragment;
        this.$playVideoAd = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FullScreenVideoFragment$reloadVideo$1(this.this$0, this.$playVideoAd, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FullScreenVideoFragment fullScreenVideoFragment;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                FullScreenVideoFragment fullScreenVideoFragment2 = this.this$0;
                FullscreenVideoFetcher C1 = fullScreenVideoFragment2.C1();
                VideoUtil.VideoRes c = this.this$0.y1().c();
                this.L$0 = fullScreenVideoFragment2;
                this.label = 1;
                Object a = C1.a(c, this);
                if (a == h) {
                    return h;
                }
                fullScreenVideoFragment = fullScreenVideoFragment2;
                obj = a;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fullScreenVideoFragment = (FullScreenVideoFragment) this.L$0;
                f.b(obj);
            }
            fullScreenVideoFragment.r1((NYTMediaItem) obj, this.$playVideoAd);
        } catch (Exception e) {
            NYTLogger.C(e, "Failed to load video, Video is not present", new Object[0]);
            this.this$0.c1(nk6.unable_to_load_video);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FullScreenVideoFragment$reloadVideo$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
