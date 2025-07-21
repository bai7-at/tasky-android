package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import defpackage.dyf;
import defpackage.evc;
import defpackage.ktd;
import defpackage.mpa;
import defpackage.pgb;
import defpackage.pla;
import defpackage.uuc;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    private final evc h;
    private Map i;
    private final ArrayDeque f = new ArrayDeque();
    private final ArrayDeque g = new ArrayDeque();
    private final int a = ((Integer) pla.c().a(mpa.Y6)).intValue();
    private final long b = ((Long) pla.c().a(mpa.Z6)).longValue();
    private final boolean c = ((Boolean) pla.c().a(mpa.e7)).booleanValue();
    private final boolean d = ((Boolean) pla.c().a(mpa.c7)).booleanValue();
    private final Map e = Collections.synchronizedMap(new zzb(this));

    public b(evc evcVar) {
        this.h = evcVar;
    }

    private final synchronized void g(final uuc uucVar) {
        if (this.c) {
            ArrayDeque arrayDeque = this.g;
            final ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f;
            final ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            pgb.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.e(uucVar, clone, clone2);
                }
            });
        }
    }

    private final void h(uuc uucVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(uucVar.a());
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(ktd.a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                j(this.i, "e_type", (String) pair.first);
                j(this.i, "e_agent", (String) pair.second);
            }
            this.h.f(this.i);
        }
    }

    private final synchronized void i() {
        long currentTimeMillis = dyf.b().currentTimeMillis();
        try {
            Iterator it2 = this.e.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it2.remove();
            }
        } catch (ConcurrentModificationException e) {
            dyf.q().w(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void j(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String b(String str, uuc uucVar) {
        Pair pair = (Pair) this.e.get(str);
        uucVar.a().put("rid", str);
        if (pair == null) {
            uucVar.a().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.e.remove(str);
        uucVar.a().put("mhit", "true");
        return str2;
    }

    public final synchronized void d(String str, String str2, uuc uucVar) {
        this.e.put(str, new Pair(Long.valueOf(dyf.b().currentTimeMillis()), str2));
        i();
        g(uucVar);
    }

    final /* synthetic */ void e(uuc uucVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        h(uucVar, arrayDeque, "to");
        h(uucVar, arrayDeque2, "of");
    }

    public final synchronized void f(String str) {
        this.e.remove(str);
    }
}
