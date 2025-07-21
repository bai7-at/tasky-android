package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class fw6 implements i05 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final r94 a;
    private ss2 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public fw6(r94 r94Var) {
        zq3.h(r94Var, "logParser");
        this.a = r94Var;
    }

    private final void k(int i, String str, Throwable th, Object... objArr) {
        ss2 ss2Var = this.b;
        if (ss2Var != null) {
            ss2Var.invoke(this.a.a(i, str, th, objArr));
        }
    }

    static /* synthetic */ void l(fw6 fw6Var, int i, String str, Throwable th, Object[] objArr, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        fw6Var.k(i, str, th, objArr);
    }

    @Override // defpackage.i05
    public void a(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        k(3, str, th, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void b(Throwable th, String str) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        k(8, str, th, new Object[0]);
    }

    @Override // defpackage.i05
    public void c(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        l(this, 4, str, null, Arrays.copyOf(objArr, objArr.length), 4, null);
    }

    @Override // defpackage.i05
    public void d(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        l(this, 3, str, null, Arrays.copyOf(objArr, objArr.length), 4, null);
    }

    @Override // defpackage.i05
    public void e(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        k(4, str, th, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void f(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        l(this, 2, str, null, Arrays.copyOf(objArr, objArr.length), 4, null);
    }

    @Override // defpackage.i05
    public void g(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        l(this, 7, str, null, Arrays.copyOf(objArr, objArr.length), 4, null);
    }

    @Override // defpackage.i05
    public void h(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        l(this, 5, str, null, Arrays.copyOf(objArr, objArr.length), 4, null);
    }

    @Override // defpackage.i05
    public void i(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        k(6, str, th, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void j(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        k(5, str, th, Arrays.copyOf(objArr, objArr.length));
    }

    public final void m(ss2 ss2Var) {
        this.b = ss2Var;
    }
}
