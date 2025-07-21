package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.datadog.opentracing.PendingTrace;
import com.datadog.opentracing.a;
import com.datadog.opentracing.b;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class z51 implements wx7 {
    private static final Map s = Collections.emptyMap();
    private final b a;
    private final PendingTrace b;
    private final Map c;
    private final BigInteger d;
    private final BigInteger e;
    private final BigInteger f;
    private final Map g;
    private volatile String h;
    private volatile String i;
    private volatile String j;
    private volatile String k;
    private volatile boolean l;
    private boolean m;
    private final String n;
    private final AtomicReference o;
    private final String p;
    private final long q;
    private final Map r;

    public z51(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2, String str3, int i, String str4, Map map, boolean z, String str5, Map map2, PendingTrace pendingTrace, b bVar, Map map3) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.g = concurrentHashMap;
        this.m = false;
        this.o = new AtomicReference();
        String name = Thread.currentThread().getName();
        this.p = name;
        long id = Thread.currentThread().getId();
        this.q = id;
        this.a = bVar;
        this.b = pendingTrace;
        this.d = bigInteger;
        this.e = bigInteger2;
        this.f = bigInteger3;
        if (map == null) {
            this.c = new ConcurrentHashMap(0);
        } else {
            this.c = new ConcurrentHashMap(map);
        }
        if (map2 != null) {
            concurrentHashMap.putAll(map2);
        }
        this.r = map3;
        w(str);
        this.j = str2;
        this.i = str3;
        this.l = z;
        this.k = str5;
        this.n = str4;
        if (i != Integer.MIN_VALUE) {
            v(i);
        }
        if (str4 != null) {
            concurrentHashMap.put("_dd.origin", str4);
        }
        concurrentHashMap.put("thread.name", name);
        concurrentHashMap.put("thread.id", Long.valueOf(id));
    }

    @Override // defpackage.wx7
    public String a() {
        return this.e.toString();
    }

    public Iterable b() {
        return this.c.entrySet();
    }

    public Map c() {
        return this.c;
    }

    public boolean d() {
        return this.l;
    }

    public Map e() {
        Map map = (Map) this.o.get();
        return map == null ? s : map;
    }

    public String f() {
        return this.j;
    }

    public String g() {
        a p = this.b.p();
        return p != null ? p.f().n : this.n;
    }

    public BigInteger h() {
        return this.f;
    }

    public String i() {
        return p() ? this.i : this.j;
    }

    public int j() {
        a p = this.b.p();
        if (p != null && p.f() != this) {
            return p.f().j();
        }
        Number number = (Number) e().get("_sampling_priority_v1");
        return number == null ? RecyclerView.UNDEFINED_DURATION : number.intValue();
    }

    public String k() {
        return this.h;
    }

    public BigInteger l() {
        return this.e;
    }

    public synchronized Map m() {
        return Collections.unmodifiableMap(this.g);
    }

    public PendingTrace n() {
        return this.b;
    }

    public BigInteger o() {
        return this.d;
    }

    public boolean p() {
        return (this.i == null || this.i.isEmpty()) ? false : true;
    }

    public boolean q() {
        boolean z;
        a p = this.b.p();
        if (p != null && p.f() != this) {
            return p.f().q();
        }
        synchronized (this) {
            try {
                if (e().get("_sampling_priority_v1") != null && !this.m) {
                    this.m = true;
                }
                z = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void r(boolean z) {
        this.l = z;
    }

    public void s(String str, Number number) {
        if (this.o.get() == null) {
            kz4.a(this.o, null, new ConcurrentHashMap());
        }
        if (number instanceof Float) {
            ((Map) this.o.get()).put(str, Double.valueOf(number.doubleValue()));
        } else {
            ((Map) this.o.get()).put(str, number);
        }
    }

    public void t(String str) {
        this.j = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DDSpan [ t_id=");
        sb.append(this.d);
        sb.append(", s_id=");
        sb.append(this.e);
        sb.append(", p_id=");
        sb.append(this.f);
        sb.append("] trace=");
        sb.append(k());
        sb.append("/");
        sb.append(f());
        sb.append("/");
        sb.append(i());
        sb.append(" metrics=");
        sb.append(new TreeMap(e()));
        if (this.l) {
            sb.append(" *errored*");
        }
        sb.append(" tags=");
        sb.append(new TreeMap(this.g));
        return sb.toString();
    }

    public void u(String str) {
        this.i = str;
    }

    public boolean v(int i) {
        a p;
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        PendingTrace pendingTrace = this.b;
        if (pendingTrace != null && (p = pendingTrace.p()) != null && p.f() != this) {
            return p.f().v(i);
        }
        synchronized (this) {
            try {
                if (this.m) {
                    return false;
                }
                s("_sampling_priority_v1", Integer.valueOf(i));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(String str) {
        if (this.r.containsKey(str)) {
            this.h = (String) this.r.get(str);
        } else {
            this.h = str;
        }
    }

    public synchronized void x(String str, Object obj) {
        if (obj != null) {
            try {
                if (!(obj instanceof String) || !((String) obj).isEmpty()) {
                    List C = this.a.C(str);
                    boolean z = true;
                    if (C != null) {
                        Iterator it2 = C.iterator();
                        while (it2.hasNext()) {
                            try {
                                z &= ((d1) it2.next()).c(this, str, obj);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (z) {
                        this.g.put(str, obj);
                    }
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g.remove(str);
    }
}
