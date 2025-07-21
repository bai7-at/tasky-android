package defpackage;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class ue implements Comparator {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Comparator b;

    public ue(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        return compare != 0 ? compare : this.b.compare(((SemanticsNode) obj).p(), ((SemanticsNode) obj2).p());
    }
}
