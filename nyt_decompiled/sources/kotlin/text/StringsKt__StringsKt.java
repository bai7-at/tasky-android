package kotlin.text;

import defpackage.ak7;
import defpackage.an3;
import defpackage.du8;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ym3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class StringsKt__StringsKt extends p {
    public static final void A0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static final List B0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        zq3.h(charSequence, "<this>");
        zq3.h(cArr, "delimiters");
        if (cArr.length == 1) {
            return D0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable h = kotlin.sequences.d.h(s0(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.i.w(h, 10));
        Iterator it2 = h.iterator();
        while (it2.hasNext()) {
            arrayList.add(M0(charSequence, (an3) it2.next()));
        }
        return arrayList;
    }

    public static final List C0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        zq3.h(charSequence, "<this>");
        zq3.h(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return D0(charSequence, str, z, i);
            }
        }
        Iterable h = kotlin.sequences.d.h(t0(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.i.w(h, 10));
        Iterator it2 = h.iterator();
        while (it2.hasNext()) {
            arrayList.add(M0(charSequence, (an3) it2.next()));
        }
        return arrayList;
    }

    private static final List D0(CharSequence charSequence, String str, boolean z, int i) {
        A0(i);
        int i2 = 0;
        int X = X(charSequence, str, 0, z);
        if (X == -1 || i == 1) {
            return kotlin.collections.i.e(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? uo6.i(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i2, X).toString());
            i2 = str.length() + X;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            X = X(charSequence, str, i2, z);
        } while (X != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List E0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return B0(charSequence, cArr, z, i);
    }

    public static /* synthetic */ List F0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return C0(charSequence, strArr, z, i);
    }

    public static final ak7 G0(final CharSequence charSequence, String[] strArr, boolean z, int i) {
        zq3.h(charSequence, "<this>");
        zq3.h(strArr, "delimiters");
        return kotlin.sequences.d.r(t0(charSequence, strArr, 0, z, i, 2, null), new ss2() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(an3 an3Var) {
                zq3.h(an3Var, "it");
                return StringsKt__StringsKt.M0(charSequence, an3Var);
            }
        });
    }

    public static /* synthetic */ ak7 H0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return G0(charSequence, strArr, z, i);
    }

    public static final boolean I0(CharSequence charSequence, char c, boolean z) {
        zq3.h(charSequence, "<this>");
        return charSequence.length() > 0 && c.g(charSequence.charAt(0), c, z);
    }

    public static final boolean J0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        zq3.h(charSequence, "<this>");
        zq3.h(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? h.K((String) charSequence, (String) charSequence2, false, 2, null) : u0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean K0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return I0(charSequence, c, z);
    }

    public static /* synthetic */ boolean L0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return J0(charSequence, charSequence2, z);
    }

    public static final boolean M(CharSequence charSequence, char c, boolean z) {
        zq3.h(charSequence, "<this>");
        return h.a0(charSequence, c, 0, z, 2, null) >= 0;
    }

    public static final String M0(CharSequence charSequence, an3 an3Var) {
        zq3.h(charSequence, "<this>");
        zq3.h(an3Var, "range");
        return charSequence.subSequence(an3Var.a().intValue(), an3Var.f().intValue() + 1).toString();
    }

    public static boolean N(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        zq3.h(charSequence, "<this>");
        zq3.h(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (h.b0(charSequence, (String) charSequence2, 0, z, 2, null) < 0) {
                return false;
            }
        } else if (Z(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static final String N0(String str, char c, String str2) {
        zq3.h(str, "<this>");
        zq3.h(str2, "missingDelimiterValue");
        int a0 = h.a0(str, c, 0, false, 6, null);
        if (a0 == -1) {
            return str2;
        }
        String substring = str.substring(a0 + 1, str.length());
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return M(charSequence, c, z);
    }

    public static final String O0(String str, String str2, String str3) {
        zq3.h(str, "<this>");
        zq3.h(str2, "delimiter");
        zq3.h(str3, "missingDelimiterValue");
        int b0 = h.b0(str, str2, 0, false, 6, null);
        if (b0 == -1) {
            return str3;
        }
        String substring = str.substring(b0 + str2.length(), str.length());
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return h.N(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String P0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return N0(str, c, str2);
    }

    public static final boolean Q(CharSequence charSequence, char c, boolean z) {
        zq3.h(charSequence, "<this>");
        return charSequence.length() > 0 && c.g(charSequence.charAt(h.V(charSequence)), c, z);
    }

    public static /* synthetic */ String Q0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return O0(str, str2, str3);
    }

    public static boolean R(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        zq3.h(charSequence, "<this>");
        zq3.h(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? h.v((String) charSequence, (String) charSequence2, false, 2, null) : u0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static String R0(String str, char c, String str2) {
        zq3.h(str, "<this>");
        zq3.h(str2, "missingDelimiterValue");
        int g0 = h.g0(str, c, 0, false, 6, null);
        if (g0 == -1) {
            return str2;
        }
        String substring = str.substring(g0 + 1, str.length());
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean S(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return Q(charSequence, c, z);
    }

    public static final String S0(String str, String str2, String str3) {
        zq3.h(str, "<this>");
        zq3.h(str2, "delimiter");
        zq3.h(str3, "missingDelimiterValue");
        int h0 = h.h0(str, str2, 0, false, 6, null);
        if (h0 == -1) {
            return str3;
        }
        String substring = str.substring(h0 + str2.length(), str.length());
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return h.R(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String T0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return h.R0(str, c, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair U(CharSequence charSequence, Collection collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        if (!z && collection.size() == 1) {
            String str = (String) kotlin.collections.i.I0(collection);
            int b0 = !z2 ? h.b0(charSequence, str, i, false, 4, null) : h.h0(charSequence, str, i, false, 4, null);
            if (b0 < 0) {
                return null;
            }
            return du8.a(Integer.valueOf(b0), str);
        }
        ym3 an3Var = !z2 ? new an3(uo6.d(i, 0), charSequence.length()) : uo6.r(uo6.i(i, h.V(charSequence)), 0);
        if (charSequence instanceof String) {
            int g = an3Var.g();
            int j = an3Var.j();
            int n = an3Var.n();
            if ((n > 0 && g <= j) || (n < 0 && j <= g)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        String str2 = (String) obj2;
                        if (h.z(str2, 0, (String) charSequence, g, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (g == j) {
                            break;
                        }
                        g += n;
                    } else {
                        return du8.a(Integer.valueOf(g), str3);
                    }
                }
            }
        } else {
            int g2 = an3Var.g();
            int j2 = an3Var.j();
            int n2 = an3Var.n();
            if ((n2 > 0 && g2 <= j2) || (n2 < 0 && j2 <= g2)) {
                while (true) {
                    Iterator it3 = collection.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        String str4 = (String) obj;
                        if (u0(str4, 0, charSequence, g2, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (g2 == j2) {
                            break;
                        }
                        g2 += n2;
                    } else {
                        return du8.a(Integer.valueOf(g2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String U0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return S0(str, str2, str3);
    }

    public static int V(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final String V0(String str, char c, String str2) {
        zq3.h(str, "<this>");
        zq3.h(str2, "missingDelimiterValue");
        int a0 = h.a0(str, c, 0, false, 6, null);
        if (a0 == -1) {
            return str2;
        }
        String substring = str.substring(0, a0);
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static final int W(CharSequence charSequence, char c, int i, boolean z) {
        zq3.h(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? c0(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final String W0(String str, String str2, String str3) {
        zq3.h(str, "<this>");
        zq3.h(str2, "delimiter");
        zq3.h(str3, "missingDelimiterValue");
        int b0 = h.b0(str, str2, 0, false, 6, null);
        if (b0 == -1) {
            return str3;
        }
        String substring = str.substring(0, b0);
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static final int X(CharSequence charSequence, String str, int i, boolean z) {
        zq3.h(charSequence, "<this>");
        zq3.h(str, "string");
        return (z || !(charSequence instanceof String)) ? Z(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ String X0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return V0(str, c, str2);
    }

    private static final int Y(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ym3 an3Var = !z2 ? new an3(uo6.d(i, 0), uo6.i(i2, charSequence.length())) : uo6.r(uo6.i(i, h.V(charSequence)), uo6.d(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int g = an3Var.g();
            int j = an3Var.j();
            int n = an3Var.n();
            if ((n <= 0 || g > j) && (n >= 0 || j > g)) {
                return -1;
            }
            while (!h.z((String) charSequence2, 0, (String) charSequence, g, charSequence2.length(), z)) {
                if (g == j) {
                    return -1;
                }
                g += n;
            }
            return g;
        }
        int g2 = an3Var.g();
        int j2 = an3Var.j();
        int n2 = an3Var.n();
        if ((n2 <= 0 || g2 > j2) && (n2 >= 0 || j2 > g2)) {
            return -1;
        }
        while (!u0(charSequence2, 0, charSequence, g2, charSequence2.length(), z)) {
            if (g2 == j2) {
                return -1;
            }
            g2 += n2;
        }
        return g2;
    }

    public static /* synthetic */ String Y0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return W0(str, str2, str3);
    }

    static /* synthetic */ int Z(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return Y(charSequence, charSequence2, i, i2, z, z2);
    }

    public static final String Z0(String str, char c, String str2) {
        zq3.h(str, "<this>");
        zq3.h(str2, "missingDelimiterValue");
        int g0 = h.g0(str, c, 0, false, 6, null);
        if (g0 == -1) {
            return str2;
        }
        String substring = str.substring(0, g0);
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ int a0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return W(charSequence, c, i, z);
    }

    public static /* synthetic */ String a1(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return Z0(str, c, str2);
    }

    public static /* synthetic */ int b0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return X(charSequence, str, i, z);
    }

    public static Boolean b1(String str) {
        zq3.h(str, "<this>");
        if (zq3.c(str, "true")) {
            return Boolean.TRUE;
        }
        if (zq3.c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int c0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        zq3.h(charSequence, "<this>");
        zq3.h(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.d.w0(cArr), i);
        }
        int d = uo6.d(i, 0);
        int V = h.V(charSequence);
        if (d > V) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(d);
            for (char c : cArr) {
                if (c.g(c, charAt, z)) {
                    return d;
                }
            }
            if (d == V) {
                return -1;
            }
            d++;
        }
    }

    public static CharSequence c1(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = b.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!c) {
                    break;
                }
                length--;
            } else if (c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean d0(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!b.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String d1(String str, char... cArr) {
        zq3.h(str, "<this>");
        zq3.h(cArr, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean T = kotlin.collections.d.T(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!T) {
                    break;
                }
                length--;
            } else if (T) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static final int e0(CharSequence charSequence, char c, int i, boolean z) {
        zq3.h(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? i0(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static CharSequence e1(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!b.c(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static final int f0(CharSequence charSequence, String str, int i, boolean z) {
        zq3.h(charSequence, "<this>");
        zq3.h(str, "string");
        return (z || !(charSequence instanceof String)) ? Y(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static CharSequence f1(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!b.c(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static /* synthetic */ int g0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = h.V(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return e0(charSequence, c, i, z);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = h.V(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return f0(charSequence, str, i, z);
    }

    public static final int i0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        zq3.h(charSequence, "<this>");
        zq3.h(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.d.w0(cArr), i);
        }
        for (int i2 = uo6.i(i, h.V(charSequence)); -1 < i2; i2--) {
            char charAt = charSequence.charAt(i2);
            for (char c : cArr) {
                if (c.g(c, charAt, z)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static final ak7 j0(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        return H0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static List k0(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        return kotlin.sequences.d.w(j0(charSequence));
    }

    public static final CharSequence l0(CharSequence charSequence, int i, char c) {
        zq3.h(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(charSequence);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return sb;
    }

    public static final String m0(String str, int i, char c) {
        zq3.h(str, "<this>");
        return l0(str, i, c).toString();
    }

    public static /* synthetic */ String n0(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m0(str, i, c);
    }

    public static final CharSequence o0(CharSequence charSequence, int i, char c) {
        zq3.h(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String p0(String str, int i, char c) {
        zq3.h(str, "<this>");
        return o0(str, i, c).toString();
    }

    private static final ak7 q0(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        A0(i2);
        return new d(charSequence, i, i2, new gt2() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final Pair b(CharSequence charSequence2, int i3) {
                zq3.h(charSequence2, "$this$$receiver");
                int c0 = StringsKt__StringsKt.c0(charSequence2, cArr, i3, z);
                if (c0 < 0) {
                    return null;
                }
                return du8.a(Integer.valueOf(c0), 1);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((CharSequence) obj, ((Number) obj2).intValue());
            }
        });
    }

    private static final ak7 r0(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        A0(i2);
        final List e = kotlin.collections.d.e(strArr);
        return new d(charSequence, i, i2, new gt2() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final Pair b(CharSequence charSequence2, int i3) {
                Pair U;
                zq3.h(charSequence2, "$this$$receiver");
                U = StringsKt__StringsKt.U(charSequence2, e, i3, z, false);
                if (U != null) {
                    return du8.a(U.c(), Integer.valueOf(((String) U.d()).length()));
                }
                return null;
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((CharSequence) obj, ((Number) obj2).intValue());
            }
        });
    }

    static /* synthetic */ ak7 s0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return q0(charSequence, cArr, i, z, i2);
    }

    static /* synthetic */ ak7 t0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return r0(charSequence, strArr, i, z, i2);
    }

    public static final boolean u0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        zq3.h(charSequence, "<this>");
        zq3.h(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!c.g(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String v0(String str, CharSequence charSequence) {
        zq3.h(str, "<this>");
        zq3.h(charSequence, "prefix");
        if (!L0(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static String w0(String str, CharSequence charSequence) {
        zq3.h(str, "<this>");
        zq3.h(charSequence, "suffix");
        if (!h.T(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static String x0(String str, CharSequence charSequence) {
        zq3.h(str, "<this>");
        zq3.h(charSequence, "delimiter");
        return y0(str, charSequence, charSequence);
    }

    public static final String y0(String str, CharSequence charSequence, CharSequence charSequence2) {
        zq3.h(str, "<this>");
        zq3.h(charSequence, "prefix");
        zq3.h(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !L0(str, charSequence, false, 2, null) || !h.T(str, charSequence2, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        zq3.g(substring, "substring(...)");
        return substring;
    }

    public static CharSequence z0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        zq3.h(charSequence, "<this>");
        zq3.h(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            zq3.g(sb, "append(...)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            zq3.g(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }
}
