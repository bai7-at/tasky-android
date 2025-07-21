package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.comscore.streaming.ContentMediaFormat;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d5g extends ucc {
    public static final d5g A0;
    public static final d5g B0;
    private static final String C0;
    private static final String D0;
    private static final String E0;
    private static final String F0;
    private static final String G0;
    private static final String H0;
    private static final String I0;
    private static final String J0;
    private static final String K0;
    private static final String L0;
    private static final String M0;
    private static final String N0;
    private static final String O0;
    private static final String P0;
    private static final String Q0;
    private static final String R0;
    private static final String S0;
    private static final String T0;
    private static final String U0;
    public static final zhf V0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final boolean x0;
    private final SparseArray y0;
    private final SparseBooleanArray z0;

    static {
        d5g d5gVar = new d5g(new z4g());
        A0 = d5gVar;
        B0 = d5gVar;
        C0 = Integer.toString(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, 36);
        D0 = Integer.toString(1001, 36);
        E0 = Integer.toString(ContentMediaFormat.FULL_CONTENT_EPISODE, 36);
        F0 = Integer.toString(ContentMediaFormat.FULL_CONTENT_MOVIE, 36);
        G0 = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_GENERIC, 36);
        H0 = Integer.toString(1005, 36);
        I0 = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_MOVIE, 36);
        J0 = Integer.toString(ContentMediaFormat.PREVIEW_GENERIC, 36);
        K0 = Integer.toString(ContentMediaFormat.PREVIEW_EPISODE, 36);
        L0 = Integer.toString(ContentMediaFormat.PREVIEW_MOVIE, 36);
        M0 = Integer.toString(ContentMediaFormat.EXTRA_GENERIC, 36);
        N0 = Integer.toString(1011, 36);
        O0 = Integer.toString(ContentMediaFormat.EXTRA_EPISODE, 36);
        P0 = Integer.toString(ContentMediaFormat.EXTRA_MOVIE, 36);
        Q0 = Integer.toString(ContentMediaFormat.FULL_CONTENT_PODCAST, 36);
        R0 = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_PODCAST, 36);
        S0 = Integer.toString(1016, 36);
        T0 = Integer.toString(1017, 36);
        U0 = Integer.toString(1018, 36);
        V0 = new zhf() { // from class: v4g
        };
    }

    public static d5g d(Context context) {
        return new d5g(new z4g(context));
    }

    public final z4g c() {
        return new z4g(this, null);
    }

    public final g5g e(int i, z2g z2gVar) {
        Map map = (Map) this.y0.get(i);
        if (map != null) {
            lh4.a(map.get(z2gVar));
        }
        return null;
    }

    @Override // defpackage.ucc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d5g.class == obj.getClass()) {
            d5g d5gVar = (d5g) obj;
            if (super.equals(d5gVar) && this.k0 == d5gVar.k0 && this.m0 == d5gVar.m0 && this.o0 == d5gVar.o0 && this.t0 == d5gVar.t0 && this.u0 == d5gVar.u0 && this.v0 == d5gVar.v0 && this.x0 == d5gVar.x0) {
                SparseBooleanArray sparseBooleanArray = this.z0;
                SparseBooleanArray sparseBooleanArray2 = d5gVar.z0;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.y0;
                            SparseArray sparseArray2 = d5gVar.y0;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                z2g z2gVar = (z2g) entry.getKey();
                                                if (map2.containsKey(z2gVar) && khe.f(entry.getValue(), map2.get(z2gVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(int i) {
        return this.z0.get(i);
    }

    public final boolean g(int i, z2g z2gVar) {
        Map map = (Map) this.y0.get(i);
        return map != null && map.containsKey(z2gVar);
    }

    @Override // defpackage.ucc
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.k0 ? 1 : 0)) * 961) + (this.m0 ? 1 : 0)) * 961) + (this.o0 ? 1 : 0)) * 28629151) + (this.t0 ? 1 : 0)) * 31) + (this.u0 ? 1 : 0)) * 31) + (this.v0 ? 1 : 0)) * 961) + (this.x0 ? 1 : 0)) * 31;
    }

    private d5g(z4g z4gVar) {
        super(z4gVar);
        this.k0 = z4gVar.r;
        this.l0 = false;
        this.m0 = z4gVar.s;
        this.n0 = false;
        this.o0 = z4gVar.t;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = z4gVar.u;
        this.u0 = z4gVar.v;
        this.v0 = z4gVar.w;
        this.w0 = false;
        this.x0 = z4gVar.x;
        this.y0 = z4gVar.y;
        this.z0 = z4gVar.z;
    }
}
