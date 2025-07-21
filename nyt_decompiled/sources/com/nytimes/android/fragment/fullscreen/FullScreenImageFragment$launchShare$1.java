package com.nytimes.android.fragment.fullscreen;

import android.content.Context;
import androidx.fragment.app.f;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.fragment.AssetViewModel;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.ShareOrigin;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.nk6;
import defpackage.uq7;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$launchShare$1", f = "FullScreenImageFragment.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullScreenImageFragment$launchShare$1 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FullScreenImageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenImageFragment$launchShare$1(FullScreenImageFragment fullScreenImageFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fullScreenImageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FullScreenImageFragment$launchShare$1(this.this$0, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.Context] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetViewModel A1;
        uq7 uq7Var;
        f fVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                Object obj2 = this.this$0.x1().get();
                zq3.g(obj2, "get(...)");
                uq7 uq7Var2 = (uq7) obj2;
                f requireActivity = this.this$0.requireActivity();
                zq3.g(requireActivity, "requireActivity(...)");
                A1 = this.this$0.A1();
                this.L$0 = uq7Var2;
                this.L$1 = requireActivity;
                this.label = 1;
                Object f = A1.f(this);
                if (f == h) {
                    return h;
                }
                uq7Var = uq7Var2;
                fVar = requireActivity;
                obj = f;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r0 = (Context) this.L$1;
                uq7 uq7Var3 = (uq7) this.L$0;
                kotlin.f.b(obj);
                fVar = r0;
                uq7Var = uq7Var3;
            }
            uq7Var.j(fVar, (Asset) obj, ShareOrigin.ARTICLE_FRONT, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
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
        return ((FullScreenImageFragment$launchShare$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
