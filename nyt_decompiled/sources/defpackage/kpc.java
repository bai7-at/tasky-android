package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class kpc extends iua {
    private final Context a;
    private final rkc b;
    private ulc c;
    private jkc d;

    public kpc(Context context, rkc rkcVar, ulc ulcVar, jkc jkcVar) {
        this.a = context;
        this.b = rkcVar;
        this.c = ulcVar;
        this.d = jkcVar;
    }

    private final bta y6(String str) {
        return new jpc(this, "_videoMediaView");
    }

    @Override // defpackage.jua
    public final void C(String str) {
        jkc jkcVar = this.d;
        if (jkcVar != null) {
            jkcVar.l(str);
        }
    }

    @Override // defpackage.jua
    public final boolean F(ee3 ee3Var) {
        ulc ulcVar;
        Object Q1 = fc5.Q1(ee3Var);
        if (!(Q1 instanceof ViewGroup) || (ulcVar = this.c) == null || !ulcVar.f((ViewGroup) Q1)) {
            return false;
        }
        this.b.d0().L(y6("_videoMediaView"));
        return true;
    }

    @Override // defpackage.jua
    public final mta K(String str) {
        return (mta) this.b.U().get(str);
    }

    @Override // defpackage.jua
    public final String P5(String str) {
        return (String) this.b.V().get(str);
    }

    @Override // defpackage.jua
    public final boolean c0(ee3 ee3Var) {
        ulc ulcVar;
        Object Q1 = fc5.Q1(ee3Var);
        if (!(Q1 instanceof ViewGroup) || (ulcVar = this.c) == null || !ulcVar.g((ViewGroup) Q1)) {
            return false;
        }
        this.b.f0().L(y6("_videoMediaView"));
        return true;
    }

    @Override // defpackage.jua
    public final boolean g() {
        k8e h0 = this.b.h0();
        if (h0 == null) {
            fgb.g("Trying to start OMID session before creation.");
            return false;
        }
        dyf.a().d(h0);
        if (this.b.e0() == null) {
            return true;
        }
        this.b.e0().t("onSdkLoaded", new so());
        return true;
    }

    @Override // defpackage.jua
    public final znc zze() {
        return this.b.W();
    }

    @Override // defpackage.jua
    public final jta zzf() {
        try {
            return this.d.N().a();
        } catch (NullPointerException e) {
            dyf.q().w(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // defpackage.jua
    public final ee3 zzh() {
        return fc5.l3(this.a);
    }

    @Override // defpackage.jua
    public final String zzi() {
        return this.b.a();
    }

    @Override // defpackage.jua
    public final List zzk() {
        try {
            hs7 U = this.b.U();
            hs7 V = this.b.V();
            String[] strArr = new String[U.size() + V.size()];
            int i = 0;
            for (int i2 = 0; i2 < U.size(); i2++) {
                strArr[i] = (String) U.i(i2);
                i++;
            }
            for (int i3 = 0; i3 < V.size(); i3++) {
                strArr[i] = (String) V.i(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            dyf.q().w(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // defpackage.jua
    public final void zzl() {
        jkc jkcVar = this.d;
        if (jkcVar != null) {
            jkcVar.a();
        }
        this.d = null;
        this.c = null;
    }

    @Override // defpackage.jua
    public final void zzm() {
        try {
            String c = this.b.c();
            if (Objects.equals(c, "Google")) {
                fgb.g("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(c)) {
                fgb.g("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            jkc jkcVar = this.d;
            if (jkcVar != null) {
                jkcVar.Q(c, false);
            }
        } catch (NullPointerException e) {
            dyf.q().w(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // defpackage.jua
    public final void zzo() {
        jkc jkcVar = this.d;
        if (jkcVar != null) {
            jkcVar.o();
        }
    }

    @Override // defpackage.jua
    public final void zzp(ee3 ee3Var) {
        jkc jkcVar;
        Object Q1 = fc5.Q1(ee3Var);
        if (!(Q1 instanceof View) || this.b.h0() == null || (jkcVar = this.d) == null) {
            return;
        }
        jkcVar.p((View) Q1);
    }

    @Override // defpackage.jua
    public final boolean zzq() {
        jkc jkcVar = this.d;
        return (jkcVar == null || jkcVar.C()) && this.b.e0() != null && this.b.f0() == null;
    }
}
