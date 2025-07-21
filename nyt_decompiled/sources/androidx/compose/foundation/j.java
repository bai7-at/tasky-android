package androidx.compose.foundation;

import android.view.View;
import defpackage.fm1;
import defpackage.ru5;
import defpackage.tu5;

/* loaded from: classes.dex */
public interface j {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final j a() {
            if (Magnifier_androidKt.c(0, 1, null)) {
                return tu5.b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    boolean a();

    ru5 b(View view, boolean z, long j, float f, float f2, boolean z2, fm1 fm1Var, float f3);
}
