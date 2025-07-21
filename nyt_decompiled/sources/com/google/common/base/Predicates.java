package com.google.common.base;

import defpackage.b16;
import defpackage.i16;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class Predicates {

    private static class AndPredicate<T> implements i16, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends i16> components;

        @Override // defpackage.i16
        public boolean apply(Object obj) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!this.components.get(i).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.e("and", this.components);
        }

        private AndPredicate(List list) {
            this.components = list;
        }
    }

    enum ObjectPredicate implements i16 {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicates.ObjectPredicate, defpackage.i16
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicates.ObjectPredicate, defpackage.i16
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicates.ObjectPredicate, defpackage.i16
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicates.ObjectPredicate, defpackage.i16
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        @Override // defpackage.i16
        public abstract /* synthetic */ boolean apply(Object obj);

        <T> i16 withNarrowedType() {
            return this;
        }
    }

    public static i16 b(i16 i16Var, i16 i16Var2) {
        return new AndPredicate(c((i16) b16.k(i16Var), (i16) b16.k(i16Var2)));
    }

    private static List c(i16 i16Var, i16 i16Var2) {
        return Arrays.asList(i16Var, i16Var2);
    }

    public static i16 d() {
        return ObjectPredicate.NOT_NULL.withNarrowedType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
