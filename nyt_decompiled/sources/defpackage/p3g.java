package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class p3g {
    private final ykf a;
    private final boolean b;
    private final zyf c;

    private p3g(zyf zyfVar, boolean z, ykf ykfVar, int i) {
        this.c = zyfVar;
        this.b = z;
        this.a = ykfVar;
    }

    public static p3g c(ykf ykfVar) {
        return new p3g(new zyf(ykfVar), false, mhf.b, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator h(CharSequence charSequence) {
        return new cyf(this.c, this, charSequence);
    }

    public final p3g b() {
        return new p3g(this.c, true, this.a, Integer.MAX_VALUE);
    }

    public final Iterable d(CharSequence charSequence) {
        return new u0g(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add((String) h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
