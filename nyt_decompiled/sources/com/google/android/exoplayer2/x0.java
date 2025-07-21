package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.x0;
import defpackage.hc5;
import defpackage.z19;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class x0 implements g {
    public final Integer B;
    public final Integer H;
    public final Integer L;
    public final CharSequence M;
    public final CharSequence N;
    public final CharSequence Q;
    public final Integer S;
    public final Integer X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence e0;
    public final CharSequence f;
    public final Integer f0;
    public final CharSequence g;
    public final Bundle g0;
    public final y1 h;
    public final y1 i;
    public final byte[] j;
    public final Integer k;
    public final Uri l;
    public final Integer m;
    public final Integer n;
    public final Integer r;
    public final Boolean s;
    public final Boolean t;
    public final Integer u;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public static final x0 h0 = new b().H();
    private static final String i0 = z19.t0(0);
    private static final String j0 = z19.t0(1);
    private static final String k0 = z19.t0(2);
    private static final String l0 = z19.t0(3);
    private static final String m0 = z19.t0(4);
    private static final String n0 = z19.t0(5);
    private static final String o0 = z19.t0(6);
    private static final String p0 = z19.t0(8);
    private static final String q0 = z19.t0(9);
    private static final String r0 = z19.t0(10);
    private static final String s0 = z19.t0(11);
    private static final String t0 = z19.t0(12);
    private static final String u0 = z19.t0(13);
    private static final String v0 = z19.t0(14);
    private static final String w0 = z19.t0(15);
    private static final String x0 = z19.t0(16);
    private static final String y0 = z19.t0(17);
    private static final String z0 = z19.t0(18);
    private static final String A0 = z19.t0(19);
    private static final String B0 = z19.t0(20);
    private static final String C0 = z19.t0(21);
    private static final String D0 = z19.t0(22);
    private static final String E0 = z19.t0(23);
    private static final String F0 = z19.t0(24);
    private static final String G0 = z19.t0(25);
    private static final String H0 = z19.t0(26);
    private static final String I0 = z19.t0(27);
    private static final String J0 = z19.t0(28);
    private static final String K0 = z19.t0(29);
    private static final String L0 = z19.t0(30);
    private static final String M0 = z19.t0(31);
    private static final String N0 = z19.t0(32);
    private static final String O0 = z19.t0(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
    public static final g.a P0 = new g.a() { // from class: qi4
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            x0 d;
            d = x0.d(bundle);
            return d;
        }
    };

    public static final class b {
        private Integer A;
        private Integer B;
        private CharSequence C;
        private CharSequence D;
        private CharSequence E;
        private Integer F;
        private Bundle G;
        private CharSequence a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private CharSequence g;
        private y1 h;
        private y1 i;
        private byte[] j;
        private Integer k;
        private Uri l;
        private Integer m;
        private Integer n;
        private Integer o;
        private Boolean p;
        private Boolean q;
        private Integer r;
        private Integer s;
        private Integer t;
        private Integer u;
        private Integer v;
        private Integer w;
        private CharSequence x;
        private CharSequence y;
        private CharSequence z;

        public x0 H() {
            return new x0(this);
        }

        public b I(byte[] bArr, int i) {
            if (this.j == null || z19.c(Integer.valueOf(i), 3) || !z19.c(this.k, 3)) {
                this.j = (byte[]) bArr.clone();
                this.k = Integer.valueOf(i);
            }
            return this;
        }

        public b J(x0 x0Var) {
            if (x0Var == null) {
                return this;
            }
            CharSequence charSequence = x0Var.a;
            if (charSequence != null) {
                m0(charSequence);
            }
            CharSequence charSequence2 = x0Var.b;
            if (charSequence2 != null) {
                O(charSequence2);
            }
            CharSequence charSequence3 = x0Var.c;
            if (charSequence3 != null) {
                N(charSequence3);
            }
            CharSequence charSequence4 = x0Var.d;
            if (charSequence4 != null) {
                M(charSequence4);
            }
            CharSequence charSequence5 = x0Var.e;
            if (charSequence5 != null) {
                W(charSequence5);
            }
            CharSequence charSequence6 = x0Var.f;
            if (charSequence6 != null) {
                l0(charSequence6);
            }
            CharSequence charSequence7 = x0Var.g;
            if (charSequence7 != null) {
                U(charSequence7);
            }
            y1 y1Var = x0Var.h;
            if (y1Var != null) {
                q0(y1Var);
            }
            y1 y1Var2 = x0Var.i;
            if (y1Var2 != null) {
                d0(y1Var2);
            }
            byte[] bArr = x0Var.j;
            if (bArr != null) {
                P(bArr, x0Var.k);
            }
            Uri uri = x0Var.l;
            if (uri != null) {
                Q(uri);
            }
            Integer num = x0Var.m;
            if (num != null) {
                p0(num);
            }
            Integer num2 = x0Var.n;
            if (num2 != null) {
                o0(num2);
            }
            Integer num3 = x0Var.r;
            if (num3 != null) {
                Y(num3);
            }
            Boolean bool = x0Var.s;
            if (bool != null) {
                a0(bool);
            }
            Boolean bool2 = x0Var.t;
            if (bool2 != null) {
                b0(bool2);
            }
            Integer num4 = x0Var.u;
            if (num4 != null) {
                g0(num4);
            }
            Integer num5 = x0Var.w;
            if (num5 != null) {
                g0(num5);
            }
            Integer num6 = x0Var.x;
            if (num6 != null) {
                f0(num6);
            }
            Integer num7 = x0Var.y;
            if (num7 != null) {
                e0(num7);
            }
            Integer num8 = x0Var.B;
            if (num8 != null) {
                j0(num8);
            }
            Integer num9 = x0Var.H;
            if (num9 != null) {
                i0(num9);
            }
            Integer num10 = x0Var.L;
            if (num10 != null) {
                h0(num10);
            }
            CharSequence charSequence8 = x0Var.M;
            if (charSequence8 != null) {
                r0(charSequence8);
            }
            CharSequence charSequence9 = x0Var.N;
            if (charSequence9 != null) {
                S(charSequence9);
            }
            CharSequence charSequence10 = x0Var.Q;
            if (charSequence10 != null) {
                T(charSequence10);
            }
            Integer num11 = x0Var.S;
            if (num11 != null) {
                V(num11);
            }
            Integer num12 = x0Var.X;
            if (num12 != null) {
                n0(num12);
            }
            CharSequence charSequence11 = x0Var.Y;
            if (charSequence11 != null) {
                Z(charSequence11);
            }
            CharSequence charSequence12 = x0Var.Z;
            if (charSequence12 != null) {
                R(charSequence12);
            }
            CharSequence charSequence13 = x0Var.e0;
            if (charSequence13 != null) {
                k0(charSequence13);
            }
            Integer num13 = x0Var.f0;
            if (num13 != null) {
                c0(num13);
            }
            Bundle bundle = x0Var.g0;
            if (bundle != null) {
                X(bundle);
            }
            return this;
        }

        public b K(Metadata metadata) {
            for (int i = 0; i < metadata.e(); i++) {
                metadata.d(i).e0(this);
            }
            return this;
        }

        public b L(List list) {
            for (int i = 0; i < list.size(); i++) {
                Metadata metadata = (Metadata) list.get(i);
                for (int i2 = 0; i2 < metadata.e(); i2++) {
                    metadata.d(i2).e0(this);
                }
            }
            return this;
        }

        public b M(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b N(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b O(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public b P(byte[] bArr, Integer num) {
            this.j = bArr == null ? null : (byte[]) bArr.clone();
            this.k = num;
            return this;
        }

        public b Q(Uri uri) {
            this.l = uri;
            return this;
        }

        public b R(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b S(CharSequence charSequence) {
            this.y = charSequence;
            return this;
        }

        public b T(CharSequence charSequence) {
            this.z = charSequence;
            return this;
        }

        public b U(CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public b V(Integer num) {
            this.A = num;
            return this;
        }

        public b W(CharSequence charSequence) {
            this.e = charSequence;
            return this;
        }

        public b X(Bundle bundle) {
            this.G = bundle;
            return this;
        }

        public b Y(Integer num) {
            this.o = num;
            return this;
        }

        public b Z(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b a0(Boolean bool) {
            this.p = bool;
            return this;
        }

        public b b0(Boolean bool) {
            this.q = bool;
            return this;
        }

        public b c0(Integer num) {
            this.F = num;
            return this;
        }

        public b d0(y1 y1Var) {
            this.i = y1Var;
            return this;
        }

        public b e0(Integer num) {
            this.t = num;
            return this;
        }

        public b f0(Integer num) {
            this.s = num;
            return this;
        }

        public b g0(Integer num) {
            this.r = num;
            return this;
        }

        public b h0(Integer num) {
            this.w = num;
            return this;
        }

        public b i0(Integer num) {
            this.v = num;
            return this;
        }

        public b j0(Integer num) {
            this.u = num;
            return this;
        }

        public b k0(CharSequence charSequence) {
            this.E = charSequence;
            return this;
        }

        public b l0(CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        public b m0(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b n0(Integer num) {
            this.B = num;
            return this;
        }

        public b o0(Integer num) {
            this.n = num;
            return this;
        }

        public b p0(Integer num) {
            this.m = num;
            return this;
        }

        public b q0(y1 y1Var) {
            this.h = y1Var;
            return this;
        }

        public b r0(CharSequence charSequence) {
            this.x = charSequence;
            return this;
        }

        public b() {
        }

        private b(x0 x0Var) {
            this.a = x0Var.a;
            this.b = x0Var.b;
            this.c = x0Var.c;
            this.d = x0Var.d;
            this.e = x0Var.e;
            this.f = x0Var.f;
            this.g = x0Var.g;
            this.h = x0Var.h;
            this.i = x0Var.i;
            this.j = x0Var.j;
            this.k = x0Var.k;
            this.l = x0Var.l;
            this.m = x0Var.m;
            this.n = x0Var.n;
            this.o = x0Var.r;
            this.p = x0Var.s;
            this.q = x0Var.t;
            this.r = x0Var.w;
            this.s = x0Var.x;
            this.t = x0Var.y;
            this.u = x0Var.B;
            this.v = x0Var.H;
            this.w = x0Var.L;
            this.x = x0Var.M;
            this.y = x0Var.N;
            this.z = x0Var.Q;
            this.A = x0Var.S;
            this.B = x0Var.X;
            this.C = x0Var.Y;
            this.D = x0Var.Z;
            this.E = x0Var.e0;
            this.F = x0Var.f0;
            this.G = x0Var.g0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x0 d(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        b U = bVar.m0(bundle.getCharSequence(i0)).O(bundle.getCharSequence(j0)).N(bundle.getCharSequence(k0)).M(bundle.getCharSequence(l0)).W(bundle.getCharSequence(m0)).l0(bundle.getCharSequence(n0)).U(bundle.getCharSequence(o0));
        byte[] byteArray = bundle.getByteArray(r0);
        String str = K0;
        U.P(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null).Q((Uri) bundle.getParcelable(s0)).r0(bundle.getCharSequence(D0)).S(bundle.getCharSequence(E0)).T(bundle.getCharSequence(F0)).Z(bundle.getCharSequence(I0)).R(bundle.getCharSequence(J0)).k0(bundle.getCharSequence(L0)).X(bundle.getBundle(O0));
        String str2 = p0;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            bVar.q0((y1) y1.b.a(bundle3));
        }
        String str3 = q0;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            bVar.d0((y1) y1.b.a(bundle2));
        }
        String str4 = t0;
        if (bundle.containsKey(str4)) {
            bVar.p0(Integer.valueOf(bundle.getInt(str4)));
        }
        String str5 = u0;
        if (bundle.containsKey(str5)) {
            bVar.o0(Integer.valueOf(bundle.getInt(str5)));
        }
        String str6 = v0;
        if (bundle.containsKey(str6)) {
            bVar.Y(Integer.valueOf(bundle.getInt(str6)));
        }
        String str7 = N0;
        if (bundle.containsKey(str7)) {
            bVar.a0(Boolean.valueOf(bundle.getBoolean(str7)));
        }
        String str8 = w0;
        if (bundle.containsKey(str8)) {
            bVar.b0(Boolean.valueOf(bundle.getBoolean(str8)));
        }
        String str9 = x0;
        if (bundle.containsKey(str9)) {
            bVar.g0(Integer.valueOf(bundle.getInt(str9)));
        }
        String str10 = y0;
        if (bundle.containsKey(str10)) {
            bVar.f0(Integer.valueOf(bundle.getInt(str10)));
        }
        String str11 = z0;
        if (bundle.containsKey(str11)) {
            bVar.e0(Integer.valueOf(bundle.getInt(str11)));
        }
        String str12 = A0;
        if (bundle.containsKey(str12)) {
            bVar.j0(Integer.valueOf(bundle.getInt(str12)));
        }
        String str13 = B0;
        if (bundle.containsKey(str13)) {
            bVar.i0(Integer.valueOf(bundle.getInt(str13)));
        }
        String str14 = C0;
        if (bundle.containsKey(str14)) {
            bVar.h0(Integer.valueOf(bundle.getInt(str14)));
        }
        String str15 = G0;
        if (bundle.containsKey(str15)) {
            bVar.V(Integer.valueOf(bundle.getInt(str15)));
        }
        String str16 = H0;
        if (bundle.containsKey(str16)) {
            bVar.n0(Integer.valueOf(bundle.getInt(str16)));
        }
        String str17 = M0;
        if (bundle.containsKey(str17)) {
            bVar.c0(Integer.valueOf(bundle.getInt(str17)));
        }
        return bVar.H();
    }

    private static int e(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return 1;
            case 20:
            case EventType.CDN /* 26 */:
            case 27:
            case 28:
            case BuildConfig.VERSION_CODE /* 29 */:
            case 30:
            default:
                return 0;
            case 21:
                return 2;
            case 22:
                return 3;
            case 23:
                return 4;
            case 24:
                return 5;
            case EventType.SUBS /* 25 */:
                return 6;
        }
    }

    private static int f(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 22;
            case 4:
                return 23;
            case 5:
                return 24;
            case 6:
                return 25;
            default:
                return 20;
        }
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(i0, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(j0, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(k0, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(l0, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(m0, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(n0, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(o0, charSequence7);
        }
        byte[] bArr = this.j;
        if (bArr != null) {
            bundle.putByteArray(r0, bArr);
        }
        Uri uri = this.l;
        if (uri != null) {
            bundle.putParcelable(s0, uri);
        }
        CharSequence charSequence8 = this.M;
        if (charSequence8 != null) {
            bundle.putCharSequence(D0, charSequence8);
        }
        CharSequence charSequence9 = this.N;
        if (charSequence9 != null) {
            bundle.putCharSequence(E0, charSequence9);
        }
        CharSequence charSequence10 = this.Q;
        if (charSequence10 != null) {
            bundle.putCharSequence(F0, charSequence10);
        }
        CharSequence charSequence11 = this.Y;
        if (charSequence11 != null) {
            bundle.putCharSequence(I0, charSequence11);
        }
        CharSequence charSequence12 = this.Z;
        if (charSequence12 != null) {
            bundle.putCharSequence(J0, charSequence12);
        }
        CharSequence charSequence13 = this.e0;
        if (charSequence13 != null) {
            bundle.putCharSequence(L0, charSequence13);
        }
        y1 y1Var = this.h;
        if (y1Var != null) {
            bundle.putBundle(p0, y1Var.a());
        }
        y1 y1Var2 = this.i;
        if (y1Var2 != null) {
            bundle.putBundle(q0, y1Var2.a());
        }
        Integer num = this.m;
        if (num != null) {
            bundle.putInt(t0, num.intValue());
        }
        Integer num2 = this.n;
        if (num2 != null) {
            bundle.putInt(u0, num2.intValue());
        }
        Integer num3 = this.r;
        if (num3 != null) {
            bundle.putInt(v0, num3.intValue());
        }
        Boolean bool = this.s;
        if (bool != null) {
            bundle.putBoolean(N0, bool.booleanValue());
        }
        Boolean bool2 = this.t;
        if (bool2 != null) {
            bundle.putBoolean(w0, bool2.booleanValue());
        }
        Integer num4 = this.w;
        if (num4 != null) {
            bundle.putInt(x0, num4.intValue());
        }
        Integer num5 = this.x;
        if (num5 != null) {
            bundle.putInt(y0, num5.intValue());
        }
        Integer num6 = this.y;
        if (num6 != null) {
            bundle.putInt(z0, num6.intValue());
        }
        Integer num7 = this.B;
        if (num7 != null) {
            bundle.putInt(A0, num7.intValue());
        }
        Integer num8 = this.H;
        if (num8 != null) {
            bundle.putInt(B0, num8.intValue());
        }
        Integer num9 = this.L;
        if (num9 != null) {
            bundle.putInt(C0, num9.intValue());
        }
        Integer num10 = this.S;
        if (num10 != null) {
            bundle.putInt(G0, num10.intValue());
        }
        Integer num11 = this.X;
        if (num11 != null) {
            bundle.putInt(H0, num11.intValue());
        }
        Integer num12 = this.k;
        if (num12 != null) {
            bundle.putInt(K0, num12.intValue());
        }
        Integer num13 = this.f0;
        if (num13 != null) {
            bundle.putInt(M0, num13.intValue());
        }
        Bundle bundle2 = this.g0;
        if (bundle2 != null) {
            bundle.putBundle(O0, bundle2);
        }
        return bundle;
    }

    public b c() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return z19.c(this.a, x0Var.a) && z19.c(this.b, x0Var.b) && z19.c(this.c, x0Var.c) && z19.c(this.d, x0Var.d) && z19.c(this.e, x0Var.e) && z19.c(this.f, x0Var.f) && z19.c(this.g, x0Var.g) && z19.c(this.h, x0Var.h) && z19.c(this.i, x0Var.i) && Arrays.equals(this.j, x0Var.j) && z19.c(this.k, x0Var.k) && z19.c(this.l, x0Var.l) && z19.c(this.m, x0Var.m) && z19.c(this.n, x0Var.n) && z19.c(this.r, x0Var.r) && z19.c(this.s, x0Var.s) && z19.c(this.t, x0Var.t) && z19.c(this.w, x0Var.w) && z19.c(this.x, x0Var.x) && z19.c(this.y, x0Var.y) && z19.c(this.B, x0Var.B) && z19.c(this.H, x0Var.H) && z19.c(this.L, x0Var.L) && z19.c(this.M, x0Var.M) && z19.c(this.N, x0Var.N) && z19.c(this.Q, x0Var.Q) && z19.c(this.S, x0Var.S) && z19.c(this.X, x0Var.X) && z19.c(this.Y, x0Var.Y) && z19.c(this.Z, x0Var.Z) && z19.c(this.e0, x0Var.e0) && z19.c(this.f0, x0Var.f0);
    }

    public int hashCode() {
        return hc5.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Integer.valueOf(Arrays.hashCode(this.j)), this.k, this.l, this.m, this.n, this.r, this.s, this.t, this.w, this.x, this.y, this.B, this.H, this.L, this.M, this.N, this.Q, this.S, this.X, this.Y, this.Z, this.e0, this.f0);
    }

    private x0(b bVar) {
        Boolean bool = bVar.p;
        Integer num = bVar.o;
        Integer num2 = bVar.F;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                num = Integer.valueOf(num2 != null ? e(num2.intValue()) : 0);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                num2 = Integer.valueOf(f(num.intValue()));
            }
        }
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.r = num;
        this.s = bool;
        this.t = bVar.q;
        this.u = bVar.r;
        this.w = bVar.r;
        this.x = bVar.s;
        this.y = bVar.t;
        this.B = bVar.u;
        this.H = bVar.v;
        this.L = bVar.w;
        this.M = bVar.x;
        this.N = bVar.y;
        this.Q = bVar.z;
        this.S = bVar.A;
        this.X = bVar.B;
        this.Y = bVar.C;
        this.Z = bVar.D;
        this.e0 = bVar.E;
        this.f0 = num2;
        this.g0 = bVar.G;
    }
}
