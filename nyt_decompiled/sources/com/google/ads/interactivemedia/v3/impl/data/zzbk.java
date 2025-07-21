package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbk {
    public abstract zzbn build();

    public zzbk friendlyObstructions(Collection<FriendlyObstruction> collection) {
        ArrayList arrayList = new ArrayList();
        for (FriendlyObstruction friendlyObstruction : collection) {
            zzbl view = zzbm.builder().view(friendlyObstruction.getView());
            view.purpose(friendlyObstruction.getPurpose());
            view.detailedReason(friendlyObstruction.getDetailedReason());
            arrayList.add(view.build());
        }
        return obstructions(arrayList);
    }

    public abstract zzbk obstructions(List<zzbm> list);
}
