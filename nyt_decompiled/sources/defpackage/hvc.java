package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class hvc {
    protected final Context c;
    protected final Executor d;
    protected final jgb e;
    private final x6e g;
    protected final String a = (String) kra.b.e();
    protected final Map b = new HashMap();
    private final AtomicBoolean j = new AtomicBoolean();
    private final AtomicReference k = new AtomicReference(new Bundle());
    protected final boolean f = ((Boolean) pla.c().a(mpa.X1)).booleanValue();
    private final boolean h = ((Boolean) pla.c().a(mpa.a2)).booleanValue();
    private final boolean i = ((Boolean) pla.c().a(mpa.b7)).booleanValue();

    protected hvc(Executor executor, jgb jgbVar, x6e x6eVar, Context context) {
        this.d = executor;
        this.e = jgbVar;
        this.g = x6eVar;
        this.c = context;
    }

    private final void a(Map map, boolean z) {
        if (map.isEmpty()) {
            fgb.b("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            fgb.b("Empty or null paramMap.");
        } else {
            if (!this.j.getAndSet(true)) {
                final String str = (String) pla.c().a(mpa.Z9);
                this.k.set(wv9.a(this.c, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: gvc
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        hvc.this.d(str, sharedPreferences, str2);
                    }
                }));
            }
            Bundle bundle = (Bundle) this.k.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        final String a = this.g.a(map);
        pzc.k(a);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f) {
            if (!z || this.h) {
                if (!parseBoolean || this.i) {
                    this.d.execute(new Runnable() { // from class: fvc
                        @Override // java.lang.Runnable
                        public final void run() {
                            hvc.this.e.a(a);
                        }
                    });
                }
            }
        }
    }

    protected final String b(Map map) {
        return this.g.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.b);
    }

    final /* synthetic */ void d(String str, SharedPreferences sharedPreferences, String str2) {
        this.k.set(wv9.b(this.c, str));
    }

    public final void e(Map map) {
        a(map, true);
    }

    public final void f(Map map) {
        a(map, false);
    }
}
