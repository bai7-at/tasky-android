package defpackage;

import androidx.compose.animation.core.RepeatMode;
import com.comscore.streaming.ContentFeedType;
import defpackage.ww3;

/* loaded from: classes.dex */
public abstract class di {
    /* JADX INFO: Access modifiers changed from: private */
    public static final mi b(hu8 hu8Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (mi) hu8Var.a().invoke(obj);
    }

    public static final oj3 c(sw1 sw1Var, RepeatMode repeatMode, long j) {
        return new oj3(sw1Var, repeatMode, j, null);
    }

    public static /* synthetic */ oj3 d(sw1 sw1Var, RepeatMode repeatMode, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = l08.c(0, 0, 2, null);
        }
        return c(sw1Var, repeatMode, j);
    }

    public static final ww3 e(ss2 ss2Var) {
        ww3.b bVar = new ww3.b();
        ss2Var.invoke(bVar);
        return new ww3(bVar);
    }

    public static final gw7 f(int i) {
        return new gw7(i);
    }

    public static /* synthetic */ gw7 g(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return f(i);
    }

    public static final qz7 h(float f, float f2, Object obj) {
        return new qz7(f, f2, obj);
    }

    public static /* synthetic */ qz7 i(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return h(f, f2, obj);
    }

    public static final eu8 j(int i, int i2, vx1 vx1Var) {
        return new eu8(i, i2, vx1Var);
    }

    public static /* synthetic */ eu8 k(int i, int i2, vx1 vx1Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ContentFeedType.OTHER;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            vx1Var = xx1.c();
        }
        return j(i, i2, vx1Var);
    }
}
