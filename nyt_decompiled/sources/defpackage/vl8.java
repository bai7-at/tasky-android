package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class vl8 implements i05 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // defpackage.i05
    public void a(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.c(th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void b(Throwable th, String str) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        ul8.a.r(8, th, str, new Object[0]);
    }

    @Override // defpackage.i05
    public void c(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.l(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void d(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.a(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void e(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.m(th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void f(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.t(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void g(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.d(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void h(String str, Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.u(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void i(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.f(th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.i05
    public void j(Throwable th, String str, Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        ul8.a.v(th, str, Arrays.copyOf(objArr, objArr.length));
    }
}
