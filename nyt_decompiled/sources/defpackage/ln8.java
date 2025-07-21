package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes5.dex */
public class ln8 {
    private String a;
    private int b = 0;

    public ln8(String str) {
        u29.i(str);
        this.a = str;
    }

    private int r() {
        return this.a.length() - this.b;
    }

    public static String s(String str) {
        StringBuilder b = o48.b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                b.append(c2);
            } else if (c != 0 && c == '\\') {
                b.append(c2);
            }
            i++;
            c = c2;
        }
        return o48.m(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[EDGE_INSN: B:14:0x0048->B:15:0x0048 BREAK  A[LOOP:0: B:2:0x0007->B:22:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:2:0x0007->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(char r10, char r11) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
        L7:
            boolean r7 = r9.j()
            if (r7 == 0) goto Le
            goto L48
        Le:
            char r7 = r9.c()
            if (r1 == 0) goto L18
            r8 = 92
            if (r1 == r8) goto L3f
        L18:
            r8 = 39
            if (r7 != r8) goto L23
            if (r7 == r10) goto L23
            if (r2 != 0) goto L23
            r3 = r3 ^ 1
            goto L2d
        L23:
            r8 = 34
            if (r7 != r8) goto L2d
            if (r7 == r10) goto L2d
            if (r3 != 0) goto L2d
            r2 = r2 ^ 1
        L2d:
            if (r3 != 0) goto L46
            if (r2 == 0) goto L32
            goto L46
        L32:
            if (r7 != r10) goto L3b
            int r4 = r4 + 1
            if (r5 != r0) goto L3f
            int r5 = r9.b
            goto L3f
        L3b:
            if (r7 != r11) goto L3f
            int r4 = r4 + (-1)
        L3f:
            if (r4 <= 0) goto L45
            if (r1 == 0) goto L45
            int r6 = r9.b
        L45:
            r1 = r7
        L46:
            if (r4 > 0) goto L7
        L48:
            if (r6 < 0) goto L51
            java.lang.String r9 = r9.a
            java.lang.String r9 = r9.substring(r5, r6)
            goto L53
        L51:
            java.lang.String r9 = ""
        L53:
            if (r4 <= 0) goto L6e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Did not find balanced marker at '"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = "'"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.u29.a(r10)
        L6e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln8.a(char, char):java.lang.String");
    }

    public String b(String str) {
        String g = g(str);
        k(str);
        return g;
    }

    public char c() {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        return str.charAt(i);
    }

    public void d(String str) {
        if (!l(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > r()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.b += length;
    }

    public String e() {
        int i = this.b;
        while (!j() && (p() || m('-', '_'))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String f() {
        int i = this.b;
        while (!j() && (p() || n("*|", "|", QueryKeys.END_MARKER, "-"))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String g(String str) {
        int indexOf = this.a.indexOf(str, this.b);
        if (indexOf == -1) {
            return q();
        }
        String substring = this.a.substring(this.b, indexOf);
        this.b += substring.length();
        return substring;
    }

    public String h(String... strArr) {
        int i = this.b;
        while (!j() && !n(strArr)) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public boolean i() {
        boolean z = false;
        while (o()) {
            this.b++;
            z = true;
        }
        return z;
    }

    public boolean j() {
        return r() == 0;
    }

    public boolean k(String str) {
        if (!l(str)) {
            return false;
        }
        this.b += str.length();
        return true;
    }

    public boolean l(String str) {
        return this.a.regionMatches(true, this.b, str, 0, str.length());
    }

    public boolean m(char... cArr) {
        if (j()) {
            return false;
        }
        for (char c : cArr) {
            if (this.a.charAt(this.b) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean n(String... strArr) {
        for (String str : strArr) {
            if (l(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean o() {
        return !j() && o48.i(this.a.charAt(this.b));
    }

    public boolean p() {
        return !j() && Character.isLetterOrDigit(this.a.charAt(this.b));
    }

    public String q() {
        String str = this.a;
        String substring = str.substring(this.b, str.length());
        this.b = this.a.length();
        return substring;
    }

    public String toString() {
        return this.a.substring(this.b);
    }
}
