package com.google.android.gms.internal.ads;

import com.comscore.streaming.ContentMediaFormat;
import defpackage.u1f;
import defpackage.yfe;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class zzhp extends zzgx {
    public final u1f zzb;
    public final int zzc;

    public zzhp(u1f u1fVar, int i, int i2) {
        super(b(2008, 1));
        this.zzb = u1fVar;
        this.zzc = 1;
    }

    public static zzhp a(IOException iOException, u1f u1fVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ContentMediaFormat.PARTIAL_CONTENT_GENERIC : (message == null || !yfe.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new zzho(iOException, u1fVar) : new zzhp(iOException, u1fVar, i2, i);
    }

    private static int b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzhp(IOException iOException, u1f u1fVar, int i, int i2) {
        super(iOException, b(i, i2));
        this.zzb = u1fVar;
        this.zzc = i2;
    }

    public zzhp(String str, u1f u1fVar, int i, int i2) {
        super(str, b(i, i2));
        this.zzb = u1fVar;
        this.zzc = i2;
    }

    public zzhp(String str, IOException iOException, u1f u1fVar, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.zzb = u1fVar;
        this.zzc = i2;
    }
}
