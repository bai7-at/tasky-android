package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ex4 implements pl9 {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            a = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        pl9 dx1Var;
        switch (a.a[barcodeFormat.ordinal()]) {
            case 1:
                dx1Var = new dx1();
                break;
            case 2:
                dx1Var = new yv8();
                break;
            case 3:
                dx1Var = new cx1();
                break;
            case 4:
                dx1Var = new uv8();
                break;
            case 5:
                dx1Var = new eb6();
                break;
            case 6:
                dx1Var = new tm0();
                break;
            case 7:
                dx1Var = new vm0();
                break;
            case 8:
                dx1Var = new Code128Writer();
                break;
            case 9:
                dx1Var = new ge3();
                break;
            case 10:
                dx1Var = new om5();
                break;
            case 11:
                dx1Var = new rm0();
                break;
            case 12:
                dx1Var = new m91();
                break;
            case 13:
                dx1Var = new c30();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return dx1Var.a(str, barcodeFormat, i, i2, map);
    }
}
