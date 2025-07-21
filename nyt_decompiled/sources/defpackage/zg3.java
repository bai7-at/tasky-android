package defpackage;

import android.content.Context;
import defpackage.yg3;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class zg3 {
    public static final yg3 a(sd0 sd0Var, Context context) {
        return new rx7(sd0Var, s.m(context), null);
    }

    public static final yg3 b(sd0 sd0Var, Context context, yg3.a aVar) {
        return new rx7(sd0Var, s.m(context), aVar);
    }

    public static final yg3 c(jp5 jp5Var, we2 we2Var, String str, Closeable closeable) {
        return new he2(jp5Var, we2Var, str, closeable, null);
    }

    public static /* synthetic */ yg3 d(jp5 jp5Var, we2 we2Var, String str, Closeable closeable, int i, Object obj) {
        if ((i & 2) != 0) {
            we2Var = we2.b;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        return c(jp5Var, we2Var, str, closeable);
    }
}
