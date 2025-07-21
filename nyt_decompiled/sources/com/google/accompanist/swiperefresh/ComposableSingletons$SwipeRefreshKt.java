package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.kt2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class ComposableSingletons$SwipeRefreshKt {
    public static final ComposableSingletons$SwipeRefreshKt a = new ComposableSingletons$SwipeRefreshKt();
    public static kt2 b = zr0.c(-1555165631, false, new kt2() { // from class: com.google.accompanist.swiperefresh.ComposableSingletons$SwipeRefreshKt$lambda-1$1
        public final void b(SwipeRefreshState swipeRefreshState, float f, Composer composer, int i) {
            int i2;
            zq3.h(swipeRefreshState, "s");
            if ((i & 14) == 0) {
                i2 = i | (composer.S(swipeRefreshState) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i2 |= composer.b(f) ? 32 : 16;
            }
            if ((i2 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1555165631, i2, -1, "com.google.accompanist.swiperefresh.ComposableSingletons$SwipeRefreshKt.lambda-1.<anonymous> (SwipeRefresh.kt:267)");
            }
            SwipeRefreshIndicatorKt.a(swipeRefreshState, f, null, false, false, false, 0L, 0L, null, 0.0f, false, 0.0f, composer, i2 & WebSocketProtocol.PAYLOAD_SHORT, 0, 4092);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((SwipeRefreshState) obj, ((bu1) obj2).n(), (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });

    public final kt2 a() {
        return b;
    }
}
