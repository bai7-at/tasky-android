package defpackage;

import com.comscore.streaming.AdvertisementDeliveryType;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.c3;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.v2;
import com.google.android.gms.internal.ads.zzbze;

/* loaded from: classes3.dex */
public final class ltc implements cac, r8c, c7c, t7c, jq9, edc {
    private final ina a;
    private boolean b = false;

    public ltc(ina inaVar, kyd kydVar) {
        this.a = inaVar;
        inaVar.c(2);
        if (kydVar != null) {
            inaVar.c(AdvertisementDeliveryType.NATIONAL);
        }
    }

    @Override // defpackage.cac
    public final void F(zzbze zzbzeVar) {
    }

    @Override // defpackage.edc
    public final void K(final v2 v2Var) {
        this.a.b(new hna() { // from class: jtc
            @Override // defpackage.hna
            public final void a(m3 m3Var) {
                m3Var.s(v2.this);
            }
        });
        this.a.c(1104);
    }

    @Override // defpackage.edc
    public final void c0(boolean z) {
        this.a.c(true != z ? 1108 : 1107);
    }

    @Override // defpackage.c7c
    public final void n(zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.a.c(101);
                break;
            case 2:
                this.a.c(102);
                break;
            case 3:
                this.a.c(5);
                break;
            case 4:
                this.a.c(103);
                break;
            case 5:
                this.a.c(104);
                break;
            case 6:
                this.a.c(105);
                break;
            case 7:
                this.a.c(106);
                break;
            default:
                this.a.c(4);
                break;
        }
    }

    @Override // defpackage.edc
    public final void s0(final v2 v2Var) {
        this.a.b(new hna() { // from class: itc
            @Override // defpackage.hna
            public final void a(m3 m3Var) {
                m3Var.s(v2.this);
            }
        });
        this.a.c(AdvertisementDeliveryType.LOCAL);
    }

    @Override // defpackage.edc
    public final void t(boolean z) {
        this.a.c(true != z ? 1106 : 1105);
    }

    @Override // defpackage.edc
    public final void u0(final v2 v2Var) {
        this.a.b(new hna() { // from class: ktc
            @Override // defpackage.hna
            public final void a(m3 m3Var) {
                m3Var.s(v2.this);
            }
        });
        this.a.c(AdvertisementDeliveryType.SYNDICATION);
    }

    @Override // defpackage.jq9
    public final synchronized void v() {
        if (this.b) {
            this.a.c(8);
        } else {
            this.a.c(7);
            this.b = true;
        }
    }

    @Override // defpackage.cac
    public final void y0(final g1e g1eVar) {
        this.a.b(new hna() { // from class: htc
            @Override // defpackage.hna
            public final void a(m3 m3Var) {
                l2 l2Var = (l2) m3Var.n().l();
                c3 c3Var = (c3) m3Var.n().N().l();
                c3Var.n(g1e.this.b.b.b);
                l2Var.o(c3Var);
                m3Var.r(l2Var);
            }
        });
    }

    @Override // defpackage.edc
    public final void zzh() {
        this.a.c(1109);
    }

    @Override // defpackage.t7c
    public final synchronized void zzq() {
        this.a.c(6);
    }

    @Override // defpackage.r8c
    public final void zzr() {
        this.a.c(3);
    }
}
