package androidx.compose.foundation;

import defpackage.by0;
import defpackage.c26;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", l = {984}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickablePointerInputNode$pointerInput$2 extends SuspendLambda implements it2 {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClickablePointerInputNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickablePointerInputNode$pointerInput$2(ClickablePointerInputNode clickablePointerInputNode, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = clickablePointerInputNode;
    }

    public final Object b(c26 c26Var, long j, by0 by0Var) {
        ClickablePointerInputNode$pointerInput$2 clickablePointerInputNode$pointerInput$2 = new ClickablePointerInputNode$pointerInput$2(this.this$0, by0Var);
        clickablePointerInputNode$pointerInput$2.L$0 = c26Var;
        clickablePointerInputNode$pointerInput$2.J$0 = j;
        return clickablePointerInputNode$pointerInput$2.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((c26) obj, ((fd5) obj2).x(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            c26 c26Var = (c26) this.L$0;
            long j = this.J$0;
            if (this.this$0.j2()) {
                ClickablePointerInputNode clickablePointerInputNode = this.this$0;
                this.label = 1;
                if (clickablePointerInputNode.m2(c26Var, j, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
