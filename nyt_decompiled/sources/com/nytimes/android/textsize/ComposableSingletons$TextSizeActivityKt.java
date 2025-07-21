package com.nytimes.android.textsize;

import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.media.audio.views.AudioIndicatorLayoutKt;
import defpackage.ap;
import defpackage.gt2;
import defpackage.k48;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$TextSizeActivityKt {
    public static final ComposableSingletons$TextSizeActivityKt a = new ComposableSingletons$TextSizeActivityKt();
    public static gt2 b = zr0.c(499844796, false, new gt2() { // from class: com.nytimes.android.textsize.ComposableSingletons$TextSizeActivityKt$lambda-1$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(499844796, i, -1, "com.nytimes.android.textsize.ComposableSingletons$TextSizeActivityKt.lambda-1.<anonymous> (TextSizeActivity.kt:54)");
            }
            TextKt.c(k48.b(xk6.text_size_setting_title, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(2072334682, false, new gt2() { // from class: com.nytimes.android.textsize.ComposableSingletons$TextSizeActivityKt$lambda-2$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(2072334682, i, -1, "com.nytimes.android.textsize.ComposableSingletons$TextSizeActivityKt.lambda-2.<anonymous> (TextSizeActivity.kt:51)");
            }
            IconKt.a(ap.a(oe3.a.a), null, null, 0L, composer, 48, 12);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 d = zr0.c(1642367829, false, new gt2() { // from class: com.nytimes.android.textsize.ComposableSingletons$TextSizeActivityKt$lambda-3$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1642367829, i, -1, "com.nytimes.android.textsize.ComposableSingletons$TextSizeActivityKt.lambda-3.<anonymous> (TextSizeActivity.kt:58)");
            }
            AudioIndicatorLayoutKt.a(composer, 0);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }

    public final gt2 c() {
        return d;
    }
}
