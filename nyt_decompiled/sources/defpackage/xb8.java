package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.primitives.Ints;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class xb8 implements y72 {
    private final vb8 a;
    private final t0 d;
    private a82 g;
    private yp8 h;
    private int i;
    private final a41 b = new a41();
    private final yo5 c = new yo5();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private int j = 0;
    private long k = -9223372036854775807L;

    public xb8(vb8 vb8Var, t0 t0Var) {
        this.a = vb8Var;
        this.d = t0Var.c().g0("text/x-exoplayer-cues").K(t0Var.l).G();
    }

    private void b() {
        try {
            yb8 yb8Var = (yb8) this.a.d();
            while (yb8Var == null) {
                Thread.sleep(5L);
                yb8Var = (yb8) this.a.d();
            }
            yb8Var.t(this.i);
            yb8Var.c.put(this.c.e(), 0, this.i);
            yb8Var.c.limit(this.i);
            this.a.c(yb8Var);
            zb8 zb8Var = (zb8) this.a.b();
            while (zb8Var == null) {
                Thread.sleep(5L);
                zb8Var = (zb8) this.a.b();
            }
            for (int i = 0; i < zb8Var.d(); i++) {
                byte[] a = this.b.a(zb8Var.b(zb8Var.c(i)));
                this.e.add(Long.valueOf(zb8Var.c(i)));
                this.f.add(new yo5(a));
            }
            zb8Var.s();
        } catch (SubtitleDecoderException e) {
            throw ParserException.a("SubtitleDecoder failed.", e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    private boolean f(z72 z72Var) {
        int b = this.c.b();
        int i = this.i;
        if (b == i) {
            this.c.c(i + 1024);
        }
        int read = z72Var.read(this.c.e(), this.i, this.c.b() - this.i);
        if (read != -1) {
            this.i += read;
        }
        long length = z72Var.getLength();
        return (length != -1 && ((long) this.i) == length) || read == -1;
    }

    private boolean g(z72 z72Var) {
        return z72Var.a((z72Var.getLength() > (-1L) ? 1 : (z72Var.getLength() == (-1L) ? 0 : -1)) != 0 ? Ints.d(z72Var.getLength()) : 1024) == -1;
    }

    private void h() {
        ur.i(this.h);
        ur.g(this.e.size() == this.f.size());
        long j = this.k;
        for (int g = j == -9223372036854775807L ? 0 : z19.g(this.e, Long.valueOf(j), true, true); g < this.f.size(); g++) {
            yo5 yo5Var = (yo5) this.f.get(g);
            yo5Var.U(0);
            int length = yo5Var.e().length;
            this.h.a(yo5Var, length);
            this.h.b(((Long) this.e.get(g)).longValue(), 1, length, 0, null);
        }
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        int i = this.j;
        ur.g((i == 0 || i == 5) ? false : true);
        this.k = j2;
        if (this.j == 2) {
            this.j = 1;
        }
        if (this.j == 4) {
            this.j = 3;
        }
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        ur.g(this.j == 0);
        this.g = a82Var;
        this.h = a82Var.a(0, 3);
        this.g.s();
        this.g.p(new zi3(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.h.d(this.d);
        this.j = 1;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        int i = this.j;
        ur.g((i == 0 || i == 5) ? false : true);
        if (this.j == 1) {
            this.c.Q(z72Var.getLength() != -1 ? Ints.d(z72Var.getLength()) : 1024);
            this.i = 0;
            this.j = 2;
        }
        if (this.j == 2 && f(z72Var)) {
            b();
            h();
            this.j = 4;
        }
        if (this.j == 3 && g(z72Var)) {
            h();
            this.j = 4;
        }
        return this.j == 4 ? -1 : 0;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        return true;
    }

    @Override // defpackage.y72
    public void release() {
        if (this.j == 5) {
            return;
        }
        this.a.release();
        this.j = 5;
    }
}
