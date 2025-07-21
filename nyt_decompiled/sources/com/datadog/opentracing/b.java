package com.datadog.opentracing;

import android.os.StrictMode;
import com.datadog.legacy.trace.api.Config;
import defpackage.ac7;
import defpackage.cp8;
import defpackage.d1;
import defpackage.dj8;
import defpackage.dp2;
import defpackage.fa4;
import defpackage.fj8;
import defpackage.g84;
import defpackage.gi1;
import defpackage.hp8;
import defpackage.lh4;
import defpackage.qa3;
import defpackage.ql9;
import defpackage.qy4;
import defpackage.s51;
import defpackage.tx7;
import defpackage.u51;
import defpackage.uf8;
import defpackage.ve3;
import defpackage.wx7;
import defpackage.x51;
import defpackage.x72;
import defpackage.y26;
import defpackage.yb7;
import defpackage.z51;
import defpackage.z77;
import defpackage.zb7;
import defpackage.zx0;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes2.dex */
public abstract class b implements hp8, Closeable {
    public static final BigInteger s;
    public static final BigInteger t;
    public static final BigInteger u;
    final String a;
    final ql9 b;
    final z77 c;
    final ac7 d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final int h;
    private final Thread i;
    private final Map j;
    private final SortedSet k;
    private final qa3.d l;
    private final qa3.c m;
    private final ve3 n;
    private final Random r;

    class a implements Comparator {
        a() {
        }

        public int a(cp8 cp8Var, cp8 cp8Var2) {
            return Integer.compare(cp8Var.a(), cp8Var2.a());
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            lh4.a(obj);
            lh4.a(obj2);
            return a(null, null);
        }
    }

    /* renamed from: com.datadog.opentracing.b$b, reason: collision with other inner class name */
    public class C0161b implements hp8.a {
        private final ac7 b;
        private final String c;
        private final Map d;
        private long e;
        private wx7 f;
        private String g;
        private String h;
        private String i;
        private boolean j;
        private String k;
        private boolean l = false;
        private g84 m = new gi1();

        public C0161b(String str, ac7 ac7Var) {
            this.d = new LinkedHashMap(b.this.f);
            this.c = str;
            this.b = ac7Var;
        }

