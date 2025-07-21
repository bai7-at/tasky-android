package com.google.firebase.encoders.proto;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.Protobuf;
import defpackage.k76;
import defpackage.s39;
import defpackage.wb5;
import defpackage.xb5;
import defpackage.yd2;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class d implements xb5 {
    private static final Charset f = Charset.forName(Constants.DEFAULT_ENCODING);
    private static final yd2 g = yd2.a(TransferTable.COLUMN_KEY).b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();
    private static final yd2 h = yd2.a("value").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();
    private static final wb5 i = new wb5() { // from class: com.google.firebase.encoders.proto.c
        @Override // defpackage.wb5
        public final void a(Object obj, Object obj2) {
            d.v((Map.Entry) obj, (xb5) obj2);
        }
    };
    private OutputStream a;
    private final Map b;
    private final Map c;
    private final wb5 d;
    private final f e = new f(this);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    d(OutputStream outputStream, Map map, Map map2, wb5 wb5Var) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = wb5Var;
    }

    private static ByteBuffer o(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long p(wb5 wb5Var, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.a;
            this.a = bVar;
            try {
                wb5Var.a(obj, this);
                this.a = outputStream;
                long a2 = bVar.a();
                bVar.close();
                return a2;
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private d q(wb5 wb5Var, yd2 yd2Var, Object obj, boolean z) {
        long p = p(wb5Var, obj);
        if (z && p == 0) {
            return this;
        }
        w((u(yd2Var) << 3) | 2);
        x(p);
        wb5Var.a(obj, this);
        return this;
    }

    private d r(s39 s39Var, yd2 yd2Var, Object obj, boolean z) {
        this.e.d(yd2Var, z);
        s39Var.a(obj, this.e);
        return this;
    }

    private static Protobuf t(yd2 yd2Var) {
        Protobuf protobuf = (Protobuf) yd2Var.c(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int u(yd2 yd2Var) {
        Protobuf protobuf = (Protobuf) yd2Var.c(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Map.Entry entry, xb5 xb5Var) {
        xb5Var.a(g, entry.getKey());
        xb5Var.a(h, entry.getValue());
    }

    private void w(int i2) {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    private void x(long j) {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }

    @Override // defpackage.xb5
    public xb5 a(yd2 yd2Var, Object obj) {
        return h(yd2Var, obj, true);
    }

    xb5 c(yd2 yd2Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        w((u(yd2Var) << 3) | 1);
        this.a.write(o(8).putDouble(d).array());
        return this;
    }

    xb5 g(yd2 yd2Var, float f2, boolean z) {
        if (z && f2 == 0.0f) {
            return this;
        }
        w((u(yd2Var) << 3) | 5);
        this.a.write(o(4).putFloat(f2).array());
        return this;
    }

    xb5 h(yd2 yd2Var, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            w((u(yd2Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            w(bytes.length);
            this.a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it2 = ((Collection) obj).iterator();
            while (it2.hasNext()) {
                h(yd2Var, it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                q(i, yd2Var, (Map.Entry) it3.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return c(yd2Var, ((Double) obj).doubleValue(), z);
        }
        if (obj instanceof Float) {
            return g(yd2Var, ((Float) obj).floatValue(), z);
        }
        if (obj instanceof Number) {
            return l(yd2Var, ((Number) obj).longValue(), z);
        }
        if (obj instanceof Boolean) {
            return n(yd2Var, ((Boolean) obj).booleanValue(), z);
        }
        if (!(obj instanceof byte[])) {
            wb5 wb5Var = (wb5) this.b.get(obj.getClass());
            if (wb5Var != null) {
                return q(wb5Var, yd2Var, obj, z);
            }
            s39 s39Var = (s39) this.c.get(obj.getClass());
            return s39Var != null ? r(s39Var, yd2Var, obj, z) : obj instanceof k76 ? e(yd2Var, ((k76) obj).getNumber()) : obj instanceof Enum ? e(yd2Var, ((Enum) obj).ordinal()) : q(this.d, yd2Var, obj, z);
        }
        byte[] bArr = (byte[]) obj;
        if (z && bArr.length == 0) {
            return this;
        }
        w((u(yd2Var) << 3) | 2);
        w(bArr.length);
        this.a.write(bArr);
        return this;
    }

    @Override // defpackage.xb5
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public d e(yd2 yd2Var, int i2) {
        return j(yd2Var, i2, true);
    }

    d j(yd2 yd2Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return this;
        }
        Protobuf t = t(yd2Var);
        int i3 = a.a[t.intEncoding().ordinal()];
        if (i3 == 1) {
            w(t.tag() << 3);
            w(i2);
        } else if (i3 == 2) {
            w(t.tag() << 3);
            w((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            w((t.tag() << 3) | 5);
            this.a.write(o(4).putInt(i2).array());
        }
        return this;
    }

    @Override // defpackage.xb5
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public d f(yd2 yd2Var, long j) {
        return l(yd2Var, j, true);
    }

    d l(yd2 yd2Var, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        Protobuf t = t(yd2Var);
        int i2 = a.a[t.intEncoding().ordinal()];
        if (i2 == 1) {
            w(t.tag() << 3);
            x(j);
        } else if (i2 == 2) {
            w(t.tag() << 3);
            x((j >> 63) ^ (j << 1));
        } else if (i2 == 3) {
            w((t.tag() << 3) | 1);
            this.a.write(o(8).putLong(j).array());
        }
        return this;
    }

    @Override // defpackage.xb5
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public d d(yd2 yd2Var, boolean z) {
        return n(yd2Var, z, true);
    }

    d n(yd2 yd2Var, boolean z, boolean z2) {
        return j(yd2Var, z ? 1 : 0, z2);
    }

    d s(Object obj) {
        if (obj == null) {
            return this;
        }
        wb5 wb5Var = (wb5) this.b.get(obj.getClass());
        if (wb5Var != null) {
            wb5Var.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
