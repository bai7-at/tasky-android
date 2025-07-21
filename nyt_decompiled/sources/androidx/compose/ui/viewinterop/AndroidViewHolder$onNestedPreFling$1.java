package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {578}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedPreFling$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $toBeConsumed;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = androidViewHolder;
        this.$toBeConsumed = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AndroidViewHolder$onNestedPreFling$1(this.this$0, this.$toBeConsumed, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            nestedScrollDispatcher = this.this$0.b;
            long j = this.$toBeConsumed;
            this.label = 1;
            if (nestedScrollDispatcher.c(j, this) == h) {
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
        return ((AndroidViewHolder$onNestedPreFling$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
