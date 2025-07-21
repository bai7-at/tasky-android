package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class ju3 implements xb5, t39 {
    private ju3 a = null;
    private boolean b = true;
    private final JsonWriter c;
    private final Map d;
    private final Map e;
    private final wb5 f;
    private final boolean g;

    ju3(Writer writer, Map map, Map map2, wb5 wb5Var, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = wb5Var;
        this.g = z;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private ju3 t(String str, Object obj) {
        v();
        this.c.name(str);
        if (obj != null) {
            return i(obj, false);
        }
        this.c.nullValue();
        return this;
    }

    private ju3 u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        v();
        this.c.name(str);
        return i(obj, false);
    }

    private void v() {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        ju3 ju3Var = this.a;
        if (ju3Var != null) {
            ju3Var.v();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }

    @Override // defpackage.xb5
    public xb5 a(yd2 yd2Var, Object obj) {
        return m(yd2Var.b(), obj);
    }

    @Override // defpackage.xb5
    public xb5 d(yd2 yd2Var, boolean z) {
        return n(yd2Var.b(), z);
    }

    @Override // defpackage.xb5
    public xb5 e(yd2 yd2Var, int i) {
        return k(yd2Var.b(), i);
    }

    @Override // defpackage.xb5
    public xb5 f(yd2 yd2Var, long j) {
        return l(yd2Var.b(), j);
    }

    public ju3 g(int i) {
        v();
        this.c.value(i);
        return this;
    }

    public ju3 h(long j) {
        v();
        this.c.value(j);
        return this;
    }

    ju3 i(Object obj, boolean z) {
        if (z && q(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    i(it2.next(), false);
                }
                this.c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            }
            wb5 wb5Var = (wb5) this.d.get(obj.getClass());
            if (wb5Var != null) {
                return s(wb5Var, obj, z);
            }
            s39 s39Var = (s39) this.e.get(obj.getClass());
            if (s39Var != null) {
                s39Var.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return s(this.f, obj, z);
            }
            b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return p((byte[]) obj);
        }
        this.c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.c.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                h(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.c.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.c.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                i(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                i(obj2, false);
            }
        }
        this.c.endArray();
        return this;
    }

    @Override // defpackage.t39
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ju3 b(String str) {
        v();
        this.c.value(str);
        return this;
    }

    public ju3 k(String str, int i) {
        v();
        this.c.name(str);
        return g(i);
    }

    public ju3 l(String str, long j) {
        v();
        this.c.name(str);
        return h(j);
    }

    public ju3 m(String str, Object obj) {
        return this.g ? u(str, obj) : t(str, obj);
    }

    public ju3 n(String str, boolean z) {
        v();
        this.c.name(str);
        return c(z);
    }

    @Override // defpackage.t39
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ju3 c(boolean z) {
        v();
        this.c.value(z);
        return this;
    }

    public ju3 p(byte[] bArr) {
        v();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void r() {
        v();
        this.c.flush();
    }

    ju3 s(wb5 wb5Var, Object obj, boolean z) {
        if (!z) {
            this.c.beginObject();
        }
        wb5Var.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }
}
