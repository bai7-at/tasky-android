package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import defpackage.me5;
import defpackage.og8;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class zzfb extends ImageView implements View.OnClickListener {
    private final CompanionData zza;
    private final zzfm zzb;
    private final String zzc;
    private final List zzd;
    private final zzhy zze;

    public zzfb(Context context, zzfm zzfmVar, CompanionData companionData, og8 og8Var, String str, List list, zzhy zzhyVar) {
        super(context);
        this.zzb = zzfmVar;
        this.zza = companionData;
        this.zzc = str;
        this.zzd = list;
        this.zze = zzhyVar;
        setOnClickListener(this);
        og8Var.b(new me5() { // from class: com.google.ads.interactivemedia.v3.internal.zzfa
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var2) {
                zzfb zzfbVar = zzfb.this;
                if (og8Var2.q()) {
                    zzfbVar.setImageBitmap((Bitmap) og8Var2.m());
                } else {
                    zzhd.zzb("Image companion error", og8Var2.l());
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        Iterator it2 = this.zzd.iterator();
        while (it2.hasNext()) {
            ((CompanionAdSlot.ClickListener) it2.next()).onCompanionAdClick();
        }
        this.zze.zza(this.zza.clickThroughUrl());
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        zzfm zzfmVar = this.zzb;
        String companionId = this.zza.companionId();
        String str = this.zzc;
        if (zzro.zzc(companionId) || zzro.zzc(str)) {
            return;
        }
        HashMap zzb = zztd.zzb(1);
        zzb.put("companionId", companionId);
        zzfmVar.zzp(new zzff(zzfd.displayContainer, zzfe.companionView, str, zzb));
    }
}
