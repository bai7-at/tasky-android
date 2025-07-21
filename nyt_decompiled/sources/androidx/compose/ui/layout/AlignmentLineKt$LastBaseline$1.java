package androidx.compose.ui.layout;

import defpackage.dg4;
import defpackage.gt2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements gt2 {
    public static final AlignmentLineKt$LastBaseline$1 a = new AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, dg4.class, "max", "max(II)I", 1);
    }

    public final Integer g(int i, int i2) {
        return Integer.valueOf(Math.max(i, i2));
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return g(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