        private z51 e() {
            BigInteger bigInteger;
            int i;
            BigInteger bigInteger2;
            Map map;
            String str;
            String str2;
            Map map2;
            BigInteger bigInteger3;
            BigInteger bigInteger4;
            int i2;
            PendingTrace pendingTrace;
            tx7 n;
            BigInteger f = f();
            wx7 wx7Var = this.f;
            if (wx7Var == null && !this.l && (n = this.b.n()) != null) {
                wx7Var = n.f();
            }
            if (wx7Var instanceof z51) {
                z51 z51Var = (z51) wx7Var;
                bigInteger3 = z51Var.o();
                BigInteger l = z51Var.l();
                Map c = z51Var.c();
                PendingTrace n2 = z51Var.n();
                if (this.g == null) {
                    this.g = z51Var.k();
                }
                i2 = Integer.MIN_VALUE;
                bigInteger4 = l;
                map2 = c;
                pendingTrace = n2;
                str2 = null;
            } else {
                if (wx7Var instanceof x72) {
                    x72 x72Var = (x72) wx7Var;
                    bigInteger2 = x72Var.g();
                    bigInteger = x72Var.f();
                    i = x72Var.e();
                    map = x72Var.d();
                } else {
                    BigInteger g = g();
                    bigInteger = BigInteger.ZERO;
                    i = Integer.MIN_VALUE;
                    bigInteger2 = g;
                    map = null;
                }
                if (wx7Var instanceof uf8) {
                    uf8 uf8Var = (uf8) wx7Var;
                    this.d.putAll(uf8Var.c());
                    str = uf8Var.b();
                } else {
                    str = this.i;
                }
                this.d.putAll(b.this.e);
                PendingTrace pendingTrace2 = new PendingTrace(b.this, bigInteger2);
                str2 = str;
                map2 = map;
                bigInteger3 = bigInteger2;
                bigInteger4 = bigInteger;
                i2 = i;
                pendingTrace = pendingTrace2;
            }
            if (this.g == null) {
                this.g = b.this.a;
            }
            String str3 = this.c;
            if (str3 == null) {
                str3 = this.h;
            }
            String str4 = str3;
            String str5 = this.g;
            String str6 = this.h;
            boolean z = this.j;
            String str7 = this.k;
            Map map3 = this.d;
            b bVar = b.this;
            z51 z51Var2 = r13;
            z51 z51Var3 = new z51(bigInteger3, f, bigInteger4, str5, str4, str6, i2, str2, map2, z, str7, map3, pendingTrace, bVar, bVar.g);
            for (Map.Entry entry : this.d.entrySet()) {
                if (entry.getValue() == null) {
                    z51Var2.x((String) entry.getKey(), null);
                } else {
                    z51 z51Var4 = z51Var2;
                    List C = b.this.C((String) entry.getKey());
                    boolean z2 = true;
                    if (C != null) {
                        Iterator it2 = C.iterator();
                        while (it2.hasNext()) {
                            try {
                                z2 &= ((d1) it2.next()).c(z51Var4, (String) entry.getKey(), entry.getValue());
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (!z2) {
                        z51Var4.x((String) entry.getKey(), null);
                    }
                    z51Var2 = z51Var4;
                }
            }
            return z51Var2;
        }

        private BigInteger f() {
            StringCachingBigInteger stringCachingBigInteger;
            do {
                synchronized (b.this.r) {
                    stringCachingBigInteger = new StringCachingBigInteger(63, b.this.r);
                }
            } while (stringCachingBigInteger.signum() == 0);
            return stringCachingBigInteger;
        }

        private BigInteger g() {
            BigInteger bigInteger;
            do {
                synchronized (b.this.n) {
                    bigInteger = new BigInteger(b.this.n.c().b(), 16);
                }
            } while (bigInteger.signum() == 0);
            return bigInteger;
        }

        private tx7 h() {
            return new com.datadog.opentracing.a(this.e, e(), this.m);
        }

        private C0161b k(String str, Object obj) {
            if (obj == null || ((obj instanceof String) && ((String) obj).isEmpty())) {
                this.d.remove(str);
            } else {
                this.d.put(str, obj);
            }
            return this;
        }

        @Override // hp8.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0161b a(tx7 tx7Var) {
            return b(tx7Var == null ? null : tx7Var.f());
        }

        @Override // hp8.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0161b b(wx7 wx7Var) {
            this.f = wx7Var;
            return this;
        }

        public C0161b i(g84 g84Var) {
            if (g84Var != null) {
                this.m = g84Var;
            }
            return this;
        }

        public C0161b j(String str) {
            this.i = str;
            return this;
        }

        public C0161b l(String str, String str2) {
            return k(str, str2);
        }

        @Override // hp8.a
        public tx7 start() {
            return h();
        }
    }

    private static class c extends Thread {
        private final WeakReference a;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b bVar = (b) this.a.get();
            if (bVar != null) {
                bVar.close();
            }
        }

        private c(b bVar) {
            super("dd-tracer-shutdown-hook");
            this.a = new WeakReference(bVar);
        }
    }

    static {
        BigInteger pow = BigInteger.valueOf(2L).pow(128);
        BigInteger bigInteger = BigInteger.ONE;
        s = pow.subtract(bigInteger);
        t = BigInteger.valueOf(2L).pow(64).subtract(bigInteger);
        u = BigInteger.ZERO;
    }

    protected b(Config config, ql9 ql9Var, Random random) {
        this(config.D(), ql9Var, z77.a.a(config), qa3.b(config), qa3.a(config, config.g()), new zx0(Config.b().B().intValue(), r()), random, config.l(), config.o(), config.C(), config.g(), config.p().intValue());
    }

    private static x51 r() {
        try {
            return (x51) Class.forName("com.datadog.opentracing.jfr.openjdk.ScopeEventFactory").newInstance();
        } catch (ClassFormatError | NoClassDefFoundError | ReflectiveOperationException unused) {
            return new u51();
        }
    }

    public List C(String str) {
        return (List) this.j.get(str);
    }

