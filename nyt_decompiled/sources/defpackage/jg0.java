package defpackage;

import com.google.android.exoplayer2.upstream.b;

/* loaded from: classes2.dex */
public interface jg0 {
    public static final jg0 a = new jg0() { // from class: ig0
        @Override // defpackage.jg0
        public final String a(b bVar) {
            String b;
            b = jg0.b(bVar);
            return b;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String b(b bVar) {
        String str = bVar.i;
        return str != null ? str : bVar.a.toString();
    }

    String a(b bVar);
}
