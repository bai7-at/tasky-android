package com.apollographql.apollo.api.json;

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.exception.JsonDataException;
import com.apollographql.apollo.exception.JsonEncodingException;
import defpackage.ad0;
import defpackage.eu3;
import defpackage.sd0;
import defpackage.zq3;
import defpackage.zt3;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class b implements JsonReader {
    public static final a m = new a(null);
    private static final ByteString n;
    private static final ByteString r;
    private static final ByteString s;
    private final sd0 a;
    private final ad0 b;
    private int c;
    private long d;
    private int e;
    private String f;
    private int[] g;
    private int h;
    private String[] i;
    private int[] j;
    private int[] k;
    private int l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        ByteString.a aVar = ByteString.c;
        n = aVar.d("'\\");
        r = aVar.d("\"\\");
        s = aVar.d("{}[]:, \n\t\r/\\;#=");
    }

    public b(sd0 sd0Var) {
        zq3.h(sd0Var, "source");
        this.a = sd0Var;
        this.b = sd0Var.g();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.g = iArr;
        this.h = 1;
        this.i = new String[64];
        this.j = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.k = iArr2;
        this.l = 1;
    }

    private final void C(ByteString byteString) {
        while (true) {
            long N = this.a.N(byteString);
            if (N == -1) {
                L("Unterminated string");
                throw new KotlinNothingValueException();
            }
            if (this.b.r(N) != 92) {
                this.b.skip(N + 1);
                return;
            } else {
                this.b.skip(N + 1);
                s();
            }
        }
    }

    private final void G() {
        long N = this.a.N(s);
        ad0 ad0Var = this.b;
        if (N == -1) {
            N = ad0Var.h1();
        }
        ad0Var.skip(N);
    }

    private final Void L(String str) {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    private final int a() {
        int[] iArr = this.g;
        int i = this.h;
        int i2 = iArr[i - 1];
        switch (i2) {
            case 1:
                iArr[i - 1] = 2;
                break;
            case 2:
                int h = h(true);
                this.b.readByte();
                char c = (char) h;
                if (c != ',') {
                    if (c == ']') {
                        this.c = 4;
                        return 4;
                    }
                    L("Unterminated array");
                    throw new KotlinNothingValueException();
                }
                break;
            case 3:
            case 5:
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int h2 = h(true);
                    this.b.readByte();
                    char c2 = (char) h2;
                    if (c2 != ',') {
                        if (c2 == '}') {
                            this.c = 2;
                            return 2;
                        }
                        L("Unterminated object");
                        throw new KotlinNothingValueException();
                    }
                }
                char h3 = (char) h(true);
                if (h3 == '\"') {
                    this.b.readByte();
                    this.c = 13;
                    return 13;
                }
                if (h3 != '}') {
                    L("Unexpected character: " + h3);
                    throw new KotlinNothingValueException();
                }
                if (i2 == 5) {
                    L("Expected name");
                    throw new KotlinNothingValueException();
                }
                this.b.readByte();
                this.c = 2;
                return 2;
            case 4:
                iArr[i - 1] = 5;
                int h4 = h(true);
                this.b.readByte();
                if (((char) h4) != ':') {
                    L("Expected ':'");
                    throw new KotlinNothingValueException();
                }
                break;
            case 6:
                iArr[i - 1] = 7;
                break;
            case 7:
                if (h(false) == -1) {
                    this.c = 17;
                    return 17;
                }
                L("Malformed JSON");
                throw new KotlinNothingValueException();
            default:
                if (i2 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                break;
        }
        char h5 = (char) h(true);
        if (h5 == '\"') {
            this.b.readByte();
            this.c = 9;
            return 9;
        }
        if (h5 == '\'' || h5 == ',' || h5 == ';') {
            L("Unexpected value");
            throw new KotlinNothingValueException();
        }
        if (h5 == '[') {
            this.b.readByte();
            this.c = 3;
            return 3;
        }
        if (h5 == ']') {
            if (i2 != 1) {
                L("Unexpected value");
                throw new KotlinNothingValueException();
            }
            this.b.readByte();
            this.c = 4;
            return 4;
        }
        if (h5 == '{') {
            this.b.readByte();
            this.c = 1;
            return 1;
        }
        int l = l();
        if (l != 0) {
            return l;
        }
        int m2 = m();
        if (m2 != 0) {
            return m2;
        }
        if (d((char) this.b.r(0L))) {
            L("Malformed JSON");
            throw new KotlinNothingValueException();
        }
        L("Expected value");
        throw new KotlinNothingValueException();
    }

    private final String b() {
        return i.u0(getPath(), InstructionFileId.DOT, null, null, 0, null, null, 62, null);
    }

    private final boolean d(char c) {
        if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            L("Unexpected character: " + c);
            throw new KotlinNothingValueException();
        }
        return false;
    }

    private final int h(boolean z) {
        int i = 0;
        while (true) {
            long j = i;
            if (!this.a.request(j + 1)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i++;
            byte r2 = this.b.r(j);
            if (r2 != 9 && r2 != 10 && r2 != 13 && r2 != 32) {
                this.b.skip(i - 1);
                if (r2 == 35) {
                    L("Malformed JSON");
                    throw new KotlinNothingValueException();
                }
                if (r2 != 47 || !this.a.request(2L)) {
                    return r2;
                }
                L("Malformed JSON");
                throw new KotlinNothingValueException();
            }
        }
    }

    private final String i(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long N = this.a.N(byteString);
            if (N == -1) {
                L("Unterminated string");
                throw new KotlinNothingValueException();
            }
            if (this.b.r(N) != 92) {
                if (sb == null) {
                    String s0 = this.b.s0(N);
                    this.b.readByte();
                    return s0;
                }
                sb.append(this.b.s0(N));
                this.b.readByte();
                String sb2 = sb.toString();
                zq3.e(sb2);
                return sb2;
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.b.s0(N));
            this.b.readByte();
            sb.append(s());
        }
    }

    private final String j() {
        long N = this.a.N(s);
        ad0 ad0Var = this.b;
        return N != -1 ? ad0Var.s0(N) : ad0Var.i1();
    }

    private final int l() {
        String str;
        String str2;
        int i;
        byte r2 = this.b.r(0L);
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
        for (int i2 = 1; i2 < length; i2++) {
            long j = i2;
            if (!this.a.request(1 + j)) {
                return 0;
            }
            byte r3 = this.b.r(j);
            if (r3 != ((byte) str.charAt(i2)) && r3 != ((byte) str2.charAt(i2))) {
                return 0;
            }
        }
        long j2 = length;
        if (this.a.request(1 + j2) && d((char) this.b.r(j2))) {
            return 0;
        }
        this.b.skip(j2);
        this.c = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x008c, code lost:
    
        if (d(r15) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        if (r6 != 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r10 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c5, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        if (r9 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
    
        if (r9 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cc, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r18.d = r7;
        r18.b.skip(r12);
        r18.c = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d9, code lost:
    
        if (r6 == 2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
    
        if (r6 == 4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00df, code lost:
    
        if (r6 != 7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        r18.e = r5;
        r18.c = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0090, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.json.b.m():int");
    }

    private final void r(int i) {
        int i2 = this.h;
        int[] iArr = this.g;
        if (i2 == iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            zq3.g(copyOf, "copyOf(...)");
            this.g = copyOf;
            String[] strArr = this.i;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            zq3.g(copyOf2, "copyOf(...)");
            this.i = (String[]) copyOf2;
            int[] iArr2 = this.j;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            zq3.g(copyOf3, "copyOf(...)");
            this.j = copyOf3;
            int[] iArr3 = this.k;
            int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length * 2);
            zq3.g(copyOf4, "copyOf(...)");
            this.k = copyOf4;
        }
        int[] iArr4 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr4[i3] = i;
    }

    private final char s() {
        int i;
        if (!this.a.request(1L)) {
            L("Unterminated escape sequence");
            throw new KotlinNothingValueException();
        }
        char readByte = (char) this.b.readByte();
        char c = '\n';
        if (readByte == '\n' || readByte == '\"' || readByte == '\'' || readByte == '/' || readByte == '\\') {
            return readByte;
        }
        if (readByte == 'b') {
            return '\b';
        }
        if (readByte == 'f') {
            return '\f';
        }
        if (readByte != 'n') {
            if (readByte == 'r') {
                return '\r';
            }
            if (readByte == 't') {
                return '\t';
            }
            if (readByte != 'u') {
                L("Invalid escape sequence: \\" + readByte);
                throw new KotlinNothingValueException();
            }
            if (!this.a.request(4L)) {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
            c = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte r2 = this.b.r(i2);
                char c2 = (char) (c << 4);
                if (r2 >= 48 && r2 <= 57) {
                    i = r2 - 48;
                } else if (r2 >= 97 && r2 <= 102) {
                    i = r2 - 87;
                } else {
                    if (r2 < 65 || r2 > 70) {
                        L("\\u" + this.b.s0(4L));
                        throw new KotlinNothingValueException();
                    }
                    i = r2 - 55;
                }
                c = (char) (c2 + i);
            }
            this.b.skip(4L);
        }
        return c;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public Void U0() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) == 7) {
            this.c = 0;
            int[] iArr = this.j;
            int i = this.h - 1;
            iArr[i] = iArr[i] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + peek() + " at path " + b());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader beginArray() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) == 3) {
            r(1);
            this.j[this.h - 1] = 0;
            this.c = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + b());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader beginObject() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) == 1) {
            r(3);
            this.c = 0;
            int i = this.l;
            this.l = i + 1;
            this.k[i] = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + b());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c = 0;
        this.g[0] = 8;
        this.h = 1;
        this.b.a();
        this.a.close();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader endArray() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + b());
        }
        int i = this.h;
        this.h = i - 1;
        int[] iArr = this.j;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.c = 0;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader endObject() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + b());
        }
        int i = this.h;
        int i2 = i - 1;
        this.h = i2;
        this.i[i2] = null;
        int[] iArr = this.j;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.c = 0;
        this.l--;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public List getPath() {
        return eu3.a.a(this.h, this.g, this.i, this.j);
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public zt3 j1() {
        String nextString = nextString();
        zq3.e(nextString);
        return new zt3(nextString);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        skipValue();
     */
    @Override // com.apollographql.apollo.api.json.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l1(java.util.List r7) {
        /*
            r6 = this;
            java.lang.String r0 = "names"
            defpackage.zq3.h(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = -1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7e
            java.lang.String r0 = r6.nextName()
            int[] r2 = r6.k
            int r3 = r6.l
            int r3 = r3 + (-1)
            r2 = r2[r3]
            java.lang.Object r3 = r7.get(r2)
            boolean r3 = defpackage.zq3.c(r3, r0)
            r4 = 0
            if (r3 == 0) goto L47
            int[] r0 = r6.k
            int r1 = r6.l
            int r3 = r1 + (-1)
            int r5 = r2 + 1
            r0[r3] = r5
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L46
            int[] r7 = r6.k
            int r6 = r6.l
            int r6 = r6 + (-1)
            r7[r6] = r4
        L46:
            return r2
        L47:
            r3 = r2
        L48:
            int r3 = r3 + 1
            int r5 = r7.size()
            if (r3 != r5) goto L51
            r3 = r4
        L51:
            if (r3 != r2) goto L57
            r6.skipValue()
            goto Ld
        L57:
            java.lang.Object r5 = r7.get(r3)
            boolean r5 = defpackage.zq3.c(r5, r0)
            if (r5 == 0) goto L48
            int[] r0 = r6.k
            int r1 = r6.l
            int r2 = r1 + (-1)
            int r5 = r3 + 1
            r0[r2] = r5
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L7d
            int[] r7 = r6.k
            int r6 = r6.l
            int r6 = r6 + (-1)
            r7[r6] = r4
        L7d:
            return r3
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.json.b.l1(java.util.List):int");
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public boolean nextBoolean() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        if (intValue == 5) {
            this.c = 0;
            int[] iArr = this.j;
            int i = this.h - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (intValue == 6) {
            this.c = 0;
            int[] iArr2 = this.j;
            int i2 = this.h - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + b());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public double nextDouble() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        if (intValue == 15) {
            this.c = 0;
            int[] iArr = this.j;
            int i = this.h - 1;
            iArr[i] = iArr[i] + 1;
            return this.d;
        }
        if (intValue == 16) {
            this.f = this.b.s0(this.e);
        } else if (intValue == 9) {
            this.f = i(r);
        } else if (intValue == 8) {
            this.f = i(n);
        } else if (intValue == 10) {
            this.f = j();
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + b());
        }
        this.c = 11;
        try {
            String str = this.f;
            zq3.e(str);
            double parseDouble = Double.parseDouble(str);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + b());
            }
            this.f = null;
            this.c = 0;
            int[] iArr2 = this.j;
            int i2 = this.h - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f + " at path " + b());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public int nextInt() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        if (intValue == 15) {
            long j = this.d;
            int i = (int) j;
            if (j == i) {
                this.c = 0;
                int[] iArr = this.j;
                int i2 = this.h - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.d + " at path " + getPath());
        }
        if (intValue == 16) {
            this.f = this.b.s0(this.e);
        } else if (intValue == 9 || intValue == 8) {
            String i3 = i(intValue == 9 ? r : n);
            this.f = i3;
            try {
                zq3.e(i3);
                int parseInt = Integer.parseInt(i3);
                this.c = 0;
                int[] iArr2 = this.j;
                int i4 = this.h - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected an int but was " + peek() + " at path " + b());
        }
        this.c = 11;
        try {
            String str = this.f;
            zq3.e(str);
            double parseDouble = Double.parseDouble(str);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f = null;
                this.c = 0;
                int[] iArr3 = this.j;
                int i6 = this.h - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f + " at path " + b());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f + " at path " + b());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public long nextLong() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        if (intValue == 15) {
            this.c = 0;
            int[] iArr = this.j;
            int i = this.h - 1;
            iArr[i] = iArr[i] + 1;
            return this.d;
        }
        if (intValue == 16) {
            this.f = this.b.s0(this.e);
        } else if (intValue == 9 || intValue == 8) {
            String i2 = i(intValue == 9 ? r : n);
            this.f = i2;
            try {
                zq3.e(i2);
                long parseLong = Long.parseLong(i2);
                this.c = 0;
                int[] iArr2 = this.j;
                int i3 = this.h - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a long but was " + peek() + " at path " + b());
        }
        this.c = 11;
        try {
            String str = this.f;
            zq3.e(str);
            double parseDouble = Double.parseDouble(str);
            long j = (long) parseDouble;
            if (j == parseDouble) {
                this.f = null;
                this.c = 0;
                int[] iArr3 = this.j;
                int i4 = this.h - 1;
                iArr3[i4] = iArr3[i4] + 1;
                return j;
            }
            throw new JsonDataException("Expected a long but was " + this.f + " at path " + b());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f + " at path " + b());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public String nextName() {
        String i;
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : a()) {
            case 12:
                i = i(n);
                break;
            case 13:
                i = i(r);
                break;
            case 14:
                i = j();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + b());
        }
        this.c = 0;
        this.i[this.h - 1] = i;
        return i;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public String nextString() {
        Integer valueOf = Integer.valueOf(this.c);
        String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        if (intValue == 15) {
            str = String.valueOf(this.d);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = i(n);
                    break;
                case 9:
                    str = i(r);
                    break;
                case 10:
                    str = j();
                    break;
                case 11:
                    String str2 = this.f;
                    if (str2 != null) {
                        this.f = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + peek() + " at path " + b());
            }
        } else {
            str = this.b.s0(this.e);
        }
        this.c = 0;
        int[] iArr = this.j;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader.Token peek() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : a()) {
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
                return JsonReader.Token.NAME;
            case 15:
                return JsonReader.Token.LONG;
            case 16:
                return JsonReader.Token.NUMBER;
            case 17:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public void q() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public void skipValue() {
        int i = 0;
        do {
            Integer valueOf = Integer.valueOf(this.c);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            switch (valueOf != null ? valueOf.intValue() : a()) {
                case 1:
                    r(3);
                    i++;
                    break;
                case 2:
                    this.h--;
                    i--;
                    break;
                case 3:
                    r(1);
                    i++;
                    break;
                case 4:
                    this.h--;
                    i--;
                    break;
                case 8:
                case 12:
                    C(n);
                    break;
                case 9:
                case 13:
                    C(r);
                    break;
                case 10:
                case 14:
                    G();
                    break;
                case 16:
                    this.b.skip(this.e);
                    break;
            }
            this.c = 0;
        } while (i != 0);
        int[] iArr = this.j;
        int i2 = this.h;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.i[i2 - 1] = Constants.NULL_VERSION_ID;
    }
}
