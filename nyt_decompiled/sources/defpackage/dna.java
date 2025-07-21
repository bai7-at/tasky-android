package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes3.dex */
final class dna implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ ugb a;
    final /* synthetic */ ena b;

    dna(ena enaVar, ugb ugbVar) {
        this.a = ugbVar;
        this.b = enaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.b.d;
        synchronized (obj) {
            this.a.d(new RuntimeException("Connection failed."));
        }
    }
}
