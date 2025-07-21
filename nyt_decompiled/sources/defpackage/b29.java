package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes4.dex */
public class b29 {
    private boolean b(Stack stack) {
        return stack.isEmpty();
    }

    private void c(String[] strArr, Stack stack) {
        for (String str : strArr) {
            if (!"/".equals(str)) {
                if ("..".equals(str)) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (!InstructionFileId.DOT.equals(str) && !str.isEmpty()) {
                    stack.push(str);
                }
            }
        }
    }

    private boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public void a(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    public String e(String str) {
        if (d(str)) {
            return "";
        }
        String[] split = str.split("[/]+");
        Stack stack = new Stack();
        c(split, stack);
        if (b(stack)) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = stack.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            sb.append("/");
            sb.append(str2);
        }
        return sb.toString();
    }
}
