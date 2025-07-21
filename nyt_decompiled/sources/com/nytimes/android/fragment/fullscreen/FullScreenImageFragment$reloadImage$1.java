package com.nytimes.android.fragment.fullscreen;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.fragment.AssetViewModel;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jg3;
import defpackage.nk6;
import defpackage.ww8;
import io.reactivex.Single;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;

@fc1(c = "com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$reloadImage$1", f = "FullScreenImageFragment.kt", l = {224, 226}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullScreenImageFragment$reloadImage$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ FullScreenImageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenImageFragment$reloadImage$1(FullScreenImageFragment fullScreenImageFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fullScreenImageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FullScreenImageFragment$reloadImage$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetViewModel A1;
        Image w1;
        Single v1;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                NYTLogger.i(e, "Failed to display image, Could not find asset", new Object[0]);
                this.this$0.c1(nk6.unable_to_display_image);
            }
        }
        if (i == 0) {
            f.b(obj);
            A1 = this.this$0.A1();
            this.label = 1;
            obj = A1.f(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.this$0.F1(((jg3) obj).a());
                return ww8.a;
            }
            f.b(obj);
        }
        w1 = this.this$0.w1((Asset) obj);
        v1 = this.this$0.v1(w1);
        this.label = 2;
        obj = RxAwaitKt.await(v1, this);
        if (obj == h) {
            return h;
        }
        this.this$0.F1(((jg3) obj).a());
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FullScreenImageFragment$reloadImage$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
