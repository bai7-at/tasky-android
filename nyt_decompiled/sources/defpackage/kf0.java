package defpackage;

import defpackage.t91;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class kf0 implements t91 {
    private final ByteBuffer a;

    public static class a implements t91.a {
        @Override // t91.a
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // t91.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t91 b(ByteBuffer byteBuffer) {
            return new kf0(byteBuffer);
        }
    }

    public kf0(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.t91
    public void b() {
    }

    @Override // defpackage.t91
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }
}
