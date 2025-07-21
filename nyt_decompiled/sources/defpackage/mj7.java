package defpackage;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.internal.MutablePropertyReference2Impl;

/* loaded from: classes.dex */
public final class mj7 {
    private static final SemanticsPropertyKey c;
    private static final SemanticsPropertyKey d;
    public static final int e;
    static final /* synthetic */ iv3[] b = {zt6.g(new MutablePropertyReference2Impl(mj7.class, "lineCountVal", "getLineCountVal(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 0))};
    public static final mj7 a = new mj7();

    static {
        SemanticsPropertyKey semanticsPropertyKey = new SemanticsPropertyKey("lineCount", null, 2, null);
        c = semanticsPropertyKey;
        d = semanticsPropertyKey;
        e = SemanticsPropertyKey.d;
    }

    private mj7() {
    }

    public final void a(lj7 lj7Var, int i) {
        zq3.h(lj7Var, "<this>");
        d.d(lj7Var, b[0], Integer.valueOf(i));
    }
}
