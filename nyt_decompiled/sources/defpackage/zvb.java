package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.pal.h3;
import com.google.android.gms.internal.pal.t2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zvb extends dxb {
    private AdvertisingIdClient.Info D;

    protected zvb(Context context) {
        super(context, "");
    }

    public static zvb v(Context context) {
        dxb.t(context, true);
        return new zvb(context);
    }

    @Override // defpackage.dxb, defpackage.vub
    protected final h3 h(Context context, View view, Activity activity) {
        return null;
    }

    @Override // defpackage.dxb, defpackage.vub
    protected final h3 j(Context context, View view, Activity activity) {
        return null;
    }

    @Override // defpackage.dxb
    protected final List o(ksc kscVar, Context context, h3 h3Var, t2 t2Var) {
        ArrayList arrayList = new ArrayList();
        if (kscVar.k() == null) {
            return arrayList;
        }
        arrayList.add(new fdd(kscVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", h3Var, kscVar.a(), 24));
        return arrayList;
    }

    @Override // defpackage.dxb
    protected final void p(ksc kscVar, Context context, h3 h3Var, t2 t2Var) {
        if (!kscVar.m) {
            dxb.u(o(kscVar, context, h3Var, t2Var));
            return;
        }
        AdvertisingIdClient.Info info = this.D;
        if (info != null) {
            String id = info.getId();
            if (!TextUtils.isEmpty(id)) {
                h3Var.v0(wvc.d(id));
                h3Var.V(6);
                h3Var.u0(this.D.isLimitAdTrackingEnabled());
            }
            this.D = null;
        }
    }

    public final String w(String str, String str2) {
        byte[] e = mxa.e(str, str2, true);
        return e != null ? zsa.a(e, true) : Integer.toString(7);
    }

    public final void x(AdvertisingIdClient.Info info) {
        this.D = info;
    }
}
