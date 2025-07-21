package defpackage;

import android.view.MotionEvent;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class jpc implements bta {
    final /* synthetic */ String a = "_videoMediaView";
    final /* synthetic */ kpc b;

    jpc(kpc kpcVar, String str) {
        this.b = kpcVar;
    }

    @Override // defpackage.bta
    public final void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.bta
    public final JSONObject zza() {
        return null;
    }

    @Override // defpackage.bta
    public final JSONObject zzb() {
        return null;
    }

    @Override // defpackage.bta
    public final void zzc() {
        jkc jkcVar;
        jkc jkcVar2;
        kpc kpcVar = this.b;
        jkcVar = kpcVar.d;
        if (jkcVar != null) {
            String str = this.a;
            jkcVar2 = kpcVar.d;
            jkcVar2.l(str);
        }
    }
}
