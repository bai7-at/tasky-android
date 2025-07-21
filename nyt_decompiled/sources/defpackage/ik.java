package defpackage;

import android.content.Intent;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ik {
    public static final a d = new a(null);
    private static ik e;
    private int a;
    private final UUID b;
    private Intent c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean d(ik ikVar) {
            ik c;
            c = c();
            ik.b(ikVar);
            return c != null;
        }

        public final synchronized ik b(UUID uuid, int i) {
            zq3.h(uuid, "callId");
            ik c = c();
            if (c != null && zq3.c(c.c(), uuid) && c.d() == i) {
                d(null);
                return c;
            }
            return null;
        }

        public final ik c() {
            return ik.a();
        }

        private a() {
        }
    }

    public ik(int i, UUID uuid) {
        zq3.h(uuid, "callId");
        this.a = i;
        this.b = uuid;
    }

    public static final /* synthetic */ ik a() {
        if (c11.d(ik.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            c11.b(th, ik.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(ik ikVar) {
        if (c11.d(ik.class)) {
            return;
        }
        try {
            e = ikVar;
        } catch (Throwable th) {
            c11.b(th, ik.class);
        }
    }

    public final UUID c() {
        if (c11.d(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final int d() {
        if (c11.d(this)) {
            return 0;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            c11.b(th, this);
            return 0;
        }
    }

    public final Intent e() {
        if (c11.d(this)) {
            return null;
        }
        try {
            return this.c;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final boolean f() {
        if (c11.d(this)) {
            return false;
        }
        try {
            return d.d(this);
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    public final void g(Intent intent) {
        if (c11.d(this)) {
            return;
        }
        try {
            this.c = intent;
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ik(int r1, java.util.UUID r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r3 = "randomUUID()"
            defpackage.zq3.g(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.<init>(int, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