    public void G(ClassLoader classLoader) {
        try {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            Iterator it2 = ServiceLoader.load(cp8.class, classLoader).iterator();
            while (it2.hasNext()) {
                lh4.a(it2.next());
                m(null);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (ServiceConfigurationError unused) {
        }
    }

    public ac7 L() {
        return this.d;
    }

    void N0() {
        this.b.N0();
    }

    void P(com.datadog.opentracing.a aVar) {
        if ((this.c instanceof y26) && aVar != null && aVar.f().j() == Integer.MIN_VALUE) {
            ((y26) this.c).a(aVar);
        }
    }

    @Override // defpackage.hp8
    public wx7 R0(dp2 dp2Var, Object obj) {
        if (obj instanceof dj8) {
            return this.m.a((dj8) obj);
        }
        return null;
    }

    void X(Collection collection) {
        ArrayList arrayList;
        if (collection.isEmpty()) {
            return;
        }
        if (this.k.isEmpty()) {
            arrayList = new ArrayList(collection);
        } else {
            ArrayList<qy4> arrayList2 = new ArrayList(collection);
            Iterator it2 = this.k.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            for (qy4 qy4Var : arrayList2) {
                if (qy4Var instanceof com.datadog.opentracing.a) {
                    arrayList3.add((com.datadog.opentracing.a) qy4Var);
                }
            }
            arrayList = arrayList3;
        }
        N0();
        if (arrayList.isEmpty()) {
            return;
        }
        com.datadog.opentracing.a aVar = (com.datadog.opentracing.a) ((com.datadog.opentracing.a) arrayList.get(0)).o();
        P(aVar);
        if (aVar == null) {
            aVar = (com.datadog.opentracing.a) arrayList.get(0);
        }
        if (this.c.b(aVar)) {
            this.b.Y(arrayList);
        }
    }

    @Override // defpackage.hp8, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        PendingTrace.close();
        this.b.close();
    }

    public void finalize() {
        try {
            Runtime.getRuntime().removeShutdownHook(this.i);
            this.i.run();
        } catch (Exception unused) {
        }
    }

    public void j(d1 d1Var) {
        List list = (List) this.j.get(d1Var.a());
        if (list == null) {
            list = new ArrayList();
        }
        list.add(d1Var);
        this.j.put(d1Var.a(), list);
    }

    @Override // defpackage.hp8
    public yb7 k1(tx7 tx7Var) {
        return this.d.o(tx7Var);
    }

    public void l(zb7 zb7Var) {
        ac7 ac7Var = this.d;
        if (ac7Var instanceof zx0) {
            ((zx0) ac7Var).c(zb7Var);
        }
    }

    public boolean m(cp8 cp8Var) {
        return this.k.add(cp8Var);
    }

    @Override // defpackage.hp8
    public tx7 n() {
        return this.d.n();
    }

    @Override // defpackage.hp8
    public void n1(wx7 wx7Var, dp2 dp2Var, Object obj) {
        if (obj instanceof fj8) {
            z51 z51Var = (z51) wx7Var;
            P(z51Var.n().p());
            this.l.a(z51Var, (fj8) obj);
        }
    }

    public int s() {
        return this.h;
    }

    public String toString() {
        return "DDTracer-" + Integer.toHexString(hashCode()) + "{ serviceName=" + this.a + ", writer=" + this.b + ", sampler=" + this.c + ", defaultSpanTags=" + this.f + '}';
    }

    private b(String str, ql9 ql9Var, z77 z77Var, qa3.d dVar, qa3.c cVar, ac7 ac7Var, Random random, Map map, Map map2, Map map3, Map map4, int i) {
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentSkipListSet(new a());
        this.n = ve3.a("SECURE_RANDOM", true);
        this.r = random;
        this.a = str;
        if (ql9Var == null) {
            this.b = new fa4();
        } else {
            this.b = ql9Var;
        }
        this.c = z77Var;
        this.l = dVar;
        this.m = cVar;
        this.d = ac7Var;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = i;
        this.b.start();
        c cVar2 = new c();
        this.i = cVar2;
        try {
            Runtime.getRuntime().addShutdownHook(cVar2);
        } catch (IllegalStateException unused) {
        }
        Iterator it2 = s51.a().iterator();
        while (it2.hasNext()) {
            j((d1) it2.next());
        }
        G(ClassLoader.getSystemClassLoader());
        PendingTrace.q();
    }
}
