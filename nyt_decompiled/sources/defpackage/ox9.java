package defpackage;

import com.google.android.gms.internal.ads.zzbbz;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ox9 {
    private final String a;

    /* synthetic */ ox9(ju9 ju9Var, xv9 xv9Var) {
        String str;
        str = ju9Var.a;
        this.a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbbz a() {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbbz.AD_INITIATER_UNSPECIFIED : zzbbz.REWARD_BASED_VIDEO_AD : zzbbz.AD_LOADER : zzbbz.INTERSTITIAL : zzbbz.BANNER;
    }

    public final String b() {
        return this.a.toLowerCase(Locale.ROOT);
    }

    public final Set c() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
