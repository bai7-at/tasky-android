package defpackage;

import java.io.File;
import kotlin.io.FileWalkDirection;

/* loaded from: classes5.dex */
abstract class of2 extends nf2 {
    public static final ff2 k(File file, FileWalkDirection fileWalkDirection) {
        zq3.h(file, "<this>");
        zq3.h(fileWalkDirection, "direction");
        return new ff2(file, fileWalkDirection);
    }

    public static final ff2 l(File file) {
        zq3.h(file, "<this>");
        return k(file, FileWalkDirection.BOTTOM_UP);
    }
}
