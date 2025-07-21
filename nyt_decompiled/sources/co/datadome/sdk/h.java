package co.datadome.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class h {
    private static Map f = new HashMap();
    private final SharedPreferences a;
    private String b = "";
    private String c = "";
    private final ScheduledExecutorService d = Executors.newScheduledThreadPool(1);
    private ExecutorService e = Executors.newSingleThreadExecutor();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.c.isEmpty() || !h.this.c.equals(h.this.b)) {
                h.this.o();
            }
        }
    }

    h(Context context) {
        this.a = c(context);
        n();
    }

    private SharedPreferences c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static synchronized h d(Context context, String str) {
        h hVar;
        synchronized (h.class) {
            try {
                if (!f.containsKey(str)) {
                    f.put(str, new h(context));
                }
                hVar = (h) f.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    private String j() {
        String str = "";
        try {
            str = (String) this.e.submit(new Callable() { // from class: co.datadome.sdk.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String l;
                    l = h.this.l();
                    return l;
                }
            }).get();
        } catch (InterruptedException e) {
            e = e;
            e.printStackTrace();
            d.a("Retrieve cookie from disk: " + str);
            return str;
        } catch (ExecutionException e2) {
            e = e2;
            if (e.getMessage() != null && e.getMessage().contains("java.lang.ClassCastException")) {
                return "";
            }
            e.printStackTrace();
            d.a("Retrieve cookie from disk: " + str);
            return str;
        }
        d.a("Retrieve cookie from disk: " + str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String l() {
        return this.a.getString("PREF_COOKIES", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        try {
            this.a.edit().putString("PREF_COOKIES", this.b).apply();
            d.a("Store cookie on disk: " + this.b);
            this.c = this.b;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void n() {
        this.d.scheduleWithFixedDelay(new a(), 1L, 1L, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.b.isEmpty()) {
            return;
        }
        this.e.execute(new Runnable() { // from class: co.datadome.sdk.f
            @Override // java.lang.Runnable
            public final void run() {
                h.this.m();
            }
        });
    }

    protected void f() {
        this.a.edit().remove("PREF_COOKIES").apply();
        this.b = "";
    }

    public void g(String str) {
        if (DataDomeUtils.isValidCookie(str).booleanValue()) {
            this.b = str;
            d.a("Store cookie: " + this.b);
        }
    }

    public String h() {
        if (DataDomeUtils.isNullOrEmpty(this.b).booleanValue()) {
            this.b = j();
        }
        d.a("Retrieve cookie: " + this.b);
        return this.b;
    }
}
