package defpackage;

/* loaded from: classes5.dex */
public abstract class h1 {
    public static final byte a(char c) {
        if (c < '~') {
            return pj0.c[c];
        }
        return (byte) 0;
    }

    public static final char b(int i) {
        if (i < 117) {
            return pj0.b[i];
        }
        return (char) 0;
    }

    public static final String c(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
