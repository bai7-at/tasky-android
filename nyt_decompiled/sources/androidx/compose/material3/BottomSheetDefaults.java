package androidx.compose.material3;

import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Composer;
import defpackage.bu1;
import defpackage.ce8;
import defpackage.kc7;
import defpackage.nn0;
import defpackage.no7;
import defpackage.uh9;
import defpackage.vh9;
import defpackage.vq7;

/* loaded from: classes.dex */
public final class BottomSheetDefaults {
    public static final BottomSheetDefaults a = new BottomSheetDefaults();
    private static final float b = vq7.a.f();
    private static final float c = bu1.g(56);
    private static final float d = bu1.g(640);

    private BottomSheetDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(androidx.compose.ui.Modifier r27, float r28, float r29, defpackage.no7 r30, long r31, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetDefaults.a(androidx.compose.ui.Modifier, float, float, no7, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public final long b(Composer composer, int i) {
        composer.z(433375448);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:358)");
        }
        long j = ColorSchemeKt.j(vq7.a.a(), composer, 6);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return j;
    }

    public final float c() {
        return b;
    }

    public final no7 d(Composer composer, int i) {
        composer.z(1683783414);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:353)");
        }
        no7 d2 = ShapesKt.d(vq7.a.b(), composer, 6);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return d2;
    }

    public final long e(Composer composer, int i) {
        composer.z(-2040719176);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:366)");
        }
        long r = nn0.r(ColorSchemeKt.j(kc7.a.a(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return r;
    }

    public final float f() {
        return d;
    }

    public final o g(Composer composer, int i) {
        composer.z(-511309409);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-511309409, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:383)");
        }
        o f = uh9.f(ce8.a(o.a, composer, 6), vh9.a.g());
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return f;
    }
}
