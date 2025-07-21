package defpackage;

import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class sw9 {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private final boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = khe.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final boolean b(zzby zzbyVar) {
        for (int i = 0; i < zzbyVar.a(); i++) {
            zzbx b = zzbyVar.b(i);
            if (b instanceof zzagk) {
                zzagk zzagkVar = (zzagk) b;
                if ("iTunSMPB".equals(zzagkVar.zzb) && c(zzagkVar.zzc)) {
                    return true;
                }
            } else if (b instanceof zzagt) {
                zzagt zzagtVar = (zzagt) b;
                if ("com.apple.iTunes".equals(zzagtVar.zza) && "iTunSMPB".equals(zzagtVar.zzb) && c(zzagtVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
