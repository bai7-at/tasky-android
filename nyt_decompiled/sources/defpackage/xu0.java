package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class xu0 implements ak7 {
    private final AtomicReference a;

    public xu0(ak7 ak7Var) {
        zq3.h(ak7Var, "sequence");
        this.a = new AtomicReference(ak7Var);
    }

    @Override // defpackage.ak7
    public Iterator iterator() {
        ak7 ak7Var = (ak7) this.a.getAndSet(null);
        if (ak7Var != null) {
            return ak7Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
