package com.google.android.gms.measurement.internal;

import defpackage.kmf;
import defpackage.rxf;
import defpackage.so;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class ea {
    private String a;
    private boolean b;
    private com.google.android.gms.internal.measurement.y0 c;
    private BitSet d;
    private BitSet e;
    private Map f;
    private Map g;
    final /* synthetic */ b h;

    /* synthetic */ ea(b bVar, String str, rxf rxfVar) {
        this.h = bVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new so();
        this.g = new so();
    }

    final com.google.android.gms.internal.measurement.f0 a(int i) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.e0 s = com.google.android.gms.internal.measurement.f0.s();
        s.m(i);
        s.o(this.b);
        com.google.android.gms.internal.measurement.y0 y0Var = this.c;
        if (y0Var != null) {
            s.p(y0Var);
        }
        com.google.android.gms.internal.measurement.x0 w = com.google.android.gms.internal.measurement.y0.w();
        w.n(t9.G(this.d));
        w.p(t9.G(this.e));
        Map map = this.f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f.get(num);
                if (l != null) {
                    com.google.android.gms.internal.measurement.g0 t = com.google.android.gms.internal.measurement.h0.t();
                    t.n(intValue);
                    t.m(l.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.h0) t.i());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            w.m(arrayList);
        }
        Map map2 = this.g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.g.keySet()) {
                com.google.android.gms.internal.measurement.z0 u = com.google.android.gms.internal.measurement.a1.u();
                u.n(num2.intValue());
                List list2 = (List) this.g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    u.m(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.a1) u.i());
            }
            list = arrayList3;
        }
        w.o(list);
        s.n(w);
        return (com.google.android.gms.internal.measurement.f0) s.i();
    }

    final void c(ha haVar) {
        int a = haVar.a();
        Boolean bool = haVar.c;
        if (bool != null) {
            this.e.set(a, bool.booleanValue());
        }
        Boolean bool2 = haVar.d;
        if (bool2 != null) {
            this.d.set(a, bool2.booleanValue());
        }
        if (haVar.e != null) {
            Map map = this.f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = haVar.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (haVar.f != null) {
            Map map2 = this.g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.g.put(valueOf2, list);
            }
            if (haVar.c()) {
                list.clear();
            }
            kmf.b();
            g y = this.h.a.y();
            String str = this.a;
            l3 l3Var = m3.Z;
            if (y.A(str, l3Var) && haVar.b()) {
                list.clear();
            }
            kmf.b();
            if (!this.h.a.y().A(this.a, l3Var)) {
                list.add(Long.valueOf(haVar.f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(haVar.f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    /* synthetic */ ea(b bVar, String str, com.google.android.gms.internal.measurement.y0 y0Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, rxf rxfVar) {
        this.h = bVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new so();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = y0Var;
    }
}
