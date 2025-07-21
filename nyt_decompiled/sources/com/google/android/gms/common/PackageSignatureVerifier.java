package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.RestrictedInheritance;

@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class PackageSignatureVerifier {

    @VisibleForTesting
    static volatile d zza;
    private static e zzb;

    private static e zza() {
        e eVar;
        synchronized (e.class) {
            try {
                if (zzb == null) {
                    zzb = new e();
                }
                eVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(Context context, String str) {
        PackageVerificationResult packageVerificationResult;
        String str2;
        PackageVerificationResult packageVerificationResult2;
        boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza();
        if (!n.f()) {
            throw new zzae();
        }
        String concat = String.valueOf(str).concat(true != honorsDebugCertificates ? "-0" : "-1");
        if (zza != null) {
            str2 = zza.a;
            if (str2.equals(concat)) {
                packageVerificationResult2 = zza.b;
                return packageVerificationResult2;
            }
        }
        zza();
        p c = n.c(str, honorsDebugCertificates, false, false);
        if (!c.a) {
            Preconditions.checkNotNull(c.b);
            return PackageVerificationResult.zza(str, c.b, c.c);
        }
        zza = new d(concat, PackageVerificationResult.zzd(str, c.d));
        packageVerificationResult = zza.b;
        return packageVerificationResult;
    }

    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context, String str) {
        try {
            PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzb();
            return queryPackageSignatureVerified;
        } catch (SecurityException e) {
            PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (!queryPackageSignatureVerified2.zzc()) {
                return queryPackageSignatureVerified2;
            }
            Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            return queryPackageSignatureVerified2;
        }
    }
}
