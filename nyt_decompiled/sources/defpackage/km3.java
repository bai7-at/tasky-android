package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.facebook.GraphRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.text.Regex;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class km3 {
    public static final km3 a = new km3();

    private km3() {
    }

    public static final boolean d(String str) {
        File f = f();
        if (f == null || str == null) {
            return false;
        }
        return new File(f, str).delete();
    }

    public static final String e(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final File f() {
        File file = new File(w92.l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String g(Thread thread) {
        zq3.h(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        zq3.g(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            i++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String h(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            zq3.g(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean i(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            zq3.g(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                String className = stackTraceElement.getClassName();
                zq3.g(className, "element.className");
                if (h.K(className, "com.facebook", false, 2, null)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean j(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                zq3.g(className, "element.className");
                if (h.K(className, "com.facebook", false, 2, null)) {
                    String className2 = stackTraceElement.getClassName();
                    zq3.g(className2, "element.className");
                    if (!h.K(className2, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className3 = stackTraceElement.getClassName();
                        zq3.g(className3, "element.className");
                        if (!h.K(className3, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    zq3.g(methodName, "element.methodName");
                    if (h.K(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        zq3.g(methodName2, "element.methodName");
                        if (h.K(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            zq3.g(methodName3, "element.methodName");
                            if (!h.K(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] k() {
        File f = f();
        if (f == null) {
            return new File[0];
        }
        File[] listFiles = f.listFiles(new FilenameFilter() { // from class: im3
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean l;
                l = km3.l(file, str);
                return l;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(File file, String str) {
        zq3.g(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        z38 z38Var = z38.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return new Regex(format).d(str);
    }

    public static final File[] m() {
        File f = f();
        if (f == null) {
            return new File[0];
        }
        File[] listFiles = f.listFiles(new FilenameFilter() { // from class: jm3
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean n;
                n = km3.n(file, str);
                return n;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(File file, String str) {
        zq3.g(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        z38 z38Var = z38.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return new Regex(format).d(str);
    }

    public static final File[] o() {
        File f = f();
        if (f == null) {
            return new File[0];
        }
        File[] listFiles = f.listFiles(new FilenameFilter() { // from class: hm3
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean p;
                p = km3.p(file, str);
                return p;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(File file, String str) {
        zq3.g(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        z38 z38Var = z38.a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return new Regex(format).d(str);
    }

    public static final JSONObject q(String str, boolean z) {
        File f = f();
        if (f != null && str != null) {
            try {
                return new JSONObject(g29.p0(new FileInputStream(new File(f, str))));
            } catch (Exception unused) {
                if (z) {
                    d(str);
                }
            }
        }
        return null;
    }

    public static final void r(String str, JSONArray jSONArray, GraphRequest.b bVar) {
        zq3.h(jSONArray, "reports");
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject A = g29.A();
            if (A != null) {
                Iterator<String> keys = A.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, A.get(next));
                }
            }
            GraphRequest.c cVar = GraphRequest.n;
            z38 z38Var = z38.a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{w92.m()}, 1));
            zq3.g(format, "java.lang.String.format(format, *args)");
            cVar.A(null, format, jSONObject, bVar).l();
        } catch (JSONException unused) {
        }
    }

    public static final void s(String str, String str2) {
        File f = f();
        if (f == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(f, str));
            byte[] bytes = str2.getBytes(yj0.b);
            zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
