package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import defpackage.yu4;

/* loaded from: classes2.dex */
public class zw8 implements yu4 {
    private static final zw8 a = new zw8();

    public static class a implements zu4 {
        private static final a a = new a();

        public static a a() {
            return a;
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return zw8.c();
        }
    }

    private static class b implements k91 {
        private final Object a;

        b(Object obj) {
            this.a = obj;
        }

        @Override // defpackage.k91
        public Class a() {
            return this.a.getClass();
        }

        @Override // defpackage.k91
        public void b() {
        }

        @Override // defpackage.k91
        public void cancel() {
        }

        @Override // defpackage.k91
        public void d(Priority priority, k91.a aVar) {
            aVar.f(this.a);
        }

        @Override // defpackage.k91
        public DataSource e() {
            return DataSource.LOCAL;
        }
    }

    public static zw8 c() {
        return a;
    }

    @Override // defpackage.yu4
    public yu4.a a(Object obj, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(obj), new b(obj));
    }

    @Override // defpackage.yu4
    public boolean b(Object obj) {
        return true;
    }
}
