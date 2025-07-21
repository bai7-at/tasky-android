package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzda extends zzdb {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzda(zzct zzctVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzctVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
