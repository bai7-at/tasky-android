package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class qlc implements bta {
    final /* synthetic */ qmc a;
    final /* synthetic */ ViewGroup b;

    qlc(qmc qmcVar, ViewGroup viewGroup) {
        this.a = qmcVar;
        this.b = viewGroup;
    }

    @Override // defpackage.bta
    public final void a(MotionEvent motionEvent) {
        this.a.onTouch(null, motionEvent);
    }

    @Override // defpackage.bta
    public final JSONObject zza() {
        return this.a.zzo();
    }

    @Override // defpackage.bta
    public final JSONObject zzb() {
        return this.a.zzp();
    }

    @Override // defpackage.bta
    public final void zzc() {
        zzgaa zzgaaVar = nlc.r;
        Map zzm = this.a.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzgaaVar.size();
        int i = 0;
        while (i < size) {
            Object obj = zzm.get((String) zzgaaVar.get(i));
            i++;
            if (obj != null) {
                this.a.onClick(this.b);
                return;
            }
        }
    }
}
