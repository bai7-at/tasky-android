package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class rma {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static caa a(String str, qx9 qx9Var, xhe xheVar, List list) {
        String str2;
        char c;
        double d;
        String str3;
        double d2;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c = 0;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c = 2;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    str2 = "toString";
                    c = 3;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c = 1;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            default:
                str2 = "toString";
                c = 65535;
                break;
        }
        l1a l1aVar = null;
        switch (c) {
            case 0:
                caa zzd = qx9Var.zzd();
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        caa b = xheVar.b((caa) it2.next());
                        if (b instanceof d0a) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        qx9 qx9Var2 = (qx9) zzd;
                        int e = qx9Var2.e();
                        if (b instanceof qx9) {
                            qx9 qx9Var3 = (qx9) b;
                            Iterator j = qx9Var3.j();
                            while (j.hasNext()) {
                                Integer num = (Integer) j.next();
                                qx9Var2.t(num.intValue() + e, qx9Var3.f(num.intValue()));
                            }
                        } else {
                            qx9Var2.t(e, b);
                        }
                    }
                }
                return zzd;
            case 1:
                s0f.h("every", 1, list);
                caa b2 = xheVar.b((caa) list.get(0));
                if (!(b2 instanceof a9a)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (qx9Var.e() != 0 && b(qx9Var, xheVar, (a9a) b2, Boolean.FALSE, Boolean.TRUE).e() != qx9Var.e()) {
                    return caa.c0;
                }
                return caa.b0;
            case 2:
                s0f.h("filter", 1, list);
                caa b3 = xheVar.b((caa) list.get(0));
                if (!(b3 instanceof a9a)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (qx9Var.c() == 0) {
                    return new qx9();
                }
                caa zzd2 = qx9Var.zzd();
                qx9 b4 = b(qx9Var, xheVar, (a9a) b3, null, Boolean.TRUE);
                qx9 qx9Var4 = new qx9();
                Iterator j2 = b4.j();
                while (j2.hasNext()) {
                    qx9Var4.t(qx9Var4.e(), ((qx9) zzd2).f(((Integer) j2.next()).intValue()));
                }
                return qx9Var4;
            case 3:
                s0f.h("forEach", 1, list);
                caa b5 = xheVar.b((caa) list.get(0));
                if (!(b5 instanceof a9a)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (qx9Var.c() == 0) {
                    return caa.T;
                }
                b(qx9Var, xheVar, (a9a) b5, null, null);
                return caa.T;
            case 4:
                s0f.j("indexOf", 2, list);
                caa caaVar = caa.T;
                if (!list.isEmpty()) {
                    caaVar = xheVar.b((caa) list.get(0));
                }
                if (list.size() > 1) {
                    d = s0f.a(xheVar.b((caa) list.get(1)).zzh().doubleValue());
                    if (d >= qx9Var.e()) {
                        return new q0a(Double.valueOf(-1.0d));
                    }
                    if (d < 0.0d) {
                        d += qx9Var.e();
                    }
                } else {
                    d = 0.0d;
                }
                Iterator j3 = qx9Var.j();
                while (j3.hasNext()) {
                    int intValue = ((Integer) j3.next()).intValue();
                    double d3 = intValue;
                    if (d3 >= d && s0f.l(qx9Var.f(intValue), caaVar)) {
                        return new q0a(Double.valueOf(d3));
                    }
                }
                return new q0a(Double.valueOf(-1.0d));
            case 5:
                s0f.j("join", 1, list);
                if (qx9Var.e() == 0) {
                    return caa.d0;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    caa b6 = xheVar.b((caa) list.get(0));
                    str3 = ((b6 instanceof s7a) || (b6 instanceof qda)) ? "" : b6.zzi();
                }
                return new eda(qx9Var.g(str3));
            case 6:
                s0f.j("lastIndexOf", 2, list);
                caa caaVar2 = caa.T;
                if (!list.isEmpty()) {
                    caaVar2 = xheVar.b((caa) list.get(0));
                }
                double e2 = qx9Var.e() - 1;
                if (list.size() > 1) {
                    caa b7 = xheVar.b((caa) list.get(1));
                    e2 = Double.isNaN(b7.zzh().doubleValue()) ? qx9Var.e() - 1 : s0f.a(b7.zzh().doubleValue());
                    d2 = 0.0d;
                    if (e2 < 0.0d) {
                        e2 += qx9Var.e();
                    }
                } else {
                    d2 = 0.0d;
                }
                if (e2 < d2) {
                    return new q0a(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min(qx9Var.e(), e2); min >= 0; min--) {
                    if (qx9Var.u(min) && s0f.l(qx9Var.f(min), caaVar2)) {
                        return new q0a(Double.valueOf(min));
                    }
                }
                return new q0a(Double.valueOf(-1.0d));
            case 7:
                s0f.h("map", 1, list);
                caa b8 = xheVar.b((caa) list.get(0));
                if (b8 instanceof a9a) {
                    return qx9Var.e() == 0 ? new qx9() : b(qx9Var, xheVar, (a9a) b8, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                s0f.h("pop", 0, list);
                int e3 = qx9Var.e();
                if (e3 == 0) {
                    return caa.T;
                }
                int i = e3 - 1;
                caa f = qx9Var.f(i);
                qx9Var.q(i);
                return f;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        qx9Var.t(qx9Var.e(), xheVar.b((caa) it3.next()));
                    }
                }
                return new q0a(Double.valueOf(qx9Var.e()));
            case '\n':
                return c(qx9Var, xheVar, list, true);
            case 11:
                return c(qx9Var, xheVar, list, false);
            case '\f':
                s0f.h("reverse", 0, list);
                int e4 = qx9Var.e();
                if (e4 != 0) {
                    for (int i2 = 0; i2 < e4 / 2; i2++) {
                        if (qx9Var.u(i2)) {
                            caa f2 = qx9Var.f(i2);
                            qx9Var.t(i2, null);
                            int i3 = (e4 - 1) - i2;
                            if (qx9Var.u(i3)) {
                                qx9Var.t(i2, qx9Var.f(i3));
                            }
                            qx9Var.t(i3, f2);
                        }
                    }
                }
                return qx9Var;
            case '\r':
                s0f.h("shift", 0, list);
                if (qx9Var.e() == 0) {
                    return caa.T;
                }
                caa f3 = qx9Var.f(0);
                qx9Var.q(0);
                return f3;
            case 14:
                s0f.j("slice", 2, list);
                if (list.isEmpty()) {
                    return qx9Var.zzd();
                }
                double e5 = qx9Var.e();
                double a = s0f.a(xheVar.b((caa) list.get(0)).zzh().doubleValue());
                double max = a < 0.0d ? Math.max(a + e5, 0.0d) : Math.min(a, e5);
                if (list.size() == 2) {
                    double a2 = s0f.a(xheVar.b((caa) list.get(1)).zzh().doubleValue());
                    e5 = a2 < 0.0d ? Math.max(e5 + a2, 0.0d) : Math.min(e5, a2);
                }
                qx9 qx9Var5 = new qx9();
                for (int i4 = (int) max; i4 < e5; i4++) {
                    qx9Var5.t(qx9Var5.e(), qx9Var.f(i4));
                }
                return qx9Var5;
            case 15:
                s0f.h("some", 1, list);
                caa b9 = xheVar.b((caa) list.get(0));
                if (!(b9 instanceof l1a)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (qx9Var.e() == 0) {
                    return caa.c0;
                }
                l1a l1aVar2 = (l1a) b9;
                Iterator j4 = qx9Var.j();
                while (j4.hasNext()) {
                    int intValue2 = ((Integer) j4.next()).intValue();
                    if (qx9Var.u(intValue2) && l1aVar2.b(xheVar, Arrays.asList(qx9Var.f(intValue2), new q0a(Double.valueOf(intValue2)), qx9Var)).zzg().booleanValue()) {
                        return caa.b0;
                    }
                }
                return caa.c0;
            case 16:
                s0f.j("sort", 1, list);
                if (qx9Var.e() >= 2) {
                    List k = qx9Var.k();
                    if (!list.isEmpty()) {
                        caa b10 = xheVar.b((caa) list.get(0));
                        if (!(b10 instanceof l1a)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        l1aVar = (l1a) b10;
                    }
                    Collections.sort(k, new nla(l1aVar, xheVar));
                    qx9Var.o();
                    Iterator it4 = k.iterator();
                    int i5 = 0;
                    while (it4.hasNext()) {
                        qx9Var.t(i5, (caa) it4.next());
                        i5++;
                    }
                }
                return qx9Var;
            case 17:
                if (list.isEmpty()) {
                    return new qx9();
                }
                int a3 = (int) s0f.a(xheVar.b((caa) list.get(0)).zzh().doubleValue());
                if (a3 < 0) {
                    a3 = Math.max(0, a3 + qx9Var.e());
                } else if (a3 > qx9Var.e()) {
                    a3 = qx9Var.e();
                }
                int e6 = qx9Var.e();
                qx9 qx9Var6 = new qx9();
                if (list.size() > 1) {
                    int max2 = Math.max(0, (int) s0f.a(xheVar.b((caa) list.get(1)).zzh().doubleValue()));
                    if (max2 > 0) {
                        for (int i6 = a3; i6 < Math.min(e6, a3 + max2); i6++) {
                            qx9Var6.t(qx9Var6.e(), qx9Var.f(a3));
                            qx9Var.q(a3);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i7 = 2; i7 < list.size(); i7++) {
                            caa b11 = xheVar.b((caa) list.get(i7));
                            if (b11 instanceof d0a) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            qx9Var.p((a3 + i7) - 2, b11);
                        }
                    }
                } else {
                    while (a3 < e6) {
                        qx9Var6.t(qx9Var6.e(), qx9Var.f(a3));
                        qx9Var.t(a3, null);
                        a3++;
                    }
                }
                return qx9Var6;
            case 18:
                s0f.h(str2, 0, list);
                return new eda(qx9Var.g(","));
            case 19:
                if (!list.isEmpty()) {
                    qx9 qx9Var7 = new qx9();
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        caa b12 = xheVar.b((caa) it5.next());
                        if (b12 instanceof d0a) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        qx9Var7.t(qx9Var7.e(), b12);
                    }
                    int e7 = qx9Var7.e();
                    Iterator j5 = qx9Var.j();
                    while (j5.hasNext()) {
                        Integer num2 = (Integer) j5.next();
                        qx9Var7.t(num2.intValue() + e7, qx9Var.f(num2.intValue()));
                    }
                    qx9Var.o();
                    Iterator j6 = qx9Var7.j();
                    while (j6.hasNext()) {
                        Integer num3 = (Integer) j6.next();
                        qx9Var.t(num3.intValue(), qx9Var7.f(num3.intValue()));
                    }
                }
                return new q0a(Double.valueOf(qx9Var.e()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static qx9 b(qx9 qx9Var, xhe xheVar, l1a l1aVar, Boolean bool, Boolean bool2) {
        qx9 qx9Var2 = new qx9();
        Iterator j = qx9Var.j();
        while (j.hasNext()) {
            int intValue = ((Integer) j.next()).intValue();
            if (qx9Var.u(intValue)) {
                caa b = l1aVar.b(xheVar, Arrays.asList(qx9Var.f(intValue), new q0a(Double.valueOf(intValue)), qx9Var));
                if (b.zzg().equals(bool)) {
                    return qx9Var2;
                }
                if (bool2 == null || b.zzg().equals(bool2)) {
                    qx9Var2.t(intValue, b);
                }
            }
        }
        return qx9Var2;
    }

    private static caa c(qx9 qx9Var, xhe xheVar, List list, boolean z) {
        caa caaVar;
        s0f.i("reduce", 1, list);
        s0f.j("reduce", 2, list);
        caa b = xheVar.b((caa) list.get(0));
        if (!(b instanceof l1a)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            caaVar = xheVar.b((caa) list.get(1));
            if (caaVar instanceof d0a) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (qx9Var.e() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            caaVar = null;
        }
        l1a l1aVar = (l1a) b;
        int e = qx9Var.e();
        int i = z ? 0 : e - 1;
        int i2 = z ? e - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (caaVar == null) {
            caaVar = qx9Var.f(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (qx9Var.u(i)) {
                caaVar = l1aVar.b(xheVar, Arrays.asList(caaVar, qx9Var.f(i), new q0a(Double.valueOf(i)), qx9Var));
                if (caaVar instanceof d0a) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return caaVar;
    }
}
