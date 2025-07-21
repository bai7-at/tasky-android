package com.nytimes.subauth.ui.purr.ui.screens;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bu1;
import defpackage.bv8;
import defpackage.dh8;
import defpackage.ek8;
import defpackage.it2;
import defpackage.k48;
import defpackage.m36;
import defpackage.m37;
import defpackage.mm6;
import defpackage.uh8;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class ComposableSingletons$YourPrivacyChoicesScreenKt {
    public static final ComposableSingletons$YourPrivacyChoicesScreenKt a = new ComposableSingletons$YourPrivacyChoicesScreenKt();
    public static it2 b = zr0.c(-366619500, false, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.ComposableSingletons$YourPrivacyChoicesScreenKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            j b2;
            zq3.h(m37Var, "$this$OutlinedButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-366619500, i, -1, "com.nytimes.subauth.ui.purr.ui.screens.ComposableSingletons$YourPrivacyChoicesScreenKt.lambda-1.<anonymous> (YourPrivacyChoicesScreen.kt:103)");
            }
            String b3 = k48.b(mm6.opt_out, composer, 0);
            b2 = r16.b((r42 & 1) != 0 ? r16.a.i() : m36.a.a(composer, 6).b().j(), (r42 & 2) != 0 ? r16.a.m() : ek8.g(16), (r42 & 4) != 0 ? r16.a.p() : null, (r42 & 8) != 0 ? r16.a.n() : null, (r42 & 16) != 0 ? r16.a.o() : null, (r42 & 32) != 0 ? r16.a.k() : null, (r42 & 64) != 0 ? r16.a.l() : null, (r42 & 128) != 0 ? r16.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r16.a.g() : null, (r42 & 512) != 0 ? r16.a.w() : null, (r42 & 1024) != 0 ? r16.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r16.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r16.a.u() : null, (r42 & 8192) != 0 ? r16.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r16.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r16.b.i()) : null, (r42 & 65536) != 0 ? r16.b.e() : ek8.g(24), (r42 & 131072) != 0 ? bv8.b().b.j() : null);
            TextKt.e(b3, PaddingKt.k(Modifier.a, 0.0f, bu1.g(5), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, b2, composer, 48, 0, 32764);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
