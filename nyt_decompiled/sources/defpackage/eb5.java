package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.designsystem.uicompose.ui.NytDesignSystemKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class eb5 {
    public static final a Companion = new a(null);
    private final lb5 a;
    private final ef8 b;
    private final ob5 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lb5 a(Composer composer, int i) {
            composer.z(1419153279);
            if (b.G()) {
                b.S(1419153279, i, -1, "com.nytimes.android.designsystem.uicompose.ui.NytDesignSystem.Companion.<get-colors> (NytDesignSystem.kt:26)");
            }
            lb5 a = ((eb5) composer.m(NytDesignSystemKt.a())).a();
            if (b.G()) {
                b.R();
            }
            composer.R();
            return a;
        }

        public final ef8 b(Composer composer, int i) {
            composer.z(-300109446);
            if (b.G()) {
                b.S(-300109446, i, -1, "com.nytimes.android.designsystem.uicompose.ui.NytDesignSystem.Companion.<get-tplColors> (NytDesignSystem.kt:34)");
            }
            ef8 b = ((eb5) composer.m(NytDesignSystemKt.a())).b();
            if (b.G()) {
                b.R();
            }
            composer.R();
            return b;
        }

        public final ob5 c(Composer composer, int i) {
            composer.z(725779294);
            if (b.G()) {
                b.S(725779294, i, -1, "com.nytimes.android.designsystem.uicompose.ui.NytDesignSystem.Companion.<get-typography> (NytDesignSystem.kt:31)");
            }
            ob5 c = ((eb5) composer.m(NytDesignSystemKt.a())).c();
            if (b.G()) {
                b.R();
            }
            composer.R();
            return c;
        }

        private a() {
        }
    }

    public eb5(lb5 lb5Var, ef8 ef8Var, ob5 ob5Var) {
        zq3.h(lb5Var, "colors");
        zq3.h(ef8Var, "tplColors");
        zq3.h(ob5Var, "typography");
        this.a = lb5Var;
        this.b = ef8Var;
        this.c = ob5Var;
    }

    public final lb5 a() {
        return this.a;
    }

    public final ef8 b() {
        return this.b;
    }

    public final ob5 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb5)) {
            return false;
        }
        eb5 eb5Var = (eb5) obj;
        return zq3.c(this.a, eb5Var.a) && zq3.c(this.b, eb5Var.b) && zq3.c(this.c, eb5Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "NytDesignSystem(colors=" + this.a + ", tplColors=" + this.b + ", typography=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ eb5(defpackage.lb5 r1, defpackage.ef8 r2, defpackage.ob5 r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L8
            lb5 r1 = defpackage.mb5.f()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L10
            ef8 r2 = defpackage.ff8.d()
        L10:
            r4 = r4 & 4
            if (r4 == 0) goto L19
            ob5 r3 = new ob5
            r3.<init>(r1)
        L19:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb5.<init>(lb5, ef8, ob5, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
