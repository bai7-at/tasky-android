package defpackage;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public abstract class su5 implements ru5 {
    private final Magnifier a;

    public su5(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.ru5
    public long a() {
        return in3.a(this.a.getWidth(), this.a.getHeight());
    }

    @Override // defpackage.ru5
    public void c() {
        this.a.update();
    }

    public final Magnifier d() {
        return this.a;
    }

    @Override // defpackage.ru5
    public void dismiss() {
        this.a.dismiss();
    }
}
