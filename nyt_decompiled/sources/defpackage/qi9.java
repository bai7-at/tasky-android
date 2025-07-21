package defpackage;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class qi9 {
    public static final a e = new a(null);
    public static final int f = 8;
    private final CharSequence a;
    private final int b;
    private final int c;
    private final BreakIterator d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i) {
            int type2 = Character.getType(i);
            return type2 == 23 || type2 == 20 || type2 == 22 || type2 == 30 || type2 == 29 || type2 == 24 || type2 == 21;
        }

        private a() {
        }
    }

    public qi9(CharSequence charSequence, int i, int i2, Locale locale) {
        this.a = charSequence;
        if (i < 0 || i > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, i - 50);
        this.c = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new uj0(charSequence, i, i2));
    }

    private final void a(int i) {
        int i2 = this.b;
        if (i > this.c || i2 > i) {
            throw new IllegalArgumentException(("Invalid offset: " + i + ". Valid range is [" + this.b + " , " + this.c + ']').toString());
        }
    }

    private final int b(int i, boolean z) {
        a(i);
        if (j(i)) {
            return (!this.d.isBoundary(i) || (h(i) && z)) ? this.d.preceding(i) : i;
        }
        if (h(i)) {
            return this.d.preceding(i);
        }
        return -1;
    }

    private final int c(int i, boolean z) {
        a(i);
        if (h(i)) {
            return (!this.d.isBoundary(i) || (j(i) && z)) ? this.d.following(i) : i;
        }
        if (j(i)) {
            return this.d.following(i);
        }
        return -1;
    }

    private final boolean h(int i) {
        return i <= this.c && this.b + 1 <= i && Character.isLetterOrDigit(Character.codePointBefore(this.a, i));
    }

    private final boolean j(int i) {
        return i < this.c && this.b <= i && Character.isLetterOrDigit(Character.codePointAt(this.a, i));
    }

    private final boolean l(int i) {
        return !k(i) && i(i);
    }

    private final boolean m(int i) {
        return k(i) && !i(i);
    }

    public final int d(int i) {
        return c(i, true);
    }

    public final int e(int i) {
        return b(i, true);
    }

    public final int f(int i) {
        a(i);
        while (i != -1 && !m(i)) {
            i = o(i);
        }
        return i;
    }

    public final int g(int i) {
        a(i);
        while (i != -1 && !l(i)) {
            i = n(i);
        }
        return i;
    }

    public final boolean i(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return e.a(Character.codePointBefore(this.a, i));
    }

    public final boolean k(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return e.a(Character.codePointAt(this.a, i));
    }

    public final int n(int i) {
        a(i);
        return this.d.following(i);
    }

    public final int o(int i) {
        a(i);
        return this.d.preceding(i);
    }
}
