package defpackage;

import androidx.compose.runtime.Composer;

/* loaded from: classes.dex */
public final class ju7 {
    private final Composer a;

    private /* synthetic */ ju7(Composer composer) {
        this.a = composer;
    }

    public static final /* synthetic */ ju7 a(Composer composer) {
        return new ju7(composer);
    }

    public static Composer b(Composer composer) {
        return composer;
    }

    public static boolean c(Composer composer, Object obj) {
        return (obj instanceof ju7) && zq3.c(composer, ((ju7) obj).f());
    }

    public static int d(Composer composer) {
        return composer.hashCode();
    }

    public static String e(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ Composer f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
