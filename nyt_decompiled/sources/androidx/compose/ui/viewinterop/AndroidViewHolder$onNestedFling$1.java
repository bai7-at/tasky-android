package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u49;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {560, 565}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedFling$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedFling$1(boolean z, AndroidViewHolder androidViewHolder, long j, by0 by0Var) {
        super(2, by0Var);
        this.$consumed = z;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        NestedScrollDispatcher nestedScrollDispatcher2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (this.$consumed) {
                nestedScrollDispatcher = this.this$0.b;
                long j = this.$viewVelocity;
                long a = u49.b.a();
                this.label = 2;
                if (nestedScrollDispatcher.a(j, a, this) == h) {
                    return h;
                }
            } else {
                nestedScrollDispatcher2 = this.this$0.b;
                long a2 = u49.b.a();
                long j2 = this.$viewVelocity;
                this.label = 1;
                if (nestedScrollDispatcher2.a(a2, j2, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AndroidViewHolder$onNestedFling$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
