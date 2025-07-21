package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.s11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class t11 {
    private static final Map e;
    static final String f;
    private final Context a;
    private final df3 b;
    private final fl c;
    private final f08 d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.10");
    }

    public t11(Context context, df3 df3Var, fl flVar, f08 f08Var) {
        this.a = context;
        this.b = df3Var;
        this.c = flVar;
        this.d = f08Var;
    }

    private s11.b a() {
        return s11.b().h("18.2.10").d(this.c.a).e(this.b.a()).b(this.c.e).c(this.c.f).g(4);
    }

    private static int e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private s11.e.d.a.b.AbstractC0524a f() {
        return s11.e.d.a.b.AbstractC0524a.a().b(0L).d(0L).c(this.c.d).e(this.c.b).a();
    }

    private nh3 g() {
        return nh3.c(f());
    }

    private s11.e.d.a h(int i, s11.a aVar) {
        return s11.e.d.a.a().b(Boolean.valueOf(aVar.b() != 100)).f(i).d(m(aVar)).a();
    }

    private s11.e.d.a i(int i, ct8 ct8Var, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j = CommonUtils.j(this.c.d, this.a);
        if (j != null) {
            bool = Boolean.valueOf(j.importance != 100);
        } else {
            bool = null;
        }
        return s11.e.d.a.a().b(bool).f(i).d(n(ct8Var, thread, i2, i3, z)).a();
    }

    private s11.e.d.c j(int i) {
        c70 a = c70.a(this.a);
        Float b = a.b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.c();
        boolean o = CommonUtils.o(this.a);
        return s11.e.d.c.a().b(valueOf).c(c).f(o).e(i).g(CommonUtils.s() - CommonUtils.a(this.a)).d(CommonUtils.b(Environment.getDataDirectory().getPath())).a();
    }

    private s11.e.d.a.b.c k(ct8 ct8Var, int i, int i2) {
        return l(ct8Var, i, i2, 0);
    }

    private s11.e.d.a.b.c l(ct8 ct8Var, int i, int i2, int i3) {
        String str = ct8Var.b;
        String str2 = ct8Var.a;
        StackTraceElement[] stackTraceElementArr = ct8Var.c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ct8 ct8Var2 = ct8Var.d;
        if (i3 >= i2) {
            ct8 ct8Var3 = ct8Var2;
            while (ct8Var3 != null) {
                ct8Var3 = ct8Var3.d;
                i4++;
            }
        }
        s11.e.d.a.b.c.AbstractC0527a d = s11.e.d.a.b.c.a().f(str).e(str2).c(nh3.a(p(stackTraceElementArr, i))).d(i4);
        if (ct8Var2 != null && i4 == 0) {
            d.b(l(ct8Var2, i, i2, i3 + 1));
        }
        return d.a();
    }

    private s11.e.d.a.b m(s11.a aVar) {
        return s11.e.d.a.b.a().b(aVar).e(u()).c(g()).a();
    }

    private s11.e.d.a.b n(ct8 ct8Var, Thread thread, int i, int i2, boolean z) {
        return s11.e.d.a.b.a().f(x(ct8Var, thread, i, z)).d(k(ct8Var, i, i2)).e(u()).c(g()).a();
    }

    private s11.e.d.a.b.AbstractC0530e.AbstractC0532b o(StackTraceElement stackTraceElement, s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a abstractC0533a) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + InstructionFileId.DOT + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = stackTraceElement.getLineNumber();
        }
        return abstractC0533a.e(max).f(str).b(fileName).d(j).a();
    }

    private nh3 p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(o(stackTraceElement, s11.e.d.a.b.AbstractC0530e.AbstractC0532b.a().c(i)));
        }
        return nh3.a(arrayList);
    }

    private s11.e.a q() {
        return s11.e.a.a().e(this.b.f()).g(this.c.e).d(this.c.f).f(this.b.a()).b(this.c.g.d()).c(this.c.g.e()).a();
    }

    private s11.e r(String str, long j) {
        return s11.e.a().l(j).i(str).g(f).b(q()).k(t()).d(s()).h(3).a();
    }

    private s11.e.c s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e2 = e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = CommonUtils.s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean y = CommonUtils.y(this.a);
        int m = CommonUtils.m(this.a);
        return s11.e.c.a().b(e2).f(Build.MODEL).c(availableProcessors).h(s).d(blockCount).i(y).j(m).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private s11.e.AbstractC0535e t() {
        return s11.e.AbstractC0535e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(CommonUtils.z(this.a)).a();
    }

    private s11.e.d.a.b.AbstractC0528d u() {
        return s11.e.d.a.b.AbstractC0528d.a().d("0").c("0").b(0L).a();
    }

    private s11.e.d.a.b.AbstractC0530e v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return w(thread, stackTraceElementArr, 0);
    }

    private s11.e.d.a.b.AbstractC0530e w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return s11.e.d.a.b.AbstractC0530e.a().d(thread.getName()).c(i).b(nh3.a(p(stackTraceElementArr, i))).a();
    }

    private nh3 x(ct8 ct8Var, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(w(thread, ct8Var.c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(v(key, this.d.a(entry.getValue())));
                }
            }
        }
        return nh3.a(arrayList);
    }

    public s11.e.d b(s11.a aVar) {
        int i = this.a.getResources().getConfiguration().orientation;
        return s11.e.d.a().f("anr").e(aVar.h()).b(h(i, aVar)).c(j(i)).a();
    }

    public s11.e.d c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.a.getResources().getConfiguration().orientation;
        return s11.e.d.a().f(str).e(j).b(i(i3, new ct8(th, this.d), thread, i, i2, z)).c(j(i3)).a();
    }

    public s11 d(String str, long j) {
        return a().i(r(str, j)).a();
    }
}
