package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class sja {
    int b;
    private final Object a = new Object();
    private final List c = new LinkedList();

    public final rja a(boolean z) {
        synchronized (this.a) {
            try {
                rja rjaVar = null;
                if (this.c.isEmpty()) {
                    fgb.b("Queue empty");
                    return null;
                }
                int i = 0;
                if (this.c.size() < 2) {
                    rja rjaVar2 = (rja) this.c.get(0);
                    if (z) {
                        this.c.remove(0);
                    } else {
                        rjaVar2.i();
                    }
                    return rjaVar2;
                }
                int i2 = RecyclerView.UNDEFINED_DURATION;
                int i3 = 0;
                for (rja rjaVar3 : this.c) {
                    int b = rjaVar3.b();
                    if (b > i2) {
                        i = i3;
                    }
                    int i4 = b > i2 ? b : i2;
                    if (b > i2) {
                        rjaVar = rjaVar3;
                    }
                    i3++;
                    i2 = i4;
                }
                this.c.remove(i);
                return rjaVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(rja rjaVar) {
        synchronized (this.a) {
            try {
                if (this.c.size() >= 10) {
                    fgb.b("Queue is full, current size = " + this.c.size());
                    this.c.remove(0);
                }
                int i = this.b;
                this.b = i + 1;
                rjaVar.j(i);
                rjaVar.n();
                this.c.add(rjaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(rja rjaVar) {
        synchronized (this.a) {
            try {
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    rja rjaVar2 = (rja) it2.next();
                    if (dyf.q().i().zzN()) {
                        if (!dyf.q().i().zzO() && !rjaVar.equals(rjaVar2) && rjaVar2.f().equals(rjaVar.f())) {
                            it2.remove();
                            return true;
                        }
                    } else if (!rjaVar.equals(rjaVar2) && rjaVar2.d().equals(rjaVar.d())) {
                        it2.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(rja rjaVar) {
        synchronized (this.a) {
            try {
                return this.c.contains(rjaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
