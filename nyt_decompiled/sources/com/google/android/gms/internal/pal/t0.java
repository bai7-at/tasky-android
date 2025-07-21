package com.google.android.gms.internal.pal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.pv9;
import defpackage.zx9;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
abstract class t0 {
    static String a(zx9 zx9Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(zx9Var, sb, 0);
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
            sb.append(h1.a(zzaby.w((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzaby) {
            sb.append(": \"");
            sb.append(h1.a((zzaby) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof c0) {
            sb.append(" {");
            d((c0) obj, sb, i + 2);
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

    private static void d(zx9 zx9Var, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zx9Var.getClass().getDeclaredMethods()) {
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
                    b(sb, i, c(concat), c0.f(method2, zx9Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, c(concat2), c0.f(method3, zx9Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object f = c0.f(method4, zx9Var, new Object[0]);
                    if (method5 == null) {
                        if (f instanceof Boolean) {
                            if (((Boolean) f).booleanValue()) {
                                b(sb, i, c(concat3), f);
                            }
                        } else if (f instanceof Integer) {
                            if (((Integer) f).intValue() != 0) {
                                b(sb, i, c(concat3), f);
                            }
                        } else if (f instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) f).floatValue()) != 0) {
                                b(sb, i, c(concat3), f);
                            }
                        } else if (!(f instanceof Double)) {
                            if (f instanceof String) {
                                equals = f.equals("");
                            } else if (f instanceof zzaby) {
                                equals = f.equals(zzaby.a);
                            } else if (!(f instanceof zx9)) {
                                if ((f instanceof Enum) && ((Enum) f).ordinal() == 0) {
                                }
                                b(sb, i, c(concat3), f);
                            } else if (f != ((zx9) f).a()) {
                                b(sb, i, c(concat3), f);
                            }
                            if (!equals) {
                                b(sb, i, c(concat3), f);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) f).doubleValue()) != 0) {
                            b(sb, i, c(concat3), f);
                        }
                    } else if (((Boolean) c0.f(method5, zx9Var, new Object[0])).booleanValue()) {
                        b(sb, i, c(concat3), f);
                    }
                }
            }
        }
        if (zx9Var instanceof pv9) {
            throw null;
        }
        j1 j1Var = ((c0) zx9Var).zzc;
        if (j1Var != null) {
            j1Var.g(sb, i);
        }
    }
}
