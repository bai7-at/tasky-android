package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import defpackage.lh4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class p {
    private static final p d = new p(true);
    private final u0 a;
    private boolean b;
    private boolean c;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b extends Comparable {
        int getNumber();

        boolean isPacked();

        boolean m();

        WireFormat.FieldType r();
    }

    private p() {
        this.a = u0.v(16);
    }

    static int b(WireFormat.FieldType fieldType, int i, Object obj) {
        int P = CodedOutputStream.P(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            P *= 2;
        }
        return P + c(fieldType, obj);
    }

    static int c(WireFormat.FieldType fieldType, Object obj) {
        switch (a.b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.i(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.q(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.x(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.T(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.v(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.o(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.d(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.s((f0) obj);
            case 10:
                return CodedOutputStream.A((f0) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.g((ByteString) obj) : CodedOutputStream.O((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.g((ByteString) obj) : CodedOutputStream.e((byte[]) obj);
            case 13:
                return CodedOutputStream.R(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.G(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.I(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.K(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.M(((Long) obj).longValue());
            case 18:
                return CodedOutputStream.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        WireFormat.FieldType r = bVar.r();
        int number = bVar.getNumber();
        if (!bVar.m()) {
            return b(r, number, obj);
        }
        int i = 0;
        if (bVar.isPacked()) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i += c(r, it2.next());
            }
            return CodedOutputStream.P(number) + i + CodedOutputStream.E(i);
        }
        Iterator it3 = ((List) obj).iterator();
        while (it3.hasNext()) {
            i += b(r, number, it3.next());
        }
        return i;
    }

    private int g(Map.Entry entry) {
        lh4.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    private static boolean l(Map.Entry entry) {
        lh4.a(entry.getKey());
        throw null;
    }

    private static boolean m(WireFormat.FieldType fieldType, Object obj) {
        t.a(obj);
        switch (a.a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof f0;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        lh4.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static p r() {
        return new p();
    }

    private void t(WireFormat.FieldType fieldType, Object obj) {
        if (!m(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void u(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.r0(i, (f0) obj);
        } else {
            codedOutputStream.N0(i, i(fieldType, false));
            v(codedOutputStream, fieldType, obj);
        }
    }

    static void v(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (a.b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.i0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.q0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.y0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.R0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.w0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.o0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.m0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.c0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.t0((f0) obj);
                break;
            case 10:
                codedOutputStream.A0((f0) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.M0((String) obj);
                    break;
                } else {
                    codedOutputStream.g0((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.d0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.g0((ByteString) obj);
                    break;
                }
            case 13:
                codedOutputStream.P0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.E0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.G0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.I0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.K0(((Long) obj).longValue());
                break;
            case 18:
                codedOutputStream.k0(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public p clone() {
        p r = r();
        for (int i = 0; i < this.a.o(); i++) {
            Map.Entry n = this.a.n(i);
            lh4.a(n.getKey());
            r.s(null, n.getValue());
        }
        for (Map.Entry entry : this.a.r()) {
            lh4.a(entry.getKey());
            r.s(null, entry.getValue());
        }
        r.c = this.c;
        return r;
    }

    Iterator e() {
        return this.c ? new u(this.a.l().iterator()) : this.a.l().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.a.equals(((p) obj).a);
        }
        return false;
    }

    public int f() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.o(); i2++) {
            i += g(this.a.n(i2));
        }
        Iterator it2 = this.a.r().iterator();
        while (it2.hasNext()) {
            i += g((Map.Entry) it2.next());
        }
        return i;
    }

    public int h() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.o(); i2++) {
            Map.Entry n = this.a.n(i2);
            lh4.a(n.getKey());
            i += d(null, n.getValue());
        }
        for (Map.Entry entry : this.a.r()) {
            lh4.a(entry.getKey());
            i += d(null, entry.getValue());
        }
        return i;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    boolean j() {
        return this.a.isEmpty();
    }

    public boolean k() {
        for (int i = 0; i < this.a.o(); i++) {
            if (!l(this.a.n(i))) {
                return false;
            }
        }
        Iterator it2 = this.a.r().iterator();
        while (it2.hasNext()) {
            if (!l((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.c ? new u(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void o() {
        if (this.b) {
            return;
        }
        this.a.u();
        this.b = true;
    }

    public void p(p pVar) {
        for (int i = 0; i < pVar.a.o(); i++) {
            q(pVar.a.n(i));
        }
        Iterator it2 = pVar.a.r().iterator();
        while (it2.hasNext()) {
            q((Map.Entry) it2.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.m()) {
            t(bVar.r(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                t(bVar.r(), it2.next());
            }
            obj = arrayList;
        }
        this.a.w(bVar, obj);
    }

    private p(boolean z) {
        this(u0.v(0));
        o();
    }

    private p(u0 u0Var) {
        this.a = u0Var;
        o();
    }
}
