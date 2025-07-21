package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.ImageLoader;
import defpackage.en0;
import defpackage.m76;
import defpackage.qs2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class ImageLoaderProvidableCompositionLocal {
    public static m76 a(m76 m76Var) {
        return m76Var;
    }

    public static /* synthetic */ m76 b(m76 m76Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            m76Var = CompositionLocalKt.e(new qs2() { // from class: coil.compose.ImageLoaderProvidableCompositionLocal.1
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ImageLoader mo865invoke() {
                    return null;
                }
            });
        }
        return a(m76Var);
    }

    public static final ImageLoader c(m76 m76Var, Composer composer, int i) {
        if (b.G()) {
            b.S(-617597678, i, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        ImageLoader imageLoader = (ImageLoader) composer.m(m76Var);
        if (imageLoader == null) {
            imageLoader = en0.a((Context) composer.m(AndroidCompositionLocals_androidKt.g()));
        }
        if (b.G()) {
            b.R();
        }
        return imageLoader;
    }
}
