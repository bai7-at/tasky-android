package defpackage;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.pal.g1;
import com.google.android.gms.internal.pal.h3;
import com.google.android.gms.internal.pal.t2;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t8d extends h0e {
    private static final j1e k = new j1e();
    private final Context i;
    private final t2 j;

    public t8d(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2, Context context, t2 t2Var) {
        super(kscVar, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", h3Var, i, 27);
        this.i = context;
        this.j = t2Var;
    }

    public static String d(t2 t2Var) {
        if (t2Var == null || !t2Var.x() || wvc.g(t2Var.v().u())) {
            return null;
        }
        return t2Var.v().u();
    }

    private final String e() {
        try {
            if (this.b.l() != null) {
                this.b.l().get();
            }
            g1 c = this.b.c();
            if (c == null || !c.f0()) {
                return null;
            }
            return c.q0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // defpackage.h0e
    protected final void a() {
        Boolean valueOf;
        int i;
        bua buaVar;
        AtomicReference a = k.a(this.i.getPackageName());
        synchronized (a) {
            try {
                bua buaVar2 = (bua) a.get();
                if (buaVar2 != null) {
                    if (!wvc.g(buaVar2.b)) {
                        if (!buaVar2.b.equals(QueryKeys.ENGAGED_SECONDS)) {
                            if (buaVar2.b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            buaVar = (bua) a.get();
                        }
                    }
                }
                boolean z = true;
                if (wvc.g(d(this.j))) {
                    t2 t2Var = this.j;
                    if (wvc.g(d(t2Var))) {
                        valueOf = Boolean.valueOf(t2Var != null && t2Var.w() && t2Var.u().u() == 4);
                    } else {
                        valueOf = Boolean.FALSE;
                    }
                    i = (valueOf.booleanValue() && this.b.p()) ? 4 : 3;
                } else {
                    i = 5;
                }
                if (i != 3) {
                    z = false;
                }
                Boolean valueOf2 = Boolean.valueOf(z);
                Boolean bool = (Boolean) lee.c().b(fpe.Y1);
                String c = ((Boolean) lee.c().b(fpe.X1)).booleanValue() ? c() : null;
                if (bool.booleanValue() && this.b.p() && wvc.g(c)) {
                    c = e();
                }
                bua buaVar3 = new bua((String) this.f.invoke(null, this.i, valueOf2, c));
                if (wvc.g(buaVar3.b) || buaVar3.b.equals(QueryKeys.ENGAGED_SECONDS)) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String e = e();
                        if (!wvc.g(e)) {
                            buaVar3.b = e;
                        }
                    } else if (i2 == 4) {
                        buaVar3.b = this.j.v().u();
                    }
                }
                a.set(buaVar3);
                buaVar = (bua) a.get();
            } finally {
            }
        }
        synchronized (this.e) {
            if (buaVar != null) {
                try {
                    this.e.A0(buaVar.b);
                    this.e.Q(buaVar.c);
                    this.e.T(buaVar.d);
                    this.e.j0(buaVar.e);
                    this.e.z0(buaVar.f);
                } finally {
                }
            }
        }
    }

    protected final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] i = wvc.i((String) lee.c().b(fpe.Z1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(wvc.i((String) lee.c().b(fpe.a2)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            this.b.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(QueryKeys.SCREEN_WIDTH)) {
                return null;
            }
            final faf p = faf.p();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: l2e
                public final void onChecksumsReady(List list) {
                    int type2;
                    byte[] value;
                    faf fafVar = faf.this;
                    if (list == null) {
                        fafVar.i(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ApkChecksum a = cgf.a(list.get(i2));
                            type2 = a.getType();
                            if (type2 == 8) {
                                value = a.getValue();
                                fafVar.i(wvc.c(value));
                                return;
                            }
                        }
                        fafVar.i(null);
                    } catch (Throwable unused) {
                        fafVar.i(null);
                    }
                }
            });
            return (String) p.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
