package defpackage;

import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.s11;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class ul7 {
    private final t11 a;
    private final f21 b;
    private final ja1 c;
    private final e84 d;
    private final p09 e;

    ul7(t11 t11Var, f21 f21Var, ja1 ja1Var, e84 e84Var, p09 p09Var) {
        this.a = t11Var;
        this.b = f21Var;
        this.c = ja1Var;
        this.d = e84Var;
        this.e = p09Var;
    }

    private s11.e.d c(s11.e.d dVar) {
        return d(dVar, this.d, this.e);
    }

    private s11.e.d d(s11.e.d dVar, e84 e84Var, p09 p09Var) {
        s11.e.d.b g = dVar.g();
        String c = e84Var.c();
        if (c != null) {
            g.d(s11.e.d.AbstractC0534d.a().b(c).a());
        } else {
            m94.f().i("No log data to include with this event.");
        }
        List k = k(p09Var.e());
        List k2 = k(p09Var.f());
        if (!k.isEmpty() || !k2.isEmpty()) {
            g.b(dVar.b().g().c(nh3.a(k)).e(nh3.a(k2)).a());
        }
        return g.a();
    }

    private static s11.a e(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e) {
            m94 f = m94.f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e);
            f.k(sb.toString());
        }
        s11.a.AbstractC0521a a = s11.a.a();
        importance = applicationExitInfo.getImportance();
        s11.a.AbstractC0521a b = a.b(importance);
        processName = applicationExitInfo.getProcessName();
        s11.a.AbstractC0521a d = b.d(processName);
        reason = applicationExitInfo.getReason();
        s11.a.AbstractC0521a f2 = d.f(reason);
        timestamp = applicationExitInfo.getTimestamp();
        s11.a.AbstractC0521a h = f2.h(timestamp);
        pid = applicationExitInfo.getPid();
        s11.a.AbstractC0521a c = h.c(pid);
        pss = applicationExitInfo.getPss();
        s11.a.AbstractC0521a e2 = c.e(pss);
        rss = applicationExitInfo.getRss();
        return e2.g(rss).i(str).a();
    }

    public static String f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static ul7 g(Context context, df3 df3Var, ue2 ue2Var, fl flVar, e84 e84Var, p09 p09Var, f08 f08Var, pn7 pn7Var, qe5 qe5Var) {
        return new ul7(new t11(context, df3Var, flVar, f08Var), new f21(ue2Var, pn7Var), ja1.b(context, pn7Var, qe5Var), e84Var, p09Var);
    }

    private ApplicationExitInfo j(String str, List list) {
        long timestamp;
        int reason;
        long q = this.b.q(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ApplicationExitInfo a = ro2.a(it2.next());
            timestamp = a.getTimestamp();
            if (timestamp < q) {
                return null;
            }
            reason = a.getReason();
            if (reason == 6) {
                return a;
            }
        }
        return null;
    }

    private static List k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(s11.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: sl7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m;
                m = ul7.m((s11.c) obj, (s11.c) obj2);
                return m;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int m(s11.c cVar, s11.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(og8 og8Var) {
        if (!og8Var.q()) {
            m94.f().l("Crashlytics report could not be enqueued to DataTransport", og8Var.l());
            return false;
        }
        g21 g21Var = (g21) og8Var.m();
        m94.f().b("Crashlytics report successfully enqueued to DataTransport: " + g21Var.d());
        File c = g21Var.c();
        if (c.delete()) {
            m94.f().b("Deleted report file: " + c.getPath());
            return true;
        }
        m94.f().k("Crashlytics could not delete report file: " + c.getPath());
        return true;
    }

    private void q(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.b.y(c(this.a.c(th, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    public void h(String str, List list) {
        m94.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            s11.d.b i = ((d25) it2.next()).i();
            if (i != null) {
                arrayList.add(i);
            }
        }
        this.b.l(str, s11.d.a().b(nh3.a(arrayList)).a());
    }

    public void i(long j, String str) {
        this.b.k(str, j);
    }

    public boolean l() {
        return this.b.r();
    }

    public SortedSet n() {
        return this.b.p();
    }

    public void o(String str, long j) {
        this.b.z(this.a.d(str, j));
    }

    public void r(Throwable th, Thread thread, String str, long j) {
        m94.f().i("Persisting fatal event for session " + str);
        q(th, thread, str, "crash", j, true);
    }

    public void s(Throwable th, Thread thread, String str, long j) {
        m94.f().i("Persisting non-fatal event for session " + str);
        q(th, thread, str, "error", j, false);
    }

    public void t(String str, List list, e84 e84Var, p09 p09Var) {
        ApplicationExitInfo j = j(str, list);
        if (j == null) {
            m94.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        s11.e.d b = this.a.b(e(j));
        m94.f().b("Persisting anr for session " + str);
        this.b.y(d(b, e84Var, p09Var), str, true);
    }

    public void u() {
        this.b.i();
    }

    public og8 v(Executor executor) {
        return w(executor, null);
    }

    public og8 w(Executor executor, String str) {
        List<g21> w = this.b.w();
        ArrayList arrayList = new ArrayList();
        for (g21 g21Var : w) {
            if (str == null || str.equals(g21Var.d())) {
                arrayList.add(this.c.c(g21Var, str != null).i(executor, new cy0() { // from class: tl7
                    @Override // defpackage.cy0
                    public final Object then(og8 og8Var) {
                        boolean p;
                        p = ul7.this.p(og8Var);
                        return Boolean.valueOf(p);
                    }
                }));
            }
        }
        return vg8.f(arrayList);
    }
}
