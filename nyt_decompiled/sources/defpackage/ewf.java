package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class ewf {
    public final int a;
    public final zzf b;
    private final CopyOnWriteArrayList c;

    private ewf(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzf zzfVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = zzfVar;
    }

    public final ewf a(int i, zzf zzfVar) {
        return new ewf(this.c, 0, zzfVar);
    }

    public final void b(Handler handler, fwf fwfVar) {
        this.c.add(new dwf(handler, fwfVar));
    }

    public final void c(fwf fwfVar) {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            dwf dwfVar = (dwf) it2.next();
            if (dwfVar.b == fwfVar) {
                this.c.remove(dwfVar);
            }
        }
    }

    public ewf() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
