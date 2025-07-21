package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class jvc {
    private final String e;
    private final evc f;
    private final List b = new ArrayList();
    private boolean c = false;
    private boolean d = false;
    private final hie a = dyf.q().i();

    public jvc(String str, evc evcVar) {
        this.e = str;
        this.f = evcVar;
    }

    private final Map g() {
        Map g = this.f.g();
        g.put("tms", Long.toString(dyf.b().elapsedRealtime(), 10));
        g.put("tid", this.a.g() ? "" : this.e);
        return g;
    }

    public final synchronized void a(String str) {
        if (((Boolean) pla.c().a(mpa.Z1)).booleanValue()) {
            if (!((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
                Map g = g();
                g.put("action", "aaia");
                g.put("aair", "MalformedJson");
                this.b.add(g);
            }
        }
    }

    public final synchronized void b(String str, String str2) {
        if (((Boolean) pla.c().a(mpa.Z1)).booleanValue()) {
            if (!((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
                Map g = g();
                g.put("action", "adapter_init_finished");
                g.put("ancn", str);
                g.put("rqe", str2);
                this.b.add(g);
            }
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) pla.c().a(mpa.Z1)).booleanValue()) {
            if (!((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
                Map g = g();
                g.put("action", "adapter_init_started");
                g.put("ancn", str);
                this.b.add(g);
            }
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) pla.c().a(mpa.Z1)).booleanValue()) {
            if (!((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
                Map g = g();
                g.put("action", "adapter_init_finished");
                g.put("ancn", str);
                this.b.add(g);
            }
        }
    }

    public final synchronized void e() {
        try {
            if (((Boolean) pla.c().a(mpa.Z1)).booleanValue()) {
                if (!((Boolean) pla.c().a(mpa.z8)).booleanValue() && !this.d) {
                    Map g = g();
                    g.put("action", "init_finished");
                    this.b.add(g);
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        this.f.f((Map) it2.next());
                    }
                    this.d = true;
                }
            }
        } finally {
        }
    }

    public final synchronized void f() {
        if (((Boolean) pla.c().a(mpa.Z1)).booleanValue()) {
            if (!((Boolean) pla.c().a(mpa.z8)).booleanValue() && !this.c) {
                Map g = g();
                g.put("action", "init_started");
                this.b.add(g);
                this.c = true;
            }
        }
    }
}
