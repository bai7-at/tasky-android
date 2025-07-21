package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ei7;
import defpackage.st8;

/* loaded from: classes2.dex */
public final class v76 implements y72 {
    public static final d82 l = new d82() { // from class: u76
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] f;
            f = v76.f();
            return f;
        }
    };
    private final qm8 a;
    private final SparseArray b;
    private final yo5 c;
    private final t76 d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private s76 i;
    private a82 j;
    private boolean k;

    private static final class a {
        private final uy1 a;
        private final qm8 b;
        private final xo5 c = new xo5(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(uy1 uy1Var, qm8 qm8Var) {
            this.a = uy1Var;
            this.b = qm8Var;
        }

        private void b() {
            this.c.r(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.r(6);
            this.g = this.c.h(8);
        }

        private void c() {
            this.h = 0L;
            if (this.d) {
                this.c.r(4);
                this.c.r(1);
                this.c.r(1);
                long h = (this.c.h(3) << 30) | (this.c.h(15) << 15) | this.c.h(15);
                this.c.r(1);
                if (!this.f && this.e) {
                    this.c.r(4);
                    this.c.r(1);
                    this.c.r(1);
                    this.c.r(1);
                    this.b.b((this.c.h(3) << 30) | (this.c.h(15) << 15) | this.c.h(15));
                    this.f = true;
                }
                this.h = this.b.b(h);
            }
        }

        public void a(yo5 yo5Var) {
            yo5Var.l(this.c.a, 0, 3);
            this.c.p(0);
            b();
            yo5Var.l(this.c.a, 0, this.g);
            this.c.p(0);
            c();
            this.a.f(this.h, 4);
            this.a.a(yo5Var);
            this.a.e();
        }

        public void d() {
            this.f = false;
            this.a.c();
        }
    }

    public v76() {
        this(new qm8(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] f() {
        return new y72[]{new v76()};
    }

    private void g(long j) {
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.d.c() == -9223372036854775807L) {
            this.j.p(new ei7.b(this.d.c()));
            return;
        }
        s76 s76Var = new s76(this.d.d(), this.d.c(), j);
        this.i = s76Var;
        this.j.p(s76Var.b());
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        boolean z = this.a.e() == -9223372036854775807L;
        if (!z) {
            long c = this.a.c();
            z = (c == -9223372036854775807L || c == 0 || c == j2) ? false : true;
        }
        if (z) {
            this.a.h(j2);
        }
        s76 s76Var = this.i;
        if (s76Var != null) {
            s76Var.h(j2);
        }
        for (int i = 0; i < this.b.size(); i++) {
            ((a) this.b.valueAt(i)).d();
        }
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.j = a82Var;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        uy1 uy1Var;
        ur.i(this.j);
        long length = z72Var.getLength();
        if (length != -1 && !this.d.e()) {
            return this.d.g(z72Var, e06Var);
        }
        g(length);
        s76 s76Var = this.i;
        if (s76Var != null && s76Var.d()) {
            return this.i.c(z72Var, e06Var);
        }
        z72Var.g();
        long l2 = length != -1 ? length - z72Var.l() : -1L;
        if ((l2 != -1 && l2 < 4) || !z72Var.e(this.c.e(), 0, 4, true)) {
            return -1;
        }
        this.c.U(0);
        int q = this.c.q();
        if (q == 441) {
            return -1;
        }
        if (q == 442) {
            z72Var.r(this.c.e(), 0, 10);
            this.c.U(9);
            z72Var.p((this.c.H() & 7) + 14);
            return 0;
        }
        if (q == 443) {
            z72Var.r(this.c.e(), 0, 2);
            this.c.U(0);
            z72Var.p(this.c.N() + 6);
            return 0;
        }
        if (((q & (-256)) >> 8) != 1) {
            z72Var.p(1);
            return 0;
        }
        int i = q & 255;
        a aVar = (a) this.b.get(i);
        if (!this.e) {
            if (aVar == null) {
                if (i == 189) {
                    uy1Var = new h2();
                    this.f = true;
                    this.h = z72Var.getPosition();
                } else if ((q & 224) == 192) {
                    uy1Var = new uw4();
                    this.f = true;
                    this.h = z72Var.getPosition();
                } else if ((q & 240) == 224) {
                    uy1Var = new j63();
                    this.g = true;
                    this.h = z72Var.getPosition();
                } else {
                    uy1Var = null;
                }
                if (uy1Var != null) {
                    uy1Var.d(this.j, new st8.d(i, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH));
                    aVar = new a(uy1Var, this.a);
                    this.b.put(i, aVar);
                }
            }
            if (z72Var.getPosition() > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = true;
                this.j.s();
            }
        }
        z72Var.r(this.c.e(), 0, 2);
        this.c.U(0);
        int N = this.c.N() + 6;
        if (aVar == null) {
            z72Var.p(N);
        } else {
            this.c.Q(N);
            z72Var.readFully(this.c.e(), 0, N);
            this.c.U(6);
            aVar.a(this.c);
            yo5 yo5Var = this.c;
            yo5Var.T(yo5Var.b());
        }
        return 0;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        byte[] bArr = new byte[14];
        z72Var.r(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        z72Var.n(bArr[13] & 7);
        z72Var.r(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // defpackage.y72
    public void release() {
    }

    public v76(qm8 qm8Var) {
        this.a = qm8Var;
        this.c = new yo5(ProgressEvent.PART_FAILED_EVENT_CODE);
        this.b = new SparseArray();
        this.d = new t76();
    }
}
