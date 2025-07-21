package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class rz2 {
    private final kz2 a;
    private final Handler b;
    private final List c;
    final e d;
    private final w80 e;
    private boolean f;
    private boolean g;
    private boolean h;
    private d i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private xq8 n;
    private a o;
    private int p;
    private int q;
    private int r;

    static class a extends k51 {
        private final Handler d;
        final int e;
        private final long f;
        private Bitmap g;

        a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        @Override // defpackage.eg8
        public void g(Drawable drawable) {
            this.g = null;
        }

        Bitmap k() {
            return this.g;
        }

        @Override // defpackage.eg8
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void f(Bitmap bitmap, kr8 kr8Var) {
            this.g = bitmap;
            this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.f);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                rz2.this.m((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            rz2.this.d.n((a) message.obj);
            return false;
        }
    }

    rz2(com.bumptech.glide.a aVar, kz2 kz2Var, int i, int i2, xq8 xq8Var, Bitmap bitmap) {
        this(aVar.f(), com.bumptech.glide.a.t(aVar.h()), kz2Var, null, i(com.bumptech.glide.a.t(aVar.h()), i, i2), xq8Var, bitmap);
    }

    private static ov3 g() {
        return new ac5(Double.valueOf(Math.random()));
    }

    private static d i(e eVar, int i, int i2) {
        return eVar.l().a(((py6) ((py6) py6.c0(tr1.b).a0(true)).V(true)).M(i, i2));
    }

    private void l() {
        if (!this.f || this.g) {
            return;
        }
        if (this.h) {
            z06.a(this.o == null, "Pending target must be null when starting from the first frame");
            this.a.f();
            this.h = false;
        }
        a aVar = this.o;
        if (aVar != null) {
            this.o = null;
            m(aVar);
            return;
        }
        this.g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.a.e();
        this.a.b();
        this.l = new a(this.b, this.a.g(), uptimeMillis);
        this.i.a(py6.d0(g())).q0(this.a).l0(this.l);
    }

    private void n() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.b(bitmap);
            this.m = null;
        }
    }

    private void p() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        l();
    }

    private void q() {
        this.f = false;
    }

    void a() {
        this.c.clear();
        n();
        q();
        a aVar = this.j;
        if (aVar != null) {
            this.d.n(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.n(aVar2);
            this.l = null;
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            this.d.n(aVar3);
            this.o = null;
        }
        this.a.clear();
        this.k = true;
    }

    ByteBuffer b() {
        return this.a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.k() : this.m;
    }

    int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.e;
        }
        return -1;
    }

    Bitmap e() {
        return this.m;
    }

    int f() {
        return this.a.c();
    }

    int h() {
        return this.r;
    }

    int j() {
        return this.a.h() + this.p;
    }

    int k() {
        return this.q;
    }

    void m(a aVar) {
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.o = aVar;
            return;
        }
        if (aVar.k() != null) {
            n();
            a aVar2 = this.j;
            this.j = aVar;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                ((b) this.c.get(size)).a();
            }
            if (aVar2 != null) {
                this.b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(xq8 xq8Var, Bitmap bitmap) {
        this.n = (xq8) z06.d(xq8Var);
        this.m = (Bitmap) z06.d(bitmap);
        this.i = this.i.a(new py6().W(xq8Var));
        this.p = x19.g(bitmap);
        this.q = bitmap.getWidth();
        this.r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.c.isEmpty();
        this.c.add(bVar);
        if (isEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            q();
        }
    }

    rz2(w80 w80Var, e eVar, kz2 kz2Var, Handler handler, d dVar, xq8 xq8Var, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = eVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = w80Var;
        this.b = handler;
        this.i = dVar;
        this.a = kz2Var;
        o(xq8Var, bitmap);
    }
}
