package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.j6f;

/* loaded from: classes2.dex */
final class l extends j6f {
    final /* synthetic */ BaseGmsClient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.b = baseGmsClient;
    }

    private static final void a(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z;
        if (this.b.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.b.enableLocalFallback()) || message.what == 5)) && !this.b.isConnecting()) {
            a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.b.zzB = new ConnectionResult(message.arg2);
            if (BaseGmsClient.zzo(this.b)) {
                BaseGmsClient baseGmsClient = this.b;
                z = baseGmsClient.zzC;
                if (!z) {
                    baseGmsClient.zzp(3, null);
                    return;
                }
            }
            BaseGmsClient baseGmsClient2 = this.b;
            connectionResult2 = baseGmsClient2.zzB;
            ConnectionResult connectionResult3 = connectionResult2 != null ? baseGmsClient2.zzB : new ConnectionResult(8);
            this.b.zzc.onReportServiceBinding(connectionResult3);
            this.b.onConnectionFailed(connectionResult3);
            return;
        }
        if (i2 == 5) {
            BaseGmsClient baseGmsClient3 = this.b;
            connectionResult = baseGmsClient3.zzB;
            ConnectionResult connectionResult4 = connectionResult != null ? baseGmsClient3.zzB : new ConnectionResult(8);
            this.b.zzc.onReportServiceBinding(connectionResult4);
            this.b.onConnectionFailed(connectionResult4);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.b.zzc.onReportServiceBinding(connectionResult5);
            this.b.onConnectionFailed(connectionResult5);
            return;
        }
        if (i2 == 6) {
            this.b.zzp(5, null);
            BaseGmsClient baseGmsClient4 = this.b;
            baseConnectionCallbacks = baseGmsClient4.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = baseGmsClient4.zzw;
                baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
            }
            this.b.onConnectionSuspended(message.arg2);
            BaseGmsClient.zzn(this.b, 5, 1, null);
            return;
        }
        if (i2 == 2 && !this.b.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((zzc) message.obj).zze();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
