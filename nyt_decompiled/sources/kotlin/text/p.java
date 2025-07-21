package kotlin.text;

import defpackage.uo6;
import defpackage.yj0;
import defpackage.z38;
import defpackage.zq3;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class p extends o {
    public static /* synthetic */ boolean A(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return h.z(str, i, str2, i2, i3, z);
    }

    public static String B(CharSequence charSequence, int i) {
        zq3.h(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String sb2 = sb.toString();
        zq3.e(sb2);
        return sb2;
    }

    public static final String C(String str, char c, char c2, boolean z) {
        zq3.h(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            zq3.g(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (c.g(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public static String D(String str, String str2, String str3, boolean z) {
        zq3.h(str, "<this>");
        zq3.h(str2, "oldValue");
        zq3.h(str3, "newValue");
        int i = 0;
        int X = StringsKt__StringsKt.X(str, str2, 0, z);
        if (X < 0) {
            return str;
        }
        int length = str2.length();
        int d = uo6.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, X);
            sb.append(str3);
            i = X + length;
            if (X >= str.length()) {
                break;
            }
            X = StringsKt__StringsKt.X(str, str2, X + d, z);
        } while (X > 0);
        sb.append((CharSequence) str, i, str.length());
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String E(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return C(str, c, c2, z);
    }

    public static /* synthetic */ String F(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return h.D(str, str2, str3, z);
    }

    public static String G(String str, String str2, String str3, boolean z) {
        zq3.h(str, "<this>");
        zq3.h(str2, "oldValue");
        zq3.h(str3, "newValue");
        int b0 = h.b0(str, str2, 0, z, 2, null);
        return b0 < 0 ? str : h.z0(str, b0, str2.length() + b0, str3).toString();
    }

    public static boolean H(String str, String str2, int i, boolean z) {
        zq3.h(str, "<this>");
        zq3.h(str2, "prefix");
        return !z ? str.startsWith(str2, i) : h.z(str, i, str2, 0, str2.length(), z);
    }

    public static boolean I(String str, String str2, boolean z) {
        zq3.h(str, "<this>");
        zq3.h(str2, "prefix");
        return !z ? str.startsWith(str2) : h.z(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean J(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return h.H(str, str2, i, z);
    }

    public static /* synthetic */ boolean K(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return h.I(str, str2, z);
    }

    public static String p(char[] cArr) {
        zq3.h(cArr, "<this>");
        return new String(cArr);
    }

    public static String q(char[] cArr, int i, int i2) {
        zq3.h(cArr, "<this>");
        kotlin.collections.a.a.a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static String r(byte[] bArr) {
        zq3.h(bArr, "<this>");
        return new String(bArr, yj0.b);
    }

    public static String s(byte[] bArr, int i, int i2, boolean z) {
        zq3.h(bArr, "<this>");
        kotlin.collections.a.a.a(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, yj0.b);
        }
        CharsetDecoder newDecoder = yj0.b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String charBuffer = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        zq3.g(charBuffer, "toString(...)");
        return charBuffer;
    }

    public static byte[] t(String str) {
        zq3.h(str, "<this>");
        byte[] bytes = str.getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean u(String str, String str2, boolean z) {
        zq3.h(str, "<this>");
        zq3.h(str2, "suffix");
        return !z ? str.endsWith(str2) : h.z(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean v(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return h.u(str, str2, z);
    }

    public static boolean w(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean x(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return h.w(str, str2, z);
    }

    public static Comparator y(z38 z38Var) {
        zq3.h(z38Var, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        zq3.g(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean z(String str, int i, String str2, int i2, int i3, boolean z) {
        zq3.h(str, "<this>");
        zq3.h(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }
}
