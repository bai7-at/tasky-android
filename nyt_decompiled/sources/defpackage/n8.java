package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ch3;
import defpackage.oe3;

/* loaded from: classes.dex */
public abstract class n8 {
    private static ch3 a;

    public static final ch3 a(oe3.a aVar) {
        ch3.a c;
        ch3 ch3Var = a;
        if (ch3Var != null) {
            zq3.e(ch3Var);
            return ch3Var;
        }
        ch3.a aVar2 = new ch3.a("Filled.AddComment", bu1.g(24.0f), bu1.g(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int b = c49.b();
        ox7 ox7Var = new ox7(nn0.b.a(), null);
        int a2 = v48.a.a();
        int a3 = x48.a.a();
        kp5 kp5Var = new kp5();
        kp5Var.i(21.99f, 4.0f);
        kp5Var.c(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        kp5Var.e(4.0f);
        kp5Var.c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        kp5Var.m(12.0f);
        kp5Var.c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kp5Var.f(14.0f);
        kp5Var.h(4.0f, 4.0f);
        kp5Var.h(-0.01f, -18.0f);
        kp5Var.a();
        kp5Var.i(17.0f, 11.0f);
        kp5Var.f(-4.0f);
        kp5Var.m(4.0f);
        kp5Var.f(-2.0f);
        kp5Var.m(-4.0f);
        kp5Var.e(7.0f);
        kp5Var.l(9.0f);
        kp5Var.f(4.0f);
        kp5Var.l(5.0f);
        kp5Var.f(2.0f);
        kp5Var.m(4.0f);
        kp5Var.f(4.0f);
        kp5Var.m(2.0f);
        kp5Var.a();
        c = aVar2.c(kp5Var.d(), (r30 & 2) != 0 ? c49.b() : b, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : ox7Var, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c49.c() : a2, (r30 & 512) != 0 ? c49.d() : a3, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? 0.0f : 0.0f, (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ch3 f = c.f();
        a = f;
        zq3.e(f);
        return f;
    }
}
