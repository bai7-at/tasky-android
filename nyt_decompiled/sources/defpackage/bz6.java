package defpackage;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class bz6 {
    private static final Logger a = Logger.getLogger(bz6.class.getName());
    private static final dv b;
    private static final dv c;
    private static final dv d;
    private static final dv e;
    private static final bz6 f;
    private static final bz6 g;
    private static final bz6 h;
    private static final bz6 i;

    static {
        dv a2 = dv.a("service.name");
        b = a2;
        dv a3 = dv.a("telemetry.sdk.language");
        c = a3;
        dv a4 = dv.a("telemetry.sdk.name");
        d = a4;
        dv a5 = dv.a("telemetry.sdk.version");
        e = a5;
        f = d(hv.d());
        bz6 d2 = d(hv.f(a2, "unknown_service:java"));
        h = d2;
        bz6 d3 = d(hv.b().d(a4, "opentelemetry").d(a3, "java").d(a5, "1.35.0").build());
        g = d3;
        i = d2.l(d3);
    }

    bz6() {
    }

    public static ez6 b() {
        return new ez6();
    }

    private static void c(hv hvVar) {
        hvVar.forEach(new BiConsumer() { // from class: az6
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                bz6.k((dv) obj, obj2);
            }
        });
    }

    public static bz6 d(hv hvVar) {
        return e(hvVar, null);
    }

    public static bz6 e(hv hvVar, String str) {
        Objects.requireNonNull(hvVar, "attributes");
        c(hvVar);
        return new b20(str, hvVar);
    }

    public static bz6 g() {
        return i;
    }

    private static boolean i(String str) {
        return str.length() <= 255 && q48.b(str);
    }

    private static boolean j(dv dvVar) {
        return !dvVar.getKey().isEmpty() && i(dvVar.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(dv dvVar, Object obj) {
        n29.a(j(dvVar), "Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.");
        Objects.requireNonNull(obj, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }

    public abstract hv f();

    public abstract String h();

    public bz6 l(bz6 bz6Var) {
        if (bz6Var == null || bz6Var == f) {
            return this;
        }
        iv b2 = hv.b();
        b2.a(f());
        b2.a(bz6Var.f());
        if (bz6Var.h() == null) {
            return e(b2.build(), h());
        }
        if (h() == null) {
            return e(b2.build(), bz6Var.h());
        }
        if (bz6Var.h().equals(h())) {
            return e(b2.build(), h());
        }
        a.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + h() + " Schema 2: " + bz6Var.h());
        return e(b2.build(), null);
    }

    public ez6 m() {
        ez6 c2 = b().c(this);
        if (h() != null) {
            c2.d(h());
        }
        return c2;
    }
}
