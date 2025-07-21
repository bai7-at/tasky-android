package rx.exceptions;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.e62;
import defpackage.r47;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        private static final class a {
            static final Set a = a();

            private static Set a() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + b(obj));
            this.value = obj;
        }

        static String b(Object obj) {
            if (obj == null) {
                return Constants.NULL_VERSION_ID;
            }
            if (a.a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String b = r47.b().a().b(obj);
            if (b != null) {
                return b;
            }
            return obj.getClass().getName() + ".class";
        }

        public Object a() {
            return this.value;
        }
    }

    public static Throwable a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable b = e62.b(th);
        if (b != null && (b instanceof OnNextValue) && ((OnNextValue) b).a() == obj) {
            return th;
        }
        e62.a(th, new OnNextValue(obj));
        return th;
    }
}
