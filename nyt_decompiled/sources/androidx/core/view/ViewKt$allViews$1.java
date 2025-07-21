package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ak7;
import defpackage.bk7;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.f;

@fc1(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements gt2 {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(View view, by0 by0Var) {
        super(2, by0Var);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, by0Var);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // defpackage.gt2
    public final Object invoke(bk7 bk7Var, by0 by0Var) {
        return ((ViewKt$allViews$1) create(bk7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bk7 bk7Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            bk7Var = (bk7) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = bk7Var;
            this.label = 1;
            if (bk7Var.c(view, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            bk7Var = (bk7) this.L$0;
            f.b(obj);
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            ak7 c = ViewGroupKt.c((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (bk7Var.d(c, this) == h) {
                return h;
            }
        }
        return ww8.a;
    }
}
