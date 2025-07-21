package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class r48 {
    private static Map a;
    public static final String b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put('\'', "\\'");
        a.put('\"', "\\\"");
        a.put('\\', "\\\\");
        a.put('/', "\\/");
        a.put('\b', "\\b");
        a.put('\n', "\\n");
        a.put('\t', "\\t");
        a.put('\f', "\\f");
        a.put('\r', "\\r");
        b = System.getProperty("line.separator");
    }

    public static List a(String str) {
        if (!b(str)) {
            return mn0.j(new ArrayList(0));
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (b(str2)) {
                arrayList.add(str2);
            }
        }
        return mn0.j(arrayList);
    }

    public static boolean b(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static boolean c(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (d(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str) {
        return !b(str);
    }

    public static boolean e(String str) {
        if (d(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String f(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (b((String) list.get(i))) {
                sb.append((String) list.get(i));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public static String g(List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Number number = (Number) it2.next();
                if (number != null) {
                    arrayList.add(number.toString());
                }
            }
        } else {
            arrayList = null;
        }
        return f(arrayList);
    }
}
