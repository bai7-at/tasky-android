package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import coil.compose.ImageLoaderProvidableCompositionLocal;

/* loaded from: classes.dex */
public abstract class wt7 {
    public static final AsyncImagePainter a(Object obj, ss2 ss2Var, ss2 ss2Var2, ContentScale contentScale, int i, Composer composer, int i2, int i3) {
        composer.z(-1494234083);
        ss2 a = (i3 & 2) != 0 ? AsyncImagePainter.B.a() : ss2Var;
        ss2 ss2Var3 = (i3 & 4) != 0 ? null : ss2Var2;
        ContentScale e = (i3 & 8) != 0 ? ContentScale.a.e() : contentScale;
        int b = (i3 & 16) != 0 ? fv1.p.b() : i;
        if (b.G()) {
            b.S(-1494234083, i2, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:91)");
        }
        int i4 = i2 << 3;
        AsyncImagePainter e2 = iu.e(obj, ImageLoaderProvidableCompositionLocal.c(d74.a(), composer, 6), a, ss2Var3, e, b, composer, (i4 & 896) | 72 | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e2;
    }
}
