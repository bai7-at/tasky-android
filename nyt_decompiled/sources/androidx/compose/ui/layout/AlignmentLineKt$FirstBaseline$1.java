package androidx.compose.ui.layout;

import defpackage.dg4;
import defpackage.gt2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements gt2 {
    public static final AlignmentLineKt$FirstBaseline$1 a = new AlignmentLineKt$FirstBaseline$1();

    AlignmentLineKt$FirstBaseline$1() {
        super(2, dg4.class, "min", "min(II)I", 1);
    }

    public final Integer g(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return g(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
