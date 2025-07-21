package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class if8 {
    public static final int d = 8;
    private final Map a;
    private final gf8 b;
    private final SharedPreferences c;

    public if8(Map map, gf8 gf8Var, SharedPreferences sharedPreferences) {
        zq3.h(map, "allFactories");
        zq3.h(gf8Var, "configurationProvider");
        zq3.h(sharedPreferences, "sharedPrefs");
        this.a = map;
        this.b = gf8Var;
        this.c = sharedPreferences;
    }

    public final List a() {
        List<String> b = this.b.b();
        ArrayList arrayList = new ArrayList();
        for (String str : b) {
            de4 de4Var = (de4) this.a.get(str);
            Pair a = de4Var != null ? du8.a(str, de4Var) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public final List b() {
        boolean z = this.c.getBoolean("bottom_nav_local", false);
        List<String> a = z ? this.b.a() : this.b.b();
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            de4 de4Var = (de4) this.a.get(str);
            Pair a2 = de4Var != null ? du8.a(str, de4Var) : null;
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            de4 de4Var2 = (de4) ((Pair) obj).b();
            if (z || de4Var2.isEnabled()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
