package defpackage;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.UtilsKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.oq1;
import defpackage.sr8;
import defpackage.vg3;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public abstract class iu {
    private static final a a = new a();

    public static final class a implements sr8 {
        a() {
        }

        @Override // defpackage.dg8
        public void a(Drawable drawable) {
            sr8.a.c(this, drawable);
        }

        @Override // defpackage.dg8
        public void b(Drawable drawable) {
            sr8.a.b(this, drawable);
        }

        @Override // defpackage.dg8
        public void c(Drawable drawable) {
            sr8.a.a(this, drawable);
        }

        @Override // defpackage.sr8
        public Drawable d() {
            return null;
        }
    }

    private static final boolean c(long j) {
        return ((double) zt7.i(j)) >= 0.5d && ((double) zt7.g(j)) >= 0.5d;
    }

    public static final AsyncImagePainter d(Object obj, ImageLoader imageLoader, Painter painter, Painter painter2, Painter painter3, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ContentScale contentScale, int i, Composer composer, int i2, int i3) {
        composer.z(2140758544);
        Painter painter4 = (i3 & 4) != 0 ? null : painter;
        Painter painter5 = (i3 & 8) != 0 ? null : painter2;
        Painter painter6 = (i3 & 16) != 0 ? painter5 : painter3;
        ss2 ss2Var4 = (i3 & 32) != 0 ? null : ss2Var;
        ss2 ss2Var5 = (i3 & 64) != 0 ? null : ss2Var2;
        ss2 ss2Var6 = (i3 & 128) == 0 ? ss2Var3 : null;
        ContentScale e = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? ContentScale.a.e() : contentScale;
        int b = (i3 & 512) != 0 ? fv1.p.b() : i;
        if (b.G()) {
            b.S(2140758544, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:86)");
        }
        int i4 = i2 >> 12;
        AsyncImagePainter e2 = e(obj, imageLoader, UtilsKt.h(painter4, painter5, painter6), UtilsKt.d(ss2Var4, ss2Var5, ss2Var6), e, b, composer, (57344 & i4) | 72 | (i4 & 458752), 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e2;
    }

    public static final AsyncImagePainter e(Object obj, ImageLoader imageLoader, ss2 ss2Var, ss2 ss2Var2, ContentScale contentScale, int i, Composer composer, int i2, int i3) {
        composer.z(-2020614074);
        if ((i3 & 4) != 0) {
            ss2Var = AsyncImagePainter.B.a();
        }
        if ((i3 & 8) != 0) {
            ss2Var2 = null;
        }
        if ((i3 & 16) != 0) {
            contentScale = ContentScale.a.e();
        }
        if ((i3 & 32) != 0) {
            i = fv1.p.b();
        }
        if (b.G()) {
            b.S(-2020614074, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:131)");
        }
        vg3 e = UtilsKt.e(obj, composer, 8);
        i(e);
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new AsyncImagePainter(e, imageLoader);
            composer.q(A);
        }
        composer.R();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) A;
        asyncImagePainter.K(ss2Var);
        asyncImagePainter.F(ss2Var2);
        asyncImagePainter.C(contentScale);
        asyncImagePainter.D(i);
        asyncImagePainter.H(((Boolean) composer.m(InspectionModeKt.a())).booleanValue());
        asyncImagePainter.E(imageLoader);
        asyncImagePainter.I(e);
        asyncImagePainter.c();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return asyncImagePainter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final au7 f(long j) {
        if (j == zt7.b.a()) {
            return au7.d;
        }
        if (!c(j)) {
            return null;
        }
        float i = zt7.i(j);
        oq1 a2 = (Float.isInfinite(i) || Float.isNaN(i)) ? oq1.b.a : g.a(dg4.d(zt7.i(j)));
        float g = zt7.g(j);
        return new au7(a2, (Float.isInfinite(g) || Float.isNaN(g)) ? oq1.b.a : g.a(dg4.d(zt7.g(j))));
    }

    private static final Void g(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void h(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return g(str, str2);
    }

    private static final void i(vg3 vg3Var) {
        Object m = vg3Var.m();
        if (m instanceof vg3.a) {
            g("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (m instanceof sf3) {
            h("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (m instanceof ch3) {
            h("ImageVector", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (m instanceof Painter) {
            h("Painter", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (vg3Var.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
