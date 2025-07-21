package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class m6a implements caa, h5a {
    final Map a = new HashMap();

    @Override // defpackage.h5a
    public final boolean W(String str) {
        return this.a.containsKey(str);
    }

    @Override // defpackage.h5a
    public final void Y(String str, caa caaVar) {
        Map map = this.a;
        if (caaVar == null) {
            map.remove(str);
        } else {
            map.put(str, caaVar);
        }
    }

    @Override // defpackage.caa
    public caa a(String str, xhe xheVar, List list) {
        return "toString".equals(str) ? new eda(toString()) : s2a.a(this, new eda(str), xheVar, list);
    }

    public final List b() {
        return new ArrayList(this.a.keySet());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m6a) {
            return this.a.equals(((m6a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.h5a
    public final caa n(String str) {
        return this.a.containsKey(str) ? (caa) this.a.get(str) : caa.T;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.caa
    public final caa zzd() {
        m6a m6aVar = new m6a();
        for (Map.Entry entry : this.a.entrySet()) {
            if (entry.getValue() instanceof h5a) {
                m6aVar.a.put((String) entry.getKey(), (caa) entry.getValue());
            } else {
                m6aVar.a.put((String) entry.getKey(), ((caa) entry.getValue()).zzd());
            }
        }
        return m6aVar;
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
        return "[object Object]";
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return s2a.b(this.a);
    }
}
