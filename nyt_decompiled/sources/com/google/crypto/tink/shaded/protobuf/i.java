package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import com.google.crypto.tink.shaded.protobuf.z;
import defpackage.r14;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class i implements Writer {
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

    private i(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) u.b(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.a = this;
    }

    public static i P(CodedOutputStream codedOutputStream) {
        i iVar = codedOutputStream.a;
        return iVar != null ? iVar : new i(codedOutputStream);
    }

    private void Q(int i, z.a aVar, Map map) {
        int[] iArr = a.a;
        throw null;
    }

    private void R(int i, Object obj) {
        if (obj instanceof String) {
            this.a.C0(i, (String) obj);
        } else {
            this.a.a0(i, (ByteString) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Y(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.e(((Boolean) list.get(i4)).booleanValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.Z(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void B(int i, float f) {
        this.a.j0(i, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void C(int i) {
        this.a.D0(i, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.y0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.G(((Integer) list.get(i4)).intValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.z0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void E(int i, int i2) {
        this.a.d0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.p0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.w(((Long) list.get(i4)).longValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.q0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.b0(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.i(((Double) list.get(i4)).doubleValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.c0(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void H(int i, int i2) {
        this.a.y0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void I(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.a0(i, (ByteString) list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void J(int i, z.a aVar, Map map) {
        if (this.a.T()) {
            Q(i, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.a.D0(i, 2);
            this.a.F0(z.a(aVar, entry.getKey(), entry.getValue()));
            z.b(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void K(int i, Object obj, r0 r0Var) {
        this.a.l0(i, (f0) obj, r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void L(int i, List list, r0 r0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), r0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void M(int i, ByteString byteString) {
        this.a.a0(i, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void N(int i, Object obj, r0 r0Var) {
        this.a.r0(i, (f0) obj, r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void O(int i, List list, r0 r0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            K(i, list.get(i2), r0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void a(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j0(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.q(((Float) list.get(i4)).floatValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.k0(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void b(int i, Object obj) {
        if (obj instanceof ByteString) {
            this.a.t0(i, (ByteString) obj);
        } else {
            this.a.s0(i, (f0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void c(int i, int i2) {
        this.a.f0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void d(int i, List list) {
        int i2 = 0;
        if (!(list instanceof r14)) {
            while (i2 < list.size()) {
                this.a.C0(i, (String) list.get(i2));
                i2++;
            }
        } else {
            r14 r14Var = (r14) list;
            while (i2 < list.size()) {
                R(i, r14Var.s(i2));
                i2++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void e(int i, String str) {
        this.a.C0(i, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void f(int i, long j) {
        this.a.G0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void g(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.u(((Integer) list.get(i4)).intValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.o0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void h(int i, int i2) {
        this.a.n0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void i(int i, long j) {
        this.a.w0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void j(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.f0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.m(((Integer) list.get(i4)).intValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.g0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.E0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.N(((Integer) list.get(i4)).intValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.F0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.A0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.I(((Long) list.get(i4)).longValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.B0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void m(int i, long j) {
        this.a.A0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.d0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.k(((Integer) list.get(i4)).intValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.e0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void o(int i, int i2) {
        this.a.E0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void p(int i, double d) {
        this.a.b0(i, d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.w0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.E(((Long) list.get(i4)).longValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.x0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.G0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.P(((Long) list.get(i4)).longValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.H0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void s(int i, long j) {
        this.a.h0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public Writer.FieldOrder t() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void u(int i, long j) {
        this.a.p0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void v(int i, boolean z) {
        this.a.Y(i, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void w(int i, int i2) {
        this.a.u0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void x(int i) {
        this.a.D0(i, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.o(((Long) list.get(i4)).longValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.i0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.u0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.C(((Integer) list.get(i4)).intValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.v0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
