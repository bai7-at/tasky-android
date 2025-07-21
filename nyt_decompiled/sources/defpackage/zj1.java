package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.t0;
import java.util.Locale;

/* loaded from: classes2.dex */
public class zj1 implements xp8 {
    private final Resources a;

    public zj1(Resources resources) {
        this.a = (Resources) ur.e(resources);
    }

    private String b(t0 t0Var) {
        int i = t0Var.M;
        return (i == -1 || i < 1) ? "" : i != 1 ? i != 2 ? (i == 6 || i == 7) ? this.a.getString(qm6.exo_track_surround_5_point_1) : i != 8 ? this.a.getString(qm6.exo_track_surround) : this.a.getString(qm6.exo_track_surround_7_point_1) : this.a.getString(qm6.exo_track_stereo) : this.a.getString(qm6.exo_track_mono);
    }

    private String c(t0 t0Var) {
        int i = t0Var.h;
        return i == -1 ? "" : this.a.getString(qm6.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    private String d(t0 t0Var) {
        return TextUtils.isEmpty(t0Var.b) ? "" : t0Var.b;
    }

    private String e(t0 t0Var) {
        String j = j(f(t0Var), h(t0Var));
        return TextUtils.isEmpty(j) ? d(t0Var) : j;
    }

    private String f(t0 t0Var) {
        String str = t0Var.c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale forLanguageTag = z19.a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale S = z19.S();
        String displayName = forLanguageTag.getDisplayName(S);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(S) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(t0 t0Var) {
        int i = t0Var.t;
        int i2 = t0Var.u;
        return (i == -1 || i2 == -1) ? "" : this.a.getString(qm6.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String h(t0 t0Var) {
        String string = (t0Var.e & 2) != 0 ? this.a.getString(qm6.exo_track_role_alternate) : "";
        if ((t0Var.e & 4) != 0) {
            string = j(string, this.a.getString(qm6.exo_track_role_supplementary));
        }
        if ((t0Var.e & 8) != 0) {
            string = j(string, this.a.getString(qm6.exo_track_role_commentary));
        }
        return (t0Var.e & 1088) != 0 ? j(string, this.a.getString(qm6.exo_track_role_closed_captions)) : string;
    }

    private static int i(t0 t0Var) {
        int k = ku4.k(t0Var.l);
        if (k != -1) {
            return k;
        }
        if (ku4.n(t0Var.i) != null) {
            return 2;
        }
        if (ku4.c(t0Var.i) != null) {
            return 1;
        }
        if (t0Var.t == -1 && t0Var.u == -1) {
            return (t0Var.M == -1 && t0Var.N == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.a.getString(qm6.exo_item_list, str, str2);
            }
        }
        return str;
    }

    @Override // defpackage.xp8
    public String a(t0 t0Var) {
        int i = i(t0Var);
        String j = i == 2 ? j(h(t0Var), g(t0Var), c(t0Var)) : i == 1 ? j(e(t0Var), b(t0Var), c(t0Var)) : e(t0Var);
        return j.length() == 0 ? this.a.getString(qm6.exo_track_unknown) : j;
    }
}
