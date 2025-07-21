package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class fkb implements Iterable {
    private final List a = new ArrayList();

    final ekb a(wib wibVar) {
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            ekb ekbVar = (ekb) it2.next();
            if (ekbVar.c == wibVar) {
                return ekbVar;
            }
        }
        return null;
    }

    public final void c(ekb ekbVar) {
        this.a.add(ekbVar);
    }

    public final void e(ekb ekbVar) {
        this.a.remove(ekbVar);
    }

    public final boolean f(wib wibVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            ekb ekbVar = (ekb) it2.next();
            if (ekbVar.c == wibVar) {
                arrayList.add(ekbVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((ekb) it3.next()).d.l();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
