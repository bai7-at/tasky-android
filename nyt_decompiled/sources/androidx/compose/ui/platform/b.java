package androidx.compose.ui.platform;

import defpackage.zq3;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class b extends androidx.compose.ui.platform.a {
    public static final a d = new a(null);
    public static final int e = 8;
    private static b f;
    private BreakIterator c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Locale locale) {
            if (b.f == null) {
                b.f = new b(locale, null);
            }
            b bVar = b.f;
            zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return bVar;
        }

        private a() {
        }
    }

    public /* synthetic */ b(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // defpackage.y2
    public int[] a(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                zq3.z("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    zq3.z("impl");
                    breakIterator2 = null;
                }
                int following = breakIterator2.following(i);
                if (following == -1) {
                    return null;
                }
                return c(i, following);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                zq3.z("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.following(i);
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                zq3.z("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    zq3.z("impl");
                    breakIterator2 = null;
                }
                int preceding = breakIterator2.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                zq3.z("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.preceding(i);
        } while (i != -1);
        return null;
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

    private b(Locale locale) {
        i(locale);
    }
}
