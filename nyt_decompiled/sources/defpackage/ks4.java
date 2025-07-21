package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class ks4 {
    private static final Charset b = Charset.forName(Constants.DEFAULT_ENCODING);
    private final ue2 a;

    class a extends JSONObject {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
            put("userId", str);
        }
    }

    public ks4(ue2 ue2Var) {
        this.a = ue2Var;
    }

    private static Map d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, j(jSONObject, next));
        }
        return hashMap;
    }

    private String e(String str) {
        return j(new JSONObject(str), "userId");
    }

    private static String f(Map map) {
        return new JSONObject(map).toString();
    }

    private static String i(String str) {
        return new a(str).toString();
    }

    private static String j(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.a.n(str, "internal-keys");
    }

    public File b(String str) {
        return this.a.n(str, "keys");
    }

    public File c(String str) {
        return this.a.n(str, "user-data");
    }

    Map g(String str, boolean z) {
        FileInputStream fileInputStream;
        File a2 = z ? a(str) : b(str);
        if (!a2.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(a2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            Map d = d(CommonUtils.C(fileInputStream));
            CommonUtils.e(fileInputStream, "Failed to close user metadata file.");
            return d;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            m94.f().e("Error deserializing user metadata.", e);
            CommonUtils.e(fileInputStream2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public String h(String str) {
        FileInputStream fileInputStream;
        File c = c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists()) {
            m94.f().b("No userId set for session " + str);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                try {
                    String e = e(CommonUtils.C(fileInputStream));
                    m94.f().b("Loaded userId " + e + " for session " + str);
                    CommonUtils.e(fileInputStream, "Failed to close user metadata file.");
                    return e;
                } catch (Exception e2) {
                    e = e2;
                    m94.f().e("Error deserializing user metadata.", e);
                    CommonUtils.e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                CommonUtils.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void k(String str, Map map, boolean z) {
        String f;
        BufferedWriter bufferedWriter;
        File a2 = z ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                f = f(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a2), b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(f);
            bufferedWriter.flush();
            CommonUtils.e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            m94.f().e("Error serializing key/value metadata.", e);
            CommonUtils.e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void l(String str, String str2) {
        String i;
        BufferedWriter bufferedWriter;
        File c = c(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                i = i(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(i);
            bufferedWriter.flush();
            CommonUtils.e(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            m94.f().e("Error serializing user metadata.", e);
            CommonUtils.e(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.e(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
