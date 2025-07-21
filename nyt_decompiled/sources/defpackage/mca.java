package defpackage;

import java.io.Closeable;

/* loaded from: classes3.dex */
public final class mca extends c3f implements Closeable {
    private static final j3f i = j3f.b(mca.class);

    public mca(d3f d3fVar, lca lcaVar) {
        j(d3fVar, d3fVar.zzc(), lcaVar);
    }

    @Override // defpackage.c3f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.c3f
    public final String toString() {
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
