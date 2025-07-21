package com.google.android.exoplayer2.upstream.cache;

import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.lg0;
import defpackage.ur;
import defpackage.z19;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class i extends lg0 {
    private static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private i(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static i e(File file, long j, long j2, f fVar) {
        File file2;
        String k;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File k2 = k(file, fVar);
            if (k2 == null) {
                return null;
            }
            file2 = k2;
            name = k2.getName();
        }
        Matcher matcher = i.matcher(name);
        if (!matcher.matches() || (k = fVar.k(Integer.parseInt((String) ur.e(matcher.group(1))))) == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        return new i(k, Long.parseLong((String) ur.e(matcher.group(2))), length, j2 == -9223372036854775807L ? Long.parseLong((String) ur.e(matcher.group(3))) : j2, file2);
    }

    public static i f(File file, long j, f fVar) {
        return e(file, j, -9223372036854775807L, fVar);
    }

    public static i g(String str, long j, long j2) {
        return new i(str, j, j2, -9223372036854775807L, null);
    }

    public static i i(String str, long j) {
        return new i(str, j, -1L, -9223372036854775807L, null);
    }

    public static File j(File file, int i2, long j, long j2) {
        return new File(file, i2 + InstructionFileId.DOT + j + InstructionFileId.DOT + j2 + ".v3.exo");
    }

    private static File k(File file, f fVar) {
        String str;
        String name = file.getName();
        Matcher matcher = h.matcher(name);
        if (matcher.matches()) {
            str = z19.g1((String) ur.e(matcher.group(1)));
        } else {
            matcher = g.matcher(name);
            str = matcher.matches() ? (String) ur.e(matcher.group(1)) : null;
        }
        if (str == null) {
            return null;
        }
        File j = j((File) ur.i(file.getParentFile()), fVar.f(str), Long.parseLong((String) ur.e(matcher.group(2))), Long.parseLong((String) ur.e(matcher.group(3))));
        if (file.renameTo(j)) {
            return j;
        }
        return null;
    }

    public i d(File file, long j) {
        ur.g(this.d);
        return new i(this.a, this.b, this.c, j, file);
    }
}
