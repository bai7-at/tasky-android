package defpackage;

import com.facebook.appevents.ml.ModelManager;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qn3 {
    public static final qn3 a = new qn3();
    private static boolean b;
    private static boolean c;

    private qn3() {
    }

    public static final void a() {
        if (c11.d(qn3.class)) {
            return;
        }
        try {
            b = true;
            qd2 qd2Var = qd2.a;
            c = qd2.d("FBSDKFeatureIntegritySample", w92.m(), false);
        } catch (Throwable th) {
            c11.b(th, qn3.class);
        }
    }

    private final String b(String str) {
        if (c11.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            ModelManager modelManager = ModelManager.a;
            String[] q = ModelManager.q(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (q == null) {
                return "none";
            }
            String str2 = q[0];
            return str2 == null ? "none" : str2;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final void c(Map map) {
        if (c11.d(qn3.class)) {
            return;
        }
        try {
            zq3.h(map, "parameters");
            if (!b || map.isEmpty()) {
                return;
            }
            try {
                List<String> X0 = i.X0(map.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : X0) {
                    Object obj = map.get(str);
                    if (obj == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str2 = (String) obj;
                    qn3 qn3Var = a;
                    if (!qn3Var.d(str) && !qn3Var.d(str2)) {
                    }
                    map.remove(str);
                    if (!c) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                }
                if (jSONObject.length() != 0) {
                    String jSONObject2 = jSONObject.toString();
                    zq3.g(jSONObject2, "restrictiveParamJson.toString()");
                    map.put("_onDeviceParams", jSONObject2);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            c11.b(th, qn3.class);
        }
    }

    private final boolean d(String str) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return !zq3.c("none", b(str));
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }
}
