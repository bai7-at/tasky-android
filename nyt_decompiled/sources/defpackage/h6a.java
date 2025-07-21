package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class h6a {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final b9e a = new b9e();
    private final StringBuilder b = new StringBuilder();

    static String a(b9e b9eVar, StringBuilder sb) {
        c(b9eVar);
        if (b9eVar.q() == 0) {
            return null;
        }
        String d2 = d(b9eVar, sb);
        if (!"".equals(d2)) {
            return d2;
        }
        char B = (char) b9eVar.B();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(B);
        return sb2.toString();
    }

    static void c(b9e b9eVar) {
        while (true) {
            for (boolean z = true; b9eVar.q() > 0 && z; z = false) {
                char c2 = (char) b9eVar.m()[b9eVar.s()];
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    b9eVar.l(1);
                } else {
                    int s = b9eVar.s();
                    int t = b9eVar.t();
                    byte[] m = b9eVar.m();
                    if (s + 2 <= t) {
                        int i = s + 1;
                        if (m[s] == 47) {
                            int i2 = s + 2;
                            if (m[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= t) {
                                        break;
                                    }
                                    if (((char) m[i2]) == '*' && ((char) m[i3]) == '/') {
                                        t = i2 + 2;
                                        i2 = t;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                b9eVar.l(t - b9eVar.s());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String d(b9e b9eVar, StringBuilder sb) {
        sb.setLength(0);
        int s = b9eVar.s();
        int t = b9eVar.t();
        loop0: while (true) {
            for (boolean z = false; s < t && !z; z = true) {
                char c2 = (char) b9eVar.m()[s];
                if ((c2 >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || ((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                    sb.append(c2);
                    s++;
                }
            }
        }
        b9eVar.l(s - b9eVar.s());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0317, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00b0, code lost:
    
        if (")".equals(a(r5, r6)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(defpackage.b9e r18) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6a.b(b9e):java.util.List");
    }
}
