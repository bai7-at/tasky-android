package com.google.android.exoplayer2.extractor.flv;

import defpackage.rw1;
import defpackage.yo5;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class c extends TagPayloadReader {
    private long b;
    private long[] c;
    private long[] d;

    public c() {
        super(new rw1());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    private static Boolean g(yo5 yo5Var) {
        return Boolean.valueOf(yo5Var.H() == 1);
    }

    private static Object h(yo5 yo5Var, int i) {
        if (i == 0) {
            return j(yo5Var);
        }
        if (i == 1) {
            return g(yo5Var);
        }
        if (i == 2) {
            return n(yo5Var);
        }
        if (i == 3) {
            return l(yo5Var);
        }
        if (i == 8) {
            return k(yo5Var);
        }
        if (i == 10) {
            return m(yo5Var);
        }
        if (i != 11) {
            return null;
        }
        return i(yo5Var);
    }

    private static Date i(yo5 yo5Var) {
        Date date = new Date((long) j(yo5Var).doubleValue());
        yo5Var.V(2);
        return date;
    }

    private static Double j(yo5 yo5Var) {
        return Double.valueOf(Double.longBitsToDouble(yo5Var.A()));
    }

    private static HashMap k(yo5 yo5Var) {
        int L = yo5Var.L();
        HashMap hashMap = new HashMap(L);
        for (int i = 0; i < L; i++) {
            String n = n(yo5Var);
            Object h = h(yo5Var, o(yo5Var));
            if (h != null) {
                hashMap.put(n, h);
            }
        }
        return hashMap;
    }

    private static HashMap l(yo5 yo5Var) {
        HashMap hashMap = new HashMap();
        while (true) {
            String n = n(yo5Var);
            int o = o(yo5Var);
            if (o == 9) {
                return hashMap;
            }
            Object h = h(yo5Var, o);
            if (h != null) {
                hashMap.put(n, h);
            }
        }
    }

    private static ArrayList m(yo5 yo5Var) {
        int L = yo5Var.L();
        ArrayList arrayList = new ArrayList(L);
        for (int i = 0; i < L; i++) {
            Object h = h(yo5Var, o(yo5Var));
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    private static String n(yo5 yo5Var) {
        int N = yo5Var.N();
        int f = yo5Var.f();
        yo5Var.V(N);
        return new String(yo5Var.e(), f, N);
    }

    private static int o(yo5 yo5Var) {
        return yo5Var.H();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(yo5 yo5Var) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(yo5 yo5Var, long j) {
        if (o(yo5Var) != 2 || !"onMetaData".equals(n(yo5Var)) || yo5Var.a() == 0 || o(yo5Var) != 8) {
            return false;
        }
        HashMap k = k(yo5Var);
        Object obj = k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k.get("keyframes");
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
        return false;
    }

    public long d() {
        return this.b;
    }

    public long[] e() {
        return this.d;
    }

    public long[] f() {
        return this.c;
    }
}
