package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ch3;
import defpackage.oe3;

/* loaded from: classes.dex */
public abstract class kn7 {
    private static ch3 a;

    public static final ch3 a(oe3.a aVar) {
        ch3.a c;
        ch3 ch3Var = a;
        if (ch3Var != null) {
            zq3.e(ch3Var);
            return ch3Var;
        }
        ch3.a aVar2 = new ch3.a("Filled.Settings", bu1.g(24.0f), bu1.g(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int b = c49.b();
        ox7 ox7Var = new ox7(nn0.b.a(), null);
        int a2 = v48.a.a();
        int a3 = x48.a.a();
        kp5 kp5Var = new kp5();
        kp5Var.i(19.14f, 12.94f);
        kp5Var.c(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        kp5Var.c(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        kp5Var.h(2.03f, -1.58f);
        kp5Var.c(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        kp5Var.h(-1.92f, -3.32f);
        kp5Var.c(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        kp5Var.h(-2.39f, 0.96f);
        kp5Var.c(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        kp5Var.g(14.4f, 2.81f);
        kp5Var.c(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        kp5Var.f(-3.84f);
        kp5Var.c(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        kp5Var.g(9.25f, 5.35f);
        kp5Var.b(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        kp5Var.g(5.24f, 5.33f);
        kp5Var.c(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        kp5Var.g(2.74f, 8.87f);
        kp5Var.b(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        kp5Var.h(2.03f, 1.58f);
        kp5Var.b(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        kp5Var.k(0.02f, 0.64f, 0.07f, 0.94f);
        kp5Var.h(-2.03f, 1.58f);
        kp5Var.c(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        kp5Var.h(1.92f, 3.32f);
        kp5Var.c(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        kp5Var.h(2.39f, -0.96f);
        kp5Var.c(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        kp5Var.h(0.36f, 2.54f);
        kp5Var.c(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        kp5Var.f(3.84f);
        kp5Var.c(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        kp5Var.h(0.36f, -2.54f);
        kp5Var.c(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        kp5Var.h(2.39f, 0.96f);
        kp5Var.c(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        kp5Var.h(1.92f, -3.32f);
        kp5Var.c(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        kp5Var.g(19.14f, 12.94f);
        kp5Var.a();
        kp5Var.i(12.0f, 15.6f);
        kp5Var.c(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        kp5Var.k(1.62f, -3.6f, 3.6f, -3.6f);
        kp5Var.k(3.6f, 1.62f, 3.6f, 3.6f);
        kp5Var.j(13.98f, 15.6f, 12.0f, 15.6f);
        kp5Var.a();
        c = aVar2.c(kp5Var.d(), (r30 & 2) != 0 ? c49.b() : b, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : ox7Var, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c49.c() : a2, (r30 & 512) != 0 ? c49.d() : a3, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? 0.0f : 0.0f, (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ch3 f = c.f();
        a = f;
        zq3.e(f);
        return f;
    }
}
