package com.google.android.exoplayer2;

import android.os.Bundle;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.t0;
import defpackage.ku4;
import defpackage.pe0;
import defpackage.sn0;
import defpackage.ys3;
import defpackage.z19;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.DebugKt;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class t0 implements g {
    public final byte[] B;
    public final int H;
    public final sn0 L;
    public final int M;
    public final int N;
    public final int Q;
    public final int S;
    public final int X;
    public final int Y;
    public final int Z;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int e0;
    public final int f;
    public final int f0;
    public final int g;
    private int g0;
    public final int h;
    public final String i;
    public final Metadata j;
    public final String k;
    public final String l;
    public final int m;
    public final List n;
    public final DrmInitData r;
    public final long s;
    public final int t;
    public final int u;
    public final float w;
    public final int x;
    public final float y;
    private static final t0 h0 = new b().G();
    private static final String i0 = z19.t0(0);
    private static final String j0 = z19.t0(1);
    private static final String k0 = z19.t0(2);
    private static final String l0 = z19.t0(3);
    private static final String m0 = z19.t0(4);
    private static final String n0 = z19.t0(5);
    private static final String o0 = z19.t0(6);
    private static final String p0 = z19.t0(7);
    private static final String q0 = z19.t0(8);
    private static final String r0 = z19.t0(9);
    private static final String s0 = z19.t0(10);
    private static final String t0 = z19.t0(11);
    private static final String u0 = z19.t0(12);
    private static final String v0 = z19.t0(13);
    private static final String w0 = z19.t0(14);
    private static final String x0 = z19.t0(15);
    private static final String y0 = z19.t0(16);
    private static final String z0 = z19.t0(17);
    private static final String A0 = z19.t0(18);
    private static final String B0 = z19.t0(19);
    private static final String C0 = z19.t0(20);
    private static final String D0 = z19.t0(21);
    private static final String E0 = z19.t0(22);
    private static final String F0 = z19.t0(23);
    private static final String G0 = z19.t0(24);
    private static final String H0 = z19.t0(25);
    private static final String I0 = z19.t0(26);
    private static final String J0 = z19.t0(27);
    private static final String K0 = z19.t0(28);
    private static final String L0 = z19.t0(29);
    private static final String M0 = z19.t0(30);
    private static final String N0 = z19.t0(31);
    public static final g.a O0 = new g.a() { // from class: cp2
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            t0 f;
            f = t0.f(bundle);
            return f;
        }
    };

    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private String a;
        private String b;
        private String c;
        private int d;
        private int e;
        private int f;
        private int g;
        private String h;
        private Metadata i;
        private String j;
        private String k;
        private int l;
        private List m;
        private DrmInitData n;
        private long o;
        private int p;
        private int q;
        private float r;
        private int s;
        private float t;
        private byte[] u;
        private int v;
        private sn0 w;
        private int x;
        private int y;
        private int z;

        public t0 G() {
            return new t0(this);
        }

        public b H(int i) {
            this.C = i;
            return this;
        }

        public b I(int i) {
            this.f = i;
            return this;
        }

        public b J(int i) {
            this.x = i;
            return this;
        }

        public b K(String str) {
            this.h = str;
            return this;
        }

        public b L(sn0 sn0Var) {
            this.w = sn0Var;
            return this;
        }

        public b M(String str) {
            this.j = str;
            return this;
        }

        public b N(int i) {
            this.F = i;
            return this;
        }

        public b O(DrmInitData drmInitData) {
            this.n = drmInitData;
            return this;
        }

        public b P(int i) {
            this.A = i;
            return this;
        }

        public b Q(int i) {
            this.B = i;
            return this;
        }

        public b R(float f) {
            this.r = f;
            return this;
        }

        public b S(int i) {
            this.q = i;
            return this;
        }

        public b T(int i) {
            this.a = Integer.toString(i);
            return this;
        }

        public b U(String str) {
            this.a = str;
            return this;
        }

        public b V(List list) {
            this.m = list;
            return this;
        }

        public b W(String str) {
            this.b = str;
            return this;
        }

        public b X(String str) {
            this.c = str;
            return this;
        }

        public b Y(int i) {
            this.l = i;
            return this;
        }

        public b Z(Metadata metadata) {
            this.i = metadata;
            return this;
        }

        public b a0(int i) {
            this.z = i;
            return this;
        }

        public b b0(int i) {
            this.g = i;
            return this;
        }

        public b c0(float f) {
            this.t = f;
            return this;
        }

        public b d0(byte[] bArr) {
            this.u = bArr;
            return this;
        }

        public b e0(int i) {
            this.e = i;
            return this;
        }

        public b f0(int i) {
            this.s = i;
            return this;
        }

        public b g0(String str) {
            this.k = str;
            return this;
        }

        public b h0(int i) {
            this.y = i;
            return this;
        }

        public b i0(int i) {
            this.d = i;
            return this;
        }

        public b j0(int i) {
            this.v = i;
            return this;
        }

        public b k0(long j) {
            this.o = j;
            return this;
        }

        public b l0(int i) {
            this.D = i;
            return this;
        }

        public b m0(int i) {
            this.E = i;
            return this;
        }

        public b n0(int i) {
            this.p = i;
            return this;
        }

        public b() {
            this.f = -1;
            this.g = -1;
            this.l = -1;
            this.o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
        }

        private b(t0 t0Var) {
            this.a = t0Var.a;
            this.b = t0Var.b;
            this.c = t0Var.c;
            this.d = t0Var.d;
            this.e = t0Var.e;
            this.f = t0Var.f;
            this.g = t0Var.g;
            this.h = t0Var.i;
            this.i = t0Var.j;
            this.j = t0Var.k;
            this.k = t0Var.l;
            this.l = t0Var.m;
            this.m = t0Var.n;
            this.n = t0Var.r;
            this.o = t0Var.s;
            this.p = t0Var.t;
            this.q = t0Var.u;
            this.r = t0Var.w;
            this.s = t0Var.x;
            this.t = t0Var.y;
            this.u = t0Var.B;
            this.v = t0Var.H;
            this.w = t0Var.L;
            this.x = t0Var.M;
            this.y = t0Var.N;
            this.z = t0Var.Q;
            this.A = t0Var.S;
            this.B = t0Var.X;
            this.C = t0Var.Y;
            this.D = t0Var.Z;
            this.E = t0Var.e0;
            this.F = t0Var.f0;
        }
    }

    private static Object e(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t0 f(Bundle bundle) {
        b bVar = new b();
        pe0.c(bundle);
        String string = bundle.getString(i0);
        t0 t0Var = h0;
        bVar.U((String) e(string, t0Var.a)).W((String) e(bundle.getString(j0), t0Var.b)).X((String) e(bundle.getString(k0), t0Var.c)).i0(bundle.getInt(l0, t0Var.d)).e0(bundle.getInt(m0, t0Var.e)).I(bundle.getInt(n0, t0Var.f)).b0(bundle.getInt(o0, t0Var.g)).K((String) e(bundle.getString(p0), t0Var.i)).Z((Metadata) e((Metadata) bundle.getParcelable(q0), t0Var.j)).M((String) e(bundle.getString(r0), t0Var.k)).g0((String) e(bundle.getString(s0), t0Var.l)).Y(bundle.getInt(t0, t0Var.m));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(i(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        b O = bVar.V(arrayList).O((DrmInitData) bundle.getParcelable(v0));
        String str = w0;
        t0 t0Var2 = h0;
        O.k0(bundle.getLong(str, t0Var2.s)).n0(bundle.getInt(x0, t0Var2.t)).S(bundle.getInt(y0, t0Var2.u)).R(bundle.getFloat(z0, t0Var2.w)).f0(bundle.getInt(A0, t0Var2.x)).c0(bundle.getFloat(B0, t0Var2.y)).d0(bundle.getByteArray(C0)).j0(bundle.getInt(D0, t0Var2.H));
        Bundle bundle2 = bundle.getBundle(E0);
        if (bundle2 != null) {
            bVar.L((sn0) sn0.l.a(bundle2));
        }
        bVar.J(bundle.getInt(F0, t0Var2.M)).h0(bundle.getInt(G0, t0Var2.N)).a0(bundle.getInt(H0, t0Var2.Q)).P(bundle.getInt(I0, t0Var2.S)).Q(bundle.getInt(J0, t0Var2.X)).H(bundle.getInt(K0, t0Var2.Y)).l0(bundle.getInt(M0, t0Var2.Z)).m0(bundle.getInt(N0, t0Var2.e0)).N(bundle.getInt(L0, t0Var2.f0));
        return bVar.G();
    }

    private static String i(int i) {
        return u0 + QueryKeys.END_MARKER + Integer.toString(i, 36);
    }

    public static String k(t0 t0Var) {
        if (t0Var == null) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(t0Var.a);
        sb.append(", mimeType=");
        sb.append(t0Var.l);
        if (t0Var.h != -1) {
            sb.append(", bitrate=");
            sb.append(t0Var.h);
        }
        if (t0Var.i != null) {
            sb.append(", codecs=");
            sb.append(t0Var.i);
        }
        if (t0Var.r != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                DrmInitData drmInitData = t0Var.r;
                if (i >= drmInitData.schemeDataCount) {
                    break;
                }
                UUID uuid = drmInitData.e(i).uuid;
                if (uuid.equals(zf0.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zf0.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zf0.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zf0.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zf0.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i++;
            }
            sb.append(", drm=[");
            ys3.f(',').b(sb, linkedHashSet);
            sb.append(']');
        }
        if (t0Var.t != -1 && t0Var.u != -1) {
            sb.append(", res=");
            sb.append(t0Var.t);
            sb.append(QueryKeys.SCROLL_POSITION_TOP);
            sb.append(t0Var.u);
        }
        sn0 sn0Var = t0Var.L;
        if (sn0Var != null && sn0Var.h()) {
            sb.append(", color=");
            sb.append(t0Var.L.l());
        }
        if (t0Var.w != -1.0f) {
            sb.append(", fps=");
            sb.append(t0Var.w);
        }
        if (t0Var.M != -1) {
            sb.append(", channels=");
            sb.append(t0Var.M);
        }
        if (t0Var.N != -1) {
            sb.append(", sample_rate=");
            sb.append(t0Var.N);
        }
        if (t0Var.c != null) {
            sb.append(", language=");
            sb.append(t0Var.c);
        }
        if (t0Var.b != null) {
            sb.append(", label=");
            sb.append(t0Var.b);
        }
        if (t0Var.d != 0) {
            ArrayList arrayList = new ArrayList();
            if ((t0Var.d & 4) != 0) {
                arrayList.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            }
            if ((t0Var.d & 1) != 0) {
                arrayList.add("default");
            }
            if ((t0Var.d & 2) != 0) {
                arrayList.add("forced");
            }
            sb.append(", selectionFlags=[");
            ys3.f(',').b(sb, arrayList);
            sb.append("]");
        }
        if (t0Var.e != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((t0Var.e & 1) != 0) {
                arrayList2.add("main");
            }
            if ((t0Var.e & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((t0Var.e & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((t0Var.e & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((t0Var.e & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((t0Var.e & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((t0Var.e & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((t0Var.e & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((t0Var.e & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0) {
                arrayList2.add("sign");
            }
            if ((t0Var.e & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((t0Var.e & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((t0Var.e & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((t0Var.e & ProgressEvent.PART_FAILED_EVENT_CODE) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((t0Var.e & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((t0Var.e & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            sb.append(", roleFlags=[");
            ys3.f(',').b(sb, arrayList2);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        return j(false);
    }

    public b c() {
        return new b();
    }

    public t0 d(int i) {
        return c().N(i).G();
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        int i2 = this.g0;
        if (i2 == 0 || (i = t0Var.g0) == 0 || i2 == i) {
            return this.d == t0Var.d && this.e == t0Var.e && this.f == t0Var.f && this.g == t0Var.g && this.m == t0Var.m && this.s == t0Var.s && this.t == t0Var.t && this.u == t0Var.u && this.x == t0Var.x && this.H == t0Var.H && this.M == t0Var.M && this.N == t0Var.N && this.Q == t0Var.Q && this.S == t0Var.S && this.X == t0Var.X && this.Y == t0Var.Y && this.Z == t0Var.Z && this.e0 == t0Var.e0 && this.f0 == t0Var.f0 && Float.compare(this.w, t0Var.w) == 0 && Float.compare(this.y, t0Var.y) == 0 && z19.c(this.a, t0Var.a) && z19.c(this.b, t0Var.b) && z19.c(this.i, t0Var.i) && z19.c(this.k, t0Var.k) && z19.c(this.l, t0Var.l) && z19.c(this.c, t0Var.c) && Arrays.equals(this.B, t0Var.B) && z19.c(this.j, t0Var.j) && z19.c(this.L, t0Var.L) && z19.c(this.r, t0Var.r) && h(t0Var);
        }
        return false;
    }

    public int g() {
        int i;
        int i2 = this.t;
        if (i2 == -1 || (i = this.u) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public boolean h(t0 t0Var) {
        if (this.n.size() != t0Var.n.size()) {
            return false;
        }
        for (int i = 0; i < this.n.size(); i++) {
            if (!Arrays.equals((byte[]) this.n.get(i), (byte[]) t0Var.n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.g0 == 0) {
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31;
            String str4 = this.i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.j;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.l;
            this.g0 = ((((((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.m) * 31) + ((int) this.s)) * 31) + this.t) * 31) + this.u) * 31) + Float.floatToIntBits(this.w)) * 31) + this.x) * 31) + Float.floatToIntBits(this.y)) * 31) + this.H) * 31) + this.M) * 31) + this.N) * 31) + this.Q) * 31) + this.S) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.e0) * 31) + this.f0;
        }
        return this.g0;
    }

    public Bundle j(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(i0, this.a);
        bundle.putString(j0, this.b);
        bundle.putString(k0, this.c);
        bundle.putInt(l0, this.d);
        bundle.putInt(m0, this.e);
        bundle.putInt(n0, this.f);
        bundle.putInt(o0, this.g);
        bundle.putString(p0, this.i);
        if (!z) {
            bundle.putParcelable(q0, this.j);
        }
        bundle.putString(r0, this.k);
        bundle.putString(s0, this.l);
        bundle.putInt(t0, this.m);
        for (int i = 0; i < this.n.size(); i++) {
            bundle.putByteArray(i(i), (byte[]) this.n.get(i));
        }
        bundle.putParcelable(v0, this.r);
        bundle.putLong(w0, this.s);
        bundle.putInt(x0, this.t);
        bundle.putInt(y0, this.u);
        bundle.putFloat(z0, this.w);
        bundle.putInt(A0, this.x);
        bundle.putFloat(B0, this.y);
        bundle.putByteArray(C0, this.B);
        bundle.putInt(D0, this.H);
        sn0 sn0Var = this.L;
        if (sn0Var != null) {
            bundle.putBundle(E0, sn0Var.a());
        }
        bundle.putInt(F0, this.M);
        bundle.putInt(G0, this.N);
        bundle.putInt(H0, this.Q);
        bundle.putInt(I0, this.S);
        bundle.putInt(J0, this.X);
        bundle.putInt(K0, this.Y);
        bundle.putInt(M0, this.Z);
        bundle.putInt(N0, this.e0);
        bundle.putInt(L0, this.f0);
        return bundle;
    }

    public t0 l(t0 t0Var) {
        String str;
        if (this == t0Var) {
            return this;
        }
        int k = ku4.k(this.l);
        String str2 = t0Var.a;
        String str3 = t0Var.b;
        if (str3 == null) {
            str3 = this.b;
        }
        String str4 = this.c;
        if ((k == 3 || k == 1) && (str = t0Var.c) != null) {
            str4 = str;
        }
        int i = this.f;
        if (i == -1) {
            i = t0Var.f;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = t0Var.g;
        }
        String str5 = this.i;
        if (str5 == null) {
            String M = z19.M(t0Var.i, k);
            if (z19.X0(M).length == 1) {
                str5 = M;
            }
        }
        Metadata metadata = this.j;
        Metadata b2 = metadata == null ? t0Var.j : metadata.b(t0Var.j);
        float f = this.w;
        if (f == -1.0f && k == 2) {
            f = t0Var.w;
        }
        return c().U(str2).W(str3).X(str4).i0(this.d | t0Var.d).e0(this.e | t0Var.e).I(i).b0(i2).K(str5).Z(b2).O(DrmInitData.d(t0Var.r, this.r)).R(f).G();
    }

    public String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.k + ", " + this.l + ", " + this.i + ", " + this.h + ", " + this.c + ", [" + this.t + ", " + this.u + ", " + this.w + ", " + this.L + "], [" + this.M + ", " + this.N + "])";
    }

    private t0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = z19.F0(bVar.c);
        this.d = bVar.d;
        this.e = bVar.e;
        int i = bVar.f;
        this.f = i;
        int i2 = bVar.g;
        this.g = i2;
        this.h = i2 != -1 ? i2 : i;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
        this.n = bVar.m == null ? Collections.emptyList() : bVar.m;
        DrmInitData drmInitData = bVar.n;
        this.r = drmInitData;
        this.s = bVar.o;
        this.t = bVar.p;
        this.u = bVar.q;
        this.w = bVar.r;
        this.x = bVar.s == -1 ? 0 : bVar.s;
        this.y = bVar.t == -1.0f ? 1.0f : bVar.t;
        this.B = bVar.u;
        this.H = bVar.v;
        this.L = bVar.w;
        this.M = bVar.x;
        this.N = bVar.y;
        this.Q = bVar.z;
        this.S = bVar.A == -1 ? 0 : bVar.A;
        this.X = bVar.B != -1 ? bVar.B : 0;
        this.Y = bVar.C;
        this.Z = bVar.D;
        this.e0 = bVar.E;
        if (bVar.F != 0 || drmInitData == null) {
            this.f0 = bVar.F;
        } else {
            this.f0 = 1;
        }
    }
}
