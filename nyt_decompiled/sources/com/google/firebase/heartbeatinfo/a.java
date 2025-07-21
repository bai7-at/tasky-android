package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import com.amazonaws.services.s3.internal.Constants;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.a;
import com.google.firebase.heartbeatinfo.b;
import defpackage.ar0;
import defpackage.km1;
import defpackage.m09;
import defpackage.nq0;
import defpackage.nz8;
import defpackage.og8;
import defpackage.q76;
import defpackage.s73;
import defpackage.u73;
import defpackage.uh2;
import defpackage.uq0;
import defpackage.v73;
import defpackage.vg8;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a implements u73, HeartBeatInfo {
    private static final ThreadFactory f = new ThreadFactory() { // from class: nh1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread m;
            m = a.m(runnable);
            return m;
        }
    };
    private final q76 a;
    private final Context b;
    private final q76 c;
    private final Set d;
    private final Executor e;

    private a(final Context context, final String str, Set set, q76 q76Var) {
        this(new q76() { // from class: oh1
            @Override // defpackage.q76
            public final Object get() {
                b k;
                k = a.k(context, str);
                return k;
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f), q76Var, context);
    }

    public static nq0 h() {
        return nq0.d(a.class, u73.class, HeartBeatInfo.class).b(km1.j(Context.class)).b(km1.j(uh2.class)).b(km1.l(s73.class)).b(km1.k(nz8.class)).f(new ar0() { // from class: mh1
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                a i;
                i = a.i(uq0Var);
                return i;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a i(uq0 uq0Var) {
        return new a((Context) uq0Var.a(Context.class), ((uh2) uq0Var.a(uh2.class)).n(), uq0Var.c(s73.class), uq0Var.d(nz8.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                b bVar = (b) this.a.get();
                List c = bVar.c();
                bVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < c.size(); i++) {
                    v73 v73Var = (v73) c.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", v73Var.c());
                    jSONObject.put("dates", new JSONArray((Collection) v73Var.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.DEFAULT_ENCODING));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString(Constants.DEFAULT_ENCODING);
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b k(Context context, String str) {
        return new b(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void l() {
        synchronized (this) {
            ((b) this.a.get()).k(System.currentTimeMillis(), ((nz8) this.c.get()).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // defpackage.u73
    public og8 a() {
        return !m09.a(this.b) ? vg8.e("") : vg8.c(this.e, new Callable() { // from class: ph1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String j;
                j = a.this.j();
                return j;
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public synchronized HeartBeatInfo.HeartBeat b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = (b) this.a.get();
        if (!bVar.i(currentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        bVar.g();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    public og8 n() {
        if (this.d.size() > 0 && m09.a(this.b)) {
            return vg8.c(this.e, new Callable() { // from class: qh1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void l;
                    l = a.this.l();
                    return l;
                }
            });
        }
        return vg8.e(null);
    }

    a(q76 q76Var, Set set, Executor executor, q76 q76Var2, Context context) {
        this.a = q76Var;
        this.d = set;
        this.e = executor;
        this.c = q76Var2;
        this.b = context;
    }
}
