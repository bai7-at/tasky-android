package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbyk;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ela {
    private final Context a;
    private boolean b;
    private final kdb c;
    private final zzbyk d = new zzbyk(false, Collections.emptyList());

    public ela(Context context, kdb kdbVar, zzbyk zzbykVar) {
        this.a = context;
        this.c = kdbVar;
    }

    private final boolean d() {
        kdb kdbVar = this.c;
        return (kdbVar != null && kdbVar.zza().zzf) || this.d.zza;
    }

    public final void a() {
        this.b = true;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            kdb kdbVar = this.c;
            if (kdbVar != null) {
                kdbVar.a(str, null, 3);
                return;
            }
            zzbyk zzbykVar = this.d;
            if (!zzbykVar.zza || (list = zzbykVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.a;
                    dyf.r();
                    wxf.k(context, "", replace);
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.b;
    }
}
