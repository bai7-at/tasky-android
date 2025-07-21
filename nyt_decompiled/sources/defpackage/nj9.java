package defpackage;

import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.c;
import com.nytimes.android.logging.NYTLogger;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class nj9 {
    private final mj9 a;

    public nj9(mj9 mj9Var) {
        zq3.h(mj9Var, "workManager");
        this.a = mj9Var;
    }

    private final c b(Class cls, Map map, List list, gv0 gv0Var, long j) {
        Data.a aVar = new Data.a();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Byte) {
                    aVar.g(str, ((Number) value).byteValue());
                } else if (value instanceof byte[]) {
                    aVar.h(str, (byte[]) value);
                } else if (value instanceof String) {
                    aVar.p(str, (String) value);
                } else {
                    if (value instanceof Object[]) {
                        for (Object obj : (Object[]) value) {
                            if (obj instanceof String) {
                            }
                        }
                        aVar.q(str, (String[]) value);
                    }
                    if (value instanceof Integer) {
                        aVar.l(str, ((Number) value).intValue());
                    } else if (value instanceof int[]) {
                        aVar.m(str, (int[]) value);
                    } else if (value instanceof Long) {
                        aVar.n(str, ((Number) value).longValue());
                    } else if (value instanceof long[]) {
                        aVar.o(str, (long[]) value);
                    } else if (value instanceof Boolean) {
                        aVar.e(str, ((Boolean) value).booleanValue());
                    } else if (value instanceof boolean[]) {
                        aVar.f(str, (boolean[]) value);
                    } else if (value instanceof Double) {
                        aVar.j(str, ((Number) value).doubleValue());
                    } else if (value instanceof double[]) {
                        aVar.k(str, (double[]) value);
                    } else {
                        NYTLogger.g("Cannot put key=" + str + " with value of type " + value.getClass(), new Object[0]);
                    }
                }
            }
        }
        Data a = aVar.a();
        c.a aVar2 = new c.a(cls);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            aVar2.a((String) it2.next());
        }
        aVar2.a("RequiredNetwork: " + gv0Var.f());
        String date = new Date(System.currentTimeMillis() + j).toString();
        zq3.g(date, "toString(...)");
        return (c) ((c.a) ((c.a) ((c.a) ((c.a) ((c.a) aVar2.a(date)).a("delay " + j)).l(j, TimeUnit.MILLISECONDS)).m(a)).j(gv0Var)).b();
    }

    private final boolean c(String str) {
        Object obj = this.a.h(str).get();
        zq3.g(obj, "get(...)");
        Iterable iterable = (Iterable) obj;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (!((WorkInfo) it2.next()).a().isFinished()) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str) {
        zq3.h(str, "tag");
        this.a.a(str);
    }

    public final void d(Class cls, String str, long j, gv0 gv0Var) {
        zq3.h(cls, "workerClass");
        zq3.h(str, "uniqueWorkName");
        zq3.h(gv0Var, "constraints");
        if (c(str)) {
            return;
        }
        f(cls, str, j, gv0Var);
    }

    public final Pair e(Class cls, String str, long j, Map map, gv0 gv0Var) {
        zq3.h(cls, "workerClass");
        zq3.h(str, "tag");
        zq3.h(gv0Var, "constraints");
        c b = b(cls, map, i.e(str), gv0Var, j);
        return du8.a(this.a.c(b), b.a());
    }

    public final Pair f(Class cls, String str, long j, gv0 gv0Var) {
        zq3.h(cls, "workerClass");
        zq3.h(str, "uniqueWorkName");
        zq3.h(gv0Var, "constraints");
        c b = b(cls, null, i.e(str), gv0Var, j);
        return du8.a(this.a.e(str, ExistingWorkPolicy.REPLACE, b), b.a());
    }
}
