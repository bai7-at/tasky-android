package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.comscore.streaming.ContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class tk2 implements Comparable {
    public static final a a = new a(null);
    private static final short b = b(5120);
    private static final short c = b(-1025);
    private static final short d = b(31743);
    private static final short e = b(1024);
    private static final short f = b(1);
    private static final short g = b(32256);
    private static final short h = b(-1024);
    private static final short i = b(Short.MIN_VALUE);
    private static final short j = b(31744);
    private static final short k = b(0);
    private static final short l = a(1.0f);
    private static final short m = a(-1.0f);
    private static final float n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short b(float f) {
            int i;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i2 = floatToRawIntBits >>> 31;
            int i3 = (floatToRawIntBits >>> 23) & 255;
            int i4 = 8388607 & floatToRawIntBits;
            int i5 = 31;
            int i6 = 0;
            if (i3 != 255) {
                int i7 = i3 - 112;
                if (i7 >= 31) {
                    i5 = 49;
                } else if (i7 > 0) {
                    i6 = i4 >> 13;
                    if ((floatToRawIntBits & ProgressEvent.PART_FAILED_EVENT_CODE) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                        return (short) i;
                    }
                    i5 = i7;
                } else if (i7 >= -10) {
                    int i8 = (8388608 | i4) >> (1 - i7);
                    if ((i8 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0) {
                        i8 += 8192;
                    }
                    i5 = 0;
                    i6 = i8 >> 13;
                } else {
                    i5 = 0;
                }
            } else if (i4 != 0) {
                i6 = 512;
            }
            i = (i2 << 15) | (i5 << 10) | i6;
            return (short) i;
        }

        private a() {
        }
    }

    static {
        wk2 wk2Var = wk2.a;
        n = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f2) {
        return b(a.b(f2));
    }

    public static short b(short s) {
        return s;
    }

    public static final float c(short s) {
        int i2;
        int i3;
        int i4;
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + ContentType.LONG_FORM_ON_DEMAND;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                wk2 wk2Var = wk2.a;
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - n;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        int i10 = (i4 << 23) | (i5 << 16) | i3;
        wk2 wk2Var2 = wk2.a;
        return Float.intBitsToFloat(i10);
    }
}
