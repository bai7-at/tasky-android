package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import kotlin.collections.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class eh0 {
    public static final eh0 a = new eh0();
    private static final HashMap b = t.k(du8.a(String.class, new a()), du8.a(String[].class, new b()), du8.a(JSONArray.class, new c()));

    public static final class a implements d {
        a() {
        }

        @Override // eh0.d
        public void a(JSONObject jSONObject, String str, Object obj) {
            zq3.h(jSONObject, "json");
            zq3.h(str, TransferTable.COLUMN_KEY);
            jSONObject.put(str, obj);
        }
    }

    public static final class b implements d {
        b() {
        }

        @Override // eh0.d
        public void a(JSONObject jSONObject, String str, Object obj) {
            zq3.h(jSONObject, "json");
            zq3.h(str, TransferTable.COLUMN_KEY);
            JSONArray jSONArray = new JSONArray();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            }
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    public static final class c implements d {
        c() {
        }

        @Override // eh0.d
        public void a(JSONObject jSONObject, String str, Object obj) {
            zq3.h(jSONObject, "json");
            zq3.h(str, TransferTable.COLUMN_KEY);
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    private interface d {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    private eh0() {
    }

    public static final JSONObject a(CameraEffectArguments cameraEffectArguments) {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.c()) {
            Object b2 = cameraEffectArguments.b(str);
            if (b2 != null) {
                d dVar = (d) b.get(b2.getClass());
                if (dVar == null) {
                    throw new IllegalArgumentException(zq3.q("Unsupported type: ", b2.getClass()));
                }
                dVar.a(jSONObject, str, b2);
            }
        }
        return jSONObject;
    }
}
