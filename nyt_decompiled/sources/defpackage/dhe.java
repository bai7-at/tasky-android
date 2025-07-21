package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class dhe {
    private final dge a;
    private final che b;

    private dhe(che cheVar) {
        dge dgeVar = cge.b;
        this.b = cheVar;
        this.a = dgeVar;
    }

    public static dhe b(int i) {
        return new dhe(new zge(4000));
    }

    public static dhe c(dge dgeVar) {
        return new dhe(new xge(dgeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator g(CharSequence charSequence) {
        return this.b.a(this, charSequence);
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new ahe(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator g = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
