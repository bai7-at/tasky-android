package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.comscore.streaming.WindowState;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public abstract class fu9 {
    private static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, 960, 800, 800, 480, WindowState.NORMAL, WindowState.NORMAL, ProgressEvent.PART_COMPLETED_EVENT_CODE};
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (r12 != 11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (r12 != 11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if (r12 != 8) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eu9 a(defpackage.g8e r12) {
        /*
            r0 = 16
            int r1 = r12.d(r0)
            int r0 = r12.d(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r12.d(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r12.d(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L38
            r1 = r2
        L2c:
            int r5 = r12.d(r0)
            int r1 = r1 + r5
            boolean r5 = r12.o()
            if (r5 != 0) goto L3a
            int r1 = r1 + r4
        L38:
            r5 = r1
            goto L3e
        L3a:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3e:
            r1 = 10
            int r1 = r12.d(r1)
            boolean r6 = r12.o()
            if (r6 == 0) goto L53
            int r6 = r12.d(r4)
            if (r6 <= 0) goto L53
            r12.m(r0)
        L53:
            boolean r6 = r12.o()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L62
            r11 = r9
            goto L63
        L62:
            r11 = r7
        L63:
            int r12 = r12.d(r3)
            if (r11 != r9) goto L73
            r6 = 13
            if (r12 != r6) goto L73
            int[] r12 = defpackage.fu9.a
            r12 = r12[r6]
            r9 = r12
            goto La0
        L73:
            if (r11 != r7) goto L94
            r6 = 14
            if (r12 >= r6) goto L94
            int[] r2 = defpackage.fu9.a
            r2 = r2[r12]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9b
            r7 = 11
            if (r1 == r0) goto L96
            if (r1 == r4) goto L9b
            if (r1 == r3) goto L8c
            goto L94
        L8c:
            if (r12 == r4) goto L92
            if (r12 == r6) goto L92
            if (r12 != r7) goto L94
        L92:
            int r2 = r2 + 1
        L94:
            r9 = r2
            goto La0
        L96:
            if (r12 == r6) goto L92
            if (r12 != r7) goto L94
            goto L92
        L9b:
            if (r12 == r4) goto L92
            if (r12 != r6) goto L94
            goto L92
        La0:
            eu9 r12 = new eu9
            r6 = 2
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu9.a(g8e):eu9");
    }

    public static void b(int i, b9e b9eVar) {
        b9eVar.h(7);
        byte[] m = b9eVar.m();
        m[0] = -84;
        m[1] = 64;
        m[2] = -1;
        m[3] = -1;
        m[4] = (byte) ((i >> 16) & 255);
        m[5] = (byte) ((i >> 8) & 255);
        m[6] = (byte) (i & 255);
    }
}
