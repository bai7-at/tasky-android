package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ch3;
import defpackage.oe3;

/* loaded from: classes.dex */
public abstract class l8 {
    private static ch3 a;

    public static final ch3 a(oe3.a aVar) {
        ch3.a c;
        ch3 ch3Var = a;
        if (ch3Var != null) {
            zq3.e(ch3Var);
            return ch3Var;
        }
        ch3.a aVar2 = new ch3.a("Filled.Adb", bu1.g(24.0f), bu1.g(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int b = c49.b();
        ox7 ox7Var = new ox7(nn0.b.a(), null);
        int a2 = v48.a.a();
        int a3 = x48.a.a();
        kp5 kp5Var = new kp5();
        kp5Var.i(5.0f, 16.0f);
        kp5Var.c(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        kp5Var.k(7.0f, -3.13f, 7.0f, -7.0f);
        kp5Var.m(-4.0f);
        kp5Var.g(5.0f, 12.0f);
        kp5Var.m(4.0f);
        kp5Var.a();
        kp5Var.i(16.12f, 4.37f);
        kp5Var.h(2.1f, -2.1f);
        kp5Var.h(-0.82f, -0.83f);
        kp5Var.h(-2.3f, 2.31f);
        kp5Var.b(14.16f, 3.28f, 13.12f, 3.0f, 12.0f, 3.0f);
        kp5Var.k(-2.16f, 0.28f, -3.09f, 0.75f);
        kp5Var.g(6.6f, 1.44f);
        kp5Var.h(-0.82f, 0.83f);
        kp5Var.h(2.1f, 2.1f);
        kp5Var.b(6.14f, 5.64f, 5.0f, 7.68f, 5.0f, 10.0f);
        kp5Var.m(1.0f);
        kp5Var.f(14.0f);
        kp5Var.m(-1.0f);
        kp5Var.c(0.0f, -2.32f, -1.14f, -4.36f, -2.88f, -5.63f);
        kp5Var.a();
        kp5Var.i(9.0f, 9.0f);
        kp5Var.c(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kp5Var.k(0.45f, -1.0f, 1.0f, -1.0f);
        kp5Var.k(1.0f, 0.45f, 1.0f, 1.0f);
        kp5Var.k(-0.45f, 1.0f, -1.0f, 1.0f);
        kp5Var.a();
        kp5Var.i(15.0f, 9.0f);
        kp5Var.c(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kp5Var.k(0.45f, -1.0f, 1.0f, -1.0f);
        kp5Var.k(1.0f, 0.45f, 1.0f, 1.0f);
        kp5Var.k(-0.45f, 1.0f, -1.0f, 1.0f);
        kp5Var.a();
        c = aVar2.c(kp5Var.d(), (r30 & 2) != 0 ? c49.b() : b, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : ox7Var, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c49.c() : a2, (r30 & 512) != 0 ? c49.d() : a3, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? 0.0f : 0.0f, (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ch3 f = c.f();
        a = f;
        zq3.e(f);
        return f;
    }
}
