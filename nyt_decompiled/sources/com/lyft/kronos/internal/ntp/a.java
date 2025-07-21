package com.lyft.kronos.internal.ntp;

import com.lyft.kronos.internal.ntp.SntpClient;
import defpackage.bx7;
import defpackage.ld8;
import defpackage.ww8;
import defpackage.xl0;
import defpackage.zq3;

/* loaded from: classes3.dex */
public final class a implements bx7 {
    private final ld8 a;
    private final xl0 b;

    public a(ld8 ld8Var, xl0 xl0Var) {
        zq3.h(ld8Var, "syncResponseCache");
        zq3.h(xl0Var, "deviceClock");
        this.a = ld8Var;
        this.b = xl0Var;
    }

    @Override // defpackage.bx7
    public void a(SntpClient.a aVar) {
        zq3.h(aVar, "response");
        synchronized (this) {
            this.a.e(aVar.b());
            this.a.a(aVar.c());
            this.a.b(aVar.d());
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // defpackage.bx7
    public void clear() {
        synchronized (this) {
            this.a.clear();
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // defpackage.bx7
    public SntpClient.a get() {
        long currentTime = this.a.getCurrentTime();
        long c = this.a.c();
        long d = this.a.d();
        if (c == 0) {
            return null;
        }
        return new SntpClient.a(currentTime, c, d, this.b);
    }
}
