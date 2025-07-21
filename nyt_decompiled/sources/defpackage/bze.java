package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class bze {
    public static final bze b = new bze(new dze());
    public static final bze c = new bze(new hze());
    public static final bze d = new bze(new jze());
    public static final bze e = new bze(new ize());
    public static final bze f = new bze(new eze());
    public static final bze g = new bze(new gze());
    public static final bze h = new bze(new fze());
    private final aze a;

    public bze(kze kzeVar) {
        this.a = !hse.b() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new vye(kzeVar, null) : new xye(kzeVar, null) : new zye(kzeVar, null);
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.a.a(str);
    }
}
