package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class iz9 extends jz9 {
    private long b;
    private long[] c;
    private long[] d;

    public iz9() {
        super(new mv9());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    private static Double g(b9e b9eVar) {
        return Double.valueOf(Double.longBitsToDouble(b9eVar.I()));
    }

    private static Object h(b9e b9eVar, int i) {
        if (i == 0) {
            return g(b9eVar);
        }
        if (i == 1) {
            return Boolean.valueOf(b9eVar.B() == 1);
        }
        if (i == 2) {
            return i(b9eVar);
        }
        if (i != 3) {
            if (i == 8) {
                return j(b9eVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) g(b9eVar).doubleValue());
                b9eVar.l(2);
                return date;
            }
            int E = b9eVar.E();
            ArrayList arrayList = new ArrayList(E);
            for (int i2 = 0; i2 < E; i2++) {
                Object h = h(b9eVar, b9eVar.B());
                if (h != null) {
                    arrayList.add(h);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String i3 = i(b9eVar);
            int B = b9eVar.B();
            if (B == 9) {
                return hashMap;
            }
            Object h2 = h(b9eVar, B);
            if (h2 != null) {
                hashMap.put(i3, h2);
            }
        }
    }

    private static String i(b9e b9eVar) {
        int F = b9eVar.F();
        int s = b9eVar.s();
        b9eVar.l(F);
        return new String(b9eVar.m(), s, F);
    }

    private static HashMap j(b9e b9eVar) {
        int E = b9eVar.E();
        HashMap hashMap = new HashMap(E);
        for (int i = 0; i < E; i++) {
            String i2 = i(b9eVar);
            Object h = h(b9eVar, b9eVar.B());
            if (h != null) {
                hashMap.put(i2, h);
            }
        }
        return hashMap;
    }

    @Override // defpackage.jz9
    protected final boolean a(b9e b9eVar) {
        return true;
    }

    @Override // defpackage.jz9
    protected final boolean b(b9e b9eVar, long j) {
        if (b9eVar.B() == 2 && "onMetaData".equals(i(b9eVar)) && b9eVar.q() != 0 && b9eVar.B() == 8) {
            HashMap j2 = j(b9eVar);
            Object obj = j2.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = j2.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.c = new long[size];
                    this.d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.c = new long[0];
                            this.d = new long[0];
                            break;
                        }
                        this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.b;
    }

    public final long[] e() {
        return this.d;
    }

    public final long[] f() {
        return this.c;
    }
}
