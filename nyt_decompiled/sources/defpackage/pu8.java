package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.WindowState;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivityKt;
import defpackage.fn2;
import defpackage.um2;
import java.io.IOException;

/* loaded from: classes.dex */
public class pu8 extends qu8 {
    private Font d(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS : WindowState.NORMAL, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int e = e(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int e2 = e(fontStyle, font2.getStyle());
            if (e2 < e) {
                font = font2;
                e = e2;
            }
        }
        return font;
    }

    private static int e(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.qu8
    public Typeface a(Context context, um2.c cVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (um2.d dVar : cVar.a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.a()).setWeight(dVar.d()).setSlant(dVar.e() ? 1 : 0).setTtcIndex(dVar.b()).setFontVariationSettings(dVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(d(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.qu8
    public Typeface b(Context context, CancellationSignal cancellationSignal, fn2.b[] bVarArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                fn2.b bVar = bVarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), QueryKeys.EXTERNAL_REFERRER, cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(d(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.qu8
    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
