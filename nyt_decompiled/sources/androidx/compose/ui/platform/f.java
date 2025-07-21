package androidx.compose.ui.platform;

import defpackage.zq3;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f extends androidx.compose.ui.platform.a {
    public static final a d = new a(null);
    public static final int e = 8;
    private static f f;
    private BreakIterator c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Locale locale) {
            if (f.f == null) {
                f.f = new f(locale, null);
            }
            f fVar = f.f;
            zq3.f(fVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return fVar;
        }

        private a() {
        }
    }

    public /* synthetic */ f(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean i(int i) {
        return i > 0 && j(i + (-1)) && (i == d().length() || !j(i));
    }

    private final boolean j(int i) {
        if (i < 0 || i >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i));
    }

    private final boolean k(int i) {
        return j(i) && (i == 0 || !j(i - 1));
    }

    private final void l(Locale locale) {
        this.c = BreakIterator.getWordInstance(locale);
    }

    @Override // defpackage.y2
    public int[] a(int i) {
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!j(i) && !k(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                zq3.z("impl");
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            zq3.z("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i);
        if (following == -1 || !i(following)) {
            return null;
        }
        return c(i, following);
    }

    @Override // defpackage.y2
    public int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !j(i - 1) && !i(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                zq3.z("impl");
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            zq3.z("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i);
        if (preceding == -1 || !k(preceding)) {
            return null;
        }
        return c(preceding, i);
    }

    @Override // androidx.compose.ui.platform.a
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.c;
        if (breakIterator == null) {
            zq3.z("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private f(Locale locale) {
        l(locale);
    }
}
