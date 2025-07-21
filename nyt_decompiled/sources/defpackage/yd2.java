package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yd2 {
    private final String a;
    private final Map b;

    public static final class b {
        private final String a;
        private Map b = null;

        b(String str) {
            this.a = str;
        }

        public yd2 a() {
            return new yd2(this.a, this.b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.b)));
        }

        public b b(Annotation annotation) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static yd2 d(String str) {
        return new yd2(str, Collections.emptyMap());
    }

    public String b() {
        return this.a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd2)) {
            return false;
        }
        yd2 yd2Var = (yd2) obj;
        return this.a.equals(yd2Var.a) && this.b.equals(yd2Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }

    private yd2(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
