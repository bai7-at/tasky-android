package com.nytimes.android.embrace;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import com.nytimes.android.embrace.backgroundqueue.BackgroundEmbraceTimberQueue;
import defpackage.d44;
import defpackage.ei1;
import defpackage.kt2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.Severity;

/* loaded from: classes4.dex */
public class EmbraceTimberTree extends ul8.c implements ei1 {
    private boolean b;
    private final BackgroundEmbraceTimberQueue c;

    public EmbraceTimberTree() {
        this.b = true;
        Lifecycle lifecycle = l.k().getLifecycle();
        lifecycle.a(this);
        this.b = true ^ lifecycle.b().isAtLeast(Lifecycle.State.STARTED);
        this.c = new BackgroundEmbraceTimberQueue(0, new kt2() { // from class: com.nytimes.android.embrace.EmbraceTimberTree$backgroundLogQueue$1
            {
                super(4);
            }

            public final void b(int i, String str, String str2, Throwable th) {
                zq3.h(str2, "message");
                EmbraceTimberTree.this.x(i, str, str2, th, true);
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                b(((Number) obj).intValue(), (String) obj2, (String) obj3, (Throwable) obj4);
                return ww8.a;
            }
        }, null, 5, null);
    }

    public static /* synthetic */ void y(EmbraceTimberTree embraceTimberTree, int i, String str, String str2, Throwable th, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleEmbraceLogging");
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        embraceTimberTree.x(i, str, str2, th, z);
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.b = false;
        super.onStart(d44Var);
        if (this.c.g()) {
            this.c.f();
        }
    }

    @Override // defpackage.ei1
    public void onStop(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.b = true;
        super.onStop(d44Var);
    }

    @Override // ul8.c
    protected void p(int i, String str, String str2, Throwable th) {
        zq3.h(str2, "message");
        if (!Embrace.getInstance().isStarted() || this.b) {
            this.c.d(i, str, str2, th);
        } else {
            y(this, i, str, str2, th, false, 16, null);
        }
    }

    public String w(int i) {
        switch (i) {
            case 2:
                return "V/";
            case 3:
                return "D/";
            case 4:
                return "I/";
            case 5:
                return "W/";
            case 6:
                return "E/";
            case 7:
                return "A/";
            case 8:
                return "REPORT/";
            default:
                return "?/";
        }
    }

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
        StringBuilder sb = new StringBuilder(w(i));
        if (str != null) {
            sb.append(str);
        }
        sb.append(": ");
        if (z) {
            sb.append("(BG): ");
        }
        sb.append(str2);
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        Embrace.getInstance().logMessage(sb2, Severity.WARNING);
    }
}
