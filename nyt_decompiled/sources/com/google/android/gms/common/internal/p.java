package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class p implements Handler.Callback {
    final /* synthetic */ q a;

    /* synthetic */ p(q qVar, zzq zzqVar) {
        this.a = qVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.a.a;
            synchronized (hashMap) {
                try {
                    zzo zzoVar = (zzo) message.obj;
                    hashMap2 = this.a.a;
                    o oVar = (o) hashMap2.get(zzoVar);
                    if (oVar != null && oVar.i()) {
                        if (oVar.j()) {
                            oVar.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.a.a;
                        hashMap3.remove(zzoVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        hashMap4 = this.a.a;
        synchronized (hashMap4) {
            try {
                zzo zzoVar2 = (zzo) message.obj;
                hashMap5 = this.a.a;
                o oVar2 = (o) hashMap5.get(zzoVar2);
                if (oVar2 != null && oVar2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(zzoVar2), new Exception());
                    ComponentName b = oVar2.b();
                    if (b == null) {
                        b = zzoVar2.zza();
                    }
                    if (b == null) {
                        String zzc = zzoVar2.zzc();
                        Preconditions.checkNotNull(zzc);
                        b = new ComponentName(zzc, DatasetUtils.UNKNOWN_IDENTITY_ID);
                    }
                    oVar2.onServiceDisconnected(b);
                }
            } finally {
            }
        }
        return true;
    }
}
