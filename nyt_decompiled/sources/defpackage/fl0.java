package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ch3;
import defpackage.oe3;

/* loaded from: classes.dex */
public abstract class fl0 {
    private static ch3 a;

    public static final ch3 a(oe3.c cVar) {
        ch3.a c;
        ch3 ch3Var = a;
        if (ch3Var != null) {
            zq3.e(ch3Var);
            return ch3Var;
        }
        ch3.a aVar = new ch3.a("Rounded.Clear", bu1.g(24.0f), bu1.g(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int b = c49.b();
        ox7 ox7Var = new ox7(nn0.b.a(), null);
        int a2 = v48.a.a();
        int a3 = x48.a.a();
        kp5 kp5Var = new kp5();
        kp5Var.i(18.3f, 5.71f);
        kp5Var.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        kp5Var.g(12.0f, 10.59f);
        kp5Var.g(7.11f, 5.7f);
        kp5Var.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        kp5Var.c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        kp5Var.g(10.59f, 12.0f);
        kp5Var.g(5.7f, 16.89f);
        kp5Var.c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        kp5Var.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        kp5Var.g(12.0f, 13.41f);
        kp5Var.h(4.89f, 4.89f);
        kp5Var.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        kp5Var.c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        kp5Var.g(13.41f, 12.0f);
        kp5Var.h(4.89f, -4.89f);
        kp5Var.c(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
        kp5Var.a();
        c = aVar.c(kp5Var.d(), (r30 & 2) != 0 ? c49.b() : b, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : ox7Var, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c49.c() : a2, (r30 & 512) != 0 ? c49.d() : a3, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? 0.0f : 0.0f, (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ch3 f = c.f();
        a = f;
        zq3.e(f);
        return f;
    }
}
