package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import kotlin.collections.i;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class y19 {
    public static final y19 a = new y19();

    private y19() {
    }

    private final void b(String[] strArr, Stack stack) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            if (!zq3.c("/", str)) {
                if (zq3.c("..", str)) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (!zq3.c(InstructionFileId.DOT, str) && str.length() != 0) {
                    stack.push(str);
                }
            }
        }
    }

    private final boolean c(String str) {
        return str == null || str.length() == 0;
    }

    public final void a(File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(zq3.q("Unable to create parent directories of ", file));
        }
    }

    public final String d(String str) {
        List l;
        zq3.h(str, "path");
        if (c(str)) {
            return "";
        }
        List g = new Regex("[/]+").g(str, 0);
        if (!g.isEmpty()) {
            ListIterator listIterator = g.listIterator(g.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    l = i.P0(g, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        l = i.l();
        Object[] array = l.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Stack stack = new Stack();
        b((String[]) array, stack);
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = stack.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            sb.append("/");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }
}
