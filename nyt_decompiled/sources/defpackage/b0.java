package defpackage;

import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b0 {
    public static final b0 a = new b0();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private b0() {
    }

    public static final synchronized void c() {
        synchronized (b0.class) {
            if (c11.d(b0.class)) {
                return;
            }
            try {
                if (b.getAndSet(true)) {
                    return;
                }
                if (w92.p()) {
                    d();
                }
                y.d();
            } catch (Throwable th) {
                c11.b(th, b0.class);
            }
        }
    }

    public static final void d() {
        if (c11.d(b0.class)) {
            return;
        }
        try {
            if (g29.V()) {
                return;
            }
            File[] k = km3.k();
            ArrayList arrayList = new ArrayList(k.length);
            for (File file : k) {
                arrayList.add(InstrumentData.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List N0 = i.N0(arrayList2, new Comparator() { // from class: z
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e;
                    e = b0.e((InstrumentData) obj2, (InstrumentData) obj3);
                    return e;
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = uo6.u(0, Math.min(N0.size(), 5)).iterator();
            while (it2.hasNext()) {
                jSONArray.put(N0.get(((qm3) it2).c()));
            }
            km3 km3Var = km3.a;
            km3.r("anr_reports", jSONArray, new GraphRequest.b() { // from class: a0
                @Override // com.facebook.GraphRequest.b
                public final void a(m23 m23Var) {
                    b0.f(N0, m23Var);
                }
            });
        } catch (Throwable th) {
            c11.b(th, b0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(InstrumentData instrumentData, InstrumentData instrumentData2) {
        if (c11.d(b0.class)) {
            return 0;
        }
        try {
            zq3.g(instrumentData2, "o2");
            return instrumentData.b(instrumentData2);
        } catch (Throwable th) {
            c11.b(th, b0.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List list, m23 m23Var) {
        if (c11.d(b0.class)) {
            return;
        }
        try {
            zq3.h(list, "$validReports");
            zq3.h(m23Var, "response");
            try {
                if (m23Var.b() == null) {
                    JSONObject d = m23Var.d();
                    if (zq3.c(d == null ? null : Boolean.valueOf(d.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((InstrumentData) it2.next()).a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            c11.b(th, b0.class);
        }
    }
}
