package defpackage;

import android.os.RemoteException;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class n4b implements hp4, kp4, mp4 {
    private final t3b a;
    private sw8 b;
    private kua c;

    public n4b(t3b t3bVar) {
        this.a = t3bVar;
    }

    @Override // defpackage.mp4
    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.kp4
    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdFailedToLoad with error " + i + InstructionFileId.DOT);
        try {
            this.a.zzg(i);
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.hp4
    public final void c(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.mp4
    public final void d(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.hp4
    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdLoaded.");
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.mp4
    public final void f(MediationNativeAdapter mediationNativeAdapter, c6 c6Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6Var.a() + ". ErrorMessage: " + c6Var.c() + ". ErrorDomain: " + c6Var.b());
        try {
            this.a.R0(c6Var.d());
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.hp4
    public final void g(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.mp4
    public final void h(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        sw8 sw8Var = this.b;
        if (this.c == null) {
            if (sw8Var == null) {
                fgb.i("#007 Could not call remote method.", null);
                return;
            } else if (!sw8Var.m()) {
                fgb.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        fgb.b("Adapter called onAdImpression.");
        try {
            this.a.zzm();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.hp4
    public final void i(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.kp4
    public final void j(MediationInterstitialAdapter mediationInterstitialAdapter, c6 c6Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6Var.a() + ". ErrorMessage: " + c6Var.c() + ". ErrorDomain: " + c6Var.b());
        try {
            this.a.R0(c6Var.d());
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.hp4
    public final void k(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAppEvent.");
        try {
            this.a.B5(str, str2);
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.mp4
    public final void l(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        sw8 sw8Var = this.b;
        if (this.c == null) {
            if (sw8Var == null) {
                fgb.i("#007 Could not call remote method.", null);
                return;
            } else if (!sw8Var.l()) {
                fgb.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        fgb.b("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.mp4
    public final void m(MediationNativeAdapter mediationNativeAdapter, sw8 sw8Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdLoaded.");
        this.b = sw8Var;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            a79 a79Var = new a79();
            a79Var.c(new d4b());
            if (sw8Var != null && sw8Var.r()) {
                sw8Var.K(a79Var);
            }
        }
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.mp4
    public final void n(MediationNativeAdapter mediationNativeAdapter, kua kuaVar, String str) {
        try {
            this.a.K5(kuaVar.a(), str);
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.kp4
    public final void o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdLoaded.");
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.kp4
    public final void p(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.hp4
    public final void q(MediationBannerAdapter mediationBannerAdapter, c6 c6Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6Var.a() + ". ErrorMessage: " + c6Var.c() + ". ErrorDomain: " + c6Var.b());
        try {
            this.a.R0(c6Var.d());
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.mp4
    public final void r(MediationNativeAdapter mediationNativeAdapter, kua kuaVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(kuaVar.b())));
        this.c = kuaVar;
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.kp4
    public final void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        fgb.b("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final sw8 t() {
        return this.b;
    }

    public final kua u() {
        return this.c;
    }
}
