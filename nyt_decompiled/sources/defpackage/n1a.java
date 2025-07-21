package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n1a {
    public static final n1a b = new n1a(null, null);
    private final EnumMap a;

    public n1a(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.a = enumMap;
        enumMap.put((EnumMap) zzah.AD_STORAGE, (zzah) bool);
        enumMap.put((EnumMap) zzah.ANALYTICS_STORAGE, (zzah) bool2);
    }

    public static n1a a(Bundle bundle) {
        if (bundle == null) {
            return b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            enumMap.put((EnumMap) zzahVar, (zzah) n(bundle.getString(zzahVar.zzd)));
        }
        return new n1a(enumMap);
    }

    public static n1a b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i = 0;
            while (true) {
                zzah[] zzahVarArr = zzah.zzc;
                int length = zzahVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzah zzahVar = zzahVarArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) zzahVar, (zzah) bool);
                }
                i++;
            }
        }
        return new n1a(enumMap);
    }

    public static String g(Bundle bundle) {
        String string;
        for (zzah zzahVar : zzah.values()) {
            if (bundle.containsKey(zzahVar.zzd) && (string = bundle.getString(zzahVar.zzd)) != null && n(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean j(int i, int i2) {
        return i <= i2;
    }

    static final int m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final n1a c(n1a n1aVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.a.get(zzahVar);
            Boolean bool2 = (Boolean) n1aVar.a.get(zzahVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new n1a(enumMap);
    }

    public final n1a d(n1a n1aVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.a.get(zzahVar);
            if (bool == null) {
                bool = (Boolean) n1aVar.a.get(zzahVar);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new n1a(enumMap);
    }

    public final Boolean e() {
        return (Boolean) this.a.get(zzah.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1a)) {
            return false;
        }
        n1a n1aVar = (n1a) obj;
        for (zzah zzahVar : zzah.values()) {
            if (m((Boolean) this.a.get(zzahVar)) != m((Boolean) n1aVar.a.get(zzahVar))) {
                return false;
            }
        }
        return true;
    }

    public final Boolean f() {
        return (Boolean) this.a.get(zzah.ANALYTICS_STORAGE);
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahVarArr = zzah.zzc;
        int length = zzahVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.a.get(zzahVarArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it2 = this.a.values().iterator();
        int i = 17;
        while (it2.hasNext()) {
            i = (i * 31) + m((Boolean) it2.next());
        }
        return i;
    }

    public final boolean i(zzah zzahVar) {
        Boolean bool = (Boolean) this.a.get(zzahVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean k(n1a n1aVar) {
        return l(n1aVar, (zzah[]) this.a.keySet().toArray(new zzah[0]));
    }

    public final boolean l(n1a n1aVar, zzah... zzahVarArr) {
        for (zzah zzahVar : zzahVarArr) {
            Boolean bool = (Boolean) this.a.get(zzahVar);
            Boolean bool2 = (Boolean) n1aVar.a.get(zzahVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            zzah zzahVar = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(zzahVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.a.get(zzahVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public n1a(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
