package defpackage;

import com.facebook.GraphRequest;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b62 {
    public static final b62 a = new b62();
    private static boolean b;

    private b62() {
    }

    public static final void b() {
        b = true;
        if (w92.p()) {
            a.e();
        }
    }

    public static final void c(Throwable th) {
        if (!b || d() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        zq3.g(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            FeatureManager featureManager = FeatureManager.a;
            String className = stackTraceElement.getClassName();
            zq3.g(className, "it.className");
            FeatureManager.Feature d = FeatureManager.d(className);
            if (d != FeatureManager.Feature.Unknown) {
                FeatureManager.c(d);
                hashSet.add(d.toString());
            }
        }
        if (!w92.p() || hashSet.isEmpty()) {
            return;
        }
        InstrumentData.a aVar = InstrumentData.a.a;
        InstrumentData.a.c(new JSONArray((Collection) hashSet)).g();
    }

    public static final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InstrumentData instrumentData, m23 m23Var) {
        zq3.h(instrumentData, "$instrumentData");
        zq3.h(m23Var, "response");
        try {
            if (m23Var.b() == null) {
                JSONObject d = m23Var.d();
                if (zq3.c(d == null ? null : Boolean.valueOf(d.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        if (g29.V()) {
            return;
        }
        File[] m = km3.m();
        ArrayList arrayList = new ArrayList();
        int length = m.length;
        int i = 0;
        while (i < length) {
            File file = m[i];
            i++;
            final InstrumentData d = InstrumentData.a.d(file);
            if (d.f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", d.toString());
                    GraphRequest.c cVar = GraphRequest.n;
                    z38 z38Var = z38.a;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{w92.m()}, 1));
                    zq3.g(format, "java.lang.String.format(format, *args)");
                    arrayList.add(cVar.A(null, format, jSONObject, new GraphRequest.b() { // from class: a62
                        @Override // com.facebook.GraphRequest.b
                        public final void a(m23 m23Var) {
                            b62.f(InstrumentData.this, m23Var);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new l23(arrayList).k();
    }
}
