package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i42 extends ls7 {
    @Override // defpackage.ls7
    protected Metadata b(ts4 ts4Var, ByteBuffer byteBuffer) {
        return new Metadata(c(new yo5(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage c(yo5 yo5Var) {
        return new EventMessage((String) ur.e(yo5Var.B()), (String) ur.e(yo5Var.B()), yo5Var.A(), yo5Var.A(), Arrays.copyOfRange(yo5Var.e(), yo5Var.f(), yo5Var.g()));
    }
}
