package defpackage;

import com.google.android.gms.internal.pal.zzabf;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ct9 implements Closeable {
    private final Reader a;
    private long h;
    private int i;
    private int[] j;
    private String[] l;
    private int[] m;
    private final char[] b = new char[1024];
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    int g = 0;
    private int k = 1;

    static {
        u8g.a = new at9();
    }

    public ct9(Reader reader) {
        int[] iArr = new int[32];
        this.j = iArr;
        iArr[0] = 6;
        this.l = new String[32];
        this.m = new int[32];
        this.a = reader;
    }

    private final int L(boolean z) {
        char[] cArr = this.b;
        int i = this.c;
        int i2 = this.d;
        while (true) {
            if (i == i2) {
                this.c = i;
                if (!f0(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(b()));
                    }
                    return -1;
                }
                i = this.c;
                i2 = this.d;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.e++;
                this.f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c != '/') {
                    if (c != '#') {
                        this.c = i3;
                        return c;
                    }
                    this.c = i3;
                    throw P("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                this.c = i3;
                if (i3 == i2) {
                    this.c = i;
                    boolean f0 = f0(2);
                    this.c++;
                    if (!f0) {
                        return 47;
                    }
                }
                throw P("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            i = i3;
        }
    }

    private final IOException P(String str) {
        throw new zzabf(str.concat(b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0119, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x011b, code lost:
    
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0128, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.c = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e2, code lost:
    
        throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(r4, r10.c, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String X(char r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct9.X(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x004e, code lost:
    
        throw P("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String c0() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r5.c
            int r3 = r3 + r2
            int r4 = r5.d
            if (r3 >= r4) goto L4f
            char[] r4 = r5.b
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5b
            r4 = 10
            if (r3 == r4) goto L5b
            r4 = 12
            if (r3 == r4) goto L5b
            r4 = 13
            if (r3 == r4) goto L5b
            r4 = 32
            if (r3 == r4) goto L5b
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L5b
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5b
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5b
            r4 = 58
            if (r3 == r4) goto L5b
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L5b;
                case 92: goto L48;
                case 93: goto L5b;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r5 = r5.P(r0)
            throw r5
        L4f:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5d
            int r3 = r2 + 1
            boolean r3 = r5.f0(r3)
            if (r3 != 0) goto L3
        L5b:
            r1 = r2
            goto L7d
        L5d:
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6a:
            char[] r3 = r5.b
            int r4 = r5.c
            r0.append(r3, r4, r2)
            int r3 = r5.c
            int r3 = r3 + r2
            r5.c = r3
            r2 = 1
            boolean r2 = r5.f0(r2)
            if (r2 != 0) goto L2
        L7d:
            if (r0 != 0) goto L89
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.b
            int r3 = r5.c
            r0.<init>(r2, r3, r1)
            goto L94
        L89:
            char[] r2 = r5.b
            int r3 = r5.c
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L94:
            int r2 = r5.c
            int r2 = r2 + r1
            r5.c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct9.c0():java.lang.String");
    }

    private final void e0(int i) {
        int i2 = this.k;
        int[] iArr = this.j;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.j = Arrays.copyOf(iArr, i3);
            this.m = Arrays.copyOf(this.m, i3);
            this.l = (String[]) Arrays.copyOf(this.l, i3);
        }
        int[] iArr2 = this.j;
        int i4 = this.k;
        this.k = i4 + 1;
        iArr2[i4] = i;
    }

    private final boolean f0(int i) {
        int i2;
        char[] cArr = this.b;
        int i3 = this.f;
        int i4 = this.c;
        this.f = i3 - i4;
        int i5 = this.d;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.d = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.d = 0;
        }
        this.c = 0;
        do {
            Reader reader = this.a;
            int i7 = this.d;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.d + read;
            this.d = i2;
            if (this.e == 0 && this.f == 0 && i2 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean m0(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throw P("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    public final boolean C() {
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        if (i == 5) {
            this.g = 0;
            int[] iArr = this.m;
            int i2 = this.k - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.g = 0;
            int[] iArr2 = this.m;
            int i3 = this.k - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + ((Object) et9.a(G())) + b());
    }

    public final int G() {
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01bd, code lost:
    
        if (m0(r14) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c1, code lost:
    
        if (r9 != 2) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c3, code lost:
    
        if (r17 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c9, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cb, code lost:
    
        if (r18 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01cd, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d5, code lost:
    
        if (r12 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d7, code lost:
    
        if (r3 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01dd, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01de, code lost:
    
        r22.h = r12;
        r22.c += r8;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e7, code lost:
    
        r22.g = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01da, code lost:
    
        if (r3 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d1, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cf, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ea, code lost:
    
        if (r9 == 2) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ed, code lost:
    
        if (r9 == 4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f0, code lost:
    
        if (r9 != 7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f2, code lost:
    
        r22.i = r8;
        r6 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0244 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a() {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct9.a():int");
    }

    final String b() {
        int i = this.e;
        int i2 = this.c;
        int i3 = this.f;
        StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i4 = 0; i4 < this.k; i4++) {
            int i5 = this.j[i4];
            if (i5 == 1 || i5 == 2) {
                int i6 = this.m[i4];
                sb2.append('[');
                sb2.append(i6);
                sb2.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb2.append('.');
                String str = this.l[i4];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g = 0;
        this.j[0] = 8;
        this.k = 1;
        this.a.close();
    }

    public final String d() {
        String X;
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        if (i == 14) {
            X = c0();
        } else if (i == 12) {
            X = X('\'');
        } else {
            if (i != 13) {
                throw new IllegalStateException("Expected a name but was " + ((Object) et9.a(G())) + b());
            }
            X = X('\"');
        }
        this.g = 0;
        this.l[this.k - 1] = X;
        return X;
    }

    public final String h() {
        String str;
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        if (i == 10) {
            str = c0();
        } else if (i == 8) {
            str = X('\'');
        } else if (i == 9) {
            str = X('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.h);
        } else {
            if (i != 16) {
                throw new IllegalStateException("Expected a string but was " + ((Object) et9.a(G())) + b());
            }
            str = new String(this.b, this.c, this.i);
            this.c += this.i;
        }
        this.g = 0;
        int[] iArr = this.m;
        int i2 = this.k - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final void i() {
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        if (i == 3) {
            e0(1);
            this.m[this.k - 1] = 0;
            this.g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) et9.a(G())) + b());
        }
    }

    public final void j() {
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        if (i == 1) {
            e0(3);
            this.g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) et9.a(G())) + b());
        }
    }

    public final void l() {
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        if (i != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) et9.a(G())) + b());
        }
        int i2 = this.k;
        this.k = i2 - 1;
        int[] iArr = this.m;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.g = 0;
    }

    public final void m() {
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        if (i != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) et9.a(G())) + b());
        }
        int i2 = this.k;
        int i3 = i2 - 1;
        this.k = i3;
        this.l[i3] = null;
        int[] iArr = this.m;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.g = 0;
    }

    public final void r() {
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        if (i == 7) {
            this.g = 0;
            int[] iArr = this.m;
            int i2 = this.k - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + ((Object) et9.a(G())) + b());
    }

    public final boolean s() {
        int i = this.g;
        if (i == 0) {
            i = a();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final String toString() {
        return ct9.class.getSimpleName().concat(b());
    }
}
