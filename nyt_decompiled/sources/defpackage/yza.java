package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzapi;
import java.util.Map;

/* loaded from: classes2.dex */
public final class yza {
    private static aba a;
    private static final Object b = new Object();
    public static final gva c = new qra();

    public yza(Context context) {
        aba a2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            try {
                if (a == null) {
                    mpa.a(context);
                    if (!ClientLibraryUtils.isPackageSide()) {
                        if (((Boolean) pla.c().a(mpa.r4)).booleanValue()) {
                            a2 = gja.b(context);
                            a = a2;
                        }
                    }
                    a2 = ica.a(context, null);
                    a = a2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final j64 a(String str) {
        ugb ugbVar = new ugb();
        a.a(new bza(str, null, ugbVar));
        return ugbVar;
    }

    public final j64 b(int i, String str, Map map, byte[] bArr) {
        kxa kxaVar = new kxa(null);
        wsa wsaVar = new wsa(this, str, kxaVar);
        egb egbVar = new egb(null);
        yta ytaVar = new yta(this, i, str, kxaVar, wsaVar, bArr, map, egbVar);
        if (egb.k()) {
            try {
                egbVar.d(str, "GET", ytaVar.l(), ytaVar.z());
            } catch (zzapi e) {
                fgb.g(e.getMessage());
            }
        }
        a.a(ytaVar);
        return kxaVar;
    }
}
