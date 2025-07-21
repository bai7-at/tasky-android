package org.jsoup.select;

import defpackage.o48;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.nodes.Element;

/* loaded from: classes5.dex */
public class Elements extends ArrayList<Element> {
    public Elements() {
    }

    @Override // java.util.ArrayList
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Elements clone() {
        Elements elements = new Elements(size());
        Iterator<Element> it2 = iterator();
        while (it2.hasNext()) {
            elements.add(it2.next().d0());
        }
        return elements;
    }

    public String c() {
        StringBuilder b = o48.b();
        Iterator<Element> it2 = iterator();
        while (it2.hasNext()) {
            Element next = it2.next();
            if (b.length() != 0) {
                b.append("\n");
            }
            b.append(next.x());
        }
        return o48.m(b);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return c();
    }

    public Elements(int i) {
        super(i);
    }

    public Elements(List list) {
        super(list);
    }
}
