package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import defpackage.p50;

/* loaded from: classes.dex */
public class kw1 implements p50.b {
    private final p50.b a;
    private final p50 b;
    private final p50 c;
    private final p50 d;
    private final p50 e;
    private final p50 f;
    private boolean g = true;

    class a extends cd4 {
        final /* synthetic */ cd4 d;

        a(cd4 cd4Var) {
            this.d = cd4Var;
        }

        @Override // defpackage.cd4
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(qc4 qc4Var) {
            Float f = (Float) this.d.a(qc4Var);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public kw1(p50.b bVar, com.airbnb.lottie.model.layer.a aVar, iw1 iw1Var) {
        this.a = bVar;
        p50 a2 = iw1Var.a().a();
        this.b = a2;
        a2.a(this);
        aVar.i(a2);
        p50 a3 = iw1Var.d().a();
        this.c = a3;
        a3.a(this);
        aVar.i(a3);
        p50 a4 = iw1Var.b().a();
        this.d = a4;
        a4.a(this);
        aVar.i(a4);
        p50 a5 = iw1Var.c().a();
        this.e = a5;
        a5.a(this);
        aVar.i(a5);
        p50 a6 = iw1Var.e().a();
        this.f = a6;
        a6.a(this);
        aVar.i(a6);
    }

    @Override // p50.b
    public void a() {
        this.g = true;
        this.a.a();
    }

    public void b(Paint paint) {
        if (this.g) {
            this.g = false;
            double floatValue = ((Float) this.d.h()).floatValue() * 0.017453292519943295d;
            float floatValue2 = ((Float) this.e.h()).floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = ((Integer) this.b.h()).intValue();
            paint.setShadowLayer(((Float) this.f.h()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.c.h()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void c(cd4 cd4Var) {
        this.b.o(cd4Var);
    }

    public void d(cd4 cd4Var) {
        this.d.o(cd4Var);
    }

    public void e(cd4 cd4Var) {
        this.e.o(cd4Var);
    }

    public void f(cd4 cd4Var) {
        if (cd4Var == null) {
            this.c.o(null);
        } else {
            this.c.o(new a(cd4Var));
        }
    }

    public void g(cd4 cd4Var) {
        this.f.o(cd4Var);
    }
}
