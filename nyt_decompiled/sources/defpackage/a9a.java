package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class a9a extends l1a implements h5a {
    protected final List c;
    protected final List d;
    protected xhe e;

    private a9a(a9a a9aVar) {
        super(a9aVar.a);
        ArrayList arrayList = new ArrayList(a9aVar.c.size());
        this.c = arrayList;
        arrayList.addAll(a9aVar.c);
        ArrayList arrayList2 = new ArrayList(a9aVar.d.size());
        this.d = arrayList2;
        arrayList2.addAll(a9aVar.d);
        this.e = a9aVar.e;
    }

    @Override // defpackage.l1a
    public final caa b(xhe xheVar, List list) {
        xhe a = this.e.a();
        for (int i = 0; i < this.c.size(); i++) {
            if (i < list.size()) {
                a.e((String) this.c.get(i), xheVar.b((caa) list.get(i)));
            } else {
                a.e((String) this.c.get(i), caa.T);
            }
        }
        for (caa caaVar : this.d) {
            caa b = a.b(caaVar);
            if (b instanceof waa) {
                b = a.b(caaVar);
            }
            if (b instanceof d0a) {
                return ((d0a) b).b();
            }
        }
        return caa.T;
    }

    @Override // defpackage.l1a, defpackage.caa
    public final caa zzd() {
        return new a9a(this);
    }

    public a9a(String str, List list, List list2, xhe xheVar) {
        super(str);
        this.c = new ArrayList();
        this.e = xheVar;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.c.add(((caa) it2.next()).zzi());
            }
        }
        this.d = new ArrayList(list2);
    }
}
