package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.d74;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.qn0;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class SingletonAsyncImageKt {
    public static final void a(final Object obj, final String str, Modifier modifier, ss2 ss2Var, ss2 ss2Var2, Alignment alignment, ContentScale contentScale, float f, qn0 qn0Var, int i, Composer composer, final int i2, final int i3) {
        ss2 ss2Var3;
        int i4;
        int i5;
        Composer h = composer.h(-941517612);
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.a : modifier;
        if ((i3 & 8) != 0) {
            i4 = i2 & (-7169);
            ss2Var3 = AsyncImagePainter.B.a();
        } else {
            ss2Var3 = ss2Var;
            i4 = i2;
        }
        ss2 ss2Var4 = (i3 & 16) != 0 ? null : ss2Var2;
        Alignment e = (i3 & 32) != 0 ? Alignment.a.e() : alignment;
        ContentScale e2 = (i3 & 64) != 0 ? ContentScale.a.e() : contentScale;
        float f2 = (i3 & 128) != 0 ? 1.0f : f;
        qn0 qn0Var2 = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : qn0Var;
        if ((i3 & 512) != 0) {
            i4 &= -1879048193;
            i5 = fv1.p.b();
        } else {
            i5 = i;
        }
        if (b.G()) {
            b.S(-941517612, i4, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:99)");
        }
        int i6 = i4 << 3;
        AsyncImageKt.a(obj, str, ImageLoaderProvidableCompositionLocal.c(d74.a(), h, 6), modifier2, ss2Var3, ss2Var4, e, e2, f2, qn0Var2, i5, h, (i4 & ContentType.LONG_FORM_ON_DEMAND) | 520 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i4 >> 27) & 14, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        final ss2 ss2Var5 = ss2Var3;
        final ss2 ss2Var6 = ss2Var4;
        final Alignment alignment2 = e;
        final ContentScale contentScale2 = e2;
        final float f3 = f2;
        final qn0 qn0Var3 = qn0Var2;
        final int i7 = i5;
        k.a(new gt2() { // from class: coil.compose.SingletonAsyncImageKt$AsyncImage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i8) {
                SingletonAsyncImageKt.a(obj, str, modifier2, ss2Var5, ss2Var6, alignment2, contentScale2, f3, qn0Var3, i7, composer2, i2 | 1, i3);
            }
        });
    }
}
