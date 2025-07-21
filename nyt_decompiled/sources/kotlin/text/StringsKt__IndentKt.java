package kotlin.text;

import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class StringsKt__IndentKt extends i {
    private static final ss2 b(final String str) {
        return str.length() == 0 ? new ss2() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str2) {
                zq3.h(str2, "line");
                return str2;
            }
        } : new ss2() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str2) {
                zq3.h(str2, "line");
                return str + str2;
            }
        };
    }

    private static final int c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!b.c(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    public static final String d(String str, String str2) {
        Appendable r0;
        String str3;
        zq3.h(str, "<this>");
        zq3.h(str2, "newIndent");
        List k0 = h.k0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : k0) {
            if (!h.d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.i.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it2.next())));
        }
        Integer num = (Integer) kotlin.collections.i.B0(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * k0.size());
        ss2 b = b(str2);
        int n = kotlin.collections.i.n(k0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : k0) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.i.v();
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == n) && h.d0(str4)) {
                str4 = null;
            } else {
                String g1 = h.g1(str4, intValue);
                if (g1 != null && (str3 = (String) b.invoke(g1)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i = i2;
        }
        r0 = CollectionsKt___CollectionsKt.r0(arrayList3, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) r0).toString();
        zq3.g(sb, "toString(...)");
        return sb;
    }

    public static final String e(String str, String str2, String str3) {
        Appendable r0;
        int i;
        String str4;
        zq3.h(str, "<this>");
        zq3.h(str2, "newIndent");
        zq3.h(str3, "marginPrefix");
        if (h.d0(str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List k0 = h.k0(str);
        int length = str.length() + (str2.length() * k0.size());
        ss2 b = b(str2);
        int n = kotlin.collections.i.n(k0);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : k0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.i.v();
            }
            String str5 = (String) obj;
            String str6 = null;
            if ((i2 == 0 || i2 == n) && h.d0(str5)) {
                str5 = null;
            } else {
                int length2 = str5.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = -1;
                        break;
                    }
                    if (!b.c(str5.charAt(i4))) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                if (i != -1) {
                    int i5 = i;
                    if (h.J(str5, str3, i, false, 4, null)) {
                        int length3 = i5 + str3.length();
                        zq3.f(str5, "null cannot be cast to non-null type java.lang.String");
                        str6 = str5.substring(length3);
                        zq3.g(str6, "substring(...)");
                    }
                }
                if (str6 != null && (str4 = (String) b.invoke(str6)) != null) {
                    str5 = str4;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i2 = i3;
        }
        r0 = CollectionsKt___CollectionsKt.r0(arrayList, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) r0).toString();
        zq3.g(sb, "toString(...)");
        return sb;
    }

    public static String f(String str) {
        zq3.h(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        zq3.h(str, "<this>");
        zq3.h(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
