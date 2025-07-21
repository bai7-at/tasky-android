package defpackage;

import androidx.compose.runtime.b;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class gd5 implements ln {
    private final ln a;
    private final int b;
    private int c;

    public gd5(ln lnVar, int i) {
        this.a = lnVar;
        this.b = i;
    }

    @Override // defpackage.ln
    public void a(int i, int i2) {
        this.a.a(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.ln
    public Object b() {
        return this.a.b();
    }

    @Override // defpackage.ln
    public void c(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.c(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.ln
    public void clear() {
        b.t("Clear is not valid on OffsetApplier");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.ln
    public void d(int i, Object obj) {
        this.a.d(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.ln
    public void f(int i, Object obj) {
        this.a.f(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.ln
    public void g(Object obj) {
        this.c++;
        this.a.g(obj);
    }

    @Override // defpackage.ln
    public void i() {
        int i = this.c;
        if (!(i > 0)) {
            b.t("OffsetApplier up called with no corresponding down");
            throw new KotlinNothingValueException();
        }
        this.c = i - 1;
        this.a.i();
    }
}
