package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class pi9 {
    private final qi9 a;

    public pi9(Locale locale, CharSequence charSequence) {
        this.a = new qi9(charSequence, 0, charSequence.length(), locale);
    }

    public final int a(int i) {
        int g = this.a.i(this.a.n(i)) ? this.a.g(i) : this.a.d(i);
        return g == -1 ? i : g;
    }

    public final int b(int i) {
        int f = this.a.k(this.a.o(i)) ? this.a.f(i) : this.a.e(i);
        return f == -1 ? i : f;
    }
}
