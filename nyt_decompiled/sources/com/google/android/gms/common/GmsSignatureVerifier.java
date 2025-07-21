package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class GmsSignatureVerifier {
    private static final c zza;
    private static final c zzb;
    private static final HashMap zzc;

    static {
        s sVar = new s();
        sVar.d("com.google.android.gms");
        sVar.a(204200000L);
        l lVar = n.d;
        sVar.c(zzag.u(lVar.Q1(), n.b.Q1()));
        l lVar2 = n.c;
        sVar.b(zzag.u(lVar2.Q1(), n.a.Q1()));
        zza = sVar.e();
        s sVar2 = new s();
        sVar2.d("com.android.vending");
        sVar2.a(82240000L);
        sVar2.c(zzag.t(lVar.Q1()));
        sVar2.b(zzag.t(lVar2.Q1()));
        zzb = sVar2.e();
        zzc = new HashMap();
    }
}
