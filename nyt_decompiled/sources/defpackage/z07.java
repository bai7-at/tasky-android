package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class z07 implements q5, qa9 {
    private final Set a = new HashSet();
    private boolean b = false;

    public void a() {
        gl8.a();
        this.b = true;
        Iterator it2 = this.a.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }
}
