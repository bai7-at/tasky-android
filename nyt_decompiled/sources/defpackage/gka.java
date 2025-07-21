package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class gka {
    private final int a;
    private final dka b = new ika();

    public gka(int i) {
        this.a = i;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        fka fkaVar = new fka();
        PriorityQueue priorityQueue = new PriorityQueue(this.a, new eka(this));
        for (String str : split) {
            String[] b = hka.b(str, false);
            if (b.length != 0) {
                kka.c(b, this.a, 6, priorityQueue);
            }
        }
        Iterator it2 = priorityQueue.iterator();
        while (it2.hasNext()) {
            try {
                fkaVar.b.write(this.b.b(((jka) it2.next()).b));
            } catch (IOException e) {
                fgb.e("Error while writing hash to byteStream", e);
            }
        }
        return fkaVar.toString();
    }
}
