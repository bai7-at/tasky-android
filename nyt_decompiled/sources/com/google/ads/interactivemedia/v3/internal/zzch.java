package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzch implements zzcf {
    private final zzcf zza;

    public zzch(zzcf zzcfVar) {
        this.zza = zzcfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcf
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcf
    public final void zzb(View view, JSONObject jSONObject, zzce zzceVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzbx zza = zzbx.zza();
        if (zza != null) {
            Collection zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it2 = zzb.iterator();
            while (it2.hasNext()) {
                View zzg = ((com.google.ads.interactivemedia.omid.library.adsession.zze) it2.next()).zzg();
                if (zzg != null && zzg.isAttachedToWindow() && zzg.isShown()) {
                    View view2 = zzg;
                    while (true) {
                        if (view2 == null) {
                            View rootView = zzg.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza2 = zzcq.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (zzcq.zza((View) arrayList.get(i)) <= zza2) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzceVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
