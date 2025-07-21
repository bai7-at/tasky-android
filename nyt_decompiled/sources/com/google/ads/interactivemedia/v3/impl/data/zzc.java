package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzc {
    public abstract zzd build();

    abstract zzc setDisableUi(boolean z);

    abstract zzc setEnableFocusSkipButton(boolean z);

    abstract zzc setEnablePreloading(boolean z);

    abstract zzc setLoadVideoTimeout(int i);

    abstract zzc setMimeTypes(List<String> list);

    abstract zzc setPlayAdsAfterTime(double d);

    abstract zzc setUiElements(Set<UiElement> set);
}
