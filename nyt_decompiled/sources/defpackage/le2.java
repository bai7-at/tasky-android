package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.logging.remote.models.Priority;

/* loaded from: classes4.dex */
public final class le2 implements i05 {
    private final v84 a;

    public le2(v84 v84Var) {
        zq3.h(v84Var, "logRecorder");
        this.a = v84Var;
    }

    @Override // defpackage.i05
    public void a(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.DEBUG, str, th);
    }

    @Override // defpackage.i05
    public void b(Throwable th, String str) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        this.a.b(Priority.REPORT, str, th);
    }

    @Override // defpackage.i05
    public void c(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.INFO, str, null);
    }

    @Override // defpackage.i05
    public void d(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.DEBUG, str, null);
    }

    @Override // defpackage.i05
    public void e(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.INFO, str, th);
    }

    @Override // defpackage.i05
    public void f(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.VERBOSE, str, null);
    }

    @Override // defpackage.i05
    public void g(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.ERROR, str, null);
    }

    @Override // defpackage.i05
    public void h(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.WARN, str, null);
    }

    @Override // defpackage.i05
    public void i(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.ERROR, str, th);
    }

    @Override // defpackage.i05
    public void j(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        this.a.b(Priority.WARN, str, th);
    }
}
