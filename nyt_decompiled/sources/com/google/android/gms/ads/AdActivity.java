package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.fc5;
import defpackage.fgb;
import defpackage.k7b;
import defpackage.kia;

@KeepForSdk
/* loaded from: classes2.dex */
public final class AdActivity extends Activity {
    private k7b a;

    private final void a() {
        k7b k7bVar = this.a;
        if (k7bVar != null) {
            try {
                k7bVar.e();
            } catch (RemoteException e) {
                fgb.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.E4(i, i2, intent);
            }
        } catch (Exception e) {
            fgb.i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                if (!k7bVar.m()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            k7b k7bVar2 = this.a;
            if (k7bVar2 != null) {
                k7bVar2.zzi();
            }
        } catch (RemoteException e2) {
            fgb.i("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.B(fc5.l3(configuration));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k7b k = kia.a().k(this);
        this.a = k;
        if (k == null) {
            fgb.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            k.p2(bundle);
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.zzm();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.zzo();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.H1(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.zzq();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.zzr();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.j0(bundle);
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.g();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.c();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            k7b k7bVar = this.a;
            if (k7bVar != null) {
                k7bVar.a();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
