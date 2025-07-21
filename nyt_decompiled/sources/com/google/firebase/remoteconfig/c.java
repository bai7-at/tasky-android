package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.remoteconfig.c;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import defpackage.au0;
import defpackage.hi2;
import defpackage.ks5;
import defpackage.oc;
import defpackage.q76;
import defpackage.rh2;
import defpackage.uh2;
import defpackage.vg8;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class c {
    private static final Clock j = DefaultClock.getInstance();
    private static final Random k = new Random();
    private final Map a;
    private final Context b;
    private final ExecutorService c;
    private final uh2 d;
    private final hi2 e;
    private final rh2 f;
    private final q76 g;
    private final String h;
    private Map i;

    c(Context context, uh2 uh2Var, hi2 hi2Var, rh2 rh2Var, q76 q76Var) {
        this(context, Executors.newCachedThreadPool(), uh2Var, hi2Var, rh2Var, q76Var, true);
    }

    private com.google.firebase.remoteconfig.internal.a d(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.a.h(Executors.newCachedThreadPool(), e.c(this.b, String.format("%s_%s_%s_%s.json", "frc", this.h, str, str2)));
    }

    private au0 h(com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.a aVar2) {
        return new au0(this.c, aVar, aVar2);
    }

    static d i(Context context, String str, String str2) {
        return new d(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static ks5 j(uh2 uh2Var, String str, q76 q76Var) {
        if (l(uh2Var) && str.equals("firebase")) {
            return new ks5(q76Var);
        }
        return null;
    }

    private static boolean k(uh2 uh2Var, String str) {
        return str.equals("firebase") && l(uh2Var);
    }

    private static boolean l(uh2 uh2Var) {
        return uh2Var.l().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ oc m() {
        return null;
    }

    synchronized a b(uh2 uh2Var, String str, hi2 hi2Var, rh2 rh2Var, Executor executor, com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.a aVar2, com.google.firebase.remoteconfig.internal.a aVar3, com.google.firebase.remoteconfig.internal.c cVar, au0 au0Var, d dVar) {
        try {
            if (!this.a.containsKey(str)) {
                a aVar4 = new a(this.b, uh2Var, hi2Var, k(uh2Var, str) ? rh2Var : null, executor, aVar, aVar2, aVar3, cVar, au0Var, dVar);
                aVar4.u();
                this.a.put(str, aVar4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (a) this.a.get(str);
    }

    public synchronized a c(String str) {
        com.google.firebase.remoteconfig.internal.a d;
        com.google.firebase.remoteconfig.internal.a d2;
        com.google.firebase.remoteconfig.internal.a d3;
        d i;
        au0 h;
        try {
            d = d(str, "fetch");
            d2 = d(str, "activate");
            d3 = d(str, "defaults");
            i = i(this.b, this.h, str);
            h = h(d2, d3);
            final ks5 j2 = j(this.d, str, this.g);
            if (j2 != null) {
                h.b(new BiConsumer() { // from class: rv6
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        ks5.this.a((String) obj, (b) obj2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return b(this.d, str, this.e, this.f, this.c, d, d2, d3, f(str, d, i), h, i);
    }

    a e() {
        return c("firebase");
    }

    synchronized com.google.firebase.remoteconfig.internal.c f(String str, com.google.firebase.remoteconfig.internal.a aVar, d dVar) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.c(this.e, l(this.d) ? this.g : new q76() { // from class: sv6
            @Override // defpackage.q76
            public final Object get() {
                oc m;
                m = c.m();
                return m;
            }
        }, this.c, j, k, aVar, g(this.d.m().b(), str, dVar), dVar, this.i);
    }

    ConfigFetchHttpClient g(String str, String str2, d dVar) {
        return new ConfigFetchHttpClient(this.b, this.d.m().c(), str, str2, dVar.b(), dVar.b());
    }

    protected c(Context context, ExecutorService executorService, uh2 uh2Var, hi2 hi2Var, rh2 rh2Var, q76 q76Var, boolean z) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = executorService;
        this.d = uh2Var;
        this.e = hi2Var;
        this.f = rh2Var;
        this.g = q76Var;
        this.h = uh2Var.m().c();
        if (z) {
            vg8.c(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.this.e();
                }
            });
        }
    }
}
