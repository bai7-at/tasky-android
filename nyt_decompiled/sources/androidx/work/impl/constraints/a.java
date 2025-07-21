package androidx.work.impl.constraints;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.work.impl.constraints.a$a, reason: collision with other inner class name */
    public static final class C0124a extends a {
        public static final C0124a a = new C0124a();

        private C0124a() {
            super(null);
        }
    }

    public static final class b extends a {
        private final int a;

        public b(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.a + ')';
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
