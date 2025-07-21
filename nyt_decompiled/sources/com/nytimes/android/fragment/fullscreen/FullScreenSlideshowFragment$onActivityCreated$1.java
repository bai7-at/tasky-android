package com.nytimes.android.fragment.fullscreen;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.fragment.AssetViewModel;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.nk6;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$onActivityCreated$1", f = "FullScreenSlideshowFragment.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullScreenSlideshowFragment$onActivityCreated$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ FullScreenSlideshowFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenSlideshowFragment$onActivityCreated$1(FullScreenSlideshowFragment fullScreenSlideshowFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fullScreenSlideshowFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FullScreenSlideshowFragment$onActivityCreated$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetViewModel m1;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                m1 = this.this$0.m1();
                this.label = 1;
                obj = m1.f(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            Asset asset = (Asset) obj;
            if (asset instanceof SlideshowAsset) {
                this.this$0.o1((SlideshowAsset) asset);
            } else {
                NYTLogger.A("Failed to load slide show, Slide show is not present", new Object[0]);
                this.this$0.c1(nk6.unable_to_load_slideshow);
            }
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                NYTLogger.C(e, "Failed to load slide show, Slide show is not present", new Object[0]);
                this.this$0.c1(nk6.unable_to_load_slideshow);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FullScreenSlideshowFragment$onActivityCreated$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
