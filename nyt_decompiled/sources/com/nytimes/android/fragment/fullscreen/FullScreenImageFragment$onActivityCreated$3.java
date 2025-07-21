package com.nytimes.android.fragment.fullscreen;

import com.nytimes.android.api.cms.Asset;
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

@fc1(c = "com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$onActivityCreated$3", f = "FullScreenImageFragment.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullScreenImageFragment$onActivityCreated$3 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ FullScreenImageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenImageFragment$onActivityCreated$3(FullScreenImageFragment fullScreenImageFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fullScreenImageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FullScreenImageFragment$onActivityCreated$3(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetViewModel A1;
        FullScreenImageFragment fullScreenImageFragment;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                FullScreenImageFragment fullScreenImageFragment2 = this.this$0;
                A1 = fullScreenImageFragment2.A1();
                this.L$0 = fullScreenImageFragment2;
                this.label = 1;
                Object f = A1.f(this);
                if (f == h) {
                    return h;
                }
                fullScreenImageFragment = fullScreenImageFragment2;
                obj = f;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fullScreenImageFragment = (FullScreenImageFragment) this.L$0;
                f.b(obj);
            }
            fullScreenImageFragment.K1((Asset) obj);
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                NYTLogger.i(e, "Failed to display image, Could not find asset", new Object[0]);
                this.this$0.c1(nk6.unable_to_display_image);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FullScreenImageFragment$onActivityCreated$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
