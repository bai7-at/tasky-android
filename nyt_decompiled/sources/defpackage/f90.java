package defpackage;

import android.graphics.BlendMode;
import androidx.core.graphics.BlendModeCompat;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;

/* loaded from: classes.dex */
abstract class f90 {
    static Object a(BlendModeCompat blendModeCompat) {
        switch (e90.a[blendModeCompat.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case 19:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case 24:
                return BlendMode.EXCLUSION;
            case EventType.SUBS /* 25 */:
                return BlendMode.MULTIPLY;
            case EventType.CDN /* 26 */:
                return BlendMode.HUE;
            case 27:
                return BlendMode.SATURATION;
            case 28:
                return BlendMode.COLOR;
            case BuildConfig.VERSION_CODE /* 29 */:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }
}
