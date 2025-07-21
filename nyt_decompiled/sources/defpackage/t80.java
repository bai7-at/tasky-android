package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes2.dex */
public final class t80 extends cg3 {
    private final w80 b = new x80();

    @Override // defpackage.cg3
    protected cz6 d(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + QueryKeys.SCROLL_POSITION_TOP + decodeBitmap.getHeight() + "] for [" + i + QueryKeys.SCROLL_POSITION_TOP + i2 + "]");
        }
        return new y80(decodeBitmap, this.b);
    }
}
