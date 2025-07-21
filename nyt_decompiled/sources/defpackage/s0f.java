package defpackage;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class s0f {
    public static double a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static int b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static int c(xhe xheVar) {
        int b = b(xheVar.d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (b > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        xheVar.g("runtime.counter", new q0a(Double.valueOf(b)));
        return b;
    }

    public static long d(double d) {
        return b(d) & 4294967295L;
    }

    public static zzbl e(String str) {
        zzbl zzblVar = null;
        if (str != null && !str.isEmpty()) {
            zzblVar = zzbl.zza(Integer.parseInt(str));
        }
        if (zzblVar != null) {
            return zzblVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(caa caaVar) {
        if (caa.U.equals(caaVar)) {
            return null;
        }
        if (caa.T.equals(caaVar)) {
            return "";
        }
        if (caaVar instanceof m6a) {
            return g((m6a) caaVar);
        }
        if (!(caaVar instanceof qx9)) {
            return !caaVar.zzh().isNaN() ? caaVar.zzh() : caaVar.zzi();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((qx9) caaVar).iterator();
        while (it2.hasNext()) {
            Object f = f((caa) it2.next());
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    public static Map g(m6a m6aVar) {
        HashMap hashMap = new HashMap();
        for (String str : m6aVar.b()) {
            Object f = f(m6aVar.n(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    public static void h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(caa caaVar) {
        if (caaVar == null) {
            return false;
        }
        Double zzh = caaVar.zzh();
        return !zzh.isNaN() && zzh.doubleValue() >= 0.0d && zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())));
    }

    public static boolean l(caa caaVar, caa caaVar2) {
        if (!caaVar.getClass().equals(caaVar2.getClass())) {
            return false;
        }
        if ((caaVar instanceof qda) || (caaVar instanceof s7a)) {
            return true;
        }
        if (!(caaVar instanceof q0a)) {
            return caaVar instanceof eda ? caaVar.zzi().equals(caaVar2.zzi()) : caaVar instanceof bz9 ? caaVar.zzg().equals(caaVar2.zzg()) : caaVar == caaVar2;
        }
        if (Double.isNaN(caaVar.zzh().doubleValue()) || Double.isNaN(caaVar2.zzh().doubleValue())) {
            return false;
        }
        return caaVar.zzh().equals(caaVar2.zzh());
    }
}
