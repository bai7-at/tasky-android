package defpackage;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class op5 {

    static class a {
        static Interpolator a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        static Interpolator b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f, float f2, float f3, float f4) {
        return a.b(f, f2, f3, f4);
    }

    public static Interpolator b(Path path) {
        return a.c(path);
    }
}
