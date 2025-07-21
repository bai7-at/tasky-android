package defpackage;

import androidx.compose.ui.text.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ly1 {
    public static final a f = new a(null);
    public static final int g = 8;
    private final ep5 a;
    private int b;
    private int c;
    private int d;
    private int e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ ly1(androidx.compose.ui.text.a aVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j);
    }

    private final void q(int i) {
        if (i >= 0) {
            this.c = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
    }

    private final void r(int i) {
        if (i >= 0) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
    }

    public final void a() {
        this.d = -1;
        this.e = -1;
    }

    public final void b(int i, int i2) {
        long b = pj8.b(i, i2);
        this.a.c(i, i2, "");
        long a2 = my1.a(pj8.b(this.b, this.c), b);
        r(i.l(a2));
        q(i.k(a2));
        if (l()) {
            long a3 = my1.a(pj8.b(this.d, this.e), b);
            if (i.h(a3)) {
                a();
            } else {
                this.d = i.l(a3);
                this.e = i.k(a3);
            }
        }
    }

    public final char c(int i) {
        return this.a.a(i);
    }

    public final i d() {
        if (l()) {
            return i.b(pj8.b(this.d, this.e));
        }
        return null;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int h() {
        return this.a.b();
    }

    public final long i() {
        return pj8.b(this.b, this.c);
    }

    public final int j() {
        return this.c;
    }

    public final int k() {
        return this.b;
    }

    public final boolean l() {
        return this.d != -1;
    }

    public final void m(int i, int i2, String str) {
        if (i < 0 || i > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.a.b());
        }
        if (i2 < 0 || i2 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.a.b());
        }
        if (i <= i2) {
            this.a.c(i, i2, str);
            r(str.length() + i);
            q(i + str.length());
            this.d = -1;
            this.e = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
    }

    public final void n(int i, int i2) {
        if (i < 0 || i > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.a.b());
        }
        if (i2 < 0 || i2 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.a.b());
        }
        if (i < i2) {
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
    }

    public final void o(int i) {
        p(i, i);
    }

    public final void p(int i, int i2) {
        if (i < 0 || i > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.a.b());
        }
        if (i2 < 0 || i2 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.a.b());
        }
        if (i <= i2) {
            r(i);
            q(i2);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
    }

    public final androidx.compose.ui.text.a s() {
        return new androidx.compose.ui.text.a(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.a.toString();
    }

    private ly1(androidx.compose.ui.text.a aVar, long j) {
        this.a = new ep5(aVar.j());
        this.b = i.l(j);
        this.c = i.k(j);
        this.d = -1;
        this.e = -1;
        int l = i.l(j);
        int k = i.k(j);
        if (l < 0 || l > aVar.length()) {
            throw new IndexOutOfBoundsException("start (" + l + ") offset is outside of text region " + aVar.length());
        }
        if (k < 0 || k > aVar.length()) {
            throw new IndexOutOfBoundsException("end (" + k + ") offset is outside of text region " + aVar.length());
        }
        if (l <= k) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + l + " > " + k);
    }
}
