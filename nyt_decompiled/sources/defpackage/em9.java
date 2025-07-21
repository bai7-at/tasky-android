package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import coil.compose.ImageLoaderProvidableCompositionLocal;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes4.dex */
public abstract class em9 {
    public static final AsyncImagePainter a(Object obj, Painter painter, Painter painter2, Painter painter3, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ContentScale contentScale, int i, Composer composer, int i2, int i3) {
        composer.z(1326707810);
        Painter d = (i3 & 2) != 0 ? do5.d(xe6.placeholder, composer, 0) : painter;
        Painter painter4 = (i3 & 4) != 0 ? d : painter2;
        Painter painter5 = (i3 & 8) != 0 ? d : painter3;
        ss2 ss2Var4 = (i3 & 16) != 0 ? null : ss2Var;
        ss2 ss2Var5 = (i3 & 32) != 0 ? null : ss2Var2;
        ss2 ss2Var6 = (i3 & 64) == 0 ? ss2Var3 : null;
        ContentScale e = (i3 & 128) != 0 ? ContentScale.a.e() : contentScale;
        int b = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? fv1.p.b() : i;
        if (b.G()) {
            b.S(1326707810, i2, -1, "com.nytimes.android.ribbon.composable.rememberXpnImagePainter (XpnPainter.kt:24)");
        }
        int i4 = i2 << 3;
        AsyncImagePainter d2 = iu.d(obj, ImageLoaderProvidableCompositionLocal.c(d74.a(), composer, 0), d, painter4, painter5, ss2Var4, ss2Var5, ss2Var6, e, b, composer, (458752 & i4) | 37448 | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return d2;
    }
}
