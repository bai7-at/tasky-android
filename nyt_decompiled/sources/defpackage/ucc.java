package defpackage;

import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import com.google.android.gms.internal.ads.zzgaf;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class ucc {
    public static final ucc C;
    public static final ucc D;
    private static final String E;
    private static final String F;
    private static final String G;
    private static final String H;
    private static final String I;
    private static final String J;
    private static final String K;
    private static final String L;
    private static final String M;
    private static final String N;
    private static final String O;
    private static final String P;
    private static final String Q;
    private static final String R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y;
    private static final String Z;
    private static final String a0;
    private static final String b0;
    private static final String c0;
    private static final String d0;
    private static final String e0;
    private static final String f0;
    private static final String g0;
    private static final String h0;
    private static final String i0;
    public static final zhf j0;
    public final zzgad A;
    public final zzgaf B;
    public final int a = Integer.MAX_VALUE;
    public final int b = Integer.MAX_VALUE;
    public final int c = Integer.MAX_VALUE;
    public final int d = Integer.MAX_VALUE;
    public final int e = 0;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;
    public final int i;
    public final int j;
    public final boolean k;
    public final zzgaa l;
    public final int m;
    public final zzgaa n;
    public final int o;
    public final int p;
    public final int q;
    public final zzgaa r;
    public final kac s;
    public final zzgaa t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        ucc uccVar = new ucc(new pbc());
        C = uccVar;
        D = uccVar;
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = Integer.toString(4, 36);
        I = Integer.toString(5, 36);
        J = Integer.toString(6, 36);
        K = Integer.toString(7, 36);
        L = Integer.toString(8, 36);
        M = Integer.toString(9, 36);
        N = Integer.toString(10, 36);
        O = Integer.toString(11, 36);
        P = Integer.toString(12, 36);
        Q = Integer.toString(13, 36);
        R = Integer.toString(14, 36);
        S = Integer.toString(15, 36);
        T = Integer.toString(16, 36);
        U = Integer.toString(17, 36);
        V = Integer.toString(18, 36);
        W = Integer.toString(19, 36);
        X = Integer.toString(20, 36);
        Y = Integer.toString(21, 36);
        Z = Integer.toString(22, 36);
        a0 = Integer.toString(23, 36);
        b0 = Integer.toString(24, 36);
        c0 = Integer.toString(25, 36);
        d0 = Integer.toString(26, 36);
        e0 = Integer.toString(27, 36);
        f0 = Integer.toString(28, 36);
        g0 = Integer.toString(29, 36);
        h0 = Integer.toString(30, 36);
        i0 = Integer.toString(31, 36);
        j0 = new zhf() { // from class: c8c
        };
    }

    protected ucc(pbc pbcVar) {
        int i;
        int i2;
        boolean z;
        zzgaa zzgaaVar;
        zzgaa zzgaaVar2;
        zzgaa zzgaaVar3;
        kac kacVar;
        zzgaa zzgaaVar4;
        int i3;
        HashMap hashMap;
        HashSet hashSet;
        i = pbcVar.e;
        this.i = i;
        i2 = pbcVar.f;
        this.j = i2;
        z = pbcVar.g;
        this.k = z;
        zzgaaVar = pbcVar.h;
        this.l = zzgaaVar;
        this.m = 0;
        zzgaaVar2 = pbcVar.i;
        this.n = zzgaaVar2;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        zzgaaVar3 = pbcVar.l;
        this.r = zzgaaVar3;
        kacVar = pbcVar.m;
        this.s = kacVar;
        zzgaaVar4 = pbcVar.n;
        this.t = zzgaaVar4;
        i3 = pbcVar.o;
        this.u = i3;
        this.v = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        hashMap = pbcVar.p;
        this.A = zzgad.d(hashMap);
        hashSet = pbcVar.q;
        this.B = zzgaf.t(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ucc uccVar = (ucc) obj;
            if (this.k == uccVar.k && this.i == uccVar.i && this.j == uccVar.j && this.l.equals(uccVar.l) && this.n.equals(uccVar.n) && this.r.equals(uccVar.r) && this.s.equals(uccVar.s) && this.t.equals(uccVar.t) && this.u == uccVar.u && this.A.equals(uccVar.A) && this.B.equals(uccVar.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.k ? 1 : 0) - 1048002209) * 31) + this.i) * 31) + this.j) * 31) + this.l.hashCode()) * 961) + this.n.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.r.hashCode()) * 31) + 29791) * 31) + this.t.hashCode()) * 31) + this.u) * 887503681) + this.A.hashCode()) * 31) + this.B.hashCode();
    }
}
