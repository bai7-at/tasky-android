package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.d3b;
import defpackage.h3b;
import defpackage.pmb;

@KeepForSdk
/* loaded from: classes2.dex */
public class LiteSdkInfo extends pmb {
    public LiteSdkInfo(Context context) {
    }

    @Override // defpackage.tnb
    public h3b getAdapterCreator() {
        return new d3b();
    }

    @Override // defpackage.tnb
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 240304000, "23.0.0");
    }
}
