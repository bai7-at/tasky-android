package org.jsoup.parser;

import defpackage.u29;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;
import org.jsoup.UncheckedIOException;

/* loaded from: classes5.dex */
public final class a {
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String[] h;
    private boolean i;

    public a(Reader reader, int i) {
        this.g = -1;
        this.h = new String[512];
        u29.i(reader);
        u29.c(reader.markSupported());
        this.b = reader;
        this.a = new char[i > 32768 ? 32768 : i];
        b();
    }

    static boolean I(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    private void b() {
        int i;
        int i2;
        boolean z;
        if (this.i || (i = this.e) < this.d) {
            return;
        }
        int i3 = this.g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long skip = this.b.skip(j);
            this.b.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.b;
                char[] cArr = this.a;
                int read = reader.read(cArr, i4, cArr.length - i4);
                if (read == -1) {
                    this.i = true;
                }
                if (read <= 0) {
                    break;
                } else {
                    i4 += read;
                }
            }
            this.b.reset();
            if (i4 > 0) {
                if (skip != j) {
                    z = false;
                }
                u29.c(z);
                this.c = i4;
                this.f += i;
                this.e = i2;
                if (this.g != -1) {
                    this.g = 0;
                }
                if (i4 > 24576) {
                    i4 = 24576;
                }
                this.d = i4;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 * 31;
        int i4 = 0;
        int i5 = i;
        while (i4 < i2) {
            i3 = (i3 * 31) + cArr[i5];
            i4++;
            i5++;
        }
        int i6 = i3 & 511;
        String str = strArr[i6];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[i6] = str2;
            return str2;
        }
        if (I(cArr, i, i2, str)) {
            return str;
        }
        String str3 = new String(cArr, i, i2);
        strArr[i6] = str3;
        return str3;
    }

    private boolean u() {
        return this.e >= this.c;
    }

    boolean A(char... cArr) {
        if (t()) {
            return false;
        }
        b();
        char c = this.a[this.e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    boolean B(char[] cArr) {
        b();
        return !t() && Arrays.binarySearch(cArr, this.a[this.e]) >= 0;
    }

    boolean C() {
        char c;
        return !t() && (c = this.a[this.e]) >= '0' && c <= '9';
    }

    boolean D(String str) {
        b();
        int length = str.length();
        if (length > this.c - this.e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.a[this.e + i])) {
                return false;
            }
        }
        return true;
    }

    boolean E() {
        if (t()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    int F(char c) {
        b();
        for (int i = this.e; i < this.c; i++) {
            if (c == this.a[i]) {
                return i - this.e;
            }
        }
        return -1;
    }

    int G(CharSequence charSequence) {
        b();
        char charAt = charSequence.charAt(0);
        int i = this.e;
        while (i < this.c) {
            if (charAt != this.a[i]) {
                do {
                    i++;
                    if (i >= this.c) {
                        break;
                    }
                } while (charAt != this.a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.e;
                }
            }
            i = i2;
        }
        return -1;
    }

    public int H() {
        return this.f + this.e;
    }

    void J() {
        int i = this.g;
        if (i == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.e = i;
        L();
    }

    void K() {
        int i = this.e;
        if (i < 1) {
            throw new UncheckedIOException(new IOException("No buffer left to unconsume"));
        }
        this.e = i - 1;
    }

    void L() {
        this.g = -1;
    }

    public void a() {
        this.e++;
    }

    public void d() {
        Reader reader = this.b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.b = null;
            this.a = null;
            this.h = null;
            throw th;
        }
        this.b = null;
        this.a = null;
        this.h = null;
    }

    char e() {
        b();
        char c = u() ? (char) 65535 : this.a[this.e];
        this.e++;
        return c;
    }

    String f() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    String g() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (c = this.a[i]) < '0' || c > '9') {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    String h() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (((c = this.a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    String i() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    String j() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        while (!u()) {
            char[] cArr = this.a;
            int i3 = this.e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.e = i3 + 1;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    String k() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    String l() {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == '\t' || c == '\n' || c == '\f' || c == '\r') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public String m(char c) {
        int F = F(c);
        if (F == -1) {
            return q();
        }
        String c2 = c(this.a, this.h, this.e, F);
        this.e += F;
        return c2;
    }

    String n(String str) {
        int G = G(str);
        if (G != -1) {
            String c = c(this.a, this.h, this.e, G);
            this.e += G;
            return c;
        }
        if (this.c - this.e < str.length()) {
            return q();
        }
        int length = (this.c - str.length()) + 1;
        char[] cArr = this.a;
        String[] strArr = this.h;
        int i = this.e;
        String c2 = c(cArr, strArr, i, length - i);
        this.e = length;
        return c2;
    }

    public String o(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    String p(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    String q() {
        b();
        char[] cArr = this.a;
        String[] strArr = this.h;
        int i = this.e;
        String c = c(cArr, strArr, i, this.c - i);
        this.e = this.c;
        return c;
    }

    boolean r(String str) {
        Locale locale = Locale.ENGLISH;
        return G(str.toLowerCase(locale)) > -1 || G(str.toUpperCase(locale)) > -1;
    }

    public char s() {
        b();
        if (u()) {
            return (char) 65535;
        }
        return this.a[this.e];
    }

    public boolean t() {
        b();
        return this.e >= this.c;
    }

    public String toString() {
        int i = this.c;
        int i2 = this.e;
        return i - i2 < 0 ? "" : new String(this.a, i2, i - i2);
    }

    void v() {
        if (this.c - this.e < 1024) {
            this.d = 0;
        }
        b();
        this.g = this.e;
    }

    boolean w(String str) {
        b();
        if (!z(str)) {
            return false;
        }
        this.e += str.length();
        return true;
    }

    boolean x(String str) {
        if (!D(str)) {
            return false;
        }
        this.e += str.length();
        return true;
    }

    boolean y(char c) {
        return !t() && this.a[this.e] == c;
    }

    boolean z(String str) {
        b();
        int length = str.length();
        if (length > this.c - this.e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.a[this.e + i]) {
                return false;
            }
        }
        return true;
    }

    public a(Reader reader) {
        this(reader, 32768);
    }

    public a(String str) {
        this(new StringReader(str), str.length());
    }
}
