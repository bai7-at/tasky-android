package defpackage;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.n3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ina {
    private final ona a;
    private final m3 b;
    private final boolean c;

    private ina() {
        this.b = n3.N();
        this.c = false;
        this.a = new ona();
    }

    public static ina a() {
        return new ina();
    }

    private final synchronized String d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.b.x(), Long.valueOf(dyf.b().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((n3) this.b.i()).i(), 3));
    }

    private final synchronized void e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(d(i).getBytes());
                } catch (IOException unused) {
                    pzc.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        pzc.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    pzc.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            pzc.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void f(int i) {
        m3 m3Var = this.b;
        m3Var.q();
        m3Var.p(wxf.F());
        nna nnaVar = new nna(this.a, ((n3) this.b.i()).i(), null);
        int i2 = i - 1;
        nnaVar.a(i2);
        nnaVar.c();
        pzc.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void b(hna hnaVar) {
        if (this.c) {
            try {
                hnaVar.a(this.b);
            } catch (NullPointerException e) {
                dyf.q().w(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i) {
        if (this.c) {
            if (((Boolean) pla.c().a(mpa.P4)).booleanValue()) {
                e(i);
            } else {
                f(i);
            }
        }
    }

    public ina(ona onaVar) {
        this.b = n3.N();
        this.a = onaVar;
        this.c = ((Boolean) pla.c().a(mpa.O4)).booleanValue();
    }
}
