package androidx.compose.ui.layout;

import defpackage.na7;
import defpackage.rw0;
import defpackage.uj2;
import defpackage.zt7;

/* loaded from: classes.dex */
public interface ContentScale {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final ContentScale b = new C0059a();
        private static final ContentScale c = new e();
        private static final ContentScale d = new c();
        private static final ContentScale e = new d();
        private static final ContentScale f = new f();
        private static final uj2 g = new uj2(1.0f);
        private static final ContentScale h = new b();

        /* renamed from: androidx.compose.ui.layout.ContentScale$a$a, reason: collision with other inner class name */
        public static final class C0059a implements ContentScale {
            C0059a() {
            }

            @Override // androidx.compose.ui.layout.ContentScale
            public long a(long j, long j2) {
                float f;
                f = rw0.f(j, j2);
                return na7.a(f, f);
            }
        }

        public static final class b implements ContentScale {
            b() {
            }

            @Override // androidx.compose.ui.layout.ContentScale
            public long a(long j, long j2) {
                float h;
                float e;
                h = rw0.h(j, j2);
                e = rw0.e(j, j2);
                return na7.a(h, e);
            }
        }

        public static final class c implements ContentScale {
            c() {
            }

            @Override // androidx.compose.ui.layout.ContentScale
            public long a(long j, long j2) {
                float e;
                e = rw0.e(j, j2);
                return na7.a(e, e);
            }
        }

        public static final class d implements ContentScale {
            d() {
            }

            @Override // androidx.compose.ui.layout.ContentScale
            public long a(long j, long j2) {
                float h;
                h = rw0.h(j, j2);
                return na7.a(h, h);
            }
        }

        public static final class e implements ContentScale {
            e() {
            }

            @Override // androidx.compose.ui.layout.ContentScale
            public long a(long j, long j2) {
                float g;
                g = rw0.g(j, j2);
                return na7.a(g, g);
            }
        }

        public static final class f implements ContentScale {
            f() {
            }

            @Override // androidx.compose.ui.layout.ContentScale
            public long a(long j, long j2) {
                float g;
                if (zt7.i(j) <= zt7.i(j2) && zt7.g(j) <= zt7.g(j2)) {
                    return na7.a(1.0f, 1.0f);
                }
                g = rw0.g(j, j2);
                return na7.a(g, g);
            }
        }

        private a() {
        }

        public final ContentScale a() {
            return b;
        }

        public final ContentScale b() {
            return h;
        }

        public final ContentScale c() {
            return d;
        }

        public final ContentScale d() {
            return e;
        }

        public final ContentScale e() {
            return c;
        }

        public final ContentScale f() {
            return f;
        }

        public final uj2 g() {
            return g;
        }
    }

    long a(long j, long j2);
}
