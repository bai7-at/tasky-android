package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.d2;
import com.google.android.gms.internal.ads.f2;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class ace {
    private static final Object f = new Object();
    private final Context a;
    private final SharedPreferences b;
    private final String c;
    private final qbe d;
    private boolean e;

    public ace(Context context, int i, qbe qbeVar, boolean z) {
        this.e = false;
        this.a = context;
        this.c = Integer.toString(i - 1);
        this.b = context.getSharedPreferences("pcvmspf", 0);
        this.d = qbeVar;
        this.e = z;
    }

    private final File e(String str) {
        return new File(new File(this.a.getDir("pccache", 0), this.c), str);
    }

    private static String f(d2 d2Var) {
        f2 O = g2.O();
        O.r(d2Var.N().U());
        O.n(d2Var.N().T());
        O.o(d2Var.N().L());
        O.q(d2Var.N().N());
        O.p(d2Var.N().M());
        return Hex.bytesToStringLowercase(((g2) O.i()).i());
    }

    private final String g() {
        return "FBAMTD".concat(String.valueOf(this.c));
    }

    private final String h() {
        return "LATMTD".concat(String.valueOf(this.c));
    }

    private final void i(int i, long j) {
        this.d.zza(i, j);
    }

    private final void j(int i, long j, String str) {
        this.d.zzb(i, j, str);
    }

    private final g2 k(int i) {
        String string = i == 1 ? this.b.getString(h(), null) : this.b.getString(g(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgyl zzgylVar = zzgyl.a;
            return g2.S(zzgyl.D(stringToBytes, 0, stringToBytes.length), this.e ? ph.a() : ph.b());
        } catch (zzhag unused) {
            return null;
        } catch (NullPointerException unused2) {
            this.i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            this.i(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean a(d2 d2Var) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                if (!ybe.e(new File(e(d2Var.N().U()), "pcbc"), d2Var.O().a())) {
                    i(4020, currentTimeMillis);
                    return false;
                }
                String f2 = f(d2Var);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString(h(), f2);
                boolean commit = edit.commit();
                if (commit) {
                    i(5015, currentTimeMillis);
                } else {
                    i(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(d2 d2Var, zbe zbeVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                g2 k = k(1);
                String U = d2Var.N().U();
                if (k != null && k.U().equals(U)) {
                    i(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File e = e(U);
                if (e.exists()) {
                    boolean isDirectory = e.isDirectory();
                    String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != isDirectory) {
                        str = "0";
                    }
                    boolean isFile = e.isFile();
                    String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != isFile) {
                        str2 = "0";
                    }
                    j(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                    i(4015, currentTimeMillis2);
                } else if (!e.mkdirs()) {
                    boolean canWrite = e.canWrite();
                    String str3 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != canWrite) {
                        str3 = "0";
                    }
                    j(4024, currentTimeMillis2, "cw:".concat(str3));
                    i(4015, currentTimeMillis2);
                    return false;
                }
                File e2 = e(U);
                File file = new File(e2, "pcam.jar");
                File file2 = new File(e2, "pcbc");
                if (!ybe.e(file, d2Var.P().a())) {
                    i(4016, currentTimeMillis);
                    return false;
                }
                if (!ybe.e(file2, d2Var.O().a())) {
                    i(4017, currentTimeMillis);
                    return false;
                }
                if (zbeVar != null && !zbeVar.zza(file)) {
                    i(4018, currentTimeMillis);
                    ybe.d(e2);
                    return false;
                }
                String f2 = f(d2Var);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.b.getString(h(), null);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString(h(), f2);
                if (string != null) {
                    edit.putString(g(), string);
                }
                if (!edit.commit()) {
                    i(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                g2 k2 = k(1);
                if (k2 != null) {
                    hashSet.add(k2.U());
                }
                g2 k3 = k(2);
                if (k3 != null) {
                    hashSet.add(k3.U());
                }
                for (File file3 : new File(this.a.getDir("pccache", 0), this.c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        ybe.d(file3);
                    }
                }
                i(5014, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wbe c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                g2 k = k(1);
                if (k == null) {
                    i(4022, currentTimeMillis);
                    return null;
                }
                File e = e(k.U());
                File file = new File(e, "pcam.jar");
                if (!file.exists()) {
                    file = new File(e, "pcam");
                }
                File file2 = new File(e, "pcbc");
                File file3 = new File(e, "pcopt");
                i(5016, currentTimeMillis);
                return new wbe(k, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                g2 k = k(1);
                if (k == null) {
                    i(4025, currentTimeMillis);
                    return false;
                }
                File e = e(k.U());
                if (!new File(e, "pcam.jar").exists()) {
                    i(4026, currentTimeMillis);
                    return false;
                }
                if (new File(e, "pcbc").exists()) {
                    i(5019, currentTimeMillis);
                    return true;
                }
                i(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
