package defpackage;

import com.skydoves.balloon.Balloon;

/* loaded from: classes4.dex */
public final class a00 implements Runnable {
    private final Balloon a;

    public a00(Balloon balloon) {
        zq3.h(balloon, "balloon");
        this.a = balloon;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.A();
    }
}
