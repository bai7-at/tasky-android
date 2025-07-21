package com.nytimes.xwords.hybrid.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.xwords.hybrid.utils.ErrorType;
import defpackage.c44;
import defpackage.e52;
import defpackage.ei3;
import defpackage.t42;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ErrorPageEventReporter implements c44 {
    private final PageContext a;
    private final String b;
    private final String c;
    private final ErrorType d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                iArr[ErrorType.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorType.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ErrorPageEventReporter(PageContext pageContext, String str, String str2, ErrorType errorType) {
        zq3.h(pageContext, "pageContext");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "region");
        zq3.h(errorType, "errorType");
        this.a = pageContext;
        this.b = str;
        this.c = str2;
        this.d = errorType;
    }

    @k(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        EventTracker.i(EventTracker.a, this.a, new e52.h(), null, 4, null);
    }

    @k(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (a.a[this.d.ordinal()] != 1) {
            return;
        }
        EventTracker.a.h(this.a, new e52.d(), t42.a.b(new ei3(this.b, this.c, null, 4, null)));
    }
}
