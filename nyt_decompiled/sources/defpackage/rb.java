package defpackage;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class rb implements qb {
    public static final a Companion = new a(null);
    private final SharedPreferences a;
    private final JsonAdapter b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public rb(SharedPreferences sharedPreferences, JsonAdapter jsonAdapter) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(jsonAdapter, "moshiAdapter");
        this.a = sharedPreferences;
        this.b = jsonAdapter;
    }

    @Override // defpackage.qb
    public Map a() {
        JsonAdapter jsonAdapter = this.b;
        String string = this.a.getString("als_user_data", "{}");
        Map map = (Map) jsonAdapter.fromJson(string != null ? string : "{}");
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.qb
    public void b(Map map) {
        zq3.h(map, "userData");
        this.a.edit().putString("als_user_data", this.b.toJson(map)).apply();
    }
}
