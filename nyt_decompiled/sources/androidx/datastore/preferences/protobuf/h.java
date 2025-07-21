package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import androidx.datastore.preferences.protobuf.z;
import defpackage.s14;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class h implements Writer {
    private final CodedOutputStream a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private h(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) t.b(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.a = this;
    }

    public static h P(CodedOutputStream codedOutputStream) {
        h hVar = codedOutputStream.a;
        return hVar != null ? hVar : new h(codedOutputStream);
    }

    private void Q(int i, boolean z, Object obj, z.a aVar) {
        this.a.N0(i, 2);
        this.a.P0(z.b(aVar, Boolean.valueOf(z), obj));
        z.e(this.a, aVar, Boolean.valueOf(z), obj);
    }

    private void R(int i, z.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it2 = map.keySet().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            iArr[i2] = ((Integer) it2.next()).intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            Object obj = map.get(Integer.valueOf(i4));
            this.a.N0(i, 2);
            this.a.P0(z.b(aVar, Integer.valueOf(i4), obj));
            z.e(this.a, aVar, Integer.valueOf(i4), obj);
        }
    }

    private void S(int i, z.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it2 = map.keySet().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            jArr[i2] = ((Long) it2.next()).longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            Object obj = map.get(Long.valueOf(j));
            this.a.N0(i, 2);
            this.a.P0(z.b(aVar, Long.valueOf(j), obj));
            z.e(this.a, aVar, Long.valueOf(j), obj);
        }
    }

    private void T(int i, z.a aVar, Map map) {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i, aVar, map);
                return;
            case 12:
                U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    private void U(int i, z.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it2 = map.keySet().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            strArr[i2] = (String) it2.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            Object obj = map.get(str);
            this.a.N0(i, 2);
            this.a.P0(z.b(aVar, str, obj));
            z.e(this.a, aVar, str, obj);
        }
    }

    private void V(int i, Object obj) {
        if (obj instanceof String) {
            this.a.L0(i, (String) obj);
        } else {
            this.a.f0(i, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.b0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.d(((Boolean) list.get(i4)).booleanValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.c0(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void B(int i, float f) {
        this.a.p0(i, f);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void C(int i) {
        this.a.N0(i, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.H0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.K(((Integer) list.get(i4)).intValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.I0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void E(int i, int i2) {
        this.a.j0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.x0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.x(((Long) list.get(i4)).longValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.y0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h0(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.i(((Double) list.get(i4)).doubleValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.i0(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void H(int i, int i2) {
        this.a.H0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void I(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.f0(i, (ByteString) list.get(i2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void J(int i, List list, r0 r0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), r0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void K(int i, ByteString byteString) {
        this.a.f0(i, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void L(int i, Object obj, r0 r0Var) {
        this.a.z0(i, (f0) obj, r0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void M(int i, z.a aVar, Map map) {
        if (this.a.Y()) {
            T(i, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.a.N0(i, 2);
            this.a.P0(z.b(aVar, entry.getKey(), entry.getValue()));
            z.e(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void N(int i, Object obj, r0 r0Var) {
        this.a.s0(i, (f0) obj, r0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void O(int i, List list, r0 r0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            L(i, list.get(i2), r0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void a(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.p0(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.q(((Float) list.get(i4)).floatValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.q0(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i, Object obj) {
        if (obj instanceof ByteString) {
            this.a.C0(i, (ByteString) obj);
        } else {
            this.a.B0(i, (f0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void c(int i, int i2) {
        this.a.l0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void d(int i, List list) {
        int i2 = 0;
        if (!(list instanceof s14)) {
            while (i2 < list.size()) {
                this.a.L0(i, (String) list.get(i2));
                i2++;
            }
        } else {
            s14 s14Var = (s14) list;
            while (i2 < list.size()) {
                V(i, s14Var.s(i2));
                i2++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void e(int i, String str) {
        this.a.L0(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void f(int i, long j) {
        this.a.Q0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void g(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.v(((Integer) list.get(i4)).intValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.w0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void h(int i, int i2) {
        this.a.v0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void i(int i, long j) {
        this.a.F0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void j(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.m(((Integer) list.get(i4)).intValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.m0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.O0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.R(((Integer) list.get(i4)).intValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.P0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.J0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.M(((Long) list.get(i4)).longValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.K0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void m(int i, long j) {
        this.a.J0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.k(((Integer) list.get(i4)).intValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.k0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void o(int i, int i2) {
        this.a.O0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void p(int i, double d) {
        this.a.h0(i, d);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.F0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.I(((Long) list.get(i4)).longValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.G0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Q0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.T(((Long) list.get(i4)).longValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.R0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void s(int i, long j) {
        this.a.n0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder t() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void u(int i, long j) {
        this.a.x0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void v(int i, boolean z) {
        this.a.b0(i, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void w(int i, int i2) {
        this.a.D0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void x(int i) {
        this.a.N0(i, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.o(((Long) list.get(i4)).longValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.o0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.D0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.N0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.G(((Integer) list.get(i4)).intValue());
        }
        this.a.P0(i3);
        while (i2 < list.size()) {
            this.a.E0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
