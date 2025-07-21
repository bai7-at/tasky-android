package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class l1a implements caa, h5a {
    protected final String a;
    protected final Map b = new HashMap();

    public l1a(String str) {
        this.a = str;
    }

    @Override // defpackage.h5a
    public final boolean W(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.h5a
    public final void Y(String str, caa caaVar) {
        Map map = this.b;
        if (caaVar == null) {
            map.remove(str);
        } else {
            map.put(str, caaVar);
        }
    }

    @Override // defpackage.caa
    public final caa a(String str, xhe xheVar, List list) {
        return "toString".equals(str) ? new eda(this.a) : s2a.a(this, new eda(str), xheVar, list);
    }

    public abstract caa b(xhe xheVar, List list);

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1a)) {
            return false;
        }
        l1a l1aVar = (l1a) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(l1aVar.a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.h5a
    public final caa n(String str) {
        return this.b.containsKey(str) ? (caa) this.b.get(str) : caa.T;
    }

    @Override // defpackage.caa
    public caa zzd() {
        return this;
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // defpackage.caa
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.caa
    public final String zzi() {
        return this.a;
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return s2a.b(this.b);
    }
}
