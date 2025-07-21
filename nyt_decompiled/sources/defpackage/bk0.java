package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class bk0 {
    public static final bk0 a = new bk0();

    private bk0() {
    }

    public final String a(String str) {
        zq3.h(str, "bylineInfo");
        String substring = str.substring(3, str.length());
        zq3.g(substring, "substring(...)");
        return h.F(substring, " and ", ",", false, 4, null);
    }

    public final String b(String str, String str2, String str3) {
        List q = i.q(str, str2, c(str3));
        ArrayList arrayList = new ArrayList();
        for (Object obj : q) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return i.u0(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public final String c(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str != null) {
            str2 = str.toUpperCase();
            zq3.g(str2, "toUpperCase(...)");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 2432576) {
                if (hashCode != 40307892) {
                    if (hashCode == 2035660175 && str2.equals("ARTS&LEISURE")) {
                        str = "Culture";
                    }
                } else if (str2.equals("FOREIGN")) {
                    str = "International";
                }
            } else if (str2.equals("OPED")) {
                str = "Opinion";
            }
        }
        return str + "_desk";
    }

    public final String d(String str) {
        zq3.h(str, "sectionName");
        String upperCase = str.toUpperCase();
        zq3.g(upperCase, "toUpperCase(...)");
        return zq3.c(upperCase, "TODAY") ? "" : str;
    }
}
