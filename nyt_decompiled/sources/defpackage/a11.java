package defpackage;

import android.util.Log;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import defpackage.a11;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a11 implements Thread.UncaughtExceptionHandler {
    public static final a b = new a(null);
    private static final String c = a11.class.getCanonicalName();
    private static a11 d;
    private final Thread.UncaughtExceptionHandler a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d() {
            if (g29.V()) {
                return;
            }
            File[] o = km3.o();
            ArrayList arrayList = new ArrayList(o.length);
            for (File file : o) {
                arrayList.add(InstrumentData.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List N0 = i.N0(arrayList2, new Comparator() { // from class: y01
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e;
                    e = a11.a.e((InstrumentData) obj2, (InstrumentData) obj3);
                    return e;
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = uo6.u(0, Math.min(N0.size(), 5)).iterator();
            while (it2.hasNext()) {
                jSONArray.put(N0.get(((qm3) it2).c()));
            }
            km3 km3Var = km3.a;
            km3.r("crash_reports", jSONArray, new GraphRequest.b() { // from class: z01
                @Override // com.facebook.GraphRequest.b
                public final void a(m23 m23Var) {
                    a11.a.f(N0, m23Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(InstrumentData instrumentData, InstrumentData instrumentData2) {
            zq3.g(instrumentData2, "o2");
            return instrumentData.b(instrumentData2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(List list, m23 m23Var) {
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
        }

        public final synchronized void c() {
            try {
                if (w92.p()) {
                    d();
                }
                if (a11.d != null) {
                    Log.w(a11.c, "Already enabled!");
                } else {
                    a11.d = new a11(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(a11.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ a11(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        zq3.h(thread, QueryKeys.TOKEN);
        zq3.h(th, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
        if (km3.i(th)) {
            b62.c(th);
            InstrumentData.a aVar = InstrumentData.a.a;
            InstrumentData.a.b(th, InstrumentData.Type.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    private a11(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }
}
