package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.google.android.gms.internal.ads.zzae;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class kv9 {
    private static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] c = {64, ContentType.LONG_FORM_ON_DEMAND, 128, 192, 224, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, ProgressEvent.PART_COMPLETED_EVENT_CODE, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, ProgressEvent.PART_FAILED_EVENT_CODE, 6144, 7680};
    public static final /* synthetic */ int d = 0;

    public static l6a a(byte[] bArr, String str, String str2, zzae zzaeVar) {
        g8e g8eVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            g8eVar = new g8e(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b3 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b3;
                }
            }
            int length = copyOf.length;
            g8eVar = new g8e(copyOf, length);
            if (copyOf[0] == 31) {
                g8e g8eVar2 = new g8e(copyOf, length);
                while (g8eVar2.a() >= 16) {
                    g8eVar2.m(2);
                    g8eVar.f(g8eVar2.d(14), 14);
                }
            }
            g8eVar.j(copyOf, copyOf.length);
        }
        g8eVar.m(60);
        int i3 = a[g8eVar.d(6)];
        int i4 = b[g8eVar.d(4)];
        int d2 = g8eVar.d(5);
        int i5 = d2 < 29 ? (c[d2] * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) / 2 : -1;
        g8eVar.m(10);
        int i6 = i3 + (g8eVar.d(2) > 0 ? 1 : 0);
        x3a x3aVar = new x3a();
        x3aVar.k(str);
        x3aVar.w("audio/vnd.dts");
        x3aVar.j0(i5);
        x3aVar.k0(i6);
        x3aVar.x(i4);
        x3aVar.e(null);
        x3aVar.n(str2);
        return x3aVar.D();
    }
}
