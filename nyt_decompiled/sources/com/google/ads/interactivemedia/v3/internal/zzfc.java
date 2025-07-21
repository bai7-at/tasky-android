package com.google.ads.interactivemedia.v3.internal;

import com.chartbeat.androidsdk.QueryKeys;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
final class zzfc implements zzwy {
    zzfc() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwy
    public final /* bridge */ /* synthetic */ zzwr zza(Object obj, Type type2, zzwx zzwxVar) {
        CompanionAdSlot companionAdSlot = (CompanionAdSlot) obj;
        return new zzww(companionAdSlot.getWidth() + QueryKeys.SCROLL_POSITION_TOP + companionAdSlot.getHeight());
    }
}
