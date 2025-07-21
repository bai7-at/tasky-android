package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.hls.b;
import com.google.android.exoplayer2.source.hls.i;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.j;
import com.google.common.primitives.Ints;
import defpackage.a82;
import defpackage.a84;
import defpackage.ei7;
import defpackage.ep2;
import defpackage.fi7;
import defpackage.gq8;
import defpackage.i42;
import defpackage.ku4;
import defpackage.ob;
import defpackage.ok0;
import defpackage.pi4;
import defpackage.rw1;
import defpackage.s91;
import defpackage.up8;
import defpackage.ur;
import defpackage.v64;
import defpackage.wp8;
import defpackage.y77;
import defpackage.yo5;
import defpackage.yp8;
import defpackage.z19;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i implements Loader.b, Loader.f, c0, a82, b0.d {
    private static final Set x0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private d[] B;
    private Set L;
    private SparseIntArray M;
    private yp8 N;
    private int Q;
    private int S;
    private boolean X;
    private boolean Y;
    private int Z;
    private final String a;
    private final int b;
    private final b c;
    private final com.google.android.exoplayer2.source.hls.b d;
    private final ob e;
    private t0 e0;
    private final t0 f;
    private t0 f0;
    private final com.google.android.exoplayer2.drm.i g;
    private boolean g0;
    private final h.a h;
    private wp8 h0;
    private final com.google.android.exoplayer2.upstream.h i;
    private Set i0;
    private int[] j0;
    private final p.a k;
    private int k0;
    private final int l;
    private boolean l0;
    private boolean[] m0;
    private final ArrayList n;
    private boolean[] n0;
    private long o0;
    private long p0;
    private boolean q0;
    private final List r;
    private boolean r0;
    private final Runnable s;
    private boolean s0;
    private final Runnable t;
    private boolean t0;
    private final Handler u;
    private long u0;
    private DrmInitData v0;
    private final ArrayList w;
    private com.google.android.exoplayer2.source.hls.d w0;
    private final Map x;
    private ok0 y;
    private final Loader j = new Loader("Loader:HlsSampleStreamWrapper");
    private final b.C0186b m = new b.C0186b();
    private int[] H = new int[0];

    public interface b extends c0.a {
        void e();

        void k(Uri uri);
    }

    private static class c implements yp8 {
        private static final t0 g = new t0.b().g0("application/id3").G();
        private static final t0 h = new t0.b().g0("application/x-emsg").G();
        private final i42 a = new i42();
        private final yp8 b;
        private final t0 c;
        private t0 d;
        private byte[] e;
        private int f;

        public c(yp8 yp8Var, int i) {
            this.b = yp8Var;
            if (i == 1) {
                this.c = g;
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i);
                }
                this.c = h;
            }
            this.e = new byte[0];
            this.f = 0;
        }

        private boolean g(EventMessage eventMessage) {
            t0 j = eventMessage.j();
            return j != null && z19.c(this.c.l, j.l);
        }

        private void h(int i) {
            byte[] bArr = this.e;
            if (bArr.length < i) {
                this.e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        private yo5 i(int i, int i2) {
            int i3 = this.f - i2;
            yo5 yo5Var = new yo5(Arrays.copyOfRange(this.e, i3 - i, i3));
            byte[] bArr = this.e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f = i2;
            return yo5Var;
        }

        @Override // defpackage.yp8
        public void b(long j, int i, int i2, int i3, yp8.a aVar) {
            ur.e(this.d);
            yo5 i4 = i(i2, i3);
            if (!z19.c(this.d.l, this.c.l)) {
                if (!"application/x-emsg".equals(this.d.l)) {
                    a84.j("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.d.l);
                    return;
                }
                EventMessage c = this.a.c(i4);
                if (!g(c)) {
                    a84.j("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.l, c.j()));
                    return;
                }
                i4 = new yo5((byte[]) ur.e(c.m0()));
            }
            int a = i4.a();
            this.b.a(i4, a);
            this.b.b(j, i, a, i3, aVar);
        }

        @Override // defpackage.yp8
        public void c(yo5 yo5Var, int i, int i2) {
            h(this.f + i);
            yo5Var.l(this.e, this.f, i);
            this.f += i;
        }

        @Override // defpackage.yp8
        public void d(t0 t0Var) {
            this.d = t0Var;
            this.b.d(this.c);
        }

        @Override // defpackage.yp8
        public int f(s91 s91Var, int i, boolean z, int i2) {
            h(this.f + i);
            int read = s91Var.read(this.e, this.f, i);
            if (read != -1) {
                this.f += read;
                return read;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
    }

    private static final class d extends b0 {
        private final Map H;
        private DrmInitData I;

        private Metadata h0(Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int e = metadata.e();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= e) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry d = metadata.d(i2);
                if ((d instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) d).owner)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (e == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[e - 1];
            while (i < e) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.d(i);
                }
                i++;
            }
            return new Metadata(entryArr);
        }

        @Override // com.google.android.exoplayer2.source.b0, defpackage.yp8
        public void b(long j, int i, int i2, int i3, yp8.a aVar) {
            super.b(j, i, i2, i3, aVar);
        }

        public void i0(DrmInitData drmInitData) {
            this.I = drmInitData;
            I();
        }

        public void j0(com.google.android.exoplayer2.source.hls.d dVar) {
            f0(dVar.k);
        }

        @Override // com.google.android.exoplayer2.source.b0
        public t0 w(t0 t0Var) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.I;
            if (drmInitData2 == null) {
                drmInitData2 = t0Var.r;
            }
            if (drmInitData2 != null && (drmInitData = (DrmInitData) this.H.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata h0 = h0(t0Var.j);
            if (drmInitData2 != t0Var.r || h0 != t0Var.j) {
                t0Var = t0Var.c().O(drmInitData2).Z(h0).G();
            }
            return super.w(t0Var);
        }

        private d(ob obVar, com.google.android.exoplayer2.drm.i iVar, h.a aVar, Map map) {
            super(obVar, iVar, aVar);
            this.H = map;
        }
    }

    public i(String str, int i, b bVar, com.google.android.exoplayer2.source.hls.b bVar2, Map map, ob obVar, long j, t0 t0Var, com.google.android.exoplayer2.drm.i iVar, h.a aVar, com.google.android.exoplayer2.upstream.h hVar, p.a aVar2, int i2) {
        this.a = str;
        this.b = i;
        this.c = bVar;
        this.d = bVar2;
        this.x = map;
        this.e = obVar;
        this.f = t0Var;
        this.g = iVar;
        this.h = aVar;
        this.i = hVar;
        this.k = aVar2;
        this.l = i2;
        Set set = x0;
        this.L = new HashSet(set.size());
        this.M = new SparseIntArray(set.size());
        this.B = new d[0];
        this.n0 = new boolean[0];
        this.m0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.r = Collections.unmodifiableList(arrayList);
        this.w = new ArrayList();
        this.s = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.g
            @Override // java.lang.Runnable
            public final void run() {
                i.this.T();
            }
        };
        this.t = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.c0();
            }
        };
        this.u = z19.w();
        this.o0 = j;
        this.p0 = j;
    }

    private boolean A(int i) {
        for (int i2 = i; i2 < this.n.size(); i2++) {
            if (((com.google.android.exoplayer2.source.hls.d) this.n.get(i2)).n) {
                return false;
            }
        }
        com.google.android.exoplayer2.source.hls.d dVar = (com.google.android.exoplayer2.source.hls.d) this.n.get(i);
        for (int i3 = 0; i3 < this.B.length; i3++) {
            if (this.B[i3].C() > dVar.m(i3)) {
                return false;
            }
        }
        return true;
    }

    private static rw1 C(int i, int i2) {
        a84.j("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new rw1();
    }

    private b0 D(int i, int i2) {
        int length = this.B.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        d dVar = new d(this.e, this.g, this.h, this.x);
        dVar.b0(this.o0);
        if (z) {
            dVar.i0(this.v0);
        }
        dVar.a0(this.u0);
        com.google.android.exoplayer2.source.hls.d dVar2 = this.w0;
        if (dVar2 != null) {
            dVar.j0(dVar2);
        }
        dVar.d0(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.H, i3);
        this.H = copyOf;
        copyOf[length] = i;
        this.B = (d[]) z19.G0(this.B, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.n0, i3);
        this.n0 = copyOf2;
        copyOf2[length] = z;
        this.l0 |= z;
        this.L.add(Integer.valueOf(i2));
        this.M.append(i2, length);
        if (M(i2) > M(this.Q)) {
            this.S = length;
            this.Q = i2;
        }
        this.m0 = Arrays.copyOf(this.m0, i3);
        return dVar;
    }

    private wp8 E(up8[] up8VarArr) {
        for (int i = 0; i < up8VarArr.length; i++) {
            up8 up8Var = up8VarArr[i];
            t0[] t0VarArr = new t0[up8Var.a];
            for (int i2 = 0; i2 < up8Var.a; i2++) {
                t0 d2 = up8Var.d(i2);
                t0VarArr[i2] = d2.d(this.g.a(d2));
            }
            up8VarArr[i] = new up8(up8Var.b, t0VarArr);
        }
        return new wp8(up8VarArr);
    }

    private static t0 F(t0 t0Var, t0 t0Var2, boolean z) {
        String d2;
        String str;
        if (t0Var == null) {
            return t0Var2;
        }
        int k = ku4.k(t0Var2.l);
        if (z19.L(t0Var.i, k) == 1) {
            d2 = z19.M(t0Var.i, k);
            str = ku4.g(d2);
        } else {
            d2 = ku4.d(t0Var.i, t0Var2.l);
            str = t0Var2.l;
        }
        t0.b K = t0Var2.c().U(t0Var.a).W(t0Var.b).X(t0Var.c).i0(t0Var.d).e0(t0Var.e).I(z ? t0Var.f : -1).b0(z ? t0Var.g : -1).K(d2);
        if (k == 2) {
            K.n0(t0Var.t).S(t0Var.u).R(t0Var.w);
        }
        if (str != null) {
            K.g0(str);
        }
        int i = t0Var.M;
        if (i != -1 && k == 1) {
            K.J(i);
        }
        Metadata metadata = t0Var.j;
        if (metadata != null) {
            Metadata metadata2 = t0Var2.j;
            if (metadata2 != null) {
                metadata = metadata2.b(metadata);
            }
            K.Z(metadata);
        }
        return K.G();
    }

    private void G(int i) {
        ur.g(!this.j.j());
        while (true) {
            if (i >= this.n.size()) {
                i = -1;
                break;
            } else if (A(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = K().h;
        com.google.android.exoplayer2.source.hls.d H = H(i);
        if (this.n.isEmpty()) {
            this.p0 = this.o0;
        } else {
            ((com.google.android.exoplayer2.source.hls.d) j.e(this.n)).o();
        }
        this.s0 = false;
        this.k.C(this.Q, H.g, j);
    }

    private com.google.android.exoplayer2.source.hls.d H(int i) {
        com.google.android.exoplayer2.source.hls.d dVar = (com.google.android.exoplayer2.source.hls.d) this.n.get(i);
        ArrayList arrayList = this.n;
        z19.O0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.B.length; i2++) {
            this.B[i2].u(dVar.m(i2));
        }
        return dVar;
    }

    private boolean I(com.google.android.exoplayer2.source.hls.d dVar) {
        int i = dVar.k;
        int length = this.B.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.m0[i2] && this.B[i2].Q() == i) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(t0 t0Var, t0 t0Var2) {
        String str = t0Var.l;
        String str2 = t0Var2.l;
        int k = ku4.k(str);
        if (k != 3) {
            return k == ku4.k(str2);
        }
        if (z19.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || t0Var.Y == t0Var2.Y;
        }
        return false;
    }

    private com.google.android.exoplayer2.source.hls.d K() {
        return (com.google.android.exoplayer2.source.hls.d) this.n.get(r1.size() - 1);
    }

    private yp8 L(int i, int i2) {
        ur.a(x0.contains(Integer.valueOf(i2)));
        int i3 = this.M.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.L.add(Integer.valueOf(i2))) {
            this.H[i3] = i;
        }
        return this.H[i3] == i ? this.B[i3] : C(i, i2);
    }

    private static int M(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    private void N(com.google.android.exoplayer2.source.hls.d dVar) {
        this.w0 = dVar;
        this.e0 = dVar.d;
        this.p0 = -9223372036854775807L;
        this.n.add(dVar);
        ImmutableList.a p = ImmutableList.p();
        for (d dVar2 : this.B) {
            p.a(Integer.valueOf(dVar2.G()));
        }
        dVar.n(this, p.k());
        for (d dVar3 : this.B) {
            dVar3.j0(dVar);
            if (dVar.n) {
                dVar3.g0();
            }
        }
    }

    private static boolean O(ok0 ok0Var) {
        return ok0Var instanceof com.google.android.exoplayer2.source.hls.d;
    }

    private boolean P() {
        return this.p0 != -9223372036854775807L;
    }

    private void S() {
        int i = this.h0.a;
        int[] iArr = new int[i];
        this.j0 = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                d[] dVarArr = this.B;
                if (i3 >= dVarArr.length) {
                    break;
                }
                if (J((t0) ur.i(dVarArr[i3].F()), this.h0.c(i2).d(0))) {
                    this.j0[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator it2 = this.w.iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (!this.g0 && this.j0 == null && this.X) {
            for (d dVar : this.B) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.h0 != null) {
                S();
                return;
            }
            z();
            l0();
            this.c.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        this.X = true;
        T();
    }

    private void g0() {
        for (d dVar : this.B) {
            dVar.W(this.q0);
        }
        this.q0 = false;
    }

    private boolean h0(long j) {
        int length = this.B.length;
        for (int i = 0; i < length; i++) {
            if (!this.B[i].Z(j, false) && (this.n0[i] || !this.l0)) {
                return false;
            }
        }
        return true;
    }

    private void l0() {
        this.Y = true;
    }

    private void q0(y77[] y77VarArr) {
        this.w.clear();
        for (y77 y77Var : y77VarArr) {
            if (y77Var != null) {
                this.w.add((f) y77Var);
            }
        }
    }

    private void x() {
        ur.g(this.Y);
        ur.e(this.h0);
        ur.e(this.i0);
    }

    private void z() {
        t0 t0Var;
        int length = this.B.length;
        int i = -2;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            String str = ((t0) ur.i(this.B[i3].F())).l;
            int i4 = ku4.s(str) ? 2 : ku4.o(str) ? 1 : ku4.r(str) ? 3 : -2;
            if (M(i4) > M(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        up8 j = this.d.j();
        int i5 = j.a;
        this.k0 = -1;
        this.j0 = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.j0[i6] = i6;
        }
        up8[] up8VarArr = new up8[length];
        int i7 = 0;
        while (i7 < length) {
            t0 t0Var2 = (t0) ur.i(this.B[i7].F());
            if (i7 == i2) {
                t0[] t0VarArr = new t0[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    t0 d2 = j.d(i8);
                    if (i == 1 && (t0Var = this.f) != null) {
                        d2 = d2.l(t0Var);
                    }
                    t0VarArr[i8] = i5 == 1 ? t0Var2.l(d2) : F(d2, t0Var2, true);
                }
                up8VarArr[i7] = new up8(this.a, t0VarArr);
                this.k0 = i7;
            } else {
                t0 t0Var3 = (i == 2 && ku4.o(t0Var2.l)) ? this.f : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(":muxed:");
                sb.append(i7 < i2 ? i7 : i7 - 1);
                up8VarArr[i7] = new up8(sb.toString(), F(t0Var3, t0Var2, false));
            }
            i7++;
        }
        this.h0 = E(up8VarArr);
        ur.g(this.i0 == null);
        this.i0 = Collections.emptySet();
    }

    public void B() {
        if (this.Y) {
            return;
        }
        f(this.o0);
    }

    public boolean Q(int i) {
        return !P() && this.B[i].K(this.s0);
    }

    public boolean R() {
        return this.Q == 2;
    }

    public void U() {
        this.j.a();
        this.d.n();
    }

    public void V(int i) {
        U();
        this.B[i].N();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void e(ok0 ok0Var, long j, long j2, boolean z) {
        this.y = null;
        v64 v64Var = new v64(ok0Var.a, ok0Var.b, ok0Var.f(), ok0Var.e(), j, j2, ok0Var.b());
        this.i.d(ok0Var.a);
        this.k.q(v64Var, ok0Var.c, this.b, ok0Var.d, ok0Var.e, ok0Var.f, ok0Var.g, ok0Var.h);
        if (z) {
            return;
        }
        if (P() || this.Z == 0) {
            g0();
        }
        if (this.Z > 0) {
            this.c.g(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void k(ok0 ok0Var, long j, long j2) {
        this.y = null;
        this.d.p(ok0Var);
        v64 v64Var = new v64(ok0Var.a, ok0Var.b, ok0Var.f(), ok0Var.e(), j, j2, ok0Var.b());
        this.i.d(ok0Var.a);
        this.k.t(v64Var, ok0Var.c, this.b, ok0Var.d, ok0Var.e, ok0Var.f, ok0Var.g, ok0Var.h);
        if (this.Y) {
            this.c.g(this);
        } else {
            f(this.o0);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Loader.c o(ok0 ok0Var, long j, long j2, IOException iOException, int i) {
        Loader.c h;
        int i2;
        boolean O = O(ok0Var);
        if (O && !((com.google.android.exoplayer2.source.hls.d) ok0Var).q() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return Loader.d;
        }
        long b2 = ok0Var.b();
        v64 v64Var = new v64(ok0Var.a, ok0Var.b, ok0Var.f(), ok0Var.e(), j, j2, b2);
        h.c cVar = new h.c(v64Var, new pi4(ok0Var.c, this.b, ok0Var.d, ok0Var.e, ok0Var.f, z19.h1(ok0Var.g), z19.h1(ok0Var.h)), iOException, i);
        h.b c2 = this.i.c(gq8.c(this.d.k()), cVar);
        boolean m = (c2 == null || c2.a != 2) ? false : this.d.m(ok0Var, c2.b);
        if (m) {
            if (O && b2 == 0) {
                ArrayList arrayList = this.n;
                ur.g(((com.google.android.exoplayer2.source.hls.d) arrayList.remove(arrayList.size() - 1)) == ok0Var);
                if (this.n.isEmpty()) {
                    this.p0 = this.o0;
                } else {
                    ((com.google.android.exoplayer2.source.hls.d) j.e(this.n)).o();
                }
            }
            h = Loader.f;
        } else {
            long a2 = this.i.a(cVar);
            h = a2 != -9223372036854775807L ? Loader.h(false, a2) : Loader.g;
        }
        Loader.c cVar2 = h;
        boolean c3 = cVar2.c();
        this.k.v(v64Var, ok0Var.c, this.b, ok0Var.d, ok0Var.e, ok0Var.f, ok0Var.g, ok0Var.h, iOException, !c3);
        if (!c3) {
            this.y = null;
            this.i.d(ok0Var.a);
        }
        if (m) {
            if (this.Y) {
                this.c.g(this);
            } else {
                f(this.o0);
            }
        }
        return cVar2;
    }

    public void Z() {
        this.L.clear();
    }

    @Override // defpackage.a82
    public yp8 a(int i, int i2) {
        yp8 yp8Var;
        if (!x0.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                yp8[] yp8VarArr = this.B;
                if (i3 >= yp8VarArr.length) {
                    yp8Var = null;
                    break;
                }
                if (this.H[i3] == i) {
                    yp8Var = yp8VarArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            yp8Var = L(i, i2);
        }
        if (yp8Var == null) {
            if (this.t0) {
                return C(i, i2);
            }
            yp8Var = D(i, i2);
        }
        if (i2 != 5) {
            return yp8Var;
        }
        if (this.N == null) {
            this.N = new c(yp8Var, this.l);
        }
        return this.N;
    }

    public boolean a0(Uri uri, h.c cVar, boolean z) {
        h.b c2;
        if (!this.d.o(uri)) {
            return true;
        }
        long j = (z || (c2 = this.i.c(gq8.c(this.d.k()), cVar)) == null || c2.a != 2) ? -9223372036854775807L : c2.b;
        return this.d.q(uri, j) && j != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.j.j();
    }

    public void b0() {
        if (this.n.isEmpty()) {
            return;
        }
        com.google.android.exoplayer2.source.hls.d dVar = (com.google.android.exoplayer2.source.hls.d) j.e(this.n);
        int c2 = this.d.c(dVar);
        if (c2 == 1) {
            dVar.v();
        } else if (c2 == 2 && !this.s0 && this.j.j()) {
            this.j.f();
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long c() {
        if (P()) {
            return this.p0;
        }
        if (this.s0) {
            return Long.MIN_VALUE;
        }
        return K().h;
    }

    public long d(long j, fi7 fi7Var) {
        return this.d.b(j, fi7Var);
    }

    public void d0(up8[] up8VarArr, int i, int... iArr) {
        this.h0 = E(up8VarArr);
        this.i0 = new HashSet();
        for (int i2 : iArr) {
            this.i0.add(this.h0.c(i2));
        }
        this.k0 = i;
        Handler handler = this.u;
        final b bVar = this.c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: g93
            @Override // java.lang.Runnable
            public final void run() {
                i.b.this.e();
            }
        });
        l0();
    }

    public int e0(int i, ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (P()) {
            return -3;
        }
        int i3 = 0;
        if (!this.n.isEmpty()) {
            int i4 = 0;
            while (i4 < this.n.size() - 1 && I((com.google.android.exoplayer2.source.hls.d) this.n.get(i4))) {
                i4++;
            }
            z19.O0(this.n, 0, i4);
            com.google.android.exoplayer2.source.hls.d dVar = (com.google.android.exoplayer2.source.hls.d) this.n.get(0);
            t0 t0Var = dVar.d;
            if (!t0Var.equals(this.f0)) {
                this.k.h(this.b, t0Var, dVar.e, dVar.f, dVar.g);
            }
            this.f0 = t0Var;
        }
        if (!this.n.isEmpty() && !((com.google.android.exoplayer2.source.hls.d) this.n.get(0)).q()) {
            return -3;
        }
        int S = this.B[i].S(ep2Var, decoderInputBuffer, i2, this.s0);
        if (S == -5) {
            t0 t0Var2 = (t0) ur.e(ep2Var.b);
            if (i == this.S) {
                int d2 = Ints.d(this.B[i].Q());
                while (i3 < this.n.size() && ((com.google.android.exoplayer2.source.hls.d) this.n.get(i3)).k != d2) {
                    i3++;
                }
                t0Var2 = t0Var2.l(i3 < this.n.size() ? ((com.google.android.exoplayer2.source.hls.d) this.n.get(i3)).d : (t0) ur.e(this.e0));
            }
            ep2Var.b = t0Var2;
        }
        return S;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        List list;
        long max;
        if (this.s0 || this.j.j() || this.j.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            max = this.p0;
            for (d dVar : this.B) {
                dVar.b0(this.p0);
            }
        } else {
            list = this.r;
            com.google.android.exoplayer2.source.hls.d K = K();
            max = K.h() ? K.h : Math.max(this.o0, K.g);
        }
        List list2 = list;
        long j2 = max;
        this.m.a();
        this.d.e(j, j2, list2, this.Y || !list2.isEmpty(), this.m);
        b.C0186b c0186b = this.m;
        boolean z = c0186b.b;
        ok0 ok0Var = c0186b.a;
        Uri uri = c0186b.c;
        if (z) {
            this.p0 = -9223372036854775807L;
            this.s0 = true;
            return true;
        }
        if (ok0Var == null) {
            if (uri != null) {
                this.c.k(uri);
            }
            return false;
        }
        if (O(ok0Var)) {
            N((com.google.android.exoplayer2.source.hls.d) ok0Var);
        }
        this.y = ok0Var;
        this.k.z(new v64(ok0Var.a, ok0Var.b, this.j.n(ok0Var, this, this.i.b(ok0Var.c))), ok0Var.c, this.b, ok0Var.d, ok0Var.e, ok0Var.f, ok0Var.g, ok0Var.h);
        return true;
    }

    public void f0() {
        if (this.Y) {
            for (d dVar : this.B) {
                dVar.R();
            }
        }
        this.j.m(this);
        this.u.removeCallbacksAndMessages(null);
        this.g0 = true;
        this.w.clear();
    }

    @Override // com.google.android.exoplayer2.source.b0.d
    public void g(t0 t0Var) {
        this.u.post(this.s);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // com.google.android.exoplayer2.source.c0
    public long h() {
        /*
            r6 = this;
            boolean r0 = r6.s0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r6.P()
            if (r0 == 0) goto L10
            long r0 = r6.p0
            return r0
        L10:
            long r0 = r6.o0
            com.google.android.exoplayer2.source.hls.d r2 = r6.K()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r6.n
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r6.n
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            com.google.android.exoplayer2.source.hls.d r2 = (com.google.android.exoplayer2.source.hls.d) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r6.X
            if (r2 == 0) goto L55
            com.google.android.exoplayer2.source.hls.i$d[] r6 = r6.B
            int r2 = r6.length
            r3 = 0
        L46:
            if (r3 >= r2) goto L55
            r4 = r6[r3]
            long r4 = r4.z()
            long r0 = java.lang.Math.max(r0, r4)
            int r3 = r3 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.i.h():long");
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void i(long j) {
        if (this.j.i() || P()) {
            return;
        }
        if (this.j.j()) {
            ur.e(this.y);
            if (this.d.v(j, this.y, this.r)) {
                this.j.f();
                return;
            }
            return;
        }
        int size = this.r.size();
        while (size > 0 && this.d.c((com.google.android.exoplayer2.source.hls.d) this.r.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.r.size()) {
            G(size);
        }
        int h = this.d.h(j, this.r);
        if (h < this.n.size()) {
            G(h);
        }
    }

    public boolean i0(long j, boolean z) {
        this.o0 = j;
        if (P()) {
            this.p0 = j;
            return true;
        }
        if (this.X && !z && h0(j)) {
            return false;
        }
        this.p0 = j;
        this.s0 = false;
        this.n.clear();
        if (this.j.j()) {
            if (this.X) {
                for (d dVar : this.B) {
                    dVar.r();
                }
            }
            this.j.f();
        } else {
            this.j.g();
            g0();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
    
        if (r11.r() != r19.d.j().e(r1.d)) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j0(defpackage.q72[] r20, boolean[] r21, defpackage.y77[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.i.j0(q72[], boolean[], y77[], boolean[], long, boolean):boolean");
    }

    public void k0(DrmInitData drmInitData) {
        if (z19.c(this.v0, drmInitData)) {
            return;
        }
        this.v0 = drmInitData;
        int i = 0;
        while (true) {
            d[] dVarArr = this.B;
            if (i >= dVarArr.length) {
                return;
            }
            if (this.n0[i]) {
                dVarArr[i].i0(drmInitData);
            }
            i++;
        }
    }

    public void m0(boolean z) {
        this.d.t(z);
    }

    public void n0(long j) {
        if (this.u0 != j) {
            this.u0 = j;
            for (d dVar : this.B) {
                dVar.a0(j);
            }
        }
    }

    public int o0(int i, long j) {
        if (P()) {
            return 0;
        }
        d dVar = this.B[i];
        int E = dVar.E(j, this.s0);
        com.google.android.exoplayer2.source.hls.d dVar2 = (com.google.android.exoplayer2.source.hls.d) j.f(this.n, null);
        if (dVar2 != null && !dVar2.q()) {
            E = Math.min(E, dVar2.m(i) - dVar.C());
        }
        dVar.e0(E);
        return E;
    }

    @Override // defpackage.a82
    public void p(ei7 ei7Var) {
    }

    public void p0(int i) {
        x();
        ur.e(this.j0);
        int i2 = this.j0[i];
        ur.g(this.m0[i2]);
        this.m0[i2] = false;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void q() {
        for (d dVar : this.B) {
            dVar.T();
        }
    }

    public void r() {
        U();
        if (this.s0 && !this.Y) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // defpackage.a82
    public void s() {
        this.t0 = true;
        this.u.post(this.t);
    }

    public wp8 t() {
        x();
        return this.h0;
    }

    public void u(long j, boolean z) {
        if (!this.X || P()) {
            return;
        }
        int length = this.B.length;
        for (int i = 0; i < length; i++) {
            this.B[i].q(j, z, this.m0[i]);
        }
    }

    public int y(int i) {
        x();
        ur.e(this.j0);
        int i2 = this.j0[i];
        if (i2 == -1) {
            return this.i0.contains(this.h0.c(i)) ? -3 : -2;
        }
        boolean[] zArr = this.m0;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }
}
