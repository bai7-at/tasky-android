package com.nytimes.android;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.meter.MeterServiceResponse;
import defpackage.du8;
import defpackage.e52;
import defpackage.qs2;
import defpackage.tx1;
import defpackage.ue4;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class ArticlePageEventSender {
    private final ET2Scope a;

    public ArticlePageEventSender(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    public final String a() {
        PageContext i;
        tx1 c = this.a.c();
        if (c == null || (i = c.i()) == null) {
            return null;
        }
        return i.g();
    }

    public final void b(MeterServiceResponse meterServiceResponse) {
        zq3.h(meterServiceResponse, "response");
        if (meterServiceResponse.getMeterLatencyDelta() != -1) {
            ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new ue4(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, "timing"), du8.a("context", "script-load"), du8.a("label", "meter"), du8.a("region", String.valueOf(meterServiceResponse.getMeterLatencyDelta()))), null, null, 12, null);
        }
    }

    public final void c(final MeterServiceResponse meterServiceResponse) {
        zq3.h(meterServiceResponse, "response");
        ET2PageScope.DefaultImpls.a(this.a, new e52.j(), null, null, new qs2() { // from class: com.nytimes.android.ArticlePageEventSender$sentMeterEvent$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ue4 mo865invoke() {
                return new k(new j(MeterServiceResponse.this));
            }
        }, 6, null);
    }
}
