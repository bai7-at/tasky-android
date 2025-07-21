package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.facebook.GraphRequest;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class x22 {
    public static final x22 a = new x22();

    private x22() {
    }

    public static final void d() {
        if (w92.p()) {
            h();
        }
    }

    public static final File[] e() {
        File f = km3.f();
        if (f == null) {
            return new File[0];
        }
        File[] listFiles = f.listFiles(new FilenameFilter() { // from class: w22
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean f2;
                f2 = x22.f(file, str);
                return f2;
            }
        });
        zq3.g(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(File file, String str) {
        zq3.g(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        z38 z38Var = z38.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return new Regex(format).d(str);
    }

    public static final void g(String str) {
        try {
            new t22(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        if (g29.V()) {
            return;
        }
        File[] e = e();
        final ArrayList arrayList = new ArrayList();
        int length = e.length;
        int i = 0;
        while (i < length) {
            File file = e[i];
            i++;
            t22 t22Var = new t22(file);
            if (t22Var.d()) {
                arrayList.add(t22Var);
            }
        }
        i.A(arrayList, new Comparator() { // from class: u22
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i2;
                i2 = x22.i((t22) obj, (t22) obj2);
                return i2;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        km3 km3Var = km3.a;
        km3.r("error_reports", jSONArray, new GraphRequest.b() { // from class: v22
            @Override // com.facebook.GraphRequest.b
            public final void a(m23 m23Var) {
                x22.j(arrayList, m23Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(t22 t22Var, t22 t22Var2) {
        zq3.g(t22Var2, "o2");
        return t22Var.b(t22Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ArrayList arrayList, m23 m23Var) {
        zq3.h(arrayList, "$validReports");
        zq3.h(m23Var, "response");
        try {
            if (m23Var.b() == null) {
                JSONObject d = m23Var.d();
                if (zq3.c(d == null ? null : Boolean.valueOf(d.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((t22) it2.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
