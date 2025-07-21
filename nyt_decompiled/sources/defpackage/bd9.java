package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class bd9 {
    private final vy4 a = new vy4(new Reference[16], 0);
    private final ReferenceQueue b = new ReferenceQueue();

    private final void a() {
        Reference poll;
        do {
            poll = this.b.poll();
            if (poll != null) {
                this.a.w(poll);
            }
        } while (poll != null);
    }

    public final Object b() {
        a();
        while (this.a.t()) {
            Object obj = ((Reference) this.a.y(r0.q() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void c(Object obj) {
        a();
        this.a.b(new WeakReference(obj, this.b));
    }
}
