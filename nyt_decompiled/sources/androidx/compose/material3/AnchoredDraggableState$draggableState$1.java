package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import defpackage.by0;
import defpackage.gt2;
import defpackage.id;
import defpackage.qu1;
import defpackage.vu1;
import defpackage.ww8;

/* loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1 implements vu1 {
    private final a a;
    final /* synthetic */ AnchoredDraggableState b;

    public static final class a implements qu1 {
        final /* synthetic */ AnchoredDraggableState a;

        a(AnchoredDraggableState anchoredDraggableState) {
            this.a = anchoredDraggableState;
        }

        @Override // defpackage.qu1
        public void c(float f) {
            id idVar;
            idVar = this.a.o;
            id.b(idVar, this.a.z(f), 0.0f, 2, null);
        }
    }

    AnchoredDraggableState$draggableState$1(AnchoredDraggableState anchoredDraggableState) {
        this.b = anchoredDraggableState;
        this.a = new a(anchoredDraggableState);
    }

    @Override // defpackage.vu1
    public Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        Object i = this.b.i(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, gt2Var, null), by0Var);
        return i == kotlin.coroutines.intrinsics.a.h() ? i : ww8.a;
    }
}
