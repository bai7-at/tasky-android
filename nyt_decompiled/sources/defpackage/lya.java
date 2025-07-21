package defpackage;

import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.internal.ads.zzcag;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lya implements uxa {
    private final kya a;

    public lya(kya kyaVar) {
        this.a = kyaVar;
    }

    public static void b(wlb wlbVar, kya kyaVar) {
        wlbVar.e0("/reward", new lya(kyaVar));
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.a.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.a.zzb();
                    return;
                }
                return;
            }
        }
        zzcag zzcagVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get(TransferTable.COLUMN_TYPE);
            if (!TextUtils.isEmpty(str2)) {
                zzcagVar = new zzcag(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            fgb.h("Unable to parse reward amount.", e);
        }
        this.a.j0(zzcagVar);
    }
}
