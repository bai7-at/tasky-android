package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.t0;
import defpackage.ep2;
import defpackage.ps4;
import defpackage.qs4;
import defpackage.ts4;
import defpackage.ur;
import defpackage.xs4;
import defpackage.z19;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends f implements Handler.Callback {
    private boolean B;
    private boolean H;
    private long L;
    private Metadata M;
    private long N;
    private final qs4 s;
    private final xs4 t;
    private final Handler u;
    private final ts4 w;
    private final boolean x;
    private ps4 y;

    public a(xs4 xs4Var, Looper looper) {
        this(xs4Var, looper, qs4.a);
    }

    private void d0(Metadata metadata, List list) {
        for (int i = 0; i < metadata.e(); i++) {
            t0 j = metadata.d(i).j();
            if (j == null || !this.s.b(j)) {
                list.add(metadata.d(i));
            } else {
                ps4 c = this.s.c(j);
                byte[] bArr = (byte[]) ur.e(metadata.d(i).m0());
                this.w.f();
                this.w.t(bArr.length);
                ((ByteBuffer) z19.j(this.w.c)).put(bArr);
                this.w.u();
                Metadata a = c.a(this.w);
                if (a != null) {
                    d0(a, list);
                }
            }
        }
    }

    private long e0(long j) {
        ur.g(j != -9223372036854775807L);
        ur.g(this.N != -9223372036854775807L);
        return j - this.N;
    }

    private void f0(Metadata metadata) {
        Handler handler = this.u;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            g0(metadata);
        }
    }

    private void g0(Metadata metadata) {
        this.t.h(metadata);
    }

    private boolean h0(long j) {
        boolean z;
        Metadata metadata = this.M;
        if (metadata == null || (!this.x && metadata.presentationTimeUs > e0(j))) {
            z = false;
        } else {
            f0(this.M);
            this.M = null;
            z = true;
        }
        if (this.B && this.M == null) {
            this.H = true;
        }
        return z;
    }

    private void i0() {
        if (this.B || this.M != null) {
            return;
        }
        this.w.f();
        ep2 M = M();
        int a0 = a0(M, this.w, 0);
        if (a0 != -4) {
            if (a0 == -5) {
                this.L = ((t0) ur.e(M.b)).s;
            }
        } else {
            if (this.w.l()) {
                this.B = true;
                return;
            }
            ts4 ts4Var = this.w;
            ts4Var.i = this.L;
            ts4Var.u();
            Metadata a = ((ps4) z19.j(this.y)).a(this.w);
            if (a != null) {
                ArrayList arrayList = new ArrayList(a.e());
                d0(a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.M = new Metadata(e0(this.w.e), arrayList);
            }
        }
    }

    @Override // com.google.android.exoplayer2.z1
    public void D(long j, long j2) {
        boolean z = true;
        while (z) {
            i0();
            z = h0(j);
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void R() {
        this.M = null;
        this.y = null;
        this.N = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.f
    protected void T(long j, boolean z) {
        this.M = null;
        this.B = false;
        this.H = false;
    }

    @Override // com.google.android.exoplayer2.f
    protected void Z(t0[] t0VarArr, long j, long j2) {
        this.y = this.s.c(t0VarArr[0]);
        Metadata metadata = this.M;
        if (metadata != null) {
            this.M = metadata.c((metadata.presentationTimeUs + this.N) - j2);
        }
        this.N = j2;
    }

    @Override // com.google.android.exoplayer2.a2
    public int b(t0 t0Var) {
        if (this.s.b(t0Var)) {
            return a2.r(t0Var.f0 == 0 ? 4 : 2);
        }
        return a2.r(0);
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean d() {
        return this.H;
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        g0((Metadata) message.obj);
        return true;
    }

    public a(xs4 xs4Var, Looper looper, qs4 qs4Var) {
        this(xs4Var, looper, qs4Var, false);
    }

    public a(xs4 xs4Var, Looper looper, qs4 qs4Var, boolean z) {
        super(5);
        this.t = (xs4) ur.e(xs4Var);
        this.u = looper == null ? null : z19.v(looper, this);
        this.s = (qs4) ur.e(qs4Var);
        this.x = z;
        this.w = new ts4();
        this.N = -9223372036854775807L;
    }
}
