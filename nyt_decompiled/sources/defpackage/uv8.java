package defpackage;

import com.google.zxing.BarcodeFormat;
import java.util.Map;

/* loaded from: classes3.dex */
public final class uv8 implements pl9 {
    private final cx1 a = new cx1();

    @Override // defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.a.a("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
