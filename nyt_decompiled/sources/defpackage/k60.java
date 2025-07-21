package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public final class k60 {
    private final Map a;
    private final Map b;
    private final Map c;
    private final Random d;

    public k60() {
        this(new Random());
    }

    private static void b(Object obj, long j, Map map) {
        if (map.containsKey(obj)) {
            j = Math.max(j, ((Long) z19.j((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j));
    }

    private List c(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.a);
        h(elapsedRealtime, this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            i60 i60Var = (i60) list.get(i);
            if (!this.a.containsKey(i60Var.b) && !this.b.containsKey(Integer.valueOf(i60Var.c))) {
                arrayList.add(i60Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(i60 i60Var, i60 i60Var2) {
        int compare = Integer.compare(i60Var.c, i60Var2.c);
        return compare != 0 ? compare : i60Var.b.compareTo(i60Var2.b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(((i60) list.get(i)).c));
        }
        return hashSet.size();
    }

    private static void h(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    private i60 k(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((i60) list.get(i2)).d;
        }
        int nextInt = this.d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i60 i60Var = (i60) list.get(i4);
            i3 += i60Var.d;
            if (nextInt < i3) {
                return i60Var;
            }
        }
        return (i60) j.e(list);
    }

    public void e(i60 i60Var, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        b(i60Var.b, elapsedRealtime, this.a);
        int i = i60Var.c;
        if (i != Integer.MIN_VALUE) {
            b(Integer.valueOf(i), elapsedRealtime, this.b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List c = c(list);
        for (int i = 0; i < c.size(); i++) {
            hashSet.add(Integer.valueOf(((i60) c.get(i)).c));
        }
        return hashSet.size();
    }

    public void i() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    public i60 j(List list) {
        List c = c(list);
        if (c.size() < 2) {
            return (i60) j.d(c, null);
        }
        Collections.sort(c, new Comparator() { // from class: j60
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d;
                d = k60.d((i60) obj, (i60) obj2);
                return d;
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = ((i60) c.get(0)).c;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            i60 i60Var = (i60) c.get(i2);
            if (i == i60Var.c) {
                arrayList.add(new Pair(i60Var.b, Integer.valueOf(i60Var.d)));
                i2++;
            } else if (arrayList.size() == 1) {
                return (i60) c.get(0);
            }
        }
        i60 i60Var2 = (i60) this.c.get(arrayList);
        if (i60Var2 != null) {
            return i60Var2;
        }
        i60 k = k(c.subList(0, arrayList.size()));
        this.c.put(arrayList, k);
        return k;
    }

    k60(Random random) {
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }
}
