package defpackage;

import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class zf8 {
    public static final a b = new a(null);
    public static final zf8 c = new zf8(t.i());
    private final Map a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zf8 a(Map map) {
            return new zf8(e.b(map), null);
        }

        private a() {
        }
    }

    public /* synthetic */ zf8(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zf8) && zq3.c(this.a, ((zf8) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.a + ')';
    }

    private zf8(Map map) {
        this.a = map;
    }
}
