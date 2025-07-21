package defpackage;

import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.o;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class w64 {
    private static final o c = new o(Object.class, Object.class, Object.class, Collections.singletonList(new g(Object.class, Object.class, Object.class, Collections.emptyList(), new bx8(), null)), null);
    private final so a = new so();
    private final AtomicReference b = new AtomicReference();

    private cx4 b(Class cls, Class cls2, Class cls3) {
        cx4 cx4Var = (cx4) this.b.getAndSet(null);
        if (cx4Var == null) {
            cx4Var = new cx4();
        }
        cx4Var.a(cls, cls2, cls3);
        return cx4Var;
    }

    public o a(Class cls, Class cls2, Class cls3) {
        o oVar;
        cx4 b = b(cls, cls2, cls3);
        synchronized (this.a) {
            oVar = (o) this.a.get(b);
        }
        this.b.set(b);
        return oVar;
    }

    public boolean c(o oVar) {
        return c.equals(oVar);
    }

    public void d(Class cls, Class cls2, Class cls3, o oVar) {
        synchronized (this.a) {
            so soVar = this.a;
            cx4 cx4Var = new cx4(cls, cls2, cls3);
            if (oVar == null) {
                oVar = c;
            }
            soVar.put(cx4Var, oVar);
        }
    }
}
