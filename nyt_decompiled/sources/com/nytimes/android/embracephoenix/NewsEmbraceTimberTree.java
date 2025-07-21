package com.nytimes.android.embracephoenix;

import com.nytimes.android.embrace.EmbraceTimberTree;
import defpackage.du8;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.Severity;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class NewsEmbraceTimberTree extends EmbraceTimberTree {
    private final void z(int i, String str, String str2, Throwable th) {
        if (th != null) {
            Embrace.getInstance().logException(th, Severity.ERROR, t.m(du8.a("originalMessage", str2), du8.a("throwableMessage", th.getMessage()), du8.a("priority", Integer.valueOf(i))), (String) h.k0(str2).get(0));
            return;
        }
        StringBuilder sb = new StringBuilder(w(i));
        if (str != null) {
            sb.append(str);
        }
        sb.append(": ");
        sb.append(str2);
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        Embrace.getInstance().logWarning(sb2);
    }

    @Override // com.nytimes.android.embrace.EmbraceTimberTree
    public void x(int i, String str, String str2, Throwable th, boolean z) {
        String message;
        zq3.h(str2, "message");
        if (i != 5 && i != 6 && i != 7) {
            if (i != 8 || th == null || (message = th.getMessage()) == null) {
                return;
            }
            Embrace.getInstance().logMessage(message, Severity.ERROR);
            return;
        }
        if (!z) {
            z(i, str, str2, th);
            return;
        }
        z(i, str, "(BG): " + str2, th);
    }
}
