package defpackage;

import com.datadog.android.Datadog;
import com.datadog.android.log.internal.LogsFeature;

/* loaded from: classes2.dex */
public final class ra4 {
    public static final ra4 a = new ra4();

    private ra4() {
    }

    public static final void a(sa4 sa4Var, vc7 vc7Var) {
        zq3.h(sa4Var, "logsConfiguration");
        zq3.h(vc7Var, "sdkCore");
        jb2 jb2Var = (jb2) vc7Var;
        jb2Var.j(new LogsFeature(jb2Var, sa4Var.a(), sa4Var.b()));
    }

    public static /* synthetic */ void b(sa4 sa4Var, vc7 vc7Var, int i, Object obj) {
        if ((i & 2) != 0) {
            vc7Var = Datadog.b(null, 1, null);
        }
        a(sa4Var, vc7Var);
    }
}
