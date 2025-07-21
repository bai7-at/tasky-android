package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.ad0;
import defpackage.sd0;
import java.io.EOFException;
import okio.ByteString;

/* loaded from: classes.dex */
final class b extends JsonReader {
    private static final ByteString n = ByteString.e("'\\");
    private static final ByteString r = ByteString.e("\"\\");
    private static final ByteString s = ByteString.e("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString t = ByteString.e("\n\r");
    private static final ByteString u = ByteString.e("*/");
    private final sd0 h;
    private final ad0 i;
    private int j = 0;
    private long k;
    private int l;
    private String m;

    b(sd0 sd0Var) {
        if (sd0Var == null) {
            throw new NullPointerException("source == null");
        }
        this.h = sd0Var;
        this.i = sd0Var.z();
        m(6);
    }

    private char F0() {
        int i;
        if (!this.h.request(1L)) {
            throw G("Unterminated escape sequence");
        }
        byte readByte = this.i.readByte();
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
            throw G("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte r2 = this.i.r(i2);
            char c2 = (char) (c << 4);
            if (r2 >= 48 && r2 <= 57) {
                i = r2 - 48;
            } else if (r2 >= 97 && r2 <= 102) {
                i = r2 - 87;
            } else {
                if (r2 < 65 || r2 > 70) {
                    throw G("\\u" + this.i.s0(4L));
                }
                i = r2 - 55;
            }
            c = (char) (c2 + i);
        }
        this.i.skip(4L);
        return c;
    }

    private void G0(ByteString byteString) {
        while (true) {
            long N = this.h.N(byteString);
            if (N == -1) {
                throw G("Unterminated string");
            }
            if (this.i.r(N) != 92) {
                this.i.skip(N + 1);
                return;
            } else {
                this.i.skip(N + 1);
                F0();
            }
        }
    }

    private boolean H0() {
        long J = this.h.J(u);
        boolean z = J != -1;
        ad0 ad0Var = this.i;
        ad0Var.skip(z ? J + r1.E() : ad0Var.h1());
        return z;
    }

    private void K0() {
        long N = this.h.N(t);
        ad0 ad0Var = this.i;
        ad0Var.skip(N != -1 ? N + 1 : ad0Var.h1());
    }

    private void L() {
        if (!this.e) {
            throw G("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int P() {
        int[] iArr = this.b;
        int i = this.a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int e0 = e0(true);
            this.i.readByte();
            if (e0 != 44) {
                if (e0 != 59) {
                    if (e0 != 93) {
                        throw G("Unterminated array");
                    }
                    this.j = 4;
                    return 4;
                }
                L();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int e02 = e0(true);
                    this.i.readByte();
                    if (e02 != 44) {
                        if (e02 != 59) {
                            if (e02 != 125) {
                                throw G("Unterminated object");
                            }
                            this.j = 2;
                            return 2;
                        }
                        L();
                    }
                }
                int e03 = e0(true);
                if (e03 == 34) {
                    this.i.readByte();
                    this.j = 13;
                    return 13;
                }
                if (e03 == 39) {
                    this.i.readByte();
                    L();
                    this.j = 12;
                    return 12;
                }
                if (e03 != 125) {
                    L();
                    if (!c0((char) e03)) {
                        throw G("Expected name");
                    }
                    this.j = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw G("Expected name");
                }
                this.i.readByte();
                this.j = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int e04 = e0(true);
                this.i.readByte();
                if (e04 != 58) {
                    if (e04 != 61) {
                        throw G("Expected ':'");
                    }
                    L();
                    if (this.h.request(1L) && this.i.r(0L) == 62) {
                        this.i.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (e0(false) == -1) {
                    this.j = 18;
                    return 18;
                }
                L();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int e05 = e0(true);
        if (e05 == 34) {
            this.i.readByte();
            this.j = 9;
            return 9;
        }
        if (e05 == 39) {
            L();
            this.i.readByte();
            this.j = 8;
            return 8;
        }
        if (e05 != 44 && e05 != 59) {
            if (e05 == 91) {
                this.i.readByte();
                this.j = 3;
                return 3;
            }
            if (e05 != 93) {
                if (e05 == 123) {
                    this.i.readByte();
                    this.j = 1;
                    return 1;
                }
                int t0 = t0();
                if (t0 != 0) {
                    return t0;
                }
                int w0 = w0();
                if (w0 != 0) {
                    return w0;
                }
                if (!c0(this.i.r(0L))) {
                    throw G("Expected value");
                }
                L();
                this.j = 10;
                return 10;
            }
            if (i2 == 1) {
                this.i.readByte();
                this.j = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw G("Unexpected value");
        }
        L();
        this.j = 7;
        return 7;
    }

    private void W0() {
        long N = this.h.N(s);
        ad0 ad0Var = this.i;
        if (N == -1) {
            N = ad0Var.h1();
        }
        ad0Var.skip(N);
    }

    private int X(String str, JsonReader.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.j = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private boolean c0(int i) {
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
        L();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        L();
        K0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.h.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        L();
        r3 = r6.i.r(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.i.readByte();
        r6.i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (H0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw G("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.i.readByte();
        r6.i.readByte();
        K0();
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
    private int e0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            sd0 r2 = r6.h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            ad0 r2 = r6.i
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
            ad0 r3 = r6.i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            sd0 r3 = r6.h
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.L()
            ad0 r3 = r6.i
            r4 = 1
            byte r3 = r3.r(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            ad0 r1 = r6.i
            r1.readByte()
            ad0 r1 = r6.i
            r1.readByte()
            r6.K0()
            goto L1
        L5a:
            ad0 r1 = r6.i
            r1.readByte()
            ad0 r1 = r6.i
            r1.readByte()
            boolean r1 = r6.H0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r6 = r6.G(r7)
            throw r6
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.L()
            r6.K0()
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
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.b.e0(boolean):int");
    }

    private String f0(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long N = this.h.N(byteString);
            if (N == -1) {
                throw G("Unterminated string");
            }
            if (this.i.r(N) != 92) {
                if (sb == null) {
                    String s0 = this.i.s0(N);
                    this.i.readByte();
                    return s0;
                }
                sb.append(this.i.s0(N));
                this.i.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.i.s0(N));
            this.i.readByte();
            sb.append(F0());
        }
    }

    private String m0() {
        long N = this.h.N(s);
        ad0 ad0Var = this.i;
        return N != -1 ? ad0Var.s0(N) : ad0Var.i1();
    }

    private int t0() {
        String str;
        String str2;
        int i;
        byte r2 = this.i.r(0L);
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
            if (!this.h.request(i3)) {
                return 0;
            }
            byte r3 = this.i.r(i2);
            if (r3 != str.charAt(i2) && r3 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.h.request(length + 1) && c0(this.i.r(length))) {
            return 0;
        }
        this.i.skip(length);
        this.j = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (c0(r11) != false) goto L69;
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
    
        r16.k = r8;
        r16.i.skip(r5);
        r16.j = 16;
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
    
        r16.l = r5;
        r16.j = 17;
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
    private int w0() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.b.w0():int");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void b() {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i == 3) {
            m(1);
            this.d[this.a - 1] = 0;
            this.j = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + l() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.j = 0;
        this.b[0] = 8;
        this.a = 1;
        this.i.a();
        this.h.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i == 1) {
            m(3);
            this.j = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + l() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void h() {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + l() + " at path " + getPath());
        }
        int i2 = this.a;
        this.a = i2 - 1;
        int[] iArr = this.d;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.j = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void i() {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + l() + " at path " + getPath());
        }
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        this.c[i3] = null;
        int[] iArr = this.d;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.j = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token l() {
        int i = this.j;
        if (i == 0) {
            i = P();
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

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i == 5) {
            this.j = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.j = 0;
            int[] iArr2 = this.d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + l() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i == 16) {
            this.j = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.k;
        }
        if (i == 17) {
            this.m = this.i.s0(this.l);
        } else if (i == 9) {
            this.m = f0(r);
        } else if (i == 8) {
            this.m = f0(n);
        } else if (i == 10) {
            this.m = m0();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + l() + " at path " + getPath());
        }
        this.j = 11;
        try {
            double parseDouble = Double.parseDouble(this.m);
            if (this.e || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                this.m = null;
                this.j = 0;
                int[] iArr2 = this.d;
                int i3 = this.a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i == 16) {
            long j = this.k;
            int i2 = (int) j;
            if (j == i2) {
                this.j = 0;
                int[] iArr = this.d;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.k + " at path " + getPath());
        }
        if (i == 17) {
            this.m = this.i.s0(this.l);
        } else if (i == 9 || i == 8) {
            String f0 = i == 9 ? f0(r) : f0(n);
            this.m = f0;
            try {
                int parseInt = Integer.parseInt(f0);
                this.j = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected an int but was " + l() + " at path " + getPath());
        }
        this.j = 11;
        try {
            double parseDouble = Double.parseDouble(this.m);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.m = null;
                this.j = 0;
                int[] iArr3 = this.d;
                int i6 = this.a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() {
        String str;
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i == 14) {
            str = m0();
        } else if (i == 13) {
            str = f0(r);
        } else if (i == 12) {
            str = f0(n);
        } else {
            if (i != 15) {
                throw new JsonDataException("Expected a name but was " + l() + " at path " + getPath());
            }
            str = this.m;
        }
        this.j = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() {
        String s0;
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i == 10) {
            s0 = m0();
        } else if (i == 9) {
            s0 = f0(r);
        } else if (i == 8) {
            s0 = f0(n);
        } else if (i == 11) {
            s0 = this.m;
            this.m = null;
        } else if (i == 16) {
            s0 = Long.toString(this.k);
        } else {
            if (i != 17) {
                throw new JsonDataException("Expected a string but was " + l() + " at path " + getPath());
            }
            s0 = this.i.s0(this.l);
        }
        this.j = 0;
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return s0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int r(JsonReader.a aVar) {
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return X(this.m, aVar);
        }
        int y0 = this.h.y0(aVar.b);
        if (y0 != -1) {
            this.j = 0;
            this.c[this.a - 1] = aVar.a[y0];
            return y0;
        }
        String str = this.c[this.a - 1];
        String nextName = nextName();
        int X = X(nextName, aVar);
        if (X == -1) {
            this.j = 15;
            this.m = nextName;
            this.c[this.a - 1] = str;
        }
        return X;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void s() {
        if (this.f) {
            throw new JsonDataException("Cannot skip unexpected " + l() + " at " + getPath());
        }
        int i = this.j;
        if (i == 0) {
            i = P();
        }
        if (i == 14) {
            W0();
        } else if (i == 13) {
            G0(r);
        } else if (i == 12) {
            G0(n);
        } else if (i != 15) {
            throw new JsonDataException("Expected a name but was " + l() + " at path " + getPath());
        }
        this.j = 0;
        this.c[this.a - 1] = Constants.NULL_VERSION_ID;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() {
        if (this.f) {
            throw new JsonDataException("Cannot skip unexpected " + l() + " at " + getPath());
        }
        int i = 0;
        do {
            int i2 = this.j;
            if (i2 == 0) {
                i2 = P();
            }
            if (i2 == 3) {
                m(1);
            } else if (i2 == 1) {
                m(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + l() + " at path " + getPath());
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + l() + " at path " + getPath());
                    }
                    this.a--;
                } else if (i2 == 14 || i2 == 10) {
                    W0();
                } else if (i2 == 9 || i2 == 13) {
                    G0(r);
                } else if (i2 == 8 || i2 == 12) {
                    G0(n);
                } else if (i2 == 17) {
                    this.i.skip(this.l);
                } else if (i2 == 18) {
                    throw new JsonDataException("Expected a value but was " + l() + " at path " + getPath());
                }
                this.j = 0;
            }
            i++;
            this.j = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i3 = this.a;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.c[i3 - 1] = Constants.NULL_VERSION_ID;
    }

    public String toString() {
        return "JsonReader(" + this.h + ")";
    }
}
