package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dr8;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class qr8 extends dr8 {
    int n0;
    ArrayList l0 = new ArrayList();
    private boolean m0 = true;
    boolean o0 = false;
    private int p0 = 0;

    class a extends nr8 {
        final /* synthetic */ dr8 a;

        a(dr8 dr8Var) {
            this.a = dr8Var;
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
            this.a.Y();
            dr8Var.U(this);
        }
    }

    static class b extends nr8 {
        qr8 a;

        b(qr8 qr8Var) {
            this.a = qr8Var;
        }

        @Override // defpackage.nr8, dr8.f
        public void a(dr8 dr8Var) {
            qr8 qr8Var = this.a;
            if (qr8Var.o0) {
                return;
            }
            qr8Var.h0();
            this.a.o0 = true;
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
            qr8 qr8Var = this.a;
            int i = qr8Var.n0 - 1;
            qr8Var.n0 = i;
            if (i == 0) {
                qr8Var.o0 = false;
                qr8Var.p();
            }
            dr8Var.U(this);
        }
    }

    private void n0(dr8 dr8Var) {
        this.l0.add(dr8Var);
        dr8Var.u = this;
    }

    private void x0() {
        b bVar = new b(this);
        Iterator it2 = this.l0.iterator();
        while (it2.hasNext()) {
            ((dr8) it2.next()).a(bVar);
        }
        this.n0 = this.l0.size();
    }

    @Override // defpackage.dr8
    public void S(View view) {
        super.S(view);
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            ((dr8) this.l0.get(i)).S(view);
        }
    }

    @Override // defpackage.dr8
    public void W(View view) {
        super.W(view);
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            ((dr8) this.l0.get(i)).W(view);
        }
    }

    @Override // defpackage.dr8
    protected void Y() {
        if (this.l0.isEmpty()) {
            h0();
            p();
            return;
        }
        x0();
        if (this.m0) {
            Iterator it2 = this.l0.iterator();
            while (it2.hasNext()) {
                ((dr8) it2.next()).Y();
            }
            return;
        }
        for (int i = 1; i < this.l0.size(); i++) {
            ((dr8) this.l0.get(i - 1)).a(new a((dr8) this.l0.get(i)));
        }
        dr8 dr8Var = (dr8) this.l0.get(0);
        if (dr8Var != null) {
            dr8Var.Y();
        }
    }

    @Override // defpackage.dr8
    public void a0(dr8.e eVar) {
        super.a0(eVar);
        this.p0 |= 8;
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            ((dr8) this.l0.get(i)).a0(eVar);
        }
    }

    @Override // defpackage.dr8
    public void c0(tp5 tp5Var) {
        super.c0(tp5Var);
        this.p0 |= 4;
        if (this.l0 != null) {
            for (int i = 0; i < this.l0.size(); i++) {
                ((dr8) this.l0.get(i)).c0(tp5Var);
            }
        }
    }

    @Override // defpackage.dr8
    protected void cancel() {
        super.cancel();
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            ((dr8) this.l0.get(i)).cancel();
        }
    }

    @Override // defpackage.dr8
    public void d0(pr8 pr8Var) {
        super.d0(pr8Var);
        this.p0 |= 2;
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            ((dr8) this.l0.get(i)).d0(pr8Var);
        }
    }

    @Override // defpackage.dr8
    public void f(wr8 wr8Var) {
        if (I(wr8Var.b)) {
            Iterator it2 = this.l0.iterator();
            while (it2.hasNext()) {
                dr8 dr8Var = (dr8) it2.next();
                if (dr8Var.I(wr8Var.b)) {
                    dr8Var.f(wr8Var);
                    wr8Var.c.add(dr8Var);
                }
            }
        }
    }

    @Override // defpackage.dr8
    void h(wr8 wr8Var) {
        super.h(wr8Var);
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            ((dr8) this.l0.get(i)).h(wr8Var);
        }
    }

    @Override // defpackage.dr8
    public void i(wr8 wr8Var) {
        if (I(wr8Var.b)) {
            Iterator it2 = this.l0.iterator();
            while (it2.hasNext()) {
                dr8 dr8Var = (dr8) it2.next();
                if (dr8Var.I(wr8Var.b)) {
                    dr8Var.i(wr8Var);
                    wr8Var.c.add(dr8Var);
                }
            }
        }
    }

    @Override // defpackage.dr8
    String i0(String str) {
        String i0 = super.i0(str);
        for (int i = 0; i < this.l0.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i0);
            sb.append("\n");
            sb.append(((dr8) this.l0.get(i)).i0(str + "  "));
            i0 = sb.toString();
        }
        return i0;
    }

    @Override // defpackage.dr8
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public qr8 a(dr8.f fVar) {
        return (qr8) super.a(fVar);
    }

    @Override // defpackage.dr8
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public qr8 b(View view) {
        for (int i = 0; i < this.l0.size(); i++) {
            ((dr8) this.l0.get(i)).b(view);
        }
        return (qr8) super.b(view);
    }

    public qr8 l0(dr8 dr8Var) {
        n0(dr8Var);
        long j = this.c;
        if (j >= 0) {
            dr8Var.Z(j);
        }
        if ((this.p0 & 1) != 0) {
            dr8Var.b0(s());
        }
        if ((this.p0 & 2) != 0) {
            w();
            dr8Var.d0(null);
        }
        if ((this.p0 & 4) != 0) {
            dr8Var.c0(v());
        }
        if ((this.p0 & 8) != 0) {
            dr8Var.a0(r());
        }
        return this;
    }

    @Override // defpackage.dr8
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public dr8 clone() {
        qr8 qr8Var = (qr8) super.clone();
        qr8Var.l0 = new ArrayList();
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            qr8Var.n0(((dr8) this.l0.get(i)).clone());
        }
        return qr8Var;
    }

    @Override // defpackage.dr8
    void o(ViewGroup viewGroup, xr8 xr8Var, xr8 xr8Var2, ArrayList arrayList, ArrayList arrayList2) {
        long z = z();
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            dr8 dr8Var = (dr8) this.l0.get(i);
            if (z > 0 && (this.m0 || i == 0)) {
                long z2 = dr8Var.z();
                if (z2 > 0) {
                    dr8Var.g0(z2 + z);
                } else {
                    dr8Var.g0(z);
                }
            }
            dr8Var.o(viewGroup, xr8Var, xr8Var2, arrayList, arrayList2);
        }
    }

    public dr8 o0(int i) {
        if (i < 0 || i >= this.l0.size()) {
            return null;
        }
        return (dr8) this.l0.get(i);
    }

    public int p0() {
        return this.l0.size();
    }

    @Override // defpackage.dr8
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public qr8 U(dr8.f fVar) {
        return (qr8) super.U(fVar);
    }

    @Override // defpackage.dr8
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public qr8 V(View view) {
        for (int i = 0; i < this.l0.size(); i++) {
            ((dr8) this.l0.get(i)).V(view);
        }
        return (qr8) super.V(view);
    }

    @Override // defpackage.dr8
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public qr8 Z(long j) {
        ArrayList arrayList;
        super.Z(j);
        if (this.c >= 0 && (arrayList = this.l0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dr8) this.l0.get(i)).Z(j);
            }
        }
        return this;
    }

    @Override // defpackage.dr8
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public qr8 b0(TimeInterpolator timeInterpolator) {
        this.p0 |= 1;
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dr8) this.l0.get(i)).b0(timeInterpolator);
            }
        }
        return (qr8) super.b0(timeInterpolator);
    }

    public qr8 v0(int i) {
        if (i == 0) {
            this.m0 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.m0 = false;
        }
        return this;
    }

    @Override // defpackage.dr8
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public qr8 g0(long j) {
        return (qr8) super.g0(j);
    }
}
