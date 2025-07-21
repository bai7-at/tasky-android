package com.google.android.gms.internal.icing;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.i4d;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
abstract class p0 {
    static String a(i4d i4dVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(i4dVar, sb, 0);
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
            sb.append(c1.a(zzcf.o((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzcf) {
            sb.append(": \"");
            sb.append(c1.a((zzcf) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof z) {
            sb.append(" {");
            c((z) obj, sb, i + 2);
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
            sb.append(obj.toString());
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

    private static void c(i4d i4dVar, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : i4dVar.getClass().getDeclaredMethods()) {
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
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, d(concat), z.l(method2, i4dVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, d(concat2), z.l(method3, i4dVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object l = z.l(method4, i4dVar, new Object[0]);
                    if (method5 == null) {
                        if (l instanceof Boolean) {
                            if (((Boolean) l).booleanValue()) {
                                b(sb, i, d(concat3), l);
                            }
                        } else if (l instanceof Integer) {
                            if (((Integer) l).intValue() != 0) {
                                b(sb, i, d(concat3), l);
                            }
                        } else if (l instanceof Float) {
                            if (((Float) l).floatValue() != 0.0f) {
                                b(sb, i, d(concat3), l);
                            }
                        } else if (!(l instanceof Double)) {
                            if (l instanceof String) {
                                equals = l.equals("");
                            } else if (l instanceof zzcf) {
                                equals = l.equals(zzcf.a);
                            } else if (!(l instanceof i4d)) {
                                if ((l instanceof Enum) && ((Enum) l).ordinal() == 0) {
                                }
                                b(sb, i, d(concat3), l);
                            } else if (l != ((i4d) l).zzm()) {
                                b(sb, i, d(concat3), l);
                            }
                            if (!equals) {
                                b(sb, i, d(concat3), l);
                            }
                        } else if (((Double) l).doubleValue() != 0.0d) {
                            b(sb, i, d(concat3), l);
                        }
                    } else if (((Boolean) z.l(method5, i4dVar, new Object[0])).booleanValue()) {
                        b(sb, i, d(concat3), l);
                    }
                }
            }
        }
        e1 e1Var = ((z) i4dVar).zzc;
        if (e1Var != null) {
            e1Var.e(sb, i);
        }
    }

    private static final String d(String str) {
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
}
