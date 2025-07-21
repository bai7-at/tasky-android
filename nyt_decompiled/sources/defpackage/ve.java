package defpackage;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class ve implements Comparator {
    final /* synthetic */ Comparator a;

    public ve(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        return compare != 0 ? compare : tp0.d(Integer.valueOf(((SemanticsNode) obj).n()), Integer.valueOf(((SemanticsNode) obj2).n()));
    }
}
