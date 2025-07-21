package com.nytimes.android.external.cache3;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class Equivalence {

    static final class Equals extends Equivalence implements Serializable {
        static final Equals a = new Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        private Object readResolve() {
            return a;
        }

        @Override // com.nytimes.android.external.cache3.Equivalence
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.nytimes.android.external.cache3.Equivalence
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    static final class Identity extends Equivalence implements Serializable {
        static final Identity a = new Identity();
        private static final long serialVersionUID = 1;

        Identity() {
        }

        private Object readResolve() {
            return a;
        }

        @Override // com.nytimes.android.external.cache3.Equivalence
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.nytimes.android.external.cache3.Equivalence
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    public static Equivalence c() {
        return Equals.a;
    }

    public static Equivalence f() {
        return Identity.a;
    }

    protected abstract boolean a(Object obj, Object obj2);

    protected abstract int b(Object obj);

    public final boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }

    public final int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return b(obj);
    }
}
