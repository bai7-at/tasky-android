package com.google.android.gms.internal.ads;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.w1f;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
abstract class oi {
    private static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(w1f w1fVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(w1fVar, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                b(sb, i, str, it2.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                b(sb, i, str, (Map.Entry) it3.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append(QueryKeys.END_MARKER);
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(ej.a(zzgyl.E((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgyl) {
            sb.append(": \"");
            sb.append(ej.a((zzgyl) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof yh) {
            sb.append(" {");
            d((yh) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i3, TransferTable.COLUMN_KEY, entry.getKey());
        b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    private static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    private static void d(w1f w1fVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = w1fVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i, substring.substring(0, substring.length() - 4), yh.z(method2, w1fVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i, substring.substring(0, substring.length() - 3), yh.z(method, w1fVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object z = yh.z(method4, w1fVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) yh.z(method5, w1fVar, new Object[0])).booleanValue()) {
                        }
                        b(sb, i, substring, z);
                    } else if (z instanceof Boolean) {
                        if (!((Boolean) z).booleanValue()) {
                        }
                        b(sb, i, substring, z);
                    } else if (z instanceof Integer) {
                        if (((Integer) z).intValue() == 0) {
                        }
                        b(sb, i, substring, z);
                    } else if (z instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) z).floatValue()) == 0) {
                        }
                        b(sb, i, substring, z);
                    } else if (z instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) z).doubleValue()) == 0) {
                        }
                        b(sb, i, substring, z);
                    } else {
                        if (z instanceof String) {
                            equals = z.equals("");
                        } else if (z instanceof zzgyl) {
                            equals = z.equals(zzgyl.a);
                        } else if (z instanceof w1f) {
                            if (z == ((w1f) z).a()) {
                            }
                            b(sb, i, substring, z);
                        } else {
                            if ((z instanceof Enum) && ((Enum) z).ordinal() == 0) {
                            }
                            b(sb, i, substring, z);
                        }
                        if (equals) {
                        }
                        b(sb, i, substring, z);
                    }
                }
            }
            i2 = 3;
        }
        gj gjVar = ((yh) w1fVar).zzc;
        if (gjVar != null) {
            gjVar.i(sb, i);
        }
    }
}
