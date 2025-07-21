package com.nytimes.android.external.cache3;

import defpackage.e16;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: com.nytimes.android.external.cache3.b$b, reason: collision with other inner class name */
    public static final class C0267b {
        private final String a;
        private a b;
        private a c;
        private boolean d;

        /* renamed from: com.nytimes.android.external.cache3.b$b$a */
        private static final class a {
            String a;
            Object b;
            a c;

            private a() {
            }
        }

        private a d() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        private C0267b e(Object obj) {
            d().b = obj;
            return this;
        }

        private C0267b f(String str, Object obj) {
            a d = d();
            d.b = obj;
            d.a = (String) e16.d(str);
            return this;
        }

        public C0267b a(String str, int i) {
            return f(str, String.valueOf(i));
        }

        public C0267b b(String str, long j) {
            return f(str, String.valueOf(j));
        }

        public C0267b c(String str, Object obj) {
            return f(str, obj);
        }

        public C0267b g(Object obj) {
            return e(obj);
        }

        public String toString() {
            boolean z = this.d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String str = "";
            for (a aVar = this.b.c; aVar != null; aVar = aVar.c) {
                Object obj = aVar.b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString.substring(1, deepToString.length() - 1));
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C0267b(String str) {
            a aVar = new a();
            this.b = aVar;
            this.c = aVar;
            this.d = false;
            this.a = (String) e16.d(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        return obj != null ? obj : e16.d(obj2);
    }

    public static C0267b b(Object obj) {
        return new C0267b(obj.getClass().getSimpleName());
    }
}
