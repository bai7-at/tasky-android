package com.squareup.moshi;

import com.amazonaws.services.s3.internal.Constants;
import com.squareup.moshi.JsonReader;
import defpackage.ad0;
import defpackage.sd0;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.ByteString;

/* loaded from: classes4.dex */
final class d extends JsonReader {
    private static final ByteString m = ByteString.e("'\\");
    private static final ByteString n = ByteString.e("\"\\");
    private static final ByteString r = ByteString.e("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString s = ByteString.e("\n\r");
    private static final ByteString t = ByteString.e("*/");
    private final sd0 g;
    private final ad0 h;
    private int i;
    private long j;
    private int k;
    private String l;

    d(sd0 sd0Var) {
        this.i = 0;
        if (sd0Var == null) {
            throw new NullPointerException("source == null");
        }
        this.g = sd0Var;
        this.h = sd0Var.g();
        G(6);
    }

    private int F0() {
        int[] iArr = this.b;
        int i = this.a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int W0 = W0(true);
            this.h.readByte();
            if (W0 != 44) {
                if (W0 != 59) {
                    if (W0 != 93) {
                        throw m0("Unterminated array");
                    }
                    this.i = 4;
                    return 4;
                }
                w0();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int W02 = W0(true);
                    this.h.readByte();
                    if (W02 != 44) {
                        if (W02 != 59) {
                            if (W02 != 125) {
                                throw m0("Unterminated object");
                            }
                            this.i = 2;
                            return 2;
                        }
                        w0();
                    }
                }
                int W03 = W0(true);
                if (W03 == 34) {
                    this.h.readByte();
                    this.i = 13;
                    return 13;
                }
                if (W03 == 39) {
                    this.h.readByte();
                    w0();
                    this.i = 12;
                    return 12;
                }
                if (W03 != 125) {
                    w0();
                    if (!K0((char) W03)) {
                        throw m0("Expected name");
                    }
                    this.i = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw m0("Expected name");
                }
                this.h.readByte();
                this.i = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int W04 = W0(true);
                this.h.readByte();
                if (W04 != 58) {
                    if (W04 != 61) {
                        throw m0("Expected ':'");
                    }
                    w0();
                    if (this.g.request(1L) && this.h.r(0L) == 62) {
                        this.h.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (W0(false) == -1) {
                    this.i = 18;
                    return 18;
                }
                w0();
            } else {
                if (i2 == 9) {
                    throw null;
                }
                if (i2 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int W05 = W0(true);
        if (W05 == 34) {
            this.h.readByte();
            this.i = 9;
            return 9;
        }
        if (W05 == 39) {
            w0();
            this.h.readByte();
            this.i = 8;
            return 8;
        }
        if (W05 != 44 && W05 != 59) {
            if (W05 == 91) {
                this.h.readByte();
                this.i = 3;
                return 3;
            }
            if (W05 != 93) {
                if (W05 == 123) {
                    this.h.readByte();
                    this.i = 1;
                    return 1;
                }
                int h1 = h1();
                if (h1 != 0) {
                    return h1;
                }
                int u1 = u1();
                if (u1 != 0) {
                    return u1;
                }
                if (!K0(this.h.r(0L))) {
                    throw m0("Expected value");
                }
                w0();
                this.i = 10;
                return 10;
            }
            if (i2 == 1) {
                this.h.readByte();
                this.i = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw m0("Unexpected value");
        }
        w0();
        this.i = 7;
        return 7;
    }

    private int G0(String str, JsonReader.b bVar) {
        int length = bVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.a[i])) {
                this.i = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private int H0(String str, JsonReader.b bVar) {
        int length = bVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.a[i])) {
                this.i = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    private boolean K0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        w0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.h.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        w0();
        y1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.g.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        w0();
        r3 = r6.h.r(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.h.readByte();
        r6.h.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (x1() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw m0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.h.readByte();
        r6.h.readByte();
        y1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int W0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            sd0 r2 = r6.g
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            ad0 r2 = r6.h
            long r4 = (long) r1
            byte r2 = r2.r(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            ad0 r3 = r6.h
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            sd0 r3 = r6.g
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.w0()
            ad0 r3 = r6.h
            r4 = 1
            byte r3 = r3.r(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            ad0 r1 = r6.h
            r1.readByte()
            ad0 r1 = r6.h
            r1.readByte()
            r6.y1()
            goto L1
        L5a:
            ad0 r1 = r6.h
            r1.readByte()
            ad0 r1 = r6.h
            r1.readByte()
            boolean r1 = r6.x1()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r6 = r6.m0(r7)
            throw r6
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.w0()
            r6.y1()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r6 = -1
            return r6
        L84:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "End of input"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.d.W0(boolean):int");
    }

    private String X0(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long N = this.g.N(byteString);
            if (N == -1) {
                throw m0("Unterminated string");
            }
            if (this.h.r(N) != 92) {
                if (sb == null) {
                    String s0 = this.h.s0(N);
                    this.h.readByte();
                    return s0;
                }
                sb.append(this.h.s0(N));
                this.h.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.h.s0(N));
            this.h.readByte();
            sb.append(v1());
        }
    }

    private String e1() {
        long N = this.g.N(r);
        ad0 ad0Var = this.h;
        return N != -1 ? ad0Var.s0(N) : ad0Var.i1();
    }

    private int h1() {
        String str;
        String str2;
        int i;
        byte r2 = this.h.r(0L);
        if (r2 == 116 || r2 == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (r2 == 102 || r2 == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (r2 != 110 && r2 != 78) {
                return 0;
            }
            str = Constants.NULL_VERSION_ID;
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.g.request(i3)) {
                return 0;
            }
            byte r3 = this.h.r(i2);
            if (r3 != str.charAt(i2) && r3 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.g.request(length + 1) && K0(this.h.r(length))) {
            return 0;
        }
        this.h.skip(length);
        this.i = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (K0(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0099, code lost:
    
        r16.j = r8;
        r16.h.skip(r5);
        r16.i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r16.k = r5;
        r16.i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int u1() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.d.u1():int");
    }

    private char v1() {
        int i;
        if (!this.g.request(1L)) {
            throw m0("Unterminated escape sequence");
        }
        byte readByte = this.h.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.e) {
                return (char) readByte;
            }
            throw m0("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte r2 = this.h.r(i2);
            char c2 = (char) (c << 4);
            if (r2 >= 48 && r2 <= 57) {
                i = r2 - 48;
            } else if (r2 >= 97 && r2 <= 102) {
                i = r2 - 87;
            } else {
                if (r2 < 65 || r2 > 70) {
                    throw m0("\\u" + this.h.s0(4L));
                }
                i = r2 - 55;
            }
            c = (char) (c2 + i);
        }
        this.h.skip(4L);
        return c;
    }

    private void w0() {
        if (!this.e) {
            throw m0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void w1(ByteString byteString) {
        while (true) {
            long N = this.g.N(byteString);
            if (N == -1) {
                throw m0("Unterminated string");
            }
            if (this.h.r(N) != 92) {
                this.h.skip(N + 1);
                return;
            } else {
                this.h.skip(N + 1);
                v1();
            }
        }
    }

    private boolean x1() {
        long J = this.g.J(t);
        boolean z = J != -1;
        ad0 ad0Var = this.h;
        ad0Var.skip(z ? J + r1.E() : ad0Var.h1());
        return z;
    }

    private void y1() {
        long N = this.g.N(s);
        ad0 ad0Var = this.h;
        ad0Var.skip(N != -1 ? N + 1 : ad0Var.h1());
    }

    private void z1() {
        long N = this.g.N(r);
        ad0 ad0Var = this.h;
        if (N == -1) {
            N = ad0Var.h1();
        }
        ad0Var.skip(N);
    }

    @Override // com.squareup.moshi.JsonReader
    public void C() {
        if (hasNext()) {
            this.l = nextName();
            this.i = 11;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int P(JsonReader.b bVar) {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return G0(this.l, bVar);
        }
        int y0 = this.g.y0(bVar.b);
        if (y0 != -1) {
            this.i = 0;
            this.c[this.a - 1] = bVar.a[y0];
            return y0;
        }
        String str = this.c[this.a - 1];
        String nextName = nextName();
        int G0 = G0(nextName, bVar);
        if (G0 == -1) {
            this.i = 15;
            this.l = nextName;
            this.c[this.a - 1] = str;
        }
        return G0;
    }

    @Override // com.squareup.moshi.JsonReader
    public int X(JsonReader.b bVar) {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return H0(this.l, bVar);
        }
        int y0 = this.g.y0(bVar.b);
        if (y0 != -1) {
            this.i = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return y0;
        }
        String nextString = nextString();
        int H0 = H0(nextString, bVar);
        if (H0 == -1) {
            this.i = 11;
            this.l = nextString;
            this.d[this.a - 1] = r0[r4] - 1;
        }
        return H0;
    }

    @Override // com.squareup.moshi.JsonReader
    public void a() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 3) {
            G(1);
            this.d[this.a - 1] = 0;
            this.i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + r() + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void b() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 1) {
            G(3);
            this.i = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + r() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.i = 0;
        this.b[0] = 8;
        this.a = 1;
        this.h.a();
        this.g.close();
    }

    @Override // com.squareup.moshi.JsonReader
    public void d() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + r() + " at path " + getPath());
        }
        int i2 = this.a;
        this.a = i2 - 1;
        int[] iArr = this.d;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    public void f0() {
        if (this.f) {
            JsonReader.Token r2 = r();
            nextName();
            throw new JsonDataException("Cannot skip unexpected " + r2 + " at " + getPath());
        }
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 14) {
            z1();
        } else if (i == 13) {
            w1(n);
        } else if (i == 12) {
            w1(m);
        } else if (i != 15) {
            throw new JsonDataException("Expected a name but was " + r() + " at path " + getPath());
        }
        this.i = 0;
        this.c[this.a - 1] = Constants.NULL_VERSION_ID;
    }

    @Override // com.squareup.moshi.JsonReader
    public void h() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + r() + " at path " + getPath());
        }
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        this.c[i3] = null;
        int[] iArr = this.d;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.i = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean hasNext() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    public Object l() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 7) {
            this.i = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + r() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean nextBoolean() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 5) {
            this.i = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.i = 0;
            int[] iArr2 = this.d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + r() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public double nextDouble() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 16) {
            this.i = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 17) {
            this.l = this.h.s0(this.k);
        } else if (i == 9) {
            this.l = X0(n);
        } else if (i == 8) {
            this.l = X0(m);
        } else if (i == 10) {
            this.l = e1();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + r() + " at path " + getPath());
        }
        this.i = 11;
        try {
            double parseDouble = Double.parseDouble(this.l);
            if (this.e || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                this.l = null;
                this.i = 0;
                int[] iArr2 = this.d;
                int i3 = this.a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int nextInt() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 16) {
            long j = this.j;
            int i2 = (int) j;
            if (j == i2) {
                this.i = 0;
                int[] iArr = this.d;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.j + " at path " + getPath());
        }
        if (i == 17) {
            this.l = this.h.s0(this.k);
        } else if (i == 9 || i == 8) {
            String X0 = i == 9 ? X0(n) : X0(m);
            this.l = X0;
            try {
                int parseInt = Integer.parseInt(X0);
                this.i = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected an int but was " + r() + " at path " + getPath());
        }
        this.i = 11;
        try {
            double parseDouble = Double.parseDouble(this.l);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.l = null;
                this.i = 0;
                int[] iArr3 = this.d;
                int i6 = this.a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public long nextLong() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 16) {
            this.i = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 17) {
            this.l = this.h.s0(this.k);
        } else if (i == 9 || i == 8) {
            String X0 = i == 9 ? X0(n) : X0(m);
            this.l = X0;
            try {
                long parseLong = Long.parseLong(X0);
                this.i = 0;
                int[] iArr2 = this.d;
                int i3 = this.a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected a long but was " + r() + " at path " + getPath());
        }
        this.i = 11;
        try {
            long longValueExact = new BigDecimal(this.l).longValueExact();
            this.l = null;
            this.i = 0;
            int[] iArr3 = this.d;
            int i4 = this.a - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextName() {
        String str;
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 14) {
            str = e1();
        } else if (i == 13) {
            str = X0(n);
        } else if (i == 12) {
            str = X0(m);
        } else {
            if (i != 15) {
                throw new JsonDataException("Expected a name but was " + r() + " at path " + getPath());
            }
            str = this.l;
            this.l = null;
        }
        this.i = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextString() {
        String s0;
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        if (i == 10) {
            s0 = e1();
        } else if (i == 9) {
            s0 = X0(n);
        } else if (i == 8) {
            s0 = X0(m);
        } else if (i == 11) {
            s0 = this.l;
            this.l = null;
        } else if (i == 16) {
            s0 = Long.toString(this.j);
        } else {
            if (i != 17) {
                throw new JsonDataException("Expected a string but was " + r() + " at path " + getPath());
            }
            s0 = this.h.s0(this.k);
        }
        this.i = 0;
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return s0;
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token r() {
        int i = this.i;
        if (i == 0) {
            i = F0();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader s() {
        return new d(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipValue() {
        if (this.f) {
            throw new JsonDataException("Cannot skip unexpected " + r() + " at " + getPath());
        }
        int i = 0;
        do {
            int i2 = this.i;
            if (i2 == 0) {
                i2 = F0();
            }
            if (i2 == 3) {
                G(1);
            } else if (i2 == 1) {
                G(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + r() + " at path " + getPath());
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + r() + " at path " + getPath());
                    }
                    this.a--;
                } else if (i2 == 14 || i2 == 10) {
                    z1();
                } else if (i2 == 9 || i2 == 13) {
                    w1(n);
                } else if (i2 == 8 || i2 == 12) {
                    w1(m);
                } else if (i2 == 17) {
                    this.h.skip(this.k);
                } else if (i2 == 18) {
                    throw new JsonDataException("Expected a value but was " + r() + " at path " + getPath());
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i3 = this.a;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.c[i3 - 1] = Constants.NULL_VERSION_ID;
    }

    public String toString() {
        return "JsonReader(" + this.g + ")";
    }

    d(d dVar) {
        super(dVar);
        this.i = 0;
        sd0 peek = dVar.g.peek();
        this.g = peek;
        this.h = peek.g();
        this.i = dVar.i;
        this.j = dVar.j;
        this.k = dVar.k;
        this.l = dVar.l;
        try {
            peek.o0(dVar.h.h1());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
