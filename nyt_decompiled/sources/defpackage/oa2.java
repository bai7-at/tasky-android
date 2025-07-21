package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class oa2 {
    private final SharedPreferences a;

    public oa2(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "prefs");
        this.a = sharedPreferences;
    }

    private final void b(SharedPreferences.Editor editor, Map map, String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        String str2 = (String) map.get(lowerCase);
        if (str2 != null) {
            editor.putString(str, str2);
        }
    }

    public final na2 a() {
        return new na2(this.a.getString("device_type", ""), this.a.getString("x-nyt-continent", ""), this.a.getString("x-nyt-country", ""), this.a.getString("x-nyt-programming-abtest", ""), this.a.getString("x-nyt-region", ""), this.a.getString("x-nyt-user-type", ""), this.a.getString("x-nyt-geoip-map", ""), this.a.getString("x-nyt-device-map", ""));
    }

    public final void c(xa3 xa3Var) {
        List f;
        if (xa3Var == null || (f = xa3Var.f()) == null) {
            return;
        }
        List<va3> list = f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list, 10)), 16));
        for (va3 va3Var : list) {
            String lowerCase = va3Var.a().toLowerCase(Locale.ROOT);
            zq3.g(lowerCase, "toLowerCase(...)");
            Pair a = du8.a(lowerCase, va3Var.b());
            linkedHashMap.put(a.c(), a.d());
        }
        SharedPreferences.Editor edit = this.a.edit();
        b(edit, linkedHashMap, "device_type");
        b(edit, linkedHashMap, "x-nyt-continent");
        b(edit, linkedHashMap, "x-nyt-country");
        b(edit, linkedHashMap, "x-nyt-programming-abtest");
        b(edit, linkedHashMap, "x-nyt-region");
        b(edit, linkedHashMap, "x-nyt-user-type");
        b(edit, linkedHashMap, "x-nyt-geoip-map");
        b(edit, linkedHashMap, "x-nyt-device-map");
        edit.apply();
    }
}
