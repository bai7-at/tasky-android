package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class kq8 {
    private final Context a;
    private final dv0 b;
    private final a70 c;
    private final dv0 d;
    private final dv0 e;

    public kq8(Context context, rg8 rg8Var, dv0 dv0Var, a70 a70Var, dv0 dv0Var2, dv0 dv0Var3) {
        zq3.h(context, "context");
        zq3.h(rg8Var, "taskExecutor");
        zq3.h(dv0Var, "batteryChargingTracker");
        zq3.h(a70Var, "batteryNotLowTracker");
        zq3.h(dv0Var2, "networkStateTracker");
        zq3.h(dv0Var3, "storageNotLowTracker");
        this.a = context;
        this.b = dv0Var;
        this.c = a70Var;
        this.d = dv0Var2;
        this.e = dv0Var3;
    }

    public final dv0 a() {
        return this.b;
    }

    public final a70 b() {
        return this.c;
    }

    public final Context c() {
        return this.a;
    }

    public final dv0 d() {
        return this.d;
    }

    public final dv0 e() {
        return this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ kq8(android.content.Context r8, defpackage.rg8 r9, defpackage.dv0 r10, defpackage.a70 r11, defpackage.dv0 r12, defpackage.dv0 r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            x60 r0 = new x60
            android.content.Context r3 = r8.getApplicationContext()
            defpackage.zq3.g(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            a70 r0 = new a70
            android.content.Context r4 = r8.getApplicationContext()
            defpackage.zq3.g(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            defpackage.zq3.g(r0, r1)
            dv0 r0 = defpackage.a55.a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4c
            j28 r0 = new j28
            android.content.Context r6 = r8.getApplicationContext()
            defpackage.zq3.g(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L4d
        L4c:
            r6 = r13
        L4d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq8.<init>(android.content.Context, rg8, dv0, a70, dv0, dv0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
