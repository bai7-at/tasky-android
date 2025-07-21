package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* loaded from: classes.dex */
public final class hs1 {
    private final DisplayCutout a;

    static class a {
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    static class b {
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private hs1(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    static hs1 f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new hs1(displayCutout);
    }

    public int a() {
        return a.c(this.a);
    }

    public int b() {
        return a.d(this.a);
    }

    public int c() {
        return a.e(this.a);
    }

    public int d() {
        return a.f(this.a);
    }

    public jl3 e() {
        return Build.VERSION.SDK_INT >= 30 ? jl3.d(b.b(this.a)) : jl3.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hs1.class != obj.getClass()) {
            return false;
        }
        return ic5.a(this.a, ((hs1) obj).a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
