package defpackage;

import android.os.Build;

/* loaded from: classes2.dex */
public interface be0 {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final be0 b = new C0128a();

        /* renamed from: be0$a$a, reason: collision with other inner class name */
        public static final class C0128a implements be0 {
            private final int b = Build.VERSION.SDK_INT;

            C0128a() {
            }

            @Override // defpackage.be0
            public int getVersion() {
                return this.b;
            }
        }

        private a() {
        }

        public final be0 a() {
            return b;
        }
    }

    int getVersion();
}
