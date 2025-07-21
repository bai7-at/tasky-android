package androidx.compose.ui.platform;

import defpackage.it2;
import defpackage.lh4;
import defpackage.lu1;
import defpackage.ss2;
import defpackage.zt7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends FunctionReferenceImpl implements it2 {
    AndroidComposeView$dragAndDropModifierOnDragListener$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    public final Boolean g(lu1 lu1Var, long j, ss2 ss2Var) {
        boolean y0;
        y0 = ((AndroidComposeView) this.receiver).y0(lu1Var, j, ss2Var);
        return Boolean.valueOf(y0);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        lh4.a(obj);
        return g(null, ((zt7) obj2).m(), (ss2) obj3);
    }
}
