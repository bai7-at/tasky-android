package defpackage;

import android.app.Application;
import com.nytimes.android.logging.remote.LogRecorderImpl;
import com.nytimes.android.logging.remote.utils.FileIoWrapperImpl;

/* loaded from: classes4.dex */
public final class tx6 {
    public static final tx6 a = new tx6();

    private tx6() {
    }

    public final ie2 a(Application application) {
        zq3.h(application, "application");
        return new FileIoWrapperImpl(application);
    }

    public final v84 b(ie2 ie2Var) {
        zq3.h(ie2Var, "fileIoWrapper");
        return new LogRecorderImpl(null, null, ie2Var, 3, null);
    }

    public final le2 c(v84 v84Var) {
        zq3.h(v84Var, "logRecorder");
        return new le2(v84Var);
    }

    public final g17 d(t05 t05Var) {
        zq3.h(t05Var, "androidJobProxy");
        return new h17(t05Var);
    }
}
