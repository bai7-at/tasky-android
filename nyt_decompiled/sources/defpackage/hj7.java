package defpackage;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;

/* loaded from: classes.dex */
public final class hj7 {
    private final SemanticsNode a;
    private final Rect b;

    public hj7(SemanticsNode semanticsNode, Rect rect) {
        this.a = semanticsNode;
        this.b = rect;
    }

    public final Rect a() {
        return this.b;
    }

    public final SemanticsNode b() {
        return this.a;
    }
}
