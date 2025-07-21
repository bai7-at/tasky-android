package defpackage;

import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class l25 {
    private final Navigator a;
    private final int b;
    private final String c;
    private CharSequence d;
    private Map e;
    private List f;
    private Map g;

    public l25(Navigator navigator, int i, String str) {
        zq3.h(navigator, "navigator");
        this.a = navigator;
        this.b = i;
        this.c = str;
        this.e = new LinkedHashMap();
        this.f = new ArrayList();
        this.g = new LinkedHashMap();
    }

    public NavDestination a() {
        NavDestination a = this.a.a();
        a.C(this.d);
        for (Map.Entry entry : this.e.entrySet()) {
            a.c((String) entry.getKey(), (a) entry.getValue());
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            a.f((NavDeepLink) it2.next());
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            lh4.a(entry2.getValue());
            a.A(intValue, null);
        }
        String str = this.c;
        if (str != null) {
            a.E(str);
        }
        int i = this.b;
        if (i != -1) {
            a.B(i);
        }
        return a;
    }

    public final String b() {
        return this.c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l25(Navigator navigator, String str) {
        this(navigator, -1, str);
        zq3.h(navigator, "navigator");
    }
}
