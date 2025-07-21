package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class oq1 {

    public static final class a extends oq1 {
        public final int a;

        public a(int i) {
            super(null);
            this.a = i;
            if (i <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return String.valueOf(this.a);
        }
    }

    public static final class b extends oq1 {
        public static final b a = new b();

        private b() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ oq1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private oq1() {
    }
}
