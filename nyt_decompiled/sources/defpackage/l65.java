package defpackage;

import defpackage.jp5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes5.dex */
public class l65 extends su3 {
    private final Long v(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.su3, defpackage.we2
    public void c(jp5 jp5Var, jp5 jp5Var2) {
        zq3.h(jp5Var, "source");
        zq3.h(jp5Var2, "target");
        try {
            Files.move(jp5Var.p(), jp5Var2.p(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.su3, defpackage.we2
    public ne2 m(jp5 jp5Var) {
        zq3.h(jp5Var, "path");
        return u(jp5Var.p());
    }

    @Override // defpackage.su3
    public String toString() {
        return "NioSystemFileSystem";
    }

    protected final ne2 u(Path path) {
        zq3.h(path, "nioPath");
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            jp5 f = readSymbolicLink != null ? jp5.a.f(jp5.b, readSymbolicLink, false, 1, null) : null;
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long v = creationTime != null ? v(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long v2 = lastModifiedTime != null ? v(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new ne2(isRegularFile, isDirectory, f, valueOf, v, v2, lastAccessTime != null ? v(lastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
