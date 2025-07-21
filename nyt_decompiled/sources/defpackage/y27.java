package defpackage;

import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlin.time.c;
import okhttp3.Dns;

/* loaded from: classes2.dex */
public final class y27 implements Dns {
    public static final a d = new a(null);
    private static final long e;
    private final Dns a;
    private final long b;
    private final Map c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        private final String a;
        private final List b;
        private final long c;

        public b(String str, List list) {
            zq3.h(str, "hostname");
            zq3.h(list, "addresses");
            this.a = str;
            this.b = list;
            this.c = System.nanoTime();
        }

        public final List a() {
            return this.b;
        }

        public final long b() {
            b.a aVar = kotlin.time.b.b;
            return c.t(System.nanoTime() - this.c, DurationUnit.NANOSECONDS);
        }

        public final void c() {
            synchronized (this.b) {
                try {
                    InetAddress inetAddress = (InetAddress) i.K(this.b);
                    if (inetAddress != null) {
                        this.b.add(inetAddress);
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "ResolvedHost(hostname=" + this.a + ", addresses=" + this.b + ")";
        }
    }

    static {
        b.a aVar = kotlin.time.b.b;
        e = c.s(30, DurationUnit.MINUTES);
    }

    public /* synthetic */ y27(Dns dns, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(dns, j);
    }

    private final boolean a(b bVar) {
        return kotlin.time.b.i(bVar.b(), this.b) < 0 && !bVar.a().isEmpty();
    }

    private final List b(List list) {
        List X0;
        synchronized (list) {
            X0 = i.X0(list);
        }
        return X0;
    }

    @Override // okhttp3.Dns
    public List lookup(String str) {
        zq3.h(str, "hostname");
        b bVar = (b) this.c.get(str);
        if (bVar != null && a(bVar)) {
            bVar.c();
            return b(bVar.a());
        }
        List<InetAddress> lookup = this.a.lookup(str);
        this.c.put(str, new b(str, i.a1(lookup)));
        return b(lookup);
    }

    private y27(Dns dns, long j) {
        zq3.h(dns, "delegate");
        this.a = dns;
        this.b = j;
        this.c = new LinkedHashMap();
    }

    public /* synthetic */ y27(Dns dns, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns, (i & 2) != 0 ? e : j, null);
    }
}
