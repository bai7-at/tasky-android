package defpackage;

import com.google.common.base.Optional;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class sv4 {

    public static final class b {
        private final String a;
        private final C0538b b;
        private C0538b c;
        private boolean d;
        private boolean e;

        private static final class a extends C0538b {
            private a() {
                super();
            }
        }

        /* renamed from: sv4$b$b, reason: collision with other inner class name */
        private static class C0538b {
            String a;
            Object b;
            C0538b c;

            private C0538b() {
            }
        }

        private C0538b c() {
            C0538b c0538b = new C0538b();
            this.c.c = c0538b;
            this.c = c0538b;
            return c0538b;
        }

        private b d(String str, Object obj) {
            C0538b c = c();
            c.b = obj;
            c.a = (String) b16.k(str);
            return this;
        }

        private a e() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        private b f(String str, Object obj) {
            a e = e();
            e.b = obj;
            e.a = (String) b16.k(str);
            return this;
        }

        private static boolean g(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof Optional ? !((Optional) obj).d() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, Object obj) {
            return d(str, obj);
        }

        public b b(String str, boolean z) {
            return f(str, String.valueOf(z));
        }

        public b h() {
            this.d = true;
            return this;
        }

        public String toString() {
            boolean z = this.d;
            boolean z2 = this.e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String str = "";
            for (C0538b c0538b = this.b.c; c0538b != null; c0538b = c0538b.c) {
                Object obj = c0538b.b;
                if (!(c0538b instanceof a)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && g(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c0538b.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        private b(String str) {
            C0538b c0538b = new C0538b();
            this.b = c0538b;
            this.c = c0538b;
            this.d = false;
            this.e = false;
            this.a = (String) b16.k(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(String str) {
        return new b(str);
    }
}
