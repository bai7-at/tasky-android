package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class je2 implements qw3 {
    private final boolean a;

    public je2(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qw3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(File file, uk5 uk5Var) {
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
