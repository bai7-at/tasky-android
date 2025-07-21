package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class qx9 implements Iterable, caa, h5a {
    final SortedMap a;
    final Map b;

    public qx9() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    @Override // defpackage.h5a
    public final boolean W(String str) {
        return "length".equals(str) || this.b.containsKey(str);
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
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? rma.a(str, this, xheVar, list) : s2a.a(this, new eda(str), xheVar, list);
    }

    public final int c() {
        return this.a.size();
    }

    public final int e() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.a.lastKey()).intValue() + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qx9)) {
            return false;
        }
        qx9 qx9Var = (qx9) obj;
        if (e() != qx9Var.e()) {
            return false;
        }
        if (this.a.isEmpty()) {
            return qx9Var.a.isEmpty();
        }
        for (int intValue = ((Integer) this.a.firstKey()).intValue(); intValue <= ((Integer) this.a.lastKey()).intValue(); intValue++) {
            if (!f(intValue).equals(qx9Var.f(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final caa f(int i) {
        caa caaVar;
        if (i < e()) {
            return (!u(i) || (caaVar = (caa) this.a.get(Integer.valueOf(i))) == null) ? caa.T : caaVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String g(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            for (int i = 0; i < e(); i++) {
                caa f = f(i);
                sb.append(str);
                if (!(f instanceof qda) && !(f instanceof s7a)) {
                    sb.append(f.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aw9(this);
    }

    public final Iterator j() {
        return this.a.keySet().iterator();
    }

    public final List k() {
        ArrayList arrayList = new ArrayList(e());
        for (int i = 0; i < e(); i++) {
            arrayList.add(f(i));
        }
        return arrayList;
    }

    @Override // defpackage.h5a
    public final caa n(String str) {
        caa caaVar;
        return "length".equals(str) ? new q0a(Double.valueOf(e())) : (!W(str) || (caaVar = (caa) this.b.get(str)) == null) ? caa.T : caaVar;
    }

    public final void o() {
        this.a.clear();
    }

    public final void p(int i, caa caaVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        }
        if (i >= e()) {
            t(i, caaVar);
            return;
        }
        for (int intValue = ((Integer) this.a.lastKey()).intValue(); intValue >= i; intValue--) {
            SortedMap sortedMap = this.a;
            Integer valueOf = Integer.valueOf(intValue);
            caa caaVar2 = (caa) sortedMap.get(valueOf);
            if (caaVar2 != null) {
                t(intValue + 1, caaVar2);
                this.a.remove(valueOf);
            }
        }
        t(i, caaVar);
    }

    public final void q(int i) {
        int intValue = ((Integer) this.a.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.a.remove(Integer.valueOf(i));
        if (i == intValue) {
            SortedMap sortedMap = this.a;
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            this.a.put(valueOf, caa.T);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.a.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.a;
            Integer valueOf2 = Integer.valueOf(i);
            caa caaVar = (caa) sortedMap2.get(valueOf2);
            if (caaVar != null) {
                this.a.put(Integer.valueOf(i - 1), caaVar);
                this.a.remove(valueOf2);
            }
        }
    }

    public final void t(int i, caa caaVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        if (caaVar == null) {
            this.a.remove(Integer.valueOf(i));
        } else {
            this.a.put(Integer.valueOf(i), caaVar);
        }
    }

    public final String toString() {
        return g(",");
    }

    public final boolean u(int i) {
        if (i >= 0 && i <= ((Integer) this.a.lastKey()).intValue()) {
            return this.a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    @Override // defpackage.caa
    public final caa zzd() {
        qx9 qx9Var = new qx9();
        for (Map.Entry entry : this.a.entrySet()) {
            if (entry.getValue() instanceof h5a) {
                qx9Var.a.put((Integer) entry.getKey(), (caa) entry.getValue());
            } else {
                qx9Var.a.put((Integer) entry.getKey(), ((caa) entry.getValue()).zzd());
            }
        }
        return qx9Var;
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // defpackage.caa
    public final Double zzh() {
        return this.a.size() == 1 ? f(0).zzh() : this.a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // defpackage.caa
    public final String zzi() {
        return g(",");
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return new lu9(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public qx9(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                t(i, (caa) list.get(i));
            }
        }
    }
}
