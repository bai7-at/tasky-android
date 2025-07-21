package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzfsk;

/* loaded from: classes3.dex */
public abstract class fbe {
    public static zzfsk a(Context context, int i, int i2, String str, String str2, String str3, tae taeVar) {
        return new ebe(context, 1, i2, str, str2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, taeVar).b(50000);
    }
}
