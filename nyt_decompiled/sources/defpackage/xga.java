package defpackage;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.n0;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.nc;
import com.google.android.gms.internal.ads.u0;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class xga extends cia {
    private static final dia j = new dia();
    private final Context i;

    public xga(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, Context context, n0 n0Var) {
        super(jgaVar, "CbnHJiUmcb7bV3nHtVfkQJESWUzuF9spYS2HkpVPEQ4sOQCQUFomcsL6vpMTm+JY", "m4BHDSYRnsEEIrYlgM0yy1C5NfyYnIIeJvwgjuCY5HY=", u0Var, i, 27);
        this.i = context;
    }

    private final String d() {
        try {
            if (this.b.l() != null) {
                this.b.l().get();
            }
            n1 c = this.b.c();
            if (c == null || !c.v0()) {
                return null;
            }
            return c.L0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // defpackage.cia
    protected final void a() {
        int i;
        jda jdaVar;
        AtomicReference a = j.a(this.i.getPackageName());
        synchronized (a) {
            try {
                jda jdaVar2 = (jda) a.get();
                if (jdaVar2 != null) {
                    if (!mga.d(jdaVar2.b)) {
                        if (!jdaVar2.b.equals(QueryKeys.ENGAGED_SECONDS)) {
                            if (jdaVar2.b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            jdaVar = (jda) a.get();
                        }
                    }
                }
                if (mga.d(null)) {
                    mga.d(null);
                    i = 3;
                } else {
                    i = 5;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) pla.c().a(mpa.m2);
                String c = ((Boolean) pla.c().a(mpa.l2)).booleanValue() ? c() : null;
                if (bool.booleanValue() && this.b.p() && mga.d(c)) {
                    c = d();
                }
                jda jdaVar3 = new jda((String) this.f.invoke(null, this.i, valueOf, c));
                if (mga.d(jdaVar3.b) || jdaVar3.b.equals(QueryKeys.ENGAGED_SECONDS)) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String d = d();
                        if (!mga.d(d)) {
                            jdaVar3.b = d;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                a.set(jdaVar3);
                jdaVar = (jda) a.get();
            } finally {
            }
        }
        synchronized (this.e) {
            if (jdaVar != null) {
                try {
                    this.e.x0(jdaVar.b);
                    this.e.M(jdaVar.c);
                    this.e.O(jdaVar.d);
                    this.e.g0(jdaVar.e);
                    this.e.w0(jdaVar.f);
                } finally {
                }
            }
        }
    }

    protected final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] f = mga.f((String) pla.c().a(mpa.n2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(f)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(mga.f((String) pla.c().a(mpa.o2)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            this.b.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(QueryKeys.SCREEN_WIDTH)) {
                return null;
            }
            final nc C = nc.C();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: eia
                public final void onChecksumsReady(List list) {
                    int type2;
                    byte[] value;
                    nc ncVar = nc.this;
                    if (list == null) {
                        ncVar.f(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum a = cgf.a(list.get(i));
                            type2 = a.getType();
                            if (type2 == 8) {
                                value = a.getValue();
                                ncVar.f(mga.b(value));
                                return;
                            }
                        }
                        ncVar.f(null);
                    } catch (Throwable unused) {
                        ncVar.f(null);
                    }
                }
            });
            return (String) C.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
