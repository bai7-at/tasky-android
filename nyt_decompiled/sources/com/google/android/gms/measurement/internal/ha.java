package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
abstract class ha {
    final String a;
    final int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;

    ha(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private static Boolean d(String str, int i, boolean z, String str2, List list, String str3, x3 x3Var) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (x3Var != null) {
                            x3Var.v().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean e(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.j jVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(jVar);
        if (jVar.x()) {
            if (jVar.C() != 1) {
                if (jVar.C() == 5) {
                    if (!jVar.B() || !jVar.A()) {
                        return null;
                    }
                } else if (!jVar.y()) {
                    return null;
                }
                int C = jVar.C();
                if (jVar.C() == 5) {
                    if (t9.M(jVar.v()) && t9.M(jVar.u())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(jVar.v());
                            bigDecimal4 = new BigDecimal(jVar.u());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!t9.M(jVar.t())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(jVar.t());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (C == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = C - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    static Boolean f(String str, com.google.android.gms.internal.measurement.o oVar, x3 x3Var) {
        List list;
        Preconditions.checkNotNull(oVar);
        if (str == null || !oVar.z() || oVar.A() == 1) {
            return null;
        }
        if (oVar.A() == 7) {
            if (oVar.r() == 0) {
                return null;
            }
        } else if (!oVar.y()) {
            return null;
        }
        int A = oVar.A();
        boolean w = oVar.w();
        String u = (w || A == 2 || A == 7) ? oVar.u() : oVar.u().toUpperCase(Locale.ENGLISH);
        if (oVar.r() == 0) {
            list = null;
        } else {
            List v = oVar.v();
            if (!w) {
                ArrayList arrayList = new ArrayList(v.size());
                Iterator it2 = v.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((String) it2.next()).toUpperCase(Locale.ENGLISH));
                }
                v = Collections.unmodifiableList(arrayList);
            }
            list = v;
        }
        return d(str, A, w, u, list, A == 2 ? u : null, x3Var);
    }

    static Boolean g(double d, com.google.android.gms.internal.measurement.j jVar) {
        try {
            return e(new BigDecimal(d), jVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(long j, com.google.android.gms.internal.measurement.j jVar) {
        try {
            return e(new BigDecimal(j), jVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(String str, com.google.android.gms.internal.measurement.j jVar) {
        if (!t9.M(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), jVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    abstract int a();

    abstract boolean b();

    abstract boolean c();
}
