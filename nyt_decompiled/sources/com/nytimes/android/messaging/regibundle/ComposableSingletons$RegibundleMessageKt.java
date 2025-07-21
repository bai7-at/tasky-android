package com.nytimes.android.messaging.regibundle;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.nytimes.android.messaging.regibundle.models.RegibundleDataKt;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.bu1;
import defpackage.c37;
import defpackage.d37;
import defpackage.do5;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.k48;
import defpackage.ol6;
import defpackage.ue6;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$RegibundleMessageKt {
    public static final ComposableSingletons$RegibundleMessageKt a = new ComposableSingletons$RegibundleMessageKt();
    public static gt2 b = zr0.c(-861817260, false, new gt2() { // from class: com.nytimes.android.messaging.regibundle.ComposableSingletons$RegibundleMessageKt$lambda-1$1
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
                b.S(-861817260, i, -1, "com.nytimes.android.messaging.regibundle.ComposableSingletons$RegibundleMessageKt.lambda-1.<anonymous> (RegibundleMessage.kt:119)");
            }
            IconKt.b(do5.d(ue6.ic_close_24, composer, 0), k48.b(ol6.cd_sub_message_dismiss, composer, 0), null, eb5.Companion.a(composer, 8).l(), composer, 8, 4);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(1453182305, false, new gt2() { // from class: com.nytimes.android.messaging.regibundle.ComposableSingletons$RegibundleMessageKt$lambda-2$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i) {
            c37 e;
            if ((i & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1453182305, i, -1, "com.nytimes.android.messaging.regibundle.ComposableSingletons$RegibundleMessageKt.lambda-2.<anonymous> (RegibundleMessage.kt:193)");
            }
            Modifier t = SizeKt.t(Modifier.a, bu1.g(0), bu1.g(500));
            long a2 = eb5.Companion.a(composer, 8).a();
            if (DeviceUtils.G((Context) composer.m(AndroidCompositionLocals_androidKt.g()))) {
                e = d37.c(bu1.g(10));
            } else {
                float f = 10;
                e = d37.e(bu1.g(f), bu1.g(f), 0.0f, 0.0f, 12, null);
            }
            RegibundleMessageKt.c(true, "$4.99/month", RegibundleDataKt.defaultRegibundleData(), BackgroundKt.c(t, a2, e), null, null, null, null, composer, 566, 240);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
