package androidx.compose.material;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.material.SwitchKt$Switch$3$1", f = "Switch.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SwitchKt$Switch$3$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AnchoredDraggableState $anchoredDraggableState;
    final /* synthetic */ boolean $checked;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchKt$Switch$3$1(boolean z, AnchoredDraggableState anchoredDraggableState, by0 by0Var) {
        super(2, by0Var);
        this.$checked = z;
        this.$anchoredDraggableState = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SwitchKt$Switch$3$1(this.$checked, this.$anchoredDraggableState, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            if (this.$checked != ((Boolean) this.$anchoredDraggableState.r()).booleanValue()) {
                AnchoredDraggableState anchoredDraggableState = this.$anchoredDraggableState;
                Boolean a = cc0.a(this.$checked);
                this.label = 1;
                if (AnchoredDraggableKt.g(anchoredDraggableState, a, 0.0f, this, 2, null) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SwitchKt$Switch$3$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
