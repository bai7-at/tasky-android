package defpackage;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class pkb extends mkb {
    private static final Set f = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat g = new DecimalFormat("#,###");
    public static final /* synthetic */ int h = 0;
    private File d;
    private boolean e;

    public pkb(wib wibVar) {
        super(wibVar);
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            fgb.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.d = file;
        if (!file.isDirectory() && !this.d.mkdirs()) {
            fgb.g("Could not create preload cache directory at ".concat(String.valueOf(this.d.getAbsolutePath())));
            this.d = null;
        } else {
            if (this.d.setReadable(true, false) && this.d.setExecutable(true, false)) {
                return;
            }
            fgb.g("Could not set cache file permissions at ".concat(String.valueOf(this.d.getAbsolutePath())));
            this.d = null;
        }
    }

    private final File y(File file) {
        return new File(this.d, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // defpackage.mkb
    public final void l() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0347, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x034d, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0355, code lost:
    
        if (defpackage.fgb.j(3) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0357, code lost:
    
        defpackage.fgb.b("Preloaded " + defpackage.pkb.g.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x037a, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0383, code lost:
    
        if (r0.isFile() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0385, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x038d, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03de  */
    @Override // defpackage.mkb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkb.v(java.lang.String):boolean");
    }
}
