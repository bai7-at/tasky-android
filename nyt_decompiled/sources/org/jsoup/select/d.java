package org.jsoup.select;

import defpackage.c85;
import org.jsoup.nodes.i;
import org.jsoup.select.NodeFilter;

/* loaded from: classes5.dex */
public abstract class d {
    public static NodeFilter.FilterResult a(NodeFilter nodeFilter, i iVar) {
        i iVar2 = iVar;
        int i = 0;
        while (iVar2 != null) {
            NodeFilter.FilterResult b = nodeFilter.b(iVar2, i);
            if (b == NodeFilter.FilterResult.STOP) {
                return b;
            }
            if (b != NodeFilter.FilterResult.CONTINUE || iVar2.i() <= 0) {
                while (iVar2.u() == null && i > 0) {
                    NodeFilter.FilterResult filterResult = NodeFilter.FilterResult.CONTINUE;
                    if ((b == filterResult || b == NodeFilter.FilterResult.SKIP_CHILDREN) && (b = nodeFilter.a(iVar2, i)) == NodeFilter.FilterResult.STOP) {
                        return b;
                    }
                    i E = iVar2.E();
                    i--;
                    if (b == NodeFilter.FilterResult.REMOVE) {
                        iVar2.H();
                    }
                    b = filterResult;
                    iVar2 = E;
                }
                if ((b == NodeFilter.FilterResult.CONTINUE || b == NodeFilter.FilterResult.SKIP_CHILDREN) && (b = nodeFilter.a(iVar2, i)) == NodeFilter.FilterResult.STOP) {
                    return b;
                }
                if (iVar2 == iVar) {
                    return b;
                }
                i u = iVar2.u();
                if (b == NodeFilter.FilterResult.REMOVE) {
                    iVar2.H();
                }
                iVar2 = u;
            } else {
                iVar2 = iVar2.h(0);
                i++;
            }
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    public static void b(c85 c85Var, i iVar) {
        i iVar2 = iVar;
        int i = 0;
        while (iVar2 != null) {
            c85Var.b(iVar2, i);
            if (iVar2.i() > 0) {
                iVar2 = iVar2.h(0);
                i++;
            } else {
                while (iVar2.u() == null && i > 0) {
                    c85Var.a(iVar2, i);
                    iVar2 = iVar2.E();
                    i--;
                }
                c85Var.a(iVar2, i);
                if (iVar2 == iVar) {
                    return;
                } else {
                    iVar2 = iVar2.u();
                }
            }
        }
    }
}
