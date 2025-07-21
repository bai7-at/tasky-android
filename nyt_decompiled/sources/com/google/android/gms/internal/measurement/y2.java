package com.google.android.gms.internal.measurement;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.cef;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
abstract class y2 {
    static String a(cef cefVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(cefVar, sb, 0);
        return sb.toString();
    }

    static final void b(StringBuilder sb, int i, String str, Object obj) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(k3.a(zzjb.t((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzjb) {
            sb.append(": \"");
            sb.append(k3.a((zzjb) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof j2) {
            sb.append(" {");
            d((j2) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        b(sb, i4, TransferTable.COLUMN_KEY, entry.getKey());
        b(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    private static final String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(QueryKeys.END_MARKER);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void d(cef cefVar, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : cefVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, c(concat), j2.n(method2, cefVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, c(concat2), j2.n(method3, cefVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object n = j2.n(method4, cefVar, new Object[0]);
                    if (method5 == null) {
                        if (n instanceof Boolean) {
                            if (((Boolean) n).booleanValue()) {
                                b(sb, i, c(concat3), n);
                            }
                        } else if (n instanceof Integer) {
                            if (((Integer) n).intValue() != 0) {
                                b(sb, i, c(concat3), n);
                            }
                        } else if (n instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) n).floatValue()) != 0) {
                                b(sb, i, c(concat3), n);
                            }
                        } else if (!(n instanceof Double)) {
                            if (n instanceof String) {
                                equals = n.equals("");
                            } else if (n instanceof zzjb) {
                                equals = n.equals(zzjb.a);
                            } else if (!(n instanceof cef)) {
                                if ((n instanceof Enum) && ((Enum) n).ordinal() == 0) {
                                }
                                b(sb, i, c(concat3), n);
                            } else if (n != ((cef) n).a()) {
                                b(sb, i, c(concat3), n);
                            }
                            if (!equals) {
                                b(sb, i, c(concat3), n);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) n).doubleValue()) != 0) {
                            b(sb, i, c(concat3), n);
                        }
                    } else if (((Boolean) j2.n(method5, cefVar, new Object[0])).booleanValue()) {
                        b(sb, i, c(concat3), n);
                    }
                }
            }
        }
        m3 m3Var = ((j2) cefVar).zzc;
        if (m3Var != null) {
            m3Var.g(sb, i);
        }
    }
}
