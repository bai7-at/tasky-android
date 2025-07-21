package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.no7;
import defpackage.o23;
import defpackage.qt6;
import defpackage.ss2;
import defpackage.yw6;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class b {
    public static final Modifier a(Modifier modifier, ss2 ss2Var) {
        return modifier.h(new BlockGraphicsLayerElement(ss2Var));
    }

    public static final Modifier b(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, no7 no7Var, boolean z, yw6 yw6Var, long j2, long j3, int i) {
        return modifier.h(new GraphicsLayerElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, no7Var, z, yw6Var, j2, j3, i, null));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, no7 no7Var, boolean z, yw6 yw6Var, long j2, long j3, int i, int i2, Object obj) {
        return b(modifier, (i2 & 1) != 0 ? 1.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) == 0 ? f3 : 1.0f, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5, (i2 & 32) != 0 ? 0.0f : f6, (i2 & 64) != 0 ? 0.0f : f7, (i2 & 128) != 0 ? 0.0f : f8, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0 ? f9 : 0.0f, (i2 & 512) != 0 ? 8.0f : f10, (i2 & 1024) != 0 ? e.b.a() : j, (i2 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? qt6.a() : no7Var, (i2 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : z, (i2 & 8192) != 0 ? null : yw6Var, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? o23.a() : j2, (i2 & 32768) != 0 ? o23.a() : j3, (i2 & 65536) != 0 ? a.a.a() : i);
    }

    public static final /* synthetic */ Modifier d(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, no7 no7Var, boolean z, yw6 yw6Var, long j2, long j3) {
        return b(modifier, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, no7Var, z, yw6Var, j2, j3, a.a.a());
    }

    public static final Modifier f(Modifier modifier) {
        return InspectableValueKt.c() ? modifier.h(c(Modifier.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : modifier;
    }
}
