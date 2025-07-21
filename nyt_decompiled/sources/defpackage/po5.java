package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.facebook.appevents.codeless.internal.PathComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class po5 {
    public static final a e = new a(null);
    private final String a;
    private final String b;
    private final List c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public po5(JSONObject jSONObject) {
        int length;
        zq3.h(jSONObject, "component");
        String string = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(string, "component.getString(PARAMETER_NAME_KEY)");
        this.a = string;
        String optString = jSONObject.optString("value");
        zq3.g(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        zq3.g(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                zq3.g(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject2));
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.c = arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }
}
