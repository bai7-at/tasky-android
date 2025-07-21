package org.jsoup.select;

import org.jsoup.nodes.i;

/* loaded from: classes5.dex */
public interface NodeFilter {

    public enum FilterResult {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    FilterResult a(i iVar, int i);

    FilterResult b(i iVar, int i);
}
