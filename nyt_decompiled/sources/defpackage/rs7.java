package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class rs7 extends ks7 implements vb8 {
    private final String n;

    class a extends zb8 {
        a() {
        }

        @Override // defpackage.xc1
        public void s() {
            rs7.this.r(this);
        }
    }

    protected rs7(String str) {
        super(new yb8[2], new zb8[2]);
        this.n = str;
        u(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ks7
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException j(yb8 yb8Var, zb8 zb8Var, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ur.e(yb8Var.c);
            zb8Var.t(yb8Var.e, z(byteBuffer.array(), byteBuffer.limit(), z), yb8Var.i);
            zb8Var.g(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // defpackage.vb8
    public void a(long j) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ks7
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final yb8 g() {
        return new yb8();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ks7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final zb8 h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ks7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    protected abstract ub8 z(byte[] bArr, int i, boolean z);
}
